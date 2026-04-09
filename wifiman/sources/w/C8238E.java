package w;

import l0.AbstractC6532h;
import l0.C6531g;
import y0.C8604y;

/* renamed from: w.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8238E {

    /* renamed from: a, reason: collision with root package name */
    private final q f63825a;

    /* renamed from: b, reason: collision with root package name */
    private long f63826b = C6531g.f52335b.c();

    public C8238E(q qVar) {
        this.f63825a = qVar;
    }

    private final long b(float f10) {
        if (this.f63825a == null) {
            long j10 = this.f63826b;
            return C6531g.q(this.f63826b, C6531g.s(C6531g.h(j10, C6531g.k(j10)), f10));
        }
        float fD = d(this.f63826b) - (Math.signum(d(this.f63826b)) * f10);
        float fC = c(this.f63826b);
        return this.f63825a == q.Horizontal ? AbstractC6532h.a(fD, fC) : AbstractC6532h.a(fC, fD);
    }

    public final C6531g a(C8604y c8604y, float f10) {
        long jR = C6531g.r(this.f63826b, C6531g.q(c8604y.h(), c8604y.k()));
        this.f63826b = jR;
        if ((this.f63825a == null ? C6531g.k(jR) : Math.abs(d(jR))) >= f10) {
            return C6531g.d(b(f10));
        }
        return null;
    }

    public final float c(long j10) {
        return this.f63825a == q.Horizontal ? C6531g.n(j10) : C6531g.m(j10);
    }

    public final float d(long j10) {
        return this.f63825a == q.Horizontal ? C6531g.m(j10) : C6531g.n(j10);
    }

    public final void e() {
        this.f63826b = C6531g.f52335b.c();
    }
}
