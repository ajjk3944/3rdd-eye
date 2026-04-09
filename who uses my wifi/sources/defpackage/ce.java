package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ce extends w21 {
    public boolean a = false;
    public final ViewGroup b;

    public ce(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.w21, defpackage.u21
    public final void b() {
        yc0.l(this.b, false);
    }

    @Override // defpackage.w21, defpackage.u21
    public final void c() {
        yc0.l(this.b, true);
    }

    @Override // defpackage.u21
    public final void d(v21 v21Var) {
        if (!this.a) {
            yc0.l(this.b, false);
        }
        v21Var.x(this);
    }

    @Override // defpackage.w21, defpackage.u21
    public final void f(v21 v21Var) {
        yc0.l(this.b, false);
        this.a = true;
    }
}
