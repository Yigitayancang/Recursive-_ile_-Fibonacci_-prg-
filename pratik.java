
public class pratik {

    static int fibnuber(int n ){
        if(n == 1 || n == 2){
            return 1 ;
        }
        return fibnuber(n-1) + fibnuber(n- 2 );
    }
    public static void main(String[] args) {
        
        System.out.println(fibnuber(6));

    }
    
}