package st;

import java.util.Iterator;
import java.util.NoSuchElementException;
import lf.t1;
import lq.b0;

/* loaded from: classes.dex */
public final class k implements Iterator, pq.c, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public int f22297a;

    /* renamed from: d, reason: collision with root package name */
    public Object f22298d;

    /* renamed from: g, reason: collision with root package name */
    public Iterator f22299g;

    /* renamed from: r, reason: collision with root package name */
    public pq.c f22300r;

    public final RuntimeException a() {
        int i10 = this.f22297a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f22297a);
    }

    public final qq.a b(Object obj, pq.c cVar) {
        this.f22298d = obj;
        this.f22297a = 3;
        this.f22300r = cVar;
        qq.a aVar = qq.a.COROUTINE_SUSPENDED;
        br.l.e(cVar, "frame");
        return aVar;
    }

    @Override // pq.c
    public final void g(Object obj) {
        t1.G(obj);
        this.f22297a = 4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i10 = this.f22297a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.f22299g;
                br.l.b(it);
                if (it.hasNext()) {
                    this.f22297a = 2;
                    return true;
                }
                this.f22299g = null;
            }
            this.f22297a = 5;
            pq.c cVar = this.f22300r;
            br.l.b(cVar);
            this.f22300r = null;
            cVar.g(b0.f15562a);
        }
    }

    @Override // pq.c
    public final pq.h m() {
        return pq.i.f20621a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f22297a;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i10 == 2) {
            this.f22297a = 1;
            Iterator it = this.f22299g;
            br.l.b(it);
            return it.next();
        }
        if (i10 != 3) {
            throw a();
        }
        this.f22297a = 0;
        Object obj = this.f22298d;
        this.f22298d = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
