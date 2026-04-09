package rs;

import androidx.datastore.preferences.protobuf.i1;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class b0 extends AbstractMap {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f21733y = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f21734a;

    /* renamed from: d, reason: collision with root package name */
    public List f21735d = Collections.EMPTY_LIST;

    /* renamed from: g, reason: collision with root package name */
    public Map f21736g = Collections.EMPTY_MAP;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21737r;

    /* renamed from: x, reason: collision with root package name */
    public volatile i1 f21738x;

    public b0(int i10) {
        this.f21734a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f21735d
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f21735d
            java.lang.Object r2 = r2.get(r1)
            rs.f0 r2 = (rs.f0) r2
            java.lang.Comparable r2 = r2.f21750a
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
            java.util.List r3 = r4.f21735d
            java.lang.Object r3 = r3.get(r2)
            rs.f0 r3 = (rs.f0) r3
            java.lang.Comparable r3 = r3.f21750a
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
        throw new UnsupportedOperationException("Method not decompiled: rs.b0.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.f21737r) {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable c() {
        return this.f21736g.isEmpty() ? e0.f21747b : this.f21736g.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f21735d.isEmpty()) {
            this.f21735d.clear();
        }
        if (this.f21736g.isEmpty()) {
            return;
        }
        this.f21736g.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f21736g.containsKey(comparable);
    }

    public final SortedMap d() {
        b();
        if (this.f21736g.isEmpty() && !(this.f21736g instanceof TreeMap)) {
            this.f21736g = new TreeMap();
        }
        return (SortedMap) this.f21736g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((f0) this.f21735d.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f21735d.isEmpty();
        int i10 = this.f21734a;
        if (zIsEmpty && !(this.f21735d instanceof ArrayList)) {
            this.f21735d = new ArrayList(i10);
        }
        int i11 = -(iA + 1);
        if (i11 >= i10) {
            return d().put(comparable, obj);
        }
        if (this.f21735d.size() == i10) {
            f0 f0Var = (f0) this.f21735d.remove(i10 - 1);
            d().put(f0Var.f21750a, f0Var.f21751d);
        }
        this.f21735d.add(i11, new f0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f21738x == null) {
            this.f21738x = new i1(this, 2);
        }
        return this.f21738x;
    }

    public final Object f(int i10) {
        b();
        Object obj = ((f0) this.f21735d.remove(i10)).f21751d;
        if (!this.f21736g.isEmpty()) {
            Iterator it = d().entrySet().iterator();
            List list = this.f21735d;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new f0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((f0) this.f21735d.get(iA)).f21751d : this.f21736g.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return f(iA);
        }
        if (this.f21736g.isEmpty()) {
            return null;
        }
        return this.f21736g.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f21736g.size() + this.f21735d.size();
    }
}
