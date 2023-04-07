import javax.swing.*;
import java.text.DecimalFormat;

public class ConvertidorDivisas extends Convertidor {
    private String seleccion;
    public ConvertidorDivisas() {
        super();
        String[] tipos = {"Dolar(USD)","Euros(EUR)",
                "Yen(JPY)","Libras(GBP)","Dolar(AUD)","Franco Suizo(CHF)",
                "Renminbi(Yuan)","Won(KRW)","Quetzal(GTQ)","Colon(CRC)"};
        setTipos(tipos);
    }
    public void TiposdeDivisas() {
         seleccion = (String) JOptionPane.showInputDialog(null,"¿Qué Moneda desea convertir?","Convertidor"
                ,JOptionPane.QUESTION_MESSAGE,null, getTipos(),getTipos()[0]);

        ConvertirMoneda();
    }
    public void IngresarCantidad(){
        String input;
        input = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas convertir:");
        if (ValidarNumero(input)){
            setCantidad(Double.parseDouble(input));
        }
        else {
            JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
            IngresarCantidad();
        }

    }
    protected void redondearResultado(double num) {
        DecimalFormat decimal = new DecimalFormat("#.###");
         setResultado(Double.parseDouble(decimal.format(num)));
        JOptionPane.showMessageDialog(null,"Tienes:" + getResultado() + " " + this.seleccion);
    }
    public void ConvertirMoneda(){
        switch (this.seleccion){
            case "Dolar(USD)":
                IngresarCantidad();
                redondearResultado(getCantidad() * 0.041);
                break;
            case "Euros(EUR)":
                IngresarCantidad();
                redondearResultado(getCantidad() * 0.037);
                break;
            case "Yen(JPY)":
                IngresarCantidad();
                redondearResultado(getCantidad() * 5.38);
                break;
            case "Libras(GBP)":
                IngresarCantidad();
                redondearResultado(getCantidad() * 0.033);
                break;
            case "Dolar(AUD)":
                IngresarCantidad();
                redondearResultado(getCantidad() * 0.061);
                break;
            case "Franco Suizo(CHF)":
                IngresarCantidad();
                redondearResultado(getCantidad() * 0.037);
                break;
            case "Renminbi(Yuan)":
                IngresarCantidad();
                redondearResultado(getCantidad() * 0.28);
                break;
            case "Won(KRW)":
                IngresarCantidad();
                redondearResultado(getCantidad() * 53.55);
                break;
            case "Quetzal(GTQ)":
                IngresarCantidad();
                redondearResultado(getCantidad() * 0.32);
                break;
            case "Colon(CRC)":
                IngresarCantidad();
                redondearResultado(getCantidad() * 21.89);
                break;
        }
    }
}
