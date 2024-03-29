/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Fabrício and Pedro Malho
 */
public class Army {

    ArrayList<FightingForce> attackForce;
    ArrayList<FightingForce> defenseForce;
    
    public Army(int catapult, int infantry, int cavalry, int side) {
        attackForce = new ArrayList<>();
        defenseForce = new ArrayList<>();

        for (int i = 0; i < catapult; i++) {
            if (new Random().nextInt(100) < side) {
                attackForce.add(new Catapult());
            } else {
                defenseForce.add(new Catapult());
            }
        }
        for (int i = 0; i < infantry; i++) {
            if (new Random().nextInt(100) < side) {
                attackForce.add(new Infantry());
            } else {
                defenseForce.add(new Infantry());
            }
        }
        for (int i = 0; i < cavalry; i++) {
            if (new Random().nextInt(100) < side) {
                attackForce.add(new Cavalry());
            } else {
                defenseForce.add(new Cavalry());
            }
        }
    }
}
