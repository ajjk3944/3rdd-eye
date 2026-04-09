package u3;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class b1 extends a1 {
    public b1(h1 h1Var, WindowInsets windowInsets) {
        super(h1Var, windowInsets);
    }

    @Override // u3.f1
    public h1 a() {
        return h1.g(null, this.f23240c.consumeDisplayCutout());
    }

    @Override // u3.f1
    public h e() {
        DisplayCutout displayCutout = this.f23240c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new h(displayCutout);
    }

    @Override // u3.z0, u3.f1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return Objects.equals(this.f23240c, b1Var.f23240c) && Objects.equals(this.f23244g, b1Var.f23244g);
    }

    @Override // u3.f1
    public int hashCode() {
        return this.f23240c.hashCode();
    }
}
