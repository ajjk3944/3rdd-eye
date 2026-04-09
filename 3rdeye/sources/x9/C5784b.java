package x9;

import java.util.Iterator;
import q9.InterfaceC5499a;

/* compiled from: Sequences.kt */
/* renamed from: x9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5784b<T> implements g<T>, InterfaceC5785c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final g<T> f47819a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47820b;

    /* compiled from: Sequences.kt */
    /* renamed from: x9.b$a */
    public static final class a implements Iterator<T>, InterfaceC5499a {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<T> f47821b;

        /* renamed from: c, reason: collision with root package name */
        public int f47822c;

        public a(C5784b<T> c5784b) {
            this.f47821b = c5784b.f47819a.iterator();
            this.f47822c = c5784b.f47820b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator<T> it;
            while (true) {
                int i = this.f47822c;
                it = this.f47821b;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f47822c--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            Iterator<T> it;
            while (true) {
                int i = this.f47822c;
                it = this.f47821b;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f47822c--;
            }
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5784b(g<? extends T> gVar, int i) {
        this.f47819a = gVar;
        this.f47820b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // x9.InterfaceC5785c
    public final g<T> a(int i) {
        int i10 = this.f47820b + i;
        return i10 < 0 ? new C5784b(this, i) : new C5784b(this.f47819a, i10);
    }

    @Override // x9.g
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
