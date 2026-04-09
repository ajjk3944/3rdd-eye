package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class kd extends ep implements jd, sk, w71 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(kd.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(kd.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(kd.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final oj i;
    public final hk j;

    public kd(int i, oj ojVar) {
        super(i);
        this.i = ojVar;
        this.j = ojVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = d2.a;
    }

    public static Object C(rh0 rh0Var, Object obj, int i, dy dyVar) {
        if (obj instanceof pg) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (dyVar != null || (rh0Var instanceof kp)) {
            return new ng(obj, rh0Var instanceof kp ? (kp) rh0Var : null, dyVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void y(rh0 rh0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + rh0Var + ", already has " + obj).toString());
    }

    public final void A() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        oj ojVar = this.i;
        Throwable th = null;
        cp cpVar = ojVar instanceof cp ? (cp) ojVar : null;
        if (cpVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = cp.m;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(cpVar);
                gs3 gs3Var = pu1.i;
                if (obj == gs3Var) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(cpVar, gs3Var, this)) {
                        if (atomicReferenceFieldUpdater.get(cpVar) != gs3Var) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cpVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(cpVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            q();
            p(th);
        }
    }

    public final void B(int i, dy dyVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof rh0) {
                Object objC = C((rh0) obj2, obj, i, dyVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    q();
                }
                r(i);
                return;
            }
            if (obj2 instanceof nd) {
                nd ndVar = (nd) obj2;
                if (nd.c.compareAndSet(ndVar, 0, 1)) {
                    if (dyVar != null) {
                        n(dyVar, ndVar.a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // defpackage.w71
    public final void a(yt0 yt0Var, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = k;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        w(yt0Var);
    }

    @Override // defpackage.ep
    public final void b(Object obj, CancellationException cancellationException) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof rh0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof pg) {
                return;
            }
            if (!(obj2 instanceof ng)) {
                cancellationException2 = cancellationException;
                ng ngVar = new ng(obj2, (kp) null, (dy) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, ngVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            ng ngVar2 = (ng) obj2;
            if (ngVar2.e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            ng ngVarA = ng.a(ngVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, ngVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    cancellationException2 = cancellationException;
                }
            }
            kp kpVar = ngVar2.b;
            if (kpVar != null) {
                m(kpVar);
            }
            dy dyVar = ngVar2.c;
            if (dyVar != null) {
                n(dyVar, cancellationException);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // defpackage.sk
    public final sk c() {
        oj ojVar = this.i;
        if (ojVar instanceof sk) {
            return (sk) ojVar;
        }
        return null;
    }

    @Override // defpackage.ep
    public final oj d() {
        return this.i;
    }

    @Override // defpackage.oj
    public final void e(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Throwable thA = jq0.a(obj);
        if (thA != null) {
            obj = new pg(thA, false);
        }
        B(this.h, null, obj);
    }

    @Override // defpackage.ep
    public final Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // defpackage.ep
    public final Object g(Object obj) {
        return obj instanceof ng ? ((ng) obj).a : obj;
    }

    @Override // defpackage.oj
    public final hk getContext() {
        return this.j;
    }

    @Override // defpackage.ep
    public final Object i() {
        return l.get(this);
    }

    @Override // defpackage.jd
    public final void j(Object obj) {
        r(this.h);
    }

    @Override // defpackage.jd
    public final void k(Object obj, dy dyVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        B(this.h, dyVar, obj);
    }

    @Override // defpackage.jd
    public final gs3 l(Object obj, dy dyVar) {
        gs3 gs3Var = yc0.a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof rh0)) {
                return null;
            }
            Object objC = C((rh0) obj2, obj, this.h, dyVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!x()) {
                q();
            }
            return gs3Var;
        }
    }

    public final void m(kp kpVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            kpVar.a.b();
        } catch (Throwable th) {
            uk2.q(this.j, new rg("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    public final void n(dy dyVar, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            dyVar.g(th);
        } catch (Throwable th2) {
            uk2.q(this.j, new rg("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void o(yt0 yt0Var, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        hk hkVar = this.j;
        int i = k.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            yt0Var.g(i, hkVar);
        } catch (Throwable th2) {
            uk2.q(hkVar, new rg("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void p(Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof rh0) {
                nd ndVar = new nd(this, th, (obj instanceof kp) || (obj instanceof yt0));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ndVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                rh0 rh0Var = (rh0) obj;
                if (rh0Var instanceof kp) {
                    m((kp) obj);
                } else if (rh0Var instanceof yt0) {
                    o((yt0) obj, th);
                }
                if (!x()) {
                    q();
                }
                r(this.h);
                return;
            }
            return;
        }
    }

    public final void q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
        jp jpVar = (jp) atomicReferenceFieldUpdater.get(this);
        if (jpVar == null) {
            return;
        }
        jpVar.b();
        atomicReferenceFieldUpdater.set(this, ph0.f);
    }

    public final void r(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = k;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                oj ojVar = this.i;
                if (!z && (ojVar instanceof cp)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.h;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        cp cpVar = (cp) ojVar;
                        lk lkVar = cpVar.i;
                        hk context = cpVar.j.getContext();
                        if (lkVar.l()) {
                            lkVar.k(context, this);
                            return;
                        }
                        ft ftVarA = p11.a();
                        if (ftVarA.h >= 4294967296L) {
                            l8 l8Var = ftVarA.j;
                            if (l8Var == null) {
                                l8Var = new l8();
                                ftVarA.j = l8Var;
                            }
                            l8Var.addLast(this);
                            return;
                        }
                        ftVarA.o(true);
                        try {
                            yc0.k(this, ojVar, true);
                            do {
                            } while (ftVarA.p());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                yc0.k(this, ojVar, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable s(g40 g40Var) {
        return g40Var.v();
    }

    public final Object t() throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        w30 w30Var;
        boolean zX = x();
        do {
            atomicIntegerFieldUpdater = k;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zX) {
                    A();
                }
                Object obj = l.get(this);
                if (obj instanceof pg) {
                    throw ((pg) obj).a;
                }
                int i3 = this.h;
                if ((i3 != 1 && i3 != 2) || (w30Var = (w30) this.j.h(fr.j)) == null || w30Var.a()) {
                    return g(obj);
                }
                CancellationException cancellationExceptionV = ((g40) w30Var).v();
                b(obj, cancellationExceptionV);
                throw cancellationExceptionV;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((jp) m.get(this)) == null) {
            v();
        }
        if (zX) {
            A();
        }
        return rk.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(z());
        sb.append('(');
        sb.append(um.x(this.i));
        sb.append("){");
        Object obj = l.get(this);
        sb.append(obj instanceof rh0 ? "Active" : obj instanceof nd ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(um.k(this));
        return sb.toString();
    }

    public final void u() {
        jp jpVarV = v();
        if (jpVarV == null || (l.get(this) instanceof rh0)) {
            return;
        }
        jpVarV.b();
        m.set(this, ph0.f);
    }

    public final jp v() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        w30 w30Var = (w30) this.j.h(fr.j);
        if (w30Var == null) {
            return null;
        }
        jp jpVarO = wl2.o(w30Var, true, new re(this), 2);
        do {
            atomicReferenceFieldUpdater = m;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, jpVarO)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return jpVarO;
    }

    public final void w(rh0 rh0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof d2) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rh0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            boolean z = true;
            if (obj instanceof kp ? true : obj instanceof yt0) {
                y(rh0Var, obj);
                throw null;
            }
            if (obj instanceof pg) {
                pg pgVar = (pg) obj;
                if (!pg.b.compareAndSet(pgVar, 0, 1)) {
                    y(rh0Var, obj);
                    throw null;
                }
                if (obj instanceof nd) {
                    Throwable th = pgVar.a;
                    if (rh0Var instanceof kp) {
                        m((kp) rh0Var);
                        return;
                    } else {
                        o((yt0) rh0Var, th);
                        return;
                    }
                }
                return;
            }
            if (obj instanceof ng) {
                ng ngVar = (ng) obj;
                if (ngVar.b != null) {
                    y(rh0Var, obj);
                    throw null;
                }
                if (rh0Var instanceof yt0) {
                    return;
                }
                kp kpVar = (kp) rh0Var;
                if (ngVar.e != null) {
                    m(kpVar);
                    return;
                }
                ng ngVarA = ng.a(ngVar, kpVar, null, 29);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, ngVarA)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else {
                if (rh0Var instanceof yt0) {
                    return;
                }
                ng ngVar2 = new ng(obj, (kp) rh0Var, (dy) null, (CancellationException) null, 28);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, ngVar2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            }
        }
    }

    public final boolean x() {
        if (this.h != 2) {
            return false;
        }
        oj ojVar = this.i;
        i30.k(ojVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return cp.m.get((cp) ojVar) != null;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
