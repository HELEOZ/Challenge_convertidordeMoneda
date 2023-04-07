import javax.swing.*;

public class MenuPrincipal {
    public static void main(String[] args) {
        ConvertidorDivisas divisas = new ConvertidorDivisas();

        String[] tipoConversor ={"Convertidor de Divisas","Convertidor de Temperatura"};

        int Menu =JOptionPane.showOptionDialog(null,"Seleccione un convertir:","Convertidores",
                 JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,tipoConversor,tipoConversor[1]);
        switch (Menu){
            case 0:
                divisas.TiposdeDivisas();
                break;
            case 1:

                break;
        }

    }
}
