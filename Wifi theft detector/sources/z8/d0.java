package z8;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class d0 implements Iterator, m9.a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f25404a;

    /* renamed from: b, reason: collision with root package name */
    public int f25405b;

    public d0(Iterator iterator) {
        kotlin.jvm.internal.p.e(iterator, "iterator");
        this.f25404a = iterator;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b0 next() {
        int i10 = this.f25405b;
        this.f25405b = i10 + 1;
        if (i10 < 0) {
            r.r();
        }
        return new b0(i10, this.f25404a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25404a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
