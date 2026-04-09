package f7;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.o0;
import com.applovin.impl.da;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: e, reason: collision with root package name */
    public static final Executor f23723e;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f23724a = new LinkedHashSet(1);

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f23725b = new LinkedHashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final Handler f23726c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public volatile c0 f23727d = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f23723e = new da(1);
        } else {
            f23723e = Executors.newCachedThreadPool(new r7.e());
        }
    }

    public e0(j jVar) {
        f(new c0(jVar));
    }

    public final synchronized void a(a0 a0Var) {
        Throwable th2;
        try {
            c0 c0Var = this.f23727d;
            if (c0Var != null && (th2 = c0Var.f23717b) != null) {
                a0Var.onResult(th2);
            }
            this.f23725b.add(a0Var);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void b(a0 a0Var) {
        j jVar;
        try {
            c0 c0Var = this.f23727d;
            if (c0Var != null && (jVar = c0Var.f23716a) != null) {
                a0Var.onResult(jVar);
            }
            this.f23724a.add(a0Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.f23725b);
        if (arrayList.isEmpty()) {
            r7.d.c("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((a0) obj).onResult(th2);
        }
    }

    public final void d() {
        c0 c0Var = this.f23727d;
        if (c0Var == null) {
            return;
        }
        j jVar = c0Var.f23716a;
        if (jVar == null) {
            c(c0Var.f23717b);
            return;
        }
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.f23724a);
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((a0) obj).onResult(jVar);
            }
        }
    }

    public final synchronized void e(i iVar) {
        this.f23725b.remove(iVar);
    }

    public final void f(c0 c0Var) {
        if (this.f23727d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f23727d = c0Var;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            d();
        } else {
            this.f23726c.post(new o0(21, this));
        }
    }

    public e0(Callable callable, boolean z3) {
        if (z3) {
            try {
                f((c0) callable.call());
                return;
            } catch (Throwable th2) {
                f(new c0(th2));
                return;
            }
        }
        Executor executor = f23723e;
        d0 d0Var = new d0(callable);
        d0Var.f23719a = this;
        executor.execute(d0Var);
    }
}
