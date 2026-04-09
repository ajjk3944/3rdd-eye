package o5;

import android.net.Uri;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import lf.t1;

/* loaded from: classes.dex */
public final class m0 implements r5.k {
    public volatile boolean B;
    public long E;
    public b5.k F;
    public w0 G;
    public boolean H;
    public final /* synthetic */ p0 I;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f18994a;

    /* renamed from: d, reason: collision with root package name */
    public final b5.a0 f18995d;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.k f18996g;

    /* renamed from: r, reason: collision with root package name */
    public final p0 f18997r;

    /* renamed from: x, reason: collision with root package name */
    public final a5.d f18998x;

    /* renamed from: y, reason: collision with root package name */
    public final ca.n f18999y = new ca.n();
    public boolean D = true;

    public m0(p0 p0Var, Uri uri, b5.h hVar, io.sentry.k kVar, p0 p0Var2, a5.d dVar) {
        this.I = p0Var;
        this.f18994a = uri;
        this.f18995d = new b5.a0(hVar);
        this.f18996g = kVar;
        this.f18997r = p0Var2;
        this.f18998x = dVar;
        q.f19025e.getAndIncrement();
        this.F = a(0L);
    }

    public final b5.k a(long j) {
        Map map = Collections.EMPTY_MAP;
        Map map2 = p0.f19010h0;
        Uri uri = this.f18994a;
        a5.a.k(uri, "The uri must be set.");
        return new b5.k(uri, 1, null, map2, j, -1L, null, 6);
    }

    @Override // r5.k, pb.j0
    public final void c() {
        b5.h pVar;
        int i10;
        int iG = 0;
        while (iG == 0 && !this.B) {
            try {
                long j = this.f18999y.f3485a;
                b5.k kVarA = a(j);
                this.F = kVarA;
                long jT = this.f18995d.t(kVarA);
                if (jT != -1) {
                    jT += j;
                    p0 p0Var = this.I;
                    p0Var.K.post(new l0(p0Var, 0));
                }
                long j7 = jT;
                this.I.M = IcyHeaders.d(this.f18995d.f2419a.k());
                b5.a0 a0Var = this.f18995d;
                IcyHeaders icyHeaders = this.I.M;
                if (icyHeaders == null || (i10 = icyHeaders.f1967y) == -1) {
                    pVar = a0Var;
                } else {
                    pVar = new p(a0Var, i10, this);
                    w0 w0VarA = this.I.A(new o0(0, true));
                    this.G = w0VarA;
                    w0VarA.c(p0.f19011i0);
                }
                this.f18996g.e0(pVar, this.f18994a, this.f18995d.f2419a.k(), j, j7, this.f18997r);
                if (this.I.M != null) {
                    u5.k kVar = (u5.k) this.f18996g.f12398g;
                    if (kVar instanceof k6.d) {
                        ((k6.d) kVar).f14155q = true;
                    }
                }
                if (this.D) {
                    io.sentry.k kVar2 = this.f18996g;
                    long j10 = this.E;
                    u5.k kVar3 = (u5.k) kVar2.f12398g;
                    kVar3.getClass();
                    kVar3.c(j, j10);
                    this.D = false;
                }
                while (iG == 0 && !this.B) {
                    try {
                        a5.d dVar = this.f18998x;
                        synchronized (dVar) {
                            while (!dVar.f104d) {
                                dVar.wait();
                            }
                        }
                        io.sentry.k kVar4 = this.f18996g;
                        ca.n nVar = this.f18999y;
                        u5.k kVar5 = (u5.k) kVar4.f12398g;
                        kVar5.getClass();
                        u5.h hVar = (u5.h) kVar4.f12399r;
                        hVar.getClass();
                        iG = kVar5.g(hVar, nVar);
                        u5.h hVar2 = (u5.h) this.f18996g.f12399r;
                        long j11 = hVar2 != null ? hVar2.f23288r : -1L;
                        if (j11 > this.I.E + j) {
                            this.f18998x.c();
                            p0 p0Var2 = this.I;
                            p0Var2.K.post(p0Var2.J);
                            j = j11;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iG == 1) {
                    iG = 0;
                } else {
                    u5.h hVar3 = (u5.h) this.f18996g.f12399r;
                    if ((hVar3 != null ? hVar3.f23288r : -1L) != -1) {
                        this.f18999y.f3485a = hVar3 != null ? hVar3.f23288r : -1L;
                    }
                }
                t1.h(this.f18995d);
            } catch (Throwable th2) {
                if (iG != 1) {
                    u5.h hVar4 = (u5.h) this.f18996g.f12399r;
                    if ((hVar4 != null ? hVar4.f23288r : -1L) != -1) {
                        this.f18999y.f3485a = hVar4 != null ? hVar4.f23288r : -1L;
                    }
                }
                t1.h(this.f18995d);
                throw th2;
            }
        }
    }

    @Override // r5.k, pb.j0
    public final void d() {
        this.B = true;
    }
}
