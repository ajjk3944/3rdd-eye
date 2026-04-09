package W2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private final long f23579a;

    /* renamed from: b, reason: collision with root package name */
    private int f23580b;

    private c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f23579a = j10;
    }

    private int a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f23580b += i10;
        } else if (this.f23579a - this.f23580b > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f23579a + ", but read: " + this.f23580b);
        }
        return i10;
    }

    public static InputStream g(InputStream inputStream, long j10) {
        return new c(inputStream, j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f23579a - this.f23580b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int i10;
        i10 = super.read();
        a(i10 >= 0 ? 1 : -1);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        return a(super.read(bArr, i10, i11));
    }
}
