package x9;

import L0.O;
import b9.C1992A;
import b9.n;
import f9.C4351i;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import q9.InterfaceC5499a;

/* compiled from: SequenceBuilder.kt */
/* loaded from: classes3.dex */
public final class h<T> extends i<T> implements Iterator<T>, InterfaceC4347e<C1992A>, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public int f47842b;

    /* renamed from: c, reason: collision with root package name */
    public T f47843c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator<? extends T> f47844d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC4347e<? super C1992A> f47845e;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x9.i
    public final g9.a a(Object obj, h9.h hVar) {
        this.f47843c = obj;
        this.f47842b = 3;
        this.f47845e = hVar;
        return g9.a.COROUTINE_SUSPENDED;
    }

    @Override // x9.i
    public final Object c(Iterator it, O o10) {
        if (!it.hasNext()) {
            return C1992A.f18074a;
        }
        this.f47844d = it;
        this.f47842b = 2;
        this.f47845e = o10;
        return g9.a.COROUTINE_SUSPENDED;
    }

    public final RuntimeException d() {
        int i = this.f47842b;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f47842b);
    }

    @Override // f9.InterfaceC4347e
    public final InterfaceC4350h getContext() {
        return C4351i.f37871b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f47842b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw d();
                }
                Iterator<? extends T> it = this.f47844d;
                kotlin.jvm.internal.l.c(it);
                if (it.hasNext()) {
                    this.f47842b = 2;
                    return true;
                }
                this.f47844d = null;
            }
            this.f47842b = 5;
            InterfaceC4347e<? super C1992A> interfaceC4347e = this.f47845e;
            kotlin.jvm.internal.l.c(interfaceC4347e);
            this.f47845e = null;
            interfaceC4347e.resumeWith(C1992A.f18074a);
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.f47842b;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f47842b = 1;
            Iterator<? extends T> it = this.f47844d;
            kotlin.jvm.internal.l.c(it);
            return it.next();
        }
        if (i != 3) {
            throw d();
        }
        this.f47842b = 0;
        T t10 = this.f47843c;
        this.f47843c = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // f9.InterfaceC4347e
    public final void resumeWith(Object obj) {
        n.b(obj);
        this.f47842b = 4;
    }
}
