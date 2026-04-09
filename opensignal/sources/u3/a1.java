package u3;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class a1 extends z0 {

    /* renamed from: m, reason: collision with root package name */
    public k3.d f23145m;

    public a1(h1 h1Var, WindowInsets windowInsets) {
        super(h1Var, windowInsets);
        this.f23145m = null;
    }

    @Override // u3.f1
    public h1 b() {
        return h1.g(null, this.f23240c.consumeStableInsets());
    }

    @Override // u3.f1
    public h1 c() {
        return h1.g(null, this.f23240c.consumeSystemWindowInsets());
    }

    @Override // u3.f1
    public final k3.d i() {
        if (this.f23145m == null) {
            WindowInsets windowInsets = this.f23240c;
            this.f23145m = k3.d.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f23145m;
    }

    @Override // u3.f1
    public boolean n() {
        return this.f23240c.isConsumed();
    }

    @Override // u3.f1
    public void s(k3.d dVar) {
        this.f23145m = dVar;
    }
}
