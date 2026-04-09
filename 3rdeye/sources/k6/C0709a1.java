package K6;

import N7.AbstractC1293o4;
import android.util.DisplayMetrics;
import b9.C1992A;

/* compiled from: DivSliderBinder.kt */
/* renamed from: K6.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0709a1 extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3381g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Z0 f3382h;
    public final /* synthetic */ O6.y i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ A7.d f3383j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractC1293o4 f3384k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0709a1(Z0 z02, O6.y yVar, A7.d dVar, AbstractC1293o4 abstractC1293o4, int i) {
        super(1);
        this.f3381g = i;
        this.f3382h = z02;
        this.i = yVar;
        this.f3383j = dVar;
        this.f3384k = abstractC1293o4;
    }

    @Override // p9.l
    public final Object invoke(Object it) {
        switch (this.f3381g) {
            case 0:
                kotlin.jvm.internal.l.f(it, "it");
                this.f3382h.getClass();
                O6.y yVar = this.i;
                DisplayMetrics displayMetrics = yVar.getResources().getDisplayMetrics();
                kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
                yVar.setThumbSecondaryDrawable(C0713c.b0(this.f3384k, displayMetrics, this.f3383j));
                break;
            default:
                kotlin.jvm.internal.l.f(it, "it");
                AbstractC1293o4 abstractC1293o4 = this.f3384k;
                this.f3382h.getClass();
                O6.y yVar2 = this.i;
                DisplayMetrics displayMetrics2 = yVar2.getResources().getDisplayMetrics();
                kotlin.jvm.internal.l.e(displayMetrics2, "resources.displayMetrics");
                yVar2.setInactiveTrackDrawable(C0713c.b0(abstractC1293o4, displayMetrics2, this.f3383j));
                break;
        }
        return C1992A.f18074a;
    }
}
