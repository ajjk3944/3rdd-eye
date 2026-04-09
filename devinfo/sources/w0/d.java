package w0;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements ListIterator, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f36395a;

    /* renamed from: b, reason: collision with root package name */
    public int f36396b;

    public d(int i4, List list) {
        this.f36395a = list;
        this.f36396b = i4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f36395a.add(this.f36396b, obj);
        this.f36396b++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f36396b < this.f36395a.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f36396b > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i4 = this.f36396b;
        this.f36396b = i4 + 1;
        return this.f36395a.get(i4);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f36396b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i4 = this.f36396b - 1;
        this.f36396b = i4;
        return this.f36395a.get(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f36396b - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i4 = this.f36396b - 1;
        this.f36396b = i4;
        this.f36395a.remove(i4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f36395a.set(this.f36396b, obj);
    }
}
