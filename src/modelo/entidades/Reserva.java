package modelo.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    
    private static SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy"); 
// todos objetos da classe Reserva só usa este objeto.
    
    private Integer quarto;
    private Date checkIn;
    private Date checkOut;

    public Reserva() {
    }

    public Reserva(Integer quarto, Date checkIn, Date checkOut) {
        this.quarto = quarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getQuarto() {
        return quarto;
    }

    public void setQuarto(Integer quarto) {
        this.quarto = quarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void atualizarDatas(Date checkIn, Date checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    
    public Long duracao(){
        long diferenca = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }

    @Override
    public String toString() {
        return  "Quarto " + quarto + ", check-in: " + sdf.format(checkIn) + ", check-out: " 
                + sdf.format(checkOut) + ", " + duracao() + " noites";
    }
  
    
    
    
}
