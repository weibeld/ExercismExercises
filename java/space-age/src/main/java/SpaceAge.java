public class SpaceAge {

  private static final double EARTH_YEAR = 31_557_600;
  private static final double MERCURY_YEAR = 0.2408467 * EARTH_YEAR;
  private static final double VENUS_YEAR = 0.61519726 * EARTH_YEAR;
  private static final double MARS_YEAR = 1.8808158 * EARTH_YEAR;
  private static final double JUPITER_YEAR = 11.862615 * EARTH_YEAR;
  private static final double SATURN_YEAR = 29.447498 * EARTH_YEAR;
  private static final double URANUS_YEAR = 84.016846 * EARTH_YEAR;
  private static final double NEPTUNE_YEAR = 164.79132 * EARTH_YEAR;

  private long mSeconds;

  public SpaceAge(long seconds) {
    mSeconds = seconds;
  }

  public long getSeconds() {
    return mSeconds;
  }

  public double onEarth() {
    return mSeconds / EARTH_YEAR;
  }

  public double onMercury() {
    return mSeconds / MERCURY_YEAR;
  }

  public double onVenus() {
    return mSeconds / VENUS_YEAR;
  }

  public double onMars() {
    return mSeconds / MARS_YEAR;
  }

  public double onJupiter() {
    return mSeconds / JUPITER_YEAR;
  }

  public double onSaturn() {
    return mSeconds / SATURN_YEAR;
  }

  public double onUranus() {
    return mSeconds / URANUS_YEAR;
  }

  public double onNeptune() {
    return mSeconds / NEPTUNE_YEAR;
  }
}
