package com.arcyrux.planificador;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

@Dao
public interface WayPointDao {

    @Insert
    void AddPoint(WayPoint waypoint);
}
