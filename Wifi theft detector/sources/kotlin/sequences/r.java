package kotlin.sequences;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class r implements g {

    /* renamed from: a, reason: collision with root package name */
    public final g f22123a;

    /* renamed from: b, reason: collision with root package name */
    public final l9.l f22124b;

    public static final class a implements Iterator, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator f22125a;

        public a() {
            this.f22125a = r.this.f22123a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22125a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return r.this.f22124b.invoke(this.f22125a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public r(g sequence, l9.l transformer) {
        kotlin.jvm.internal.p.e(sequence, "sequence");
        kotlin.jvm.internal.p.e(transformer, "transformer");
        this.f22123a = sequence;
        this.f22124b = transformer;
    }

    @Override // kotlin.sequences.g
    public Iterator iterator() {
        return new a();
    }
}
