/**
 * Created by kumavatj on 5/5/17.
 */
public class ExceptionTest {
    public static void main(String[] args){
        ExceptionTest t = new ExceptionTest();
        System.out.print(t.handleexcpetion());
    }

    int handleexcpetion(){
        try {
            //return 1;
            throw new Exception();
        }catch (Exception e){
            return 2;
        }finally {
            return 2;
        }
    }
}
