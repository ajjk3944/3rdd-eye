package ya;

import android.net.Uri;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class i0 implements pb.j0 {
    public volatile boolean B;
    public long E;
    public na.c F;
    public r0 H;
    public boolean I;
    public final /* synthetic */ l0 J;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f26076a;

    /* renamed from: d, reason: collision with root package name */
    public final pb.t0 f26077d;

    /* renamed from: g, reason: collision with root package name */
    public final qm.c f26078g;

    /* renamed from: r, reason: collision with root package name */
    public final l0 f26079r;

    /* renamed from: x, reason: collision with root package name */
    public final a5.d f26080x;

    /* renamed from: y, reason: collision with root package name */
    public final ca.n f26081y = new ca.n();
    public boolean D = true;
    public long G = -1;

    public i0(l0 l0Var, Uri uri, pb.n nVar, qm.c cVar, l0 l0Var2, a5.d dVar) {
        this.J = l0Var;
        this.f26076a = uri;
        this.f26077d = new pb.t0(nVar);
        this.f26078g = cVar;
        this.f26079r = l0Var2;
        this.f26080x = dVar;
        m.f26107e.getAndIncrement();
        this.F = a(0L);
    }

    public final na.c a(long j) {
        Map map = Collections.EMPTY_MAP;
        Map map2 = l0.f26092h0;
        Uri uri = this.f26076a;
        qb.b.l(uri, "The uri must be set.");
        return new na.c(uri, 1, null, map2, j, -1L, null, 6);
    }

    @Override // pb.j0
    public final void c() {
        pb.n lVar;
        int i10;
        int iF = 0;
        while (iF == 0 && !this.B) {
            try {
                long j = this.f26081y.f3485a;
                na.c cVarA = a(j);
                this.F = cVarA;
                long jQ = this.f26077d.q(cVarA);
                this.G = jQ;
                if (jQ != -1) {
                    this.G = jQ + j;
                }
                this.J.M = IcyHeaders.d(this.f26077d.f20430a.k());
                pb.t0 t0Var = this.f26077d;
                IcyHeaders icyHeaders = this.J.M;
                if (icyHeaders == null || (i10 = icyHeaders.f4263y) == -1) {
                    lVar = t0Var;
                } else {
                    lVar = new l(t0Var, i10, this);
                    r0 r0VarA = this.J.A(new k0(0, true));
                    this.H = r0VarA;
                    r0VarA.e(l0.f26093i0);
                }
                this.f26078g.z(lVar, this.f26076a, this.f26077d.f20430a.k(), j, this.G, this.f26079r);
                if (this.J.M != null) {
                    ca.k kVar = (ca.k) this.f26078g.f20919g;
                    if (kVar instanceof ia.c) {
                        ((ia.c) kVar).f11305p = true;
                    }
                }
                if (this.D) {
                    qm.c cVar = this.f26078g;
                    long j7 = this.E;
                    ca.k kVar2 = (ca.k) cVar.f20919g;
                    kVar2.getClass();
                    kVar2.c(j, j7);
                    this.D = false;
                }
                while (iF == 0 && !this.B) {
                    try {
                        a5.d dVar = this.f26080x;
                        synchronized (dVar) {
                            while (!dVar.f104d) {
                                dVar.wait();
                            }
                        }
                        qm.c cVar2 = this.f26078g;
                        ca.n nVar = this.f26081y;
                        ca.k kVar3 = (ca.k) cVar2.f20919g;
                        kVar3.getClass();
                        ca.h hVar = (ca.h) cVar2.f20920r;
                        hVar.getClass();
                        iF = kVar3.f(hVar, nVar);
                        ca.h hVar2 = (ca.h) this.f26078g.f20920r;
                        long j10 = hVar2 != null ? hVar2.f3478r : -1L;
                        if (j10 > this.J.E + j) {
                            a5.d dVar2 = this.f26080x;
                            synchronized (dVar2) {
                                dVar2.f104d = false;
                            }
                            l0 l0Var = this.J;
                            l0Var.K.post(l0Var.J);
                            j = j10;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iF == 1) {
                    iF = 0;
                } else {
                    ca.h hVar3 = (ca.h) this.f26078g.f20920r;
                    if ((hVar3 != null ? hVar3.f3478r : -1L) != -1) {
                        this.f26081y.f3485a = hVar3 != null ? hVar3.f3478r : -1L;
                    }
                }
                qb.v.g(this.f26077d);
            } catch (Throwable th2) {
                if (iF != 1) {
                    ca.h hVar4 = (ca.h) this.f26078g.f20920r;
                    if ((hVar4 != null ? hVar4.f3478r : -1L) != -1) {
                        this.f26081y.f3485a = hVar4 != null ? hVar4.f3478r : -1L;
                    }
                }
                qb.v.g(this.f26077d);
                throw th2;
            }
        }
    }

    @Override // pb.j0
    public final void d() {
        this.B = true;
    }
}
