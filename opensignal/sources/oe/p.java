package oe;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class p extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19363a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19364d;

    public /* synthetic */ p(int i10, Serializable serializable) {
        this.f19363a = i10;
        this.f19364d = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f19363a) {
            case 0:
                ((q0) this.f19364d).c();
                break;
            case 1:
                ((w) this.f19364d).clear();
                break;
            default:
                ((f) this.f19364d).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f19363a) {
            case 0:
                return ((q0) this.f19364d).b(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((f) this.f19364d).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f19363a) {
            case 2:
                return ((f) this.f19364d).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f19363a) {
            case 0:
                return new c((q0) this.f19364d);
            case 1:
                w wVar = (w) this.f19364d;
                Map mapC = wVar.c();
                return mapC != null ? mapC.values().iterator() : new t(wVar, 2);
            default:
                return new o0(((f) this.f19364d).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f19363a) {
            case 2:
                f fVar = (f) this.f19364d;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : fVar.entrySet()) {
                        if (a.a.k(obj, entry.getValue())) {
                            fVar.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f19363a) {
            case 2:
                f fVar = (f) this.f19364d;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : fVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return fVar.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f19363a) {
            case 2:
                f fVar = (f) this.f19364d;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : fVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return fVar.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f19363a) {
            case 0:
                return ((q0) this.f19364d).f19370x;
            case 1:
                return ((w) this.f19364d).size();
            default:
                return ((f) this.f19364d).f19325g.size();
        }
    }

    public p(f fVar) {
        this.f19363a = 2;
        this.f19364d = fVar;
    }
}
