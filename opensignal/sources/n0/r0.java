package n0;

import com.google.android.gms.internal.measurement.e5;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class r0 implements p1, wt.s {

    /* renamed from: a, reason: collision with root package name */
    public final pq.h f17293a;

    /* renamed from: d, reason: collision with root package name */
    public final ar.n f17294d;

    /* renamed from: g, reason: collision with root package name */
    public final bu.c f17295g;

    /* renamed from: r, reason: collision with root package name */
    public wt.z f17296r;

    public r0(pq.h hVar, ar.n nVar) {
        this.f17293a = hVar;
        this.f17294d = nVar;
        this.f17295g = wt.w.b(hVar.i0(hVar.Y(y0.b.f25613d) != null ? this : pq.i.f20621a));
    }

    @Override // wt.s
    public final void L(Throwable th2, pq.h hVar) throws Throwable {
        y0.b bVar = (y0.b) hVar.Y(y0.b.f25613d);
        if (bVar != null) {
            e5.T(th2, new c8.x(bVar, 7, this));
        }
        wt.s sVar = (wt.s) this.f17293a.Y(wt.r.f24652a);
        if (sVar == null) {
            throw th2;
        }
        sVar.L(th2, hVar);
    }

    @Override // pq.h
    public final pq.f Y(pq.g gVar) {
        return se.b.y(this, gVar);
    }

    @Override // pq.h
    public final Object Z(ar.n nVar, Object obj) {
        return nVar.w(obj, this);
    }

    @Override // n0.p1
    public final void a() {
        wt.z zVar = this.f17296r;
        if (zVar != null) {
            zVar.p(new au.m());
        }
        this.f17296r = null;
    }

    @Override // n0.p1
    public final void c() {
        wt.z zVar = this.f17296r;
        if (zVar != null) {
            zVar.p(new au.m());
        }
        this.f17296r = null;
    }

    @Override // n0.p1
    public final void d() {
        wt.z zVar = this.f17296r;
        if (zVar != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            zVar.p(cancellationException);
        }
        this.f17296r = wt.w.s(this.f17295g, null, null, this.f17294d, 3);
    }

    @Override // pq.f
    public final pq.g getKey() {
        return wt.r.f24652a;
    }

    @Override // pq.h
    public final pq.h i0(pq.h hVar) {
        return se.b.M(this, hVar);
    }

    @Override // pq.h
    public final pq.h q(pq.g gVar) {
        return se.b.L(this, gVar);
    }
}
