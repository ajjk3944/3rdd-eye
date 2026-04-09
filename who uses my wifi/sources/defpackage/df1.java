package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class df1 implements mf1 {
    public final ua4 g;
    public final long h;
    public long i;
    public int k;
    public int l;
    public byte[] j = new byte[65536];
    public final byte[] f = new byte[4096];

    static {
        zk1.a("media3.extractor");
    }

    public df1(ua4 ua4Var, long j, long j2) {
        this.g = ua4Var;
        this.i = j;
        this.h = j2;
    }

    @Override // defpackage.mf1
    public final void A(int i) throws EOFException, InterruptedIOException {
        e(i, false);
    }

    @Override // defpackage.mf1
    public final boolean B(byte[] bArr, int i, int i2, boolean z) {
        if (!e(i2, z)) {
            return false;
        }
        System.arraycopy(this.j, this.k - i2, bArr, i, i2);
        return true;
    }

    public final boolean c(int i, boolean z) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.l, i);
        j(iMin);
        int iK = iMin;
        while (iK < i && iK != -1) {
            iK = k(this.f, -iK, Math.min(i, iK + 4096), iK, z);
        }
        if (iK != -1) {
            this.i += iK;
        }
        return iK != -1;
    }

    @Override // defpackage.ua4
    public final int d(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        df1 df1Var;
        int i3 = this.l;
        int iK = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.j, 0, bArr, i, iMin);
            j(iMin);
            iK = iMin;
        }
        if (iK == 0) {
            df1Var = this;
            iK = df1Var.k(bArr, i, i2, 0, true);
        } else {
            df1Var = this;
        }
        if (iK != -1) {
            df1Var.i += iK;
        }
        return iK;
    }

    public final boolean e(int i, boolean z) throws EOFException, InterruptedIOException {
        f(i);
        int iK = this.l - this.k;
        while (iK < i) {
            int i2 = i;
            boolean z2 = z;
            iK = k(this.j, this.k, i2, iK, z2);
            if (iK == -1) {
                return false;
            }
            this.l = this.k + iK;
            i = i2;
            z = z2;
        }
        this.k += i;
        return true;
    }

    public final void f(int i) {
        int i2 = this.k + i;
        int length = this.j.length;
        if (i2 > length) {
            String str = v23.a;
            this.j = Arrays.copyOf(this.j, Math.max(65536 + i2, Math.min(length + length, i2 + 524288)));
        }
    }

    @Override // defpackage.mf1
    public final void i() {
        this.k = 0;
    }

    public final void j(int i) {
        int i2 = this.l - i;
        this.l = i2;
        this.k = 0;
        byte[] bArr = this.j;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.j = bArr2;
    }

    public final int k(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iD = this.g.d(bArr, i + i3, i2 - i3);
        if (iD != -1) {
            return i3 + iD;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.mf1
    public final int l() throws EOFException, InterruptedIOException {
        df1 df1Var;
        int iMin = Math.min(this.l, 1);
        j(iMin);
        if (iMin == 0) {
            df1Var = this;
            iMin = df1Var.k(this.f, 0, Math.min(1, 4096), 0, true);
        } else {
            df1Var = this;
        }
        if (iMin != -1) {
            df1Var.i += iMin;
        }
        return iMin;
    }

    @Override // defpackage.mf1
    public final long n() {
        return this.i + this.k;
    }

    @Override // defpackage.mf1
    public final long o() {
        return this.i;
    }

    @Override // defpackage.mf1
    public final long p() {
        return this.h;
    }

    @Override // defpackage.mf1
    public final void t(int i) throws EOFException, InterruptedIOException {
        c(i, false);
    }

    @Override // defpackage.mf1
    public final void u(byte[] bArr, int i, int i2) {
        B(bArr, i, i2, false);
    }

    @Override // defpackage.mf1
    public final boolean w(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.l;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.j, 0, bArr, i, iMin);
            j(iMin);
        }
        int iK = iMin;
        while (iK < i2 && iK != -1) {
            iK = k(bArr, i, i2, iK, z);
        }
        if (iK != -1) {
            this.i += iK;
        }
        return iK != -1;
    }

    @Override // defpackage.mf1
    public final void x(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        w(bArr, i, i2, false);
    }

    @Override // defpackage.mf1
    public final int y(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        df1 df1Var;
        int iMin;
        f(i2);
        int i3 = this.l;
        int i4 = this.k;
        int i5 = i3 - i4;
        if (i5 == 0) {
            df1Var = this;
            iMin = df1Var.k(this.j, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            df1Var.l += iMin;
        } else {
            df1Var = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(df1Var.j, df1Var.k, bArr, i, iMin);
        df1Var.k += iMin;
        return iMin;
    }
}
