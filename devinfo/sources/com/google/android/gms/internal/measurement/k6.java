package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k6 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f19802a;

    /* renamed from: b, reason: collision with root package name */
    public int f19803b;

    /* renamed from: c, reason: collision with root package name */
    public Map f19804c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19805d;

    /* renamed from: e, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.c1 f19806e;

    /* renamed from: f, reason: collision with root package name */
    public Map f19807f;

    public k6() {
        Map map = Collections.EMPTY_MAP;
        this.f19804c = map;
        this.f19807f = map;
    }

    public final l6 a(int i4) {
        if (i4 < this.f19803b) {
            return (l6) this.f19802a[i4];
        }
        throw new ArrayIndexOutOfBoundsException(i4);
    }

    public final Set b() {
        return this.f19804c.isEmpty() ? Collections.EMPTY_SET : this.f19804c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((l6) this.f19802a[iE]).setValue(obj);
        }
        f();
        if (this.f19802a == null) {
            this.f19802a = new Object[16];
        }
        int i4 = -(iE + 1);
        if (i4 >= 16) {
            return g().put(comparable, obj);
        }
        if (this.f19803b == 16) {
            l6 l6Var = (l6) this.f19802a[15];
            this.f19803b = 15;
            g().put(l6Var.f19814a, l6Var.f19815b);
        }
        Object[] objArr = this.f19802a;
        int length = objArr.length;
        System.arraycopy(objArr, i4, objArr, i4 + 1, 15 - i4);
        this.f19802a[i4] = new l6(this, comparable, obj);
        this.f19803b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.f19803b != 0) {
            this.f19802a = null;
            this.f19803b = 0;
        }
        if (this.f19804c.isEmpty()) {
            return;
        }
        this.f19804c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f19804c.containsKey(comparable);
    }

    public final Object d(int i4) {
        f();
        Object[] objArr = this.f19802a;
        Object obj = ((l6) objArr[i4]).f19815b;
        System.arraycopy(objArr, i4 + 1, objArr, i4, (this.f19803b - i4) - 1);
        this.f19803b--;
        if (!this.f19804c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f19802a;
            int i10 = this.f19803b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i10] = new l6(this, (Comparable) entry.getKey(), entry.getValue());
            this.f19803b++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i4 = this.f19803b;
        int i10 = i4 - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int iCompareTo = comparable.compareTo(((l6) this.f19802a[i10]).f19814a);
            if (iCompareTo > 0) {
                return -(i4 + 1);
            }
            if (iCompareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int iCompareTo2 = comparable.compareTo(((l6) this.f19802a[i12]).f19814a);
            if (iCompareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        return -(i11 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f19806e == null) {
            this.f19806e = new androidx.datastore.preferences.protobuf.c1(3, this);
        }
        return this.f19806e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6)) {
            return super.equals(obj);
        }
        k6 k6Var = (k6) obj;
        int size = size();
        if (size == k6Var.size()) {
            int i4 = this.f19803b;
            if (i4 != k6Var.f19803b) {
                return entrySet().equals(k6Var.entrySet());
            }
            for (int i10 = 0; i10 < i4; i10++) {
                if (a(i10).equals(k6Var.a(i10))) {
                }
            }
            if (i4 != size) {
                return this.f19804c.equals(k6Var.f19804c);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.f19805d) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap g() {
        f();
        if (this.f19804c.isEmpty() && !(this.f19804c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f19804c = treeMap;
            this.f19807f = treeMap.descendingMap();
        }
        return (SortedMap) this.f19804c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((l6) this.f19802a[iE]).f19815b : this.f19804c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i4 = this.f19803b;
        int iHashCode = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            iHashCode += this.f19802a[i10].hashCode();
        }
        return this.f19804c.size() > 0 ? this.f19804c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return d(iE);
        }
        if (this.f19804c.isEmpty()) {
            return null;
        }
        return this.f19804c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f19804c.size() + this.f19803b;
    }
}
