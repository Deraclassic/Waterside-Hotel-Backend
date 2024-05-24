package com.dera.watersidehotel.service.impl;

import com.dera.watersidehotel.model.BookedRoom;

import java.math.BigDecimal;
import java.util.List;

public class BookRoomServiceImpl {

    private Long id;

    private String roomType;

    private BigDecimal roomPrice;

    private Boolean isBooked = false;

    private List<BookedRoom> bookings;
}
