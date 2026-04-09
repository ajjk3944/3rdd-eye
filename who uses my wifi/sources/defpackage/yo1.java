package defpackage;

import java.io.ByteArrayOutputStream;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yo1 extends ByteArrayOutputStream {
    public final so1 f;

    public yo1(so1 so1Var, int i) {
        this.f = so1Var;
        ((ByteArrayOutputStream) this).buf = so1Var.q(Math.max(i, 256));
    }

    public final void a(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i3 = i2 + i;
        so1 so1Var = this.f;
        byte[] bArrQ = so1Var.q(i3 + i3);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrQ, 0, ((ByteArrayOutputStream) this).count);
        so1Var.t(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrQ;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f.t(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f.t(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        a(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }
}
