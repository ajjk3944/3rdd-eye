package K6;

import N7.EnumC1305p2;
import N7.EnumC1319q2;
import N7.Ka;
import b9.C1992A;

/* compiled from: DivTextBinder.kt */
/* loaded from: classes.dex */
public final class A1 extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3171g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y1 f3172h;
    public final /* synthetic */ O6.q i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Ka f3173j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A7.d f3174k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A1(y1 y1Var, O6.q qVar, Ka ka2, A7.d dVar, int i) {
        super(1);
        this.f3171g = i;
        this.f3172h = y1Var;
        this.i = qVar;
        this.f3173j = ka2;
        this.f3174k = dVar;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f3171g) {
            case 0:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                String str = null;
                A7.b<String> bVar = this.f3173j.f5690u;
                String strA = bVar != null ? bVar.a(this.f3174k) : null;
                this.f3172h.getClass();
                if (strA != null && (!y9.q.i0(strA))) {
                    str = strA;
                }
                this.i.setFontFeatureSettings(str);
                break;
            default:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                Ka ka2 = this.f3173j;
                A7.b<EnumC1305p2> bVar2 = ka2.f5650X;
                A7.d dVar = this.f3174k;
                EnumC1305p2 enumC1305p2A = bVar2.a(dVar);
                EnumC1319q2 enumC1319q2A = ka2.f5651Y.a(dVar);
                this.f3172h.getClass();
                y1.x(this.i, enumC1305p2A, enumC1319q2A);
                break;
        }
        return C1992A.f18074a;
    }
}
