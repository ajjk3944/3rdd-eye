package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class f {

    /* renamed from: b, reason: collision with root package name */
    int f32222b;

    /* renamed from: c, reason: collision with root package name */
    int f32223c;

    /* renamed from: d, reason: collision with root package name */
    int f32224d;

    /* renamed from: e, reason: collision with root package name */
    int f32225e;

    /* renamed from: h, reason: collision with root package name */
    boolean f32228h;

    /* renamed from: i, reason: collision with root package name */
    boolean f32229i;

    /* renamed from: a, reason: collision with root package name */
    boolean f32221a = true;

    /* renamed from: f, reason: collision with root package name */
    int f32226f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f32227g = 0;

    f() {
    }

    boolean a(RecyclerView.z zVar) {
        int i10 = this.f32223c;
        return i10 >= 0 && i10 < zVar.b();
    }

    View b(RecyclerView.u uVar) {
        View viewO = uVar.o(this.f32223c);
        this.f32223c += this.f32224d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f32222b + ", mCurrentPosition=" + this.f32223c + ", mItemDirection=" + this.f32224d + ", mLayoutDirection=" + this.f32225e + ", mStartLine=" + this.f32226f + ", mEndLine=" + this.f32227g + '}';
    }
}
