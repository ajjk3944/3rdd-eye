package xk;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j extends b1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f37198e;

    /* renamed from: f, reason: collision with root package name */
    public final h f37199f;

    public /* synthetic */ j(h hVar, int i4) {
        this.f37198e = i4;
        this.f37199f = hVar;
    }

    @Override // xk.b1
    public final boolean k() {
        switch (this.f37198e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // xk.b1
    public final void l(Throwable th2) {
        switch (this.f37198e) {
            case 0:
                f1 f1VarJ = j();
                h hVar = this.f37199f;
                Throwable thQ = hVar.q(f1VarJ);
                if (hVar.x()) {
                    cl.g gVar = (cl.g) hVar.f37193d;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = cl.g.f2913h;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(gVar);
                        cl.u uVar = cl.b.f2904c;
                        if (nk.k.a(obj, uVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(gVar, uVar, thQ)) {
                                if (atomicReferenceFieldUpdater.get(gVar) != uVar) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                hVar.i(thQ);
                if (!hVar.x()) {
                    hVar.o();
                    break;
                }
                break;
            default:
                this.f37199f.resumeWith(yj.u.f37649a);
                break;
        }
    }
}
