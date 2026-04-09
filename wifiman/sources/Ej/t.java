package ej;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
final class t implements InterfaceC5474B {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f46496a;

    /* renamed from: b, reason: collision with root package name */
    private final E f46497b;

    public t(OutputStream out, E timeout) {
        AbstractC6492s.i(out, "out");
        AbstractC6492s.i(timeout, "timeout");
        this.f46496a = out;
        this.f46497b = timeout;
    }

    @Override // ej.InterfaceC5474B
    public void Z(C5481e source, long j10) throws IOException {
        AbstractC6492s.i(source, "source");
        AbstractC5478b.b(source.D0(), 0L, j10);
        while (j10 > 0) {
            this.f46497b.g();
            y yVar = source.f46459a;
            AbstractC6492s.f(yVar);
            int iMin = (int) Math.min(j10, yVar.f46528c - yVar.f46527b);
            this.f46496a.write(yVar.f46526a, yVar.f46527b, iMin);
            yVar.f46527b += iMin;
            long j11 = iMin;
            j10 -= j11;
            source.C0(source.D0() - j11);
            if (yVar.f46527b == yVar.f46528c) {
                source.f46459a = yVar.b();
                z.b(yVar);
            }
        }
    }

    @Override // ej.InterfaceC5474B
    public E c() {
        return this.f46497b;
    }

    @Override // ej.InterfaceC5474B, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f46496a.close();
    }

    @Override // ej.InterfaceC5474B, java.io.Flushable
    public void flush() throws IOException {
        this.f46496a.flush();
    }

    public String toString() {
        return "sink(" + this.f46496a + ')';
    }
}
