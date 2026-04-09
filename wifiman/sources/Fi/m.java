package Fi;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public final class m implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final p f6720a;

    public m(c map) {
        AbstractC6492s.i(map, "map");
        this.f6720a = new p(map.r(), map.s());
    }

    @Override // java.util.Iterator
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        return new Ei.b(this.f6720a.d(), this.f6720a.next().e());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6720a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
