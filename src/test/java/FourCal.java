/**
 * Created by 최은주 on 2017-01-02.
 */
public class FourCal {
    public static void main(String[] args) {
        //두 개의 인자 덧셈
        int arg1 = 10;
        int arg2 = 20;

        int result = arg1 + arg2;
        System.out.println("두 수 덧셈 : "+result);

        //간접화
        int fncResult = add(arg1, arg2);
        System.out.println("간접화 두 수 덧셈 : "+fncResult);

        AddCal Test = new AddCal();
        int clsResult = Test.resultAdd(arg1, arg2);
        System.out.println("클래스활용 간접화 두 수 덧셈 : "+clsResult);

    }

    public static int add(int arg1, int arg2) {
        return arg1+arg2;
    }
}
