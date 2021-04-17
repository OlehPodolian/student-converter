package com.oleh.converter.impl;

import com.oleh.converter.IStudentStringConverter;
import com.oleh.domain.Student;

public class JsonStudentStringConverter implements IStudentStringConverter {

    public static final String COMMA = ",";

    @Override
    public String convert(Student student) {
        StringBuilder sb = new StringBuilder("{\n");
        addJsonRow(sb, "id", String.valueOf(student.getId()), COMMA);
        addJsonRow(sb, "firstName", student.getFirstName(), COMMA);
        addJsonRow(sb, "lastName", student.getLastName(), COMMA);
        addJsonRow(sb, "groupId", String.valueOf(student.getGroupId()), "");
        sb.append("}\n");
        return sb.toString();
    }

    private void addJsonRow(
            StringBuilder stringBuilder,
            String propertyName,
            String propertyValue,
            String delimiter
    ) {
        stringBuilder.append("\t\"")
                .append(propertyName)
                .append("\" : \"")
                .append(propertyValue)
                .append("\"")
                .append(delimiter)
                .append("\n");
    }
}
