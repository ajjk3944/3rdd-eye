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

/* loaded from: classes.dex */
public final class f1 extends AbstractMap {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f1270y = 0;

    /* renamed from: a, reason: collision with root package name */
    public List f1271a;

    /* renamed from: d, reason: collision with root package name */
    public Map f1272d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1273g;

    /* renamed from: r, reason: collision with root package name */
    public volatile i1 f1274r;

    /* renamed from: x, reason: collision with root package name */
    public Map f1275x;

    public static f1 f() {
        f1 f1Var = new f1();
        f1Var.f1271a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        f1Var.f1272d = map;
        f1Var.f1275x = map;
        return f1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f1271a
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f1271a
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.g1 r2 = (androidx.datastore.preferences.protobuf.g1) r2
            java.lang.Comparable r2 = r2.f1280a
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
            java.util.List r3 = r4.f1271a
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.g1 r3 = (androidx.datastore.preferences.protobuf.g1) r3
            java.lang.Comparable r3 = r3.f1280a
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.f1.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.f1273g) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i10) {
        return (Map.Entry) this.f1271a.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f1271a.isEmpty()) {
            this.f1271a.clear();
        }
        if (this.f1272d.isEmpty()) {
            return;
        }
        this.f1272d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f1272d.containsKey(comparable);
    }

    public final Set d() {
        return this.f1272d.isEmpty() ? Collections.EMPTY_SET : this.f1272d.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f1272d.isEmpty() && !(this.f1272d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f1272d = treeMap;
            this.f1275x = treeMap.descendingMap();
        }
        return (SortedMap) this.f1272d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f1274r == null) {
            this.f1274r = new i1(this, 0);
        }
        return this.f1274r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return super.equals(obj);
        }
        f1 f1Var = (f1) obj;
        int size = size();
        if (size == f1Var.size()) {
            int size2 = this.f1271a.size();
            if (size2 != f1Var.f1271a.size()) {
                return ((AbstractSet) entrySet()).equals(f1Var.entrySet());
            }
            for (int i10 = 0; i10 < size2; i10++) {
                if (c(i10).equals(f1Var.c(i10))) {
                }
            }
            if (size2 != size) {
                return this.f1272d.equals(f1Var.f1272d);
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
            return ((g1) this.f1271a.get(iA)).setValue(obj);
        }
        b();
        if (this.f1271a.isEmpty() && !(this.f1271a instanceof ArrayList)) {
            this.f1271a = new ArrayList(16);
        }
        int i10 = -(iA + 1);
        if (i10 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f1271a.size() == 16) {
            g1 g1Var = (g1) this.f1271a.remove(15);
            e().put(g1Var.f1280a, g1Var.f1281d);
        }
        this.f1271a.add(i10, new g1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((g1) this.f1271a.get(iA)).f1281d : this.f1272d.get(comparable);
    }

    public final Object h(int i10) {
        b();
        Object obj = ((g1) this.f1271a.remove(i10)).f1281d;
        if (!this.f1272d.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f1271a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new g1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f1271a.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += ((g1) this.f1271a.get(i10)).hashCode();
        }
        return this.f1272d.size() > 0 ? this.f1272d.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.f1272d.isEmpty()) {
            return null;
        }
        return this.f1272d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1272d.size() + this.f1271a.size();
    }
}
