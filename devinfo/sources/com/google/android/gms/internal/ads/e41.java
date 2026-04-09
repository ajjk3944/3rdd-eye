package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e41 extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10699a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10700b;

    public /* synthetic */ e41(int i4, Serializable serializable) {
        this.f10699a = i4;
        this.f10700b = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f10699a) {
            case 0:
                ((p51) this.f10700b).e();
                break;
            case 1:
                ((m41) this.f10700b).clear();
                break;
            default:
                ((v31) this.f10700b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f10699a) {
            case 0:
                return ((p51) this.f10700b).c(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((v31) this.f10700b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f10699a) {
            case 2:
                return ((v31) this.f10700b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f10699a) {
            case 0:
                p51 p51Var = (p51) this.f10700b;
                p51Var.getClass();
                return new s31(p51Var);
            case 1:
                m41 m41Var = (m41) this.f10700b;
                Map mapE = m41Var.e();
                return mapE != null ? mapE.values().iterator() : new j41(m41Var, 2);
            default:
                return new o51(((v31) this.f10700b).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f10699a) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    v31 v31Var = (v31) this.f10700b;
                    for (Map.Entry entry : v31Var.entrySet()) {
                        if (Objects.equals(obj, entry.getValue())) {
                            v31Var.remove(entry.getKey());
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
        switch (this.f10699a) {
            case 2:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    v31 v31Var = (v31) this.f10700b;
                    for (Map.Entry entry : v31Var.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return v31Var.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f10699a) {
            case 2:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    v31 v31Var = (v31) this.f10700b;
                    for (Map.Entry entry : v31Var.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return v31Var.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f10699a) {
            case 0:
                return ((p51) this.f10700b).f14902e;
            case 1:
                return ((m41) this.f10700b).size();
            default:
                return ((v31) this.f10700b).f17452c.size();
        }
    }

    public e41(v31 v31Var) {
        this.f10699a = 2;
        this.f10700b = v31Var;
    }
}
