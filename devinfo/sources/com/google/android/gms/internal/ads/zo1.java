package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zo1 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f19136a;

    /* renamed from: b, reason: collision with root package name */
    public int f19137b;

    /* renamed from: c, reason: collision with root package name */
    public Map f19138c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19139d;

    /* renamed from: e, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.c1 f19140e;

    /* renamed from: f, reason: collision with root package name */
    public Map f19141f;

    public zo1() {
        Map map = Collections.EMPTY_MAP;
        this.f19138c = map;
        this.f19141f = map;
    }

    public final ap1 a(int i4) {
        if (i4 < this.f19137b) {
            return (ap1) this.f19136a[i4];
        }
        throw new ArrayIndexOutOfBoundsException(i4);
    }

    public final Set b() {
        return this.f19138c.isEmpty() ? Collections.EMPTY_SET : this.f19138c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((ap1) this.f19136a[iE]).setValue(obj);
        }
        f();
        if (this.f19136a == null) {
            this.f19136a = new Object[16];
        }
        int i4 = -(iE + 1);
        if (i4 >= 16) {
            return g().put(comparable, obj);
        }
        if (this.f19137b == 16) {
            ap1 ap1Var = (ap1) this.f19136a[15];
            this.f19137b = 15;
            g().put(ap1Var.f9383a, ap1Var.f9384b);
        }
        Object[] objArr = this.f19136a;
        int length = objArr.length;
        System.arraycopy(objArr, i4, objArr, i4 + 1, 15 - i4);
        this.f19136a[i4] = new ap1(this, comparable, obj);
        this.f19137b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.f19137b != 0) {
            this.f19136a = null;
            this.f19137b = 0;
        }
        if (this.f19138c.isEmpty()) {
            return;
        }
        this.f19138c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f19138c.containsKey(comparable);
    }

    public final Object d(int i4) {
        f();
        Object[] objArr = this.f19136a;
        Object obj = ((ap1) objArr[i4]).f9384b;
        System.arraycopy(objArr, i4 + 1, objArr, i4, (this.f19137b - i4) - 1);
        this.f19137b--;
        if (!this.f19138c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f19136a;
            int i10 = this.f19137b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i10] = new ap1(this, (Comparable) entry.getKey(), entry.getValue());
            this.f19137b++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i4 = this.f19137b;
        int i10 = i4 - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int iCompareTo = comparable.compareTo(((ap1) this.f19136a[i10]).f9383a);
            if (iCompareTo > 0) {
                return -(i4 + 1);
            }
            if (iCompareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int iCompareTo2 = comparable.compareTo(((ap1) this.f19136a[i12]).f9383a);
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
        if (this.f19140e == null) {
            this.f19140e = new androidx.datastore.preferences.protobuf.c1(1, this);
        }
        return this.f19140e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo1)) {
            return super.equals(obj);
        }
        zo1 zo1Var = (zo1) obj;
        int size = size();
        if (size == zo1Var.size()) {
            int i4 = this.f19137b;
            if (i4 != zo1Var.f19137b) {
                return entrySet().equals(zo1Var.entrySet());
            }
            for (int i10 = 0; i10 < i4; i10++) {
                if (a(i10).equals(zo1Var.a(i10))) {
                }
            }
            if (i4 != size) {
                return this.f19138c.equals(zo1Var.f19138c);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.f19139d) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap g() {
        f();
        if (this.f19138c.isEmpty() && !(this.f19138c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f19138c = treeMap;
            this.f19141f = treeMap.descendingMap();
        }
        return (SortedMap) this.f19138c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((ap1) this.f19136a[iE]).f9384b : this.f19138c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i4 = this.f19137b;
        int iHashCode = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            iHashCode += this.f19136a[i10].hashCode();
        }
        return this.f19138c.size() > 0 ? this.f19138c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return d(iE);
        }
        if (this.f19138c.isEmpty()) {
            return null;
        }
        return this.f19138c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f19138c.size() + this.f19137b;
    }
}
