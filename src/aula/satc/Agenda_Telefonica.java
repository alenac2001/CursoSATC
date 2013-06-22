
package aula.satc;

public class Agenda_Telefonica {
    public static void main(String[] args){  
        
        
        String [][] pessoas = new String[3][2];

        String [][] entry = 
        {
            {"Florence", "735-1234", "Manila", "maca"},
            {"Joyce", "983-3333", "Quezon City", "pera"},
            {"Becca", "456-3322", "teste", "laranja"}
        };
        
        System.out.println("Conteudo: " + entry.length);
        System.out.println("entry.length: " + entry.length);
        System.out.println("entry.length: " + entry[0].length);
        
        for (int cont = 0; cont < entry.length; cont ++){
            System.out.println(entry[cont][0]);
            System.out.println(entry[cont][1]);
            System.out.println(entry[cont][2]);
        }  
        
    }
    
}


    