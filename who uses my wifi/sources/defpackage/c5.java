package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c5 {
    public final int a;
    public final gw3 b;
    public final u4 c;
    public final String d;

    public c5(gw3 gw3Var, u4 u4Var, String str) {
        this.b = gw3Var;
        this.c = u4Var;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{gw3Var, u4Var, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj;
        return a30.c(this.b, c5Var.b) && a30.c(this.c, c5Var.c) && a30.c(this.d, c5Var.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
