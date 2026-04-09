package defpackage;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zq3 extends nq3 {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ ar3 i;
    public final Object j;

    public zq3(ar3 ar3Var, Callable callable) {
        this.i = ar3Var;
        callable.getClass();
        this.j = callable;
    }

    @Override // defpackage.nq3
    public final Object a() {
        switch (this.h) {
            case 0:
                xp3 xp3Var = (xp3) this.j;
                n70 n70VarMo9a = xp3Var.mo9a();
                if (n70VarMo9a != null) {
                    return n70VarMo9a;
                }
                throw new NullPointerException(qb1.J("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", xp3Var));
            default:
                return ((Callable) this.j).call();
        }
    }

    @Override // defpackage.nq3
    public final String c() {
        switch (this.h) {
            case 0:
                return ((xp3) this.j).toString();
            default:
                return ((Callable) this.j).toString();
        }
    }

    @Override // defpackage.nq3
    public final boolean d() {
        switch (this.h) {
        }
        return this.i.isDone();
    }

    @Override // defpackage.nq3
    public final void e(Object obj) {
        switch (this.h) {
            case 0:
                this.i.m((n70) obj);
                break;
            default:
                this.i.d(obj);
                break;
        }
    }

    @Override // defpackage.nq3
    public final void f(Throwable th) {
        switch (this.h) {
            case 0:
                this.i.e(th);
                break;
            default:
                this.i.e(th);
                break;
        }
    }

    public zq3(ar3 ar3Var, xp3 xp3Var) {
        this.i = ar3Var;
        this.j = xp3Var;
    }
}
