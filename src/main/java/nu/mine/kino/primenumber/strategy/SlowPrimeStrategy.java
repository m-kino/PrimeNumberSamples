/******************************************************************************
 * Copyright (c) 2014 Masatomi KINO and others. 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *      Masatomi KINO - initial API and implementation
 * $Id$
 ******************************************************************************/
//çÏê¨ì˙: 2018/12/27

package nu.mine.kino.primenumber.strategy;

/**
 * @author Masatomi KINO
 * @version $Revision$
 */
public class SlowPrimeStrategy implements PrimeStrategy {

    public boolean isPrime(int target) {
        boolean primeFlag = true;
        if (target == 1) {
            return false;
        }
        for (int i = 2; i < target; i++) {
            if (target % i == 0) {
                // Ç‡Ç§ÇæÇﬂ
                primeFlag = false;
                break;
            } else {
                // ëfêîÇ©Ç‡
            }
        }
        return primeFlag;
    }

}
