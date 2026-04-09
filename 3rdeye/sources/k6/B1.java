package K6;

import N7.H9;
import N7.Ka;
import b9.C1992A;

/* compiled from: DivTextBinder.kt */
/* loaded from: classes.dex */
public final class B1 extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3185g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y1 f3186h;
    public final /* synthetic */ O6.q i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Ka f3187j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A7.d f3188k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B1(y1 y1Var, O6.q qVar, Ka ka2, A7.d dVar, int i) {
        super(1);
        this.f3185g = i;
        this.f3186h = y1Var;
        this.i = qVar;
        this.f3187j = ka2;
        this.f3188k = dVar;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f3185g) {
            case 0:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                Ka ka2 = this.f3187j;
                A7.b<Long> bVar = ka2.f5691v;
                A7.d dVar = this.f3188k;
                long jLongValue = bVar.a(dVar).longValue();
                H9 h9A = ka2.f5692w.a(dVar);
                double dDoubleValue = ka2.f5634H.a(dVar).doubleValue();
                this.f3186h.getClass();
                y1.o(this.i, jLongValue, h9A, dDoubleValue);
                break;
            default:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                Ka ka3 = this.f3187j;
                A7.b<Integer> bVar2 = ka3.f5652Z;
                A7.d dVar2 = this.f3188k;
                int iIntValue = bVar2.a(dVar2).intValue();
                A7.b<Integer> bVar3 = ka3.f5688s;
                Integer numA = bVar3 != null ? bVar3.a(dVar2) : null;
                this.f3186h.getClass();
                y1.y(this.i, iIntValue, numA);
                break;
        }
        return C1992A.f18074a;
    }
}
