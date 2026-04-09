package w0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import nk.j;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements List, ok.c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f36392a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36393b;

    /* renamed from: c, reason: collision with root package name */
    public int f36394c;

    public c(int i4, int i10, List list) {
        this.f36392a = list;
        this.f36393b = i4;
        this.f36394c = i10;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i4 = this.f36394c;
        this.f36394c = i4 + 1;
        this.f36392a.add(i4, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        this.f36392a.addAll(i4 + this.f36393b, collection);
        int size = collection.size();
        this.f36394c += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i4 = this.f36394c - 1;
        int i10 = this.f36393b;
        if (i10 <= i4) {
            while (true) {
                this.f36392a.remove(i4);
                if (i4 == i10) {
                    break;
                } else {
                    i4--;
                }
            }
        }
        this.f36394c = i10;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i4 = this.f36394c;
        for (int i10 = this.f36393b; i10 < i4; i10++) {
            if (k.a(this.f36392a.get(i10), obj)) {
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
    public final Object get(int i4) {
        f.a(i4, this);
        return this.f36392a.get(i4 + this.f36393b);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i4 = this.f36394c;
        int i10 = this.f36393b;
        for (int i11 = i10; i11 < i4; i11++) {
            if (k.a(this.f36392a.get(i11), obj)) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f36394c == this.f36393b;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i4 = this.f36394c - 1;
        int i10 = this.f36393b;
        if (i10 > i4) {
            return -1;
        }
        while (!k.a(this.f36392a.get(i4), obj)) {
            if (i4 == i10) {
                return -1;
            }
            i4--;
        }
        return i4 - i10;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i4 = this.f36394c;
        for (int i10 = this.f36393b; i10 < i4; i10++) {
            ?? r22 = this.f36392a;
            if (k.a(r22.get(i10), obj)) {
                r22.remove(i10);
                this.f36394c--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i4 = this.f36394c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i4 != this.f36394c;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i4 = this.f36394c;
        int i10 = i4 - 1;
        int i11 = this.f36393b;
        if (i11 <= i10) {
            while (true) {
                ?? r32 = this.f36392a;
                if (!collection.contains(r32.get(i10))) {
                    r32.remove(i10);
                    this.f36394c--;
                }
                if (i10 == i11) {
                    break;
                }
                i10--;
            }
        }
        return i4 != this.f36394c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        f.a(i4, this);
        return this.f36392a.set(i4 + this.f36393b, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f36394c - this.f36393b;
    }

    @Override // java.util.List
    public final List subList(int i4, int i10) {
        f.b(i4, i10, this);
        return new c(i4, i10, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return j.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i4, Object obj) {
        this.f36392a.add(i4 + this.f36393b, obj);
        this.f36394c++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i4) {
        return new d(i4, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j.b(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f36392a.addAll(this.f36394c, collection);
        int size = collection.size();
        this.f36394c += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i4) {
        f.a(i4, this);
        this.f36394c--;
        return this.f36392a.remove(i4 + this.f36393b);
    }
}
