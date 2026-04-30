public class SimpleDivision{
    public static void main(String[] args){
        try{
            int x = 10;
            int y = 0;
            int r = x/y;
            System.out.println(r);
        
        }
        catch(ArithmeticException e){
            System.out.println("Error:Divivsion by zero");
        }
    }
} 
