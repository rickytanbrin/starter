package id.co.ricky.template.web;

import id.co.ricky.template.StarterApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Ricky (ricky.tirta@cimbniaga.co.id)
 * @created 1/20/2020 7:18 PM
 */

@WebMvcTest(controllers = UserController.class, secure = false)
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {StarterApplication.class})
public class UserControllerTest {

    @Before
    public void setUp(){
        // write using given or Mockito
    }

    @Test
    public void userControllerTest(){
        // Write Code
    }
}
