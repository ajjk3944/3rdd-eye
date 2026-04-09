package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class f {

    /* renamed from: b, reason: collision with root package name */
    int f2197b;

    /* renamed from: c, reason: collision with root package name */
    int f2198c;

    /* renamed from: d, reason: collision with root package name */
    int f2199d;

    /* renamed from: e, reason: collision with root package name */
    int f2200e;

    /* renamed from: h, reason: collision with root package name */
    boolean f2203h;

    /* renamed from: i, reason: collision with root package name */
    boolean f2204i;

    /* renamed from: a, reason: collision with root package name */
    boolean f2196a = true;

    /* renamed from: f, reason: collision with root package name */
    int f2201f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f2202g = 0;

    f() {
    }

    boolean a(RecyclerView.a0 a0Var) {
        int i2 = this.f2198c;
        return i2 >= 0 && i2 < a0Var.b();
    }

    View b(RecyclerView.v vVar) {
        View viewO = vVar.o(this.f2198c);
        this.f2198c += this.f2199d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f2197b + ", mCurrentPosition=" + this.f2198c + ", mItemDirection=" + this.f2199d + ", mLayoutDirection=" + this.f2200e + ", mStartLine=" + this.f2201f + ", mEndLine=" + this.f2202g + '}';
    }
}
