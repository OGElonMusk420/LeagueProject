public class Minions extends Entities {
    private int type; // 1. Melee 2. Caster 3. Canon 4. Super
    private boolean baronBuff;
    private int waveCount;
    private String eName;
    private Dates dOR; //date of release
    private Stats stat; 
    private int gold;

    public Minions(){
         eName= "Minion";
        type = 0;
        baronBuff = false;
        waveCount = 0;
        dOR = new Dates(0,0,0);
        stat = new Stats(0,0,0,0,0,0,0.0,0);
        gold = 0;
        
    }
    public Minions(int ty, boolean bar, int wc){//minion ms is always 325
        int helth;
        int atak;
        int arm;
        int magR;
        
        int raange;
        double attackS;
        int upFac = wc/6;
        if(ty==1){// melee minion https://www.mobafire.com/league-of-legends/wiki/minions/melee-minion
            eName = "Melee Minion";
            raange = 110;
            helth = 477; 
            
            atak = 12;
            magR =0;
            arm = 0;
            attackS = 1.250;
            gold = 21; 




            
        }
    }


    
}
