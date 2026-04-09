package c8;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class n extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f3353a;

    /* renamed from: d, reason: collision with root package name */
    public int f3354d = 1073741824;

    public n(InputStream inputStream) {
        this.f3353a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f3354d;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f3353a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i10 = this.f3353a.read();
        if (i10 == -1) {
            this.f3354d = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.f3353a.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i10 = this.f3353a.read(bArr);
        if (i10 == -1) {
            this.f3354d = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f3353a.read(bArr, i10, i11);
        if (i12 == -1) {
            this.f3354d = 0;
        }
        return i12;
    }
}
