package Zg;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public final class P implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final Iterator f25343a;

    /* renamed from: b, reason: collision with root package name */
    private int f25344b;

    public P(Iterator iterator) {
        AbstractC6492s.i(iterator, "iterator");
        this.f25343a = iterator;
    }

    @Override // java.util.Iterator
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final N next() {
        int i10 = this.f25344b;
        this.f25344b = i10 + 1;
        if (i10 < 0) {
            AbstractC3689v.v();
        }
        return new N(i10, this.f25343a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25343a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
