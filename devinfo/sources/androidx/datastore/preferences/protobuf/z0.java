package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z0 extends AbstractMap {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f1086f = 0;

    /* renamed from: a, reason: collision with root package name */
    public List f1087a;

    /* renamed from: b, reason: collision with root package name */
    public Map f1088b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1089c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c1 f1090d;

    /* renamed from: e, reason: collision with root package name */
    public Map f1091e;

    public static z0 f() {
        z0 z0Var = new z0();
        z0Var.f1087a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        z0Var.f1088b = map;
        z0Var.f1091e = map;
        return z0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f1087a
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f1087a
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.a1 r2 = (androidx.datastore.preferences.protobuf.a1) r2
            java.lang.Comparable r2 = r2.f933a
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r5 = -r0
            return r5
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f1087a
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.a1 r3 = (androidx.datastore.preferences.protobuf.a1) r3
            java.lang.Comparable r3 = r3.f933a
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.z0.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.f1089c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i4) {
        return (Map.Entry) this.f1087a.get(i4);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f1087a.isEmpty()) {
            this.f1087a.clear();
        }
        if (this.f1088b.isEmpty()) {
            return;
        }
        this.f1088b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f1088b.containsKey(comparable);
    }

    public final Set d() {
        return this.f1088b.isEmpty() ? Collections.EMPTY_SET : this.f1088b.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f1088b.isEmpty() && !(this.f1088b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f1088b = treeMap;
            this.f1091e = treeMap.descendingMap();
        }
        return (SortedMap) this.f1088b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f1090d == null) {
            this.f1090d = new c1(0, this);
        }
        return this.f1090d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return super.equals(obj);
        }
        z0 z0Var = (z0) obj;
        int size = size();
        if (size == z0Var.size()) {
            int size2 = this.f1087a.size();
            if (size2 != z0Var.f1087a.size()) {
                return ((AbstractSet) entrySet()).equals(z0Var.entrySet());
            }
            for (int i4 = 0; i4 < size2; i4++) {
                if (c(i4).equals(z0Var.c(i4))) {
                }
            }
            if (size2 != size) {
                return this.f1088b.equals(z0Var.f1088b);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((a1) this.f1087a.get(iA)).setValue(obj);
        }
        b();
        if (this.f1087a.isEmpty() && !(this.f1087a instanceof ArrayList)) {
            this.f1087a = new ArrayList(16);
        }
        int i4 = -(iA + 1);
        if (i4 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f1087a.size() == 16) {
            a1 a1Var = (a1) this.f1087a.remove(15);
            e().put(a1Var.f933a, a1Var.f934b);
        }
        this.f1087a.add(i4, new a1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((a1) this.f1087a.get(iA)).f934b : this.f1088b.get(comparable);
    }

    public final Object h(int i4) {
        b();
        Object obj = ((a1) this.f1087a.remove(i4)).f934b;
        if (!this.f1088b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f1087a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new a1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f1087a.size();
        int iHashCode = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iHashCode += ((a1) this.f1087a.get(i4)).hashCode();
        }
        return this.f1088b.size() > 0 ? this.f1088b.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.f1088b.isEmpty()) {
            return null;
        }
        return this.f1088b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1088b.size() + this.f1087a.size();
    }
}
