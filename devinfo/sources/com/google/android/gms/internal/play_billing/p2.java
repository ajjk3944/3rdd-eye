package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.d7;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p2 {

    /* renamed from: f, reason: collision with root package name */
    public static final p2 f20207f = new p2(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f20208a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f20209b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f20210c;

    /* renamed from: d, reason: collision with root package name */
    public int f20211d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20212e;

    public p2(int i4, int[] iArr, Object[] objArr, boolean z3) {
        this.f20208a = i4;
        this.f20209b = iArr;
        this.f20210c = objArr;
        this.f20212e = z3;
    }

    public static p2 b() {
        return new p2(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iW;
        int iX;
        int iW2;
        int i4 = this.f20211d;
        if (i4 != -1) {
            return i4;
        }
        int iY = 0;
        for (int i10 = 0; i10 < this.f20208a; i10++) {
            int i11 = this.f20209b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.f20210c[i10]).getClass();
                    iW2 = h1.W(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    g1 g1Var = (g1) this.f20210c[i10];
                    int iW3 = h1.W(i14);
                    int iD = g1Var.d();
                    iY = d7.y(iD, iD, iW3, iY);
                } else if (i13 == 3) {
                    int iW4 = h1.W(i12 << 3);
                    iW = iW4 + iW4;
                    iX = ((p2) this.f20210c[i10]).a();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(new v1());
                    }
                    ((Integer) this.f20210c[i10]).getClass();
                    iW2 = h1.W(i12 << 3) + 4;
                }
                iY = iW2 + iY;
            } else {
                int i15 = i12 << 3;
                long jLongValue = ((Long) this.f20210c[i10]).longValue();
                iW = h1.W(i15);
                iX = h1.X(jLongValue);
            }
            iY = iX + iW + iY;
        }
        this.f20211d = iY;
        return iY;
    }

    public final void c(int i4, Object obj) {
        if (!this.f20212e) {
            throw new UnsupportedOperationException();
        }
        e(this.f20208a + 1);
        int[] iArr = this.f20209b;
        int i10 = this.f20208a;
        iArr[i10] = i4;
        this.f20210c[i10] = obj;
        this.f20208a = i10 + 1;
    }

    public final void d(a2 a2Var) {
        if (this.f20208a != 0) {
            for (int i4 = 0; i4 < this.f20208a; i4++) {
                int i10 = this.f20209b[i4];
                Object obj = this.f20210c[i4];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    ((h1) a2Var.f20082a).k0(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    ((h1) a2Var.f20082a).c0(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    ((h1) a2Var.f20082a).Z(i12, (g1) obj);
                } else if (i11 == 3) {
                    ((h1) a2Var.f20082a).h0(i12, 3);
                    ((p2) obj).d(a2Var);
                    ((h1) a2Var.f20082a).h0(i12, 4);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(new v1());
                    }
                    ((h1) a2Var.f20082a).a0(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i4) {
        int[] iArr = this.f20209b;
        if (i4 > iArr.length) {
            int i10 = this.f20208a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i4) {
                i4 = i11;
            }
            if (i4 < 8) {
                i4 = 8;
            }
            this.f20209b = Arrays.copyOf(iArr, i4);
            this.f20210c = Arrays.copyOf(this.f20210c, i4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        int i4 = this.f20208a;
        if (i4 == p2Var.f20208a) {
            int[] iArr = this.f20209b;
            int[] iArr2 = p2Var.f20209b;
            int i10 = 0;
            while (true) {
                if (i10 >= i4) {
                    Object[] objArr = this.f20210c;
                    Object[] objArr2 = p2Var.f20210c;
                    int i11 = this.f20208a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
                if (iArr[i10] != iArr2[i10]) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f20208a;
        int i10 = i4 + 527;
        int[] iArr = this.f20209b;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i4; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = ((i10 * 31) + i11) * 31;
        Object[] objArr = this.f20210c;
        int i14 = this.f20208a;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }
}
