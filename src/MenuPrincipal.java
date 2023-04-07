import javax.swing.*;

public class MenuPrincipal {
    public static void main(String[] args) {
        ConvertidorDivisas divisas = new ConvertidorDivisas();
        boolean seguir=true;
        while (seguir==true){
            String[] tipoConversor ={"Convertidor de Divisas","Convertidor de Temperatura"};

            int Menu =JOptionPane.showOptionDialog(null,"Seleccione un convertir:","Convertidores",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,tipoConversor,tipoConversor[1]);
            try{
                switch (Menu){
                    case 0:
                        divisas.TiposdeDivisas();
                        break;
                    case 1:

                        break;
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
            int continuar = JOptionPane.showConfirmDialog(null,"¿Desea continuar?");
            if (continuar==0){
                seguir=true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
                seguir=false;
            }
        }

    }
}
