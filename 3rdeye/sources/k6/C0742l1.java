package K6;

import K6.Z0;
import N7.H9;
import android.util.DisplayMetrics;
import b9.C1992A;
import w7.C5742b;

/* compiled from: DivSliderBinder.kt */
/* renamed from: K6.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0742l1 extends kotlin.jvm.internal.m implements p9.l<H9, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O6.y f3520g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A7.b<Long> f3521h;
    public final /* synthetic */ A7.b<Long> i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C5742b.d f3522j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A7.d f3523k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DisplayMetrics f3524l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0742l1(O6.y yVar, A7.b<Long> bVar, A7.b<Long> bVar2, C5742b.d dVar, A7.d dVar2, DisplayMetrics displayMetrics) {
        super(1);
        this.f3520g = yVar;
        this.f3521h = bVar;
        this.i = bVar2;
        this.f3522j = dVar;
        this.f3523k = dVar2;
        this.f3524l = displayMetrics;
    }

    @Override // p9.l
    public final C1992A invoke(H9 h92) {
        H9 unit = h92;
        kotlin.jvm.internal.l.f(unit, "unit");
        C5742b.d dVar = this.f3522j;
        A7.b<Long> bVar = this.f3521h;
        A7.d dVar2 = this.f3523k;
        DisplayMetrics metrics = this.f3524l;
        if (bVar != null) {
            long jLongValue = bVar.a(dVar2).longValue();
            kotlin.jvm.internal.l.e(metrics, "metrics");
            dVar.f47541c = Z0.a.a(jLongValue, unit, metrics);
        }
        A7.b<Long> bVar2 = this.i;
        if (bVar2 != null) {
            long jLongValue2 = bVar2.a(dVar2).longValue();
            kotlin.jvm.internal.l.e(metrics, "metrics");
            dVar.f47542d = Z0.a.a(jLongValue2, unit, metrics);
        }
        O6.y yVar = this.f3520g;
        yVar.requestLayout();
        yVar.invalidate();
        return C1992A.f18074a;
    }
}
