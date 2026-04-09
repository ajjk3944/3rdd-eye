package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yg0 {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg0)) {
            return false;
        }
        yg0 yg0Var = (yg0) obj;
        return this.a == yg0Var.a && this.b == yg0Var.b && this.c == yg0Var.c && this.d == yg0Var.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int hashCode() {
        ?? r0 = this.a;
        int i = r0;
        if (this.b) {
            i = r0 + 16;
        }
        int i2 = i;
        if (this.c) {
            i2 = i + 256;
        }
        return this.d ? i2 + 4096 : i2;
    }

    public final String toString() {
        return "[ Connected=" + this.a + " Validated=" + this.b + " Metered=" + this.c + " NotRoaming=" + this.d + " ]";
    }
}
