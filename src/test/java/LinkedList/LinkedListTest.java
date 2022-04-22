package LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    //add() method tests
    @Test
    void addingANewNodeIncreasesListSize() {
        LinkedList<String> testList = new LinkedList<String>();
        int initialSize = testList.size();
        testList.add("test");
        int newSize = testList.size();
        assertEquals(initialSize+1, newSize);
    }
    @Test
    void addingANewNodeMakesItTheLastOne(){
        LinkedList<String> testList = new LinkedList<String>();
        testList.add(new String("val1"));
        testList.add(new String("val2"));
        testList.add(new String("val3"));
        assertTrue(new String("val3").equals(testList.get(2)));
    }
    ////////////////////

    //get() method tests
    @Test
    void gettingInvalidPosReturnsNull() {
        LinkedList<String> testList = new LinkedList<String>();
        assertNull(testList.get(-1));
    }
    @Test
    void gettingPosReturnsCorrectValue() {
        LinkedList<String> testList = new LinkedList<String>();
        testList.add(new String("val1"));
        testList.add(new String("val2"));
        testList.add(new String("val3"));
        assertTrue(new String("val2").equals(testList.get(1)));
    }
    ////////////////////

    //get() method tests
    @Test
    void settingInvalidPosThrowsIllegalArgumentException() {
        LinkedList<String> testList = new LinkedList<String>();
        assertThrowsExactly(IllegalArgumentException.class, () -> {
            testList.set(-1, new String("val"));
        });
    }
    @Test
    void settingPosChangesCorrectValue() {
        LinkedList<String> testList = new LinkedList<String>();
        testList.add(new String("val1"));
        testList.add(new String("val2"));
        testList.add(new String("val3"));
        testList.set(1, new String("replaced value"));
        assertTrue(new String("replaced value").equals(testList.get(1)));
    }
    ////////////////////

    //remove() method tests
    @Test
    void removingInvalidPosThrowsIllegalArgumentException() {
        LinkedList<String> testList = new LinkedList<String>();
        assertThrowsExactly(IllegalArgumentException.class, () -> {
            testList.remove(-1);
        });
    }
    @Test
    void removingPosZeroFromEmptyListThrowsIllegalArgumentException() {
        LinkedList<String> testList = new LinkedList<String>();
        assertThrowsExactly(IllegalArgumentException.class, () -> {
            testList.remove(0);
        });
    }
    @Test
    void removingOutsideListThrowsIllegalArgumentException() {
        LinkedList<String> testList = new LinkedList<String>();
        assertThrowsExactly(IllegalArgumentException.class, () -> {
            testList.remove(99);
        });
    }
    @Test
    void removingItemFromListRemovesCorrectItem() {
        LinkedList<String> testList = new LinkedList<String>();
        testList.add(new String("val1"));
        testList.add(new String("val2"));
        testList.add(new String("val3"));
        testList.remove(1);
        assertFalse(new String("val2").equals(testList.get(1)));
    }
    ////////////////////

    //insert() method tests
    @Test
    void insertingItemInsertsItAtCorrectPos() {
        LinkedList<String> testList = new LinkedList<String>();
        testList.add(new String("val1"));
        testList.add(new String("val2"));
        testList.add(new String("val3"));
        testList.insert(1, new String("inserted value"));
        assertTrue(new String("inserted value").equals(testList.get(1)));
    }
    @Test
    void insertingItemAtPosLessOrEqualZeroMakesItTheHead() {
        LinkedList<String> testList = new LinkedList<String>();
        testList.add(new String("val1"));
        testList.add(new String("val2"));
        testList.add(new String("val3"));
        testList.insert(0, new String("inserted value"));
        assertTrue(new String("inserted value").equals(testList.get(0)));
    }
    ////////////////////
}