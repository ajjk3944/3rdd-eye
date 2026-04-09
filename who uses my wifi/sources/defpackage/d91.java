package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class d91 extends f91 {
    public final WindowInsets.Builder c;

    public d91() {
        this.c = i71.e();
    }

    @Override // defpackage.f91
    public o91 b() {
        a();
        o91 o91VarG = o91.g(null, this.c.build());
        o91VarG.a.o(this.b);
        return o91VarG;
    }

    @Override // defpackage.f91
    public void d(y20 y20Var) {
        this.c.setMandatorySystemGestureInsets(y20Var.d());
    }

    @Override // defpackage.f91
    public void e(y20 y20Var) {
        this.c.setStableInsets(y20Var.d());
    }

    @Override // defpackage.f91
    public void f(y20 y20Var) {
        this.c.setSystemGestureInsets(y20Var.d());
    }

    @Override // defpackage.f91
    public void g(y20 y20Var) {
        this.c.setSystemWindowInsets(y20Var.d());
    }

    @Override // defpackage.f91
    public void h(y20 y20Var) {
        this.c.setTappableElementInsets(y20Var.d());
    }

    public d91(o91 o91Var) {
        WindowInsets.Builder builderE;
        super(o91Var);
        WindowInsets windowInsetsF = o91Var.f();
        if (windowInsetsF != null) {
            builderE = i71.f(windowInsetsF);
        } else {
            builderE = i71.e();
        }
        this.c = builderE;
    }
}
