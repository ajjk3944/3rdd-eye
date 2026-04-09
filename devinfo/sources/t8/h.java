package t8;

import android.os.SystemClock;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final double f34511a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f34512b = 0;

    public static double a(long j) {
        return (SystemClock.elapsedRealtimeNanos() - j) * f34511a;
    }
}
