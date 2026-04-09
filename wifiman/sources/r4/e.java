package R4;

import I4.g;
import a3.AbstractC3755c;
import a3.EnumC3757e;
import a3.InterfaceC3760h;
import a3.j;
import android.os.SystemClock;
import c3.AbstractC4211l;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.D;
import com.google.firebase.crashlytics.internal.common.Q;
import com.google.firebase.crashlytics.internal.common.i0;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final double f19569a;

    /* renamed from: b, reason: collision with root package name */
    private final double f19570b;

    /* renamed from: c, reason: collision with root package name */
    private final long f19571c;

    /* renamed from: d, reason: collision with root package name */
    private final long f19572d;

    /* renamed from: e, reason: collision with root package name */
    private final int f19573e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue f19574f;

    /* renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f19575g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3760h f19576h;

    /* renamed from: i, reason: collision with root package name */
    private final Q f19577i;

    /* renamed from: j, reason: collision with root package name */
    private int f19578j;

    /* renamed from: k, reason: collision with root package name */
    private long f19579k;

    private final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final D f19580a;

        /* renamed from: b, reason: collision with root package name */
        private final TaskCompletionSource f19581b;

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            e.this.p(this.f19580a, this.f19581b);
            e.this.f19577i.c();
            double dG = e.this.g();
            g.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dG / 1000.0d)) + " s for report: " + this.f19580a.d());
            e.q(dG);
        }

        private b(D d10, TaskCompletionSource taskCompletionSource) {
            this.f19580a = d10;
            this.f19581b = taskCompletionSource;
        }
    }

    e(InterfaceC3760h interfaceC3760h, S4.d dVar, Q q10) {
        this(dVar.f20255f, dVar.f20256g, dVar.f20257h * 1000, interfaceC3760h, q10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f19569a) * Math.pow(this.f19570b, h()));
    }

    private int h() {
        if (this.f19579k == 0) {
            this.f19579k = o();
        }
        int iO = (int) ((o() - this.f19579k) / this.f19571c);
        int iMin = l() ? Math.min(100, this.f19578j + iO) : Math.max(0, this.f19578j - iO);
        if (this.f19578j != iMin) {
            this.f19578j = iMin;
            this.f19579k = o();
        }
        return iMin;
    }

    private boolean k() {
        return this.f19574f.size() < this.f19573e;
    }

    private boolean l() {
        return this.f19574f.size() == this.f19573e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            AbstractC4211l.a(this.f19576h, EnumC3757e.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(TaskCompletionSource taskCompletionSource, boolean z10, D d10, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z10) {
            j();
        }
        taskCompletionSource.trySetResult(d10);
    }

    private long o() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(final D d10, final TaskCompletionSource taskCompletionSource) {
        g.f().b("Sending report through Google DataTransport: " + d10.d());
        final boolean z10 = SystemClock.elapsedRealtime() - this.f19572d < 2000;
        this.f19576h.a(AbstractC3755c.g(d10.b()), new j() { // from class: R4.c
            @Override // a3.j
            public final void a(Exception exc) {
                this.f19563a.n(taskCompletionSource, z10, d10, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(double d10) throws InterruptedException {
        try {
            Thread.sleep((long) d10);
        } catch (InterruptedException unused) {
        }
    }

    TaskCompletionSource i(D d10, boolean z10) {
        synchronized (this.f19574f) {
            try {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                if (!z10) {
                    p(d10, taskCompletionSource);
                    return taskCompletionSource;
                }
                this.f19577i.b();
                if (!k()) {
                    h();
                    g.f().b("Dropping report due to queue being full: " + d10.d());
                    this.f19577i.a();
                    taskCompletionSource.trySetResult(d10);
                    return taskCompletionSource;
                }
                g.f().b("Enqueueing report: " + d10.d());
                g.f().b("Queue size: " + this.f19574f.size());
                this.f19575g.execute(new b(d10, taskCompletionSource));
                g.f().b("Closing task for report: " + d10.d());
                taskCompletionSource.trySetResult(d10);
                return taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: R4.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f19567a.m(countDownLatch);
            }
        }).start();
        i0.c(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    e(double d10, double d11, long j10, InterfaceC3760h interfaceC3760h, Q q10) {
        this.f19569a = d10;
        this.f19570b = d11;
        this.f19571c = j10;
        this.f19576h = interfaceC3760h;
        this.f19577i = q10;
        this.f19572d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f19573e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f19574f = arrayBlockingQueue;
        this.f19575g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f19578j = 0;
        this.f19579k = 0L;
    }
}
