package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class k0 extends AbstractList implements B, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final B f38546a;

    class a implements ListIterator {

        /* renamed from: a, reason: collision with root package name */
        ListIterator f38547a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f38548b;

        a(int i10) {
            this.f38548b = i10;
            this.f38547a = k0.this.f38546a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f38547a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f38547a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f38547a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f38547a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f38547a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f38547a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        Iterator f38550a;

        b() {
            this.f38550a = k0.this.f38546a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f38550a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38550a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public k0(B b10) {
        this.f38546a = b10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.B
    public Object B(int i10) {
        return this.f38546a.B(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.B
    public void E0(AbstractC5081h abstractC5081h) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.B
    public List d() {
        return this.f38546a.d();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f38546a.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.B
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
        return this.f38546a.size();
    }
}
