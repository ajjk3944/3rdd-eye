package u3;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class e1 extends d1 {

    /* renamed from: q, reason: collision with root package name */
    public static final h1 f23158q = h1.g(null, WindowInsets.CONSUMED);

    public e1(h1 h1Var, WindowInsets windowInsets) {
        super(h1Var, windowInsets);
    }

    @Override // u3.z0, u3.f1
    public k3.d f(int i10) {
        return k3.d.c(this.f23240c.getInsets(g1.a(i10)));
    }

    @Override // u3.z0, u3.f1
    public k3.d g(int i10) {
        return k3.d.c(this.f23240c.getInsetsIgnoringVisibility(g1.a(i10)));
    }

    @Override // u3.z0, u3.f1
    public boolean p(int i10) {
        return this.f23240c.isVisible(g1.a(i10));
    }

    @Override // u3.z0, u3.f1
    public final void d(View view) {
    }
}
