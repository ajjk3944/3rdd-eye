package Zg;

import java.util.Iterator;
import nh.InterfaceC6944a;

/* renamed from: Zg.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3688u implements Iterator, InterfaceC6944a {
    public abstract char d();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(d());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
