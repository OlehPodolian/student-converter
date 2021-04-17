package com.oleh.printer.impl;

import com.oleh.converter.IStudentStringConverter;
import com.oleh.domain.Student;
import com.oleh.printer.IStudentPrinter;

public class PrettyStudentPrinter implements IStudentPrinter {

    private final IStudentStringConverter converter;

    public PrettyStudentPrinter(IStudentStringConverter converter) {
        this.converter = converter;
    }

    @Override
    public void print(Student student) {
        System.out.println(converter.convert(student));
    }
}
