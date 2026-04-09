package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class nh {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(nh.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(nh.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public nh(yt0 yt0Var) {
        this._prev$volatile = yt0Var;
    }

    public final void a() {
        b.set(this, null);
    }

    public final nh b() {
        Object obj = a.get(this);
        if (obj == i41.h) {
            return null;
        }
        return (nh) obj;
    }

    public abstract boolean c();

    public final void d() {
        nh nhVarB;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            nh nhVar = (nh) atomicReferenceFieldUpdater.get(this);
            while (nhVar != null && nhVar.c()) {
                nhVar = (nh) atomicReferenceFieldUpdater.get(nhVar);
            }
            nh nhVarB2 = b();
            i30.j(nhVarB2);
            while (nhVarB2.c() && (nhVarB = nhVarB2.b()) != null) {
                nhVarB2 = nhVarB;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(nhVarB2);
                nh nhVar2 = ((nh) obj) == null ? null : nhVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(nhVarB2, obj, nhVar2)) {
                    if (atomicReferenceFieldUpdater.get(nhVarB2) != obj) {
                        break;
                    }
                }
            }
            if (nhVar != null) {
                a.set(nhVar, nhVarB2);
            }
            if (!nhVarB2.c() || nhVarB2.b() == null) {
                if (nhVar == null || !nhVar.c()) {
                    return;
                }
            }
        }
    }
}
