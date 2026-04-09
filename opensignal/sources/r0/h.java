package r0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: g, reason: collision with root package name */
    public final f f21129g;

    /* renamed from: r, reason: collision with root package name */
    public int f21130r;

    /* renamed from: x, reason: collision with root package name */
    public j f21131x;

    /* renamed from: y, reason: collision with root package name */
    public int f21132y;

    public h(f fVar, int i10) {
        super(i10, fVar.D);
        this.f21129g = fVar;
        this.f21130r = fVar.e();
        this.f21132y = -1;
        b();
    }

    public final void a() {
        if (this.f21130r != this.f21129g.e()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // r0.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i10 = this.f21111a;
        f fVar = this.f21129g;
        fVar.add(i10, obj);
        this.f21111a++;
        this.f21112d = fVar.a();
        this.f21130r = fVar.e();
        this.f21132y = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        f fVar = this.f21129g;
        Object[] objArr = fVar.f21126y;
        if (objArr == null) {
            this.f21131x = null;
            return;
        }
        int i10 = (fVar.D - 1) & (-32);
        int i11 = this.f21111a;
        if (i11 > i10) {
            i11 = i10;
        }
        int i12 = (fVar.f21124r / 5) + 1;
        j jVar = this.f21131x;
        if (jVar == null) {
            this.f21131x = new j(objArr, i11, i10, i12);
            return;
        }
        jVar.f21111a = i11;
        jVar.f21112d = i10;
        jVar.f21135g = i12;
        if (jVar.f21136r.length < i12) {
            jVar.f21136r = new Object[i12];
        }
        jVar.f21136r[0] = objArr;
        ?? r62 = i11 == i10 ? 1 : 0;
        jVar.f21137x = r62;
        jVar.b(i11 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f21111a;
        this.f21132y = i10;
        j jVar = this.f21131x;
        f fVar = this.f21129g;
        if (jVar == null) {
            Object[] objArr = fVar.B;
            this.f21111a = i10 + 1;
            return objArr[i10];
        }
        if (jVar.hasNext()) {
            this.f21111a++;
            return jVar.next();
        }
        Object[] objArr2 = fVar.B;
        int i11 = this.f21111a;
        this.f21111a = i11 + 1;
        return objArr2[i11 - jVar.f21112d];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f21111a;
        this.f21132y = i10 - 1;
        j jVar = this.f21131x;
        f fVar = this.f21129g;
        if (jVar == null) {
            Object[] objArr = fVar.B;
            int i11 = i10 - 1;
            this.f21111a = i11;
            return objArr[i11];
        }
        int i12 = jVar.f21112d;
        if (i10 <= i12) {
            this.f21111a = i10 - 1;
            return jVar.previous();
        }
        Object[] objArr2 = fVar.B;
        int i13 = i10 - 1;
        this.f21111a = i13;
        return objArr2[i13 - i12];
    }

    @Override // r0.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i10 = this.f21132y;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f21129g;
        fVar.b(i10);
        int i11 = this.f21132y;
        if (i11 < this.f21111a) {
            this.f21111a = i11;
        }
        this.f21112d = fVar.a();
        this.f21130r = fVar.e();
        this.f21132y = -1;
        b();
    }

    @Override // r0.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i10 = this.f21132y;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f21129g;
        fVar.set(i10, obj);
        this.f21130r = fVar.e();
        b();
    }
}
