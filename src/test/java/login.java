import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class login extends Main{

    @Test(priority = 1)
    public void Viewall(){
        clicks(By.xpath("//android.widget.ImageView[@content-desc=\"Login\"]\n"));
    }
    @Test(priority =2)
    public void backbutton(){

    {
        clicks(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]"));
    }
    }
    @Test(priority = 3)
    public void login1() throws InterruptedException {
        System.out.println("Inside login");
        Thread.sleep(2000);
        clicks(By.xpath("//android.widget.ImageView[@content-desc='Login']"));
        System.out.println("clicked on login button");
    }
    @Test(priority = 2)
    public void username(){
        EnterText(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"),"mark@admin.com");
    }
    @Test(priority = 3)
    public void password(){
        EnterText(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"),"mark");
        clicks(By.xpath("//android.widget.ImageView\n"));
    }
    @Test(priority = 4)
    public void forgetpass() throws InterruptedException {
        clicks(By.xpath("//android.widget.Button[@content-desc=\"Forget Password\"]"));
        EnterText(By.xpath("//android.widget.EditText"),"test@gmail.com");
        clicks(By.xpath("//android.view.View[@content-desc=\"Submit\"]"));
        clicks(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]"));
    }
    @Test(priority = 5)
    public void createaccount(){
        clicks(By.xpath("//android.widget.Button[@content-desc=\"Create Account\"]"));
        EnterText(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"),"testusername");
        EnterText(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"),"testpassword");
        EnterText(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]"),"testpassword");
        clicks(By.xpath("//android.widget.ImageView\n"));
        clicks(By.xpath("//android.widget.Button[@content-desc=\"Login\"]"));
    }

}