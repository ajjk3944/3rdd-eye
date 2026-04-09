package g2;

import i2.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y0 extends nk.l implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mk.e f24444b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24445c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24446d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(j2.r rVar, j2.m0 m0Var, mk.e eVar) {
        super(2);
        this.f24443a = 1;
        this.f24445c = rVar;
        this.f24446d = m0Var;
        this.f24444b = eVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24443a) {
            case 0:
                ((Number) obj2).intValue();
                n0.a((c1) this.f24445c, (i1.n) this.f24446d, this.f24444b, (u0.p) obj, u0.q.z(9));
                break;
            case 1:
                u0.p pVar = (u0.p) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (pVar.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j2.a1.a((j2.r) this.f24445c, (j2.m0) this.f24446d, this.f24444b, pVar, 0);
                } else {
                    pVar.R();
                }
                break;
            default:
                ((Number) obj2).intValue();
                j2.a1.a((m1) this.f24445c, (j2.m0) this.f24446d, this.f24444b, (u0.p) obj, u0.q.z(1));
                break;
        }
        return yj.u.f37649a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(Object obj, Object obj2, mk.e eVar, int i4, int i10) {
        super(2);
        this.f24443a = i10;
        this.f24445c = obj;
        this.f24446d = obj2;
        this.f24444b = eVar;
    }
}
