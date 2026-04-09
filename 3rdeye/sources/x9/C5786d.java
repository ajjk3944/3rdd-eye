package x9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import q9.InterfaceC5499a;

/* compiled from: Sequences.kt */
/* renamed from: x9.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5786d<T> implements g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final g<T> f47823a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47824b;

    /* renamed from: c, reason: collision with root package name */
    public final p9.l<T, Boolean> f47825c;

    /* compiled from: Sequences.kt */
    /* renamed from: x9.d$a */
    public static final class a implements Iterator<T>, InterfaceC5499a {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<T> f47826b;

        /* renamed from: c, reason: collision with root package name */
        public int f47827c = -1;

        /* renamed from: d, reason: collision with root package name */
        public T f47828d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C5786d<T> f47829e;

        public a(C5786d<T> c5786d) {
            this.f47829e = c5786d;
            this.f47826b = c5786d.f47823a.iterator();
        }

        public final void a() {
            T next;
            C5786d<T> c5786d;
            do {
                Iterator<T> it = this.f47826b;
                if (!it.hasNext()) {
                    this.f47827c = 0;
                    return;
                } else {
                    next = it.next();
                    c5786d = this.f47829e;
                }
            } while (c5786d.f47825c.invoke(next).booleanValue() != c5786d.f47824b);
            this.f47828d = next;
            this.f47827c = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f47827c == -1) {
                a();
            }
            return this.f47827c == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f47827c == -1) {
                a();
            }
            if (this.f47827c == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f47828d;
            this.f47828d = null;
            this.f47827c = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5786d(g<? extends T> gVar, boolean z10, p9.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.l.f(predicate, "predicate");
        this.f47823a = gVar;
        this.f47824b = z10;
        this.f47825c = predicate;
    }

    @Override // x9.g
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
