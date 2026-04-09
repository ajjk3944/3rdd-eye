package Z;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import nh.InterfaceC6944a;

/* loaded from: classes.dex */
public class c implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private Object f25069a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f25070b;

    /* renamed from: c, reason: collision with root package name */
    private int f25071c;

    public c(Object obj, Map map) {
        this.f25069a = obj;
        this.f25070b = map;
    }

    private final void d() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f25071c < this.f25070b.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        d();
        Object obj = this.f25069a;
        this.f25071c++;
        Object obj2 = this.f25070b.get(obj);
        if (obj2 != null) {
            this.f25069a = ((a) obj2).c();
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
