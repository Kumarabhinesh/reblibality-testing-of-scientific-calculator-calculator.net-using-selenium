package com.abhinesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AB {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.calculator.net");
        driver.manage().window().maximize();

        testSimpleAddition();
        testSimpleSubtraction();
        testSimpleMultiplication();
        testSimpleDivision();
        testSimplePercentage();
        testSimplelog();
        testSimpleSin();
        testSimpleCos();
        testSimplePower();
        testSimpleSquareroot();
        testSimpleFactorial();
        
        driver.quit(); 
    }

    public static void testSimpleAddition() throws InterruptedException  {
      
        // Find the first operand input field and enter the value
        WebElement firstOperand = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]"));
        firstOperand.click();
        
        Thread.sleep(300);
        
        WebElement addButton = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]"));
        addButton.click(); // Click the 'Addition' link
        
        Thread.sleep(300);
        
        // Find the second operand input field and enter the value
        WebElement secondOperand = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]"));
        secondOperand.click();
        
        Thread.sleep(300);

        // Find the calculate button and click it
        WebElement calculateButton = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]"));
        calculateButton.click();

        Thread.sleep(300);
        
        // Find the result element and print the result
        WebElement result = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]"));
        System.out.println("Addition Result: " + result.getText());
        
        Thread.sleep(300);
    }


    public static void testSimpleSubtraction() throws InterruptedException {
        WebElement firstOperand = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]"));
        firstOperand.click();
        
        Thread.sleep(300);
        
        WebElement addButton = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]"));
        addButton.click(); 
        
        Thread.sleep(300);
        
        WebElement secondOperand = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]"));
        secondOperand.click();
        
        Thread.sleep(300);
        
        WebElement calculateButton = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]"));
        calculateButton.click();
        
        Thread.sleep(300);
        
        WebElement result = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]"));
        System.out.println("Substraction Result: " + result.getText());
        
        Thread.sleep(300);
        
    }

    public static void testSimpleMultiplication() throws InterruptedException {
        WebElement firstOperand = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]"));
        firstOperand.click();
        
        Thread.sleep(300);
        
        WebElement addButton = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]"));
        addButton.click(); 
        
        Thread.sleep(300);
        
        WebElement secondOperand = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]"));
        secondOperand.click();

        Thread.sleep(300);
        
        WebElement calculateButton = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]"));
        calculateButton.click();
        
        Thread.sleep(300);
        
        WebElement result = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]"));
        System.out.println("Multiplication Result: " + result.getText());
        
        Thread.sleep(300);
    }

    public static void testSimpleDivision() throws InterruptedException {
    	 WebElement firstOperand = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]"));
         firstOperand.click();
         
         Thread.sleep(300);
         
         WebElement addButton = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[4]"));
         addButton.click(); 
      
         Thread.sleep(300);
         
         WebElement secondOperand = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]"));
         secondOperand.click();

         Thread.sleep(300);
         
         WebElement calculateButton = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]"));
         calculateButton.click();

         Thread.sleep(300);
         
         WebElement result = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]"));
         System.out.println("Division Result: " + result.getText());
         
         Thread.sleep(300);
      
    }

    public static void testSimplePercentage() throws InterruptedException {
    	 WebElement firstOperand = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]"));
         firstOperand.click();
         
         Thread.sleep(300);
         
         WebElement addButton = driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[5]/span[4]"));
         addButton.click(); 
      
         Thread.sleep(300);
         
         WebElement secondOperand = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]"));
         secondOperand.click();

         Thread.sleep(300);
         
         WebElement calculateButton = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]"));
         calculateButton.click();

         Thread.sleep(300);
         
         WebElement result = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]"));
         System.out.println("Division Result: " + result.getText());
         
         Thread.sleep(300);
         
    }

    public static void testSimplelog() throws InterruptedException {
    	
    	 WebElement addButton = driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[4]/span[5]"));
         addButton.click(); 
         
         Thread.sleep(300);
         
    	WebElement firstOperand = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[1]"));
        firstOperand.click();
        
        Thread.sleep(300);
        
        WebElement secondOperand = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]"));
        secondOperand.click();
        
        Thread.sleep(300);
        
        WebElement calculateButton = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]"));
        calculateButton.click();

        Thread.sleep(300);
        
        WebElement result = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]"));
        System.out.println("Log(10) Value: " + result.getText());
    	
        Thread.sleep(300);
        
    }
    
    public static void testSimpleSin() throws InterruptedException {
    	WebElement addButton = driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[1]/span[1]"));
        addButton.click(); 
        
        Thread.sleep(300);
        
        
   	   WebElement firstOperand = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[1]"));
       firstOperand.click();
      
       Thread.sleep(300);
       
       WebElement calculateButton = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]"));
       calculateButton.click();

       Thread.sleep(300);
       
       WebElement result = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]"));
       System.out.println("Sin(1) Value: " + result.getText());
       
       Thread.sleep(300);
       
    }
    
    public static void testSimpleCos() throws InterruptedException {
    	WebElement addButton = driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[1]/span[2]"));
        addButton.click(); 
        
        Thread.sleep(300);
        
   	   WebElement firstOperand = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[1]"));
       firstOperand.click();
      
       Thread.sleep(300);
       
       WebElement calculateButton = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]"));
       calculateButton.click();

       Thread.sleep(300);
       
       WebElement result = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]"));
       System.out.println("Cos(1) Value: " + result.getText());
       
       Thread.sleep(300);
       
    }
    
    public static void testSimplePower()throws InterruptedException {
    	 WebElement firstOperand = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]"));
         firstOperand.click();
         
         Thread.sleep(300);
         
         WebElement addButton = driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[3]/span[1]"));
         addButton.click();
         
         Thread.sleep(300);
         
         WebElement secondOperand = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]"));
         secondOperand.click();

         Thread.sleep(300);
         
         WebElement calculateButton = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]"));
         calculateButton.click();
         
         Thread.sleep(300);
         
         WebElement result = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]"));
         System.out.println("Power(8^2) Result: " + result.getText());
         
         Thread.sleep(300);
         
    }
    
    public static void testSimpleSquareroot() throws InterruptedException {
    	WebElement addButton = driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[4]/span[3]"));
        addButton.click(); 
        
        Thread.sleep(300);
        
   	   WebElement firstOperand = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]"));
       firstOperand.click();
      
       Thread.sleep(300);
       
       WebElement calculateButton = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]"));
       calculateButton.click();
       
       Thread.sleep(300);

       WebElement result = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]"));
       System.out.println("sqrt(4) Value: " + result.getText());
       
       Thread.sleep(300);
       
    }
    
    public static void testSimpleFactorial() throws InterruptedException {
        
   	   WebElement firstOperand = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]"));
       firstOperand.click();
      
       Thread.sleep(300);
       
       WebElement addButton = driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[5]/span[5]"));
       addButton.click(); 
       
       Thread.sleep(300);
       
       WebElement calculateButton = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]"));
       calculateButton.click();

       Thread.sleep(300);
       
       WebElement result = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]"));
       System.out.println("factorial(4) Value: " + result.getText());
       
       Thread.sleep(300);
       
    }
    
}
