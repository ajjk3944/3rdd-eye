package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zh1 extends wh1 {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public zh1(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zh1.class == obj.getClass()) {
            zh1 zh1Var = (zh1) obj;
            if (this.b == zh1Var.b && this.c == zh1Var.c && this.d == zh1Var.d && Arrays.equals(this.e, zh1Var.e) && Arrays.equals(this.f, zh1Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((this.b + 527) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
