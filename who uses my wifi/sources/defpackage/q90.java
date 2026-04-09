package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q90 {
    public static final Executor e;
    public final LinkedHashSet a = new LinkedHashSet(1);
    public final LinkedHashSet b = new LinkedHashSet(1);
    public final Handler c = new Handler(Looper.getMainLooper());
    public volatile o90 d = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            e = new i8(1);
        } else {
            e = Executors.newCachedThreadPool(new r90());
        }
    }

    public q90(u80 u80Var) {
        d(new o90(u80Var));
    }

    public final synchronized void a(m90 m90Var) {
        Throwable th;
        try {
            o90 o90Var = this.d;
            if (o90Var != null && (th = o90Var.b) != null) {
                m90Var.onResult(th);
            }
            this.b.add(m90Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(m90 m90Var) {
        u80 u80Var;
        try {
            o90 o90Var = this.d;
            if (o90Var != null && (u80Var = o90Var.a) != null) {
                m90Var.onResult(u80Var);
            }
            this.a.add(m90Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        o90 o90Var = this.d;
        if (o90Var == null) {
            return;
        }
        u80 u80Var = o90Var.a;
        int i = 0;
        if (u80Var != null) {
            synchronized (this) {
                ArrayList arrayList = new ArrayList(this.a);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((m90) obj).onResult(u80Var);
                }
            }
            return;
        }
        Throwable th = o90Var.b;
        synchronized (this) {
            ArrayList arrayList2 = new ArrayList(this.b);
            if (arrayList2.isEmpty()) {
                j80.c("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((m90) obj2).onResult(th);
            }
        }
    }

    public final void d(o90 o90Var) {
        if (this.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.d = o90Var;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.c.post(new e2(11, this));
        }
    }

    public q90(Callable callable, boolean z) {
        if (z) {
            try {
                d((o90) callable.call());
                return;
            } catch (Throwable th) {
                d(new o90(th));
                return;
            }
        }
        Executor executor = e;
        p90 p90Var = new p90(callable);
        p90Var.f = this;
        executor.execute(p90Var);
    }
}
