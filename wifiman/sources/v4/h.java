package v4;

import java.util.concurrent.atomic.AtomicReference;
import o4.AbstractC7072g;
import o4.v;
import o4.w;
import v4.n;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    private static h f63439b = new h();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f63440a = new AtomicReference(new n.b().c());

    h() {
    }

    public static h c() {
        return f63439b;
    }

    public Class a(Class cls) {
        return ((n) this.f63440a.get()).c(cls);
    }

    public Object b(AbstractC7072g abstractC7072g, Class cls) {
        return ((n) this.f63440a.get()).d(abstractC7072g, cls);
    }

    public synchronized void d(l lVar) {
        this.f63440a.set(new n.b((n) this.f63440a.get()).d(lVar).c());
    }

    public synchronized void e(w wVar) {
        this.f63440a.set(new n.b((n) this.f63440a.get()).e(wVar).c());
    }

    public Object f(v vVar, Class cls) {
        return ((n) this.f63440a.get()).e(vVar, cls);
    }
}
