package wt;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class i extends w0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f24624x;

    /* renamed from: y, reason: collision with root package name */
    public final g f24625y;

    public /* synthetic */ i(g gVar, int i10) {
        this.f24624x = i10;
        this.f24625y = gVar;
    }

    @Override // wt.w0
    public final boolean k() {
        switch (this.f24624x) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // wt.w0
    public final void l(Throwable th2) {
        switch (this.f24624x) {
            case 0:
                b1 b1VarJ = j();
                g gVar = this.f24625y;
                Throwable thT = gVar.t(b1VarJ);
                if (gVar.z()) {
                    bu.f fVar = (bu.f) gVar.f24617r;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bu.f.D;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        bu.t tVar = bu.a.f2953c;
                        if (br.l.a(obj, tVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, tVar, thT)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != tVar) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                gVar.q(thT);
                if (!gVar.z()) {
                    gVar.r();
                    break;
                }
                break;
            default:
                this.f24625y.g(lq.b0.f15562a);
                break;
        }
    }
}
