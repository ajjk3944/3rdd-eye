package androidx.lifecycle;

import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final i5.b f1128a = new i5.b();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        i5.b bVar = this.f1128a;
        if (bVar != null) {
            if (bVar.f25867d) {
                i5.b.a(autoCloseable);
                return;
            }
            synchronized (bVar.f25864a) {
                autoCloseable2 = (AutoCloseable) bVar.f25865b.put(str, autoCloseable);
            }
            i5.b.a(autoCloseable2);
        }
    }

    public final void b() {
        i5.b bVar = this.f1128a;
        if (bVar != null && !bVar.f25867d) {
            bVar.f25867d = true;
            synchronized (bVar.f25864a) {
                try {
                    Iterator it = bVar.f25865b.values().iterator();
                    while (it.hasNext()) {
                        i5.b.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = bVar.f25866c.iterator();
                    while (it2.hasNext()) {
                        i5.b.a((AutoCloseable) it2.next());
                    }
                    bVar.f25866c.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        i5.b bVar = this.f1128a;
        if (bVar == null) {
            return null;
        }
        synchronized (bVar.f25864a) {
            autoCloseable = (AutoCloseable) bVar.f25865b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
