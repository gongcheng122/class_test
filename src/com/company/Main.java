package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int A = 1;
        int B = 2;
        System.out.println(class_number.Max(A,B));
        //System.out.println(class_number.Min(A,B)); error:静态方法不能调用非静态方法

        class_number C = new class_number();
        System.out.println(C.Min(A,B)); //静态方法需要通过对象调用其它非静态方法

        System.out.println(C.Max(A,B)); //静态方法需要通过对象调用其它静态方法

        System.out.println(class_number.first_minus_second(A,B));
        System.out.println(class_number.second_minus_first(A,B));
        System.out.println(class_number.minus_absolute(A,B));

        //System.out.println(class_number.p_Max(A,B)); error:
        //System.out.println(C.p_Max(A,B)); error:

        System.out.println(C.MAX_ABC(A, B, 5));
    }
}
