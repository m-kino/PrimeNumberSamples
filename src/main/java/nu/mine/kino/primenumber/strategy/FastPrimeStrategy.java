package nu.mine.kino.primenumber.strategy;

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


/**
 * @author Masatomi KINO
 * @version $Revision$
 */
public class FastPrimeStrategy implements PrimeStrategy {

    public boolean isPrime(int target) {
        if (target < 2)
            return false;
        else if (target == 2)
            return true;
        else if (target % 2 == 0)
            return false; // ãÙêîÇÕÇ†ÇÁÇ©Ç∂ÇﬂèúÇ≠

        double sqrtNum = Math.sqrt(target);
        for (int i = 3; i <= sqrtNum; i += 2) {
            if (target % i == 0) {
                // ëfêîÇ≈ÇÕÇ»Ç¢
                return false;
            }
        }

        // ëfêîÇ≈Ç†ÇÈ
        return true;

    }

}
