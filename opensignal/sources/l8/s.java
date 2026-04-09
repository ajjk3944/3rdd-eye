package l8;

import androidx.lifecycle.v;
import java.util.concurrent.CancellationException;
import wt.d0;
import wt.n0;
import wt.t0;
import wt.w;
import wt.z;

/* loaded from: classes.dex */
public final class s implements p {

    /* renamed from: a, reason: collision with root package name */
    public final a8.l f14972a;

    /* renamed from: d, reason: collision with root package name */
    public final j f14973d;

    /* renamed from: g, reason: collision with root package name */
    public final n8.a f14974g;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.lifecycle.o f14975r;

    /* renamed from: x, reason: collision with root package name */
    public final t0 f14976x;

    public s(a8.l lVar, j jVar, n8.a aVar, androidx.lifecycle.o oVar, t0 t0Var) {
        this.f14972a = lVar;
        this.f14973d = jVar;
        this.f14974g = aVar;
        this.f14975r = oVar;
        this.f14976x = t0Var;
    }

    @Override // l8.p
    public final void f() {
        n8.a aVar = this.f14974g;
        if (aVar.getView().isAttachedToWindow()) {
            return;
        }
        t tVarC = q8.i.c(aVar.getView());
        s sVar = tVarC.f14980r;
        if (sVar != null) {
            androidx.lifecycle.o oVar = sVar.f14975r;
            sVar.f14976x.h(null);
            n8.a aVar2 = sVar.f14974g;
            if (aVar2 != null) {
                oVar.m1(aVar2);
            }
            oVar.m1(sVar);
        }
        tVarC.f14980r = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(v vVar) {
        t tVarC = q8.i.c(this.f14974g.getView());
        synchronized (tVarC) {
            try {
                z zVar = tVarC.f14979g;
                pq.c cVar = null;
                if (zVar != null) {
                    zVar.h(null);
                }
                n0 n0Var = n0.f24641a;
                du.f fVar = d0.f24610a;
                tVarC.f14979g = w.s(n0Var, bu.n.f2983a.f25527y, null, new d8.e(tVarC, cVar, 1), 2);
                tVarC.f14978d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l8.p
    public final void start() {
        androidx.lifecycle.o oVar = this.f14975r;
        oVar.V0(this);
        n8.a aVar = this.f14974g;
        if (aVar != null) {
            oVar.m1(aVar);
            oVar.V0(aVar);
        }
        t tVarC = q8.i.c(aVar.getView());
        s sVar = tVarC.f14980r;
        if (sVar != null) {
            androidx.lifecycle.o oVar2 = sVar.f14975r;
            sVar.f14976x.h(null);
            n8.a aVar2 = sVar.f14974g;
            if (aVar2 != null) {
                oVar2.m1(aVar2);
            }
            oVar2.m1(sVar);
        }
        tVarC.f14980r = this;
    }
}
