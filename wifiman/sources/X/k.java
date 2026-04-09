package X;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class k extends a {

    /* renamed from: c, reason: collision with root package name */
    private int f24002c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f24003d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f24004e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f24002c = i12;
        Object[] objArr2 = new Object[i12];
        this.f24003d = objArr2;
        ?? r52 = i10 == i11 ? 1 : 0;
        this.f24004e = r52;
        objArr2[0] = objArr;
        k(i10 - r52, 1);
    }

    private final Object j() {
        int iF = f() & 31;
        Object obj = this.f24003d[this.f24002c - 1];
        AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[iF];
    }

    private final void k(int i10, int i11) {
        int i12 = (this.f24002c - i11) * 5;
        while (i11 < this.f24002c) {
            Object[] objArr = this.f24003d;
            Object obj = objArr[i11 - 1];
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[l.a(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    private final void n(int i10) {
        int i11 = 0;
        while (l.a(f(), i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            k(f(), ((this.f24002c - 1) - (i11 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objJ = j();
        h(f() + 1);
        if (f() == g()) {
            this.f24004e = true;
            return objJ;
        }
        n(0);
        return objJ;
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void p(Object[] objArr, int i10, int i11, int i12) {
        h(i10);
        i(i11);
        this.f24002c = i12;
        if (this.f24003d.length < i12) {
            this.f24003d = new Object[i12];
        }
        this.f24003d[0] = objArr;
        ?? r02 = i10 == i11 ? 1 : 0;
        this.f24004e = r02;
        k(i10 - r02, 1);
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        h(f() - 1);
        if (this.f24004e) {
            this.f24004e = false;
            return j();
        }
        n(31);
        return j();
    }
}
