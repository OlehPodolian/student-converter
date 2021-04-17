package com.oleh;

import com.oleh.converter.IStudentStringConverter;
import com.oleh.converter.impl.JsonStudentStringConverter;
import com.oleh.converter.impl.SimpleStudentStringConverter;
import com.oleh.converter.impl.XmlStudentStringConverter;
import com.oleh.domain.Student;

public class Main {
    public static void main(String[] args) {

        // TODO: 4/17/21  Создать экземпляры объявленных классов и продемонстрировать их работу

        Student student = new Student(1, "Ivan", "Susanin", 3);

        IStudentStringConverter converter = new SimpleStudentStringConverter();

        System.out.println(converter.convert(student));
    }
}
