package H1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final long f1757a;

    /* renamed from: b, reason: collision with root package name */
    public int f1758b;

    public d(long j6, InputStream inputStream) {
        super(inputStream);
        this.f1757a = j6;
    }

    public final void a(int i) throws IOException {
        if (i >= 0) {
            this.f1758b += i;
            return;
        }
        long j6 = this.f1758b;
        long j7 = this.f1757a;
        if (j7 - j6 <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j7 + ", but read: " + this.f1758b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f1757a - this.f1758b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        a(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i3) {
        int i6;
        i6 = super.read(bArr, i, i3);
        a(i6);
        return i6;
    }
}
