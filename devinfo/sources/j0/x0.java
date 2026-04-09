package j0;

import android.os.Trace;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27008a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.f f27009b;

    /* renamed from: c, reason: collision with root package name */
    public final mk.c f27010c;

    /* renamed from: d, reason: collision with root package name */
    public d3.a f27011d;

    /* renamed from: e, reason: collision with root package name */
    public g2.a1 f27012e;

    /* renamed from: f, reason: collision with root package name */
    public g2.z0 f27013f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27014h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f27015i;
    public Object j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f27016k;

    /* renamed from: l, reason: collision with root package name */
    public w0 f27017l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f27018m;

    /* renamed from: n, reason: collision with root package name */
    public long f27019n;

    /* renamed from: o, reason: collision with root package name */
    public long f27020o;

    /* renamed from: p, reason: collision with root package name */
    public long f27021p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f27022q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b5.i0 f27023r;

    public x0(b5.i0 i0Var, int i4, i0.f fVar, b7.w wVar) {
        this.f27023r = i0Var;
        this.f27008a = i4;
        this.f27009b = fVar;
        this.f27010c = wVar;
        int i10 = wk.d.f36825b;
        this.f27021p = System.nanoTime() - wk.d.f36824a;
    }

    @Override // j0.l0
    public final void a() {
        this.f27018m = true;
    }

    public final void b() {
        g2.z0 z0Var = this.f27013f;
        if (z0Var != null) {
            z0Var.cancel();
        }
        this.f27013f = null;
        g2.a1 a1Var = this.f27012e;
        if (a1Var != null) {
            a1Var.a();
        }
        this.f27012e = null;
        this.f27017l = null;
    }

    public final boolean c(i.f0 f0Var) {
        boolean zD;
        if (!this.f27023r.f1820a) {
            return false;
        }
        if (this.f27018m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(f0Var);
            } finally {
                Trace.endSection();
            }
        } else {
            zD = d(f0Var);
        }
        a4.l.o(-1L, "compose:lazy:prefetch:execute:item");
        return zD;
    }

    @Override // j0.l0
    public final void cancel() {
        if (this.f27014h) {
            return;
        }
        this.f27014h = true;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0217  */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(i.f0 r26) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.x0.d(i.f0):boolean");
    }

    public final boolean e() {
        g2.z0 z0Var;
        return this.f27015i || ((z0Var = this.f27013f) != null && z0Var.b());
    }

    public final void f(long j) {
        if (this.f27014h) {
            f0.a.a("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.g) {
            f0.a.a("Request was already measured!");
        }
        this.g = true;
        g2.a1 a1Var = this.f27012e;
        if (a1Var == null) {
            f0.a.b("performComposition() must be called before performMeasure()");
            throw new ac.m();
        }
        int iB = a1Var.b();
        for (int i4 = 0; i4 < iB; i4++) {
            a1Var.d(i4, j);
        }
    }

    public final void g(Object obj, Object obj2, b bVar) {
        g2.z0 iVar;
        g2.z0 z0Var = this.f27013f;
        if (z0Var == null) {
            b5.i0 i0Var = this.f27023r;
            mk.e eVarA = ((b0) i0Var.f1821b).a(this.f27008a, obj, obj2);
            g2.f0 f0VarA = ((g2.c1) i0Var.f1822c).a();
            if (f0VarA.f24329a.H()) {
                f0VarA.k(obj, eVarA, true);
                iVar = new yb.i(f0VarA, false, obj, 19);
            } else {
                iVar = new y4.a(f0VarA, obj);
            }
            z0Var = iVar;
            this.f27013f = z0Var;
            this.j = obj;
        }
        this.f27022q = false;
        while (!z0Var.b() && !this.f27022q) {
            z0Var.i(new com.applovin.impl.sdk.ad.f(6, this, bVar));
        }
        j();
        if (this.f27022q) {
            bVar.f26863b = b.a(this.f27020o, bVar.f26863b);
        } else {
            bVar.f26862a = b.a(this.f27020o, bVar.f26862a);
        }
    }

    public final w0 h() {
        g2.a1 a1Var = this.f27012e;
        if (a1Var == null) {
            f0.a.b("Should precompose before resolving nested prefetch states");
            throw new ac.m();
        }
        nk.u uVar = new nk.u();
        a1Var.c(new b7.u(13, uVar));
        List list = (List) uVar.f29986a;
        if (list != null) {
            return new w0(this, list);
        }
        return null;
    }

    public final boolean i(long j, long j8) {
        if (this.f27018m) {
            j8 = 0;
        }
        return j > j8;
    }

    public final void j() {
        int i4 = wk.d.f36825b;
        long jNanoTime = System.nanoTime() - wk.d.f36824a;
        long j = this.f27021p;
        wk.c cVar = wk.c.NANOSECONDS;
        nk.k.e(cVar, "unit");
        long jE = 0;
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            if (jNanoTime == j) {
                int i10 = wk.a.f36814d;
            } else {
                jE = wk.a.g(j < 0 ? wk.a.f36813c : wk.a.f36812b);
            }
        } else if (((jNanoTime - 1) | 1) == Long.MAX_VALUE) {
            jE = jNanoTime < 0 ? wk.a.f36813c : wk.a.f36812b;
        } else {
            long j8 = jNanoTime - j;
            if (((~(j8 ^ j)) & (j8 ^ jNanoTime)) < 0) {
                wk.c cVar2 = wk.c.MILLISECONDS;
                if (cVar.compareTo(cVar2) < 0) {
                    long jO = com.bumptech.glide.e.o(1L, cVar2, cVar);
                    long j9 = (jNanoTime / jO) - (j / jO);
                    long j10 = (jNanoTime % jO) - (j % jO);
                    int i11 = wk.a.f36814d;
                    jE = wk.a.e(com.bumptech.glide.d.E(j9, cVar2), com.bumptech.glide.d.E(j10, cVar));
                } else {
                    jE = wk.a.g(j8 < 0 ? wk.a.f36813c : wk.a.f36812b);
                }
            } else {
                jE = com.bumptech.glide.d.E(j8, cVar);
            }
        }
        long j11 = jE >> 1;
        int i12 = wk.a.f36814d;
        long j12 = (1 & ((int) jE)) == 0 ? j11 : j11 > 9223372036854L ? Long.MAX_VALUE : j11 < -9223372036854L ? Long.MIN_VALUE : j11 * 1000000;
        this.f27020o = j12;
        long j13 = this.f27019n - j12;
        this.f27019n = j13;
        this.f27021p = jNanoTime;
        a4.l.o(j13, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.f27008a + ", constraints = " + this.f27011d + ", isComposed = " + e() + ", isMeasured = " + this.g + ", isCanceled = " + this.f27014h + " }";
    }
}
