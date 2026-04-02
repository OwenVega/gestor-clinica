/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicav2;

public class Validaciones {
    public static boolean Val(String texto,String cadena){
        boolean sw = false;
        
        for(int i=0;i<texto.length();i++){
            sw = false;
            for(int k=0;k<cadena.length();k++){
                if(texto.charAt(i) == cadena.charAt(k)){
                    sw = true;
                    break;
                }
            }
            if(sw==false){break;}
        }
        
        
        return sw;
    }
    
    
    public static boolean ValNombre(String nombre){
        boolean sw = false;
        
        if(nombre.length()<=35){
            sw = Val(nombre.toUpperCase(),"ABCDEFGHIJKLMNOPQRSTUVWXTZ ");
        }
        return sw;
    }
    
    public static boolean ValDNI(String DNI){
        boolean sw = false;
        if(DNI.length()== 8){
            sw = Val(DNI,"0123456789");
        }
        return sw;
    }
    public static boolean Fecha(String fecha){
        boolean sw = false;
        int dia,mes,año;
        if(fecha.length() == 10 && (fecha.charAt(2) == '/' && fecha.charAt(5) == '/') && Val(fecha, "0123456789/")){
            dia = Integer.parseInt(fecha.substring(0, 2));
            mes = Integer.parseInt(fecha.substring(3, 5));
            año = Integer.parseInt(fecha.substring(6, 10));
            if((dia<=31 && dia >=1) && (mes<=12 && mes >=1) && (año<=2025 && año >=1900)){
                sw = true;
            }
        }
        return sw;
    }
    public static boolean Telefono(String tel){
        boolean sw = false;
        
        if(tel.charAt(0) == '9' && tel.length()==9){
            sw = Val(tel, "1234567890");
        }
        return sw;
    }
    
    public static boolean Correo(String correo){
        boolean sw = false;
        if(correo.length()<= 320){
            sw = Val(correo, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.-_+@");
        }
        return sw;
    }
    
    public static boolean Direccion(String direc){
        boolean sw = false;
        if(direc.length()<=50){
            sw = Val(direc,"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.0123456789 ,.");
        }
        return sw;
    }
}
