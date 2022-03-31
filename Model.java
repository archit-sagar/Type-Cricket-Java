import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Model {

    private int target = 0;
    private int updateScore = 0;
    private String date;
    private String result;

    public void initScore() {
        this.updateScore = 0;
    }

    public void setScore(int score) {
        this.updateScore = score;
    }

    public int getScore() {
        return updateScore;
    }

    public void setTarget(int score) {
        this.target = score + 1;
    }

    public int getTarget() {
        if (target <= 0) {
            return 1;
        }
        return target;
    }

    public String getDate() {
        return date;
    }

    public String getResult() {
        return result;
    }

    public void setResults(String date, String result) {
        this.date = date;
        this.result = result;
    }

    public void writeToDataBase(String date, String result){
        Connection c = null;
        Statement stmt = null;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql:typecricket","postgres","postgres");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "INSERT INTO RESULTS(date, result) Values(\'"+date+"\',"+"\'"+result+"\');";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Result added to the database.");
            
            System.out.println("Record created successfully");
        }
        catch (Exception e){
            System.err.println( e.getClass().getName()+": "+ e.getMessage());
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Could not add result to the database.");
        }
    }

}
