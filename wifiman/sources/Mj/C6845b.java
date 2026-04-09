package mj;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: mj.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C6845b extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    final C6848e f54046a;

    /* renamed from: b, reason: collision with root package name */
    final C6851h f54047b;

    C6845b(C6848e c6848e) {
        this.f54046a = c6848e;
        this.f54047b = null;
    }

    OutputStream a() {
        C6848e c6848e = this.f54046a;
        if (c6848e != null) {
            return c6848e.e();
        }
        C6851h c6851h = this.f54047b;
        if (c6851h != null) {
            return c6851h.i();
        }
        return null;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        ByteBuffer byteBufferWrap;
        synchronized (this) {
            byteBufferWrap = ByteBuffer.wrap(toByteArray());
            reset();
        }
        a().write(new C6846c((byte) 2, true, byteBufferWrap.array()).d());
        a().flush();
    }

    C6845b(C6851h c6851h) {
        this.f54046a = null;
        this.f54047b = c6851h;
    }
}
