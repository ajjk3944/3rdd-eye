package j1;

import android.view.ViewStructure;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r extends nk.l implements mk.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewStructure f27059a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ViewStructure viewStructure) {
        super(4);
        this.f27059a = viewStructure;
    }

    @Override // mk.g
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue() - iIntValue2;
        this.f27059a.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
        return u.f37649a;
    }
}
