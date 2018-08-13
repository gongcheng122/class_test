package com.company;

public class class_number {
    //返回A和B中较大的数字
    public static int Max(int a, int b) {
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    //返回A和B中较小的数字
    public int Min(int a, int b){
        if(a>b){
            return b;
        }else{
            return a;
        }
    }

    //返回A-B的值
    public static int first_minus_second(int a, int b){
        return a-b;
    }

    //返回B-A的值
    public static int second_minus_first(int a, int b){
        return b-a;
    }

    //返回A-B的绝对值
    public static int minus_absolute(int a, int b){
        if(a-b>0){
            return a-b;
        }else{
            return b-a;
        }
    }

    private static int p_Max(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    public int MAX_ABC(int a, int b, int c){
        int i;
        i = p_Max(a,b);
        return p_Max(i,c);
    }
}
