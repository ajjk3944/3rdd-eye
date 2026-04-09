package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class eu0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(eu0.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(eu0.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(eu0.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(eu0.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(eu0.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final cu0 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public eu0(int i) {
        this.a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(ex0.f("Semaphore should have at least 1 permit, but had ", i).toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(ex0.f("The number of acquired permits should be in 0..", i).toString());
        }
        gu0 gu0Var = new gu0(0L, null, 2);
        this.head$volatile = gu0Var;
        this.tail$volatile = gu0Var;
        this._availablePermits$volatile = i;
        this.b = new cu0(0, this);
    }

    public final boolean a(w71 w71Var) {
        Object objF;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        gu0 gu0Var = (gu0) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        bu0 bu0Var = bu0.n;
        long j = andIncrement / fu0.f;
        loop0: while (true) {
            objF = i41.f(gu0Var, j, bu0Var);
            if (!um.p(objF)) {
                yt0 yt0VarM = um.m(objF);
                while (true) {
                    yt0 yt0Var = (yt0) atomicReferenceFieldUpdater.get(this);
                    if (yt0Var.c >= yt0VarM.c) {
                        break loop0;
                    }
                    if (!yt0VarM.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, yt0Var, yt0VarM)) {
                        if (atomicReferenceFieldUpdater.get(this) != yt0Var) {
                            if (yt0VarM.e()) {
                                yt0VarM.d();
                            }
                        }
                    }
                    if (yt0Var.e()) {
                        yt0Var.d();
                    }
                }
            } else {
                break;
            }
        }
        gu0 gu0Var2 = (gu0) um.m(objF);
        AtomicReferenceArray atomicReferenceArray = gu0Var2.e;
        int i = (int) (andIncrement % fu0.f);
        while (!atomicReferenceArray.compareAndSet(i, null, w71Var)) {
            if (atomicReferenceArray.get(i) != null) {
                gs3 gs3Var = fu0.b;
                gs3 gs3Var2 = fu0.c;
                while (!atomicReferenceArray.compareAndSet(i, gs3Var, gs3Var2)) {
                    if (atomicReferenceArray.get(i) != gs3Var) {
                        return false;
                    }
                }
                ((jd) w71Var).k(z31.a, this.b);
                return true;
            }
        }
        w71Var.a(gu0Var2, i);
        return true;
    }

    public final void b() {
        int i;
        Object objF;
        boolean z;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            gu0 gu0Var = (gu0) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = d.getAndIncrement(this);
            long j = andIncrement2 / fu0.f;
            du0 du0Var = du0.n;
            while (true) {
                objF = i41.f(gu0Var, j, du0Var);
                if (um.p(objF)) {
                    break;
                }
                yt0 yt0VarM = um.m(objF);
                while (true) {
                    yt0 yt0Var = (yt0) atomicReferenceFieldUpdater.get(this);
                    if (yt0Var.c >= yt0VarM.c) {
                        break;
                    }
                    if (!yt0VarM.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, yt0Var, yt0VarM)) {
                        if (atomicReferenceFieldUpdater.get(this) != yt0Var) {
                            if (yt0VarM.e()) {
                                yt0VarM.d();
                            }
                        }
                    }
                    if (yt0Var.e()) {
                        yt0Var.d();
                    }
                }
            }
            gu0 gu0Var2 = (gu0) um.m(objF);
            AtomicReferenceArray atomicReferenceArray = gu0Var2.e;
            gu0Var2.a();
            z = false;
            if (gu0Var2.c <= j) {
                int i3 = (int) (andIncrement2 % fu0.f);
                Object andSet = atomicReferenceArray.getAndSet(i3, fu0.b);
                if (andSet == null) {
                    int i4 = fu0.a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == fu0.c) {
                            z = true;
                            break;
                        }
                    }
                    gs3 gs3Var = fu0.b;
                    gs3 gs3Var2 = fu0.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, gs3Var, gs3Var2)) {
                            if (atomicReferenceArray.get(i3) != gs3Var) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    z = !z;
                } else if (andSet != fu0.e) {
                    if (!(andSet instanceof jd)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    jd jdVar = (jd) andSet;
                    gs3 gs3VarL = jdVar.l(z31.a, this.b);
                    if (gs3VarL != null) {
                        jdVar.j(gs3VarL);
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }
}
