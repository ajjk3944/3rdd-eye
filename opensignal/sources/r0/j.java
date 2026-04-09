package r0;

import br.l;
import com.google.android.gms.internal.measurement.e5;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: g, reason: collision with root package name */
    public int f21135g;

    /* renamed from: r, reason: collision with root package name */
    public Object[] f21136r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f21137x;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public j(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f21135g = i12;
        Object[] objArr2 = new Object[i12];
        this.f21136r = objArr2;
        ?? r52 = i10 == i11 ? 1 : 0;
        this.f21137x = r52;
        objArr2[0] = objArr;
        b(i10 - r52, 1);
    }

    public final Object a() {
        int i10 = this.f21111a & 31;
        Object obj = this.f21136r[this.f21135g - 1];
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i10];
    }

    public final void b(int i10, int i11) {
        int i12 = (this.f21135g - i11) * 5;
        while (i11 < this.f21135g) {
            Object[] objArr = this.f21136r;
            Object obj = objArr[i11 - 1];
            l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[e5.G(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    public final void c(int i10) {
        int i11 = 0;
        while (e5.G(this.f21111a, i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            b(this.f21111a, ((this.f21135g - 1) - (i11 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a();
        int i10 = this.f21111a + 1;
        this.f21111a = i10;
        if (i10 == this.f21112d) {
            this.f21137x = true;
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
        this.f21111a--;
        if (this.f21137x) {
            this.f21137x = false;
            return a();
        }
        c(31);
        return a();
    }
}
