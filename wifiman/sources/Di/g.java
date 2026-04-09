package Di;

import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class g extends a {

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f3581c;

    /* renamed from: d, reason: collision with root package name */
    private final k f3582d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Object[] root, Object[] tail, int i10, int i11, int i12) {
        super(i10, i11);
        AbstractC6492s.i(root, "root");
        AbstractC6492s.i(tail, "tail");
        this.f3581c = tail;
        int iC = l.c(i11);
        this.f3582d = new k(root, AbstractC7978m.g(i10, iC), iC, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        d();
        if (this.f3582d.hasNext()) {
            h(f() + 1);
            return this.f3582d.next();
        }
        Object[] objArr = this.f3581c;
        int iF = f();
        h(iF + 1);
        return objArr[iF - this.f3582d.g()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        e();
        if (f() <= this.f3582d.g()) {
            h(f() - 1);
            return this.f3582d.previous();
        }
        Object[] objArr = this.f3581c;
        h(f() - 1);
        return objArr[f() - this.f3582d.g()];
    }
}
