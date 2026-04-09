package p0;

import br.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class c implements List, cr.b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20225a;

    /* renamed from: d, reason: collision with root package name */
    public final int f20226d;

    /* renamed from: g, reason: collision with root package name */
    public int f20227g;

    public c(int i10, int i11, List list) {
        this.f20225a = list;
        this.f20226d = i10;
        this.f20227g = i11;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i10 = this.f20227g;
        this.f20227g = i10 + 1;
        this.f20225a.add(i10, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        this.f20225a.addAll(i10 + this.f20226d, collection);
        int size = collection.size();
        this.f20227g += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i10 = this.f20227g - 1;
        int i11 = this.f20226d;
        if (i11 <= i10) {
            while (true) {
                this.f20225a.remove(i10);
                if (i10 == i11) {
                    break;
                } else {
                    i10--;
                }
            }
        }
        this.f20227g = i11;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i10 = this.f20227g;
        for (int i11 = this.f20226d; i11 < i10; i11++) {
            if (l.a(this.f20225a.get(i11), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i10) {
        f.a(i10, this);
        return this.f20225a.get(i10 + this.f20226d);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i10 = this.f20227g;
        int i11 = this.f20226d;
        for (int i12 = i11; i12 < i10; i12++) {
            if (l.a(this.f20225a.get(i12), obj)) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f20227g == this.f20226d;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i10 = this.f20227g - 1;
        int i11 = this.f20226d;
        if (i11 > i10) {
            return -1;
        }
        while (!l.a(this.f20225a.get(i10), obj)) {
            if (i10 == i11) {
                return -1;
            }
            i10--;
        }
        return i10 - i11;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10 = this.f20227g;
        for (int i11 = this.f20226d; i11 < i10; i11++) {
            ?? r22 = this.f20225a;
            if (l.a(r22.get(i11), obj)) {
                r22.remove(i11);
                this.f20227g--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10 = this.f20227g;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i10 != this.f20227g;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10 = this.f20227g;
        int i11 = i10 - 1;
        int i12 = this.f20226d;
        if (i12 <= i11) {
            while (true) {
                ?? r32 = this.f20225a;
                if (!collection.contains(r32.get(i11))) {
                    r32.remove(i11);
                    this.f20227g--;
                }
                if (i11 == i12) {
                    break;
                }
                i11--;
            }
        }
        return i10 != this.f20227g;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        f.a(i10, this);
        return this.f20225a.set(i10 + this.f20226d, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f20227g - this.f20226d;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        f.b(i10, i11, this);
        return new c(i10, i11, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return l.m(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f20225a.add(i10 + this.f20226d, obj);
        this.f20227g++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new d(i10, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return l.n(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f20225a.addAll(this.f20227g, collection);
        int size = collection.size();
        this.f20227g += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i10) {
        f.a(i10, this);
        this.f20227g--;
        return this.f20225a.remove(i10 + this.f20226d);
    }
}
