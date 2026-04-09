package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rh1 extends wh1 {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final wh1[] g;

    public rh1(String str, int i, int i2, long j, long j2, wh1[] wh1VarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = wh1VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rh1.class == obj.getClass()) {
            rh1 rh1Var = (rh1) obj;
            if (this.c == rh1Var.c && this.d == rh1Var.d && this.e == rh1Var.e && this.f == rh1Var.f && Objects.equals(this.b, rh1Var.b) && Arrays.equals(this.g, rh1Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((this.c + 527) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
