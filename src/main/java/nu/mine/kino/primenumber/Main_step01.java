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
//�쐬��: 2018/12/27

package nu.mine.kino.primenumber;

/**
 * @author Masatomi KINO
 * @version $Revision$
 */
public class Main_step01 {
    public static void main(String[] args) {
        // �W�����͂œ��͂��ꂽn
        // 1~n�܂ł̐��l�ɑf�����������邩
        // �����ĕԋp����B
        // ���đ�ނł��B

        int target = 13;  // ��
        int counter = 0;
        for (int i = 2; i <= target; i++) {
            boolean primeFlag = isPrime(i);
            if (primeFlag) {
                System.out.println(i + ": �f��!");
                counter++;
            } else {
                System.out.println(i + ": �f������Ȃ�!");
            }
        }
        System.out.println(target + ":" + counter);
    }

    private static boolean isPrime(int target) {
        boolean primeFlag = true;
        for (int i = 2; i < target; i++) {
            if (target % i == 0) {
                // ���������x�ł��Ƃ���Ƒf������Ȃ�
                primeFlag = false;
            } else {
                // �f��
            }
        }
        return primeFlag;
    }
}
