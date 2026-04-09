package x9;

import java.util.Iterator;
import q9.InterfaceC5499a;

/* compiled from: Sequences.kt */
/* loaded from: classes3.dex */
public final class m<T, R> implements g<R> {

    /* renamed from: a, reason: collision with root package name */
    public final g<T> f47848a;

    /* renamed from: b, reason: collision with root package name */
    public final p9.l<T, R> f47849b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<R>, InterfaceC5499a {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<T> f47850b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m<T, R> f47851c;

        public a(m<T, R> mVar) {
            this.f47851c = mVar;
            this.f47850b = mVar.f47848a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f47850b.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return (R) this.f47851c.f47849b.invoke(this.f47850b.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(g<? extends T> gVar, p9.l<? super T, ? extends R> transformer) {
        kotlin.jvm.internal.l.f(transformer, "transformer");
        this.f47848a = gVar;
        this.f47849b = transformer;
    }

    @Override // x9.g
    public final Iterator<R> iterator() {
        return new a(this);
    }
}
