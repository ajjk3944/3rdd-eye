package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList.java */
/* loaded from: classes.dex */
public final class n0 extends AbstractList<String> implements E, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final D f15670b;

    /* compiled from: UnmodifiableLazyStringList.java */
    public class a implements ListIterator<String> {

        /* renamed from: b, reason: collision with root package name */
        public ListIterator<String> f15671b;

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f15671b.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f15671b.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.f15671b.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f15671b.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f15671b.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f15671b.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList.java */
    public class b implements Iterator<String> {

        /* renamed from: b, reason: collision with root package name */
        public Iterator<String> f15672b;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f15672b.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.f15672b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public n0(D d10) {
        this.f15670b = d10;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public final void a(AbstractC1730h abstractC1730h) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f15670b.get(i);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public final Object getRaw(int i) {
        return this.f15670b.f15541c.get(i);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public final List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f15670b.f15541c);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        b bVar = new b();
        bVar.f15672b = this.f15670b.iterator();
        return bVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        a aVar = new a();
        aVar.f15671b = this.f15670b.listIterator(i);
        return aVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15670b.size();
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public final E getUnmodifiableView() {
        return this;
    }
}
