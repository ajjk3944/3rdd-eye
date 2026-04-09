package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class y20 {
    public static final y20 e = new y20(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public y20(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static y20 a(y20 y20Var, y20 y20Var2) {
        return b(Math.max(y20Var.a, y20Var2.a), Math.max(y20Var.b, y20Var2.b), Math.max(y20Var.c, y20Var2.c), Math.max(y20Var.d, y20Var2.d));
    }

    public static y20 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new y20(i, i2, i3, i4);
    }

    public static y20 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return x20.a(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y20.class != obj.getClass()) {
            return false;
        }
        y20 y20Var = (y20) obj;
        return this.d == y20Var.d && this.a == y20Var.a && this.c == y20Var.c && this.b == y20Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
