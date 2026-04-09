package Ia;

/* loaded from: classes3.dex */
public abstract class j {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final Ia.c a(speedtest.InternetSpeedTestServer r15) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC6492s.i(r15, r0)
            java.lang.String r0 = r15.getURL()
            java.lang.String r1 = "it"
            kotlin.jvm.internal.AbstractC6492s.h(r0, r1)
            boolean r2 = kotlin.text.t.m0(r0)
            r3 = 0
            if (r2 != 0) goto L18
            r5 = r0
            goto L19
        L18:
            r5 = r3
        L19:
            if (r5 != 0) goto L1c
            return r3
        L1c:
            speedtest.LocationCoordinates r0 = r15.getLocation()
            if (r0 == 0) goto L2b
            double r6 = r0.getLatitude()
            java.lang.Double r0 = java.lang.Double.valueOf(r6)
            goto L2c
        L2b:
            r0 = r3
        L2c:
            r6 = 0
            boolean r2 = kotlin.jvm.internal.AbstractC6492s.a(r0, r6)
            if (r2 != 0) goto L35
            goto L36
        L35:
            r0 = r3
        L36:
            speedtest.LocationCoordinates r2 = r15.getLocation()
            if (r2 == 0) goto L53
            double r8 = r2.getLongitude()
            java.lang.Double r2 = java.lang.Double.valueOf(r8)
            double r8 = r2.doubleValue()
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 != 0) goto L4e
            r4 = 1
            goto L4f
        L4e:
            r4 = 0
        L4f:
            if (r4 != 0) goto L53
            r7 = r2
            goto L54
        L53:
            r7 = r3
        L54:
            java.lang.String r2 = r15.getProvider()
            kotlin.jvm.internal.AbstractC6492s.h(r2, r1)
            boolean r4 = kotlin.text.t.m0(r2)
            if (r4 != 0) goto L63
            r8 = r2
            goto L64
        L63:
            r8 = r3
        L64:
            java.lang.String r2 = r15.getProviderURL()
            if (r2 == 0) goto L72
            boolean r4 = kotlin.text.t.m0(r2)
            if (r4 != 0) goto L72
            r9 = r2
            goto L73
        L72:
            r9 = r3
        L73:
            java.lang.String r2 = r15.getCity()
            kotlin.jvm.internal.AbstractC6492s.h(r2, r1)
            boolean r4 = kotlin.text.t.m0(r2)
            if (r4 != 0) goto L82
            r10 = r2
            goto L83
        L82:
            r10 = r3
        L83:
            java.lang.String r2 = r15.getCountry()
            kotlin.jvm.internal.AbstractC6492s.h(r2, r1)
            boolean r4 = kotlin.text.t.m0(r2)
            if (r4 != 0) goto L92
            r11 = r2
            goto L93
        L92:
            r11 = r3
        L93:
            java.lang.String r2 = r15.getCountryCode()
            kotlin.jvm.internal.AbstractC6492s.h(r2, r1)
            boolean r1 = kotlin.text.t.m0(r2)
            if (r1 != 0) goto La2
            r12 = r2
            goto La3
        La2:
            r12 = r3
        La3:
            speedtest.LinkSpeed r15 = r15.getSpeedMbps()
            long r1 = r15.getBps()
            r13 = 0
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 <= 0) goto Lb2
            goto Lb3
        Lb2:
            r15 = r3
        Lb3:
            if (r15 == 0) goto Lbd
            long r1 = r15.getBps()
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
        Lbd:
            r13 = r3
            Ia.c r15 = new Ia.c
            r4 = r15
            r6 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: Ia.j.a(speedtest.InternetSpeedTestServer):Ia.c");
    }
}
