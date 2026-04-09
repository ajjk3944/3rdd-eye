package K6;

import H6.C0672i;
import N7.AbstractC1293o4;
import N7.C1130d0;
import N7.C1447z5;
import N7.G5;
import N7.Ka;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import b9.C1992A;
import z7.InterfaceC5868a;

/* compiled from: DivBaseBinder.kt */
/* loaded from: classes.dex */
public final class E extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3207g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3208h;
    public final /* synthetic */ View i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3209j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f3210k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(H6.B b10, View view, A7.d dVar, InterfaceC5868a interfaceC5868a, int i) {
        super(1);
        this.f3207g = i;
        this.f3208h = b10;
        this.i = view;
        this.f3210k = dVar;
        this.f3209j = interfaceC5868a;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [N7.S2, java.lang.Object] */
    @Override // p9.l
    public final Object invoke(Object it) {
        A7.b<String> bVar;
        A7.b<String> bVar2;
        Drawable drawableB0;
        switch (this.f3207g) {
            case 0:
                kotlin.jvm.internal.l.f(it, "<anonymous parameter 0>");
                ?? r52 = this.f3209j;
                C1130d0 c1130d0F = r52.f();
                String strA = null;
                A7.d dVar = (A7.d) this.f3210k;
                String strA2 = (c1130d0F == null || (bVar2 = c1130d0F.f8036a) == null) ? null : bVar2.a(dVar);
                C1130d0 c1130d0F2 = r52.f();
                if (c1130d0F2 != null && (bVar = c1130d0F2.f8037b) != null) {
                    strA = bVar.a(dVar);
                }
                ((D) this.f3208h).getClass();
                if (strA2 == null) {
                    strA2 = strA;
                } else if (strA != null) {
                    strA2 = strA2 + '\n' + strA;
                }
                this.i.setContentDescription(strA2);
                break;
            case 1:
                kotlin.jvm.internal.l.f(it, "<anonymous parameter 0>");
                C1447z5 c1447z5 = (C1447z5) this.f3210k;
                C0672i c0672i = (C0672i) this.f3209j;
                ((C0752q0) this.f3208h).getClass();
                C0752q0.n((O6.n) this.i, c0672i, c1447z5.f10082t);
                break;
            case 2:
                kotlin.jvm.internal.l.f(it, "<anonymous parameter 0>");
                G5 g52 = (G5) this.f3209j;
                ((C0757t0) this.f3208h).getClass();
                C0757t0.m((O6.s) this.i, (A7.d) this.f3210k, g52);
                break;
            case 3:
                kotlin.jvm.internal.l.f(it, "it");
                Z0 z02 = (Z0) this.f3208h;
                z02.getClass();
                AbstractC1293o4 abstractC1293o4 = (AbstractC1293o4) this.f3209j;
                O6.y yVar = (O6.y) this.i;
                if (abstractC1293o4 != null) {
                    DisplayMetrics displayMetrics = yVar.getResources().getDisplayMetrics();
                    kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
                    drawableB0 = C0713c.b0(abstractC1293o4, displayMetrics, (A7.d) this.f3210k);
                } else {
                    drawableB0 = null;
                }
                yVar.setInactiveTickMarkDrawable(drawableB0);
                z02.o(yVar);
                break;
            default:
                kotlin.jvm.internal.l.f(it, "<anonymous parameter 0>");
                ((y1) this.f3208h).u((O6.q) this.i, (C0672i) this.f3209j, (Ka) this.f3210k);
                break;
        }
        return C1992A.f18074a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(Object obj, View view, Object obj2, Object obj3, int i) {
        super(1);
        this.f3207g = i;
        this.f3208h = obj;
        this.i = view;
        this.f3209j = obj2;
        this.f3210k = obj3;
    }
}
