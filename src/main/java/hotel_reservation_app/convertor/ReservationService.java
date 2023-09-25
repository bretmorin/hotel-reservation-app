package hotel_reservation_app.convertor;

import hotel_reservation_app.entity.ReservationEntity;

import java.util.List;

public interface ReservationService {
    public ReservationEntity findLast();
    public List<ReservationEntity> findAll();
}
