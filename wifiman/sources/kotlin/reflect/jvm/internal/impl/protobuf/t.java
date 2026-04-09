package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public class t extends AbstractList implements RandomAccess, l {

    /* renamed from: a, reason: collision with root package name */
    private final l f52034a;

    class a implements ListIterator {

        /* renamed from: a, reason: collision with root package name */
        ListIterator f52035a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f52036b;

        a(int i10) {
            this.f52036b = i10;
            this.f52035a = t.this.f52034a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f52035a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f52035a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f52035a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f52035a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f52035a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f52035a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        Iterator f52038a;

        b() {
            this.f52038a = t.this.f52034a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f52038a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52038a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public t(l lVar) {
        this.f52034a = lVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public d C0(int i10) {
        return this.f52034a.C0(i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public void P0(d dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public List d() {
        return this.f52034a.d();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f52034a.get(i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public l h() {
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
        return this.f52034a.size();
    }
}
