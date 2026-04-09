package defpackage;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class tp3 extends wp3 {
    public static final oq3 t = new oq3(tp3.class);
    public tm3 q;
    public final boolean r;
    public final boolean s;

    public tp3(tm3 tm3Var, boolean z, boolean z2) {
        int size = tm3Var.size();
        this.m = null;
        this.n = size;
        this.q = tm3Var;
        this.r = z;
        this.s = z2;
    }

    @Override // defpackage.gp3
    public final void f() {
        tm3 tm3Var = this.q;
        r(1);
        if ((tm3Var != null) && (this.f instanceof zo3)) {
            boolean zL = l();
            yq2 yq2VarA = tm3Var.a();
            while (yq2VarA.hasNext()) {
                ((Future) yq2VarA.next()).cancel(zL);
            }
        }
    }

    @Override // defpackage.gp3
    public final String g() {
        tm3 tm3Var = this.q;
        return tm3Var != null ? "futures=".concat(tm3Var.toString()) : super.g();
    }

    public abstract void r(int i);

    public final void s(int i, n70 n70Var) {
        try {
            if (n70Var.isCancelled()) {
                this.q = null;
                cancel(false);
            } else {
                try {
                    w(i, bd2.E(n70Var));
                } catch (ExecutionException e) {
                    t(e.getCause());
                } catch (Throwable th) {
                    t(th);
                }
            }
        } finally {
            u(null);
        }
    }

    public final void t(Throwable th) {
        th.getClass();
        if (this.r && !e(th)) {
            Set set = this.m;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.f instanceof zo3)) {
                    Throwable thA = a();
                    Objects.requireNonNull(thA);
                    while (thA != null && setNewSetFromMap.add(thA)) {
                        thA = thA.getCause();
                    }
                }
                wp3.o.I(this, setNewSetFromMap);
                set = this.m;
                Objects.requireNonNull(set);
            }
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                if (set.add(cause)) {
                }
            }
            t.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
            return;
        }
        boolean z = th instanceof Error;
        if (z) {
            t.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != z ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
        }
    }

    public final void u(tm3 tm3Var) {
        int iN = wp3.o.N(this);
        int i = 0;
        zt0.c0("Less than 0 remaining futures", iN >= 0);
        if (iN == 0) {
            if (tm3Var != null) {
                yq2 yq2VarA = tm3Var.a();
                while (yq2VarA.hasNext()) {
                    Future future = (Future) yq2VarA.next();
                    if (!future.isCancelled()) {
                        try {
                            w(i, bd2.E(future));
                        } catch (ExecutionException e) {
                            t(e.getCause());
                        } catch (Throwable th) {
                            t(th);
                        }
                    }
                    i++;
                }
            }
            this.m = null;
            x();
            r(2);
        }
    }

    public final void v() {
        Objects.requireNonNull(this.q);
        if (this.q.isEmpty()) {
            x();
            return;
        }
        boolean z = this.r;
        dq3 dq3Var = dq3.f;
        if (z) {
            yq2 yq2VarA = this.q.a();
            int i = 0;
            while (yq2VarA.hasNext()) {
                n70 n70Var = (n70) yq2VarA.next();
                int i2 = i + 1;
                if (n70Var.isDone()) {
                    s(i, n70Var);
                } else {
                    n70Var.c(new k7(this, i, n70Var, 6), dq3Var);
                }
                i = i2;
            }
            return;
        }
        tm3 tm3Var = this.q;
        tm3 tm3Var2 = true != this.s ? null : tm3Var;
        sz2 sz2Var = new sz2(this, tm3Var2, 16);
        yq2 yq2VarA2 = tm3Var.a();
        while (yq2VarA2.hasNext()) {
            n70 n70Var2 = (n70) yq2VarA2.next();
            if (n70Var2.isDone()) {
                u(tm3Var2);
            } else {
                n70Var2.c(sz2Var, dq3Var);
            }
        }
    }

    public abstract void w(int i, Object obj);

    public abstract void x();
}
