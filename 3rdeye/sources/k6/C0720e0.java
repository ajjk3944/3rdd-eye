package K6;

import N7.AbstractC1293o4;
import N7.C1431y3;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import b9.C1992A;

/* compiled from: DivContainerBinder.kt */
/* renamed from: K6.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0720e0 extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1431y3.c f3439g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A7.d f3440h;
    public final /* synthetic */ O6.r i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ A7.d f3441j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0720e0(C1431y3.c cVar, A7.d dVar, O6.r rVar, A7.d dVar2) {
        super(1);
        this.f3439g = cVar;
        this.f3440h = dVar;
        this.i = rVar;
        this.f3441j = dVar2;
    }

    @Override // p9.l
    public final C1992A invoke(Object it) {
        kotlin.jvm.internal.l.f(it, "it");
        Drawable drawableB0 = null;
        C1431y3.c cVar = this.f3439g;
        AbstractC1293o4 abstractC1293o4 = cVar != null ? cVar.f9885e : null;
        O6.r rVar = this.i;
        if (abstractC1293o4 != null) {
            DisplayMetrics displayMetrics = rVar.getResources().getDisplayMetrics();
            kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
            drawableB0 = C0713c.b0(abstractC1293o4, displayMetrics, this.f3441j);
        }
        rVar.setDividerDrawable(drawableB0);
        return C1992A.f18074a;
    }
}
