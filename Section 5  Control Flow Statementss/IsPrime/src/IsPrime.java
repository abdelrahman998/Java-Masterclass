public class IsPrime {
    public static void main(String[] args) {
        
    }

    public static boolean isPrime (int number ){
        if (number == 1){
            return false;
        }
        for (int i = 2; i <= number ; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
