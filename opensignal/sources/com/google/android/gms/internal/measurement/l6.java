package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class l6 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f5101a;

    /* renamed from: d, reason: collision with root package name */
    public int f5102d;

    /* renamed from: g, reason: collision with root package name */
    public Map f5103g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5104r;

    /* renamed from: x, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.i1 f5105x;

    /* renamed from: y, reason: collision with root package name */
    public Map f5106y;

    public l6() {
        Map map = Collections.EMPTY_MAP;
        this.f5103g = map;
        this.f5106y = map;
    }

    public final m6 a(int i10) {
        if (i10 < this.f5102d) {
            return (m6) this.f5101a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    public final Set b() {
        return this.f5103g.isEmpty() ? Collections.EMPTY_SET : this.f5103g.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((m6) this.f5101a[iE]).setValue(obj);
        }
        f();
        if (this.f5101a == null) {
            this.f5101a = new Object[16];
        }
        int i10 = -(iE + 1);
        if (i10 >= 16) {
            return g().put(comparable, obj);
        }
        if (this.f5102d == 16) {
            m6 m6Var = (m6) this.f5101a[15];
            this.f5102d = 15;
            g().put(m6Var.f5123a, m6Var.f5124d);
        }
        Object[] objArr = this.f5101a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f5101a[i10] = new m6(this, comparable, obj);
        this.f5102d++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.f5102d != 0) {
            this.f5101a = null;
            this.f5102d = 0;
        }
        if (this.f5103g.isEmpty()) {
            return;
        }
        this.f5103g.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f5103g.containsKey(comparable);
    }

    public final Object d(int i10) {
        f();
        Object[] objArr = this.f5101a;
        Object obj = ((m6) objArr[i10]).f5124d;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f5102d - i10) - 1);
        this.f5102d--;
        if (!this.f5103g.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f5101a;
            int i11 = this.f5102d;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new m6(this, (Comparable) entry.getKey(), entry.getValue());
            this.f5102d++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i10 = this.f5102d;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((m6) this.f5101a[i11]).f5123a);
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((m6) this.f5101a[i13]).f5123a);
            if (iCompareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        return -(i12 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f5105x == null) {
            this.f5105x = new androidx.datastore.preferences.protobuf.i1(this, 1);
        }
        return this.f5105x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6)) {
            return super.equals(obj);
        }
        l6 l6Var = (l6) obj;
        int size = size();
        if (size == l6Var.size()) {
            int i10 = this.f5102d;
            if (i10 != l6Var.f5102d) {
                return entrySet().equals(l6Var.entrySet());
            }
            for (int i11 = 0; i11 < i10; i11++) {
                if (a(i11).equals(l6Var.a(i11))) {
                }
            }
            if (i10 != size) {
                return this.f5103g.equals(l6Var.f5103g);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.f5104r) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap g() {
        f();
        if (this.f5103g.isEmpty() && !(this.f5103g instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f5103g = treeMap;
            this.f5106y = treeMap.descendingMap();
        }
        return (SortedMap) this.f5103g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((m6) this.f5101a[iE]).f5124d : this.f5103g.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f5102d;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f5101a[i11].hashCode();
        }
        return this.f5103g.size() > 0 ? this.f5103g.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return d(iE);
        }
        if (this.f5103g.isEmpty()) {
            return null;
        }
        return this.f5103g.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f5103g.size() + this.f5102d;
    }
}
