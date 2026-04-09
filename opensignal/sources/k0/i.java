package k0;

import lq.b0;

/* loaded from: classes.dex */
public final class i implements ar.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13909a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13910d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f13911g;

    public /* synthetic */ i(Object obj, int i10, Object obj2) {
        this.f13909a = i10;
        this.f13910d = obj;
        this.f13911g = obj2;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) throws Exception {
        switch (this.f13909a) {
            case 0:
                n0.p pVar = (n0.p) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (pVar.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    t.a(((u) this.f13910d).j, (v0.d) this.f13911g, pVar, 0);
                } else {
                    pVar.N();
                }
                break;
            default:
                n0.p pVar2 = (n0.p) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (pVar2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    vc.e.y((String) this.f13910d, (String) this.f13911g, pVar2, new Object[0]);
                } else {
                    pVar2.N();
                }
                break;
        }
        return b0.f15562a;
    }
}
