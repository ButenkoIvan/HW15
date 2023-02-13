package com.HW15.HW15;

import lombok.Builder;
import lombok.Data;

@Data
public class NoteDto {
    private long id;
    private String title;
    private String content;

    public static NoteDto fromNote(Note note) {
        NoteDto res = new NoteDto();
        res.setId(note.getId());
        res.setTitle(note.getTitle());
        res.setContent(note.getContent());
        return res;
    }

    public Note toNote(){
        Note note = new Note();
        note.setId(id);
        note.setTitle(title);
        note.setContent(content);
        return note;
    }
}
