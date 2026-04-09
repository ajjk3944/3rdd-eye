package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: f, reason: collision with root package name */
    public static final e1 f963f = new e1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f964a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f965b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f966c;

    /* renamed from: d, reason: collision with root package name */
    public int f967d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f968e;

    public e1(int i4, int[] iArr, Object[] objArr, boolean z3) {
        this.f964a = i4;
        this.f965b = iArr;
        this.f966c = objArr;
        this.f968e = z3;
    }

    public final void a(int i4) {
        int[] iArr = this.f965b;
        if (i4 > iArr.length) {
            int i10 = this.f964a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i4) {
                i4 = i11;
            }
            if (i4 < 8) {
                i4 = 8;
            }
            this.f965b = Arrays.copyOf(iArr, i4);
            this.f966c = Arrays.copyOf(this.f966c, i4);
        }
    }

    public final int b() {
        int iL;
        int iN;
        int iL2;
        int i4 = this.f967d;
        if (i4 != -1) {
            return i4;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f964a; i11++) {
            int i12 = this.f965b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f966c[i11]).getClass();
                    iL2 = m.L(i13) + 8;
                } else if (i14 == 2) {
                    iL2 = m.J(i13, (g) this.f966c[i11]);
                } else if (i14 == 3) {
                    iL = m.L(i13) * 2;
                    iN = ((e1) this.f966c[i11]).b();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(a0.b());
                    }
                    ((Integer) this.f966c[i11]).getClass();
                    iL2 = m.L(i13) + 4;
                }
                i10 = iL2 + i10;
            } else {
                long jLongValue = ((Long) this.f966c[i11]).longValue();
                iL = m.L(i13);
                iN = m.N(jLongValue);
            }
            i10 = iN + iL + i10;
        }
        this.f967d = i10;
        return i10;
    }

    public final void c(int i4, Object obj) {
        if (!this.f968e) {
            throw new UnsupportedOperationException();
        }
        a(this.f964a + 1);
        int[] iArr = this.f965b;
        int i10 = this.f964a;
        iArr[i10] = i4;
        this.f966c[i10] = obj;
        this.f964a = i10 + 1;
    }

    public final void d(g0 g0Var) {
        if (this.f964a == 0) {
            return;
        }
        g0Var.getClass();
        m mVar = (m) g0Var.f977a;
        for (int i4 = 0; i4 < this.f964a; i4++) {
            int i10 = this.f965b[i4];
            Object obj = this.f966c[i4];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                mVar.h0(i11, ((Long) obj).longValue());
            } else if (i12 == 1) {
                mVar.X(i11, ((Long) obj).longValue());
            } else if (i12 == 2) {
                mVar.T(i11, (g) obj);
            } else if (i12 == 3) {
                mVar.e0(i11, 3);
                ((e1) obj).d(g0Var);
                mVar.e0(i11, 4);
            } else {
                if (i12 != 5) {
                    throw new RuntimeException(a0.b());
                }
                mVar.V(i11, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        int i4 = this.f964a;
        if (i4 == e1Var.f964a) {
            int[] iArr = this.f965b;
            int[] iArr2 = e1Var.f965b;
            int i10 = 0;
            while (true) {
                if (i10 >= i4) {
                    Object[] objArr = this.f966c;
                    Object[] objArr2 = e1Var.f966c;
                    int i11 = this.f964a;
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
        int i4 = this.f964a;
        int i10 = (527 + i4) * 31;
        int[] iArr = this.f965b;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i4; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i10 + i11) * 31;
        Object[] objArr = this.f966c;
        int i14 = this.f964a;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }
}
