package ht;

import java.util.List;

/* loaded from: classes.dex */
public final class y extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10956d = 1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m0 f10957g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(at.n nVar, i0 i0Var, m0 m0Var, List list, boolean z10) {
        super(1);
        this.f10957g = m0Var;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f10956d) {
            case 0:
                br.l.e((jt.f) obj, "refiner");
                this.f10957g.p();
                break;
            default:
                br.l.e((jt.f) obj, "kotlinTypeRefiner");
                this.f10957g.p();
                break;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(i0 i0Var, m0 m0Var, List list, boolean z10) {
        super(1);
        this.f10957g = m0Var;
    }
}
