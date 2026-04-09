package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c42 {
    public final int a;
    public final d02 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = v23.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public c42(d02 d02Var, boolean z, int[] iArr, boolean[] zArr) {
        int i = d02Var.a;
        this.a = i;
        zt0.D(i == iArr.length && i == zArr.length);
        this.b = d02Var;
        this.c = z && i > 1;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c42.class == obj.getClass()) {
            c42 c42Var = (c42) obj;
            if (this.c == c42Var.c && this.b.equals(c42Var.b) && Arrays.equals(this.d, c42Var.d) && Arrays.equals(this.e, c42Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
