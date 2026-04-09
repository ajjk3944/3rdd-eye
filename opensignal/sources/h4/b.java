package h4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import lq.l;
import mq.b0;
import mq.o;
import mq.p;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9890a;

    /* renamed from: b, reason: collision with root package name */
    public final b9.e f9891b;

    public b(LinkedHashMap linkedHashMap, boolean z10) {
        this.f9890a = linkedHashMap;
        this.f9891b = new b9.e(z10);
    }

    public final Map a() {
        l lVar;
        Set<Map.Entry> setEntrySet = this.f9890a.entrySet();
        int iP = b0.P(p.a0(setEntrySet, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                br.l.d(bArrCopyOf, "copyOf(this, size)");
                lVar = new l(key, bArrCopyOf);
            } else {
                lVar = new l(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(lVar.f15571a, lVar.f15572d);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        br.l.d(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f9891b.f2481d).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void c(e eVar) {
        br.l.e(eVar, "key");
        b();
        this.f9890a.remove(eVar);
    }

    public final void d(e eVar, Object obj) {
        br.l.e(eVar, "key");
        e(eVar, obj);
    }

    public final void e(e eVar, Object obj) {
        br.l.e(eVar, "key");
        b();
        if (obj == null) {
            c(eVar);
            return;
        }
        boolean z10 = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f9890a;
        if (z10) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(o.U0((Set) obj));
            br.l.d(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(eVar, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(eVar, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            br.l.d(bArrCopyOf, "copyOf(this, size)");
            linkedHashMap.put(eVar, bArrCopyOf);
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
            boolean r0 = r7 instanceof h4.b
            r1 = 0
            if (r0 != 0) goto L6
            goto L60
        L6:
            h4.b r7 = (h4.b) r7
            java.util.LinkedHashMap r7 = r7.f9890a
            java.util.LinkedHashMap r0 = r6.f9890a
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
            boolean r3 = br.l.a(r3, r4)
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
        throw new UnsupportedOperationException("Method not decompiled: h4.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = this.f9890a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return o.x0(this.f9890a.entrySet(), ",\n", "{\n", "\n}", a.f9889d, 24);
    }

    public /* synthetic */ b(boolean z10) {
        this(new LinkedHashMap(), z10);
    }
}
