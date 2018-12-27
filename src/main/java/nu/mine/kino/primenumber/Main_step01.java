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

/**
 * @author Masatomi KINO
 * @version $Revision$
 */
public class Main_step01 {
    public static void main(String[] args) {
        // 標準入力で入力されたn
        // 1~nまでの数値に素数がいくつあるか
        // 数えて返却する。
        // って題材です。

        int target = 13;  // 例
        int counter = 0;
        for (int i = 2; i <= target; i++) {
            boolean primeFlag = isPrime(i);
            if (primeFlag) {
                System.out.println(i + ": 素数!");
                counter++;
            } else {
                System.out.println(i + ": 素数じゃない!");
            }
        }
        System.out.println(target + ":" + counter);
    }

    private static boolean isPrime(int target) {
        boolean primeFlag = true;
        for (int i = 2; i < target; i++) {
            if (target % i == 0) {
                // こちらを一度でもとおると素数じゃない
                primeFlag = false;
            } else {
                // 素数
            }
        }
        return primeFlag;
    }
}
