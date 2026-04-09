package j1;

import android.graphics.Rect;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends nk.l implements mk.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f27039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27040b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, int i4) {
        super(4);
        this.f27039a = cVar;
        this.f27040b = i4;
    }

    @Override // mk.g
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        c cVar = this.f27039a;
        cVar.f27041a.h(cVar.f27043c, this.f27040b, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return u.f37649a;
    }
}
