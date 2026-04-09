package r8;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: e, reason: collision with root package name */
    public static final Executor f21307e;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f21308a = new LinkedHashSet(1);

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f21309b = new LinkedHashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final Handler f21310c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public volatile a0 f21311d = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f21307e = new e7.d(0);
        } else {
            f21307e = Executors.newCachedThreadPool(new e9.d());
        }
    }

    public c0(h hVar) {
        d(new a0(hVar));
    }

    public final synchronized void a(y yVar) {
        Throwable th2;
        try {
            a0 a0Var = this.f21311d;
            if (a0Var != null && (th2 = a0Var.f21305b) != null) {
                yVar.onResult(th2);
            }
            this.f21309b.add(yVar);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void b(y yVar) {
        h hVar;
        try {
            a0 a0Var = this.f21311d;
            if (a0Var != null && (hVar = a0Var.f21304a) != null) {
                yVar.onResult(hVar);
            }
            this.f21308a.add(yVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c() {
        a0 a0Var = this.f21311d;
        if (a0Var == null) {
            return;
        }
        h hVar = a0Var.f21304a;
        if (hVar != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.f21308a).iterator();
                while (it.hasNext()) {
                    ((y) it.next()).onResult(hVar);
                }
            }
            return;
        }
        Throwable th2 = a0Var.f21305b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.f21309b);
            if (arrayList.isEmpty()) {
                e9.c.c("Lottie encountered an error but no failure listener was added:", th2);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((y) it2.next()).onResult(th2);
            }
        }
    }

    public final void d(a0 a0Var) {
        if (this.f21311d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f21311d = a0Var;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.f21310c.post(new j4.o(15, this));
        }
    }

    public c0(Callable callable, boolean z10) {
        if (z10) {
            try {
                d((a0) callable.call());
                return;
            } catch (Throwable th2) {
                d(new a0(th2));
                return;
            }
        }
        Executor executor = f21307e;
        b0 b0Var = new b0(callable);
        b0Var.f21306a = this;
        executor.execute(b0Var);
    }
}
