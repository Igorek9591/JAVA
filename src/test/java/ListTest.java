import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ListTest {
    @Test
    public void pushBackTest() {
        var list = new List<Integer>();
        list.pushBack(0);
        list.pushBack(1);
        list.pushBack(2);
        assertEquals(3, list.getSize());
        assertEquals(2, list.get(2).intValue());
    }

    @Test
    public void pushFrontTest() {
        var list = new List<Integer>();
        list.pushFront(43);
        list.pushFront(-34);
        list.pushFront(13);
        list.pushFront(-8);
        assertEquals(4, list.getSize());
        assertEquals(-34, list.get(2).intValue());
    }

    @Test
    public void popFrontTest() {
        var list = new List<Integer>();
        list.pushBack(68);
        list.pushBack(156);
        list.pushBack(65);
        list.popFront();
        assertEquals(2, list.getSize());
        assertEquals(156, list.get(0).intValue());
    }

    @Test
    public void popBackTest() {
        var list = new List<Integer>();
        list.pushBack(43);
        list.pushBack(13);
        list.pushBack(95);
        list.pushFront(86);
        list.popBack();
        assertEquals(3, list.getSize());
        assertEquals(43, list.get(1).intValue());
    }

    @Test
    public void deleteTest() {
        var list = new List<Integer>();
        list.pushBack(0);
        list.pushBack(1);
        list.pushBack(2);
        list.delete(0);
        assertEquals(2, list.getSize());
        assertEquals(1, list.get(0).intValue());
    }

    @Test
    public void insertTest() {
        var list = new List<Integer>();
        list.insert(0, 13);
        list.insert(1, 95);
        list.insert(2, 43);
        list.insert(1, 83);
        assertEquals(3, list.getSize());
        assertEquals(83, list.get(1).intValue());
        assertEquals(13, list.get(0).intValue());
    }
}