package Demo13;

public class Laptop {
    public void powerOn() {
        System.out.println("开机");
    }

    public void powerOff(){
        System.out.println("关机");
    }

    public void useDevice(USB usb){
        System.out.println("电脑使用USB");
        usb.ON();;
        usb.OFF();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.Click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard)usb;
            keyboard.Input();
        }
    }
}
