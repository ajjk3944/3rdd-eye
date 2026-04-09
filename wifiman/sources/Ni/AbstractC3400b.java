package Ni;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Ni.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3400b {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f16587a = AtomicReferenceFieldUpdater.newUpdater(AbstractC3400b.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f16588b = AtomicReferenceFieldUpdater.newUpdater(AbstractC3400b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC3400b(AbstractC3400b abstractC3400b) {
        this._prev$volatile = abstractC3400b;
    }

    private final AbstractC3400b d() {
        AbstractC3400b abstractC3400bH = h();
        while (abstractC3400bH != null && abstractC3400bH.k()) {
            abstractC3400bH = (AbstractC3400b) f16588b.get(abstractC3400bH);
        }
        return abstractC3400bH;
    }

    private final AbstractC3400b e() {
        AbstractC3400b abstractC3400bF;
        AbstractC3400b abstractC3400bF2 = f();
        AbstractC6492s.f(abstractC3400bF2);
        while (abstractC3400bF2.k() && (abstractC3400bF = abstractC3400bF2.f()) != null) {
            abstractC3400bF2 = abstractC3400bF;
        }
        return abstractC3400bF2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g() {
        return f16587a.get(this);
    }

    public final void c() {
        f16588b.set(this, null);
    }

    public final AbstractC3400b f() {
        Object objG = g();
        if (objG == AbstractC3399a.f16586a) {
            return null;
        }
        return (AbstractC3400b) objG;
    }

    public final AbstractC3400b h() {
        return (AbstractC3400b) f16588b.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return androidx.concurrent.futures.b.a(f16587a, this, null, AbstractC3399a.f16586a);
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            AbstractC3400b abstractC3400bD = d();
            AbstractC3400b abstractC3400bE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16588b;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC3400bE);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, abstractC3400bE, obj, ((AbstractC3400b) obj) == null ? null : abstractC3400bD));
            if (abstractC3400bD != null) {
                f16587a.set(abstractC3400bD, abstractC3400bE);
            }
            if (!abstractC3400bE.k() || abstractC3400bE.l()) {
                if (abstractC3400bD == null || !abstractC3400bD.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(AbstractC3400b abstractC3400b) {
        return androidx.concurrent.futures.b.a(f16587a, this, null, abstractC3400b);
    }
}
