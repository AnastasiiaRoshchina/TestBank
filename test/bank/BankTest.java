
package bank;
import org.junit.Assert;
import org.junit.Test;

public class BankTest {
    
    public BankTest() {
    }
    
    @Test
    public void testArvutus1() {
        System.out.println("Arvutus");
        Bank obj = new Bank(); //new object
        Assert.assertEquals((obj.Arvutus(1,1000,1104)),10);
        
    }
    
    @Test
    public void testArvutus2() {
        System.out.println("Arvutus");
        Bank obj = new Bank(); //new object
        Assert.assertEquals((obj.Arvutus(5,1000,1102)),2);
        
    }   
}
