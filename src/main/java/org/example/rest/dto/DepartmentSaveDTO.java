package org.example.rest.dto;

import lombok.Data;

@Data
public class DepartmentSaveDTO {
    private String departmentName;
    private int managerId;
    private int locationId;
}
