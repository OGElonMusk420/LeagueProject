public class Stats {
    private int HP;
    private int AD;
    private int AP;
    private int Armor;
    private int MR;
    private double AS;
    private int MS;
    private int RG;

    public Stats(){
        HP = 0;
        AD = 0;
        AP = 0;
        Armor = 0;
        MR = 0;
        AS = 0.0;
        MS = 0;
        RG= 0;

    }
    public Stats(int aa,int a, int b, int c, int d, int e, double f, int rang){
        a=HP;
        b=AD;
        c=AP;
        d=Armor;
        e=MR;
        AS=f;
        MS = aa;
        RG=rang;
    }

    
}
