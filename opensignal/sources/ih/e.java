package ih;

import android.net.TrafficStats;
import android.os.AsyncTask;
import android.os.SystemClock;
import ch.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Timer;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class e {
    public static final Random C = new Random();
    public final long A;
    public final long B;

    /* renamed from: a, reason: collision with root package name */
    public ag.b f11368a;

    /* renamed from: b, reason: collision with root package name */
    public final dh.e f11369b;

    /* renamed from: c, reason: collision with root package name */
    public m f11370c;

    /* renamed from: h, reason: collision with root package name */
    public int f11375h;

    /* renamed from: i, reason: collision with root package name */
    public long f11376i;
    public long j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f11377l;

    /* renamed from: m, reason: collision with root package name */
    public final long f11378m;

    /* renamed from: n, reason: collision with root package name */
    public CyclicBarrier f11379n;

    /* renamed from: o, reason: collision with root package name */
    public long f11380o;

    /* renamed from: p, reason: collision with root package name */
    public long f11381p;

    /* renamed from: q, reason: collision with root package name */
    public Timer f11382q;

    /* renamed from: r, reason: collision with root package name */
    public final long f11383r;

    /* renamed from: s, reason: collision with root package name */
    public fm.b f11384s;

    /* renamed from: t, reason: collision with root package name */
    public mi.f f11385t;

    /* renamed from: u, reason: collision with root package name */
    public mi.f f11386u;

    /* renamed from: w, reason: collision with root package name */
    public Boolean f11388w;

    /* renamed from: y, reason: collision with root package name */
    public final long f11390y;

    /* renamed from: z, reason: collision with root package name */
    public final long f11391z;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f11371d = false;

    /* renamed from: e, reason: collision with root package name */
    public AtomicBoolean f11372e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public AtomicBoolean f11373f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public AtomicBoolean f11374g = new AtomicBoolean(false);

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f11387v = new AtomicBoolean(false);

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f11389x = new ArrayList();

    public e(long j, int i10, dh.e eVar) {
        long jMin = Math.min(j, 15000L);
        this.f11378m = jMin;
        this.f11375h = i10;
        this.f11369b = eVar;
        this.f11383r = jMin + 1000;
        this.f11390y = eVar.A * 1000;
        this.f11391z = eVar.B * 1000;
        this.A = eVar.G;
        this.B = eVar.H;
    }

    public static void j(String str, wh.b bVar) {
        rk.j jVar = new rk.j();
        jVar.f21635b = new WeakReference(bVar);
        jVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, str);
    }

    public final synchronized void a(Thread thread) {
        this.f11389x.add(thread);
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [ih.c, mi.f] */
    public final void b(d dVar) {
        if (this.f11371d) {
            return;
        }
        this.f11371d = true;
        if (dVar == d.DOWNLOAD) {
            this.f11370c.a(SystemClock.elapsedRealtime() - this.k);
            this.f11370c.b(this.f11380o);
        } else if (dVar == d.UPLOAD) {
            this.f11370c.e(SystemClock.elapsedRealtime() - this.k);
            this.f11370c.f(this.f11380o);
            this.f11370c.c(SystemClock.elapsedRealtime() - this.k);
            this.f11370c.d(this.f11381p);
            n.b("BaseSpeedTest", "[UPLOAD] Test finished");
        }
        d();
        i();
        f();
        g("STOP", null);
        ?? r52 = this.f11385t;
        if (r52 == 0) {
            return;
        }
        r52.e();
    }

    public final void c(d dVar, m mVar) {
        this.f11370c = mVar;
        g("START", null);
        d dVar2 = d.DOWNLOAD;
        if (dVar == dVar2) {
            m mVar2 = this.f11370c;
            mVar2.f11421o = this.f11375h;
            mVar2.B = this.f11378m;
        }
        if (dVar == d.UPLOAD) {
            m mVar3 = this.f11370c;
            mVar3.f11422p = this.f11375h;
            mVar3.C = this.f11378m;
        }
        this.f11371d = false;
        this.f11372e = new AtomicBoolean(false);
        this.f11373f = new AtomicBoolean(false);
        this.f11374g = new AtomicBoolean(false);
        this.k = 0L;
        this.f11380o = 0L;
        this.f11381p = 0L;
        i();
        dh.e eVar = this.f11369b;
        boolean z10 = (dVar == dVar2 || k()) ? this.f11372e.get() : this.f11373f.get();
        this.f11382q.schedule(new a(this, z10), dVar == dVar2 ? eVar.f7355l : eVar.f7356m);
    }

    public final synchronized void d() {
        try {
            n.b("BaseSpeedTest", "interruptThreads() called");
            Iterator it = this.f11389x.iterator();
            while (it.hasNext()) {
                ((Thread) it.next()).interrupt();
            }
            this.f11389x.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean e(d dVar) {
        int i10 = b.f11366a[dVar.ordinal()];
        dh.e eVar = this.f11369b;
        if (i10 != 1) {
            if (i10 == 2 && eVar.B > 0) {
                return (b.f11367b[this.f11370c.f11423q.ordinal()] != 1 ? this.f11381p : this.f11380o) >= this.f11391z;
            }
        } else if (eVar.A > 0 && this.f11380o >= this.f11390y) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ih.c, mi.f] */
    public final void f() {
        ?? r02 = this.f11385t;
        if (r02 == 0) {
            return;
        }
        r02.a(this.f11370c);
    }

    public final void g(String str, fh.d[] dVarArr) {
        mi.f fVar = this.f11386u;
        if (fVar != null) {
            fVar.q(str, dVarArr);
        }
    }

    public final void h(Exception exc) {
        mi.f fVar = this.f11386u;
        if (fVar != null) {
            fVar.r(exc, null);
        }
    }

    public final void i() {
        Timer timer = this.f11382q;
        if (timer != null) {
            timer.cancel();
        }
        this.f11382q = new Timer();
    }

    public final boolean k() {
        if (this.f11388w == null) {
            if (this.f11368a == null) {
                this.f11368a = new ag.b(16, (byte) 0);
            }
            ag.b bVar = this.f11368a;
            int i10 = bVar.f345d;
            if (((AtomicBoolean) bVar.f346g) == null) {
                bVar.f346g = new AtomicBoolean((TrafficStats.getUidRxBytes(i10) == -1 || TrafficStats.getUidTxBytes(i10) == -1) ? false : true);
            }
            this.f11388w = Boolean.valueOf(((AtomicBoolean) bVar.f346g).get());
            n.b("BaseSpeedTest", "TrafficStats monitoring supported?: " + this.f11388w);
        }
        return this.f11388w.booleanValue();
    }

    public final boolean l(d dVar) {
        m mVar = this.f11370c;
        if (mVar == null) {
            return false;
        }
        d dVar2 = d.DOWNLOAD;
        long j = this.f11383r;
        if (dVar == dVar2) {
            return mVar.f11426t > j;
        }
        if (dVar == d.UPLOAD) {
            return (k() ? this.f11370c.f11427u : this.f11370c.f11428v) > j;
        }
        return false;
    }
}
