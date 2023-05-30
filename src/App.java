/**
 * @date: 30.may.2k23
 * @author: pat_mic
 * @description: primer programa en java
 */
import java.util.Scanner;

/**
 * @description: mi primera clase
 */
public class App {
    public static void main(String[] args) throws Exception {
        int nroSigno=5;
        String strDelimitador = "-:-"; 
        String strFrutas = "coco-:-banana-:-piña-:-manzana-:-pera-:-frutilla-:-sandia";

        usoScanner(strDelimitador, strFrutas);
        secunciaSigno(nroSigno);
        secunciaSignoAlterna(nroSigno);
    }

    /**
     * usoScanner , indica como usar la lib Scanner
     * @param strDelimitador, caracteres para hacer la segmentacion
     * @param strFrutas, listado de frutas
     */
    private static void usoScanner(String strDelimitador, String strFrutas) {
        Scanner sc = new Scanner(strFrutas);

        sc.useDelimiter(strDelimitador);
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        sc.close();
    }
    /**
     * secunciaSigno: imprime una secuecia de signos
     * @param nroSigno: candidad de signos a imprimir
     */
    public static void secunciaSigno(int nroSigno) {
        for (int i = 0; i < nroSigno; i++) {
            System.out.print("+ ");
        }
        System.out.println("");
    }
    /**
     * <b>secunciaSignoAlterna</b>: imprime una secuecia de signos alternos
     * @param nroSigno: candidad de signos a imprimir
     */
    public static void secunciaSignoAlterna(int nroSigno) {
        for (int i = 0; i < nroSigno; i++) 
            if (i % 2==0) 
                System.out.print("+ ");
            else
                System.out.print("- ");
        System.out.println("");
    }
}
