package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();


        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(800);
        zofka.turnRight(90);

        for (int i = 0; i < 3; i++) {
            zofka.penDown();
            nakresliDomecek();
            zofka.penUp();
            zofka.turnRight(90);
            zofka.move(100);
            zofka.turnLeft(90);
        }

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnLeft(90);
// vychozi stav

        zofka.turnRight(180);
        zofka.move(160);
        zofka.turnRight(90);

        nakresliPrasatko();


    }

    public void nakresliCtverecek(int delkaStrany) {
        for (int i = 0; i < 4; i++) {
            zofka.turnRight(90);
            zofka.move(delkaStrany);
        }
    }

    public void nakresliDomecek() {
        nakresliCtverecek(200);
        zofka.turnRight(45);
        zofka.move(142);
        zofka.turnRight(90);
        zofka.move(142);
        zofka.turnLeft(135);
    }

    public void nakresliLeziciDomecek() {
        nakresliCtverecek(150);
        zofka.turnRight(45);
        zofka.move(106);
        zofka.turnRight(90);
        zofka.move(106);
        zofka.turnLeft(135);
    }

    public void nakresliNohu() {
        zofka.turnRight(30);
        zofka.move(40);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(30);
    }

    public void nakresli2Nohy() {
        nakresliNohu();
        zofka.turnLeft(240);
        zofka.penDown();
        nakresliNohu();
        zofka.turnLeft(30);
    }

    public void nakresliPrasatko() {
        zofka.penDown();
        nakresliLeziciDomecek();
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.penDown();
        nakresli2Nohy();
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(150);
        zofka.turnRight(90);
        zofka.penDown();
        nakresli2Nohy();
        ocasek();
    }

    public void ocasek() {
        zofka.turnRight(90);
        zofka.move(60);
        zofka.turnRight(30);
        zofka.penDown();
        zofka.move(50);
    }
}
