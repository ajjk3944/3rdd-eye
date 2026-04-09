package U4;

import O4.C1471q;
import O4.H;
import O4.U;
import Q4.f0;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import v3.C5675a;
import v3.e;
import v3.h;
import v3.j;
import y3.t;

/* compiled from: ReportQueue.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f12476a;

    /* renamed from: b, reason: collision with root package name */
    public final double f12477b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12478c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12479d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12480e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f12481f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f12482g;

    /* renamed from: h, reason: collision with root package name */
    public final h<f0> f12483h;
    public final C1471q i;

    /* renamed from: j, reason: collision with root package name */
    public int f12484j;

    /* renamed from: k, reason: collision with root package name */
    public long f12485k;

    /* compiled from: ReportQueue.java */
    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final H f12486b;

        /* renamed from: c, reason: collision with root package name */
        public final TaskCompletionSource<H> f12487c;

        public a(H h10, TaskCompletionSource taskCompletionSource) {
            this.f12486b = h10;
            this.f12487c = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public final void run() throws InterruptedException {
            TaskCompletionSource<H> taskCompletionSource = this.f12487c;
            c cVar = c.this;
            H h10 = this.f12486b;
            cVar.b(h10, taskCompletionSource);
            ((AtomicInteger) cVar.i.f10323c).set(0);
            double dMin = Math.min(3600000.0d, Math.pow(cVar.f12477b, cVar.a()) * (60000.0d / cVar.f12476a));
            String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + h10.c();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                Thread.sleep((long) dMin);
            } catch (InterruptedException unused) {
            }
        }
    }

    public c(h<f0> hVar, V4.b bVar, C1471q c1471q) {
        double d10 = bVar.f12924d;
        this.f12476a = d10;
        this.f12477b = bVar.f12925e;
        this.f12478c = bVar.f12926f * 1000;
        this.f12483h = hVar;
        this.i = c1471q;
        this.f12479d = SystemClock.elapsedRealtime();
        int i = (int) d10;
        this.f12480e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f12481f = arrayBlockingQueue;
        this.f12482g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f12484j = 0;
        this.f12485k = 0L;
    }

    public final int a() {
        if (this.f12485k == 0) {
            this.f12485k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f12485k) / this.f12478c);
        int iMin = this.f12481f.size() == this.f12480e ? Math.min(100, this.f12484j + iCurrentTimeMillis) : Math.max(0, this.f12484j - iCurrentTimeMillis);
        if (this.f12484j != iMin) {
            this.f12484j = iMin;
            this.f12485k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(final H h10, final TaskCompletionSource<H> taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + h10.c();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        final boolean z10 = SystemClock.elapsedRealtime() - this.f12479d < 2000;
        ((t) this.f12483h).a(new C5675a(h10.a(), e.HIGHEST, null), new j() { // from class: U4.b
            @Override // v3.j
            public final void b(Exception exc) throws Throwable {
                c cVar = this.f12472b;
                cVar.getClass();
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (exc != null) {
                    taskCompletionSource2.trySetException(exc);
                    return;
                }
                if (z10) {
                    boolean z11 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new B.a(8, cVar, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = U.f10289a;
                    boolean z12 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long jNanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    nanos = jNanoTime - System.nanoTime();
                                    z12 = true;
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (z11) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z12) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z11 = z12;
                    }
                }
                taskCompletionSource2.trySetResult(h10);
            }
        });
    }
}
