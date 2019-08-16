
package hookmethod;

/**
 *
 * @author Heitor Albuquerque
 */
public class HookMethod {
    public static void main(String[] args) {
        DataBrasileira dataBrasil = new DataBrasileira();
        String data  = dataBrasil.exibeData("1989-03-02");
        
            System.out.println(data);
    }
    
}
