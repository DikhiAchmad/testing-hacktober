public class PrimeNumber {
    public static boolean isPrime(int num) {
      if(num < 2) {
          return false;
      } else if(num == 2) {
          return true;
      } else {
          int sq = (int)Math.sqrt(num) + 2;
          for(int i = 2;i<sq;i++){
              if(num % i == 0){
                  return false;
              }
          }
      }
      return true;
  }
    
    public static void main(String[] args) {
        isPrime(14);
    }
}
