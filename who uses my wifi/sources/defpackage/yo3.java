package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class yo3 extends eq3 implements Runnable {
    public static final /* synthetic */ int p = 0;
    public n70 m;
    public Class n;
    public Object o;

    public yo3(n70 n70Var, Class cls, Object obj) {
        n70Var.getClass();
        this.m = n70Var;
        this.n = cls;
        this.o = obj;
    }

    @Override // defpackage.gp3
    public final void f() {
        n(this.m);
        this.m = null;
        this.n = null;
        this.o = null;
    }

    @Override // defpackage.gp3
    public final String g() {
        String strL;
        n70 n70Var = this.m;
        Class cls = this.n;
        Object obj = this.o;
        String strG = super.g();
        if (n70Var != null) {
            String string = n70Var.toString();
            strL = ex0.l(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strL = "";
        }
        if (cls == null || obj == null) {
            if (strG != null) {
                return strL.concat(strG);
            }
            return null;
        }
        int length = strL.length();
        String string2 = cls.toString();
        int length2 = string2.length();
        String string3 = obj.toString();
        StringBuilder sb = new StringBuilder(string3.length() + length + 15 + length2 + 13 + 1);
        ex0.q(sb, strL, "exceptionType=[", string2, "], fallback=[");
        return ex0.k(sb, string3, "]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        n70 n70Var = this.m;
        Class cls = this.n;
        Object obj = this.o;
        if (((obj == null) || ((n70Var == 0) | (cls == null))) || (this.f instanceof zo3)) {
            return;
        }
        this.m = null;
        try {
            th = n70Var instanceof br3 ? ((br3) n70Var).a() : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(n70Var.getClass());
                String strValueOf2 = String.valueOf(e.getClass());
                StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 19 + 16);
                ex0.q(sb, "Future type ", strValueOf, " threw ", strValueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objR = th == null ? pu1.R(n70Var) : null;
        if (th == null) {
            d(objR);
            return;
        }
        if (!cls.isInstance(th)) {
            m(n70Var);
            return;
        }
        try {
            Object objT = t(obj, th);
            this.n = null;
            this.o = null;
            s(objT);
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                e(th2);
            } finally {
                this.n = null;
                this.o = null;
            }
        }
    }

    public abstract void s(Object obj);

    public abstract Object t(Object obj, Throwable th);
}
