package F6;

import N7.C1126cb;
import N7.Xa;
import O6.q;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.l;

/* compiled from: DivTextRangesBackgroundRenderer.kt */
/* loaded from: classes.dex */
public final class g extends e {

    /* renamed from: a, reason: collision with root package name */
    public final q f1677a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.d f1678b;

    public g(q view, A7.d resolver) {
        l.f(view, "view");
        l.f(resolver, "resolver");
        this.f1677a = view;
        this.f1678b = resolver;
    }

    @Override // F6.e
    public final void a(Canvas canvas, Layout layout, int i, int i10, int i11, int i12, C1126cb c1126cb, Xa xa) {
        int iC = e.c(layout, i);
        int iB = e.b(layout, i);
        int iMin = Math.min(i11, i12);
        int iMax = Math.max(i11, i12);
        DisplayMetrics displayMetrics = this.f1677a.getResources().getDisplayMetrics();
        l.e(displayMetrics, "view.resources.displayMetrics");
        a aVar = new a(displayMetrics, c1126cb, xa, canvas, this.f1678b);
        aVar.a(aVar.f1662g, iMin, iC, iMax, iB);
    }
}
