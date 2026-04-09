package Fi;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public class p implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private Object f6723a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f6724b;

    /* renamed from: c, reason: collision with root package name */
    private int f6725c;

    public p(Object obj, Map hashMap) {
        AbstractC6492s.i(hashMap, "hashMap");
        this.f6723a = obj;
        this.f6724b = hashMap;
    }

    public final Object d() {
        return this.f6723a;
    }

    @Override // java.util.Iterator
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public a next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.f6724b.get(this.f6723a);
        if (obj != null) {
            a aVar = (a) obj;
            this.f6725c++;
            this.f6723a = aVar.c();
            return aVar;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f6723a + ") has changed after it was added to the persistent map.");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6725c < this.f6724b.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
