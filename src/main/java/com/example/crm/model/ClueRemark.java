package com.example.crm.model;

public class ClueRemark {
    private String id;

    private String notePerson;

    private String noteContent;

    private String noteTime;

    private String editPerson;

    private String editTime;

    private Integer editFlag;

    private String clueId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNotePerson() {
        return notePerson;
    }

    public void setNotePerson(String notePerson) {
        this.notePerson = notePerson;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public String getNoteTime() {
        return noteTime;
    }

    public void setNoteTime(String noteTime) {
        this.noteTime = noteTime;
    }

    public String getEditPerson() {
        return editPerson;
    }

    public void setEditPerson(String editPerson) {
        this.editPerson = editPerson;
    }

    public String getEditTime() {
        return editTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public Integer getEditFlag() {
        return editFlag;
    }

    public void setEditFlag(Integer editFlag) {
        this.editFlag = editFlag;
    }

    public String getClueId() {
        return clueId;
    }

    public void setClueId(String clueId) {
        this.clueId = clueId;
    }
}