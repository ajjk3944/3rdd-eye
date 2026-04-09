package vl;

import b5.i0;
import hm.y;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import rl.t;
import rl.z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements rl.o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36289a = new a();

    @Override // rl.o
    public final z a(wl.h hVar) throws IOException {
        Object gVar;
        m mVar = hVar.f36830a;
        synchronized (mVar) {
            if (!mVar.f36344o) {
                throw new IllegalStateException("released");
            }
            if (mVar.f36341l || mVar.f36340k || mVar.f36343n || mVar.f36342m) {
                throw new IllegalStateException("Check failed.");
            }
        }
        g gVar2 = mVar.g;
        nk.k.b(gVar2);
        n nVarB = gVar2.b();
        t tVar = mVar.f36332a;
        nVarB.getClass();
        int i4 = hVar.g;
        i0.f fVar = nVarB.f36353h;
        yl.q qVar = nVarB.f36354i;
        if (qVar != null) {
            gVar = new yl.r(tVar, nVarB, hVar, qVar);
        } else {
            nVarB.f36351e.setSoTimeout(i4);
            y yVarTimeout = ((hm.q) fVar.f25417c).f25203a.timeout();
            long j = i4;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            yVarTimeout.g(j);
            ((hm.p) fVar.f25418d).f25200a.timeout().g(hVar.f36836h);
            gVar = new xl.g(tVar, nVarB, fVar);
        }
        nk.k.e(gVar2, "finder");
        i0 i0Var = new i0();
        i0Var.f1821b = mVar;
        i0Var.f1822c = gVar2;
        i0Var.f1823d = gVar;
        mVar.j = i0Var;
        mVar.f36346q = i0Var;
        synchronized (mVar) {
            mVar.f36340k = true;
            mVar.f36341l = true;
        }
        if (mVar.f36345p) {
            throw new IOException("Canceled");
        }
        return wl.h.a(hVar, 0, i0Var, null, 61).b(hVar.f36834e);
    }
}
