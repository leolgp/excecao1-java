
package hotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import modelo.entidades.Reserva;
import modelo.excecoes.Excecao;

public class Hotel {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy"); 
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Digite o número do quarto: ");
            Integer quarto = sc.nextInt();
            System.out.println("Digite a data de check-in: (dd/mm/aaaa)");
            Date checkIn = sdf.parse(sc.next());
            System.out.println("Digite a data de check-out: (dd/mm/aaaa)");
            Date checkOut = sdf.parse(sc.next());
            Reserva r = new Reserva(quarto, checkIn, checkOut);
            System.out.println("Reserva: ");
            System.out.println(r);        
            System.out.println("------- Atualizar Dados -------");
            System.out.println("");     
            System.out.println("Digite a data de check-in a ser atualizada: ");
            checkIn = sdf.parse(sc.next());
            System.out.println("Digite a data de check-out a ser atualizada: ");
            checkOut = sdf.parse(sc.next());          
            r.atualizarDatas(checkIn, checkOut);       
            System.out.println("Reserva: ");
            System.out.println(r);
            
        }
        catch(ParseException e){
            System.out.println("formato inválido de data.");
        }
        catch(InputMismatchException e){
            System.out.println("Digite o número do quarto no campo quarto.");
        }
        catch(Excecao e){
            System.out.println("Erro na reserva - " + e.getMessage());
        }
        sc.close();
    }
}
    