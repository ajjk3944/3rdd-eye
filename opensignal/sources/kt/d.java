package kt;

import bu.t;
import java.util.Collection;
import java.util.List;
import mq.w;
import rr.a0;
import rr.j0;
import rr.n;

/* loaded from: classes.dex */
public final class d implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f14506a = new d();

    /* renamed from: d, reason: collision with root package name */
    public static final qs.g f14507d = qs.g.g(b.ERROR_MODULE.getDebugText());

    /* renamed from: g, reason: collision with root package name */
    public static final w f14508g = w.f16945a;

    /* renamed from: r, reason: collision with root package name */
    public static final or.e f14509r;

    static {
        or.e eVar = or.e.f19667f;
        f14509r = or.e.f19667f;
    }

    @Override // rr.a0
    public final Object A0(t tVar) {
        br.l.e(tVar, "capability");
        return null;
    }

    @Override // rr.a0
    public final j0 J0(qs.c cVar) {
        br.l.e(cVar, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // rr.a0
    public final boolean N0(a0 a0Var) {
        br.l.e(a0Var, "targetModule");
        return false;
    }

    @Override // sr.a
    public final sr.h getAnnotations() {
        return sr.g.f22217a;
    }

    @Override // rr.l
    public final qs.g getName() {
        return f14507d;
    }

    @Override // rr.a0
    public final Collection l(qs.c cVar, ar.k kVar) {
        br.l.e(cVar, "fqName");
        return w.f16945a;
    }

    @Override // rr.a0
    public final or.h n() {
        return f14509r;
    }

    @Override // rr.l
    public final rr.l o() {
        return null;
    }

    @Override // rr.a0
    public final List t0() {
        return f14508g;
    }

    @Override // rr.l
    public final Object w0(n nVar, Object obj) {
        return null;
    }

    @Override // rr.l, rr.i
    /* renamed from: a */
    public final rr.l u1() {
        return this;
    }
}
