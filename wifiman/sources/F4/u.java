package F4;

import f5.InterfaceC5536b;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
class u implements InterfaceC5536b {

    /* renamed from: b, reason: collision with root package name */
    private volatile Set f6013b = null;

    /* renamed from: a, reason: collision with root package name */
    private volatile Set f6012a = Collections.newSetFromMap(new ConcurrentHashMap());

    u(Collection collection) {
        this.f6012a.addAll(collection);
    }

    static u b(Collection collection) {
        return new u((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator it = this.f6012a.iterator();
            while (it.hasNext()) {
                this.f6013b.add(((InterfaceC5536b) it.next()).get());
            }
            this.f6012a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized void a(InterfaceC5536b interfaceC5536b) {
        try {
            if (this.f6013b == null) {
                this.f6012a.add(interfaceC5536b);
            } else {
                this.f6013b.add(interfaceC5536b.get());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // f5.InterfaceC5536b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f6013b == null) {
            synchronized (this) {
                try {
                    if (this.f6013b == null) {
                        this.f6013b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f6013b);
    }
}
