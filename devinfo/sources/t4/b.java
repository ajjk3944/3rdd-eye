package t4;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import nk.k;
import nm.d0;
import yj.i;
import zj.n;
import zj.o;
import zj.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f34165a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f34166b;

    public b(LinkedHashMap linkedHashMap, boolean z3) {
        this.f34165a = linkedHashMap;
        this.f34166b = new d0(z3);
    }

    public final Map a() {
        i iVar;
        Set<Map.Entry> setEntrySet = this.f34165a.entrySet();
        int iH = w.H(o.T(setEntrySet, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                k.d(bArrCopyOf, "copyOf(this, size)");
                iVar = new i(key, bArrCopyOf);
            } else {
                iVar = new i(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(iVar.f37638a, iVar.f37639b);
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        k.d(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f34166b.f30011b).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void c(d dVar) {
        k.e(dVar, "key");
        b();
        this.f34165a.remove(dVar);
    }

    public final void d(d dVar, Object obj) {
        k.e(dVar, "key");
        e(dVar, obj);
    }

    public final void e(d dVar, Object obj) {
        k.e(dVar, "key");
        b();
        if (obj == null) {
            c(dVar);
            return;
        }
        boolean z3 = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f34165a;
        if (z3) {
            Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(n.v0((Set) obj));
            k.d(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(dVar, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(dVar, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            k.d(bArrCopyOf, "copyOf(this, size)");
            linkedHashMap.put(dVar, bArrCopyOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof t4.b
            r1 = 0
            if (r0 != 0) goto L6
            goto L60
        L6:
            t4.b r7 = (t4.b) r7
            java.util.LinkedHashMap r7 = r7.f34165a
            java.util.LinkedHashMap r0 = r6.f34165a
            r2 = 1
            if (r7 != r0) goto L10
            goto L61
        L10:
            int r3 = r7.size()
            int r4 = r0.size()
            if (r3 == r4) goto L1b
            goto L60
        L1b:
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L22
            goto L61
        L22:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2a:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L61
            java.lang.Object r3 = r7.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r4 = r0.get(r4)
            if (r4 == 0) goto L5d
            java.lang.Object r3 = r3.getValue()
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L58
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L5d
            byte[] r3 = (byte[]) r3
            byte[] r4 = (byte[]) r4
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 == 0) goto L5d
            r3 = r2
            goto L5e
        L58:
            boolean r3 = nk.k.a(r3, r4)
            goto L5e
        L5d:
            r3 = r1
        L5e:
            if (r3 != 0) goto L2a
        L60:
            return r1
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = this.f34165a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return n.g0(this.f34165a.entrySet(), ",\n", "{\n", "\n}", a.f34164a, 24);
    }

    public /* synthetic */ b(boolean z3) {
        this(new LinkedHashMap(), z3);
    }
}
