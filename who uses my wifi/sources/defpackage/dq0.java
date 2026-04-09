package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dq0 {
    public final Resources a;
    public final Resources.Theme b;

    public dq0(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dq0.class == obj.getClass()) {
            dq0 dq0Var = (dq0) obj;
            if (this.a.equals(dq0Var.a) && Objects.equals(this.b, dq0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
