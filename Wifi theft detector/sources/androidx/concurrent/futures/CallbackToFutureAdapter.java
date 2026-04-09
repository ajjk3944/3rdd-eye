package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class CallbackToFutureAdapter {

    public static final class FutureGarbageCollectedException extends Throwable {
        public FutureGarbageCollectedException(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Object f1504a;

        /* renamed from: b, reason: collision with root package name */
        public c f1505b;

        /* renamed from: c, reason: collision with root package name */
        public t.b f1506c = t.b.q();

        /* renamed from: d, reason: collision with root package name */
        public boolean f1507d;

        public void a(Runnable runnable, Executor executor) {
            t.b bVar = this.f1506c;
            if (bVar != null) {
                bVar.addListener(runnable, executor);
            }
        }

        public void b() {
            this.f1504a = null;
            this.f1505b = null;
            this.f1506c.n(null);
        }

        public boolean c(Object obj) {
            this.f1507d = true;
            c cVar = this.f1505b;
            boolean z10 = cVar != null && cVar.b(obj);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean d() {
            this.f1507d = true;
            c cVar = this.f1505b;
            boolean z10 = cVar != null && cVar.a(true);
            if (z10) {
                e();
            }
            return z10;
        }

        public final void e() {
            this.f1504a = null;
            this.f1505b = null;
            this.f1506c = null;
        }

        public boolean f(Throwable th) {
            this.f1507d = true;
            c cVar = this.f1505b;
            boolean z10 = cVar != null && cVar.c(th);
            if (z10) {
                e();
            }
            return z10;
        }

        public void finalize() {
            t.b bVar;
            c cVar = this.f1505b;
            if (cVar != null && !cVar.isDone()) {
                cVar.c(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f1504a));
            }
            if (this.f1507d || (bVar = this.f1506c) == null) {
                return;
            }
            bVar.n(null);
        }
    }

    public interface b {
        Object attachCompleter(a aVar);
    }

    public static final class c implements com.google.common.util.concurrent.a {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f1508a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractResolvableFuture f1509b = new a();

        public class a extends AbstractResolvableFuture {
            public a() {
            }

            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            public String k() {
                a aVar = (a) c.this.f1508a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f1504a + "]";
            }
        }

        public c(a aVar) {
            this.f1508a = new WeakReference(aVar);
        }

        public boolean a(boolean z10) {
            return this.f1509b.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.a
        public void addListener(Runnable runnable, Executor executor) {
            this.f1509b.addListener(runnable, executor);
        }

        public boolean b(Object obj) {
            return this.f1509b.n(obj);
        }

        public boolean c(Throwable th) {
            return this.f1509b.o(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a aVar = (a) this.f1508a.get();
            boolean zCancel = this.f1509b.cancel(z10);
            if (zCancel && aVar != null) {
                aVar.b();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f1509b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f1509b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f1509b.isDone();
        }

        public String toString() {
            return this.f1509b.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j10, TimeUnit timeUnit) {
            return this.f1509b.get(j10, timeUnit);
        }
    }

    public static com.google.common.util.concurrent.a a(b bVar) {
        a aVar = new a();
        c cVar = new c(aVar);
        aVar.f1505b = cVar;
        aVar.f1504a = bVar.getClass();
        try {
            Object objAttachCompleter = bVar.attachCompleter(aVar);
            if (objAttachCompleter == null) {
                return cVar;
            }
            aVar.f1504a = objAttachCompleter;
            return cVar;
        } catch (Exception e10) {
            cVar.c(e10);
            return cVar;
        }
    }
}
