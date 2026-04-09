package xk;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class a1 extends f1 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f37169c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(y0 y0Var) {
        super(true);
        boolean z3 = true;
        P(y0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1.f37188b;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        l lVar = kVar instanceof l ? (l) kVar : null;
        if (lVar == null) {
            z3 = false;
            break;
        }
        f1 f1VarJ = lVar.j();
        while (!f1VarJ.H()) {
            k kVar2 = (k) atomicReferenceFieldUpdater.get(f1VarJ);
            l lVar2 = kVar2 instanceof l ? (l) kVar2 : null;
            if (lVar2 == null) {
                z3 = false;
                break;
            }
            f1VarJ = lVar2.j();
        }
        this.f37169c = z3;
    }

    @Override // xk.f1
    public final boolean H() {
        return this.f37169c;
    }

    @Override // xk.f1
    public final boolean I() {
        return true;
    }
}
