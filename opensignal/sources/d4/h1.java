package d4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class h1 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f6818a;

    public h1(FileOutputStream fileOutputStream) {
        br.l.e(fileOutputStream, "fileOutputStream");
        this.f6818a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f6818a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        this.f6818a.write(i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        br.l.e(bArr, "b");
        this.f6818a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        br.l.e(bArr, "bytes");
        this.f6818a.write(bArr, i10, i11);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
