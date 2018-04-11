/* * * * * * * * * * * * * * * * * * * * * * * *
 * Instituto Tecnológico de Costa Rica         *
 * Data structures                             *
 * 1st Project: Domino´s game                  *
 * by: Fabián Zamora R. and Randald Villegas B.*
 * * * * * * * * * * * * * * * * * * * * * * * */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Victory {
    Player winner;          //winner will be the first player who run out of tokens
    String date;          

    public Victory(Player winner, String fecha) {
        this.winner = winner;
        this.date = fecha;
    }
    
    public Victory() {
        this.winner = null;
        this.date = "";
    }

    public Player getWinner() {
        return winner;
    }

    public String getFecha() {
        return date;
    }
    
    public void saveVictory(Victory playerWinner){
        String winnerToRegister = JsonUtil.converVictoryToJson(playerWinner);
         try {
            FileWriter writer = new FileWriter("Victorys.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(winnerToRegister);
            bufferedWriter.newLine();     
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
         System.out.println("Winner: " + playerWinner.winner.name + " succesfully saved.");
    }
   
    public String showVictorys(){
        try {
            FileReader reader = new FileReader("Victorys.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            String winners = "";
            while ((line = bufferedReader.readLine()) != null) {
                Victory playerWinner = new Victory();
                playerWinner = JsonUtil.convertJsontoJava(line, Victory.class);
                winners += playerWinner.winner.name + "\n";
            }
            reader.close();
            return winners;
        } catch (IOException e) {
            System.out.println("Error al cargar datos");
        }
       return "No victorys registered.";
    }
}
