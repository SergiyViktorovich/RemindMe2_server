package com.svdesign.remindme.server.service;

import com.svdesign.remindme.server.entity.Remind;

import java.util.List;

public interface ReminderService {

    List<Remind> getAll();
    Remind getById(long id);
    Remind save(Remind remind);
    void remove(long id);

}
