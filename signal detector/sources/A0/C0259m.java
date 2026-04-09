package a0;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: a0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259m extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f4586a;

    public C0259m(FileOutputStream fileOutputStream) {
        this.f4586a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f4586a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f4586a.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        q5.i.e(bArr, "b");
        this.f4586a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i3) throws IOException {
        q5.i.e(bArr, "bytes");
        this.f4586a.write(bArr, i, i3);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
