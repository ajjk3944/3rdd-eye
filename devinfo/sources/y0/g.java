package y0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: c, reason: collision with root package name */
    public final e f37304c;

    /* renamed from: d, reason: collision with root package name */
    public int f37305d;

    /* renamed from: e, reason: collision with root package name */
    public i f37306e;

    /* renamed from: f, reason: collision with root package name */
    public int f37307f;

    public g(e eVar, int i4) {
        super(i4, eVar.f37301h);
        this.f37304c = eVar;
        this.f37305d = eVar.g();
        this.f37307f = -1;
        b();
    }

    public final void a() {
        if (this.f37305d != this.f37304c.g()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // y0.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i4 = this.f37287a;
        e eVar = this.f37304c;
        eVar.add(i4, obj);
        this.f37287a++;
        this.f37288b = eVar.a();
        this.f37305d = eVar.g();
        this.f37307f = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        e eVar = this.f37304c;
        Object[] objArr = eVar.f37300f;
        if (objArr == null) {
            this.f37306e = null;
            return;
        }
        int i4 = (eVar.f37301h - 1) & (-32);
        int i10 = this.f37287a;
        if (i10 > i4) {
            i10 = i4;
        }
        int i11 = (eVar.f37298d / 5) + 1;
        i iVar = this.f37306e;
        if (iVar == null) {
            this.f37306e = new i(objArr, i10, i4, i11);
            return;
        }
        iVar.f37287a = i10;
        iVar.f37288b = i4;
        iVar.f37310c = i11;
        if (iVar.f37311d.length < i11) {
            iVar.f37311d = new Object[i11];
        }
        iVar.f37311d[0] = objArr;
        ?? r62 = i10 == i4 ? 1 : 0;
        iVar.f37312e = r62;
        iVar.b(i10 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f37287a;
        this.f37307f = i4;
        i iVar = this.f37306e;
        e eVar = this.f37304c;
        if (iVar == null) {
            Object[] objArr = eVar.g;
            this.f37287a = i4 + 1;
            return objArr[i4];
        }
        if (iVar.hasNext()) {
            this.f37287a++;
            return iVar.next();
        }
        Object[] objArr2 = eVar.g;
        int i10 = this.f37287a;
        this.f37287a = i10 + 1;
        return objArr2[i10 - iVar.f37288b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f37287a;
        this.f37307f = i4 - 1;
        i iVar = this.f37306e;
        e eVar = this.f37304c;
        if (iVar == null) {
            Object[] objArr = eVar.g;
            int i10 = i4 - 1;
            this.f37287a = i10;
            return objArr[i10];
        }
        int i11 = iVar.f37288b;
        if (i4 <= i11) {
            this.f37287a = i4 - 1;
            return iVar.previous();
        }
        Object[] objArr2 = eVar.g;
        int i12 = i4 - 1;
        this.f37287a = i12;
        return objArr2[i12 - i11];
    }

    @Override // y0.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i4 = this.f37307f;
        if (i4 == -1) {
            throw new IllegalStateException();
        }
        e eVar = this.f37304c;
        eVar.c(i4);
        int i10 = this.f37307f;
        if (i10 < this.f37287a) {
            this.f37287a = i10;
        }
        this.f37288b = eVar.a();
        this.f37305d = eVar.g();
        this.f37307f = -1;
        b();
    }

    @Override // y0.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i4 = this.f37307f;
        if (i4 == -1) {
            throw new IllegalStateException();
        }
        e eVar = this.f37304c;
        eVar.set(i4, obj);
        this.f37305d = eVar.g();
        b();
    }
}
