package cf;

import a5.o;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f3704e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f3705a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f3706b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3707c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f3708d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f3706b = str;
        this.f3707c = i10;
        this.f3708d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f3704e.newThread(new o(this, 6, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f3706b + " Thread #" + this.f3705a.getAndIncrement());
        return threadNewThread;
    }
}
