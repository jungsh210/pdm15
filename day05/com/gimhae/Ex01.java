package com.gimhae;
/*
 * λ°°μ΄
 * ?λ£ν[]
 * 
 * ?λ£ν[] λ³??λͺ? = new ?λ£ν[κ°??]
 * 
 * λ°°μ΄ ?ΈμΆ?
 * λ³??λͺ?[index]
 * 
 * index
 * 0λΆ??° ?? ~ κ°??-1κΉμ? μ‘΄μ¬
 * λ²μλ₯? ??΄?€ κ²½μ° exception λ°μ
 * 
 */

class Ex01 {
    public static void main(String[] args) {
        int[] a = new int[5];
        //a[0] = 1;
        //a[1] = 3;
        //a[2] = 5;
        //a[3] = 7;
        //a[4] = 9;
        for(int i=0; i<a.length; i++){  // a.length = 5, i<5?? κ°μ
            a[i] = i*2;
        }

        System.out.println("λ°°μ΄ κΈΈμ΄?"+a.length);
        //for(int i=0; i<5; i++){
        //    System.out.println(a[i]);
        //}
        for(int i=0; i<a.length; i++){  // a.length = 5, ??? κ°μ
            System.out.println(a[i]);
        }
    }
}