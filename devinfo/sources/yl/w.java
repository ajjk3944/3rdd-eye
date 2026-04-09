package yl;

import i.e0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w implements hm.w {

    /* renamed from: a, reason: collision with root package name */
    public final long f37767a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f37768b;

    /* renamed from: c, reason: collision with root package name */
    public final hm.e f37769c = new hm.e();

    /* renamed from: d, reason: collision with root package name */
    public final hm.e f37770d = new hm.e();

    /* renamed from: e, reason: collision with root package name */
    public boolean f37771e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f37772f;

    public w(y yVar, long j, boolean z3) {
        this.f37772f = yVar;
        this.f37767a = j;
        this.f37768b = z3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        y yVar = this.f37772f;
        synchronized (yVar) {
            this.f37771e = true;
            hm.e eVar = this.f37770d;
            j = eVar.f25174b;
            eVar.e();
            yVar.notifyAll();
        }
        if (j > 0) {
            y yVar2 = this.f37772f;
            TimeZone timeZone = sl.h.f33837a;
            yVar2.f37775b.v(j);
        }
        this.f37772f.a();
    }

    @Override // hm.w
    public final long n(hm.e eVar, long j) throws Throwable {
        boolean z3;
        Throwable d0Var;
        long jN;
        nk.k.e(eVar, "sink");
        do {
            y yVar = this.f37772f;
            synchronized (yVar) {
                yVar.f37775b.getClass();
                v vVar = yVar.f37781i;
                z3 = true;
                boolean z10 = vVar.f37765c || vVar.f37763a;
                if (z10) {
                    yVar.j.h();
                }
                try {
                    if (yVar.g() == null || this.f37768b) {
                        d0Var = null;
                    } else {
                        d0Var = yVar.f37784m;
                        if (d0Var == null) {
                            b bVarG = yVar.g();
                            nk.k.b(bVarG);
                            d0Var = new d0(bVarG);
                        }
                    }
                    if (this.f37771e) {
                        throw new IOException("stream closed");
                    }
                    hm.e eVar2 = this.f37770d;
                    long j8 = eVar2.f25174b;
                    if (j8 > 0) {
                        jN = eVar2.n(eVar, Math.min(8192L, j8));
                        e0.c(yVar.f37776c, jN, 0L, 2);
                        long jB = yVar.f37776c.b();
                        if (d0Var == null && jB >= yVar.f37775b.f37737q.a() / 2) {
                            yVar.f37775b.A(yVar.f37774a, jB);
                            e0.c(yVar.f37776c, 0L, jB, 1);
                        }
                        z3 = false;
                    } else {
                        if (this.f37768b || d0Var != null) {
                            z3 = false;
                        } else {
                            try {
                                yVar.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        jN = -1;
                    }
                } finally {
                    if (z10) {
                        yVar.j.l();
                    }
                }
            }
            this.f37772f.f37775b.f37736p.getClass();
        } while (z3);
        if (jN != -1) {
            return jN;
        }
        if (d0Var == null) {
            return -1L;
        }
        throw d0Var;
    }

    @Override // hm.w, hm.u
    public final hm.y timeout() {
        return this.f37772f.j;
    }
}
