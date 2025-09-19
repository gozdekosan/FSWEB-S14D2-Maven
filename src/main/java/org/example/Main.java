package org.example;

import org.example.model.*;
import org.example.model.enums.PaintColor;
import org.example.model.enums.LampType;

public class
Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        Bed bed = new Bed(2, 2, 2, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 5);
        Wardrobe wardrobe = new Wardrobe(2,2, 4);
        Carpet carpet = new Carpet(4, 3, PaintColor.RED);

        Bedroom bedroom = new Bedroom("My Bedroom", wall1, wall2, wall3, wall4,
                ceiling, bed, lamp, wardrobe, carpet);


        System.out.println("Bedroom name: " + bedroom.getName());
        bedroom.getWall1().create();
        bedroom.getWall2().create();
        bedroom.getWall3().create();
        bedroom.getWall4().create();
        bedroom.getCeiling().create();
        bedroom.getLamp().turnOn();
        bedroom.getCarpet().lying();
        bedroom.getBed().make();
        bedroom.getWardrobe().add();
    }


}