package Views;

import Utils.RoundedButton_normal;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class PlantManagementTable extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;

    public PlantManagementTable() {
        setTitle("Plant Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Set layout to null for manual positioning

        // Column names
        String[] columnNames = {"Plant ID", "Plant Name", "Species Type", "Last Watered", "Last Fertilized", "Actions"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 5; // Only the Actions column is editable
            }
        };

        // Create table
        table = new JTable(tableModel);
        table.setRowHeight(35); // Set row height
        table.setShowGrid(false); // Remove grid lines
        table.setIntercellSpacing(new Dimension(0, 0)); // Remove spacing between cells
        table.setBackground(Color.WHITE); // Set table background color

        // Customize table header
        JTableHeader header = table.getTableHeader();
        header.setDefaultRenderer(new HeaderRenderer());

        // Set custom renderer and editor for the Actions column
        table.getColumn("Actions").setCellRenderer(new ButtonRenderer());
        table.getColumn("Actions").setCellEditor(new ButtonEditor());

        // Add sample data
        addRow(1, "Rose", "Flower", "2024-01-20", "2024-01-15");
        addRow(2, "Basil", "Herb", "2024-01-21", "2024-01-18");

        // Add table to scroll pane with a fixed height
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 20, 760, 200); // Manually set the position and size
        scrollPane.setBorder(BorderFactory.createEmptyBorder()); // Remove scroll pane border
        add(scrollPane);

        // Window settings
        setSize(800, 350);
        setLocationRelativeTo(null);
    }

    private void addRow(int id, String name, String species, String watered, String fertilized) {
        tableModel.addRow(new Object[]{id, name, species, watered, fertilized, "Delete"});
    }

    // Custom header renderer to set color and height
    private static class HeaderRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                       boolean hasFocus, int row, int column) {
            JLabel label = new JLabel(value.toString(), SwingConstants.CENTER);
            label.setFont(new Font("SansSerif", Font.BOLD, 16));
            label.setBackground(new Color(81, 173, 168, 255)); // Custom color
            label.setForeground(Color.WHITE);
            label.setOpaque(true);
            label.setPreferredSize(new Dimension(0, 40)); // Increase header height
            return label;
        }
    }

    // Renderer for Delete button
    private static class ButtonRenderer extends JPanel implements TableCellRenderer {
        private final RoundedButton_normal button;

        public ButtonRenderer() {
            setLayout(new FlowLayout(FlowLayout.CENTER)); // Center the button
            setBackground(Color.WHITE); // Add white background to the panel

            button = new RoundedButton_normal("Delete");
            button.setBackground(new Color(255, 69, 58)); // Red background
            button.setForeground(Color.WHITE);           // White text
            button.setFont(new Font("Arial", Font.BOLD, 12));
            button.setContentAreaFilled(true);  // Make sure the button background is filled

            // Add some padding around the button
            ((FlowLayout)getLayout()).setHgap(10);
            ((FlowLayout)getLayout()).setVgap(5);

            add(button);
            setOpaque(true); // Make sure the panel background is visible
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                       boolean hasFocus, int row, int column) {
            return this;
        }
    }

    // Editor for Delete button
    private class ButtonEditor extends DefaultCellEditor {
        private final JPanel panel;
        private final RoundedButton_normal button;
        private int row;

        public ButtonEditor() {
            super(new JCheckBox());
            panel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // Use FlowLayout for better centering
            panel.setBackground(Color.WHITE); // Add white background to the panel

            button = new RoundedButton_normal("Delete");
            button.setBackground(new Color(255, 69, 58)); // Red background
            button.setForeground(Color.WHITE);           // White text
            button.setFont(new Font("Arial", Font.BOLD, 12));
            button.setContentAreaFilled(true);  // Make sure the button background is filled

            // Add some padding around the button
            ((FlowLayout)panel.getLayout()).setHgap(10);
            ((FlowLayout)panel.getLayout()).setVgap(5);

            button.addActionListener(e -> {
                int id = (int) tableModel.getValueAt(row, 0); // Get the Plant ID
                deletePlant(id);
                tableModel.removeRow(row); // Remove the row from the table
            });

            panel.add(button);
            panel.setOpaque(true); // Make sure the panel background is visible
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            this.row = row;
            return panel;
        }

        private void deletePlant(int id) {
            // Add database deletion logic here
            System.out.println("Plant with ID " + id + " deleted from the database.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PlantManagementTable().setVisible(true));
    }
}