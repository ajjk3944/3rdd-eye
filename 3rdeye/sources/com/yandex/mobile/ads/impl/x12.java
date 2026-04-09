package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class x12 {
    private static boolean a(StackTraceElement stackTraceElement, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((z50) obj).a() == a60.f24444b) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z50 z50Var = (z50) it.next();
                String string = stackTraceElement.toString();
                kotlin.jvm.internal.l.e(string, "toString(...)");
                if (y9.q.b0(string, z50Var.b(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086 A[LOOP:3: B:31:0x0086->B:79:?, LOOP_START, PHI: r1
  0x0086: PHI (r1v6 int) = (r1v5 int), (r1v7 int) binds: [B:29:0x0083, B:79:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.StackTraceElement[] r9, java.util.Set r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.l.f(r9, r0)
            java.lang.String r0 = "exclusions"
            kotlin.jvm.internal.l.f(r10, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r10.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            r3 = r2
            com.yandex.mobile.ads.impl.z50 r3 = (com.yandex.mobile.ads.impl.z50) r3
            com.yandex.mobile.ads.impl.a60 r3 = r3.a()
            com.yandex.mobile.ads.impl.a60 r4 = com.yandex.mobile.ads.impl.a60.f24445c
            if (r3 != r4) goto L13
            r0.add(r2)
            goto L13
        L2c:
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L34
            goto L58
        L34:
            java.util.Iterator r0 = r0.iterator()
        L38:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            com.yandex.mobile.ads.impl.z50 r1 = (com.yandex.mobile.ads.impl.z50) r1
            java.lang.String r3 = java.util.Arrays.toString(r9)
            java.lang.String r4 = "toString(...)"
            kotlin.jvm.internal.l.e(r3, r4)
            java.lang.String r1 = r1.b()
            boolean r1 = y9.q.b0(r3, r1, r2)
            if (r1 == 0) goto L38
            goto L85
        L58:
            int r0 = r9.length
            r1 = r2
        L5a:
            r3 = -1
            java.lang.String r4 = "com.monetization.ads"
            java.lang.String r5 = "com.yandex.mobile.ads"
            if (r1 >= r0) goto L82
            r6 = r9[r1]
            java.lang.String r7 = r6.getClassName()
            java.lang.String r8 = "getClassName(...)"
            kotlin.jvm.internal.l.e(r7, r8)
            boolean r8 = y9.n.a0(r7, r5, r2)
            if (r8 != 0) goto L78
            boolean r7 = y9.n.a0(r7, r4, r2)
            if (r7 == 0) goto L7f
        L78:
            boolean r6 = a(r6, r10)
            if (r6 != 0) goto L7f
            goto L83
        L7f:
            int r1 = r1 + 1
            goto L5a
        L82:
            r1 = r3
        L83:
            if (r1 != r3) goto L86
        L85:
            return r2
        L86:
            r0 = 1
            int r1 = r1 + r0
            java.lang.Object r3 = c9.C2091l.n(r9, r1)
            java.lang.StackTraceElement r3 = (java.lang.StackTraceElement) r3
            java.lang.Class<com.monetization.ads.core.utils.CallbackStackTraceMarker> r6 = com.monetization.ads.core.utils.CallbackStackTraceMarker.class
            if (r3 == 0) goto Lcb
            boolean r3 = a(r3, r10)
            if (r3 != 0) goto Lcb
            java.lang.Object r3 = c9.C2091l.n(r9, r1)
            java.lang.StackTraceElement r3 = (java.lang.StackTraceElement) r3
            if (r3 == 0) goto Lcb
            java.lang.String r3 = r3.getClassName()
            if (r3 == 0) goto Lcb
            boolean r7 = y9.n.a0(r3, r5, r2)
            if (r7 != 0) goto Lb2
            boolean r3 = y9.n.a0(r3, r4, r2)
            if (r3 == 0) goto Lcb
        Lb2:
            java.lang.Object r3 = c9.C2091l.n(r9, r1)
            java.lang.StackTraceElement r3 = (java.lang.StackTraceElement) r3
            if (r3 == 0) goto Lcb
            java.lang.String r3 = r3.getClassName()
            if (r3 == 0) goto Lcb
            java.lang.String r7 = r6.getName()
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto Lcb
            goto L86
        Lcb:
            java.lang.Object r9 = c9.C2091l.n(r9, r1)
            java.lang.StackTraceElement r9 = (java.lang.StackTraceElement) r9
            if (r9 == 0) goto Le4
            java.lang.String r9 = r9.getClassName()
            if (r9 == 0) goto Le4
            java.lang.String r10 = r6.getName()
            boolean r9 = r9.equals(r10)
            if (r9 != r0) goto Le4
            r2 = r0
        Le4:
            r9 = r2 ^ 1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.x12.a(java.lang.StackTraceElement[], java.util.Set):boolean");
    }
}
