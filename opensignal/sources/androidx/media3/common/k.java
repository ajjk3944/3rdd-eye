package androidx.media3.common;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k implements i {
    public static final String B;
    public static final String D;
    public static final String E;
    public static final ab.c F;

    /* renamed from: y, reason: collision with root package name */
    public static final String f1708y;

    /* renamed from: a, reason: collision with root package name */
    public final int f1709a;

    /* renamed from: d, reason: collision with root package name */
    public final int f1710d;

    /* renamed from: g, reason: collision with root package name */
    public final int f1711g;

    /* renamed from: r, reason: collision with root package name */
    public final byte[] f1712r;

    /* renamed from: x, reason: collision with root package name */
    public int f1713x;

    static {
        int i10 = a5.d0.f105a;
        f1708y = Integer.toString(0, 36);
        B = Integer.toString(1, 36);
        D = Integer.toString(2, 36);
        E = Integer.toString(3, 36);
        F = new ab.c(3);
    }

    public k(int i10, int i11, int i12, byte[] bArr) {
        this.f1709a = i10;
        this.f1710d = i11;
        this.f1711g = i12;
        this.f1712r = bArr;
    }

    public static int a(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f1709a == kVar.f1709a && this.f1710d == kVar.f1710d && this.f1711g == kVar.f1711g && Arrays.equals(this.f1712r, kVar.f1712r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1713x == 0) {
            this.f1713x = Arrays.hashCode(this.f1712r) + ((((((527 + this.f1709a) * 31) + this.f1710d) * 31) + this.f1711g) * 31);
        }
        return this.f1713x;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f1709a);
        sb2.append(", ");
        sb2.append(this.f1710d);
        sb2.append(", ");
        sb2.append(this.f1711g);
        sb2.append(", ");
        sb2.append(this.f1712r != null);
        sb2.append(")");
        return sb2.toString();
    }
}
