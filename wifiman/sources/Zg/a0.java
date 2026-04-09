package Zg;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
final class a0 extends AbstractC3676h {

    /* renamed from: a, reason: collision with root package name */
    private final List f25346a;

    public static final class a implements ListIterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final ListIterator f25347a;

        a(int i10) {
            this.f25347a = a0.this.f25346a.listIterator(D.W(a0.this, i10));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f25347a.add(obj);
            this.f25347a.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f25347a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f25347a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f25347a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return D.V(a0.this, this.f25347a.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f25347a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return D.V(a0.this, this.f25347a.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f25347a.remove();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f25347a.set(obj);
        }
    }

    public a0(List delegate) {
        AbstractC6492s.i(delegate, "delegate");
        this.f25346a = delegate;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        this.f25346a.add(D.W(this, i10), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f25346a.clear();
    }

    @Override // Zg.AbstractC3676h
    public int g() {
        return this.f25346a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        return this.f25346a.get(D.U(this, i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // Zg.AbstractC3676h
    public Object j(int i10) {
        return this.f25346a.remove(D.U(this, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        return this.f25346a.set(D.U(this, i10), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }
}
