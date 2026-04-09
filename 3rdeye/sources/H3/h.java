package h3;

import android.os.SystemClock;

/* compiled from: LogTime.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final double f38206a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f38207b = 0;

    public static double a(long j4) {
        return (SystemClock.elapsedRealtimeNanos() - j4) * f38206a;
    }
}
