package Gi;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public class d implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private Object f7518a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f7519b;

    /* renamed from: c, reason: collision with root package name */
    private int f7520c;

    public d(Object obj, Map map) {
        AbstractC6492s.i(map, "map");
        this.f7518a = obj;
        this.f7519b = map;
    }

    private final void d() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final int e() {
        return this.f7520c;
    }

    public final void f(int i10) {
        this.f7520c = i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f7520c < this.f7519b.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        d();
        Object obj = this.f7518a;
        this.f7520c++;
        Object obj2 = this.f7519b.get(obj);
        if (obj2 != null) {
            this.f7518a = ((a) obj2).c();
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
