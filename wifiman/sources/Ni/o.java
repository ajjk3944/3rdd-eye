package Ni;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes4.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f16611a = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public o(boolean z10) {
        this._cur$volatile = new p(8, z10);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16611a;
        while (true) {
            p pVar = (p) atomicReferenceFieldUpdater.get(this);
            int iA = pVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                androidx.concurrent.futures.b.a(f16611a, this, pVar, pVar.l());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16611a;
        while (true) {
            p pVar = (p) atomicReferenceFieldUpdater.get(this);
            if (pVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f16611a, this, pVar, pVar.l());
            }
        }
    }

    public final int c() {
        return ((p) f16611a.get(this)).g();
    }

    public final Object e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16611a;
        while (true) {
            p pVar = (p) atomicReferenceFieldUpdater.get(this);
            Object objM = pVar.m();
            if (objM != p.f16615h) {
                return objM;
            }
            androidx.concurrent.futures.b.a(f16611a, this, pVar, pVar.l());
        }
    }
}
