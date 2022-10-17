import static java.lang.System.*;

class CoinFlip{
    public static void main(String[] args){
       out.println("Program for flip a coin");
        
        if(Math.random() < 0.5){
            out.println("Head");
        }
        else{
            out.println("Tail");
        }
    }
}
