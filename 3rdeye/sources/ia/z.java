package ia;

import A9.I;
import c9.C2088i;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: SegmentedByteString.kt */
/* loaded from: classes3.dex */
public final class z extends h {

    /* renamed from: f, reason: collision with root package name */
    public final transient byte[][] f38698f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int[] f38699g;

    public z(byte[][] bArr, int[] iArr) {
        super(h.f38646e.f38647b);
        this.f38698f = bArr;
        this.f38699g = iArr;
    }

    @Override // ia.h
    public final String a() {
        return new h(l()).a();
    }

    @Override // ia.h
    public final h b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f38698f;
        int length = bArr.length;
        int i = 0;
        int i10 = 0;
        while (i < length) {
            int[] iArr = this.f38699g;
            int i11 = iArr[length + i];
            int i12 = iArr[i];
            messageDigest.update(bArr[i], i11, i12 - i10);
            i++;
            i10 = i12;
        }
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.l.c(bArrDigest);
        return new h(bArrDigest);
    }

    @Override // ia.h
    public final int c() {
        return this.f38699g[this.f38698f.length - 1];
    }

    @Override // ia.h
    public final String d() {
        return new h(l()).d();
    }

    @Override // ia.h
    public final byte[] e() {
        return l();
    }

    @Override // ia.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.c() == c() && h(hVar, c());
    }

    @Override // ia.h
    public final byte f(int i) {
        byte[][] bArr = this.f38698f;
        int length = bArr.length - 1;
        int[] iArr = this.f38699g;
        I.m(iArr[length], i, 1L);
        int iH = com.google.gson.internal.c.H(this, i);
        return bArr[iH][(i - (iH == 0 ? 0 : iArr[iH - 1])) + iArr[bArr.length + iH]];
    }

    @Override // ia.h
    public final boolean g(int i, byte[] other, int i10, int i11) {
        kotlin.jvm.internal.l.f(other, "other");
        if (i < 0 || i > c() - i11 || i10 < 0 || i10 > other.length - i11) {
            return false;
        }
        int i12 = i11 + i;
        int iH = com.google.gson.internal.c.H(this, i);
        while (i < i12) {
            int[] iArr = this.f38699g;
            int i13 = iH == 0 ? 0 : iArr[iH - 1];
            int i14 = iArr[iH] - i13;
            byte[][] bArr = this.f38698f;
            int i15 = iArr[bArr.length + iH];
            int iMin = Math.min(i12, i14 + i13) - i;
            if (!I.g(bArr[iH], (i - i13) + i15, other, i10, iMin)) {
                return false;
            }
            i10 += iMin;
            i += iMin;
            iH++;
        }
        return true;
    }

    @Override // ia.h
    public final boolean h(h other, int i) {
        kotlin.jvm.internal.l.f(other, "other");
        if (c() - i >= 0) {
            int iH = com.google.gson.internal.c.H(this, 0);
            int i10 = 0;
            int i11 = 0;
            while (i10 < i) {
                int[] iArr = this.f38699g;
                int i12 = iH == 0 ? 0 : iArr[iH - 1];
                int i13 = iArr[iH] - i12;
                byte[][] bArr = this.f38698f;
                int i14 = iArr[bArr.length + iH];
                int iMin = Math.min(i, i13 + i12) - i10;
                if (other.g(i11, bArr[iH], (i10 - i12) + i14, iMin)) {
                    i11 += iMin;
                    i10 += iMin;
                    iH++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // ia.h
    public final int hashCode() {
        int i = this.f38648c;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f38698f;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f38699g;
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
        this.f38648c = i11;
        return i11;
    }

    @Override // ia.h
    public final h i() {
        return new h(l()).i();
    }

    @Override // ia.h
    public final void k(C4468d buffer, int i) {
        kotlin.jvm.internal.l.f(buffer, "buffer");
        int iH = com.google.gson.internal.c.H(this, 0);
        int i10 = 0;
        while (i10 < i) {
            int[] iArr = this.f38699g;
            int i11 = iH == 0 ? 0 : iArr[iH - 1];
            int i12 = iArr[iH] - i11;
            byte[][] bArr = this.f38698f;
            int i13 = iArr[bArr.length + iH];
            int iMin = Math.min(i, i12 + i11) - i10;
            int i14 = (i10 - i11) + i13;
            x xVar = new x(bArr[iH], i14, i14 + iMin, true);
            x xVar2 = buffer.f38642b;
            if (xVar2 == null) {
                xVar.f38694g = xVar;
                xVar.f38693f = xVar;
                buffer.f38642b = xVar;
            } else {
                x xVar3 = xVar2.f38694g;
                kotlin.jvm.internal.l.c(xVar3);
                xVar3.b(xVar);
            }
            i10 += iMin;
            iH++;
        }
        buffer.f38643c += i;
    }

    public final byte[] l() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.f38698f;
        int length = bArr2.length;
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        while (i < length) {
            int[] iArr = this.f38699g;
            int i12 = iArr[length + i];
            int i13 = iArr[i];
            int i14 = i13 - i10;
            C2088i.d(bArr2[i], i11, bArr, i12, i12 + i14);
            i11 += i14;
            i++;
            i10 = i13;
        }
        return bArr;
    }

    @Override // ia.h
    public final String toString() {
        return new h(l()).toString();
    }
}
