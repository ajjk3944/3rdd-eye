package vl;

import b5.i0;
import hm.u;
import hm.y;
import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements u {

    /* renamed from: a, reason: collision with root package name */
    public final u f36311a;

    /* renamed from: b, reason: collision with root package name */
    public final long f36312b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f36313c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f36314d;

    /* renamed from: e, reason: collision with root package name */
    public long f36315e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f36316f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0 f36317h;

    public e(i0 i0Var, u uVar, long j, boolean z3) {
        nk.k.e(uVar, "delegate");
        this.f36317h = i0Var;
        this.f36311a = uVar;
        this.f36312b = j;
        this.f36313c = z3;
        this.f36316f = z3;
    }

    @Override // hm.u
    public final void Q(hm.e eVar, long j) throws IOException {
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        long j8 = this.f36312b;
        if (j8 != -1 && this.f36315e + j > j8) {
            StringBuilder sbY = d.h.y(j8, "expected ", " bytes but received ");
            sbY.append(this.f36315e + j);
            throw new ProtocolException(sbY.toString());
        }
        try {
            if (this.f36316f) {
                this.f36316f = false;
            }
            this.f36311a.Q(eVar, j);
            this.f36315e += j;
        } catch (IOException e2) {
            IOException iOExceptionE = e(e2);
            nk.k.b(iOExceptionE);
            throw iOExceptionE;
        }
    }

    public final void c() {
        this.f36311a.close();
    }

    @Override // hm.u, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.g) {
            return;
        }
        this.g = true;
        long j = this.f36312b;
        if (j != -1 && this.f36315e != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            c();
            e(null);
        } catch (IOException e2) {
            IOException iOExceptionE = e(e2);
            nk.k.b(iOExceptionE);
            throw iOExceptionE;
        }
    }

    public final IOException e(IOException iOException) {
        if (this.f36314d) {
            return iOException;
        }
        this.f36314d = true;
        return i0.b(this.f36317h, this.f36313c, iOException, 4);
    }

    @Override // hm.u, java.io.Flushable
    public final void flush() throws IOException {
        try {
            g();
        } catch (IOException e2) {
            IOException iOExceptionE = e(e2);
            nk.k.b(iOExceptionE);
            throw iOExceptionE;
        }
    }

    public final void g() {
        this.f36311a.flush();
    }

    @Override // hm.u
    public final y timeout() {
        return this.f36311a.timeout();
    }

    public final String toString() {
        return e.class.getSimpleName() + '(' + this.f36311a + ')';
    }
}
