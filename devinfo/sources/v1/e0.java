package v1;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 implements Iterator, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35663a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f35664b;

    public e0(z0.d dVar) {
        z0.k[] kVarArr = new z0.k[8];
        for (int i4 = 0; i4 < 8; i4++) {
            kVarArr[i4] = new z0.m(this);
        }
        this.f35664b = new z0.e(dVar, kVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f35663a) {
            case 0:
                return this.f35664b.hasNext();
            default:
                return ((z0.e) this.f35664b).f37807c;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f35663a) {
            case 0:
                return (h0) this.f35664b.next();
            default:
                return (Map.Entry) ((z0.e) this.f35664b).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f35663a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((z0.e) this.f35664b).remove();
                return;
        }
    }

    public e0(f0 f0Var) {
        this.f35664b = f0Var.j.iterator();
    }
}
