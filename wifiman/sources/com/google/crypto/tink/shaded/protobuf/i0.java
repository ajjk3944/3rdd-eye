package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.o0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: f, reason: collision with root package name */
    private static final i0 f38534f = new i0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f38535a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f38536b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f38537c;

    /* renamed from: d, reason: collision with root package name */
    private int f38538d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f38539e;

    private i0() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i10) {
        int[] iArr = this.f38536b;
        if (i10 > iArr.length) {
            int i11 = this.f38535a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f38536b = Arrays.copyOf(iArr, i10);
            this.f38537c = Arrays.copyOf(this.f38537c, i10);
        }
    }

    public static i0 c() {
        return f38534f;
    }

    private static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int g(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    static i0 j(i0 i0Var, i0 i0Var2) {
        int i10 = i0Var.f38535a + i0Var2.f38535a;
        int[] iArrCopyOf = Arrays.copyOf(i0Var.f38536b, i10);
        System.arraycopy(i0Var2.f38536b, 0, iArrCopyOf, i0Var.f38535a, i0Var2.f38535a);
        Object[] objArrCopyOf = Arrays.copyOf(i0Var.f38537c, i10);
        System.arraycopy(i0Var2.f38537c, 0, objArrCopyOf, i0Var.f38535a, i0Var2.f38535a);
        return new i0(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static i0 k() {
        return new i0();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i10, Object obj, o0 o0Var) {
        int iA = n0.a(i10);
        int iB = n0.b(i10);
        if (iB == 0) {
            o0Var.n(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            o0Var.h(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            o0Var.O(iA, (AbstractC5081h) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.h());
            }
            o0Var.d(iA, ((Integer) obj).intValue());
        } else if (o0Var.i() == o0.a.ASCENDING) {
            o0Var.q(iA);
            ((i0) obj).r(o0Var);
            o0Var.B(iA);
        } else {
            o0Var.B(iA);
            ((i0) obj).r(o0Var);
            o0Var.q(iA);
        }
    }

    void a() {
        if (!this.f38539e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iO;
        int i10 = this.f38538d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f38535a; i12++) {
            int i13 = this.f38536b[i12];
            int iA = n0.a(i13);
            int iB = n0.b(i13);
            if (iB == 0) {
                iO = CodedOutputStream.O(iA, ((Long) this.f38537c[i12]).longValue());
            } else if (iB == 1) {
                iO = CodedOutputStream.n(iA, ((Long) this.f38537c[i12]).longValue());
            } else if (iB == 2) {
                iO = CodedOutputStream.f(iA, (AbstractC5081h) this.f38537c[i12]);
            } else if (iB == 3) {
                iO = (CodedOutputStream.L(iA) * 2) + ((i0) this.f38537c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.h());
                }
                iO = CodedOutputStream.l(iA, ((Integer) this.f38537c[i12]).intValue());
            }
            i11 += iO;
        }
        this.f38538d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f38538d;
        if (i10 != -1) {
            return i10;
        }
        int iA = 0;
        for (int i11 = 0; i11 < this.f38535a; i11++) {
            iA += CodedOutputStream.A(n0.a(this.f38536b[i11]), (AbstractC5081h) this.f38537c[i11]);
        }
        this.f38538d = iA;
        return iA;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        int i10 = this.f38535a;
        return i10 == i0Var.f38535a && o(this.f38536b, i0Var.f38536b, i10) && l(this.f38537c, i0Var.f38537c, this.f38535a);
    }

    public void h() {
        this.f38539e = false;
    }

    public int hashCode() {
        int i10 = this.f38535a;
        return ((((527 + i10) * 31) + f(this.f38536b, i10)) * 31) + g(this.f38537c, this.f38535a);
    }

    i0 i(i0 i0Var) {
        if (i0Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f38535a + i0Var.f38535a;
        b(i10);
        System.arraycopy(i0Var.f38536b, 0, this.f38536b, this.f38535a, i0Var.f38535a);
        System.arraycopy(i0Var.f38537c, 0, this.f38537c, this.f38535a, i0Var.f38535a);
        this.f38535a = i10;
        return this;
    }

    final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f38535a; i11++) {
            O.d(sb2, i10, String.valueOf(n0.a(this.f38536b[i11])), this.f38537c[i11]);
        }
    }

    void n(int i10, Object obj) {
        a();
        b(this.f38535a + 1);
        int[] iArr = this.f38536b;
        int i11 = this.f38535a;
        iArr[i11] = i10;
        this.f38537c[i11] = obj;
        this.f38535a = i11 + 1;
    }

    void p(o0 o0Var) {
        if (o0Var.i() == o0.a.DESCENDING) {
            for (int i10 = this.f38535a - 1; i10 >= 0; i10--) {
                o0Var.c(n0.a(this.f38536b[i10]), this.f38537c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f38535a; i11++) {
            o0Var.c(n0.a(this.f38536b[i11]), this.f38537c[i11]);
        }
    }

    public void r(o0 o0Var) {
        if (this.f38535a == 0) {
            return;
        }
        if (o0Var.i() == o0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f38535a; i10++) {
                q(this.f38536b[i10], this.f38537c[i10], o0Var);
            }
            return;
        }
        for (int i11 = this.f38535a - 1; i11 >= 0; i11--) {
            q(this.f38536b[i11], this.f38537c[i11], o0Var);
        }
    }

    private i0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f38538d = -1;
        this.f38535a = i10;
        this.f38536b = iArr;
        this.f38537c = objArr;
        this.f38539e = z10;
    }
}
