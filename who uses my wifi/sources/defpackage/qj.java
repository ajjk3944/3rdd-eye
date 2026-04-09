package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class qj extends s9 {
    public final hk g;
    public transient oj h;

    public qj(oj ojVar, hk hkVar) {
        super(ojVar);
        this.g = hkVar;
    }

    @Override // defpackage.oj
    public hk getContext() {
        hk hkVar = this.g;
        i30.j(hkVar);
        return hkVar;
    }

    @Override // defpackage.s9
    public void n() {
        oj ojVar = this.h;
        if (ojVar != null && ojVar != this) {
            fk fkVarH = getContext().h(pz.h);
            i30.j(fkVarH);
            cp cpVar = (cp) ojVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = cp.m;
            while (atomicReferenceFieldUpdater.get(cpVar) == pu1.i) {
            }
            Object obj = atomicReferenceFieldUpdater.get(cpVar);
            kd kdVar = obj instanceof kd ? (kd) obj : null;
            if (kdVar != null) {
                kdVar.q();
            }
        }
        this.h = og.g;
    }

    public qj(oj ojVar) {
        this(ojVar, ojVar != null ? ojVar.getContext() : null);
    }
}
