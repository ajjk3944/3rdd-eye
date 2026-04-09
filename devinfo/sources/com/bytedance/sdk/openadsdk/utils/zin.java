package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class zin {

    /* renamed from: lh, reason: collision with root package name */
    public static final String[] f8744lh = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};
    public static int ouw = Integer.MIN_VALUE;
    public static int vt = Integer.MIN_VALUE;

    public static String ouw() {
        if (ouw == Integer.MIN_VALUE) {
            ouw = com.bytedance.sdk.openadsdk.core.bly.fkw();
        }
        if (ouw < 0) {
            ouw = 0;
        }
        String[] strArr = f8744lh;
        try {
            return strArr[ouw % strArr.length];
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.ko.lh("NetUtils", "index out of bounds");
            return strArr[0];
        }
    }

    public static synchronized void vt() {
        if (vt == 0) {
            return;
        }
        vt = 0;
        com.bytedance.sdk.openadsdk.core.bly.vt(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
    
        r2 = com.bytedance.sdk.openadsdk.utils.zin.ouw + 1;
        com.bytedance.sdk.openadsdk.utils.zin.ouw = r2;
        com.bytedance.sdk.openadsdk.core.bly.ouw(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:18:0x002e, B:20:0x0036, B:25:0x0041, B:27:0x0047, B:28:0x004d, B:30:0x0056, B:31:0x0088, B:17:0x0025, B:8:0x0009, B:10:0x000e, B:12:0x0016), top: B:36:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:18:0x002e, B:20:0x0036, B:25:0x0041, B:27:0x0047, B:28:0x004d, B:30:0x0056, B:31:0x0088, B:17:0x0025, B:8:0x0009, B:10:0x000e, B:12:0x0016), top: B:36:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:18:0x002e, B:20:0x0036, B:25:0x0041, B:27:0x0047, B:28:0x004d, B:30:0x0056, B:31:0x0088, B:17:0x0025, B:8:0x0009, B:10:0x000e, B:12:0x0016), top: B:36:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void ouw(java.lang.String r6) {
        /*
            java.lang.Class<com.bytedance.sdk.openadsdk.utils.zin> r0 = com.bytedance.sdk.openadsdk.utils.zin.class
            monitor-enter(r0)
            if (r6 != 0) goto L7
            monitor-exit(r0)
            return
        L7:
            r1 = 0
            r2 = r1
        L9:
            java.lang.String[] r3 = com.bytedance.sdk.openadsdk.utils.zin.f8744lh     // Catch: java.lang.Throwable -> L20
            int r4 = r3.length     // Catch: java.lang.Throwable -> L20
            if (r2 >= r4) goto L2e
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L20
            boolean r3 = r6.contains(r3)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L22
            int r2 = com.bytedance.sdk.openadsdk.utils.zin.ouw     // Catch: java.lang.Throwable -> L20
            int r2 = r2 + 1
            com.bytedance.sdk.openadsdk.utils.zin.ouw = r2     // Catch: java.lang.Throwable -> L20
            com.bytedance.sdk.openadsdk.core.bly.ouw(r2)     // Catch: java.lang.Throwable -> L20
            goto L2e
        L20:
            r2 = move-exception
            goto L25
        L22:
            int r2 = r2 + 1
            goto L9
        L25:
            java.lang.String r3 = "NetUtils"
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L3f
            com.bytedance.sdk.component.utils.ko.fkw(r3, r2)     // Catch: java.lang.Throwable -> L3f
        L2e:
            java.lang.String r2 = "/api/ad/union/sdk/settings/"
            boolean r2 = r6.contains(r2)     // Catch: java.lang.Throwable -> L3f
            if (r2 != 0) goto L41
            java.lang.String r2 = "/api/ad/union/sdk/strategies/adn"
            boolean r6 = r6.contains(r2)     // Catch: java.lang.Throwable -> L3f
            if (r6 == 0) goto L8d
            goto L41
        L3f:
            r6 = move-exception
            goto L8f
        L41:
            int r6 = com.bytedance.sdk.openadsdk.utils.zin.vt     // Catch: java.lang.Throwable -> L3f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != r2) goto L4d
            int r6 = com.bytedance.sdk.openadsdk.core.bly.le()     // Catch: java.lang.Throwable -> L3f
            com.bytedance.sdk.openadsdk.utils.zin.vt = r6     // Catch: java.lang.Throwable -> L3f
        L4d:
            int r6 = com.bytedance.sdk.openadsdk.utils.zin.vt     // Catch: java.lang.Throwable -> L3f
            int r6 = r6 + 1
            com.bytedance.sdk.openadsdk.utils.zin.vt = r6     // Catch: java.lang.Throwable -> L3f
            r2 = 3
            if (r6 < r2) goto L88
            com.bytedance.sdk.openadsdk.core.settings.cf r6 = com.bytedance.sdk.openadsdk.core.settings.cf.vt()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = r6.vm()     // Catch: java.lang.Throwable -> L3f
            int r2 = com.bytedance.sdk.openadsdk.utils.zin.vt     // Catch: java.lang.Throwable -> L3f
            com.bytedance.sdk.openadsdk.core.settings.cf r3 = com.bytedance.sdk.openadsdk.core.settings.cf.vt()     // Catch: java.lang.Throwable -> L3f
            com.bytedance.sdk.openadsdk.core.settings.pno r3 = r3.pno     // Catch: java.lang.Throwable -> L3f
            com.bytedance.sdk.openadsdk.core.settings.fkw$ouw r3 = r3.ouw()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "settings_url"
            java.lang.String r5 = ""
            r3.ouw(r4, r5)     // Catch: java.lang.Throwable -> L3f
            r3.ouw()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = ""
            com.bytedance.sdk.openadsdk.core.settings.cf.vpp(r3)     // Catch: java.lang.Throwable -> L3f
            com.bytedance.sdk.openadsdk.utils.zin.vt = r1     // Catch: java.lang.Throwable -> L3f
            com.bytedance.sdk.openadsdk.rn.lh.ouw()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = "clear_domain"
            com.bytedance.sdk.openadsdk.utils.zin$1 r4 = new com.bytedance.sdk.openadsdk.utils.zin$1     // Catch: java.lang.Throwable -> L3f
            r4.<init>()     // Catch: java.lang.Throwable -> L3f
            com.bytedance.sdk.openadsdk.rn.lh.ouw(r3, r1, r4)     // Catch: java.lang.Throwable -> L3f
        L88:
            int r6 = com.bytedance.sdk.openadsdk.utils.zin.vt     // Catch: java.lang.Throwable -> L3f
            com.bytedance.sdk.openadsdk.core.bly.vt(r6)     // Catch: java.lang.Throwable -> L3f
        L8d:
            monitor-exit(r0)
            return
        L8f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.zin.ouw(java.lang.String):void");
    }

    public static void ouw(com.bytedance.sdk.component.bly.le leVar, String str) {
        HashMap map = new HashMap();
        map.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
        leVar.ouw(str, map);
    }
}
