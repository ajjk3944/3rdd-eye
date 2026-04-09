package K6;

import H6.C0672i;
import N7.EnumC1305p2;
import N7.EnumC1319q2;
import N7.Ka;
import b9.C1992A;

/* compiled from: DivInputBinder.kt */
/* loaded from: classes.dex */
public final class K0 extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3256g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A7.d f3257h;
    public final /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3258j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f3259k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f3260l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(C0759u0 c0759u0, O6.p pVar, A7.b bVar, A7.d dVar, A7.b bVar2) {
        super(1);
        this.i = c0759u0;
        this.f3258j = pVar;
        this.f3259k = bVar;
        this.f3257h = dVar;
        this.f3260l = bVar2;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f3256g) {
            case 0:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                A7.b bVar = (A7.b) this.f3259k;
                A7.d dVar = this.f3257h;
                EnumC1305p2 enumC1305p2 = (EnumC1305p2) bVar.a(dVar);
                EnumC1319q2 enumC1319q2 = (EnumC1319q2) ((A7.b) this.f3260l).a(dVar);
                ((C0759u0) this.i).getClass();
                C0759u0.o((O6.p) this.f3258j, enumC1305p2, enumC1319q2);
                break;
            default:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                Ka ka2 = (Ka) this.i;
                String strA = ka2.f5649W.a(this.f3257h);
                C0672i c0672i = (C0672i) this.f3260l;
                y1 y1Var = (y1) this.f3258j;
                O6.q qVar = (O6.q) this.f3259k;
                y1Var.s(qVar, c0672i, ka2);
                y1Var.p(qVar, strA);
                break;
        }
        return C1992A.f18074a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(Ka ka2, A7.d dVar, y1 y1Var, O6.q qVar, C0672i c0672i) {
        super(1);
        this.i = ka2;
        this.f3257h = dVar;
        this.f3258j = y1Var;
        this.f3259k = qVar;
        this.f3260l = c0672i;
    }
}
