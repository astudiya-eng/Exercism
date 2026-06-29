import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private final LocalDateTime resultDataTime;
    public Gigasecond(LocalDate moment) {
        this.resultDataTime = moment.atStartOfDay().plusSeconds(1_000_000_000);
    }

    public Gigasecond(LocalDateTime moment) {
        this.resultDataTime = moment.plusSeconds(1_000_000_000);
    }

    public LocalDateTime getDateTime() {
        return this.resultDataTime;
    }
}
