/*
* File: Romb.java
* Author: Körömi Erik
* Copyright: 2024, Körömi Erik
* Date: 2024-01-10
* Web: https://github.com/
* Licenc: MIT
*
*/

package lan.zold;

import java.util.InputMismatchException;

public class Romb {
    public double calcArea(double side, double angle) {
        if (side <= 0 || angle <= 0) {

            throw new InputMismatchException();

        }
        return Math.pow(side, 2) * Math.sin(Math.toRadians(angle));
    }

    public double calcPerim(double side) {
        if (side <= 0) {
            throw new InputMismatchException();
        }
        return 4 * side;

    }
}