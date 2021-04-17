package com.oleh.printer.impl;

import com.oleh.converter.IStudentStringConverter;
import com.oleh.domain.Student;
import com.oleh.printer.IStudentPrinter;

public class DummyStudentPrinter implements IStudentPrinter {

    private final IStudentStringConverter converter;

    public DummyStudentPrinter(IStudentStringConverter converter) {
        this.converter = converter;
    }

    @Override
    public void print(Student student) {
        // nothing happens
    }
}
