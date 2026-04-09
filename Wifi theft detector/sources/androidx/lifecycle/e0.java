package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f3505a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Set f3506b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f3507c = false;

    public static void b(Object obj) throws IOException {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void a() {
        this.f3507c = true;
        Map map = this.f3505a;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator it = this.f3505a.values().iterator();
                    while (it.hasNext()) {
                        b(it.next());
                    }
                } finally {
                }
            }
        }
        Set set = this.f3506b;
        if (set != null) {
            synchronized (set) {
                try {
                    Iterator it2 = this.f3506b.iterator();
                    while (it2.hasNext()) {
                        b((Closeable) it2.next());
                    }
                } finally {
                }
            }
        }
        d();
    }

    public Object c(String str) {
        Object obj;
        Map map = this.f3505a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.f3505a.get(str);
        }
        return obj;
    }

    public void d() {
    }

    public Object e(String str, Object obj) throws IOException {
        Object obj2;
        synchronized (this.f3505a) {
            try {
                obj2 = this.f3505a.get(str);
                if (obj2 == null) {
                    this.f3505a.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f3507c) {
            b(obj);
        }
        return obj;
    }
}
