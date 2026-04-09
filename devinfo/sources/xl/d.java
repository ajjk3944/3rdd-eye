package xl;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import nk.k;
import rl.m;
import rl.n;
import sl.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends a {

    /* renamed from: e, reason: collision with root package name */
    public long f37272e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f37273f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, n nVar, long j) throws NumberFormatException {
        super(gVar, nVar);
        k.e(nVar, "url");
        this.f37273f = gVar;
        this.f37272e = j;
        if (j == 0) {
            c(m.f33111b);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zG;
        if (this.f37265c) {
            return;
        }
        if (this.f37272e != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = h.f33837a;
            k.e(timeUnit, "timeUnit");
            try {
                zG = h.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.f37273f.f37280b.e();
                c(g.f37278f);
            }
        }
        this.f37265c = true;
    }

    @Override // xl.a, hm.w
    public final long n(hm.e eVar, long j) throws NumberFormatException, IOException {
        k.e(eVar, "sink");
        if (this.f37265c) {
            throw new IllegalStateException("closed");
        }
        long j8 = this.f37272e;
        if (j8 == 0) {
            return -1L;
        }
        long jN = super.n(eVar, Math.min(j8, 8192L));
        if (jN == -1) {
            this.f37273f.f37280b.e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            c(g.f37278f);
            throw protocolException;
        }
        long j9 = this.f37272e - jN;
        this.f37272e = j9;
        if (j9 == 0) {
            c(m.f33111b);
        }
        return jN;
    }
}
