package yl;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x extends hm.b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y f37773n;

    public x(y yVar) {
        this.f37773n = yVar;
    }

    @Override // hm.b
    public final IOException j(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // hm.b
    public final void k() {
        this.f37773n.f(b.CANCEL);
        q qVar = this.f37773n.f37775b;
        synchronized (qVar) {
            long j = qVar.f37734n;
            long j8 = qVar.f37733m;
            if (j < j8) {
                return;
            }
            qVar.f37733m = j8 + 1;
            qVar.f37735o = System.nanoTime() + Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            ul.c.c(qVar.f37729h, d.h.w(new StringBuilder(), qVar.f37725c, " ping"), new a6.e(28, qVar));
        }
    }

    public final void l() {
        if (i()) {
            throw j(null);
        }
    }
}
