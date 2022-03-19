package com.company;

public class Main {

    public static void main(String[] args) {
        Phone sam = new Phone(5253535, "Note 10s", 220);
        Phone mi = new Phone(5252520, "Note 10s", 220);
        Phone iph = new Phone(5253322, "XR", 305);

        sam.displayInfo();
        mi.displayInfo();
        iph.displayInfo();
        sam.receiveCall("Sam");
        mi.receiveCall("Michael");
        iph.receiveCall("Ilana");
        sam.receiveCall("Volha", 5970848);
        sam.sendMessage(5335555, 2899969, 5569687,7899896,8895656);

    }
}