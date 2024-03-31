public class Lambda {

    public static void main(String[] args) {

        var res = calculator((var b, var c) -> b + c, 5, 7);
        System.out.println();
    }
    public static <T> T calculator(Operationn<T> function, T value1 , T value2) {
        T result = function.operate(value1, value2);
        return result;
    }

}

interface Operationn<T> {

    T operate(T a, T b);
}
