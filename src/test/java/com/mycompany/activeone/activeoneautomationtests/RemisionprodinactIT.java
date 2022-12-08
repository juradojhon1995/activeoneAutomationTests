
package com.mycompany.activeone.activeoneautomationtests;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author j-hon
 */
public class RemisionprodinactIT {
    
    private static WebDriver driver = null;
    
    public RemisionprodinactIT() {
    }
    @BeforeClass
    public static void inicializarDriver(){
        driver = new ChromeDriver();
    }
    
    @AfterClass
    public static void LiquidarDriver(){
        driver.quit();
    }
        

    @Test
    public void Remisionsinprodactivo() {
        
     driver.get("http://cloud.activeone.co:4000/ingresos/remisiones/nuevo");
        
        WebElement clienteElem = driver.findElement(By.id("input-716"));
        clienteElem.sendKeys("1143150814 - Jhon Jurado");
        WebElement selclienElem = driver.findElement(By.id("list-item-799-0"));
        selclienElem.click();
        
        WebElement forpagoElem = driver.findElement(By.id("input-729"));
        forpagoElem.sendKeys("Contado");
        WebElement selpagoElem = driver.findElement(By.id("list-item-792-0"));
        selpagoElem.click();
      
        WebElement productoElem = driver.findElement(By.id("input-748"));
        productoElem.sendKeys("PELUCHE-03 - PELUCHE");
        WebElement selprodElem = driver.findElement(By.id("list-item-887-5"));
        selprodElem.click();
        
        WebElement descuentoElem = driver.findElement(By.id("input-759"));
        descuentoElem.sendKeys("Porcentaje");
        WebElement seldesElem = driver.findElement(By.id("list-item-807-0"));
        seldesElem.click();
        
        WebElement cantidadElem = driver.findElement(By.id("input-766"));
        cantidadElem.sendKeys("1");
        
        WebElement btnguardar = driver.findElement(By.name("Guardar"));
        btnguardar.click();
        
        WebElement guardar = driver.findElement(By.className("v-list-item__title"));
        guardar.click();
    
    }
    
}
