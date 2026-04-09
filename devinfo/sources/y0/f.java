package y0;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f37302c;

    /* renamed from: d, reason: collision with root package name */
    public final i f37303d;

    public f(int i4, int i10, int i11, Object[] objArr, Object[] objArr2) {
        super(i4, i10);
        this.f37302c = objArr2;
        int i12 = (i10 - 1) & (-32);
        this.f37303d = new i(objArr, i4 > i12 ? i12 : i4, i12, i11);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        i iVar = this.f37303d;
        if (iVar.hasNext()) {
            this.f37287a++;
            return iVar.next();
        }
        int i4 = this.f37287a;
        this.f37287a = i4 + 1;
        return this.f37302c[i4 - iVar.f37288b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f37287a;
        i iVar = this.f37303d;
        int i10 = iVar.f37288b;
        if (i4 <= i10) {
            this.f37287a = i4 - 1;
            return iVar.previous();
        }
        int i11 = i4 - 1;
        this.f37287a = i11;
        return this.f37302c[i11 - i10];
    }
}
