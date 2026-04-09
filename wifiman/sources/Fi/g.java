package Fi;

import Zg.AbstractC3678j;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6949f;

/* loaded from: classes4.dex */
public final class g extends AbstractC3678j implements Set, InterfaceC6949f {

    /* renamed from: a, reason: collision with root package name */
    private final d f6709a;

    public g(d builder) {
        AbstractC6492s.i(builder, "builder");
        this.f6709a = builder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f6709a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f6709a.containsKey(obj);
    }

    @Override // Zg.AbstractC3678j
    public int g() {
        return this.f6709a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new h(this.f6709a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.f6709a.containsKey(obj)) {
            return false;
        }
        this.f6709a.remove(obj);
        return true;
    }
}
