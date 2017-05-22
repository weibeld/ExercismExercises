import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Gigasecond {

  private static final long OFFSET = 1_000_000_000L;
  private LocalDateTime mFutureDate;

  public Gigasecond(LocalDate date) {
    mFutureDate = addGigasecond(date.atStartOfDay());
  }

  public Gigasecond(LocalDateTime dateTime) {
    mFutureDate = addGigasecond(dateTime);
  }

  private LocalDateTime addGigasecond(LocalDateTime startDate) {
    return startDate.plus(OFFSET, ChronoUnit.SECONDS);
  }

  public LocalDateTime getDate() {
    return mFutureDate;
  }

}
