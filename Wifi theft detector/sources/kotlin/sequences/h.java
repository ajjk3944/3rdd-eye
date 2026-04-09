package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import y8.s;

/* loaded from: classes4.dex */
public final class h extends i implements Iterator, c9.c, m9.a {

    /* renamed from: a, reason: collision with root package name */
    public int f22100a;

    /* renamed from: b, reason: collision with root package name */
    public Object f22101b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f22102c;

    /* renamed from: d, reason: collision with root package name */
    public c9.c f22103d;

    @Override // kotlin.sequences.i
    public Object a(Object obj, c9.c cVar) {
        this.f22101b = obj;
        this.f22100a = 3;
        this.f22103d = cVar;
        Object objF = kotlin.coroutines.intrinsics.a.f();
        if (objF == kotlin.coroutines.intrinsics.a.f()) {
            d9.e.c(cVar);
        }
        return objF == kotlin.coroutines.intrinsics.a.f() ? objF : s.f25199a;
    }

    @Override // kotlin.sequences.i
    public Object c(Iterator it, c9.c cVar) {
        if (!it.hasNext()) {
            return s.f25199a;
        }
        this.f22102c = it;
        this.f22100a = 2;
        this.f22103d = cVar;
        Object objF = kotlin.coroutines.intrinsics.a.f();
        if (objF == kotlin.coroutines.intrinsics.a.f()) {
            d9.e.c(cVar);
        }
        return objF == kotlin.coroutines.intrinsics.a.f() ? objF : s.f25199a;
    }

    public final Throwable g() {
        int i10 = this.f22100a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f22100a);
    }

    @Override // c9.c
    public kotlin.coroutines.d getContext() {
        return EmptyCoroutineContext.f21979a;
    }

    public final Object h() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f22100a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw g();
                }
                Iterator it = this.f22102c;
                kotlin.jvm.internal.p.b(it);
                if (it.hasNext()) {
                    this.f22100a = 2;
                    return true;
                }
                this.f22102c = null;
            }
            this.f22100a = 5;
            c9.c cVar = this.f22103d;
            kotlin.jvm.internal.p.b(cVar);
            this.f22103d = null;
            Result.Companion aVar = Result.INSTANCE;
            cVar.resumeWith(Result.b(s.f25199a));
        }
    }

    public final void j(c9.c cVar) {
        this.f22103d = cVar;
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i10 = this.f22100a;
        if (i10 == 0 || i10 == 1) {
            return h();
        }
        if (i10 == 2) {
            this.f22100a = 1;
            Iterator it = this.f22102c;
            kotlin.jvm.internal.p.b(it);
            return it.next();
        }
        if (i10 != 3) {
            throw g();
        }
        this.f22100a = 0;
        Object obj = this.f22101b;
        this.f22101b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // c9.c
    public void resumeWith(Object obj) {
        kotlin.c.b(obj);
        this.f22100a = 4;
    }
}
