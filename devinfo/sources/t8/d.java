package t8;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final long f34504a;

    /* renamed from: b, reason: collision with root package name */
    public int f34505b;

    public d(InputStream inputStream, long j) {
        super(inputStream);
        this.f34504a = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f34504a - this.f34505b, ((FilterInputStream) this).in.available());
    }

    public final void c(int i4) throws IOException {
        if (i4 >= 0) {
            this.f34505b += i4;
            return;
        }
        long j = this.f34505b;
        long j8 = this.f34504a;
        if (j8 - j <= 0) {
            return;
        }
        StringBuilder sbY = d.h.y(j8, "Failed to read all expected data, expected: ", ", but read: ");
        sbY.append(this.f34505b);
        throw new IOException(sbY.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i4;
        i4 = super.read();
        c(i4 >= 0 ? 1 : -1);
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i4, int i10) {
        int i11;
        i11 = super.read(bArr, i4, i10);
        c(i11);
        return i11;
    }
}
