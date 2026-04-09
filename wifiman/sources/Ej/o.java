package ej;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
class o implements InterfaceC5476D {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f46490a;

    /* renamed from: b, reason: collision with root package name */
    private final E f46491b;

    public o(InputStream input, E timeout) {
        AbstractC6492s.i(input, "input");
        AbstractC6492s.i(timeout, "timeout");
        this.f46490a = input;
        this.f46491b = timeout;
    }

    @Override // ej.InterfaceC5476D
    public long U(C5481e sink, long j10) throws IOException {
        AbstractC6492s.i(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        try {
            this.f46491b.g();
            y yVarG0 = sink.G0(1);
            int i10 = this.f46490a.read(yVarG0.f46526a, yVarG0.f46528c, (int) Math.min(j10, 8192 - yVarG0.f46528c));
            if (i10 != -1) {
                yVarG0.f46528c += i10;
                long j11 = i10;
                sink.C0(sink.D0() + j11);
                return j11;
            }
            if (yVarG0.f46527b != yVarG0.f46528c) {
                return -1L;
            }
            sink.f46459a = yVarG0.b();
            z.b(yVarG0);
            return -1L;
        } catch (AssertionError e10) {
            if (p.e(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // ej.InterfaceC5476D
    public E c() {
        return this.f46491b;
    }

    @Override // ej.InterfaceC5476D, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f46490a.close();
    }

    public String toString() {
        return "source(" + this.f46490a + ')';
    }
}
