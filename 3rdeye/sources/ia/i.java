package ia;

import A9.I;
import java.io.IOException;
import java.util.zip.Deflater;

/* compiled from: DeflaterSink.kt */
/* loaded from: classes3.dex */
public final class i implements A {

    /* renamed from: b, reason: collision with root package name */
    public final v f38650b;

    /* renamed from: c, reason: collision with root package name */
    public final Deflater f38651c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38652d;

    public i(v vVar, Deflater deflater) {
        this.f38650b = vVar;
        this.f38651c = deflater;
    }

    public final void a(boolean z10) throws IOException {
        C4468d c4468d;
        x xVarW0;
        int iDeflate;
        v vVar = this.f38650b;
        while (true) {
            c4468d = vVar.f38682c;
            xVarW0 = c4468d.w0(1);
            Deflater deflater = this.f38651c;
            byte[] bArr = xVarW0.f38688a;
            if (z10) {
                try {
                    int i = xVarW0.f38690c;
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e4) {
                    throw new IOException("Deflater already closed", e4);
                }
            } else {
                int i10 = xVarW0.f38690c;
                iDeflate = deflater.deflate(bArr, i10, 8192 - i10);
            }
            if (iDeflate > 0) {
                xVarW0.f38690c += iDeflate;
                c4468d.f38643c += iDeflate;
                vVar.c();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (xVarW0.f38689b == xVarW0.f38690c) {
            c4468d.f38642b = xVarW0.a();
            y.a(xVarW0);
        }
    }

    @Override // ia.A, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.f38651c;
        if (this.f38652d) {
            return;
        }
        try {
            deflater.finish();
            a(false);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f38650b.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f38652d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // ia.A, java.io.Flushable
    public final void flush() throws IOException {
        a(true);
        this.f38650b.flush();
    }

    @Override // ia.A
    public final D timeout() {
        return this.f38650b.f38681b.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f38650b + ')';
    }

    @Override // ia.A
    public final void write(C4468d source, long j4) throws IOException {
        kotlin.jvm.internal.l.f(source, "source");
        I.m(source.f38643c, 0L, j4);
        while (j4 > 0) {
            x xVar = source.f38642b;
            kotlin.jvm.internal.l.c(xVar);
            int iMin = (int) Math.min(j4, xVar.f38690c - xVar.f38689b);
            this.f38651c.setInput(xVar.f38688a, xVar.f38689b, iMin);
            a(false);
            long j10 = iMin;
            source.f38643c -= j10;
            int i = xVar.f38689b + iMin;
            xVar.f38689b = i;
            if (i == xVar.f38690c) {
                source.f38642b = xVar.a();
                y.a(xVar);
            }
            j4 -= j10;
        }
    }
}
