package p0;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class d implements ListIterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20228a;

    /* renamed from: d, reason: collision with root package name */
    public int f20229d;

    public d(int i10, List list) {
        this.f20228a = list;
        this.f20229d = i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f20228a.add(this.f20229d, obj);
        this.f20229d++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f20229d < this.f20228a.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f20229d > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i10 = this.f20229d;
        this.f20229d = i10 + 1;
        return this.f20228a.get(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f20229d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i10 = this.f20229d - 1;
        this.f20229d = i10;
        return this.f20228a.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f20229d - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i10 = this.f20229d - 1;
        this.f20229d = i10;
        this.f20228a.remove(i10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f20228a.set(this.f20229d, obj);
    }
}
