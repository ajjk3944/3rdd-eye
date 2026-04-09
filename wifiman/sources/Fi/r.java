package Fi;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public final class r implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final p f6727a;

    public r(c map) {
        AbstractC6492s.i(map, "map");
        this.f6727a = new p(map.r(), map.s());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6727a.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f6727a.next().e();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
