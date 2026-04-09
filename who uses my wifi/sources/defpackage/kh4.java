package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kh4 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public kh4(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final kh4 a(Object obj) {
        return this.a.equals(obj) ? this : new kh4(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh4)) {
            return false;
        }
        kh4 kh4Var = (kh4) obj;
        return this.a.equals(kh4Var.a) && this.b == kh4Var.b && this.c == kh4Var.c && this.d == kh4Var.d && this.e == kh4Var.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public kh4(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public kh4(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
