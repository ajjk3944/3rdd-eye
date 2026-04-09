package P4;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: UserMetadata.java */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final g f10643a;

    /* renamed from: b, reason: collision with root package name */
    public final E3.m f10644b;

    /* renamed from: c, reason: collision with root package name */
    public String f10645c;

    /* renamed from: d, reason: collision with root package name */
    public final a f10646d = new a(false);

    /* renamed from: e, reason: collision with root package name */
    public final a f10647e = new a(true);

    /* renamed from: f, reason: collision with root package name */
    public final l f10648f = new l();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicMarkableReference<String> f10649g = new AtomicMarkableReference<>(null, false);

    /* compiled from: UserMetadata.java */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicMarkableReference<d> f10650a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<Callable<Void>> f10651b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        public final boolean f10652c;

        public a(boolean z10) {
            this.f10652c = z10;
            this.f10650a = new AtomicMarkableReference<>(new d(z10 ? 8192 : 1024), false);
        }
    }

    public o(String str, T4.e eVar, E3.m mVar) {
        this.f10645c = str;
        this.f10643a = new g(eVar);
        this.f10644b = mVar;
    }

    public final void a(String str) {
        a aVar = this.f10647e;
        synchronized (aVar) {
            try {
                if (aVar.f10650a.getReference().b(str)) {
                    AtomicMarkableReference<d> atomicMarkableReference = aVar.f10650a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    n nVar = new n(aVar, 0);
                    AtomicReference<Callable<Void>> atomicReference = aVar.f10651b;
                    while (!atomicReference.compareAndSet(null, nVar)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    o.this.f10644b.a(nVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
