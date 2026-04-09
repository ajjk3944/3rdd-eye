package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: f, reason: collision with root package name */
    private static final j0 f30898f = new j0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f30899a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f30900b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f30901c;

    /* renamed from: d, reason: collision with root package name */
    private int f30902d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30903e;

    private j0() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i10 = this.f30899a;
        int[] iArr = this.f30900b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f30900b = Arrays.copyOf(iArr, i11);
            this.f30901c = Arrays.copyOf(this.f30901c, i11);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public static j0 e() {
        return f30898f;
    }

    private static int h(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int i(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    static j0 k(j0 j0Var, j0 j0Var2) {
        int i10 = j0Var.f30899a + j0Var2.f30899a;
        int[] iArrCopyOf = Arrays.copyOf(j0Var.f30900b, i10);
        System.arraycopy(j0Var2.f30900b, 0, iArrCopyOf, j0Var.f30899a, j0Var2.f30899a);
        Object[] objArrCopyOf = Arrays.copyOf(j0Var.f30901c, i10);
        System.arraycopy(j0Var2.f30901c, 0, objArrCopyOf, j0Var.f30899a, j0Var2.f30899a);
        return new j0(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static j0 l() {
        return new j0();
    }

    private static void p(int i10, Object obj, p0 p0Var) {
        int iA = o0.a(i10);
        int iB = o0.b(i10);
        if (iB == 0) {
            p0Var.n(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            p0Var.h(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            p0Var.L(iA, (AbstractC3971g) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.g());
            }
            p0Var.d(iA, ((Integer) obj).intValue());
        } else if (p0Var.i() == p0.a.ASCENDING) {
            p0Var.q(iA);
            ((j0) obj).q(p0Var);
            p0Var.B(iA);
        } else {
            p0Var.B(iA);
            ((j0) obj).q(p0Var);
            p0Var.q(iA);
        }
    }

    void a() {
        if (!this.f30903e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        int i10 = this.f30899a;
        return i10 == j0Var.f30899a && c(this.f30900b, j0Var.f30900b, i10) && d(this.f30901c, j0Var.f30901c, this.f30899a);
    }

    public int f() {
        int iS;
        int i10 = this.f30902d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f30899a; i12++) {
            int i13 = this.f30900b[i12];
            int iA = o0.a(i13);
            int iB = o0.b(i13);
            if (iB == 0) {
                iS = CodedOutputStream.S(iA, ((Long) this.f30901c[i12]).longValue());
            } else if (iB == 1) {
                iS = CodedOutputStream.n(iA, ((Long) this.f30901c[i12]).longValue());
            } else if (iB == 2) {
                iS = CodedOutputStream.f(iA, (AbstractC3971g) this.f30901c[i12]);
            } else if (iB == 3) {
                iS = (CodedOutputStream.P(iA) * 2) + ((j0) this.f30901c[i12]).f();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.g());
                }
                iS = CodedOutputStream.l(iA, ((Integer) this.f30901c[i12]).intValue());
            }
            i11 += iS;
        }
        this.f30902d = i11;
        return i11;
    }

    public int g() {
        int i10 = this.f30902d;
        if (i10 != -1) {
            return i10;
        }
        int iD = 0;
        for (int i11 = 0; i11 < this.f30899a; i11++) {
            iD += CodedOutputStream.D(o0.a(this.f30900b[i11]), (AbstractC3971g) this.f30901c[i11]);
        }
        this.f30902d = iD;
        return iD;
    }

    public int hashCode() {
        int i10 = this.f30899a;
        return ((((527 + i10) * 31) + h(this.f30900b, i10)) * 31) + i(this.f30901c, this.f30899a);
    }

    public void j() {
        this.f30903e = false;
    }

    final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f30899a; i11++) {
            O.c(sb2, i10, String.valueOf(o0.a(this.f30900b[i11])), this.f30901c[i11]);
        }
    }

    void n(int i10, Object obj) {
        a();
        b();
        int[] iArr = this.f30900b;
        int i11 = this.f30899a;
        iArr[i11] = i10;
        this.f30901c[i11] = obj;
        this.f30899a = i11 + 1;
    }

    void o(p0 p0Var) {
        if (p0Var.i() == p0.a.DESCENDING) {
            for (int i10 = this.f30899a - 1; i10 >= 0; i10--) {
                p0Var.c(o0.a(this.f30900b[i10]), this.f30901c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f30899a; i11++) {
            p0Var.c(o0.a(this.f30900b[i11]), this.f30901c[i11]);
        }
    }

    public void q(p0 p0Var) {
        if (this.f30899a == 0) {
            return;
        }
        if (p0Var.i() == p0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f30899a; i10++) {
                p(this.f30900b[i10], this.f30901c[i10], p0Var);
            }
            return;
        }
        for (int i11 = this.f30899a - 1; i11 >= 0; i11--) {
            p(this.f30900b[i11], this.f30901c[i11], p0Var);
        }
    }

    private j0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f30902d = -1;
        this.f30899a = i10;
        this.f30900b = iArr;
        this.f30901c = objArr;
        this.f30903e = z10;
    }
}
