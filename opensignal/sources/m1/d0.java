package m1;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class d0 implements Iterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16167a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f16168d;

    public d0(Object[] objArr) {
        br.l.e(objArr, "array");
        this.f16168d = br.b0.e(objArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f16167a) {
            case 0:
                return this.f16168d.hasNext();
            case 1:
                return ((br.b) this.f16168d).hasNext();
            default:
                return ((s0.e) this.f16168d).f21830g;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f16167a) {
            case 0:
                return (g0) this.f16168d.next();
            case 1:
                return ((br.b) this.f16168d).next();
            default:
                return (Map.Entry) ((s0.e) this.f16168d).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f16167a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException();
            default:
                ((s0.e) this.f16168d).remove();
                return;
        }
    }

    public d0(v0.g gVar) {
        s0.l[] lVarArr = new s0.l[8];
        for (int i10 = 0; i10 < 8; i10++) {
            lVarArr[i10] = new s0.n(this);
        }
        this.f16168d = new s0.e(gVar, lVarArr);
    }

    public d0(e0 e0Var) {
        this.f16168d = e0Var.F.iterator();
    }
}
