package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class q implements g {

    /* renamed from: a, reason: collision with root package name */
    public final g f22117a;

    /* renamed from: b, reason: collision with root package name */
    public final l9.l f22118b;

    public static final class a implements Iterator, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator f22119a;

        /* renamed from: b, reason: collision with root package name */
        public int f22120b = -1;

        /* renamed from: c, reason: collision with root package name */
        public Object f22121c;

        public a() {
            this.f22119a = q.this.f22117a.iterator();
        }

        private final void a() {
            if (this.f22119a.hasNext()) {
                Object next = this.f22119a.next();
                if (((Boolean) q.this.f22118b.invoke(next)).booleanValue()) {
                    this.f22120b = 1;
                    this.f22121c = next;
                    return;
                }
            }
            this.f22120b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f22120b == -1) {
                a();
            }
            return this.f22120b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f22120b == -1) {
                a();
            }
            if (this.f22120b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f22121c;
            this.f22121c = null;
            this.f22120b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q(g sequence, l9.l predicate) {
        kotlin.jvm.internal.p.e(sequence, "sequence");
        kotlin.jvm.internal.p.e(predicate, "predicate");
        this.f22117a = sequence;
        this.f22118b = predicate;
    }

    @Override // kotlin.sequences.g
    public Iterator iterator() {
        return new a();
    }
}
