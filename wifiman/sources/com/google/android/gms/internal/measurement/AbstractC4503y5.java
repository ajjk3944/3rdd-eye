package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.y5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4503y5 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f35535a;

    /* renamed from: b, reason: collision with root package name */
    private int f35536b;

    /* renamed from: c, reason: collision with root package name */
    private Map f35537c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f35538d;

    /* renamed from: e, reason: collision with root package name */
    private volatile E5 f35539e;

    /* renamed from: f, reason: collision with root package name */
    private Map f35540f;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int e(java.lang.Comparable r5) {
        /*
            r4 = this;
            int r0 = r4.f35536b
            int r1 = r0 + (-1)
            if (r1 < 0) goto L1f
            java.lang.Object[] r2 = r4.f35535a
            r2 = r2[r1]
            com.google.android.gms.internal.measurement.C5 r2 = (com.google.android.gms.internal.measurement.C5) r2
            java.lang.Object r2 = r2.getKey()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1c
            int r0 = r0 + 1
        L1a:
            int r5 = -r0
            return r5
        L1c:
            if (r2 != 0) goto L1f
            return r1
        L1f:
            r0 = 0
        L20:
            if (r0 > r1) goto L41
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.lang.Object[] r3 = r4.f35535a
            r3 = r3[r2]
            com.google.android.gms.internal.measurement.C5 r3 = (com.google.android.gms.internal.measurement.C5) r3
            java.lang.Object r3 = r3.getKey()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3b
            int r1 = r2 + (-1)
            goto L20
        L3b:
            if (r3 <= 0) goto L40
            int r0 = r2 + 1
            goto L20
        L40:
            return r2
        L41:
            int r0 = r0 + 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC4503y5.e(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j(int i10) {
        u();
        Object value = ((C5) this.f35535a[i10]).getValue();
        Object[] objArr = this.f35535a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f35536b - i10) - 1);
        this.f35536b--;
        if (!this.f35537c.isEmpty()) {
            Iterator it = t().entrySet().iterator();
            this.f35535a[this.f35536b] = new C5(this, (Map.Entry) it.next());
            this.f35536b++;
            it.remove();
        }
        return value;
    }

    private final SortedMap t() {
        u();
        if (this.f35537c.isEmpty() && !(this.f35537c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f35537c = treeMap;
            this.f35540f = treeMap.descendingMap();
        }
        return (SortedMap) this.f35537c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        if (this.f35538d) {
            throw new UnsupportedOperationException();
        }
    }

    public final int b() {
        return this.f35536b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        u();
        if (this.f35536b != 0) {
            this.f35535a = null;
            this.f35536b = 0;
        }
        if (this.f35537c.isEmpty()) {
            return;
        }
        this.f35537c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f35537c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f35539e == null) {
            this.f35539e = new E5(this);
        }
        return this.f35539e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4503y5)) {
            return super.equals(obj);
        }
        AbstractC4503y5 abstractC4503y5 = (AbstractC4503y5) obj;
        int size = size();
        if (size != abstractC4503y5.size()) {
            return false;
        }
        int i10 = this.f35536b;
        if (i10 != abstractC4503y5.f35536b) {
            return entrySet().equals(abstractC4503y5.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!h(i11).equals(abstractC4503y5.h(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f35537c.equals(abstractC4503y5.f35537c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        u();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((C5) this.f35535a[iE]).setValue(obj);
        }
        u();
        if (this.f35535a == null) {
            this.f35535a = new Object[16];
        }
        int i10 = -(iE + 1);
        if (i10 >= 16) {
            return t().put(comparable, obj);
        }
        int i11 = this.f35536b;
        if (i11 == 16) {
            C5 c52 = (C5) this.f35535a[15];
            this.f35536b = i11 - 1;
            t().put((Comparable) c52.getKey(), c52.getValue());
        }
        Object[] objArr = this.f35535a;
        System.arraycopy(objArr, i10, objArr, i10 + 1, (objArr.length - i10) - 1);
        this.f35535a[i10] = new C5(this, comparable, obj);
        this.f35536b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((C5) this.f35535a[iE]).getValue() : this.f35537c.get(comparable);
    }

    public final Map.Entry h(int i10) {
        if (i10 < this.f35536b) {
            return (C5) this.f35535a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i10 = this.f35536b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f35535a[i11].hashCode();
        }
        return this.f35537c.size() > 0 ? iHashCode + this.f35537c.hashCode() : iHashCode;
    }

    public final Iterable i() {
        return this.f35537c.isEmpty() ? Collections.emptySet() : this.f35537c.entrySet();
    }

    final Set n() {
        return new D5(this);
    }

    public void p() {
        if (this.f35538d) {
            return;
        }
        this.f35537c = this.f35537c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f35537c);
        this.f35540f = this.f35540f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f35540f);
        this.f35538d = true;
    }

    public final boolean r() {
        return this.f35538d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        u();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return j(iE);
        }
        if (this.f35537c.isEmpty()) {
            return null;
        }
        return this.f35537c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f35536b + this.f35537c.size();
    }

    private AbstractC4503y5() {
        this.f35537c = Collections.emptyMap();
        this.f35540f = Collections.emptyMap();
    }
}
