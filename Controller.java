import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    
    private View theView;
    private Model theModel;

    public Controller(View theView, Model theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.updateInningsListener(new updateInnings());
        this.theView.updatePlayerScoreListener(new updatePlayerScore());
        this.theView.displayTossInfoListener(new displayTossInfo());
    }

    class displayTossInfo implements ActionListener {
        public void actionPerformed(ActionEvent e){
            theView.displayTossInfo();
        }
    }

    class updateInnings implements ActionListener {
        public void actionPerformed(ActionEvent e){
            int score = theModel.getScore();
            theModel.initScore();
            theModel.setTarget(score);
            theView.displayChangeInnings();
            int target = theModel.getTarget();
            theView.updateInnings(target);
        }
    }

    class updatePlayerScore implements ActionListener {
        public void actionPerformed(ActionEvent e){
            try{
                int score = theModel.getScore();
                int updatedScore = theView.updateScore(score);
                if(updatedScore==-2){
                    System.exit(0);
                }
                else if(updatedScore==-1){
                    theModel.setTarget(score);
                    int target = theModel.getTarget();
                    theModel.initScore();
                    theView.updateInnings(target);
                }
                else{
                    theModel.setScore(updatedScore);
                }
            }
            catch (NumberFormatException ex){
                System.out.println(ex);
                theView.displayError("Enter an integer between 1 and 6.");
            }
        }
    }
}
