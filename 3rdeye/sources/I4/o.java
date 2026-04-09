package I4;

import g5.InterfaceC4392b;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: LazySet.java */
/* loaded from: classes2.dex */
public final class o<T> implements InterfaceC4392b<Set<T>> {

    /* renamed from: a, reason: collision with root package name */
    public volatile Set<InterfaceC4392b<T>> f2474a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set<T> f2475b;

    public o() {
        throw null;
    }

    public final synchronized void a() {
        try {
            Iterator<InterfaceC4392b<T>> it = this.f2474a.iterator();
            while (it.hasNext()) {
                this.f2475b.add(it.next().get());
            }
            this.f2474a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // g5.InterfaceC4392b
    public final Object get() {
        if (this.f2475b == null) {
            synchronized (this) {
                try {
                    if (this.f2475b == null) {
                        this.f2475b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f2475b);
    }
}
