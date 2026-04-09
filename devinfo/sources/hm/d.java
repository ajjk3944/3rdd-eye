package hm;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25171a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25172b;

    public d(FileOutputStream fileOutputStream) {
        this.f25172b = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i4 = this.f25171a;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f25171a) {
            case 0:
                break;
            default:
                ((FileOutputStream) this.f25172b).flush();
                break;
        }
    }

    public String toString() {
        switch (this.f25171a) {
            case 0:
                return ((e) this.f25172b) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i4) throws IOException {
        switch (this.f25171a) {
            case 0:
                ((e) this.f25172b).E(i4);
                break;
            default:
                ((FileOutputStream) this.f25172b).write(i4);
                break;
        }
    }

    public d(e eVar) {
        this.f25172b = eVar;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        switch (this.f25171a) {
            case 1:
                nk.k.e(bArr, "b");
                ((FileOutputStream) this.f25172b).write(bArr);
                break;
            default:
                super.write(bArr);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i4, int i10) throws IOException {
        switch (this.f25171a) {
            case 0:
                nk.k.e(bArr, "data");
                ((e) this.f25172b).write(bArr, i4, i10);
                break;
            default:
                nk.k.e(bArr, "bytes");
                ((FileOutputStream) this.f25172b).write(bArr, i4, i10);
                break;
        }
    }

    private final void c() {
    }

    private final void e() {
    }

    private final void g() {
    }
}
