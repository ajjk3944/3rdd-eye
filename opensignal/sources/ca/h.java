package ca;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h implements l {
    public int B;

    /* renamed from: d, reason: collision with root package name */
    public final pb.k f3476d;

    /* renamed from: g, reason: collision with root package name */
    public final long f3477g;

    /* renamed from: r, reason: collision with root package name */
    public long f3478r;

    /* renamed from: y, reason: collision with root package name */
    public int f3480y;

    /* renamed from: x, reason: collision with root package name */
    public byte[] f3479x = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3475a = new byte[4096];

    public h(pb.k kVar, long j, long j7) {
        this.f3476d = kVar;
        this.f3478r = j;
        this.f3477g = j7;
    }

    public final boolean a(int i10, boolean z10) throws EOFException, InterruptedIOException {
        e(i10);
        int iF = this.B - this.f3480y;
        while (iF < i10) {
            int i11 = i10;
            boolean z11 = z10;
            iF = f(this.f3479x, this.f3480y, i11, iF, z11);
            if (iF == -1) {
                return false;
            }
            this.B = this.f3480y + iF;
            i10 = i11;
            z10 = z11;
        }
        this.f3480y += i10;
        return true;
    }

    @Override // ca.l
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) throws EOFException, InterruptedIOException {
        int iMin;
        int i12 = this.B;
        if (i12 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i12, i11);
            System.arraycopy(this.f3479x, 0, bArr, i10, iMin);
            h(iMin);
        }
        int iF = iMin;
        while (iF < i11 && iF != -1) {
            iF = f(bArr, i10, i11, iF, z10);
        }
        if (iF != -1) {
            this.f3478r += iF;
        }
        return iF != -1;
    }

    @Override // ca.l
    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        if (!a(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f3479x, this.f3480y - i11, bArr, i10, i11);
        return true;
    }

    @Override // ca.l
    public final long d() {
        return this.f3478r + this.f3480y;
    }

    public final void e(int i10) {
        int i11 = this.f3480y + i10;
        byte[] bArr = this.f3479x;
        if (i11 > bArr.length) {
            this.f3479x = Arrays.copyOf(this.f3479x, qb.v.i(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    public final int f(byte[] bArr, int i10, int i11, int i12, boolean z10) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f3476d.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // ca.l
    public final void g(int i10) throws EOFException, InterruptedIOException {
        a(i10, false);
    }

    @Override // ca.l
    public final long getLength() {
        return this.f3477g;
    }

    @Override // ca.l
    public final long getPosition() {
        return this.f3478r;
    }

    public final void h(int i10) {
        int i11 = this.B - i10;
        this.B = i11;
        this.f3480y = 0;
        byte[] bArr = this.f3479x;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f3479x = bArr2;
    }

    @Override // ca.l
    public final int i(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        h hVar;
        int iMin;
        e(i11);
        int i12 = this.B;
        int i13 = this.f3480y;
        int i14 = i12 - i13;
        if (i14 == 0) {
            hVar = this;
            iMin = hVar.f(this.f3479x, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            hVar.B += iMin;
        } else {
            hVar = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(hVar.f3479x, hVar.f3480y, bArr, i10, iMin);
        hVar.f3480y += iMin;
        return iMin;
    }

    @Override // ca.l
    public final void l() {
        this.f3480y = 0;
    }

    @Override // ca.l
    public final void m(int i10) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.B, i10);
        h(iMin);
        int iF = iMin;
        while (iF < i10 && iF != -1) {
            byte[] bArr = this.f3475a;
            iF = f(bArr, -iF, Math.min(i10, bArr.length + iF), iF, false);
        }
        if (iF != -1) {
            this.f3478r += iF;
        }
    }

    @Override // ca.l
    public final void p(byte[] bArr, int i10, int i11) {
        c(bArr, i10, i11, false);
    }

    @Override // pb.k
    public final int read(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        h hVar;
        int i12 = this.B;
        int iF = 0;
        if (i12 != 0) {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f3479x, 0, bArr, i10, iMin);
            h(iMin);
            iF = iMin;
        }
        if (iF == 0) {
            hVar = this;
            iF = hVar.f(bArr, i10, i11, 0, true);
        } else {
            hVar = this;
        }
        if (iF != -1) {
            hVar.f3478r += iF;
        }
        return iF;
    }

    @Override // ca.l
    public final void readFully(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        b(bArr, i10, i11, false);
    }

    @Override // ca.l
    public final int x() throws EOFException, InterruptedIOException {
        h hVar;
        int iMin = Math.min(this.B, 1);
        h(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f3475a;
            hVar = this;
            iMin = hVar.f(bArr, 0, Math.min(1, bArr.length), 0, true);
        } else {
            hVar = this;
        }
        if (iMin != -1) {
            hVar.f3478r += iMin;
        }
        return iMin;
    }
}
