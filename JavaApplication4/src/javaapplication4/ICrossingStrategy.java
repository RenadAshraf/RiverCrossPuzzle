/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.List;

/**
 *
 * @author Hello
 */
public interface ICrossingStrategy{
/**
* @param boatRiders which the user had selected to be moved to the
other bank
* @param rightBankCrossers the crosses on the right bank
* @param leftBankCrossers the crosses on the left bank
* @return whether this move is valid
* or not according to the rules
*/
public boolean isValid(List<ICrosser> rightBankCrossers,
List<ICrosser> leftBankCrossers, List<ICrosser>
boatRiders);
/**
* @return the crossers of the left bank initially
* the right bank has no crossers initially
*/
public List<ICrosser> getInitialCrossers();
/**
* @return return the rules and the instructions of the current
* strategy, to be shown to the user
*/
public String[] getInstructions();
}
