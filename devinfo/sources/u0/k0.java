package u0;

import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k0 implements Iterator, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final b2 f34844a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34845b;

    /* renamed from: c, reason: collision with root package name */
    public int f34846c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34847d;

    public k0(b2 b2Var, int i4, int i10) {
        this.f34844a = b2Var;
        this.f34845b = i10;
        this.f34846c = i4;
        this.f34847d = b2Var.f34749h;
        if (b2Var.g) {
            d2.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34846c < this.f34845b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b2 b2Var = this.f34844a;
        int i4 = b2Var.f34749h;
        int i10 = this.f34847d;
        if (i4 != i10) {
            d2.f();
        }
        int i11 = this.f34846c;
        this.f34846c = d2.a(i11, b2Var.f34743a) + i11;
        return new c2(b2Var, i11, i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
