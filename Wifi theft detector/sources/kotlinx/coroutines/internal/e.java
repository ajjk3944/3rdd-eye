package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22527a = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22528b = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public e(e eVar) {
        this._prev$volatile = eVar;
    }

    public final void b() {
        f22528b.set(this, null);
    }

    public final e c() {
        e eVarG = g();
        while (eVarG != null && eVarG.j()) {
            eVarG = (e) f22528b.get(eVarG);
        }
        return eVarG;
    }

    public final e d() {
        e eVarE;
        e eVarE2 = e();
        kotlin.jvm.internal.p.b(eVarE2);
        while (eVarE2.j() && (eVarE = eVarE2.e()) != null) {
            eVarE2 = eVarE;
        }
        return eVarE2;
    }

    public final e e() {
        Object objF = f();
        if (objF == d.f22526a) {
            return null;
        }
        return (e) objF;
    }

    public final Object f() {
        return f22527a.get(this);
    }

    public final e g() {
        return (e) f22528b.get(this);
    }

    public abstract boolean j();

    public final boolean k() {
        return e() == null;
    }

    public final boolean l() {
        return t.a.a(f22527a, this, null, d.f22526a);
    }

    public final void m() {
        Object obj;
        if (k()) {
            return;
        }
        while (true) {
            e eVarC = c();
            e eVarD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22528b;
            do {
                obj = atomicReferenceFieldUpdater.get(eVarD);
            } while (!t.a.a(atomicReferenceFieldUpdater, eVarD, obj, ((e) obj) == null ? null : eVarC));
            if (eVarC != null) {
                f22527a.set(eVarC, eVarD);
            }
            if (!eVarD.j() || eVarD.k()) {
                if (eVarC == null || !eVarC.j()) {
                    return;
                }
            }
        }
    }

    public final boolean n(e eVar) {
        return t.a.a(f22527a, this, null, eVar);
    }
}
