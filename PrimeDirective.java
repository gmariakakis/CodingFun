//Author Gmariakakis
import java.util.ArrayList;


class PrimeDirective {
  
//Check if a number is prime
  public boolean  isPrime(int number){
    if(number==2){

      return true;

    } else if (number<2){
      return false;
    } else {
  for (int i=2; i<number;i++){
    if(number%i == 0){
      return false;
    }
    
  }
  return true;
    }
  }
  
  //making an array into an arraylist with only primes in it
  public ArrayList<Integer> onlyPrimes(int[] numbers){
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for(int number : numbers){
    if(number%2 !=0){
      primes.add(number);
          }
        
       }  return primes;
  }
  //turning an array of numbers into an arraylist of odd or even numbers based on user choice(type)
  public ArrayList<Integer> oddNeven(int[] numbers,String type){
    if(type == "odds"){
     ArrayList<Integer> odds = new ArrayList<Integer>();
     for(int i =0;i<numbers.length;i++){
      if(numbers[i]%2!=0){
      odds.add(numbers[i]);
      

      }
     }
     System.out.println(odds.toString());
   return odds;
    }  
   else if(type == "evens"){
       ArrayList<Integer> evens = new ArrayList<Integer>();
     for(int i =0;i<numbers.length;i++){
      if(numbers[i]%2==0){
      evens.add(numbers[i]);
    }
     }
     System.out.println(evens.toString());
     return evens;
   }
   else {
      ArrayList<Integer> voids = new ArrayList<Integer>();
    return voids;
   }   
  }


//turning an array of numbers into an arraylist but only as many as the user needs
 public ArrayList<Integer> Nprimes(int[] numbers,int v)
{
  ArrayList<Integer> nprime = new ArrayList<Integer>();
  
   for (int i= 0; i<numbers.length;i++){
      if(numbers[i]%2 != 0 ){
       if(v!=nprime.size()){
        nprime.add(numbers[i]);
       }
      }

   }
   
   System.out.println(nprime.toString());
   return nprime;

}







  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {0,1,2,3,4,5,6, 29, 28, 33, 11, 100, 101, 43, 89};
   System.out.println(pd.isPrime(0));
  System.out.println(pd.onlyPrimes(numbers));
   pd.oddNeven(numbers,"odds");
   pd.Nprimes(numbers,10);
  }  

}