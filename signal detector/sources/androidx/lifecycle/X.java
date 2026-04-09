package androidx.lifecycle;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public final o0.b f5229a = new o0.b();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        o0.b bVar = this.f5229a;
        if (bVar != null) {
            if (bVar.f22668d) {
                o0.b.a(autoCloseable);
                return;
            }
            synchronized (bVar.f22665a) {
                autoCloseable2 = (AutoCloseable) bVar.f22666b.put(str, autoCloseable);
            }
            o0.b.a(autoCloseable2);
        }
    }

    public final void b() {
        o0.b bVar = this.f5229a;
        if (bVar != null && !bVar.f22668d) {
            bVar.f22668d = true;
            synchronized (bVar.f22665a) {
                try {
                    Iterator it = bVar.f22666b.values().iterator();
                    while (it.hasNext()) {
                        o0.b.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = bVar.f22667c.iterator();
                    while (it2.hasNext()) {
                        o0.b.a((AutoCloseable) it2.next());
                    }
                    bVar.f22667c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        o0.b bVar = this.f5229a;
        if (bVar == null) {
            return null;
        }
        synchronized (bVar.f22665a) {
            autoCloseable = (AutoCloseable) bVar.f22666b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
