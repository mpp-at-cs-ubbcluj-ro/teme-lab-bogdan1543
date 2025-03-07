import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    @Test
    void testExample1() {
        ComputerRepairRequest computerRepairRequest = new ComputerRepairRequest();
        assertEquals("",computerRepairRequest.getOwnerName());
        assertEquals("",computerRepairRequest.getOwnerAddress());
    }

    @Test
    void testExample2(){
        assertEquals(2,2,"equal numbers?");
    }
}
