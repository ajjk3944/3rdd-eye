package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lg4 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public lg4(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != lg4.class) {
            return false;
        }
        lg4 lg4Var = (lg4) obj;
        return TextUtils.equals(this.a, lg4Var.a) && this.b == lg4Var.b && this.c == lg4Var.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 31) * 31) + (true != this.b ? 1237 : 1231)) * 31) + (true != this.c ? 1237 : 1231);
    }
}
