import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void testCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(4);

        radio.next();

        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMinRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.next();
        int expected = 1;
        int actual =radio.getCurrentRadioStation();
        Assertions.assertEquals(expected , actual);


    }
    @Test
    public void testMaxRadioStation(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextRadioStation(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testPrevRadioStation(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNormalVolume(){
        Radio radio =new Radio();
        radio.setCurrentVolume(9);

        radio.up();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected , actual);

    }
    @Test
    public void testMinVolume(){
        Radio radio = new Radio ();
        radio.setCurrentVolume(0);

        radio.down();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected , actual);

    }
    @Test
    public void testMaxVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.up();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected ,actual);
    }
    @Test
    public  void testMinnVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.down();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected ,actual);
    }

}


