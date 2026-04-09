package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yb1 {
    public final c5 a;
    public final ju b;

    public /* synthetic */ yb1(c5 c5Var, ju juVar) {
        this.a = c5Var;
        this.b = juVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof yb1)) {
            yb1 yb1Var = (yb1) obj;
            if (a30.c(this.a, yb1Var.a) && a30.c(this.b, yb1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        gw3 gw3Var = new gw3(this);
        gw3Var.m(this.a, "key");
        gw3Var.m(this.b, "feature");
        return gw3Var.toString();
    }
}
