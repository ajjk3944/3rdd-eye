package o0;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o0.AbstractC5408a;

/* compiled from: CallbackToFutureAdapter.java */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: CallbackToFutureAdapter.java */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public Object f44799a;

        /* renamed from: b, reason: collision with root package name */
        public d<T> f44800b;

        /* renamed from: c, reason: collision with root package name */
        public o0.c<Void> f44801c = new o0.c<>();

        /* renamed from: d, reason: collision with root package name */
        public boolean f44802d;

        public final void a(Runnable runnable, Executor executor) {
            o0.c<Void> cVar = this.f44801c;
            if (cVar != null) {
                cVar.addListener(runnable, executor);
            }
        }

        public final boolean b(T t10) {
            this.f44802d = true;
            d<T> dVar = this.f44800b;
            boolean z10 = dVar != null && dVar.f44804c.i(t10);
            if (z10) {
                this.f44799a = null;
                this.f44800b = null;
                this.f44801c = null;
            }
            return z10;
        }

        public final void c() {
            this.f44802d = true;
            d<T> dVar = this.f44800b;
            if (dVar == null || !dVar.f44804c.cancel(true)) {
                return;
            }
            this.f44799a = null;
            this.f44800b = null;
            this.f44801c = null;
        }

        public final boolean d(Throwable th) {
            this.f44802d = true;
            d<T> dVar = this.f44800b;
            boolean z10 = dVar != null && dVar.f44804c.j(th);
            if (z10) {
                this.f44799a = null;
                this.f44800b = null;
                this.f44801c = null;
            }
            return z10;
        }

        public final void finalize() {
            o0.c<Void> cVar;
            d<T> dVar = this.f44800b;
            if (dVar != null) {
                d.a aVar = dVar.f44804c;
                if (!aVar.isDone()) {
                    aVar.j(new C0507b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f44799a));
                }
            }
            if (this.f44802d || (cVar = this.f44801c) == null) {
                return;
            }
            cVar.i(null);
        }
    }

    /* compiled from: CallbackToFutureAdapter.java */
    /* renamed from: o0.b$b, reason: collision with other inner class name */
    public static final class C0507b extends Throwable {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* compiled from: CallbackToFutureAdapter.java */
    public interface c<T> {
        Object i(a<T> aVar) throws Exception;
    }

    /* compiled from: CallbackToFutureAdapter.java */
    public static final class d<T> implements A4.a<T> {

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference<a<T>> f44803b;

        /* renamed from: c, reason: collision with root package name */
        public final a f44804c = new a();

        /* compiled from: CallbackToFutureAdapter.java */
        public class a extends AbstractC5408a<T> {
            public a() {
            }

            @Override // o0.AbstractC5408a
            public final String g() {
                a<T> aVar = d.this.f44803b.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f44799a + "]";
            }
        }

        public d(a<T> aVar) {
            this.f44803b = new WeakReference<>(aVar);
        }

        @Override // A4.a
        public final void addListener(Runnable runnable, Executor executor) {
            this.f44804c.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            a<T> aVar = this.f44803b.get();
            boolean zCancel = this.f44804c.cancel(z10);
            if (zCancel && aVar != null) {
                aVar.f44799a = null;
                aVar.f44800b = null;
                aVar.f44801c.i(null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public final T get() throws ExecutionException, InterruptedException {
            return this.f44804c.get();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f44804c.f44779b instanceof AbstractC5408a.b;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f44804c.isDone();
        }

        public final String toString() {
            return this.f44804c.toString();
        }

        @Override // java.util.concurrent.Future
        public final T get(long j4, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f44804c.get(j4, timeUnit);
        }
    }

    public static d a(c cVar) {
        a aVar = new a();
        d<T> dVar = new d<>(aVar);
        aVar.f44800b = dVar;
        aVar.f44799a = cVar.getClass();
        try {
            Object objI = cVar.i(aVar);
            if (objI != null) {
                aVar.f44799a = objI;
                return dVar;
            }
        } catch (Exception e4) {
            dVar.f44804c.j(e4);
        }
        return dVar;
    }
}
