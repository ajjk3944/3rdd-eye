package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rw1 {
    public final String a;
    public final double b;
    public final double c;
    public final double d;
    public final int e;

    public rw1(String str, double d, double d2, double d3, int i) {
        this.a = str;
        this.c = d;
        this.b = d2;
        this.d = d3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rw1)) {
            return false;
        }
        rw1 rw1Var = (rw1) obj;
        return a30.c(this.a, rw1Var.a) && this.b == rw1Var.b && this.c == rw1Var.c && this.e == rw1Var.e && Double.compare(this.d, rw1Var.d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Double.valueOf(this.b), Double.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        gw3 gw3Var = new gw3(this);
        gw3Var.m(this.a, "name");
        gw3Var.m(Double.valueOf(this.c), "minBound");
        gw3Var.m(Double.valueOf(this.b), "maxBound");
        gw3Var.m(Double.valueOf(this.d), "percent");
        gw3Var.m(Integer.valueOf(this.e), "count");
        return gw3Var.toString();
    }
}
