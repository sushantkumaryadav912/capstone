// Diamond Problem
//Java doesnot support multiple inheritance with clsses but it supports multiple inheritance with interfaces.
//a smart home system has device A and decice B
// both the system has same operation that is turn on the device
// so our solution is smart device imoplements both interfaces (method )


interface DeviceA {
    default void turnOn() {
        System.out.println("Turning on Device A");
    }
    
}

interface DeviceB {
    default void turnOn() {
        System.out.println("Turning on Device B");
    }
}


class SmartDevice implements DeviceA, DeviceB {
    public void turnOn() {
        DeviceA.super.turnOn();
        DeviceB.super.turnOn();
    }
}

public class problem01 {
    public static void main(String[] args) {
        SmartDevice op = new SmartDevice();
        op.turnOn();
    }
}