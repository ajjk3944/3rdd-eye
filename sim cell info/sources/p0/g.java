package p0;

import android.annotation.TargetApi;

@TargetApi(23)
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3141a = "g";

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.telephony.TelephonyManager r4, p0.b r5, android.content.Context r6) {
        /*
            int r6 = r4.getPhoneCount()
            r0 = 0
            r1 = 1
            if (r6 <= r1) goto La
            r6 = 1
            goto Lb
        La:
            r6 = 0
        Lb:
            r5.f3114e = r6
            if (r6 == 0) goto L82
            r6 = 26
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L41 java.lang.SecurityException -> L4c
            if (r2 < r6) goto L36
            java.lang.String r2 = r4.getImei(r0)     // Catch: java.lang.Exception -> L41 java.lang.SecurityException -> L4c
            r5.f3110a = r2     // Catch: java.lang.Exception -> L41 java.lang.SecurityException -> L4c
            java.lang.String r2 = r4.getImei(r1)     // Catch: java.lang.Exception -> L41 java.lang.SecurityException -> L4c
            r5.f3111b = r2     // Catch: java.lang.Exception -> L41 java.lang.SecurityException -> L4c
            java.lang.String r2 = r5.f3110a     // Catch: java.lang.Exception -> L41 java.lang.SecurityException -> L4c
            if (r2 != 0) goto L2b
            java.lang.String r2 = r4.getMeid(r0)     // Catch: java.lang.Exception -> L41 java.lang.SecurityException -> L4c
            r5.f3110a = r2     // Catch: java.lang.Exception -> L41 java.lang.SecurityException -> L4c
        L2b:
            java.lang.String r2 = r5.f3111b     // Catch: java.lang.Exception -> L41 java.lang.SecurityException -> L4c
            if (r2 != 0) goto L53
            java.lang.String r2 = r4.getMeid(r1)     // Catch: java.lang.Exception -> L41 java.lang.SecurityException -> L4c
        L33:
            r5.f3111b = r2     // Catch: java.lang.Exception -> L41 java.lang.SecurityException -> L4c
            goto L53
        L36:
            java.lang.String r2 = r4.getDeviceId(r0)     // Catch: java.lang.Exception -> L41 java.lang.SecurityException -> L4c
            r5.f3110a = r2     // Catch: java.lang.Exception -> L41 java.lang.SecurityException -> L4c
            java.lang.String r2 = r4.getDeviceId(r1)     // Catch: java.lang.Exception -> L41 java.lang.SecurityException -> L4c
            goto L33
        L41:
            r2 = move-exception
            java.lang.String r3 = p0.g.f3141a
            java.lang.String r2 = r2.getMessage()
            android.util.Log.e(r3, r2)
            goto L53
        L4c:
            java.lang.String r2 = p0.g.f3141a
            java.lang.String r3 = "getDeviceId denied"
            android.util.Log.e(r2, r3)
        L53:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 5
            if (r2 < r6) goto L6b
            int r6 = r4.getSimState(r0)
            if (r6 != r3) goto L60
            r6 = 1
            goto L61
        L60:
            r6 = 0
        L61:
            r5.f3112c = r6
            int r6 = r4.getSimState(r1)
            if (r6 != r3) goto L7c
            r0 = 1
            goto L7c
        L6b:
            boolean r6 = p0.e.o(r4, r5)
            if (r6 != 0) goto L7e
            int r6 = r4.getSimState()
            if (r6 != r3) goto L79
            r6 = 1
            goto L7a
        L79:
            r6 = 0
        L7a:
            r5.f3112c = r6
        L7c:
            r5.f3113d = r0
        L7e:
            p0.e.d(r4, r5)
            goto L85
        L82:
            p0.f.a(r4, r5)
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.g.a(android.telephony.TelephonyManager, p0.b, android.content.Context):boolean");
    }
}
