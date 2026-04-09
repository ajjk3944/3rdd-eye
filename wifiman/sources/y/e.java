package Y;

import java.util.Iterator;
import java.util.NoSuchElementException;
import nh.InterfaceC6944a;

/* loaded from: classes.dex */
public abstract class e implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final u[] f24483a;

    /* renamed from: b, reason: collision with root package name */
    private int f24484b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24485c = true;

    public e(t tVar, u[] uVarArr) {
        this.f24483a = uVarArr;
        uVarArr[0].n(tVar.p(), tVar.m() * 2);
        this.f24484b = 0;
        f();
    }

    private final void d() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void f() {
        if (this.f24483a[this.f24484b].h()) {
            return;
        }
        for (int i10 = this.f24484b; -1 < i10; i10--) {
            int iH = h(i10);
            if (iH == -1 && this.f24483a[i10].i()) {
                this.f24483a[i10].k();
                iH = h(i10);
            }
            if (iH != -1) {
                this.f24484b = iH;
                return;
            }
            if (i10 > 0) {
                this.f24483a[i10 - 1].k();
            }
            this.f24483a[i10].n(t.f24503e.a().p(), 0);
        }
        this.f24485c = false;
    }

    private final int h(int i10) {
        if (this.f24483a[i10].h()) {
            return i10;
        }
        if (!this.f24483a[i10].i()) {
            return -1;
        }
        t tVarE = this.f24483a[i10].e();
        if (i10 == 6) {
            this.f24483a[i10 + 1].n(tVarE.p(), tVarE.p().length);
        } else {
            this.f24483a[i10 + 1].n(tVarE.p(), tVarE.m() * 2);
        }
        return h(i10 + 1);
    }

    protected final Object e() {
        d();
        return this.f24483a[this.f24484b].d();
    }

    protected final u[] g() {
        return this.f24483a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24485c;
    }

    protected final void i(int i10) {
        this.f24484b = i10;
    }

    @Override // java.util.Iterator
    public Object next() {
        d();
        Object next = this.f24483a[this.f24484b].next();
        f();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
