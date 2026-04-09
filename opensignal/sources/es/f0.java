package es;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public final class f0 extends rt.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rr.f f8298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f8299c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ br.n f8300d;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(rr.f fVar, Set set, ar.k kVar) {
        this.f8298b = fVar;
        this.f8299c = set;
        this.f8300d = (br.n) kVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ar.k, br.n] */
    @Override // rt.k
    public final boolean c(Object obj) {
        rr.f fVar = (rr.f) obj;
        br.l.e(fVar, "current");
        if (fVar == this.f8298b) {
            return true;
        }
        at.n nVarS = fVar.S();
        br.l.d(nVarS, "current.staticScope");
        if (!(nVarS instanceof h0)) {
            return true;
        }
        this.f8299c.addAll((Collection) this.f8300d.a(nVarS));
        return false;
    }

    @Override // rt.k
    public final /* bridge */ /* synthetic */ Object i() {
        return lq.b0.f15562a;
    }
}
