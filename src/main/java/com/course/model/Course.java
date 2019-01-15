package com.course.model;

import javax.persistence.*;

@Entity
@Table(name = "Coursee")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(length = 50)
    private String Subject;
    @Column(length = 3000)
    private String SubjectDesc;
    public int getId() { return Id; }

    public String getSubject() { return Subject; }

    public String getSubjectDesc() { return SubjectDesc; }
    public Course() { }
    public Course(int Id, String Subject, String SubjectDesc) {
        this.Id = Id; this.Subject= Subject; this.SubjectDesc=SubjectDesc;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + Id+ ", Subject='" + Subject+ '\'' +
                ", SubjectDescription='" +SubjectDesc +  '\'' + '}';

    }
}
