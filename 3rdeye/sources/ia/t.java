package ia;

import A9.I;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: JvmOkio.kt */
/* loaded from: classes3.dex */
public final class t implements A {

    /* renamed from: b, reason: collision with root package name */
    public final OutputStream f38673b;

    /* renamed from: c, reason: collision with root package name */
    public final D f38674c;

    public t(OutputStream outputStream, D d10) {
        this.f38673b = outputStream;
        this.f38674c = d10;
    }

    @Override // ia.A, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f38673b.close();
    }

    @Override // ia.A, java.io.Flushable
    public final void flush() throws IOException {
        this.f38673b.flush();
    }

    @Override // ia.A
    public final D timeout() {
        return this.f38674c;
    }

    public final String toString() {
        return "sink(" + this.f38673b + ')';
    }

    @Override // ia.A
    public final void write(C4468d source, long j4) throws IOException {
        kotlin.jvm.internal.l.f(source, "source");
        I.m(source.f38643c, 0L, j4);
        while (j4 > 0) {
            this.f38674c.throwIfReached();
            x xVar = source.f38642b;
            kotlin.jvm.internal.l.c(xVar);
            int iMin = (int) Math.min(j4, xVar.f38690c - xVar.f38689b);
            this.f38673b.write(xVar.f38688a, xVar.f38689b, iMin);
            int i = xVar.f38689b + iMin;
            xVar.f38689b = i;
            long j10 = iMin;
            j4 -= j10;
            source.f38643c -= j10;
            if (i == xVar.f38690c) {
                source.f38642b = xVar.a();
                y.a(xVar);
            }
        }
    }
}
