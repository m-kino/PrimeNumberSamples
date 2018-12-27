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

/**
 * @author Masatomi KINO
 * @version $Revision$
 */
public class Main_step01 {
    public static void main(String[] args) {
        // •W€“ü—Í‚Å“ü—Í‚³‚ê‚½n
        // 1~n‚Ü‚Å‚Ì”’l‚É‘f”‚ª‚¢‚­‚Â‚ ‚é‚©
        // ”‚¦‚Ä•Ô‹p‚·‚éB
        // ‚Á‚Ä‘èŞ‚Å‚·B

        int target = 13;  // —á
        int counter = 0;
        for (int i = 2; i <= target; i++) {
            boolean primeFlag = isPrime(i);
            if (primeFlag) {
                System.out.println(i + ": ‘f”!");
                counter++;
            } else {
                System.out.println(i + ": ‘f”‚¶‚á‚È‚¢!");
            }
        }
        System.out.println(target + ":" + counter);
    }

    private static boolean isPrime(int target) {
        boolean primeFlag = true;
        for (int i = 2; i < target; i++) {
            if (target % i == 0) {
                // ‚±‚¿‚ç‚ğˆê“x‚Å‚à‚Æ‚¨‚é‚Æ‘f”‚¶‚á‚È‚¢
                primeFlag = false;
            } else {
                // ‘f”
            }
        }
        return primeFlag;
    }
}
