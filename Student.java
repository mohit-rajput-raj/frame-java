
package atsystem;

public class Student extends Member{
    CourseData ss = new CourseData();
    String branch;
    int session;
    int BranchID;
    Subject[] subjets;
    Student(int id, String name, int session, String branch, int BranchID) {
        super(id, name);
        this.session = session;
        this.branch = branch;
        for (int i = 0; i < subjets.length; i++) {
            this.subjets[i] = new Subject(ss.ss[BranchID][i], (char) (BranchID + 65) + "" + (i + 1));
        }
    }
    void setName(String n){
        name = n;
    }
    void setId(int i){
        id = i;
    }
    void setSession(int s){
        session = s;
    }
    void setBranch(String b){
        branch = b;
    }
//    CourseData ss = new CourseData();
//    int id;
//    int subAm;
//    Subject[] subjets;
//
//    Student(int id, int subAm, int brranchID) {
//        this.subAm = subAm;
//        subjets = new Subject[subAm];
//        this.id = id;
//        for (int i = 0; i < subjets.length; i++) {
//            this.subjets[i] = new Subject(ss.ss[brranchID][i], (char) (brranchID + 65) + "" + (i + 1));
//        }
//    }

}
