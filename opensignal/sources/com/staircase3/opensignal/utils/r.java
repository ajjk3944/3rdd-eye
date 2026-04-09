package com.staircase3.opensignal.utils;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final qm.f f6192a;

    public r(qm.f fVar) {
        br.l.e(fVar, "permissionsManager");
        this.f6192a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.telephony.TelephonyManager a(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            br.l.e(r6, r0)
            android.content.Context r0 = r6.getApplicationContext()
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)
            boolean r1 = r0 instanceof android.telephony.TelephonyManager
            r2 = 0
            if (r1 == 0) goto L17
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            goto L18
        L17:
            r0 = r2
        L18:
            if (r0 != 0) goto L1b
            return r2
        L1b:
            qm.f r1 = r5.f6192a
            r1.getClass()
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            boolean r1 = qm.f.c(r6, r1)
            if (r1 == 0) goto L73
            android.content.Context r6 = r6.getApplicationContext()
            java.lang.String r1 = "telephony_subscription_service"
            java.lang.Object r6 = r6.getSystemService(r1)
            boolean r1 = r6 instanceof android.telephony.SubscriptionManager
            if (r1 == 0) goto L39
            android.telephony.SubscriptionManager r6 = (android.telephony.SubscriptionManager) r6
            goto L3a
        L39:
            r6 = r2
        L3a:
            if (r6 != 0) goto L3d
            goto L73
        L3d:
            java.util.List r6 = r6.getActiveSubscriptionInfoList()
            if (r6 == 0) goto L6f
            java.util.Iterator r6 = r6.iterator()
        L47:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r6.next()
            android.telephony.SubscriptionInfo r1 = (android.telephony.SubscriptionInfo) r1
            if (r1 != 0) goto L57
            r3 = r2
            goto L5f
        L57:
            int r3 = r1.getSubscriptionId()
            android.telephony.TelephonyManager r3 = r0.createForSubscriptionId(r3)
        L5f:
            if (r3 == 0) goto L47
            br.l.b(r1)
            int r4 = android.telephony.SubscriptionManager.getDefaultDataSubscriptionId()
            int r1 = r1.getSubscriptionId()
            if (r4 != r1) goto L47
            goto L70
        L6f:
            r3 = r2
        L70:
            if (r3 == 0) goto L73
            r2 = r3
        L73:
            if (r2 != 0) goto L76
            return r0
        L76:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.staircase3.opensignal.utils.r.a(android.content.Context):android.telephony.TelephonyManager");
    }
}
