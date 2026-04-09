package z7;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.hp;
import com.google.android.gms.internal.ads.j5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Supplier;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements e, Runnable, Comparable, u8.b {
    public static final x7.g H = new x7.g("glide_thread_priority_override", null, x7.g.f36999e);
    public volatile f A;
    public volatile boolean B;
    public volatile boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;

    /* renamed from: d, reason: collision with root package name */
    public final hp f38019d;

    /* renamed from: e, reason: collision with root package name */
    public final d4.c f38020e;

    /* renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.h f38022h;

    /* renamed from: i, reason: collision with root package name */
    public x7.e f38023i;
    public com.bumptech.glide.i j;

    /* renamed from: k, reason: collision with root package name */
    public q f38024k;

    /* renamed from: l, reason: collision with root package name */
    public int f38025l;

    /* renamed from: m, reason: collision with root package name */
    public int f38026m;

    /* renamed from: n, reason: collision with root package name */
    public j f38027n;

    /* renamed from: o, reason: collision with root package name */
    public x7.h f38028o;

    /* renamed from: p, reason: collision with root package name */
    public o f38029p;

    /* renamed from: q, reason: collision with root package name */
    public int f38030q;

    /* renamed from: r, reason: collision with root package name */
    public long f38031r;

    /* renamed from: s, reason: collision with root package name */
    public Object f38032s;

    /* renamed from: t, reason: collision with root package name */
    public o7.c f38033t;

    /* renamed from: u, reason: collision with root package name */
    public Supplier f38034u;

    /* renamed from: v, reason: collision with root package name */
    public Thread f38035v;

    /* renamed from: w, reason: collision with root package name */
    public x7.e f38036w;

    /* renamed from: x, reason: collision with root package name */
    public x7.e f38037x;

    /* renamed from: y, reason: collision with root package name */
    public Object f38038y;

    /* renamed from: z, reason: collision with root package name */
    public com.bumptech.glide.load.data.d f38039z;

    /* renamed from: a, reason: collision with root package name */
    public final g f38016a = new g();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f38017b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final u8.e f38018c = new u8.e();

    /* renamed from: f, reason: collision with root package name */
    public final w4.m f38021f = new w4.m();
    public final j5 g = new j5();

    public h(hp hpVar, i0.f fVar) {
        this.f38019d = hpVar;
        this.f38020e = fVar;
    }

    public final y a(com.bumptech.glide.load.data.d dVar, Object obj, int i4) {
        if (obj == null) {
            return null;
        }
        try {
            int i10 = t8.h.f34512b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            y yVarE = e(i4, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                i(jElapsedRealtimeNanos, "Decoded result " + yVarE, null);
            }
            return yVarE;
        } finally {
            dVar.b();
        }
    }

    @Override // z7.e
    public final void b(x7.e eVar, Exception exc, com.bumptech.glide.load.data.d dVar, int i4) {
        dVar.b();
        u uVar = new u("Fetching data failed", Collections.singletonList(exc));
        Class clsA = dVar.a();
        uVar.f38100b = eVar;
        uVar.f38101c = i4;
        uVar.f38102d = clsA;
        this.f38017b.add(uVar);
        if (Thread.currentThread() != this.f38035v) {
            o(2);
        } else {
            q();
        }
    }

    @Override // z7.e
    public final void c(x7.e eVar, Object obj, com.bumptech.glide.load.data.d dVar, int i4, x7.e eVar2) {
        this.f38036w = eVar;
        this.f38038y = obj;
        this.f38039z = dVar;
        this.G = i4;
        this.f38037x = eVar2;
        this.D = eVar != this.f38016a.a().get(0);
        if (Thread.currentThread() != this.f38035v) {
            o(3);
        } else {
            f();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        int iOrdinal = this.j.ordinal() - hVar.j.ordinal();
        return iOrdinal == 0 ? this.f38030q - hVar.f38030q : iOrdinal;
    }

    @Override // u8.b
    public final u8.e d() {
        return this.f38018c;
    }

    public final y e(int i4, Object obj) {
        Class<?> cls = obj.getClass();
        g gVar = this.f38016a;
        w wVarC = gVar.c(cls);
        x7.h hVar = this.f38028o;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z3 = i4 == 4 || gVar.f38015r;
            x7.g gVar2 = g8.o.f24587i;
            Boolean bool = (Boolean) hVar.c(gVar2);
            if (bool == null || (bool.booleanValue() && !z3)) {
                hVar = new x7.h();
                t8.c cVar = this.f38028o.f37004b;
                t8.c cVar2 = hVar.f37004b;
                cVar2.g(cVar);
                cVar2.put(gVar2, Boolean.valueOf(z3));
            }
        }
        x7.h hVar2 = hVar;
        com.bumptech.glide.load.data.f fVarH = this.f38022h.b().h(obj);
        try {
            return wVarC.a(this.f38025l, this.f38026m, fVarH, new t7.m(this, i4, 22), hVar2);
        } finally {
            fVarH.b();
        }
    }

    public final void f() throws SecurityException, IllegalArgumentException {
        y yVarA;
        boolean zA;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            i(this.f38031r, "Retrieved data", "data: " + this.f38038y + ", cache key: " + this.f38036w + ", fetcher: " + this.f38039z);
        }
        x xVar = null;
        if (((Map) this.f38033t.f30419b).containsKey(com.bumptech.glide.e.class) && (supplier = this.f38034u) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f38034u.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e2) {
                this.f38034u = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e2);
                }
            }
        }
        try {
            yVarA = a(this.f38039z, this.f38038y, this.G);
        } catch (u e10) {
            x7.e eVar = this.f38037x;
            int i4 = this.G;
            e10.f38100b = eVar;
            e10.f38101c = i4;
            e10.f38102d = null;
            this.f38017b.add(e10);
            yVarA = null;
        }
        if (yVarA == null) {
            q();
            return;
        }
        int i10 = this.G;
        boolean z3 = this.D;
        if (yVarA instanceof v) {
            ((v) yVarA).initialize();
        }
        if (((x) this.f38021f.f36444c) != null) {
            xVar = (x) x.f38107e.k();
            xVar.f38111d = false;
            xVar.f38110c = true;
            xVar.f38109b = yVarA;
            yVarA = xVar;
        }
        j(yVarA, i10, z3);
        this.E = 5;
        try {
            w4.m mVar = this.f38021f;
            if (((x) mVar.f36444c) != null) {
                hp hpVar = this.f38019d;
                x7.h hVar = this.f38028o;
                mVar.getClass();
                try {
                    hpVar.a().g((x7.e) mVar.f36442a, new w4.m((x7.k) mVar.f36443b, (x) mVar.f36444c, hVar));
                    ((x) mVar.f36444c).c();
                } catch (Throwable th2) {
                    ((x) mVar.f36444c).c();
                    throw th2;
                }
            }
            j5 j5Var = this.g;
            synchronized (j5Var) {
                j5Var.f12634b = true;
                zA = j5Var.a();
            }
            if (zA) {
                n();
            }
        } finally {
            if (xVar != null) {
                xVar.c();
            }
        }
    }

    public final f g() {
        int iC = i3.e.c(this.E);
        g gVar = this.f38016a;
        if (iC == 1) {
            return new z(gVar, this);
        }
        if (iC == 2) {
            return new c(gVar.a(), gVar, this);
        }
        if (iC == 3) {
            return new b0(gVar, this);
        }
        if (iC == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(r5.c.w(this.E)));
    }

    public final int h(int i4) {
        boolean z3;
        boolean z10;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            switch (this.f38027n.f38048a) {
                case 0:
                case 1:
                    z3 = false;
                    break;
                default:
                    z3 = true;
                    break;
            }
            if (z3) {
                return 2;
            }
            return h(2);
        }
        if (iC != 1) {
            if (iC == 2) {
                return 4;
            }
            if (iC == 3 || iC == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(r5.c.w(i4)));
        }
        switch (this.f38027n.f38048a) {
            case 0:
                z10 = false;
                break;
            case 1:
            default:
                z10 = true;
                break;
        }
        if (z10) {
            return 3;
        }
        return h(3);
    }

    public final void i(long j, String str, String str2) {
        StringBuilder sbB = i3.e.b(str, " in ");
        sbB.append(t8.h.a(j));
        sbB.append(", load key: ");
        sbB.append(this.f38024k);
        sbB.append(str2 != null ? ", ".concat(str2) : "");
        sbB.append(", thread: ");
        sbB.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbB.toString());
    }

    public final void j(y yVar, int i4, boolean z3) throws SecurityException, IllegalArgumentException {
        if (((Map) this.f38033t.f30419b).containsKey(com.bumptech.glide.e.class)) {
            p();
        }
        s();
        o oVar = this.f38029p;
        synchronized (oVar) {
            oVar.f38074n = yVar;
            oVar.f38075o = i4;
            oVar.f38082v = z3;
        }
        oVar.h();
    }

    public final void k() throws SecurityException, IllegalArgumentException {
        if (((Map) this.f38033t.f30419b).containsKey(com.bumptech.glide.e.class)) {
            p();
        }
        s();
        u uVar = new u("Failed to load resource", new ArrayList(this.f38017b));
        o oVar = this.f38029p;
        synchronized (oVar) {
            oVar.f38077q = uVar;
        }
        oVar.g();
        l();
    }

    public final void l() {
        boolean zA;
        j5 j5Var = this.g;
        synchronized (j5Var) {
            j5Var.f12635c = true;
            zA = j5Var.a();
        }
        if (zA) {
            n();
        }
    }

    public final void m() {
        boolean zA;
        j5 j5Var = this.g;
        synchronized (j5Var) {
            j5Var.f12633a = true;
            zA = j5Var.a();
        }
        if (zA) {
            n();
        }
    }

    public final void n() {
        j5 j5Var = this.g;
        synchronized (j5Var) {
            j5Var.f12634b = false;
            j5Var.f12633a = false;
            j5Var.f12635c = false;
        }
        w4.m mVar = this.f38021f;
        mVar.f36442a = null;
        mVar.f36443b = null;
        mVar.f36444c = null;
        g gVar = this.f38016a;
        gVar.f38002c = null;
        gVar.f38003d = null;
        gVar.f38011n = null;
        gVar.g = null;
        gVar.f38008k = null;
        gVar.f38007i = null;
        gVar.f38012o = null;
        gVar.j = null;
        gVar.f38013p = null;
        gVar.f38000a.clear();
        gVar.f38009l = false;
        gVar.f38001b.clear();
        gVar.f38010m = false;
        this.B = false;
        this.f38022h = null;
        this.f38023i = null;
        this.f38028o = null;
        this.j = null;
        this.f38024k = null;
        this.f38029p = null;
        this.E = 0;
        this.A = null;
        this.f38035v = null;
        this.f38036w = null;
        this.f38038y = null;
        this.G = 0;
        this.f38039z = null;
        this.f38031r = 0L;
        this.C = false;
        this.f38032s = null;
        this.f38017b.clear();
        this.f38020e.i(this);
    }

    public final void o(int i4) {
        this.F = i4;
        o oVar = this.f38029p;
        (oVar.f38073m ? oVar.f38070i : oVar.f38069h).execute(this);
    }

    public final void p() throws SecurityException, IllegalArgumentException {
        if (!((Map) this.f38033t.f30419b).containsKey(com.bumptech.glide.e.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.f38034u;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e2) {
            this.f38034u = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e2);
            }
        }
    }

    public final void q() throws SecurityException, IllegalArgumentException {
        this.f38035v = Thread.currentThread();
        int i4 = t8.h.f34512b;
        this.f38031r = SystemClock.elapsedRealtimeNanos();
        boolean zA = false;
        while (!this.C && this.A != null && !(zA = this.A.a())) {
            this.E = h(this.E);
            this.A = g();
            if (this.E == 4) {
                o(2);
                return;
            }
        }
        if ((this.E == 6 || this.C) && !zA) {
            k();
        }
    }

    public final void r() throws SecurityException, IllegalArgumentException {
        int iC = i3.e.c(this.F);
        if (iC == 0) {
            this.E = h(1);
            this.A = g();
            q();
        } else if (iC == 1) {
            q();
        } else if (iC == 2) {
            f();
        } else {
            int i4 = this.F;
            throw new IllegalStateException("Unrecognized run reason: ".concat(i4 != 1 ? i4 != 2 ? i4 != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.d dVar = this.f38039z;
        try {
            try {
                if (this.C) {
                    k();
                    if (dVar != null) {
                        dVar.b();
                        return;
                    }
                    return;
                }
                r();
                if (dVar != null) {
                    dVar.b();
                }
            } catch (b e2) {
                throw e2;
            } catch (Throwable th2) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.C + ", stage: " + r5.c.w(this.E), th2);
                }
                if (this.E != 5) {
                    this.f38017b.add(th2);
                    k();
                }
                if (!this.C) {
                    throw th2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (dVar != null) {
                dVar.b();
            }
            throw th3;
        }
    }

    public final void s() {
        this.f38018c.a();
        if (this.B) {
            throw new IllegalStateException("Already notified", this.f38017b.isEmpty() ? null : (Throwable) je.u.p(1, this.f38017b));
        }
        this.B = true;
    }
}
