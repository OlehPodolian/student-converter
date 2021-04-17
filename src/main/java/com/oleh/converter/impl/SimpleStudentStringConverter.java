package com.oleh.converter.impl;

import com.oleh.converter.IStudentStringConverter;
import com.oleh.domain.Student;

public class SimpleStudentStringConverter implements IStudentStringConverter {

    public static final String COMMA = ",";

    @Override
    public String convert(Student student) {
        StringBuilder sb = new StringBuilder("{\n");
        addSimpleRow(sb, "id", String.valueOf(student.getId()), COMMA);
        addSimpleRow(sb, "firstName", student.getFirstName(), COMMA);
        addSimpleRow(sb, "lastName", student.getLastName(), COMMA);
        addSimpleRow(sb, "groupId", String.valueOf(student.getGroupId()), "");
        sb.append("}\n");
        return sb.toString();
    }

    private void addSimpleRow(
            StringBuilder stringBuilder,
            String propertyName,
            String propertyValue,
            String delimiter
    ) {
        stringBuilder.append("\t")
                .append(propertyName)
                .append("=")
                .append(propertyValue)
                .append(delimiter)
                .append("\n");
    }
}
