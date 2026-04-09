package Fi;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public final class o implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final p f6722a;

    public o(c map) {
        AbstractC6492s.i(map, "map");
        this.f6722a = new p(map.r(), map.s());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6722a.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object objD = this.f6722a.d();
        this.f6722a.next();
        return objD;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
