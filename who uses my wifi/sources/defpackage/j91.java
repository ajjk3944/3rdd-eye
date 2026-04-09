package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class j91 extends i91 {
    public y20 n;
    public y20 o;
    public y20 p;

    public j91(o91 o91Var, WindowInsets windowInsets) {
        super(o91Var, windowInsets);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    @Override // defpackage.l91
    public y20 g() {
        if (this.o == null) {
            this.o = y20.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.o;
    }

    @Override // defpackage.l91
    public y20 i() {
        if (this.n == null) {
            this.n = y20.c(this.c.getSystemGestureInsets());
        }
        return this.n;
    }

    @Override // defpackage.l91
    public y20 k() {
        if (this.p == null) {
            this.p = y20.c(this.c.getTappableElementInsets());
        }
        return this.p;
    }

    @Override // defpackage.g91, defpackage.l91
    public o91 l(int i, int i2, int i3, int i4) {
        return o91.g(null, this.c.inset(i, i2, i3, i4));
    }

    @Override // defpackage.h91, defpackage.l91
    public void q(y20 y20Var) {
    }
}
