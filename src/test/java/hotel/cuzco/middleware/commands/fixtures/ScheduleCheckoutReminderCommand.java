package hotel.cuzco.middleware.commands.fixtures;

import common.ddd.patterns.Command;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ScheduleCheckoutReminderCommand implements Command {
    private LocalDate checkOutDate;

    public ScheduleCheckoutReminderCommand(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
}
