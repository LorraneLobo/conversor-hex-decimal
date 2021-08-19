import java.io.IOException;
import java.util.Scanner;

public class ConversorDecimal {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb;

        String N = sc.next();

        //Verifica se o valor recebido nao é negativo
        while (N.charAt(0) != '-') {

            //verifica se o valor recebido é um Hexadecimal ou Decimal
            if (N.charAt(0) == '0' && N.charAt(1) == 'x') { //é hexadecimal
                sb = new StringBuilder(N);
                sb.delete(0,2);
                int num = Integer.parseInt(String.valueOf(sb), 16);
                System.out.println(num);

            } else { //não é hexadecimal
                int aux = Integer.parseInt(N);
                String decimal = Integer.toHexString(aux).toUpperCase();
                System.out.println("0x" + decimal);
            }
            N = sc.next();
        }
    }

}