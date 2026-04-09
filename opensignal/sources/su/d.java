package su;

import bc.p;
import cv.f0;
import cv.n;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class d extends n {
    public final /* synthetic */ p B;

    /* renamed from: d, reason: collision with root package name */
    public final long f22316d;

    /* renamed from: g, reason: collision with root package name */
    public long f22317g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f22318r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f22319x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f22320y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p pVar, f0 f0Var, long j) {
        super(f0Var);
        br.l.e(f0Var, "delegate");
        this.B = pVar;
        this.f22316d = j;
        this.f22318r = true;
        if (j == 0) {
            b(null);
        }
    }

    public final IOException b(IOException iOException) {
        if (this.f22319x) {
            return iOException;
        }
        this.f22319x = true;
        p pVar = this.B;
        if (iOException == null && this.f22318r) {
            this.f22318r = false;
            ((ou.p) pVar.f2638c).w((i) pVar.f2637b);
        }
        return pVar.b(this.f22317g, true, false, iOException);
    }

    @Override // cv.n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f22320y) {
            return;
        }
        this.f22320y = true;
        try {
            super.close();
            b(null);
        } catch (IOException e4) {
            throw b(e4);
        }
    }

    @Override // cv.n, cv.f0
    public final long u(cv.g gVar, long j) throws IOException {
        br.l.e(gVar, "sink");
        if (this.f22320y) {
            throw new IllegalStateException("closed");
        }
        try {
            long jU = this.f6724a.u(gVar, j);
            if (this.f22318r) {
                this.f22318r = false;
                p pVar = this.B;
                ((ou.p) pVar.f2638c).w((i) pVar.f2637b);
            }
            if (jU == -1) {
                b(null);
                return -1L;
            }
            long j7 = this.f22317g + jU;
            long j10 = this.f22316d;
            if (j10 == -1 || j7 <= j10) {
                this.f22317g = j7;
                if (j7 == j10) {
                    b(null);
                }
                return jU;
            }
            throw new ProtocolException("expected " + j10 + " bytes but received " + j7);
        } catch (IOException e4) {
            throw b(e4);
        }
    }
}
