package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import u.C2934c;
import u.C2936e;

/* loaded from: classes.dex */
public final class PL extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f10354b;

    public /* synthetic */ PL(int i, Map map) {
        this.f10353a = i;
        this.f10354b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        switch (this.f10353a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((LL) this.f10354b).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f10353a) {
            case 0:
                ((LL) this.f10354b).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f10353a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((LL) this.f10354b).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value) {
                    return obj2 != null && obj2.equals(value);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f10353a) {
            case 0:
                return new NL((LL) this.f10354b);
            default:
                return new C2934c((C2936e) this.f10354b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f10353a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((LL) this.f10354b).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f10353a) {
            case 0:
                return ((LL) this.f10354b).size();
            default:
                return ((C2936e) this.f10354b).f23705c;
        }
    }
}
