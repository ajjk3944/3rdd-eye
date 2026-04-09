package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class o implements g, c {

    /* renamed from: a, reason: collision with root package name */
    public final g f22107a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22108b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22109c;

    public static final class a implements Iterator, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator f22110a;

        /* renamed from: b, reason: collision with root package name */
        public int f22111b;

        public a() {
            this.f22110a = o.this.f22107a.iterator();
        }

        private final void a() {
            while (this.f22111b < o.this.f22108b && this.f22110a.hasNext()) {
                this.f22110a.next();
                this.f22111b++;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f22111b < o.this.f22109c && this.f22110a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (this.f22111b >= o.this.f22109c) {
                throw new NoSuchElementException();
            }
            this.f22111b++;
            return this.f22110a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public o(g sequence, int i10, int i11) {
        kotlin.jvm.internal.p.e(sequence, "sequence");
        this.f22107a = sequence;
        this.f22108b = i10;
        this.f22109c = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i11).toString());
        }
        if (i11 >= i10) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i11 + " < " + i10).toString());
    }

    @Override // kotlin.sequences.c
    public g a(int i10) {
        return i10 >= f() ? m.f() : new o(this.f22107a, this.f22108b + i10, this.f22109c);
    }

    @Override // kotlin.sequences.c
    public g b(int i10) {
        if (i10 >= f()) {
            return this;
        }
        g gVar = this.f22107a;
        int i11 = this.f22108b;
        return new o(gVar, i11, i10 + i11);
    }

    public final int f() {
        return this.f22109c - this.f22108b;
    }

    @Override // kotlin.sequences.g
    public Iterator iterator() {
        return new a();
    }
}
