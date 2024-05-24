package com.dera.watersidehotel.service;

import com.dera.watersidehotel.model.Room;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

public interface RoomService {
    Room addNewRoom(MultipartFile file, String roomType, BigDecimal roomPrice) throws SQLException, IOException;
}
