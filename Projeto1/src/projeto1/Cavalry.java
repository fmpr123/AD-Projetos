/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

/**
 *
 * @author Turma A
 */
public class Cavalry extends FightingForce{

    public Cavalry() {
        super(50, 50, 0);
    }

    @Override
    public String toString() {
        return "Cavalry - Attack: " + getAttack()+" Defense: "+getDefense();
    }
}
