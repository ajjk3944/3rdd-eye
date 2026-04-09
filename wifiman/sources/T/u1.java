package T;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f21256a = new AtomicReference(b0.h.a());

    /* renamed from: b, reason: collision with root package name */
    private final Object f21257b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private Object f21258c;

    public final Object a() {
        long id2 = Thread.currentThread().getId();
        return id2 == AbstractC3514b.e() ? this.f21258c : ((b0.g) this.f21256a.get()).b(id2);
    }

    public final void b(Object obj) {
        long id2 = Thread.currentThread().getId();
        if (id2 == AbstractC3514b.e()) {
            this.f21258c = obj;
            return;
        }
        synchronized (this.f21257b) {
            b0.g gVar = (b0.g) this.f21256a.get();
            if (gVar.d(id2, obj)) {
                return;
            }
            this.f21256a.set(gVar.c(id2, obj));
            Yg.J j10 = Yg.J.f24997a;
        }
    }
}
