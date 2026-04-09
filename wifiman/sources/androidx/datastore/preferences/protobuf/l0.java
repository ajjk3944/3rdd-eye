package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class l0 extends AbstractList implements B, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final B f30904a;

    class a implements ListIterator {

        /* renamed from: a, reason: collision with root package name */
        ListIterator f30905a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f30906b;

        a(int i10) {
            this.f30906b = i10;
            this.f30905a = l0.this.f30904a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f30905a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f30905a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f30905a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f30905a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f30905a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f30905a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        Iterator f30908a;

        b() {
            this.f30908a = l0.this.f30904a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f30908a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30908a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public l0(B b10) {
        this.f30904a = b10;
    }

    @Override // androidx.datastore.preferences.protobuf.B
    public Object B(int i10) {
        return this.f30904a.B(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.B
    public List d() {
        return this.f30904a.d();
    }

    @Override // androidx.datastore.preferences.protobuf.B
    public void d0(AbstractC3971g abstractC3971g) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f30904a.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.B
    public B h() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f30904a.size();
    }
}
