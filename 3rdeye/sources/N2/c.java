package N2;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import t4.C5606d;

/* compiled from: ActiveResources.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f4467a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4468b;

    /* renamed from: c, reason: collision with root package name */
    public final ReferenceQueue<p<?>> f4469c;

    /* renamed from: d, reason: collision with root package name */
    public m f4470d;

    /* compiled from: ActiveResources.java */
    public static final class a extends WeakReference<p<?>> {

        /* renamed from: a, reason: collision with root package name */
        public final o f4471a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f4472b;

        /* renamed from: c, reason: collision with root package name */
        public u<?> f4473c;

        public a(o oVar, p pVar, ReferenceQueue referenceQueue) {
            super(pVar, referenceQueue);
            C5606d.l(oVar, "Argument must not be null");
            this.f4471a = oVar;
            boolean z10 = pVar.f4615b;
            this.f4473c = null;
            this.f4472b = z10;
        }
    }

    public c() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new N2.a());
        this.f4468b = new HashMap();
        this.f4469c = new ReferenceQueue<>();
        this.f4467a = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new b(this));
    }

    public final synchronized void a(o oVar, p pVar) {
        a aVar = (a) this.f4468b.put(oVar, new a(oVar, pVar, this.f4469c));
        if (aVar != null) {
            aVar.f4473c = null;
            aVar.clear();
        }
    }

    public final void b(a aVar) {
        u<?> uVar;
        synchronized (this) {
            this.f4468b.remove(aVar.f4471a);
            if (aVar.f4472b && (uVar = aVar.f4473c) != null) {
                this.f4470d.f(aVar.f4471a, new p(uVar, true, false, aVar.f4471a, this.f4470d));
            }
        }
    }
}
