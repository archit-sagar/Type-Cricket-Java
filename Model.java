public class Model {

    private int target = 0;
    private int updateScore = 0;

    public void initScore(){
        this.updateScore = 0;
    }

    public void setScore(int score){
        this.updateScore = score;
    }

    public int getScore(){
        return updateScore;
    }

    public void setTarget(int score){
        this.target = score + 1;
    }

    public int getTarget(){
        if(target<=0){
            return 1;
        }
        return target;
    }
    
}
