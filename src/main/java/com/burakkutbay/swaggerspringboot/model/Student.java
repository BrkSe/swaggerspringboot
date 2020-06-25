package com.burakkutbay.swaggerspringboot.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by hasanburakkutbay on 25.06.2020.
 */
public class Student {
    @ApiModelProperty(notes = "The database generated Stdudent ID")
    private int id;
    @ApiModelProperty(notes = "The database generated Stdudent Number")
    private long stdnumber;
    @ApiModelProperty(notes = "The database generated Student Name")
    private String name;
    @ApiModelProperty(notes = "The database generated Student Lastname")
    private String lastName;

    public Student(int id, long stdnumber, String name, String lastName) {
        this.id = id;
        this.stdnumber = stdnumber;
        this.name = name;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getStdnumber() {
        return stdnumber;
    }

    public void setStdnumber(long stdnumber) {
        this.stdnumber = stdnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
