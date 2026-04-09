package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cp extends ep implements sk, oj {
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(cp.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final lk i;
    public final qj j;
    public Object k;
    public final Object l;

    public cp(lk lkVar, qj qjVar) {
        super(-1);
        this.i = lkVar;
        this.j = qjVar;
        this.k = pu1.h;
        Object objF = qjVar.getContext().f(0, ik.k);
        i30.j(objF);
        this.l = objF;
    }

    @Override // defpackage.ep
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof qg) {
            throw null;
        }
    }

    @Override // defpackage.sk
    public final sk c() {
        qj qjVar = this.j;
        if (qjVar != null) {
            return qjVar;
        }
        return null;
    }

    @Override // defpackage.oj
    public final void e(Object obj) {
        qj qjVar = this.j;
        hk context = qjVar.getContext();
        Throwable thA = jq0.a(obj);
        Object pgVar = thA == null ? obj : new pg(thA, false);
        lk lkVar = this.i;
        if (lkVar.l()) {
            this.k = pgVar;
            this.h = 0;
            lkVar.k(context, this);
            return;
        }
        ft ftVarA = p11.a();
        if (ftVarA.h >= 4294967296L) {
            this.k = pgVar;
            this.h = 0;
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
            hk context2 = qjVar.getContext();
            Object objY = wl2.y(context2, this.l);
            try {
                qjVar.e(obj);
                while (ftVarA.p()) {
                }
            } finally {
                wl2.v(context2, objY);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // defpackage.oj
    public final hk getContext() {
        return this.j.getContext();
    }

    @Override // defpackage.ep
    public final Object i() {
        Object obj = this.k;
        this.k = pu1.h;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.i + ", " + um.x(this.j) + ']';
    }

    @Override // defpackage.ep
    public final oj d() {
        return this;
    }
}
