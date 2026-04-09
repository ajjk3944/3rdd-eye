package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class to3 implements Serializable {
    public static final to3 h = new to3(new int[0], 0);
    public final int[] f;
    public final int g;

    public to3(int[] iArr, int i) {
        this.f = iArr;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        to3 to3Var;
        int i;
        int i2;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof to3) && (i2 = this.g) == (i = (to3Var = (to3) obj).g)) {
            for (int i3 = 0; i3 < i2; i3++) {
                zt0.e0(i3, i2);
                int i4 = this.f[i3];
                zt0.e0(i3, i);
                if (i4 == to3Var.f[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i = 0; i < this.g; i++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.f[i]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i = this.g;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.f;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
