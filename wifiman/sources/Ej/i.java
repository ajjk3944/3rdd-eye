package ej;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class i implements InterfaceC5474B {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5482f f46475a;

    /* renamed from: b, reason: collision with root package name */
    private final Deflater f46476b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f46477c;

    public i(InterfaceC5482f sink, Deflater deflater) {
        AbstractC6492s.i(sink, "sink");
        AbstractC6492s.i(deflater, "deflater");
        this.f46475a = sink;
        this.f46476b = deflater;
    }

    private final void a(boolean z10) throws IOException {
        y yVarG0;
        int iDeflate;
        C5481e c5481eB = this.f46475a.b();
        while (true) {
            yVarG0 = c5481eB.G0(1);
            if (z10) {
                try {
                    Deflater deflater = this.f46476b;
                    byte[] bArr = yVarG0.f46526a;
                    int i10 = yVarG0.f46528c;
                    iDeflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                Deflater deflater2 = this.f46476b;
                byte[] bArr2 = yVarG0.f46526a;
                int i11 = yVarG0.f46528c;
                iDeflate = deflater2.deflate(bArr2, i11, 8192 - i11);
            }
            if (iDeflate > 0) {
                yVarG0.f46528c += iDeflate;
                c5481eB.C0(c5481eB.D0() + iDeflate);
                this.f46475a.z();
            } else if (this.f46476b.needsInput()) {
                break;
            }
        }
        if (yVarG0.f46527b == yVarG0.f46528c) {
            c5481eB.f46459a = yVarG0.b();
            z.b(yVarG0);
        }
    }

    @Override // ej.InterfaceC5474B
    public void Z(C5481e source, long j10) throws IOException {
        AbstractC6492s.i(source, "source");
        AbstractC5478b.b(source.D0(), 0L, j10);
        while (j10 > 0) {
            y yVar = source.f46459a;
            AbstractC6492s.f(yVar);
            int iMin = (int) Math.min(j10, yVar.f46528c - yVar.f46527b);
            this.f46476b.setInput(yVar.f46526a, yVar.f46527b, iMin);
            a(false);
            long j11 = iMin;
            source.C0(source.D0() - j11);
            int i10 = yVar.f46527b + iMin;
            yVar.f46527b = i10;
            if (i10 == yVar.f46528c) {
                source.f46459a = yVar.b();
                z.b(yVar);
            }
            j10 -= j11;
        }
    }

    @Override // ej.InterfaceC5474B
    public E c() {
        return this.f46475a.c();
    }

    @Override // ej.InterfaceC5474B, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f46477c) {
            return;
        }
        try {
            g();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f46476b.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f46475a.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f46477c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // ej.InterfaceC5474B, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.f46475a.flush();
    }

    public final void g() throws IOException {
        this.f46476b.finish();
        a(false);
    }

    public String toString() {
        return "DeflaterSink(" + this.f46475a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(InterfaceC5474B sink, Deflater deflater) {
        this(p.c(sink), deflater);
        AbstractC6492s.i(sink, "sink");
        AbstractC6492s.i(deflater, "deflater");
    }
}
