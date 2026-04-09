package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.sB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1841sB extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16689a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16690b;

    public /* synthetic */ C1841sB(int i, Serializable serializable) {
        this.f16689a = i;
        this.f16690b = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f16689a) {
            case 0:
                ((C0978cC) this.f16690b).e();
                break;
            case 1:
                ((AB) this.f16690b).clear();
                break;
            default:
                ((C1356jB) this.f16690b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f16689a) {
            case 0:
                return ((C0978cC) this.f16690b).c(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((C1356jB) this.f16690b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f16689a) {
            case 2:
                return ((C1356jB) this.f16690b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f16689a) {
            case 0:
                C0978cC c0978cC = (C0978cC) this.f16690b;
                c0978cC.getClass();
                return new C1196gB(c0978cC);
            case 1:
                AB ab = (AB) this.f16690b;
                Map mapE = ab.e();
                return mapE != null ? mapE.values().iterator() : new C2111xB(ab, 2);
            default:
                return new C0924bC(((C1356jB) this.f16690b).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f16689a) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C1356jB c1356jB = (C1356jB) this.f16690b;
                    for (Map.Entry entry : c1356jB.entrySet()) {
                        if (Objects.equals(obj, entry.getValue())) {
                            c1356jB.remove(entry.getKey());
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
        switch (this.f16689a) {
            case 2:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C1356jB c1356jB = (C1356jB) this.f16690b;
                    for (Map.Entry entry : c1356jB.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c1356jB.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f16689a) {
            case 2:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C1356jB c1356jB = (C1356jB) this.f16690b;
                    for (Map.Entry entry : c1356jB.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c1356jB.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f16689a) {
            case 0:
                return ((C0978cC) this.f16690b).f13541e;
            case 1:
                return ((AB) this.f16690b).size();
            default:
                return ((C1356jB) this.f16690b).f14914c.size();
        }
    }

    public C1841sB(C1356jB c1356jB) {
        this.f16689a = 2;
        this.f16690b = c1356jB;
    }
}
