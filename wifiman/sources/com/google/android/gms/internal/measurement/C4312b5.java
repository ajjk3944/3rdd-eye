package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.b5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4312b5 extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    private static final C4312b5 f35183b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f35184a;

    static {
        C4312b5 c4312b5 = new C4312b5();
        f35183b = c4312b5;
        c4312b5.f35184a = false;
    }

    private C4312b5() {
        this.f35184a = true;
    }

    private static int d(Object obj) {
        if (obj instanceof byte[]) {
            return F4.d((byte[]) obj);
        }
        if (obj instanceof I4) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static C4312b5 h() {
        return f35183b;
    }

    private final void t() {
        if (!this.f35184a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        t();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L59
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L16
        L14:
            r7 = r1
            goto L5a
        L16:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L35
            goto L14
        L35:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L52
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L52
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L56
        L52:
            boolean r3 = r4.equals(r3)
        L56:
            if (r3 != 0) goto L1e
            goto L14
        L59:
            r7 = r0
        L5a:
            if (r7 == 0) goto L5d
            return r0
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4312b5.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iD = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iD += d(entry.getValue()) ^ d(entry.getKey());
        }
        return iD;
    }

    public final void l(C4312b5 c4312b5) {
        t();
        if (c4312b5.isEmpty()) {
            return;
        }
        putAll(c4312b5);
    }

    public final C4312b5 n() {
        return isEmpty() ? new C4312b5() : new C4312b5(this);
    }

    public final void p() {
        this.f35184a = false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        t();
        F4.e(obj);
        F4.e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        t();
        for (Object obj : map.keySet()) {
            F4.e(obj);
            F4.e(map.get(obj));
        }
        super.putAll(map);
    }

    public final boolean r() {
        return this.f35184a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        t();
        return super.remove(obj);
    }

    private C4312b5(Map map) {
        super(map);
        this.f35184a = true;
    }
}
