package ia;

import java.io.OutputStream;

/* compiled from: Buffer.kt */
/* loaded from: classes3.dex */
public final class e extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4468d f38645b;

    public e(C4468d c4468d) {
        this.f38645b = c4468d;
    }

    public final String toString() {
        return this.f38645b + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f38645b.C0(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i, int i10) {
        kotlin.jvm.internal.l.f(data, "data");
        this.f38645b.B0(data, i, i10);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}
