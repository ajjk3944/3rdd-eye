package R;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class h0 extends g0 {

    /* renamed from: n, reason: collision with root package name */
    public J.c f3339n;

    public h0(r0 r0Var, WindowInsets windowInsets) {
        super(r0Var, windowInsets);
        this.f3339n = null;
    }

    @Override // R.o0
    public r0 b() {
        return r0.g(null, this.f3332c.consumeStableInsets());
    }

    @Override // R.o0
    public r0 c() {
        return r0.g(null, this.f3332c.consumeSystemWindowInsets());
    }

    @Override // R.o0
    public final J.c h() {
        if (this.f3339n == null) {
            WindowInsets windowInsets = this.f3332c;
            this.f3339n = J.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f3339n;
    }

    @Override // R.o0
    public boolean m() {
        return this.f3332c.isConsumed();
    }

    @Override // R.o0
    public void q(J.c cVar) {
        this.f3339n = cVar;
    }
}
