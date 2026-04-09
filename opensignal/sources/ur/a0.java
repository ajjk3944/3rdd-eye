package ur;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 extends n implements rr.a0 {
    public final f0 B;
    public gb.k D;
    public rr.i0 E;
    public final boolean F;
    public final gt.e G;
    public final lq.q H;

    /* renamed from: r, reason: collision with root package name */
    public final gt.l f23622r;

    /* renamed from: x, reason: collision with root package name */
    public final or.h f23623x;

    /* renamed from: y, reason: collision with root package name */
    public final Map f23624y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(qs.g gVar, gt.l lVar, or.h hVar, int i10) {
        super(sr.g.f22217a, gVar);
        br.l.e(gVar, "moduleName");
        this.f23622r = lVar;
        this.f23623x = hVar;
        if (!gVar.f21036d) {
            throw new IllegalArgumentException("Module name must be special: " + gVar);
        }
        this.f23624y = mq.x.f16946a;
        f0.f23637a.getClass();
        f0 f0Var = (f0) A0(d0.f23631b);
        this.B = f0Var == null ? e0.f23633b : f0Var;
        this.F = true;
        this.G = lVar.b(new j1.a(12, this));
        this.H = kc.f.F(new or.l(this, 2));
    }

    @Override // rr.a0
    public final Object A0(bu.t tVar) {
        br.l.e(tVar, "capability");
        Object obj = this.f23624y.get(tVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // rr.a0
    public final rr.j0 J0(qs.c cVar) {
        br.l.e(cVar, "fqName");
        u1();
        return (rr.j0) this.G.a(cVar);
    }

    @Override // rr.a0
    public final boolean N0(rr.a0 a0Var) {
        br.l.e(a0Var, "targetModule");
        if (equals(a0Var)) {
            return true;
        }
        br.l.b(this.D);
        if (mq.o.k0(mq.y.f16947a, a0Var)) {
            return true;
        }
        t0();
        return a0Var.t0().contains(this);
    }

    @Override // rr.a0
    public final Collection l(qs.c cVar, ar.k kVar) {
        br.l.e(cVar, "fqName");
        u1();
        u1();
        return ((m) this.H.getValue()).l(cVar, kVar);
    }

    @Override // rr.a0
    public final or.h n() {
        return this.f23623x;
    }

    @Override // rr.l
    public final rr.l o() {
        return null;
    }

    @Override // rr.a0
    public final List t0() {
        if (this.D != null) {
            return mq.w.f16945a;
        }
        StringBuilder sb2 = new StringBuilder("Dependencies of module ");
        String str = getName().f21035a;
        br.l.d(str, "name.toString()");
        sb2.append(str);
        sb2.append(" were not set");
        throw new AssertionError(sb2.toString());
    }

    @Override // ur.n, androidx.lifecycle.o
    public final String toString() {
        String strT1 = n.t1(this);
        return this.F ? strT1 : strT1.concat(" !isValid");
    }

    public final void u1() {
        if (this.F) {
            return;
        }
        if (A0(rr.w.f21722a) != null) {
            throw new ClassCastException();
        }
        String str = "Accessing invalid module descriptor " + this;
        br.l.e(str, "message");
        throw new androidx.media3.common.u(str);
    }

    @Override // rr.l
    public final Object w0(rr.n nVar, Object obj) {
        return nVar.z(obj, this);
    }
}
