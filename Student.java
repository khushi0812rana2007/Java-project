class Student {
    protected String name;
    public Student(String name) { this.name = name; }
    public void showRole() { System.out.println("I am a hostel student."); }
}

class UGStudent extends Student {
    public UGStudent(String name) { super(name); }
    public void showRole() { System.out.println("I am an undergraduate student."); }
}

class PGStudent extends Student {
    public PGStudent(String name) { super(name); }
    public void showRole() { System.out.println("I am a postgraduate student."); }
}

