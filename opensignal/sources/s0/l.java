package s0;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class l implements Iterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f21845a = k.f21840e.f21844d;

    /* renamed from: d, reason: collision with root package name */
    public int f21846d;

    /* renamed from: g, reason: collision with root package name */
    public int f21847g;

    public final void a(Object[] objArr, int i10, int i11) {
        this.f21845a = objArr;
        this.f21846d = i10;
        this.f21847g = i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21847g < this.f21846d;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
