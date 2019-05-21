
package hotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import modelo.entidades.Reserva;

public class Hotel {
    public static void main(String[] args) throws ParseException  {

        SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy"); 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número do quarto: ");
        Integer quarto = sc.nextInt();
        System.out.println("Digite a data de check-in: (dd/mm/aaaa)");
        Date checkIn = sdf.parse(sc.next());
        System.out.println("Digite a data de check-out: (dd/mm/aaaa)");
        Date checkOut = sdf.parse(sc.next());
        
        if (!checkOut.after(checkIn)){
            System.out.println("A data de saída deve ser depois da de entrada.");
        } else{
        Reserva r = new Reserva(quarto, checkIn, checkOut);
        System.out.println("Reserva: ");
            System.out.println(r);
        
        
        
        System.out.println("------- Atualizar Dados -------");
        System.out.println("");
        
        
            
        System.out.println("Digite a data de check-in a ser atualizada: ");
        Date in = sdf.parse(sc.next());
        System.out.println("Digite a data de check-out a ser atualizada: ");
        Date out = sdf.parse(sc.next());
        
        
        Date now = new Date();
        
        if (in.before(now) || out.before(now)){
            System.out.println("As datas atualizadas devem ser datas futuras.");
        }else if(!out.after(in) || out.equals(in)){
            System.out.println("A data de saída atualizada deve ser depois da de entrada atualizada.");
        }else{
        r.atualizarDatas(in, out);
        System.out.println("Reserva: ");
        System.out.println(r);
        }
            
            
         sc.close();
        }
        
    }}
    