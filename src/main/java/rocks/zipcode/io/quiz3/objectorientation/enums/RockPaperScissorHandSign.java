package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
 Rock,
 Paper,
 Scissor;

    public RockPaperScissorHandSign getWinner() {
            if(Rock == Paper){
                return Rock;
            } else if (Scissor == Paper ){
                return Scissor;
            }else if(Paper == Rock){
                return Paper;
            }
        return null;
    }

    public RockPaperScissorHandSign getLoser() {
        return null;
    }
}
