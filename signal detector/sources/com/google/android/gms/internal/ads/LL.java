package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class LL extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f9655a;

    /* renamed from: b, reason: collision with root package name */
    public int f9656b;

    /* renamed from: c, reason: collision with root package name */
    public Map f9657c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9658d;

    /* renamed from: e, reason: collision with root package name */
    public volatile PL f9659e;

    /* renamed from: f, reason: collision with root package name */
    public Map f9660f;

    public LL() {
        Map map = Collections.EMPTY_MAP;
        this.f9657c = map;
        this.f9660f = map;
    }

    public final ML a(int i) {
        if (i < this.f9656b) {
            return (ML) this.f9655a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set b() {
        return this.f9657c.isEmpty() ? Collections.EMPTY_SET : this.f9657c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((ML) this.f9655a[iE]).setValue(obj);
        }
        f();
        if (this.f9655a == null) {
            this.f9655a = new Object[16];
        }
        int i = -(iE + 1);
        if (i >= 16) {
            return g().put(comparable, obj);
        }
        if (this.f9656b == 16) {
            ML ml = (ML) this.f9655a[15];
            this.f9656b = 15;
            g().put(ml.f9869a, ml.f9870b);
        }
        Object[] objArr = this.f9655a;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f9655a[i] = new ML(this, comparable, obj);
        this.f9656b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.f9656b != 0) {
            this.f9655a = null;
            this.f9656b = 0;
        }
        if (this.f9657c.isEmpty()) {
            return;
        }
        this.f9657c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f9657c.containsKey(comparable);
    }

    public final Object d(int i) {
        f();
        Object[] objArr = this.f9655a;
        Object obj = ((ML) objArr[i]).f9870b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f9656b - i) - 1);
        this.f9656b--;
        if (!this.f9657c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f9655a;
            int i3 = this.f9656b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i3] = new ML(this, (Comparable) entry.getKey(), entry.getValue());
            this.f9656b++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i = this.f9656b;
        int i3 = i - 1;
        int i6 = 0;
        if (i3 >= 0) {
            int iCompareTo = comparable.compareTo(((ML) this.f9655a[i3]).f9869a);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i3;
            }
        }
        while (i6 <= i3) {
            int i7 = (i6 + i3) / 2;
            int iCompareTo2 = comparable.compareTo(((ML) this.f9655a[i7]).f9869a);
            if (iCompareTo2 < 0) {
                i3 = i7 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i7;
                }
                i6 = i7 + 1;
            }
        }
        return -(i6 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f9659e == null) {
            this.f9659e = new PL(0, this);
        }
        return this.f9659e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LL)) {
            return super.equals(obj);
        }
        LL ll = (LL) obj;
        int size = size();
        if (size == ll.size()) {
            int i = this.f9656b;
            if (i != ll.f9656b) {
                return entrySet().equals(ll.entrySet());
            }
            for (int i3 = 0; i3 < i; i3++) {
                if (a(i3).equals(ll.a(i3))) {
                }
            }
            if (i != size) {
                return this.f9657c.equals(ll.f9657c);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.f9658d) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap g() {
        f();
        if (this.f9657c.isEmpty() && !(this.f9657c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9657c = treeMap;
            this.f9660f = treeMap.descendingMap();
        }
        return (SortedMap) this.f9657c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((ML) this.f9655a[iE]).f9870b : this.f9657c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f9656b;
        int iHashCode = 0;
        for (int i3 = 0; i3 < i; i3++) {
            iHashCode += this.f9655a[i3].hashCode();
        }
        return this.f9657c.size() > 0 ? this.f9657c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return d(iE);
        }
        if (this.f9657c.isEmpty()) {
            return null;
        }
        return this.f9657c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9657c.size() + this.f9656b;
    }
}
