package s0;

import m1.d0;

/* loaded from: classes.dex */
public final class n extends l {

    /* renamed from: r, reason: collision with root package name */
    public final d0 f21849r;

    public n(d0 d0Var) {
        this.f21849r = d0Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f21847g;
        this.f21847g = i10 + 2;
        Object[] objArr = this.f21845a;
        return new b(this.f21849r, objArr[i10], objArr[i10 + 1]);
    }
}
