package ee;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f23392e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f23393a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f23394b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23395c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f23396d;

    public a(String str, int i4, StrictMode.ThreadPolicy threadPolicy) {
        this.f23394b = str;
        this.f23395c = i4;
        this.f23396d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f23392e.newThread(new aj.d(14, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f23394b + " Thread #" + this.f23393a.getAndIncrement());
        return threadNewThread;
    }
}
