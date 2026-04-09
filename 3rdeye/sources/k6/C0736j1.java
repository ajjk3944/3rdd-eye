package K6;

import K6.Z0;
import N7.C1362t4;
import android.util.DisplayMetrics;
import b9.C1992A;
import w7.C5742b;

/* compiled from: DivSliderBinder.kt */
/* renamed from: K6.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0736j1 extends kotlin.jvm.internal.m implements p9.l<Long, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O6.y f3500g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C5742b.d f3501h;
    public final /* synthetic */ C1362t4 i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ A7.d f3502j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ DisplayMetrics f3503k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0736j1(O6.y yVar, C5742b.d dVar, C1362t4 c1362t4, A7.d dVar2, DisplayMetrics displayMetrics) {
        super(1);
        this.f3500g = yVar;
        this.f3501h = dVar;
        this.i = c1362t4;
        this.f3502j = dVar2;
        this.f3503k = displayMetrics;
    }

    @Override // p9.l
    public final C1992A invoke(Long l5) {
        long jLongValue = l5.longValue();
        DisplayMetrics metrics = this.f3503k;
        kotlin.jvm.internal.l.e(metrics, "metrics");
        C1362t4 c1362t4 = this.i;
        kotlin.jvm.internal.l.f(c1362t4, "<this>");
        A7.d resolver = this.f3502j;
        kotlin.jvm.internal.l.f(resolver, "resolver");
        this.f3501h.f47541c = Z0.a.a(jLongValue, c1362t4.f9222g.a(resolver), metrics);
        O6.y yVar = this.f3500g;
        yVar.requestLayout();
        yVar.invalidate();
        return C1992A.f18074a;
    }
}
