package e5;

import d5.AbstractC2278f;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: e5.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2313i extends AbstractC2278f implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final C2313i f19975b;

    /* renamed from: a, reason: collision with root package name */
    public final C2310f f19976a;

    static {
        C2310f c2310f = C2310f.f19959n;
        f19975b = new C2313i(C2310f.f19959n);
    }

    public C2313i(C2310f c2310f) {
        q5.i.e(c2310f, "backing");
        this.f19976a = c2310f;
    }

    @Override // d5.AbstractC2278f
    public final int a() {
        return this.f19976a.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f19976a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        q5.i.e(collection, "elements");
        this.f19976a.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f19976a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f19976a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f19976a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C2310f c2310f = this.f19976a;
        c2310f.getClass();
        return new C2308d(c2310f, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C2310f c2310f = this.f19976a;
        c2310f.c();
        int iH = c2310f.h(obj);
        if (iH < 0) {
            return false;
        }
        c2310f.l(iH);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        q5.i.e(collection, "elements");
        this.f19976a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        q5.i.e(collection, "elements");
        this.f19976a.c();
        return super.retainAll(collection);
    }

    public C2313i() {
        this(new C2310f());
    }
}
