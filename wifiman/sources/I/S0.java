package I;

/* loaded from: classes.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    private int[] f8080a = T0.a(10);

    /* renamed from: b, reason: collision with root package name */
    private int f8081b;

    private final long a(int i10, boolean z10) {
        int i11;
        int[] iArr = this.f8080a;
        int i12 = this.f8081b;
        if (i12 < 0) {
            i11 = i10;
        } else if (z10) {
            int i13 = 0;
            int iMin = i10;
            while (i13 < i12) {
                int i14 = i13 * 3;
                int i15 = iArr[i14];
                int i16 = iArr[i14 + 1];
                int i17 = iArr[i14 + 2];
                long jD = d(iMin, i15, i16, i17, z10);
                long jD2 = d(i10, i15, i16, i17, z10);
                i13++;
                iMin = Math.min(L0.S.n(jD), L0.S.n(jD2));
                i10 = Math.max(L0.S.i(jD), L0.S.i(jD2));
            }
            i11 = i10;
            i10 = iMin;
        } else {
            int i18 = i12 - 1;
            int iMin2 = i10;
            while (-1 < i18) {
                int i19 = i18 * 3;
                int i20 = iArr[i19];
                int i21 = iArr[i19 + 1];
                int i22 = iArr[i19 + 2];
                long jD3 = d(iMin2, i20, i21, i22, z10);
                long jD4 = d(i10, i20, i21, i22, z10);
                i18--;
                iMin2 = Math.min(L0.S.n(jD3), L0.S.n(jD4));
                i10 = Math.max(L0.S.i(jD3), L0.S.i(jD4));
            }
            i11 = i10;
            i10 = iMin2;
        }
        return L0.T.b(i10, i11);
    }

    private final long d(int i10, int i11, int i12, int i13, boolean z10) {
        int i14 = z10 ? i12 : i13;
        if (z10) {
            i12 = i13;
        }
        return i10 < i11 ? L0.T.a(i10) : i10 == i11 ? i14 == 0 ? L0.T.b(i11, i12 + i11) : L0.T.a(i11) : i10 < i11 + i14 ? i12 == 0 ? L0.T.a(i11) : L0.T.b(i11, i12 + i11) : L0.T.a((i10 - i14) + i12);
    }

    public final long b(int i10) {
        return a(i10, false);
    }

    public final long c(int i10) {
        return a(i10, true);
    }

    public final void e(int i10, int i11, int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException(("Expected newLen to be ≥ 0, was " + i12).toString());
        }
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(iMin, i11) - iMin;
        if (iMax >= 2 || iMax != i12) {
            int i13 = this.f8081b + 1;
            if (i13 > T0.d(this.f8080a)) {
                this.f8080a = T0.c(this.f8080a, Math.max(i13 * 2, T0.d(this.f8080a) * 2));
            }
            T0.e(this.f8080a, this.f8081b, iMin, iMax, i12);
            this.f8081b = i13;
        }
    }
}
