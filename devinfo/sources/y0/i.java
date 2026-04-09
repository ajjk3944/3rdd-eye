package y0;

import java.util.NoSuchElementException;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: c, reason: collision with root package name */
    public int f37310c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f37311d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f37312e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public i(Object[] objArr, int i4, int i10, int i11) {
        super(i4, i10);
        this.f37310c = i11;
        Object[] objArr2 = new Object[i11];
        this.f37311d = objArr2;
        ?? r52 = i4 == i10 ? 1 : 0;
        this.f37312e = r52;
        objArr2[0] = objArr;
        b(i4 - r52, 1);
    }

    public final Object a() {
        int i4 = this.f37287a & 31;
        Object obj = this.f37311d[this.f37310c - 1];
        k.c(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i4];
    }

    public final void b(int i4, int i10) {
        int i11 = (this.f37310c - i10) * 5;
        while (i10 < this.f37310c) {
            Object[] objArr = this.f37311d;
            Object obj = objArr[i10 - 1];
            k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i10] = ((Object[]) obj)[jm.a.o(i4, i11)];
            i11 -= 5;
            i10++;
        }
    }

    public final void c(int i4) {
        int i10 = 0;
        while (jm.a.o(this.f37287a, i10) == i4) {
            i10 += 5;
        }
        if (i10 > 0) {
            b(this.f37287a, ((this.f37310c - 1) - (i10 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a();
        int i4 = this.f37287a + 1;
        this.f37287a = i4;
        if (i4 == this.f37288b) {
            this.f37312e = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f37287a--;
        if (this.f37312e) {
            this.f37312e = false;
            return a();
        }
        c(31);
        return a();
    }
}
