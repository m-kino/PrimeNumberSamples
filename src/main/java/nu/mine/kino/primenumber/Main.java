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
//作成日: 2018/12/27

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
        // 標準入力で入力されたn
        // 1~nまでの数値に素数がいくつあるか
        // 数えて返却する。
        // って題材です。

        int target = 100000; // 例
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
                // System.out.println(i + ": 素数");
                counter++;
            } else {
                // System.out.println(i + ": 素数じゃない");
            }
        }
        System.out.println(target + "以下の素数の数:" + counter);
        System.out.println(System.currentTimeMillis() - start);
    }

}
