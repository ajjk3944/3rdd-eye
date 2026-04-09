package K6;

import b9.C1992A;

/* compiled from: DivTextBinder.kt */
/* loaded from: classes.dex */
public final class E1 extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3212g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y1 f3213h;
    public final /* synthetic */ O6.q i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E1(y1 y1Var, O6.q qVar, int i) {
        super(1);
        this.f3212g = i;
        this.f3213h = y1Var;
        this.i = qVar;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f3212g) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                this.f3213h.getClass();
                this.i.setTextIsSelectable(zBooleanValue);
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                this.f3213h.getClass();
                this.i.setTightenWidth(zBooleanValue2);
                break;
        }
        return C1992A.f18074a;
    }
}
