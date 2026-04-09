package K6;

import N7.AbstractC1293o4;
import android.util.DisplayMetrics;
import b9.C1992A;
import w7.C5742b;

/* compiled from: DivSliderBinder.kt */
/* loaded from: classes.dex */
public final class n1 extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O6.y f3556g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C5742b.d f3557h;
    public final /* synthetic */ AbstractC1293o4 i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ DisplayMetrics f3558j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A7.d f3559k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(O6.y yVar, C5742b.d dVar, AbstractC1293o4 abstractC1293o4, DisplayMetrics displayMetrics, A7.d dVar2) {
        super(1);
        this.f3556g = yVar;
        this.f3557h = dVar;
        this.i = abstractC1293o4;
        this.f3558j = displayMetrics;
        this.f3559k = dVar2;
    }

    @Override // p9.l
    public final C1992A invoke(Object obj) {
        kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
        DisplayMetrics metrics = this.f3558j;
        kotlin.jvm.internal.l.e(metrics, "metrics");
        this.f3557h.f47544f = C0713c.b0(this.i, metrics, this.f3559k);
        O6.y yVar = this.f3556g;
        yVar.requestLayout();
        yVar.invalidate();
        return C1992A.f18074a;
    }
}
