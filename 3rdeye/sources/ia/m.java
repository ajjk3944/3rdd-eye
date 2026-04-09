package ia;

import A9.I;
import io.appmetrica.analytics.impl.Oo;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* compiled from: GzipSink.kt */
/* loaded from: classes3.dex */
public final class m implements A {

    /* renamed from: b, reason: collision with root package name */
    public final v f38654b;

    /* renamed from: c, reason: collision with root package name */
    public final Deflater f38655c;

    /* renamed from: d, reason: collision with root package name */
    public final i f38656d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f38657e;

    /* renamed from: f, reason: collision with root package name */
    public final CRC32 f38658f;

    public m(C4468d c4468d) {
        v vVar = new v(c4468d);
        this.f38654b = vVar;
        Deflater deflater = new Deflater(-1, true);
        this.f38655c = deflater;
        this.f38656d = new i(vVar, deflater);
        this.f38658f = new CRC32();
        C4468d c4468d2 = vVar.f38682c;
        c4468d2.P0(8075);
        c4468d2.C0(8);
        c4468d2.C0(0);
        c4468d2.O0(0);
        c4468d2.C0(0);
        c4468d2.C0(0);
    }

    @Override // ia.A, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        int value;
        boolean z10;
        C4468d c4468d;
        Deflater deflater = this.f38655c;
        v vVar = this.f38654b;
        if (this.f38657e) {
            return;
        }
        try {
            i iVar = this.f38656d;
            iVar.f38651c.finish();
            iVar.a(false);
            value = (int) this.f38658f.getValue();
            z10 = vVar.f38683d;
            c4468d = vVar.f38682c;
        } catch (Throwable th) {
            th = th;
        }
        if (z10) {
            throw new IllegalStateException("closed");
        }
        c4468d.O0(I.z(value));
        vVar.c();
        int bytesRead = (int) deflater.getBytesRead();
        if (vVar.f38683d) {
            throw new IllegalStateException("closed");
        }
        c4468d.O0(I.z(bytesRead));
        vVar.c();
        th = null;
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            vVar.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f38657e = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // ia.A, java.io.Flushable
    public final void flush() throws IOException {
        this.f38656d.flush();
    }

    @Override // ia.A
    public final D timeout() {
        return this.f38654b.f38681b.timeout();
    }

    @Override // ia.A
    public final void write(C4468d source, long j4) throws IOException {
        kotlin.jvm.internal.l.f(source, "source");
        if (j4 < 0) {
            throw new IllegalArgumentException(Oo.d(j4, "byteCount < 0: ").toString());
        }
        if (j4 == 0) {
            return;
        }
        x xVar = source.f38642b;
        kotlin.jvm.internal.l.c(xVar);
        long j10 = j4;
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, xVar.f38690c - xVar.f38689b);
            this.f38658f.update(xVar.f38688a, xVar.f38689b, iMin);
            j10 -= iMin;
            xVar = xVar.f38693f;
            kotlin.jvm.internal.l.c(xVar);
        }
        this.f38656d.write(source, j4);
    }
}
