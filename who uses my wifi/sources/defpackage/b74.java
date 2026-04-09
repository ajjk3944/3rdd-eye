package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b74 {
    public static final b74 f = new b74(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public b74(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static b74 a() {
        return new b74(0, new int[8], new Object[8], true);
    }

    public final void b(it3 it3Var) {
        g54 g54Var = (g54) it3Var.g;
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    g54Var.M(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    g54Var.O(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    g54Var.R(i4, (a54) obj);
                } else if (i3 == 3) {
                    g54Var.I(i4, 3);
                    ((b74) obj).b(it3Var);
                    g54Var.I(i4, 4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new z54());
                    }
                    g54Var.L(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int iD;
        int iE;
        int iD2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iR = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.c[i2]).getClass();
                    iD2 = g54.D(i4 << 3) + 8;
                } else if (i5 == 2) {
                    int i6 = i4 << 3;
                    a54 a54Var = (a54) this.c[i2];
                    int iD3 = g54.D(i6);
                    int iD4 = a54Var.d();
                    iR = ga1.r(iD4, iD4, iD3, iR);
                } else if (i5 == 3) {
                    int iD5 = g54.D(i4 << 3);
                    iD = iD5 + iD5;
                    iE = ((b74) this.c[i2]).c();
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException(new z54());
                    }
                    ((Integer) this.c[i2]).getClass();
                    iD2 = g54.D(i4 << 3) + 4;
                }
                iR = iD2 + iR;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.c[i2]).longValue();
                iD = g54.D(i7);
                iE = g54.E(jLongValue);
            }
            iR = iE + iD + iR;
        }
        this.d = iR;
        return iR;
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        e(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b74)) {
            return false;
        }
        b74 b74Var = (b74) obj;
        int i = this.a;
        if (i == b74Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = b74Var.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = b74Var.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
