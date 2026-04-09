package rt;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public boolean f21787a;

    /* renamed from: d, reason: collision with root package name */
    public final int f21788d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f21789g;

    public e(f fVar) {
        this.f21789g = fVar;
        this.f21788d = ((AbstractList) fVar).modCount;
    }

    public final void a() {
        f fVar = this.f21789g;
        int i10 = ((AbstractList) fVar).modCount;
        int i11 = this.f21788d;
        if (i10 == i11) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) fVar).modCount + "; expected: " + i11);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f21787a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f21787a) {
            throw new NoSuchElementException();
        }
        this.f21787a = true;
        a();
        return this.f21789g.f21791d;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.f21789g.clear();
    }
}
