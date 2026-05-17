import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class AppointmentScheduler {
    private static final DateTimeFormatter APPOINTMENT_FORMATTER = 
        DateTimeFormatter.ofPattern("M/d/yyyy H:mm:ss", Locale.ENGLISH);
    private static final DateTimeFormatter DESCRIPTION_FORMATTER = 
        DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a", Locale.ENGLISH);

    public LocalDateTime schedule(String appointmentText) {
        return LocalDateTime.parse(appointmentText, APPOINTMENT_FORMATTER);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int appointmentHour = appointmentDate.getHour();
        return appointmentHour >= 12 && appointmentHour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        return "You have an appointment on " + DESCRIPTION_FORMATTER.format(appointmentDate) + ".";
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}