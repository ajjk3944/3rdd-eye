package kotlin.sequences;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class b implements g, c {

    /* renamed from: a, reason: collision with root package name */
    public final g f22083a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22084b;

    public static final class a implements Iterator, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator f22085a;

        /* renamed from: b, reason: collision with root package name */
        public int f22086b;

        public a(b bVar) {
            this.f22085a = bVar.f22083a.iterator();
            this.f22086b = bVar.f22084b;
        }

        public final void a() {
            while (this.f22086b > 0 && this.f22085a.hasNext()) {
                this.f22085a.next();
                this.f22086b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f22085a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            return this.f22085a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(g sequence, int i10) {
        kotlin.jvm.internal.p.e(sequence, "sequence");
        this.f22083a = sequence;
        this.f22084b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // kotlin.sequences.c
    public g a(int i10) {
        int i11 = this.f22084b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f22083a, i11);
    }

    @Override // kotlin.sequences.c
    public g b(int i10) {
        int i11 = this.f22084b;
        int i12 = i11 + i10;
        return i12 < 0 ? new p(this, i10) : new o(this.f22083a, i11, i12);
    }

    @Override // kotlin.sequences.g
    public Iterator iterator() {
        return new a(this);
    }
}
