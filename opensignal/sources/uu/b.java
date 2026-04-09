package uu;

import br.l;
import cv.d0;
import cv.g;
import cv.h;
import cv.h0;
import cv.o;

/* loaded from: classes.dex */
public final class b implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final o f23704a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23705d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ks.c f23706g;

    public b(ks.c cVar) {
        this.f23706g = cVar;
        this.f23704a = new o(((h) cVar.f14492f).g());
    }

    @Override // cv.d0, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f23705d) {
            return;
        }
        this.f23705d = true;
        ((h) this.f23706g.f14492f).H("0\r\n\r\n");
        o oVar = this.f23704a;
        h0 h0Var = oVar.f6725e;
        oVar.f6725e = h0.f6707d;
        h0Var.a();
        h0Var.b();
        this.f23706g.f14488b = 3;
    }

    @Override // cv.d0
    public final void d0(g gVar, long j) {
        h hVar = (h) this.f23706g.f14492f;
        l.e(gVar, "source");
        if (this.f23705d) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        hVar.P(j);
        hVar.H("\r\n");
        hVar.d0(gVar, j);
        hVar.H("\r\n");
    }

    @Override // cv.d0, java.io.Flushable
    public final synchronized void flush() {
        if (this.f23705d) {
            return;
        }
        ((h) this.f23706g.f14492f).flush();
    }

    @Override // cv.d0
    public final h0 g() {
        return this.f23704a;
    }
}
