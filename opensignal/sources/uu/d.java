package uu;

import br.l;
import cv.g;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import su.k;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: r, reason: collision with root package name */
    public long f23710r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ks.c f23711x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ks.c cVar, long j) {
        super(cVar);
        this.f23711x = cVar;
        this.f23710r = j;
        if (j == 0) {
            b();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zT;
        if (this.f23702d) {
            return;
        }
        if (this.f23710r != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = pu.b.f20645a;
            l.e(timeUnit, "timeUnit");
            try {
                zT = pu.b.t(this, 100);
            } catch (IOException unused) {
                zT = false;
            }
            if (!zT) {
                ((k) this.f23711x.f14490d).k();
                b();
            }
        }
        this.f23702d = true;
    }

    @Override // uu.a, cv.f0
    public final long u(g gVar, long j) throws IOException {
        l.e(gVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(c7.a.m(j, "byteCount < 0: ").toString());
        }
        if (this.f23702d) {
            throw new IllegalStateException("closed");
        }
        long j7 = this.f23710r;
        if (j7 == 0) {
            return -1L;
        }
        long jU = super.u(gVar, Math.min(j7, j));
        if (jU == -1) {
            ((k) this.f23711x.f14490d).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
        long j10 = this.f23710r - jU;
        this.f23710r = j10;
        if (j10 == 0) {
            b();
        }
        return jU;
    }
}
