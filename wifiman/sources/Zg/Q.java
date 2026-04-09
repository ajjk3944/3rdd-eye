package Zg;

import java.util.Iterator;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public abstract class Q implements Iterator, InterfaceC6944a {
    public abstract int d();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(d());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
