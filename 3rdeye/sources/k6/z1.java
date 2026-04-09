package K6;

import N7.EnumC1195h5;
import N7.Ka;
import b9.C1992A;

/* compiled from: DivTextBinder.kt */
/* loaded from: classes.dex */
public final class z1 extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3747g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y1 f3748h;
    public final /* synthetic */ O6.q i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Ka f3749j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A7.d f3750k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(y1 y1Var, O6.q qVar, Ka ka2, A7.d dVar, int i) {
        super(1);
        this.f3747g = i;
        this.f3748h = y1Var;
        this.i = qVar;
        this.f3749j = ka2;
        this.f3750k = dVar;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f3747g) {
            case 0:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                Ka ka2 = this.f3749j;
                this.f3748h.getClass();
                y1.n(this.i, ka2, this.f3750k);
                break;
            default:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                Ka ka3 = this.f3749j;
                A7.b<String> bVar = ka3.f5689t;
                A7.d dVar = this.f3750k;
                String strA = bVar != null ? bVar.a(dVar) : null;
                EnumC1195h5 enumC1195h5A = ka3.f5694y.a(dVar);
                A7.b<Long> bVar2 = ka3.f5695z;
                this.i.setTypeface(T1.B.m(this.f3748h.f3719c, strA, enumC1195h5A, bVar2 != null ? bVar2.a(dVar) : null));
                break;
        }
        return C1992A.f18074a;
    }
}
