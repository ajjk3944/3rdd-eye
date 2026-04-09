package uu;

import br.l;
import cv.d0;
import cv.g;
import cv.h;
import cv.h0;
import cv.o;

/* loaded from: classes.dex */
public final class e implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final o f23712a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23713d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ks.c f23714g;

    public e(ks.c cVar) {
        this.f23714g = cVar;
        this.f23712a = new o(((h) cVar.f14492f).g());
    }

    @Override // cv.d0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f23713d) {
            return;
        }
        this.f23713d = true;
        o oVar = this.f23712a;
        h0 h0Var = oVar.f6725e;
        oVar.f6725e = h0.f6707d;
        h0Var.a();
        h0Var.b();
        this.f23714g.f14488b = 3;
    }

    @Override // cv.d0
    public final void d0(g gVar, long j) {
        l.e(gVar, "source");
        if (this.f23713d) {
            throw new IllegalStateException("closed");
        }
        pu.b.c(gVar.f6706d, 0L, j);
        ((h) this.f23714g.f14492f).d0(gVar, j);
    }

    @Override // cv.d0, java.io.Flushable
    public final void flush() {
        if (this.f23713d) {
            return;
        }
        ((h) this.f23714g.f14492f).flush();
    }

    @Override // cv.d0
    public final h0 g() {
        return this.f23712a;
    }
}
