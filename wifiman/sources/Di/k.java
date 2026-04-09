package Di;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class k extends a {

    /* renamed from: c, reason: collision with root package name */
    private int f3591c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f3592d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3593e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] root, int i10, int i11, int i12) {
        super(i10, i11);
        AbstractC6492s.i(root, "root");
        this.f3591c = i12;
        Object[] objArr = new Object[i12];
        this.f3592d = objArr;
        ?? r52 = i10 == i11 ? 1 : 0;
        this.f3593e = r52;
        objArr[0] = root;
        k(i10 - r52, 1);
    }

    private final Object j() {
        int iF = f() & 31;
        Object obj = this.f3592d[this.f3591c - 1];
        AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[iF];
    }

    private final void k(int i10, int i11) {
        int i12 = (this.f3591c - i11) * 5;
        while (i11 < this.f3591c) {
            Object[] objArr = this.f3592d;
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
            k(f(), ((this.f3591c - 1) - (i11 / 5)) + 1);
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
            this.f3593e = true;
            return objJ;
        }
        n(0);
        return objJ;
    }

    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void p(Object[] root, int i10, int i11, int i12) {
        AbstractC6492s.i(root, "root");
        h(i10);
        i(i11);
        this.f3591c = i12;
        if (this.f3592d.length < i12) {
            this.f3592d = new Object[i12];
        }
        this.f3592d[0] = root;
        ?? r02 = i10 == i11 ? 1 : 0;
        this.f3593e = r02;
        k(i10 - r02, 1);
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        h(f() - 1);
        if (this.f3593e) {
            this.f3593e = false;
            return j();
        }
        n(31);
        return j();
    }
}
