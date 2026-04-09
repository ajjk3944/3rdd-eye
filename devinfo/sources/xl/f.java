package xl;

import java.io.IOException;
import nk.k;
import rl.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f extends a {

    /* renamed from: e, reason: collision with root package name */
    public boolean f37277e;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws NumberFormatException {
        if (this.f37265c) {
            return;
        }
        if (!this.f37277e) {
            c(g.f37278f);
        }
        this.f37265c = true;
    }

    @Override // xl.a, hm.w
    public final long n(hm.e eVar, long j) throws NumberFormatException, IOException {
        k.e(eVar, "sink");
        if (this.f37265c) {
            throw new IllegalStateException("closed");
        }
        if (this.f37277e) {
            return -1L;
        }
        long jN = super.n(eVar, 8192L);
        if (jN != -1) {
            return jN;
        }
        this.f37277e = true;
        c(m.f33111b);
        return -1L;
    }
}
