package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public int f3983b;

    /* renamed from: c, reason: collision with root package name */
    public int f3984c;

    /* renamed from: d, reason: collision with root package name */
    public int f3985d;

    /* renamed from: e, reason: collision with root package name */
    public int f3986e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3989h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3990i;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3982a = true;

    /* renamed from: f, reason: collision with root package name */
    public int f3987f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f3988g = 0;

    public boolean a(RecyclerView.y yVar) {
        int i10 = this.f3984c;
        return i10 >= 0 && i10 < yVar.b();
    }

    public View b(RecyclerView.u uVar) {
        View viewO = uVar.o(this.f3984c);
        this.f3984c += this.f3985d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f3983b + ", mCurrentPosition=" + this.f3984c + ", mItemDirection=" + this.f3985d + ", mLayoutDirection=" + this.f3986e + ", mStartLine=" + this.f3987f + ", mEndLine=" + this.f3988g + '}';
    }
}
