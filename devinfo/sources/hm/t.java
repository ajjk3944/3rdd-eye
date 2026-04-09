package hm;

import java.nio.charset.Charset;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t extends h {

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f25215e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f25216f;

    public t(byte[][] bArr, int[] iArr) {
        super(h.f25175d.f25176a);
        this.f25215e = bArr;
        this.f25216f = iArr;
    }

    @Override // hm.h
    public final int a() {
        return this.f25216f[this.f25215e.length - 1];
    }

    @Override // hm.h
    public final String b() {
        return new h(l()).b();
    }

    @Override // hm.h
    public final byte[] c() {
        return l();
    }

    @Override // hm.h
    public final byte d(int i4) {
        byte[][] bArr = this.f25215e;
        int length = bArr.length - 1;
        int[] iArr = this.f25216f;
        i0.d(iArr[length], i4, 1L);
        int iB = im.b.b(this, i4);
        return bArr[iB][(i4 - (iB == 0 ? 0 : iArr[iB - 1])) + iArr[bArr.length + iB]];
    }

    @Override // hm.h
    public final boolean e(int i4, byte[] bArr, int i10, int i11) {
        nk.k.e(bArr, "other");
        if (i4 < 0 || i4 > a() - i11 || i10 < 0 || i10 > bArr.length - i11) {
            return false;
        }
        int i12 = i11 + i4;
        int iB = im.b.b(this, i4);
        while (i4 < i12) {
            int[] iArr = this.f25216f;
            int i13 = iB == 0 ? 0 : iArr[iB - 1];
            int i14 = iArr[iB] - i13;
            byte[][] bArr2 = this.f25215e;
            int i15 = iArr[bArr2.length + iB];
            int iMin = Math.min(i12, i14 + i13) - i4;
            if (!i0.b(bArr2[iB], (i4 - i13) + i15, bArr, i10, iMin)) {
                return false;
            }
            i10 += iMin;
            i4 += iMin;
            iB++;
        }
        return true;
    }

    @Override // hm.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.a() == a() && f(hVar, a());
    }

    @Override // hm.h
    public final boolean f(h hVar, int i4) {
        nk.k.e(hVar, "other");
        if (a() - i4 >= 0) {
            int iB = im.b.b(this, 0);
            int i10 = 0;
            int i11 = 0;
            while (i10 < i4) {
                int[] iArr = this.f25216f;
                int i12 = iB == 0 ? 0 : iArr[iB - 1];
                int i13 = iArr[iB] - i12;
                byte[][] bArr = this.f25215e;
                int i14 = iArr[bArr.length + iB];
                int iMin = Math.min(i4, i13 + i12) - i10;
                if (hVar.e(i11, bArr[iB], (i10 - i12) + i14, iMin)) {
                    i11 += iMin;
                    i10 += iMin;
                    iB++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // hm.h
    public final String g(Charset charset) {
        nk.k.e(charset, "charset");
        return new h(l()).g(charset);
    }

    @Override // hm.h
    public final h h(int i4, int i10) {
        if (i10 == -1234567890) {
            i10 = a();
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(r5.c.h(i4, "beginIndex=", " < 0").toString());
        }
        if (i10 > a()) {
            StringBuilder sbW = je.u.w(i10, "endIndex=", " > length(");
            sbW.append(a());
            sbW.append(')');
            throw new IllegalArgumentException(sbW.toString().toString());
        }
        int i11 = i10 - i4;
        if (i11 < 0) {
            throw new IllegalArgumentException(a0.g.i(i10, i4, "endIndex=", " < beginIndex=").toString());
        }
        if (i4 == 0 && i10 == a()) {
            return this;
        }
        if (i4 == i10) {
            return h.f25175d;
        }
        int iB = im.b.b(this, i4);
        int iB2 = im.b.b(this, i10 - 1);
        byte[][] bArr = this.f25215e;
        byte[][] bArr2 = (byte[][]) zj.m.T(bArr, iB, iB2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f25216f;
        if (iB <= iB2) {
            int i12 = iB;
            int i13 = 0;
            while (true) {
                iArr[i13] = Math.min(iArr2[i12] - i4, i11);
                int i14 = i13 + 1;
                iArr[i13 + bArr2.length] = iArr2[bArr.length + i12];
                if (i12 == iB2) {
                    break;
                }
                i12++;
                i13 = i14;
            }
        }
        int i15 = iB != 0 ? iArr2[iB - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i4 - i15) + iArr[length];
        return new t(bArr2, iArr);
    }

    @Override // hm.h
    public final int hashCode() {
        int i4 = this.f25177b;
        if (i4 != 0) {
            return i4;
        }
        byte[][] bArr = this.f25215e;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f25216f;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            byte[] bArr2 = bArr[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr2[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        this.f25177b = i11;
        return i11;
    }

    @Override // hm.h
    public final h i() {
        return new h(l()).i();
    }

    @Override // hm.h
    public final void k(e eVar, int i4) {
        int iB = im.b.b(this, 0);
        int i10 = 0;
        while (i10 < i4) {
            int[] iArr = this.f25216f;
            int i11 = iB == 0 ? 0 : iArr[iB - 1];
            int i12 = iArr[iB] - i11;
            byte[][] bArr = this.f25215e;
            int i13 = iArr[bArr.length + iB];
            int iMin = Math.min(i4, i12 + i11) - i10;
            int i14 = (i10 - i11) + i13;
            r rVar = new r(bArr[iB], i14, i14 + iMin, true);
            r rVar2 = eVar.f25173a;
            if (rVar2 == null) {
                rVar.g = rVar;
                rVar.f25211f = rVar;
                eVar.f25173a = rVar;
            } else {
                r rVar3 = rVar2.g;
                nk.k.b(rVar3);
                rVar3.b(rVar);
            }
            i10 += iMin;
            iB++;
        }
        eVar.f25174b += i4;
    }

    public final byte[] l() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.f25215e;
        int length = bArr2.length;
        int i4 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i4 < length) {
            int[] iArr = this.f25216f;
            int i12 = iArr[length + i4];
            int i13 = iArr[i4];
            int i14 = i13 - i10;
            zj.m.O(bArr2[i4], i11, bArr, i12, i12 + i14);
            i11 += i14;
            i4++;
            i10 = i13;
        }
        return bArr;
    }

    @Override // hm.h
    public final String toString() {
        return new h(l()).toString();
    }
}
