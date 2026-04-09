package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hd extends ob1 {
    public final Typeface q;
    public final vg0 r;
    public boolean s;

    public hd(vg0 vg0Var, Typeface typeface) {
        this.q = typeface;
        this.r = vg0Var;
    }

    @Override // defpackage.ob1
    public final void p(int i) {
        if (this.s) {
            return;
        }
        xf xfVar = (xf) this.r.g;
        if (xfVar.l(this.q)) {
            xfVar.j(false);
        }
    }

    @Override // defpackage.ob1
    public final void q(Typeface typeface, boolean z) {
        if (this.s) {
            return;
        }
        xf xfVar = (xf) this.r.g;
        if (xfVar.l(typeface)) {
            xfVar.j(false);
        }
    }
}
