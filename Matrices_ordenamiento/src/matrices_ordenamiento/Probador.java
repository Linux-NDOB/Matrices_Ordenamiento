/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices_ordenamiento;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;

public class Probador {


        public static  void main(String args[]) {


            POJO distro = new POJO();

            try{
                int Option,Exit,identification;


                do {

                    UIManager.put("OptionPane.messageFont", new Font("Fira Code", Font.BOLD, 14));

                    UIManager.put("OptionPane.buttonFont", new Font("Fira Code", Font.PLAIN, 12));

                    UIManager UI=new UIManager();

                    UI.put("OptionPane.background",new ColorUIResource(225,225,225));

                    UI.put("Panel.background",new ColorUIResource(225,225,225));

                    Option=Integer.parseInt(JOptionPane.showInputDialog(

                            "     ----------------Main Menu----------------\n"+"\n"+

                                    "1. Mostrar todos los alumnos(desorganizado)\n"+"\n"+

                                    "2. Organizar notas de los alumnos  \n"+"\n"+

                                    "3. Buscar nota del alumno.  \n"+"\n"+

                                    "4. Salir \n   " + " \n" +


                                    " Please enter an option : "));


                    switch(Option){
                        case 1:

                            distro.mostrar_alumnos();
                            break;

                        case 2:
                            distro.ordenar_calificaciones();
                            
                            break;

                        case 3:

                            distro.mostrar_por_id();

                            break;

                        case 4:


                            Exit=JOptionPane.showConfirmDialog(null, "¿Desea salir?");

                            if (Exit==0) {

                                JOptionPane.showMessageDialog(null,"Vuelva pronto");

                            }
                            break;

                        default:

                            JOptionPane.showMessageDialog(null, "Please use a valid option ");

                            break;

                    }


                }while (Option != 4);


                System.exit(0);


            } catch(NumberFormatException a){

                JOptionPane.showMessageDialog(null, "Operation cancelled by user");

            }



        }
}

