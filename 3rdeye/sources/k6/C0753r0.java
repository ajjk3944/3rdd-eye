package K6;

import N7.AbstractC1293o4;
import N7.C1447z5;
import N7.EnumC1305p2;
import N7.EnumC1319q2;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import b9.C1992A;
import z7.InterfaceC5868a;

/* compiled from: DivImageBinder.kt */
/* renamed from: K6.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0753r0 extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3617g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A7.d f3618h;
    public final /* synthetic */ H6.B i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ View f3619j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5868a f3620k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0753r0(C0752q0 c0752q0, O6.n nVar, C1447z5 c1447z5, A7.d dVar) {
        super(1);
        this.i = c0752q0;
        this.f3619j = nVar;
        this.f3620k = c1447z5;
        this.f3618h = dVar;
    }

    @Override // p9.l
    public final Object invoke(Object it) {
        Drawable drawableB0;
        switch (this.f3617g) {
            case 0:
                kotlin.jvm.internal.l.f(it, "<anonymous parameter 0>");
                C1447z5 c1447z5 = (C1447z5) this.f3620k;
                A7.b<EnumC1305p2> bVar = c1447z5.f10077o;
                A7.d dVar = this.f3618h;
                EnumC1305p2 enumC1305p2A = bVar.a(dVar);
                EnumC1319q2 enumC1319q2A = c1447z5.f10078p.a(dVar);
                ((C0752q0) this.i).getClass();
                ((O6.n) this.f3619j).setGravity(C0713c.F(enumC1305p2A, enumC1319q2A));
                break;
            default:
                kotlin.jvm.internal.l.f(it, "it");
                Z0 z02 = (Z0) this.i;
                z02.getClass();
                AbstractC1293o4 abstractC1293o4 = (AbstractC1293o4) this.f3620k;
                O6.y yVar = (O6.y) this.f3619j;
                if (abstractC1293o4 != null) {
                    DisplayMetrics displayMetrics = yVar.getResources().getDisplayMetrics();
                    kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
                    drawableB0 = C0713c.b0(abstractC1293o4, displayMetrics, this.f3618h);
                } else {
                    drawableB0 = null;
                }
                yVar.setActiveTickMarkDrawable(drawableB0);
                z02.o(yVar);
                break;
        }
        return C1992A.f18074a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0753r0(Z0 z02, O6.y yVar, A7.d dVar, AbstractC1293o4 abstractC1293o4) {
        super(1);
        this.i = z02;
        this.f3619j = yVar;
        this.f3618h = dVar;
        this.f3620k = abstractC1293o4;
    }
}
