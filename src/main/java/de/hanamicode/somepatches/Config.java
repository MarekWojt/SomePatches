package de.hanamicode.somepatches;

public class Config {
  private static int readTimeout = 50; // secs
  private static int keepAliveInterval = 5000; // millis
  public static int getReadTimeoutMillis() {
    return readTimeout * 1000;
  }

  public static int getReadTimeout() {
    return readTimeout;
  }

  public static int getKeepAliveInterval() {
    return keepAliveInterval;
  }
}
