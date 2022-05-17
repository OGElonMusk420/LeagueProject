public class Dates {
private int month;
private int day;
private int year;

public Dates(){
    month = 0;
    day = 0;
    year = 0;
}
public Dates(int m, int d, int y){
    month = m;
    day = d;
    year = y;
}
public  String getDate(){
    return ""+ month +"/" + day + "/" + year;
} 
    
}
