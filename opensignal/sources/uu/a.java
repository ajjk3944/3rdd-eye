package uu;

import br.l;
import cv.f0;
import cv.g;
import cv.h0;
import cv.i;
import cv.o;
import java.io.IOException;
import su.k;

/* loaded from: classes.dex */
public abstract class a implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final o f23701a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23702d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ks.c f23703g;

    public a(ks.c cVar) {
        this.f23703g = cVar;
        this.f23701a = new o(((i) cVar.f14491e).g());
    }

    public final void b() {
        ks.c cVar = this.f23703g;
        int i10 = cVar.f14488b;
        if (i10 == 6) {
            return;
        }
        if (i10 != 5) {
            throw new IllegalStateException("state: " + cVar.f14488b);
        }
        o oVar = this.f23701a;
        h0 h0Var = oVar.f6725e;
        oVar.f6725e = h0.f6707d;
        h0Var.a();
        h0Var.b();
        cVar.f14488b = 6;
    }

    @Override // cv.f0
    public final h0 g() {
        return this.f23701a;
    }

    @Override // cv.f0
    public long u(g gVar, long j) throws IOException {
        ks.c cVar = this.f23703g;
        l.e(gVar, "sink");
        try {
            return ((i) cVar.f14491e).u(gVar, j);
        } catch (IOException e4) {
            ((k) cVar.f14490d).k();
            b();
            throw e4;
        }
    }
}
