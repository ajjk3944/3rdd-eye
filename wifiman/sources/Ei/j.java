package Ei;

import Zg.AbstractC3678j;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6949f;

/* loaded from: classes4.dex */
public final class j extends AbstractC3678j implements Set, InterfaceC6949f {

    /* renamed from: a, reason: collision with root package name */
    private final f f4792a;

    public j(f builder) {
        AbstractC6492s.i(builder, "builder");
        this.f4792a = builder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f4792a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f4792a.containsKey(obj);
    }

    @Override // Zg.AbstractC3678j
    public int g() {
        return this.f4792a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new k(this.f4792a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.f4792a.containsKey(obj)) {
            return false;
        }
        this.f4792a.remove(obj);
        return true;
    }
}
