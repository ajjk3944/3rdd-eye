package androidx.lifecycle;

import b9.C1992A;
import java.util.Iterator;
import k1.C5208b;

/* compiled from: ViewModel.jvm.kt */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final C5208b f16132a = new C5208b();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        C5208b c5208b = this.f16132a;
        if (c5208b != null) {
            if (c5208b.f43153d) {
                C5208b.a(autoCloseable);
                return;
            }
            synchronized (c5208b.f43150a) {
                autoCloseable2 = (AutoCloseable) c5208b.f43151b.put(str, autoCloseable);
            }
            C5208b.a(autoCloseable2);
        }
    }

    public final void b() {
        C5208b c5208b = this.f16132a;
        if (c5208b != null && !c5208b.f43153d) {
            c5208b.f43153d = true;
            synchronized (c5208b.f43150a) {
                try {
                    Iterator it = c5208b.f43151b.values().iterator();
                    while (it.hasNext()) {
                        C5208b.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c5208b.f43152c.iterator();
                    while (it2.hasNext()) {
                        C5208b.a((AutoCloseable) it2.next());
                    }
                    c5208b.f43152c.clear();
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final <T extends AutoCloseable> T c(String str) {
        T t10;
        C5208b c5208b = this.f16132a;
        if (c5208b == null) {
            return null;
        }
        synchronized (c5208b.f43150a) {
            t10 = (T) c5208b.f43151b.get(str);
        }
        return t10;
    }

    public void d() {
    }
}
