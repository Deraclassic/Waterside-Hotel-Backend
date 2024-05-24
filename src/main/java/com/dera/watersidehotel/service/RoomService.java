package com.dera.watersidehotel.service;

import com.dera.watersidehotel.model.Room;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

public interface RoomService {
    Room addNewRoom(MultipartFile file, String roomType, BigDecimal roomPrice);
}
