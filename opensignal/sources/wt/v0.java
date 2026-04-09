package wt;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class v0 extends b1 {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24661g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(t0 t0Var) {
        super(true);
        boolean z10 = true;
        F(t0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1.f24605d;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        k kVar = jVar instanceof k ? (k) jVar : null;
        if (kVar == null) {
            z10 = false;
            break;
        }
        b1 b1VarJ = kVar.j();
        while (!b1VarJ.A()) {
            j jVar2 = (j) atomicReferenceFieldUpdater.get(b1VarJ);
            k kVar2 = jVar2 instanceof k ? (k) jVar2 : null;
            if (kVar2 == null) {
                z10 = false;
                break;
            }
            b1VarJ = kVar2.j();
        }
        this.f24661g = z10;
    }

    @Override // wt.b1
    public final boolean A() {
        return this.f24661g;
    }

    @Override // wt.b1
    public final boolean B() {
        return true;
    }
}
