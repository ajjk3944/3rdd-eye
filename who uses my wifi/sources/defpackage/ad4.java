package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ad4 {
    public final long a;
    public final oz1 b;
    public final int c;
    public final kh4 d;
    public final long e;
    public final oz1 f;
    public final int g;
    public final kh4 h;
    public final long i;
    public final long j;

    public ad4(long j, oz1 oz1Var, int i, kh4 kh4Var, long j2, oz1 oz1Var2, int i2, kh4 kh4Var2, long j3, long j4) {
        this.a = j;
        this.b = oz1Var;
        this.c = i;
        this.d = kh4Var;
        this.e = j2;
        this.f = oz1Var2;
        this.g = i2;
        this.h = kh4Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ad4.class == obj.getClass()) {
            ad4 ad4Var = (ad4) obj;
            if (this.a == ad4Var.a && this.c == ad4Var.c && this.e == ad4Var.e && this.g == ad4Var.g && this.i == ad4Var.i && this.j == ad4Var.j && Objects.equals(this.b, ad4Var.b) && Objects.equals(this.d, ad4Var.d) && Objects.equals(this.f, ad4Var.f) && Objects.equals(this.h, ad4Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
