package Test;

import Controllers.UserController;
 import Services.SubscriptionService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SubscriptionServiceTest {


    @Test
    public  void  save_new_Subsc(){
        try {
            SubscriptionService a=new SubscriptionService();
            a.Save_New_Subscription(2,1,"2024-02-15","2024-09-15","Active");
        } catch (Exception e) {
            fail("An exception occurred: " + e.getMessage());
        }
    }

}