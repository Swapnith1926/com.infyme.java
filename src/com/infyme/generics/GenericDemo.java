package com.infyme.generics;

class Record<E> {
    public void display(E item) {
        System.out.println("Record Class Item : "+item);
    }
}

class Student {
    private int studentId;
    private String studentName;
    
    public Student(int studentId,String studentName)
    {
        this.studentId=studentId;
        this.studentName=studentName;
    }
    public String toString()
    {
        return ("Student: Id = " + studentId + " Name = " + studentName);
    }
}

class GenericsDemo {
    public static void main(String[] args)
    {
        Student s1 = new Student(101,"Robert");
        Record<Integer> integerRecord = new Record<Integer>(); //integerRecord can be used to display only integers
        integerRecord.display(12);
        //integerRecord.display(s1); will give an error as we are trying to add a student class object
        Record<Student> studentRecord = new Record<>();  //studentRecord can be used to display only Students
        studentRecord.display(s1);
        //studentRecord.display(15); will give an error as we are trying to add an integer
    }
}