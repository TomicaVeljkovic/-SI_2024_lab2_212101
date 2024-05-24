import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void testAllItemsNull() {
        List<Item> items = null;
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(items, 100));
    }

    @Test
    void getBarcodeNotNullAndLengthZero() {
        List<Item> items = Arrays.asList(new Item("Item1", "", 10, 0));
        assertFalse(SILab2.checkCart(items, 10), "Expected false because barcode length is zero.");
    }

    @Test
    void barCodeStartsWithZero() {
        List<Item> items = Arrays.asList(new Item("Item1", "00123456789", 200, 0.1f));
        assertTrue(SILab2.checkCart(items, 230), "Expected true because barcode starts with zero and has a discount.");
    }

    @Test
    void nameIsNullOrEmpty() {
        List<Item> items = Arrays.asList(new Item(null, "1234567890", 300, 0.2f));
        assertTrue(SILab2.checkCart(items, 360), "Expected true because name is null but other conditions allow.");
    }

    @Test
    void priceGreaterThan300AndHasDiscount() {
        List<Item> items = Arrays.asList(new Item("Item1", "1234567890", 350, 0.2f));
        assertTrue(SILab2.checkCart(items, 380), "Expected true because price is greater than 300 and has a discount.");
    }
}
