package com.arcyrux.planificador;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {WayPoint.class}, version = 1)
public abstract class WayPointRoomDatabse extends RoomDatabase {

    public abstract WayPoint getWayPoint();

    private static volatile WayPointRoomDatabse wayPointRoomInstance;

    static WayPointRoomDatabse getDatabase(final Context context){
        if(wayPointRoomInstance == null){
            synchronized (WayPointRoomDatabse.class){
                if(wayPointRoomInstance== null){
                    wayPointRoomInstance = Room.databaseBuilder(context.getApplicationContext(),
                            WayPointRoomDatabse.class, "wayPoint_database")
                            .build();
                }
            }
        }
        return wayPointRoomInstance;
    }
}
