package ze;

import java.io.OutputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f38247a;

    @Override // java.io.OutputStream
    public final void write(int i4) {
        this.f38247a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f38247a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i4, int i10) {
        int i11;
        if (i4 >= 0 && i4 <= bArr.length && i10 >= 0 && (i11 = i4 + i10) <= bArr.length && i11 >= 0) {
            this.f38247a += i10;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
