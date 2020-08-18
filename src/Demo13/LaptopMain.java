package Demo13;

public class LaptopMain {
    public static void main(String[] args) {
         Laptop laptop = new Laptop();
         laptop.powerOn();
         USB usbmouse = new Mouse();
         laptop.useDevice(usbmouse);
         Keyboard keyboard = new Keyboard();
         laptop.useDevice(keyboard);
         laptop.powerOff();
    }

}
