package K6;

import N7.Ba;
import N7.EnumC1305p2;
import N7.EnumC1319q2;
import N7.S2;
import android.view.View;
import b9.C1992A;

/* compiled from: DivBaseBinder.kt */
/* loaded from: classes.dex */
public final class G extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3221g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f3222h;
    public final /* synthetic */ A7.d i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3223j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C0750p0 c0750p0, View view, A7.d dVar, S2 s22) {
        super(1);
        this.f3221g = 1;
        this.f3222h = view;
        this.i = dVar;
        this.f3223j = s22;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [N7.S2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [N7.S2, java.lang.Object] */
    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f3221g) {
            case 0:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                ?? r42 = this.f3223j;
                A7.b<EnumC1305p2> bVarO = r42.o();
                A7.d dVar = this.i;
                EnumC1305p2 enumC1305p2A = bVarO != null ? bVarO.a(dVar) : null;
                A7.b<EnumC1319q2> bVarV = r42.v();
                C0713c.a(this.f3222h, enumC1305p2A, bVarV != null ? bVarV.a(dVar) : null);
                break;
            case 1:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                C0750p0.m(this.i, this.f3223j, this.f3222h);
                break;
            default:
                C0713c.o(((O6.C) this.f3222h).getTitleLayout(), ((Ba) this.f3223j).f4919E, this.i);
                break;
        }
        return C1992A.f18074a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(View view, S2 s22, A7.d dVar, int i) {
        super(1);
        this.f3221g = i;
        this.f3222h = view;
        this.f3223j = s22;
        this.i = dVar;
    }
}
