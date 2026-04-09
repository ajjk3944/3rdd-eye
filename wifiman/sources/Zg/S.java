package Zg;

import java.util.Iterator;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public abstract class S implements Iterator, InterfaceC6944a {
    public abstract long d();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(d());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
