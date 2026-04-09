package Y;

import Zg.AbstractC3675g;
import java.util.Collection;
import java.util.Iterator;
import nh.InterfaceC6945b;

/* loaded from: classes.dex */
public final class l extends AbstractC3675g implements Collection, InterfaceC6945b {

    /* renamed from: a, reason: collision with root package name */
    private final f f24499a;

    public l(f fVar) {
        this.f24499a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // Zg.AbstractC3675g
    public int b() {
        return this.f24499a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f24499a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f24499a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new m(this.f24499a);
    }
}
