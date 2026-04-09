package Fi;

import Zg.AbstractC3675g;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6945b;

/* loaded from: classes4.dex */
public final class j extends AbstractC3675g implements Collection, InterfaceC6945b {

    /* renamed from: a, reason: collision with root package name */
    private final d f6717a;

    public j(d builder) {
        AbstractC6492s.i(builder, "builder");
        this.f6717a = builder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // Zg.AbstractC3675g
    public int b() {
        return this.f6717a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f6717a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f6717a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new k(this.f6717a);
    }
}
