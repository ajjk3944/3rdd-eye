package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class sp3 extends eq3 implements Runnable {
    public static final /* synthetic */ int o = 0;
    public n70 m;
    public Object n;

    public sp3(n70 n70Var, Object obj) {
        n70Var.getClass();
        this.m = n70Var;
        this.n = obj;
    }

    @Override // defpackage.gp3
    public final void f() {
        n(this.m);
        this.m = null;
        this.n = null;
    }

    @Override // defpackage.gp3
    public final String g() {
        String strL;
        n70 n70Var = this.m;
        Object obj = this.n;
        String strG = super.g();
        if (n70Var != null) {
            String string = n70Var.toString();
            strL = ex0.l(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strL = "";
        }
        if (obj == null) {
            if (strG != null) {
                return strL.concat(strG);
            }
            return null;
        }
        int length = strL.length();
        String string2 = obj.toString();
        return ex0.m(new StringBuilder(string2.length() + length + 10 + 1), strL, "function=[", string2, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        n70 n70Var = this.m;
        Object obj = this.n;
        if (((this.f instanceof zo3) | (n70Var == null)) || (obj == null)) {
            return;
        }
        this.m = null;
        if (n70Var.isCancelled()) {
            m(n70Var);
            return;
        }
        try {
            try {
                Object objT = t(obj, pu1.R(n70Var));
                this.n = null;
                s(objT);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    e(th);
                } finally {
                    this.n = null;
                }
            }
        } catch (Error e) {
            e(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            e(e2.getCause());
        } catch (Exception e3) {
            e(e3);
        }
    }

    public abstract void s(Object obj);

    public abstract Object t(Object obj, Object obj2);
}
