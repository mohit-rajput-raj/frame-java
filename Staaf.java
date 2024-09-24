
package atsystem;

class Staaf {
    teacherr[][] staff;

    class teacherr {
        String id;

        teacherr(String id) {
            this.id = id;
        }
    }

    Staaf(CourseData stf) {

        staff = new teacherr[stf.ss.length][stf.ss[0].length];
        for (int i = 1; i <= stf.ss.length; i++) {
            for (int j = 1; j <= stf.ss[0].length; j++) {
                this.staff[i - 1][j - 1] = new teacherr((char) (i + 64) + "" + j);
            }
        }
    }

}
