package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class z30 extends g40 {
    public final boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z30() {
        super(true);
        boolean z = true;
        D(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g40.g;
        se seVar = (se) atomicReferenceFieldUpdater.get(this);
        te teVar = seVar instanceof te ? (te) seVar : null;
        if (teVar == null) {
            z = false;
            break;
        }
        g40 g40VarK = teVar.k();
        while (!g40VarK.x()) {
            se seVar2 = (se) atomicReferenceFieldUpdater.get(g40VarK);
            te teVar2 = seVar2 instanceof te ? (te) seVar2 : null;
            if (teVar2 == null) {
                z = false;
                break;
            }
            g40VarK = teVar2.k();
        }
        this.h = z;
    }

    @Override // defpackage.g40
    public final boolean x() {
        return this.h;
    }

    @Override // defpackage.g40
    public final boolean y() {
        return true;
    }
}
