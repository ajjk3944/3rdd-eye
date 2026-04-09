package com.google.android.gms.internal.consent_sdk;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s6 extends AbstractMap {
    public static final /* synthetic */ int g = 0;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f19510a;

    /* renamed from: b, reason: collision with root package name */
    public int f19511b;

    /* renamed from: c, reason: collision with root package name */
    public Map f19512c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19513d;

    /* renamed from: e, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.c1 f19514e;

    /* renamed from: f, reason: collision with root package name */
    public Map f19515f;

    public s6() {
        Map map = Collections.EMPTY_MAP;
        this.f19512c = map;
        this.f19515f = map;
    }

    public final Set a() {
        return this.f19512c.isEmpty() ? Collections.EMPTY_SET : this.f19512c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        g();
        int iD = d(comparable);
        if (iD >= 0) {
            return ((t6) this.f19510a[iD]).setValue(obj);
        }
        g();
        if (this.f19510a == null) {
            this.f19510a = new Object[16];
        }
        int i4 = -(iD + 1);
        if (i4 >= 16) {
            return f().put(comparable, obj);
        }
        if (this.f19511b == 16) {
            t6 t6Var = (t6) this.f19510a[15];
            this.f19511b = 15;
            f().put(t6Var.f19523a, t6Var.f19524b);
        }
        Object[] objArr = this.f19510a;
        int length = objArr.length;
        System.arraycopy(objArr, i4, objArr, i4 + 1, 15 - i4);
        this.f19510a[i4] = new t6(this, comparable, obj);
        this.f19511b++;
        return null;
    }

    public final t6 c(int i4) {
        if (i4 < this.f19511b) {
            return (t6) this.f19510a[i4];
        }
        throw new ArrayIndexOutOfBoundsException(i4);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        if (this.f19511b != 0) {
            this.f19510a = null;
            this.f19511b = 0;
        }
        if (this.f19512c.isEmpty()) {
            return;
        }
        this.f19512c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return d(comparable) >= 0 || this.f19512c.containsKey(comparable);
    }

    public final int d(Comparable comparable) {
        int i4 = this.f19511b;
        int i10 = i4 - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int iCompareTo = comparable.compareTo(((t6) this.f19510a[i10]).f19523a);
            if (iCompareTo > 0) {
                return -(i4 + 1);
            }
            if (iCompareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int iCompareTo2 = comparable.compareTo(((t6) this.f19510a[i12]).f19523a);
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

    public final Object e(int i4) {
        g();
        Object[] objArr = this.f19510a;
        Object obj = ((t6) objArr[i4]).f19524b;
        System.arraycopy(objArr, i4 + 1, objArr, i4, (this.f19511b - i4) - 1);
        this.f19511b--;
        if (!this.f19512c.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            Object[] objArr2 = this.f19510a;
            int i10 = this.f19511b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i10] = new t6(this, (Comparable) entry.getKey(), entry.getValue());
            this.f19511b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f19514e == null) {
            this.f19514e = new androidx.datastore.preferences.protobuf.c1(2, this);
        }
        return this.f19514e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6)) {
            return super.equals(obj);
        }
        s6 s6Var = (s6) obj;
        int size = size();
        if (size == s6Var.size()) {
            int i4 = this.f19511b;
            if (i4 != s6Var.f19511b) {
                return entrySet().equals(s6Var.entrySet());
            }
            for (int i10 = 0; i10 < i4; i10++) {
                if (c(i10).equals(s6Var.c(i10))) {
                }
            }
            if (i4 != size) {
                return this.f19512c.equals(s6Var.f19512c);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        g();
        if (this.f19512c.isEmpty() && !(this.f19512c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f19512c = treeMap;
            this.f19515f = treeMap.descendingMap();
        }
        return (SortedMap) this.f19512c;
    }

    public final void g() {
        if (this.f19513d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iD = d(comparable);
        return iD >= 0 ? ((t6) this.f19510a[iD]).f19524b : this.f19512c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i4 = this.f19511b;
        int iHashCode = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            iHashCode += this.f19510a[i10].hashCode();
        }
        return this.f19512c.size() > 0 ? this.f19512c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iD = d(comparable);
        if (iD >= 0) {
            return e(iD);
        }
        if (this.f19512c.isEmpty()) {
            return null;
        }
        return this.f19512c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f19512c.size() + this.f19511b;
    }
}
