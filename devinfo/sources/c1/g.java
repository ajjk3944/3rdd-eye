package c1;

import d0.q1;
import d0.s1;
import xk.x;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class g extends nk.a implements mk.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2556h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i4, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i4, i10, cls, obj, str, str2);
        this.f2556h = i11;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2556h) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                ((h) this.f29964a).c(iIntValue, (u0.p) obj);
                break;
            default:
                long j = ((d3.p) obj).f21974a;
                s1 s1Var = (s1) this.f29964a;
                x.v(s1Var.K.c(), null, null, new q1(s1Var, j, null, 1), 3);
                break;
        }
        return u.f37649a;
    }
}
