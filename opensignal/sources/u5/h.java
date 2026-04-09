package u5;

import a5.d0;
import androidx.media3.common.MediaLibraryInfo;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h implements l {
    public int B;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.media3.common.l f23286d;

    /* renamed from: g, reason: collision with root package name */
    public final long f23287g;

    /* renamed from: r, reason: collision with root package name */
    public long f23288r;

    /* renamed from: y, reason: collision with root package name */
    public int f23290y;

    /* renamed from: x, reason: collision with root package name */
    public byte[] f23289x = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f23285a = new byte[4096];

    static {
        MediaLibraryInfo.registerModule("media3.extractor");
    }

    public h(androidx.media3.common.l lVar, long j, long j7) {
        this.f23286d = lVar;
        this.f23288r = j;
        this.f23287g = j7;
    }

    public final boolean a(int i10, boolean z10) throws EOFException, InterruptedIOException {
        e(i10);
        int iF = this.B - this.f23290y;
        while (iF < i10) {
            int i11 = i10;
            boolean z11 = z10;
            iF = f(this.f23289x, this.f23290y, i11, iF, z11);
            if (iF == -1) {
                return false;
            }
            this.B = this.f23290y + iF;
            i10 = i11;
            z10 = z11;
        }
        this.f23290y += i10;
        return true;
    }

    @Override // u5.l
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) throws EOFException, InterruptedIOException {
        int iMin;
        int i12 = this.B;
        if (i12 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i12, i11);
            System.arraycopy(this.f23289x, 0, bArr, i10, iMin);
            h(iMin);
        }
        int iF = iMin;
        while (iF < i11 && iF != -1) {
            iF = f(bArr, i10, i11, iF, z10);
        }
        if (iF != -1) {
            this.f23288r += iF;
        }
        return iF != -1;
    }

    @Override // u5.l
    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        if (!a(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f23289x, this.f23290y - i11, bArr, i10, i11);
        return true;
    }

    @Override // u5.l
    public final long d() {
        return this.f23288r + this.f23290y;
    }

    public final void e(int i10) {
        int i11 = this.f23290y + i10;
        byte[] bArr = this.f23289x;
        if (i11 > bArr.length) {
            this.f23289x = Arrays.copyOf(this.f23289x, d0.h(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    public final int f(byte[] bArr, int i10, int i11, int i12, boolean z10) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f23286d.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // u5.l
    public final void g(int i10) throws EOFException, InterruptedIOException {
        a(i10, false);
    }

    @Override // u5.l
    public final long getLength() {
        return this.f23287g;
    }

    @Override // u5.l
    public final long getPosition() {
        return this.f23288r;
    }

    public final void h(int i10) {
        int i11 = this.B - i10;
        this.B = i11;
        this.f23290y = 0;
        byte[] bArr = this.f23289x;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f23289x = bArr2;
    }

    @Override // u5.l
    public final int i(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        h hVar;
        int iMin;
        e(i11);
        int i12 = this.B;
        int i13 = this.f23290y;
        int i14 = i12 - i13;
        if (i14 == 0) {
            hVar = this;
            iMin = hVar.f(this.f23289x, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            hVar.B += iMin;
        } else {
            hVar = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(hVar.f23289x, hVar.f23290y, bArr, i10, iMin);
        hVar.f23290y += iMin;
        return iMin;
    }

    @Override // u5.l
    public final void l() {
        this.f23290y = 0;
    }

    @Override // u5.l
    public final void m(int i10) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.B, i10);
        h(iMin);
        int iF = iMin;
        while (iF < i10 && iF != -1) {
            byte[] bArr = this.f23285a;
            iF = f(bArr, -iF, Math.min(i10, bArr.length + iF), iF, false);
        }
        if (iF != -1) {
            this.f23288r += iF;
        }
    }

    @Override // u5.l
    public final void p(byte[] bArr, int i10, int i11) {
        c(bArr, i10, i11, false);
    }

    @Override // androidx.media3.common.l
    public final int read(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        h hVar;
        int i12 = this.B;
        int iF = 0;
        if (i12 != 0) {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f23289x, 0, bArr, i10, iMin);
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
            hVar.f23288r += iF;
        }
        return iF;
    }

    @Override // u5.l
    public final void readFully(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        b(bArr, i10, i11, false);
    }

    @Override // u5.l
    public final int v(int i10) throws EOFException, InterruptedIOException {
        h hVar;
        int iMin = Math.min(this.B, i10);
        h(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f23285a;
            hVar = this;
            iMin = hVar.f(bArr, 0, Math.min(i10, bArr.length), 0, true);
        } else {
            hVar = this;
        }
        if (iMin != -1) {
            hVar.f23288r += iMin;
        }
        return iMin;
    }
}
