package x5;

import java.util.Iterator;
import p5.l;

/* loaded from: classes3.dex */
public final class k implements Iterator, r5.a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f24202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f24203b;

    public k(f fVar) {
        this.f24203b = fVar;
        this.f24202a = ((g) fVar.f24199b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24202a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((l) this.f24203b.f24200c).f(this.f24202a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
