package X;

import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f23991c;

    /* renamed from: d, reason: collision with root package name */
    private final k f23992d;

    public g(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        super(i10, i11);
        this.f23991c = objArr2;
        int iD = l.d(i11);
        this.f23992d = new k(objArr, AbstractC7978m.g(i10, iD), iD, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        d();
        if (this.f23992d.hasNext()) {
            h(f() + 1);
            return this.f23992d.next();
        }
        Object[] objArr = this.f23991c;
        int iF = f();
        h(iF + 1);
        return objArr[iF - this.f23992d.g()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        e();
        if (f() <= this.f23992d.g()) {
            h(f() - 1);
            return this.f23992d.previous();
        }
        Object[] objArr = this.f23991c;
        h(f() - 1);
        return objArr[f() - this.f23992d.g()];
    }
}
