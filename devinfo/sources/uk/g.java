package uk;

import java.util.Iterator;
import java.util.NoSuchElementException;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends h implements Iterator, ck.c, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public int f35523a;

    /* renamed from: b, reason: collision with root package name */
    public Object f35524b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f35525c;

    /* renamed from: d, reason: collision with root package name */
    public ck.c f35526d;

    @Override // uk.h
    public final void a(ck.c cVar, Object obj) {
        this.f35524b = obj;
        this.f35523a = 3;
        this.f35526d = cVar;
        nk.k.e(cVar, "frame");
    }

    public final RuntimeException b() {
        int i4 = this.f35523a;
        if (i4 == 4) {
            return new NoSuchElementException();
        }
        if (i4 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f35523a);
    }

    @Override // ck.c
    public final ck.h getContext() {
        return ck.i.f2898a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i4 = this.f35523a;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2 || i4 == 3) {
                        return true;
                    }
                    if (i4 == 4) {
                        return false;
                    }
                    throw b();
                }
                Iterator it = this.f35525c;
                nk.k.b(it);
                if (it.hasNext()) {
                    this.f35523a = 2;
                    return true;
                }
                this.f35525c = null;
            }
            this.f35523a = 5;
            ck.c cVar = this.f35526d;
            nk.k.b(cVar);
            this.f35526d = null;
            cVar.resumeWith(u.f37649a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i4 = this.f35523a;
        if (i4 == 0 || i4 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i4 == 2) {
            this.f35523a = 1;
            Iterator it = this.f35525c;
            nk.k.b(it);
            return it.next();
        }
        if (i4 != 3) {
            throw b();
        }
        this.f35523a = 0;
        Object obj = this.f35524b;
        this.f35524b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // ck.c
    public final void resumeWith(Object obj) {
        ci.b.D(obj);
        this.f35523a = 4;
    }
}
