package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w34 {
    public final String a;
    public final ph4 b;
    public final ph4 c;
    public final int d;
    public final int e;

    public w34(String str, ph4 ph4Var, ph4 ph4Var2, int i, int i2) {
        boolean z;
        if (i != 0) {
            z = false;
            if (i2 == 0) {
                i2 = 0;
                z = true;
            }
        } else {
            z = true;
        }
        zt0.D(z);
        zt0.D(true ^ TextUtils.isEmpty(str));
        this.a = str;
        this.b = ph4Var;
        ph4Var2.getClass();
        this.c = ph4Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w34.class == obj.getClass()) {
            w34 w34Var = (w34) obj;
            if (this.d == w34Var.d && this.e == w34Var.e && this.a.equals(w34Var.a) && this.b.equals(w34Var.b) && this.c.equals(w34Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + ((((this.d + 527) * 31) + this.e) * 31)) * 31)) * 31);
    }
}
