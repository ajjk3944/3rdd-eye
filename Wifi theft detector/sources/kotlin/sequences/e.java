package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final g f22088a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22089b;

    /* renamed from: c, reason: collision with root package name */
    public final l9.l f22090c;

    public static final class a implements Iterator, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator f22091a;

        /* renamed from: b, reason: collision with root package name */
        public int f22092b = -1;

        /* renamed from: c, reason: collision with root package name */
        public Object f22093c;

        public a() {
            this.f22091a = e.this.f22088a.iterator();
        }

        public final void a() {
            while (this.f22091a.hasNext()) {
                Object next = this.f22091a.next();
                if (((Boolean) e.this.f22090c.invoke(next)).booleanValue() == e.this.f22089b) {
                    this.f22093c = next;
                    this.f22092b = 1;
                    return;
                }
            }
            this.f22092b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f22092b == -1) {
                a();
            }
            return this.f22092b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f22092b == -1) {
                a();
            }
            if (this.f22092b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f22093c;
            this.f22093c = null;
            this.f22092b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(g sequence, boolean z10, l9.l predicate) {
        kotlin.jvm.internal.p.e(sequence, "sequence");
        kotlin.jvm.internal.p.e(predicate, "predicate");
        this.f22088a = sequence;
        this.f22089b = z10;
        this.f22090c = predicate;
    }

    @Override // kotlin.sequences.g
    public Iterator iterator() {
        return new a();
    }
}
