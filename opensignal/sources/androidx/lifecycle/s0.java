package androidx.lifecycle;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final w4.a f1522a = new w4.a();

    public final void a() {
        w4.a aVar = this.f1522a;
        if (aVar != null && !aVar.f24197d) {
            aVar.f24197d = true;
            synchronized (aVar.f24194a) {
                try {
                    Iterator it = aVar.f24195b.values().iterator();
                    while (it.hasNext()) {
                        w4.a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = aVar.f24196c.iterator();
                    while (it2.hasNext()) {
                        w4.a.a((AutoCloseable) it2.next());
                    }
                    aVar.f24196c.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
