package yl;

import com.applovin.shadow.okhttp3.internal.http2.Http2Stream;
import java.io.InterruptedIOException;
import java.util.TimeZone;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v implements hm.u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f37763a;

    /* renamed from: b, reason: collision with root package name */
    public final hm.e f37764b = new hm.e();

    /* renamed from: c, reason: collision with root package name */
    public boolean f37765c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f37766d;

    public v(y yVar, boolean z3) {
        this.f37766d = yVar;
        this.f37763a = z3;
    }

    @Override // hm.u
    public final void Q(hm.e eVar, long j) {
        TimeZone timeZone = sl.h.f33837a;
        hm.e eVar2 = this.f37764b;
        eVar2.Q(eVar, j);
        while (eVar2.f25174b >= Http2Stream.EMIT_BUFFER_SIZE) {
            c(false);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void c(boolean z3) {
        long jMin;
        boolean z10;
        y yVar = this.f37766d;
        synchronized (yVar) {
            yVar.f37782k.h();
            while (yVar.f37777d >= yVar.f37778e && !this.f37763a && !this.f37765c && yVar.g() == null) {
                try {
                    try {
                        yVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th2) {
                    yVar.f37782k.l();
                    throw th2;
                }
            }
            yVar.f37782k.l();
            yVar.b();
            jMin = Math.min(yVar.f37778e - yVar.f37777d, this.f37764b.f25174b);
            yVar.f37777d += jMin;
            z10 = z3 && jMin == this.f37764b.f25174b;
        }
        this.f37766d.f37782k.h();
        try {
            y yVar2 = this.f37766d;
            yVar2.f37775b.w(yVar2.f37774a, z10, this.f37764b, jMin);
        } finally {
            this.f37766d.f37782k.l();
        }
    }

    @Override // hm.u, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        y yVar = this.f37766d;
        TimeZone timeZone = sl.h.f33837a;
        synchronized (yVar) {
            if (this.f37765c) {
                return;
            }
            boolean z3 = yVar.g() == null;
            y yVar2 = this.f37766d;
            if (!yVar2.f37781i.f37763a) {
                if (this.f37764b.f25174b > 0) {
                    while (this.f37764b.f25174b > 0) {
                        c(true);
                    }
                } else if (z3) {
                    yVar2.f37775b.w(yVar2.f37774a, true, null, 0L);
                }
            }
            y yVar3 = this.f37766d;
            synchronized (yVar3) {
                this.f37765c = true;
                yVar3.notifyAll();
            }
            this.f37766d.f37775b.flush();
            this.f37766d.a();
        }
    }

    @Override // hm.u, java.io.Flushable
    public final void flush() {
        y yVar = this.f37766d;
        TimeZone timeZone = sl.h.f33837a;
        synchronized (yVar) {
            yVar.b();
        }
        while (this.f37764b.f25174b > 0) {
            c(false);
            this.f37766d.f37775b.flush();
        }
    }

    @Override // hm.u
    public final hm.y timeout() {
        return this.f37766d.f37782k;
    }
}
