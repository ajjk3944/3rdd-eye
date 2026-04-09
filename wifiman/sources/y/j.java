package Y;

import Zg.AbstractC3678j;
import java.util.Iterator;
import java.util.Set;
import nh.InterfaceC6949f;

/* loaded from: classes.dex */
public final class j extends AbstractC3678j implements Set, InterfaceC6949f {

    /* renamed from: a, reason: collision with root package name */
    private final f f24498a;

    public j(f fVar) {
        this.f24498a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f24498a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f24498a.containsKey(obj);
    }

    @Override // Zg.AbstractC3678j
    public int g() {
        return this.f24498a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new k(this.f24498a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.f24498a.containsKey(obj)) {
            return false;
        }
        this.f24498a.remove(obj);
        return true;
    }
}
