package Ei;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public abstract class e implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final u[] f4773a;

    /* renamed from: b, reason: collision with root package name */
    private int f4774b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4775c;

    public e(t node, u[] path) {
        AbstractC6492s.i(node, "node");
        AbstractC6492s.i(path, "path");
        this.f4773a = path;
        this.f4775c = true;
        path[0].n(node.m(), node.i() * 2);
        this.f4774b = 0;
        f();
    }

    private final void d() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void f() {
        if (this.f4773a[this.f4774b].h()) {
            return;
        }
        for (int i10 = this.f4774b; -1 < i10; i10--) {
            int iH = h(i10);
            if (iH == -1 && this.f4773a[i10].i()) {
                this.f4773a[i10].k();
                iH = h(i10);
            }
            if (iH != -1) {
                this.f4774b = iH;
                return;
            }
            if (i10 > 0) {
                this.f4773a[i10 - 1].k();
            }
            this.f4773a[i10].n(t.f4797e.a().m(), 0);
        }
        this.f4775c = false;
    }

    private final int h(int i10) {
        if (this.f4773a[i10].h()) {
            return i10;
        }
        if (!this.f4773a[i10].i()) {
            return -1;
        }
        t tVarE = this.f4773a[i10].e();
        if (i10 == 6) {
            this.f4773a[i10 + 1].n(tVarE.m(), tVarE.m().length);
        } else {
            this.f4773a[i10 + 1].n(tVarE.m(), tVarE.i() * 2);
        }
        return h(i10 + 1);
    }

    protected final Object e() {
        d();
        return this.f4773a[this.f4774b].d();
    }

    protected final u[] g() {
        return this.f4773a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4775c;
    }

    protected final void i(int i10) {
        this.f4774b = i10;
    }

    @Override // java.util.Iterator
    public Object next() {
        d();
        Object next = this.f4773a[this.f4774b].next();
        f();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
