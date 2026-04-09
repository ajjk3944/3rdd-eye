package e4;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class u1 extends t1 {
    public u1(c2 c2Var, WindowInsets windowInsets) {
        super(c2Var, windowInsets);
    }

    @Override // e4.z1
    public c2 a() {
        return c2.h(null, this.f22391c.consumeDisplayCutout());
    }

    @Override // e4.s1, e4.z1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return Objects.equals(this.f22391c, u1Var.f22391c) && Objects.equals(this.g, u1Var.g) && s1.C(this.f22395h, u1Var.f22395h);
    }

    @Override // e4.z1
    public k f() {
        DisplayCutout displayCutout = this.f22391c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new k(displayCutout);
    }

    @Override // e4.z1
    public int hashCode() {
        return this.f22391c.hashCode();
    }

    public u1(c2 c2Var, u1 u1Var) {
        super(c2Var, u1Var);
    }
}
