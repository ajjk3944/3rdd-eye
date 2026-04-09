package e4;

import android.view.WindowInsets;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class t1 extends s1 {

    /* renamed from: n, reason: collision with root package name */
    public v3.b f22396n;

    public t1(c2 c2Var, WindowInsets windowInsets) {
        super(c2Var, windowInsets);
        this.f22396n = null;
    }

    @Override // e4.z1
    public c2 b() {
        return c2.h(null, this.f22391c.consumeStableInsets());
    }

    @Override // e4.z1
    public c2 c() {
        return c2.h(null, this.f22391c.consumeSystemWindowInsets());
    }

    @Override // e4.z1
    public final v3.b j() {
        if (this.f22396n == null) {
            WindowInsets windowInsets = this.f22391c;
            this.f22396n = v3.b.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f22396n;
    }

    @Override // e4.z1
    public boolean o() {
        return this.f22391c.isConsumed();
    }

    @Override // e4.z1
    public void u(v3.b bVar) {
        this.f22396n = bVar;
    }

    public t1(c2 c2Var, t1 t1Var) {
        super(c2Var, t1Var);
        this.f22396n = null;
        this.f22396n = t1Var.f22396n;
    }
}
