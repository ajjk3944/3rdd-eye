package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class p implements g, c {

    /* renamed from: a, reason: collision with root package name */
    public final g f22113a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22114b;

    public static final class a implements Iterator, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public int f22115a;

        /* renamed from: b, reason: collision with root package name */
        public final Iterator f22116b;

        public a(p pVar) {
            this.f22115a = pVar.f22114b;
            this.f22116b = pVar.f22113a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22115a > 0 && this.f22116b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f22115a;
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            this.f22115a = i10 - 1;
            return this.f22116b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public p(g sequence, int i10) {
        kotlin.jvm.internal.p.e(sequence, "sequence");
        this.f22113a = sequence;
        this.f22114b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // kotlin.sequences.c
    public g a(int i10) {
        int i11 = this.f22114b;
        return i10 >= i11 ? m.f() : new o(this.f22113a, i10, i11);
    }

    @Override // kotlin.sequences.c
    public g b(int i10) {
        return i10 >= this.f22114b ? this : new p(this.f22113a, i10);
    }

    @Override // kotlin.sequences.g
    public Iterator iterator() {
        return new a(this);
    }
}
