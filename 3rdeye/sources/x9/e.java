package x9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import q9.InterfaceC5499a;

/* compiled from: Sequences.kt */
/* loaded from: classes3.dex */
public final class e<T, R, E> implements g<E> {

    /* renamed from: a, reason: collision with root package name */
    public final g<T> f47830a;

    /* renamed from: b, reason: collision with root package name */
    public final p9.l<T, R> f47831b;

    /* renamed from: c, reason: collision with root package name */
    public final p9.l<R, Iterator<E>> f47832c;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<E>, InterfaceC5499a {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<T> f47833b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator<? extends E> f47834c;

        /* renamed from: d, reason: collision with root package name */
        public int f47835d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e<T, R, E> f47836e;

        public a(e<T, R, E> eVar) {
            this.f47836e = eVar;
            this.f47833b = eVar.f47830a.iterator();
        }

        public final boolean a() {
            Iterator<? extends E> it;
            Iterator<? extends E> it2 = this.f47834c;
            if (it2 != null && it2.hasNext()) {
                this.f47835d = 1;
                return true;
            }
            do {
                Iterator<T> it3 = this.f47833b;
                if (!it3.hasNext()) {
                    this.f47835d = 2;
                    this.f47834c = null;
                    return false;
                }
                T next = it3.next();
                e<T, R, E> eVar = this.f47836e;
                it = (Iterator) eVar.f47832c.invoke(eVar.f47831b.invoke(next));
            } while (!it.hasNext());
            this.f47834c = it;
            this.f47835d = 1;
            return true;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.f47835d;
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            return a();
        }

        @Override // java.util.Iterator
        public final E next() {
            int i = this.f47835d;
            if (i == 2) {
                throw new NoSuchElementException();
            }
            if (i == 0 && !a()) {
                throw new NoSuchElementException();
            }
            this.f47835d = 0;
            Iterator<? extends E> it = this.f47834c;
            kotlin.jvm.internal.l.c(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(g<? extends T> gVar, p9.l<? super T, ? extends R> transformer, p9.l<? super R, ? extends Iterator<? extends E>> iterator) {
        kotlin.jvm.internal.l.f(transformer, "transformer");
        kotlin.jvm.internal.l.f(iterator, "iterator");
        this.f47830a = gVar;
        this.f47831b = transformer;
        this.f47832c = iterator;
    }

    @Override // x9.g
    public final Iterator<E> iterator() {
        return new a(this);
    }
}
