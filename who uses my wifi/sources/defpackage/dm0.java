package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dm0 {
    public final int a;
    public final int b;
    public final String c;

    public dm0(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.J;
        this.b = preference.K;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dm0)) {
            return false;
        }
        dm0 dm0Var = (dm0) obj;
        return this.a == dm0Var.a && this.b == dm0Var.b && TextUtils.equals(this.c, dm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((527 + this.a) * 31) + this.b) * 31);
    }
}
