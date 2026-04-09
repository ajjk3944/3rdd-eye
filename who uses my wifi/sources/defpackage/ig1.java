package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ig1 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public ig1(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ig1.class == obj.getClass()) {
            ig1 ig1Var = (ig1) obj;
            if (this.a == ig1Var.a && this.c == ig1Var.c && this.d == ig1Var.d && Arrays.equals(this.b, ig1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
