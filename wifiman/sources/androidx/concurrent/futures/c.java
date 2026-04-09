package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class c {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        Object f30021a;

        /* renamed from: b, reason: collision with root package name */
        d f30022b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.concurrent.futures.d f30023c = androidx.concurrent.futures.d.D();

        /* renamed from: d, reason: collision with root package name */
        private boolean f30024d;

        a() {
        }

        private void d() {
            this.f30021a = null;
            this.f30022b = null;
            this.f30023c = null;
        }

        void a() {
            this.f30021a = null;
            this.f30022b = null;
            this.f30023c.y(null);
        }

        public boolean b(Object obj) {
            this.f30024d = true;
            d dVar = this.f30022b;
            boolean z10 = dVar != null && dVar.c(obj);
            if (z10) {
                d();
            }
            return z10;
        }

        public boolean c() {
            this.f30024d = true;
            d dVar = this.f30022b;
            boolean z10 = dVar != null && dVar.b(true);
            if (z10) {
                d();
            }
            return z10;
        }

        public boolean e(Throwable th2) {
            this.f30024d = true;
            d dVar = this.f30022b;
            boolean z10 = dVar != null && dVar.d(th2);
            if (z10) {
                d();
            }
            return z10;
        }

        protected void finalize() {
            androidx.concurrent.futures.d dVar;
            d dVar2 = this.f30022b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f30021a));
            }
            if (this.f30024d || (dVar = this.f30023c) == null) {
                return;
            }
            dVar.y(null);
        }
    }

    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    public interface InterfaceC1091c {
        Object a(a aVar);
    }

    private static final class d implements com.google.common.util.concurrent.d {

        /* renamed from: a, reason: collision with root package name */
        final WeakReference f30025a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.concurrent.futures.a f30026b = new a();

        class a extends androidx.concurrent.futures.a {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String s() {
                a aVar = (a) d.this.f30025a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f30021a + "]";
            }
        }

        d(a aVar) {
            this.f30025a = new WeakReference(aVar);
        }

        @Override // com.google.common.util.concurrent.d
        public void a(Runnable runnable, Executor executor) {
            this.f30026b.a(runnable, executor);
        }

        boolean b(boolean z10) {
            return this.f30026b.cancel(z10);
        }

        boolean c(Object obj) {
            return this.f30026b.y(obj);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a aVar = (a) this.f30025a.get();
            boolean zCancel = this.f30026b.cancel(z10);
            if (zCancel && aVar != null) {
                aVar.a();
            }
            return zCancel;
        }

        boolean d(Throwable th2) {
            return this.f30026b.z(th2);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f30026b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f30026b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f30026b.isDone();
        }

        public String toString() {
            return this.f30026b.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j10, TimeUnit timeUnit) {
            return this.f30026b.get(j10, timeUnit);
        }
    }

    public static com.google.common.util.concurrent.d a(InterfaceC1091c interfaceC1091c) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f30022b = dVar;
        aVar.f30021a = interfaceC1091c.getClass();
        try {
            Object objA = interfaceC1091c.a(aVar);
            if (objA != null) {
                aVar.f30021a = objA;
            }
        } catch (Exception e10) {
            dVar.d(e10);
        }
        return dVar;
    }
}
