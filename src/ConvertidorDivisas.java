import javax.swing.*;
import java.text.DecimalFormat;

public class ConvertidorDivisas extends Convertidor {
    private String seleccion;
    DecimalFormat formato = new DecimalFormat("#.##");
    public ConvertidorDivisas() {
        super();
        String[] tipos = {"Dolar(USD)","Euros(EUR)",
                "Yen(JPY)","Libras(GBP)","Dolar(AUD)","Franco Suizo(CHF)",
                "Renminbi(CNH)","Won(KRW)","Quetzal(GTQ)","Colon(CRC)"};
        setTipos(tipos);
    }
    public void TiposdeDivisas() {
         seleccion = (String) JOptionPane.showInputDialog(null,"¿Qué Moneda desea convertir?","Convertidor"
                ,JOptionPane.QUESTION_MESSAGE,null, getTipos(),getTipos()[0]);
        ConvertirMoneda();
    }
    public void IngresarCantidad(){
        String input;
        input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:");
        if (ValidarNumero(input)){
            setCantidad(Double.parseDouble(input));

        }
        else {
            JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
            IngresarCantidad();
        }

    }
    public void ConvertirMoneda(){
        switch (this.seleccion){
            case "Dolar(USD)":
                IngresarCantidad();
                setResultado(getCantidad() * 0.041);
                JOptionPane.showMessageDialog(null,"es:" + getResultado());
                break;
            case "Euros(EUR)":

                break;
            case "Yen(JPY)":

                break;
            case "Libras(GBP)":

                break;
            case "Dolar(AUD)":

                break;
            case "Franco Suizo(CHF)":

                break;
            case "Renminbi(CNH)":

                break;
            case "Won(KRW)":

                break;
            case "Quetzal(GTQ)":

                break;
            case "Colon(CRC)":

                break;
        }
    }
}
