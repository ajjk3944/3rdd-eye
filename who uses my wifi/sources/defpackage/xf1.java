package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xf1 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Serializable g;

    public boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i6 = i4 - 1;
        this.a = i2;
        this.g = i41.k[3 - i3];
        int i7 = i41.l[i5];
        this.c = i7;
        if (i2 == 2) {
            i7 /= 2;
            this.c = i7;
        } else if (i2 == 0) {
            i7 /= 4;
            this.c = i7;
        }
        int i8 = (i >>> 9) & 1;
        int i9 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                i9 = 384;
            }
        } else if (i2 != 3) {
            i9 = 576;
        }
        this.f = i9;
        if (i3 == 3) {
            int i10 = i2 == 3 ? i41.m[i6] : i41.n[i6];
            this.e = i10;
            this.b = (((i10 * 12) / i7) + i8) * 4;
        } else {
            if (i2 == 3) {
                int i11 = i3 == 2 ? i41.o[i6] : i41.p[i6];
                this.e = i11;
                this.b = ((i11 * 144) / i7) + i8;
            } else {
                int i12 = i41.q[i6];
                this.e = i12;
                this.b = (((i3 == 1 ? 72 : 144) * i12) / i7) + i8;
            }
        }
        this.d = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
