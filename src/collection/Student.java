package collection;

import java.util.Objects;

public class Student implements Comparable<Student>{
    String studentName;
    int studentId;

    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return studentName + ", " + studentId;
    }

    @Override
    public boolean equals(Object o) {
        /*if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(studentName, student.studentName);*/

        if ( o instanceof Student) {
        Student student = (Student) o;
        if (this.studentId == student.studentId){
            return true;
        } else return false;
    } return false;
    }

    @Override
    public int hashCode() {
        return studentId;
    }

    @Override
    public int compareTo(Student student) {
        // 학번 순으로 정렬
        // return this.studentId - student.studentId; // This 가 더 컸을 때, 양수반환은 오름차순
        // return (this.studentId - student.studentId) * -1; // This 가 더 컸을 때, 음수반환은 내림차순
        // 이름 순으로 정렬
        // return this.studentName.compareTo(studentName); // String 기반 비교 -> .compareTo 사용 : 기본은 오름차순
        return (this.studentName.compareTo(studentName)) * -1; // 내림차순
    }
}
