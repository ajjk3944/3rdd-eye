package pf;

import android.os.SystemClock;
import android.util.Log;
import androidx.media3.exoplayer.ExoPlayer;
import dd.h;
import hf.a0;
import io.sentry.cache.e;
import j9.d;
import j9.g;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f20475a;

    /* renamed from: b, reason: collision with root package name */
    public final double f20476b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20477c;

    /* renamed from: d, reason: collision with root package name */
    public final long f20478d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20479e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f20480f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f20481g;

    /* renamed from: h, reason: collision with root package name */
    public final cj.a f20482h;

    /* renamed from: i, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f20483i;
    public int j;
    public long k;

    public c(cj.a aVar, qf.b bVar, io.sentry.internal.debugmeta.c cVar) {
        double d6 = bVar.f20890d;
        double d10 = bVar.f20891e;
        this.f20475a = d6;
        this.f20476b = d10;
        this.f20477c = bVar.f20892f * 1000;
        this.f20482h = aVar;
        this.f20483i = cVar;
        this.f20478d = SystemClock.elapsedRealtime();
        int i10 = (int) d6;
        this.f20479e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f20480f = arrayBlockingQueue;
        this.f20481g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.f20477c);
        int iMin = this.f20480f.size() == this.f20479e ? Math.min(100, this.j + iCurrentTimeMillis) : Math.max(0, this.j - iCurrentTimeMillis);
        if (this.j != iMin) {
            this.j = iMin;
            this.k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(final hf.a aVar, final h hVar) {
        Log.isLoggable("FirebaseCrashlytics", 3);
        final boolean z10 = SystemClock.elapsedRealtime() - this.f20478d < ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
        this.f20482h.H(new j9.a(aVar.f10636a, d.HIGHEST, null), new g() { // from class: pf.b
            @Override // j9.g
            public final void a(Exception exc) throws Throwable {
                h hVar2 = hVar;
                if (exc != null) {
                    hVar2.b(exc);
                    return;
                }
                if (z10) {
                    boolean z11 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new e(this.f20471a, 19, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = a0.f10639a;
                    boolean z12 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long jNanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (z11) {
                                        Thread.currentThread().interrupt();
                                    }
                                    throw th;
                                }
                            } catch (InterruptedException unused) {
                                nanos = jNanoTime - System.nanoTime();
                                z12 = true;
                            }
                        }
                        if (z12) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z11 = z12;
                    }
                }
                hVar2.c(aVar);
            }
        });
    }
}
