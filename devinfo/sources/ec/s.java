package ec;

import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f23050a;

    public s(t tVar) {
        this.f23050a = tVar.f23067a.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23050a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f23050a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
