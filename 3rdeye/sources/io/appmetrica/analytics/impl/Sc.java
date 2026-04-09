package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Sc {
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final io.appmetrica.analytics.impl.T9 a(io.appmetrica.analytics.impl.Sc r5, io.appmetrica.analytics.impl.EnumC4532ca r6, java.util.Map r7) {
        /*
            r5.getClass()
            io.appmetrica.analytics.impl.T9 r5 = new io.appmetrica.analytics.impl.T9
            r5.<init>()
            int r6 = r6.ordinal()
            switch(r6) {
                case 0: goto L21;
                case 1: goto L1f;
                case 2: goto L1d;
                case 3: goto L1b;
                case 4: goto L19;
                case 5: goto L17;
                case 6: goto L15;
                default: goto Lf;
            }
        Lf:
            b9.j r5 = new b9.j
            r5.<init>()
            throw r5
        L15:
            r6 = 6
            goto L22
        L17:
            r6 = 5
            goto L22
        L19:
            r6 = 4
            goto L22
        L1b:
            r6 = 3
            goto L22
        L1d:
            r6 = 2
            goto L22
        L1f:
            r6 = 1
            goto L22
        L21:
            r6 = 0
        L22:
            r5.f40168a = r6
            io.appmetrica.analytics.impl.Sc r6 = io.appmetrica.analytics.impl.Tc.f40176b
            r6.getClass()
            java.util.Set r6 = r7.entrySet()
            r7 = 10
            int r7 = c9.C2092m.T(r6, r7)
            int r7 = c9.C2077A.l(r7)
            r0 = 16
            if (r7 >= r0) goto L3c
            r7 = r0
        L3c:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r7)
            java.util.Iterator r6 = r6.iterator()
        L45:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L88
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r1 = r7.getKey()
            java.lang.Object r2 = r7.getValue()
            boolean r2 = r2 instanceof java.lang.Number
            if (r2 == 0) goto L80
            java.lang.Object r2 = r7.getValue()
            if (r2 == 0) goto L78
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            boolean r4 = java.lang.Double.isInfinite(r2)
            if (r4 != 0) goto L76
            boolean r2 = java.lang.Double.isNaN(r2)
            if (r2 != 0) goto L76
            goto L80
        L76:
            r7 = 0
            goto L84
        L78:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Number"
            r5.<init>(r6)
            throw r5
        L80:
            java.lang.Object r7 = r7.getValue()
        L84:
            r0.put(r1, r7)
            goto L45
        L88:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>(r0)
            java.lang.String r6 = r6.toString()
            if (r6 == 0) goto L9b
            java.nio.charset.Charset r7 = y9.C5819a.f48359b
            byte[] r6 = r6.getBytes(r7)
            r5.f40169b = r6
        L9b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Sc.a(io.appmetrica.analytics.impl.Sc, io.appmetrica.analytics.impl.ca, java.util.Map):io.appmetrica.analytics.impl.T9");
    }
}
