package com.dera.watersidehotel.repository;

import com.dera.watersidehotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
