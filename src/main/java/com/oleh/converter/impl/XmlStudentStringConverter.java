package com.oleh.converter.impl;

import com.oleh.converter.IStudentStringConverter;
import com.oleh.domain.Student;

public class XmlStudentStringConverter implements IStudentStringConverter {

    @Override
    public String convert(Student student) {
        StringBuilder sb = new StringBuilder("<student>\n");
        addXmlRow(sb, "id", String.valueOf(student.getId()));
        addXmlRow(sb, "firstName", student.getFirstName());
        addXmlRow(sb, "lastName", student.getLastName());
        addXmlRow(sb, "groupId", String.valueOf(student.getGroupId()));
        sb.append("</student>\n");
        return sb.toString();
    }


    private void addXmlRow(
            StringBuilder stringBuilder,
            String propertyName,
            String propertyValue
    ) {
        stringBuilder.append("\t<")
                .append(propertyName)
                .append(">")
                .append(propertyValue)
                .append("</")
                .append(propertyName)
                .append(">\n");
    }
}
