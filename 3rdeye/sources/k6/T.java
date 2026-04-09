package K6;

import N7.C1298o9;
import N7.C1431y3;
import N7.Ka;
import N7.S2;
import android.util.DisplayMetrics;
import android.view.View;
import b9.C1992A;
import z7.InterfaceC5868a;

/* compiled from: DivContainerBinder.kt */
/* loaded from: classes.dex */
public final class T extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3329g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A7.d f3330h;
    public final /* synthetic */ H6.B i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ View f3331j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5868a f3332k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f3333l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f3334m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(S s10, View view, C1431y3 c1431y3, S2 s22, A7.d dVar, A7.d dVar2) {
        super(1);
        this.i = s10;
        this.f3331j = view;
        this.f3332k = c1431y3;
        this.f3333l = s22;
        this.f3330h = dVar;
        this.f3334m = dVar2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [N7.S2, java.lang.Object] */
    @Override // p9.l
    public final Object invoke(Object obj) {
        V6.g gVarB;
        switch (this.f3329g) {
            case 0:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                View view = this.f3331j;
                ?? r02 = this.f3333l;
                ((S) this.i).getClass();
                S.o(view, (C1431y3) this.f3332k, r02, this.f3330h, (A7.d) this.f3334m);
                break;
            default:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                y1 y1Var = (y1) this.i;
                C1298o9 c1298o9 = (C1298o9) this.f3332k;
                if (c1298o9 != null) {
                    DisplayMetrics displayMetrics = (DisplayMetrics) this.f3333l;
                    kotlin.jvm.internal.l.e(displayMetrics, "displayMetrics");
                    A7.b<Integer> bVar = ((Ka) this.f3334m).f5652Z;
                    A7.d dVar = this.f3330h;
                    int iIntValue = bVar.a(dVar).intValue();
                    y1Var.getClass();
                    gVarB = y1.B(c1298o9, dVar, displayMetrics, iIntValue);
                } else {
                    gVarB = null;
                }
                y1Var.getClass();
                y1.z((O6.q) this.f3331j, gVarB);
                break;
        }
        return C1992A.f18074a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(y1 y1Var, O6.q qVar, C1298o9 c1298o9, A7.d dVar, DisplayMetrics displayMetrics, Ka ka2) {
        super(1);
        this.i = y1Var;
        this.f3331j = qVar;
        this.f3332k = c1298o9;
        this.f3330h = dVar;
        this.f3333l = displayMetrics;
        this.f3334m = ka2;
    }
}
