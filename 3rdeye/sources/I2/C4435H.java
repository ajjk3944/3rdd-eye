package i2;

import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.LottieAnimationView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import u2.C5624c;
import u2.ThreadFactoryC5625d;

/* compiled from: LottieTask.java */
/* renamed from: i2.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4435H<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final ExecutorService f38327e = Executors.newCachedThreadPool(new ThreadFactoryC5625d());

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f38328a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f38329b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f38330c;

    /* renamed from: d, reason: collision with root package name */
    public volatile C4434G<T> f38331d;

    /* compiled from: LottieTask.java */
    /* renamed from: i2.H$a */
    public static class a<T> extends FutureTask<C4434G<T>> {

        /* renamed from: b, reason: collision with root package name */
        public C4435H<T> f38332b;

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.f38332b.f(get());
                } catch (InterruptedException | ExecutionException e4) {
                    this.f38332b.f(new C4434G<>(e4));
                }
            } finally {
                this.f38332b = null;
            }
        }
    }

    public C4435H() {
        throw null;
    }

    public C4435H(C4448h c4448h) {
        this.f38328a = new LinkedHashSet(1);
        this.f38329b = new LinkedHashSet(1);
        this.f38330c = new Handler(Looper.getMainLooper());
        this.f38331d = null;
        f(new C4434G<>(c4448h));
    }

    public final synchronized void a(InterfaceC4431D interfaceC4431D) {
        Throwable th;
        try {
            C4434G<T> c4434g = this.f38331d;
            if (c4434g != null && (th = c4434g.f38326b) != null) {
                interfaceC4431D.onResult(th);
            }
            this.f38329b.add(interfaceC4431D);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(InterfaceC4431D interfaceC4431D) {
        C4448h c4448h;
        try {
            C4434G<T> c4434g = this.f38331d;
            if (c4434g != null && (c4448h = c4434g.f38325a) != null) {
                interfaceC4431D.onResult(c4448h);
            }
            this.f38328a.add(interfaceC4431D);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f38329b);
        if (arrayList.isEmpty()) {
            C5624c.c("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC4431D) it.next()).onResult(th);
        }
    }

    public final void d() {
        C4434G<T> c4434g = this.f38331d;
        if (c4434g == null) {
            return;
        }
        C4448h c4448h = c4434g.f38325a;
        if (c4448h == null) {
            c(c4434g.f38326b);
            return;
        }
        synchronized (this) {
            Iterator it = new ArrayList(this.f38328a).iterator();
            while (it.hasNext()) {
                ((InterfaceC4431D) it.next()).onResult(c4448h);
            }
        }
    }

    public final synchronized void e(LottieAnimationView.c cVar) {
        this.f38329b.remove(cVar);
    }

    public final void f(C4434G<T> c4434g) {
        if (this.f38331d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f38331d = c4434g;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            d();
        } else {
            this.f38330c.post(new C8.a(this, 18));
        }
    }

    public C4435H(Callable<C4434G<T>> callable, boolean z10) {
        this.f38328a = new LinkedHashSet(1);
        this.f38329b = new LinkedHashSet(1);
        this.f38330c = new Handler(Looper.getMainLooper());
        this.f38331d = null;
        if (z10) {
            try {
                f(callable.call());
                return;
            } catch (Throwable th) {
                f(new C4434G<>(th));
                return;
            }
        }
        ExecutorService executorService = f38327e;
        a aVar = new a(callable);
        aVar.f38332b = this;
        executorService.execute(aVar);
    }
}
