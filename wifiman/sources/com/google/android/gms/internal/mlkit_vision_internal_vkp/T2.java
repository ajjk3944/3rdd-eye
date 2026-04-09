package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
abstract class T2 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f35636a;

    /* renamed from: b, reason: collision with root package name */
    private int f35637b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f35639d;

    /* renamed from: e, reason: collision with root package name */
    private volatile R2 f35640e;

    /* renamed from: c, reason: collision with root package name */
    private Map f35638c = Collections.emptyMap();

    /* renamed from: f, reason: collision with root package name */
    private Map f35641f = Collections.emptyMap();

    /* synthetic */ T2(S2 s22) {
    }

    private final int p(Comparable comparable) {
        int i10 = this.f35637b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((N2) this.f35636a[i11]).a());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((N2) this.f35636a[i13]).a());
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(int i10) {
        s();
        Object value = ((N2) this.f35636a[i10]).getValue();
        Object[] objArr = this.f35636a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f35637b - i10) - 1);
        this.f35637b--;
        if (!this.f35638c.isEmpty()) {
            Iterator it = r().entrySet().iterator();
            Object[] objArr2 = this.f35636a;
            int i11 = this.f35637b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new N2(this, (Comparable) entry.getKey(), entry.getValue());
            this.f35637b++;
            it.remove();
        }
        return value;
    }

    private final SortedMap r() {
        s();
        if (this.f35638c.isEmpty() && !(this.f35638c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f35638c = treeMap;
            this.f35641f = treeMap.descendingMap();
        }
        return (SortedMap) this.f35638c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        if (this.f35639d) {
            throw new UnsupportedOperationException();
        }
    }

    public void b() {
        if (this.f35639d) {
            return;
        }
        this.f35638c = this.f35638c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f35638c);
        this.f35641f = this.f35641f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f35641f);
        this.f35639d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        s();
        if (this.f35637b != 0) {
            this.f35636a = null;
            this.f35637b = 0;
        }
        if (this.f35638c.isEmpty()) {
            return;
        }
        this.f35638c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return p(comparable) >= 0 || this.f35638c.containsKey(comparable);
    }

    public final int e() {
        return this.f35637b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f35640e == null) {
            this.f35640e = new R2(this, null);
        }
        return this.f35640e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T2)) {
            return super.equals(obj);
        }
        T2 t22 = (T2) obj;
        int size = size();
        if (size != t22.size()) {
            return false;
        }
        int i10 = this.f35637b;
        if (i10 != t22.f35637b) {
            return entrySet().equals(t22.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!i(i11).equals(t22.i(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f35638c.equals(t22.f35638c);
        }
        return true;
    }

    public final Iterable f() {
        return this.f35638c.isEmpty() ? Collections.emptySet() : this.f35638c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iP = p(comparable);
        return iP >= 0 ? ((N2) this.f35636a[iP]).getValue() : this.f35638c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        s();
        int iP = p(comparable);
        if (iP >= 0) {
            return ((N2) this.f35636a[iP]).setValue(obj);
        }
        s();
        if (this.f35636a == null) {
            this.f35636a = new Object[16];
        }
        int i10 = -(iP + 1);
        if (i10 >= 16) {
            return r().put(comparable, obj);
        }
        if (this.f35637b == 16) {
            N2 n22 = (N2) this.f35636a[15];
            this.f35637b = 15;
            r().put(n22.a(), n22.getValue());
        }
        Object[] objArr = this.f35636a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f35636a[i10] = new N2(this, comparable, obj);
        this.f35637b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f35637b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f35636a[i11].hashCode();
        }
        return this.f35638c.size() > 0 ? iHashCode + this.f35638c.hashCode() : iHashCode;
    }

    public final Map.Entry i(int i10) {
        if (i10 < this.f35637b) {
            return (N2) this.f35636a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    public final boolean l() {
        return this.f35639d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        s();
        Comparable comparable = (Comparable) obj;
        int iP = p(comparable);
        if (iP >= 0) {
            return q(iP);
        }
        if (this.f35638c.isEmpty()) {
            return null;
        }
        return this.f35638c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f35637b + this.f35638c.size();
    }
}
