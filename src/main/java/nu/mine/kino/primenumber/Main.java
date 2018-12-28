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
//ì¬“ú: 2018/12/27

package nu.mine.kino.primenumber;

import nu.mine.kino.primenumber.strategy.FastPrimeStrategy;
import nu.mine.kino.primenumber.strategy.PrimeStrategy;
import nu.mine.kino.primenumber.strategy.SlowPrimeStrategy;

/**
 * @author Masatomi KINO
 * @version $Revision$
 */
public class Main {
    public static void main(String[] args) {
        // •W€“ü—Í‚Å“ü—Í‚³‚ê‚½n
        // 1~n‚Ü‚Å‚Ì”’l‚É‘f”‚ª‚¢‚­‚Â‚ ‚é‚©
        // ”‚¦‚Ä•Ô‹p‚·‚éB
        // ‚Á‚Ä‘èŞ‚Å‚·B

        int target = 100000; // —á
        PrimeStrategy[] strategies = new PrimeStrategy[] {
                new SlowPrimeStrategy(), new FastPrimeStrategy() };

        // SlowPrimeStrategy strategy = new SlowPrimeStrategy();
        // FastPrimeStrategy strategy = new FastPrimeStrategy();

        for (PrimeStrategy strategy : strategies) {
            execute(target, strategy);
        }

    }

    private static void execute(int target, PrimeStrategy strategy) {
        long start = System.currentTimeMillis();
        int counter = 0;
        for (int i = 1; i <= target; i++) {
            boolean primeFlag = strategy.isPrime(i);
            if (primeFlag) {
                // System.out.println(i + ": ‘f”");
                counter++;
            } else {
                // System.out.println(i + ": ‘f”‚¶‚á‚È‚¢");
            }
        }
        System.out.println(target + "ˆÈ‰º‚Ì‘f”‚Ì”:" + counter);
        System.out.println(System.currentTimeMillis() - start);
    }

}
