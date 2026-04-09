package Zg;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
class b0 extends AbstractC3672d {

    /* renamed from: b, reason: collision with root package name */
    private final List f25349b;

    public static final class a implements ListIterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final ListIterator f25350a;

        a(int i10) {
            this.f25350a = b0.this.f25349b.listIterator(D.W(b0.this, i10));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f25350a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f25350a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f25350a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return D.V(b0.this, this.f25350a.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f25350a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return D.V(b0.this, this.f25350a.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b0(List delegate) {
        AbstractC6492s.i(delegate, "delegate");
        this.f25349b = delegate;
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public Object get(int i10) {
        return this.f25349b.get(D.U(this, i10));
    }

    @Override // Zg.AbstractC3672d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // Zg.AbstractC3670b
    public int j() {
        return this.f25349b.size();
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }
}
