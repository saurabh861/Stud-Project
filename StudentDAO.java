package org.planning.restfulcrud.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.o7planning.restfulcrud.model.Students;

public class Students {

    private static final Map<String, Students> StudMap = new HashMap<String, Students>();

    static {
        initStud();
    }

    private static void initStud() {
        Students Stud1 = new Students("S01", "Anuja", "05-08-1999");
        Students Stud2 = new Students("S02", "Gaurav", "01-05-1996");
        Students Stud3 = new Students("S03", "Smita", "05-09-2001");
		Students Stud4 = new Students("S04", "yogi", "08-09-2005");
		

        Stud1Map.put(Stud1.getStudNo(), Stud1);
        Stud2Map.put(Stud2.getStudNo(), Stud2);
        Stud3Map.put(Stud3.getStudNo(), Stud3);
		Stud4Map.put(Stud4.getStudNo(), Stud4);
	
		
    }

    public static Students getStudents(String StudNo) {
        return StudMap.get(StudNo);
    }

    public static Students addStudents(Students Stud) {
        StudMap.put(Stud.getStudNo(), Stud);
        return Stud;
    }

    public static Students updateStudents(Students Stud) {
        StudMap.put(Stud.getStudNo(), Stud);
        return Stud;
    }

    public static void deleteStudents(String StudNo) {
        StudMap.remove(StudNo);
    }

    public static List<Students> getAllStudents() {
        Collection<Students> c = StudMap.values();
        List<Students> list = new ArrayList<Students>();
        list.addAll(c);
        return list;
    }
    
    List<Students> list;

}
