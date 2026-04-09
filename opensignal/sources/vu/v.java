package vu;

import cv.h0;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class v implements cv.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24052a;

    /* renamed from: d, reason: collision with root package name */
    public final cv.g f24053d = new cv.g();

    /* renamed from: g, reason: collision with root package name */
    public boolean f24054g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y f24055r;

    public v(y yVar, boolean z10) {
        this.f24055r = yVar;
        this.f24052a = z10;
    }

    /* JADX WARN: Finally extract failed */
    public final void b(boolean z10) {
        long jMin;
        boolean z11;
        y yVar = this.f24055r;
        synchronized (yVar) {
            yVar.f24072l.h();
            while (yVar.f24067e >= yVar.f24068f && !this.f24052a && !this.f24054g) {
                try {
                    synchronized (yVar) {
                        c cVar = yVar.f24073m;
                        if (cVar != null) {
                            break;
                        }
                        try {
                            yVar.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th2) {
                    yVar.f24072l.k();
                    throw th2;
                }
            }
            yVar.f24072l.k();
            yVar.b();
            jMin = Math.min(yVar.f24068f - yVar.f24067e, this.f24053d.f6706d);
            yVar.f24067e += jMin;
            z11 = z10 && jMin == this.f24053d.f6706d;
        }
        this.f24055r.f24072l.h();
        try {
            y yVar2 = this.f24055r;
            yVar2.f24064b.y(yVar2.f24063a, z11, this.f24053d, jMin);
        } finally {
            this.f24055r.f24072l.k();
        }
    }

    @Override // cv.d0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z10;
        y yVar = this.f24055r;
        byte[] bArr = pu.b.f20645a;
        synchronized (yVar) {
            if (this.f24054g) {
                return;
            }
            synchronized (yVar) {
                z10 = yVar.f24073m == null;
            }
            y yVar2 = this.f24055r;
            if (!yVar2.j.f24052a) {
                if (this.f24053d.f6706d > 0) {
                    while (this.f24053d.f6706d > 0) {
                        b(true);
                    }
                } else if (z10) {
                    yVar2.f24064b.y(yVar2.f24063a, true, null, 0L);
                }
            }
            synchronized (this.f24055r) {
                this.f24054g = true;
            }
            this.f24055r.f24064b.flush();
            this.f24055r.a();
        }
    }

    @Override // cv.d0
    public final void d0(cv.g gVar, long j) {
        br.l.e(gVar, "source");
        byte[] bArr = pu.b.f20645a;
        cv.g gVar2 = this.f24053d;
        gVar2.d0(gVar, j);
        while (gVar2.f6706d >= 16384) {
            b(false);
        }
    }

    @Override // cv.d0, java.io.Flushable
    public final void flush() {
        y yVar = this.f24055r;
        byte[] bArr = pu.b.f20645a;
        synchronized (yVar) {
            yVar.b();
        }
        while (this.f24053d.f6706d > 0) {
            b(false);
            this.f24055r.f24064b.flush();
        }
    }

    @Override // cv.d0
    public final h0 g() {
        return this.f24055r.f24072l;
    }
}
