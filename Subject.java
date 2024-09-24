
package atsystem;


public class Subject {
    String subname;
    String id;
    Day[] days = new Day[50];

    Subject(String subname, String id) {
        this.id = id;
        this.subname = subname;
        for (int i = 0; i < days.length; i++) {
            this.days[i] = new Day(i, 0);
        }
    }
    void printAttand(){
        for(int i=0;i<50;i++){
            System.out.println(days[i]);
        }
    }
}
