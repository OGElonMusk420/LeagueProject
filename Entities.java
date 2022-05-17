public class Entities {
    private String eName;//entity name
    private Dates dOR; //date of release
    private Stats stat;//stats of the entity


    public Entities(){
        eName="hey";
        Stats one = new Stats(0,0,0,0,0,0,0/5,0);
        stat = one;
        dOR = new Dates(0,0,0);
    }
    public Entities(String name,int ms, int a, int b, int c, int d, int e, double f, int ran, Dates date){
        eName = name;
        dOR = date;
        Stats hold = new Stats(ms,a,b,c,d,e,f,ran);
        stat=hold;

    }
    
}
