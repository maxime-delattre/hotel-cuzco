package hotel.cuzco.booking.domain;

import hotel.cuzco.middleware.events.EventHandler;

import java.text.MessageFormat;

public class ReservationMadeNotifier implements EventHandler<ReservationMade> {
    private static final String MAIL_SUBJECT = "Welcome to Hotel Cuzco";
    private final MailSender mailSender;

    public ReservationMadeNotifier(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void handle(ReservationMade event) {
        mailSender.send(event.getMainContact().getEmail(), MAIL_SUBJECT, mailBody(event));
    }

    private String mailBody(ReservationMade event) {
        String checkIn = event.getCheckIn().toString();
        String checkOut = event.getCheckOut().toString();
        String fullName = event.getMainContact().getFullName();
        ReservationId reservationId = event.getReservationId();
        String mailTemplate = "Dear {0}, \n" +
                "Thank you very much for choosing Hotel Cuzco for your stay in Cusco city " +
                "(from {1} to {2}).\n" +
                "Your reservation number is {3} .\n" +
                "Hotel Cuzco staff wish you a wonderful stay in our hotel.\n" +
                "Best regards!\n" +
                "Jose\n" +
                "Recepcion";
        return MessageFormat.format(mailTemplate, fullName, checkIn, checkOut, reservationId);
    }

    @Override
    public Class listenTo() {
        return ReservationMade.class;
    }
}