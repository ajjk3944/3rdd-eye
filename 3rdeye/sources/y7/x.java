package y7;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: ViewPagerFixedSizeLayout.kt */
/* loaded from: classes.dex */
public final class x extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public a f48351b;

    /* renamed from: c, reason: collision with root package name */
    public int f48352c;

    /* renamed from: d, reason: collision with root package name */
    public Rect f48353d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f48354e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f48355f;

    /* compiled from: ViewPagerFixedSizeLayout.kt */
    public interface a {
        void a(float f10, int i);

        int b(int i, int i10);

        boolean c(float f10, int i);

        void d();
    }

    public final boolean getAnimateOnScroll() {
        return this.f48354e;
    }

    public final int getCollapsiblePaddingBottom() {
        return this.f48352c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        this.f48355f = Integer.valueOf(i10);
        a aVar = this.f48351b;
        if (aVar != null) {
            kotlin.jvm.internal.l.c(aVar);
            i10 = View.MeasureSpec.makeMeasureSpec(aVar.b(i, i10), 1073741824);
        }
        super.onMeasure(i, i10);
    }

    public final void setAnimateOnScroll(boolean z10) {
        this.f48354e = z10;
    }

    public final void setCollapsiblePaddingBottom(int i) {
        if (this.f48352c != i) {
            this.f48352c = i;
        }
    }

    public final void setHeightCalculator(a aVar) {
        this.f48351b = aVar;
    }
}
