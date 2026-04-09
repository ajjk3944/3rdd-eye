package speedtest;

/* loaded from: classes2.dex */
public interface SpeedtestParams {
    boolean durationInfinite();

    long durationMaxMillis();

    long durationMinMillis();

    TestServer getServer(long j10);

    boolean randomTxContent();

    long serverCount();
}
