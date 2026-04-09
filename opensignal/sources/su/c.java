package su;

import bc.p;
import cv.d0;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class c extends cv.m {

    /* renamed from: d, reason: collision with root package name */
    public final long f22311d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22312g;

    /* renamed from: r, reason: collision with root package name */
    public long f22313r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f22314x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p f22315y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, d0 d0Var, long j) {
        super(d0Var);
        br.l.e(d0Var, "delegate");
        this.f22315y = pVar;
        this.f22311d = j;
    }

    public final IOException b(IOException iOException) {
        if (this.f22312g) {
            return iOException;
        }
        this.f22312g = true;
        return this.f22315y.b(this.f22313r, false, true, iOException);
    }

    @Override // cv.m, cv.d0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f22314x) {
            return;
        }
        this.f22314x = true;
        long j = this.f22311d;
        if (j != -1 && this.f22313r != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            b(null);
        } catch (IOException e4) {
            throw b(e4);
        }
    }

    @Override // cv.m, cv.d0
    public final void d0(cv.g gVar, long j) throws IOException {
        br.l.e(gVar, "source");
        if (this.f22314x) {
            throw new IllegalStateException("closed");
        }
        long j7 = this.f22311d;
        if (j7 != -1 && this.f22313r + j > j7) {
            StringBuilder sbK = w.g.k(j7, "expected ", " bytes but received ");
            sbK.append(this.f22313r + j);
            throw new ProtocolException(sbK.toString());
        }
        try {
            super.d0(gVar, j);
            this.f22313r += j;
        } catch (IOException e4) {
            throw b(e4);
        }
    }

    @Override // cv.m, cv.d0, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e4) {
            throw b(e4);
        }
    }
}
