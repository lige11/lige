package com.lucifer.service.dto;

import com.lucifer.base.BaseDTO;
import com.lucifer.domain.TeachBuild;
import com.lucifer.domain.Teacher;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author lucifinil
 */
@Getter
@Setter
public class CollegeDto extends BaseDTO implements Serializable {

    private Long id;

    private String collegeNo;

    private String name;

    private TeachBuild teachBuild;

    private List<Teacher> teachers;

    private String remarks;
}
