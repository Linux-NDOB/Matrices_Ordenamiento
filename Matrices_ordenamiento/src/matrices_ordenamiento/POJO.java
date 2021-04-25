/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices_ordenamiento;

import javax.swing.JOptionPane;

/**
 *
 * @author nelson
 */
public class POJO {


    //En mi universidad se divide el codigo para
    //hacerlo de forma organizada
    //a esto se le llama POJO ,pegale una investigadita.

    //aqui viene la declaracion de las matrices
    public double id[][]; //matricula queda soso
    public String nombre[][]; //nombre del alumno
    public double calificacion[][]; //calificacion del alumno

    public POJO(){
       

        id = new double[1][7];

        id[0][0] = 101510;
        id[0][1] = 101516;
        id[0][2] = 101519;
        id[0][3] = 101520;
        id[0][4] = 101545;
        id[0][5] = 101512;
        id[0][6] = 101508;

        nombre = new String[1][7];

        nombre[0][0] = "Juan Reyes";
        nombre[0][1] = "Susana Gonzalez";
        nombre[0][2] = "Evelin Prado";
        nombre[0][3] = "Cesar Garcia";
        nombre[0][4] = "Ricardo Reyes";
        nombre[0][5] = "Berenice Diaz" ;
        nombre[0][6] = "Cynthia Lopez";

        calificacion = new double[1][7];
        calificacion[0][0] = 8.7;
        calificacion[0][1] = 7.2;
        calificacion[0][2] = 9.3;
        calificacion[0][3] = 7.8;
        calificacion[0][4] = 8.4;
        calificacion[0][5] = 9.3;
        calificacion[0][6] = 9.7;
    }

   

    public void mostrar_alumnos() {



        String data = "La informacion del alumno es : \n";

        data += "Id : " + id[0][0] + "\n";

        data += "Nombre: " + nombre[0][0] + "\n";

        data += "Nota  :" + calificacion[0][0] + "\n";

        JOptionPane.showMessageDialog(null, data);



        String data1 = "La informacion del alumno es: \n";

        data1 += "Id: " + id [0][1]+"\n";

        data1+= "Nombre : " + nombre[0][1]+"\n";

        data1 += "Calificacion :" + calificacion[0][1]+"\n";

        JOptionPane.showMessageDialog(null, data1);



        String data2 = "La informacion del alumno es: \n";

        data2 += "Id : " + id [0][2]+"\n";

        data2+= "Nombre : " + nombre[0][2]+"\n";

        data2 += "Calificacion :" + calificacion[0][2]+"\n";

        JOptionPane.showMessageDialog(null, data2);



        String data3 = "La informacion del alumno es: \n";

        data3 += "id : " + id [0][3]+"\n";

        data3+= "Nombre : " + nombre[0][3]+"\n";

        data3 += "Calificacion :" + calificacion[0][3]+"\n";

        JOptionPane.showMessageDialog(null, data3);


        String data0 = "La informacion del alumno es: \n";

        data0 += "Id : " + id [0][4]+"\n";

        data0+= "Nombre : " + nombre[0][4]+"\n";

        data0 += "Calificacion :." + calificacion[0][4]+"\n";

        JOptionPane.showMessageDialog(null, data0);


        String data01 = "La informacion del alumno es: \n";

        data01 += "Id : " + id [0][5]+"\n";

        data01 += "Nombre : " + nombre[0][5]+"\n";

        data01 += "Calificacion :" + calificacion[0][5]+"\n";


        JOptionPane.showMessageDialog(null, data01);

        String data02 = "La informacion del alumno es: \n";

        data02 += "Id : " + id [0][6]+"\n";

        data02 += "Nombre : " + nombre[0][6]+"\n";

        data02 += "Calificacion :" + calificacion[0][6]+"\n";


        JOptionPane.showMessageDialog(null, data02);

    }
    
    
    
    
    double calificacionx[] = {8.7, 7.2, 9.3, 7.8, 8.4,9.3,9.7};
        
    public void getInfo(){
        for (int i=0; i<calificacionx.length; i++)        
            JOptionPane.showMessageDialog(null,calificacionx[i]);
      
        }
    public  void ordenar_calificaciones(){
        
        /* Método de ordenación mediante algoritmo de burbuja */
        
   
        double temp ;
        /* Bucle desde 0 hasta la longitud del array -1 */
        for (int i = 0; i < calificacionx.length  -1; i++) {
            /* Bucle anidado desde 0 hasta la longitud del array -1 */
            for (int j = 0; j < calificacionx.length - 1; j++) { /* Si el número almacenado en la posición j es menor que el de la posición j+1 (el siguiente del array) */ 
                
                if (calificacionx[j] < calificacionx[j+1]) {
                    /* guardamos el número de la posicion j+1 en una variable (el menor) */
                   
                     temp =  calificacionx[j+1];
                     
                    /* Lo intercambiamos de posición */
                    
                    calificacionx[j+1] = calificacionx[j];
                    
                    calificacionx[j] = temp;
                    
                    
                    
                    /* y volvemos al inicio para comparar los siguientes hasta que todos se hayan comparado*/
                    /* de esta forma vamos dejando los números mayores al final del array en orden*/
                    
                    
                }
                   
                 }
            
            
                 }
                 getInfo();
        
        }
        
       
        
    

        



    public void mostrar_por_id(){

        String opcion;
        Object TyOpcion[] = {"101510","101516","101519","101520","101545","101512","101508"};

        Object lista_opciones = JOptionPane.showInputDialog(null," Notas \n"
                        +"Notas registradas",
                         "Lista de notas ",
                JOptionPane.QUESTION_MESSAGE,null,TyOpcion, TyOpcion[0]);
        opcion = lista_opciones.toString();
        
        if(lista_opciones.equals("101510")){
            String nota = "La nota del alumno es: \n";

            nota += "Nota: " + calificacion [0][0]+"\n";
            JOptionPane.showMessageDialog(null, nota);
        }

        else if(lista_opciones.equals("101516")){
            String nota = "La nota del alumno es: \n";

            nota += "Nota: " + calificacion [0][1]+"\n";
            JOptionPane.showMessageDialog(null, nota);
        }

        else if(lista_opciones.equals("101519")){
            String nota = "La nota del alumno es: \n";

            nota += "Nota: " + calificacion [0][2]+"\n";
            JOptionPane.showMessageDialog(null, nota);
        }

        else if(lista_opciones.equals("101520")){
            String nota = "La nota del alumno es: \n";

            nota += "Nota: " + calificacion [0][3]+"\n";
            JOptionPane.showMessageDialog(null, nota);
        }

        else if(lista_opciones.equals("101545")){
            String nota = "La nota del alumno es: \n";

            nota += "Nota: " + calificacion [0][4]+"\n";
            JOptionPane.showMessageDialog(null, nota);
        }

        else if(lista_opciones.equals("101512")){
            String nota = "La nota del alumno es: \n";

            nota += "Nota: " + calificacion [0][5]+"\n";
            JOptionPane.showMessageDialog(null, nota);
        }

        else if(lista_opciones.equals("101508")){
            String nota = "La nota del alumno es: \n";

            nota += "Nota: " + calificacion [0][6]+"\n";
            JOptionPane.showMessageDialog(null, nota);
        }
    }


}

    

