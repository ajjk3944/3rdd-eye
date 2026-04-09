package r0;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: g, reason: collision with root package name */
    public final Object[] f21127g;

    /* renamed from: r, reason: collision with root package name */
    public final j f21128r;

    public g(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        super(i10, i11);
        this.f21127g = objArr2;
        int i13 = (i11 - 1) & (-32);
        this.f21128r = new j(objArr, i10 > i13 ? i13 : i10, i13, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        j jVar = this.f21128r;
        if (jVar.hasNext()) {
            this.f21111a++;
            return jVar.next();
        }
        int i10 = this.f21111a;
        this.f21111a = i10 + 1;
        return this.f21127g[i10 - jVar.f21112d];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f21111a;
        j jVar = this.f21128r;
        int i11 = jVar.f21112d;
        if (i10 <= i11) {
            this.f21111a = i10 - 1;
            return jVar.previous();
        }
        int i12 = i10 - 1;
        this.f21111a = i12;
        return this.f21127g[i12 - i11];
    }
}
