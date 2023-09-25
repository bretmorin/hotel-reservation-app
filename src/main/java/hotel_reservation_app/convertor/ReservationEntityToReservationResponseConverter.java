package hotel_reservation_app.convertor;


import hotel_reservation_app.entity.ReservationEntity;
import hotel_reservation_app.model.response.ReservationResponse;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ReservationEntityToReservationResponseConverter implements Converter<ReservationEntity, ReservationResponse> {

    @Override
    public ReservationResponse convert(ReservationEntity source) {

        ReservationResponse reservationResponse = new ReservationResponse();
        reservationResponse.setCheckin(source.getCheckin());
        reservationResponse.setCheckout(source.getCheckout());

        if (null != source.getRoomEntity())
            reservationResponse.setId(source.getRoomEntity().getId());

        return reservationResponse;
    }
}