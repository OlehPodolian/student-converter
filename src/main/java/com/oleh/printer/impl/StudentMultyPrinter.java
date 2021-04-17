package com.oleh.printer.impl;

import com.oleh.domain.Student;
import com.oleh.printer.IStudentPrinter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentMultyPrinter implements IStudentPrinter {

    private final List<IStudentPrinter> printers = new ArrayList<>();

    public StudentMultyPrinter(IStudentPrinter ... printers) {
        this.printers.addAll(Arrays.asList(printers));
    }

    @Override
    public void print(Student student) {
        for (IStudentPrinter printer : printers) {
            printer.print(student);
        }
    }
}
