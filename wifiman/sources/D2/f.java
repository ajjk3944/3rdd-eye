package d2;

import Yg.J;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final C5286e f45723a = new C5286e();

    /* renamed from: b, reason: collision with root package name */
    private final Map f45724b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Set f45725c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f45726d;

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void d(String key, AutoCloseable closeable) throws Exception {
        AutoCloseable autoCloseable;
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(closeable, "closeable");
        if (this.f45726d) {
            f(closeable);
            return;
        }
        synchronized (this.f45723a) {
            autoCloseable = (AutoCloseable) this.f45724b.put(key, closeable);
        }
        f(autoCloseable);
    }

    public final void e() {
        if (this.f45726d) {
            return;
        }
        this.f45726d = true;
        synchronized (this.f45723a) {
            try {
                Iterator it = this.f45724b.values().iterator();
                while (it.hasNext()) {
                    f((AutoCloseable) it.next());
                }
                Iterator it2 = this.f45725c.iterator();
                while (it2.hasNext()) {
                    f((AutoCloseable) it2.next());
                }
                this.f45725c.clear();
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final AutoCloseable g(String key) {
        AutoCloseable autoCloseable;
        AbstractC6492s.i(key, "key");
        synchronized (this.f45723a) {
            autoCloseable = (AutoCloseable) this.f45724b.get(key);
        }
        return autoCloseable;
    }
}
