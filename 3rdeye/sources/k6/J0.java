package K6;

import N7.T5;
import N7.X2;
import O6.C1476b;
import b9.C1992A;
import z7.InterfaceC5868a;

/* compiled from: DivInputBinder.kt */
/* loaded from: classes.dex */
public final class J0 extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3247g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A7.d f3248h;
    public final /* synthetic */ i7.k i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5868a f3249j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J0(i7.k kVar, InterfaceC5868a interfaceC5868a, A7.d dVar, int i) {
        super(1);
        this.f3247g = i;
        this.i = kVar;
        this.f3249j = interfaceC5868a;
        this.f3248h = dVar;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f3247g) {
            case 0:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                ((O6.p) this.i).setSelectAllOnFocus(((T5) this.f3249j).f6279O.a(this.f3248h).booleanValue());
                break;
            default:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                X2 x22 = (X2) this.f3249j;
                A7.d dVar = this.f3248h;
                C1476b c1476b = (C1476b) this.i;
                c1476b.a(x22, dVar);
                c1476b.f10382c.invalidate();
                break;
        }
        return C1992A.f18074a;
    }
}
