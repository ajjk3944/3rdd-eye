package cv;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class c0 extends j {

    /* renamed from: x, reason: collision with root package name */
    public final transient byte[][] f6694x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int[] f6695y;

    public c0(byte[][] bArr, int[] iArr) {
        super(j.f6715r.f6716a);
        this.f6694x = bArr;
        this.f6695y = iArr;
    }

    @Override // cv.j
    public final String a() {
        throw null;
    }

    @Override // cv.j
    public final j c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f6694x;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f6695y;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            messageDigest.update(bArr[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        br.l.b(bArrDigest);
        return new j(bArrDigest);
    }

    @Override // cv.j
    public final int d() {
        return this.f6695y[this.f6694x.length - 1];
    }

    @Override // cv.j
    public final String e() {
        return t().e();
    }

    @Override // cv.j
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (jVar.d() == d() && m(0, jVar, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // cv.j
    public final int f(int i10, byte[] bArr) {
        br.l.e(bArr, "other");
        return t().f(i10, bArr);
    }

    @Override // cv.j
    public final byte[] h() {
        return s();
    }

    @Override // cv.j
    public final int hashCode() {
        int i10 = this.f6717d;
        if (i10 != 0) {
            return i10;
        }
        byte[][] bArr = this.f6694x;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int[] iArr = this.f6695y;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            byte[] bArr2 = bArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr2[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f6717d = i12;
        return i12;
    }

    @Override // cv.j
    public final byte i(int i10) {
        byte[][] bArr = this.f6694x;
        int length = bArr.length - 1;
        int[] iArr = this.f6695y;
        xu.l.e(iArr[length], i10, 1L);
        int iG = dv.b.g(this, i10);
        return bArr[iG][(i10 - (iG == 0 ? 0 : iArr[iG - 1])) + iArr[bArr.length + iG]];
    }

    @Override // cv.j
    public final int j(byte[] bArr) {
        br.l.e(bArr, "other");
        return t().j(bArr);
    }

    @Override // cv.j
    public final boolean l(int i10, int i11, int i12, byte[] bArr) {
        br.l.e(bArr, "other");
        if (i10 < 0 || i10 > d() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iG = dv.b.g(this, i10);
        while (i10 < i13) {
            int[] iArr = this.f6695y;
            int i14 = iG == 0 ? 0 : iArr[iG - 1];
            int i15 = iArr[iG] - i14;
            byte[][] bArr2 = this.f6694x;
            int i16 = iArr[bArr2.length + iG];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!xu.l.c((i10 - i14) + i16, i11, iMin, bArr2[iG], bArr)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iG++;
        }
        return true;
    }

    @Override // cv.j
    public final boolean m(int i10, j jVar, int i11) {
        br.l.e(jVar, "other");
        if (i10 >= 0 && i10 <= d() - i11) {
            int i12 = i11 + i10;
            int iG = dv.b.g(this, i10);
            int i13 = 0;
            while (i10 < i12) {
                int[] iArr = this.f6695y;
                int i14 = iG == 0 ? 0 : iArr[iG - 1];
                int i15 = iArr[iG] - i14;
                byte[][] bArr = this.f6694x;
                int i16 = iArr[bArr.length + iG];
                int iMin = Math.min(i12, i15 + i14) - i10;
                if (jVar.l(i13, (i10 - i14) + i16, iMin, bArr[iG])) {
                    i13 += iMin;
                    i10 += iMin;
                    iG++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // cv.j
    public final j n(int i10, int i11) {
        if (i11 == -1234567890) {
            i11 = d();
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(h0.b.m("beginIndex=", i10, " < 0").toString());
        }
        if (i11 > d()) {
            StringBuilder sbU = h0.b.u("endIndex=", i11, " > length(");
            sbU.append(d());
            sbU.append(')');
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        int i12 = i11 - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(h0.b.l("endIndex=", i11, i10, " < beginIndex=").toString());
        }
        if (i10 == 0 && i11 == d()) {
            return this;
        }
        if (i10 == i11) {
            return j.f6715r;
        }
        int iG = dv.b.g(this, i10);
        int iG2 = dv.b.g(this, i11 - 1);
        byte[][] bArr = this.f6694x;
        byte[][] bArr2 = (byte[][]) mq.l.h0(bArr, iG, iG2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f6695y;
        if (iG <= iG2) {
            int i13 = iG;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(iArr2[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr2.length] = iArr2[bArr.length + i13];
                if (i13 == iG2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iG != 0 ? iArr2[iG - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i10 - i16) + iArr[length];
        return new c0(bArr2, iArr);
    }

    @Override // cv.j
    public final j p() {
        return t().p();
    }

    @Override // cv.j
    public final void r(g gVar, int i10) {
        int iG = dv.b.g(this, 0);
        int i11 = 0;
        while (i11 < i10) {
            int[] iArr = this.f6695y;
            int i12 = iG == 0 ? 0 : iArr[iG - 1];
            int i13 = iArr[iG] - i12;
            byte[][] bArr = this.f6694x;
            int i14 = iArr[bArr.length + iG];
            int iMin = Math.min(i10, i13 + i12) - i11;
            int i15 = (i11 - i12) + i14;
            a0 a0Var = new a0(bArr[iG], i15, i15 + iMin, true);
            a0 a0Var2 = gVar.f6705a;
            if (a0Var2 == null) {
                a0Var.f6684g = a0Var;
                a0Var.f6683f = a0Var;
                gVar.f6705a = a0Var;
            } else {
                a0 a0Var3 = a0Var2.f6684g;
                br.l.b(a0Var3);
                a0Var3.b(a0Var);
            }
            i11 += iMin;
            iG++;
        }
        gVar.f6706d += i10;
    }

    public final byte[] s() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f6694x;
        int length = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f6695y;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            mq.l.a0(i12, i13, i13 + i15, bArr2[i10], bArr);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public final j t() {
        return new j(s());
    }

    @Override // cv.j
    public final String toString() {
        return t().toString();
    }
}
