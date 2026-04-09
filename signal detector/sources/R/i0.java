package R;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* loaded from: classes.dex */
public class i0 extends h0 {
    public i0(r0 r0Var, WindowInsets windowInsets) {
        super(r0Var, windowInsets);
    }

    @Override // R.o0
    public r0 a() {
        return r0.g(null, this.f3332c.consumeDisplayCutout());
    }

    @Override // R.o0
    public C0181h e() {
        DisplayCutout displayCutout = this.f3332c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0181h(displayCutout);
    }

    @Override // R.g0, R.o0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Objects.equals(this.f3332c, i0Var.f3332c) && Objects.equals(this.f3336g, i0Var.f3336g) && g0.y(this.f3337h, i0Var.f3337h);
    }

    @Override // R.o0
    public int hashCode() {
        return this.f3332c.hashCode();
    }
}
