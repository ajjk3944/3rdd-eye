package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class i91 extends h91 {
    public i91(o91 o91Var, WindowInsets windowInsets) {
        super(o91Var, windowInsets);
    }

    @Override // defpackage.l91
    public o91 a() {
        return o91.g(null, this.c.consumeDisplayCutout());
    }

    @Override // defpackage.l91
    public hp e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new hp(displayCutout);
    }

    @Override // defpackage.g91, defpackage.l91
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i91)) {
            return false;
        }
        i91 i91Var = (i91) obj;
        return Objects.equals(this.c, i91Var.c) && Objects.equals(this.g, i91Var.g);
    }

    @Override // defpackage.l91
    public int hashCode() {
        return this.c.hashCode();
    }
}
