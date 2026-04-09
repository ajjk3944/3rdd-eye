package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.HashMap;

/* loaded from: classes.dex */
public class sra {
    public static int emc = Integer.MIN_VALUE;
    public static final String[] xq = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};
    public static int ypw = Integer.MIN_VALUE;

    public static String emc() {
        if (emc == Integer.MIN_VALUE) {
            emc = com.bytedance.sdk.openadsdk.core.zz.bw();
        }
        if (emc < 0) {
            emc = 0;
        }
        String[] strArr = xq;
        try {
            return strArr[emc % strArr.length];
        } catch (Throwable unused) {
            return strArr[0];
        }
    }

    public static synchronized void ypw() {
        if (ypw == 0) {
            return;
        }
        ypw = 0;
        com.bytedance.sdk.openadsdk.core.zz.ypw(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
    
        r2 = com.bytedance.sdk.openadsdk.utils.sra.emc + 1;
        com.bytedance.sdk.openadsdk.utils.sra.emc = r2;
        com.bytedance.sdk.openadsdk.core.zz.emc(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:18:0x0028, B:20:0x0030, B:25:0x003b, B:27:0x0041, B:28:0x0047, B:30:0x0050, B:31:0x0070, B:17:0x0025, B:8:0x0009, B:10:0x000e, B:12:0x0016), top: B:36:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:18:0x0028, B:20:0x0030, B:25:0x003b, B:27:0x0041, B:28:0x0047, B:30:0x0050, B:31:0x0070, B:17:0x0025, B:8:0x0009, B:10:0x000e, B:12:0x0016), top: B:36:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:18:0x0028, B:20:0x0030, B:25:0x003b, B:27:0x0041, B:28:0x0047, B:30:0x0050, B:31:0x0070, B:17:0x0025, B:8:0x0009, B:10:0x000e, B:12:0x0016), top: B:36:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void emc(java.lang.String r5) {
        /*
            java.lang.Class<com.bytedance.sdk.openadsdk.utils.sra> r0 = com.bytedance.sdk.openadsdk.utils.sra.class
            monitor-enter(r0)
            if (r5 != 0) goto L7
            monitor-exit(r0)
            return
        L7:
            r1 = 0
            r2 = r1
        L9:
            java.lang.String[] r3 = com.bytedance.sdk.openadsdk.utils.sra.xq     // Catch: java.lang.Throwable -> L20
            int r4 = r3.length     // Catch: java.lang.Throwable -> L20
            if (r2 >= r4) goto L28
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L20
            boolean r3 = r5.contains(r3)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L22
            int r2 = com.bytedance.sdk.openadsdk.utils.sra.emc     // Catch: java.lang.Throwable -> L20
            int r2 = r2 + 1
            com.bytedance.sdk.openadsdk.utils.sra.emc = r2     // Catch: java.lang.Throwable -> L20
            com.bytedance.sdk.openadsdk.core.zz.emc(r2)     // Catch: java.lang.Throwable -> L20
            goto L28
        L20:
            r2 = move-exception
            goto L25
        L22:
            int r2 = r2 + 1
            goto L9
        L25:
            r2.getMessage()     // Catch: java.lang.Throwable -> L39
        L28:
            java.lang.String r2 = "/api/ad/union/sdk/settings/"
            boolean r2 = r5.contains(r2)     // Catch: java.lang.Throwable -> L39
            if (r2 != 0) goto L3b
            java.lang.String r2 = "/api/ad/union/sdk/strategies/adn"
            boolean r5 = r5.contains(r2)     // Catch: java.lang.Throwable -> L39
            if (r5 == 0) goto L75
            goto L3b
        L39:
            r5 = move-exception
            goto L77
        L3b:
            int r5 = com.bytedance.sdk.openadsdk.utils.sra.ypw     // Catch: java.lang.Throwable -> L39
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r2) goto L47
            int r5 = com.bytedance.sdk.openadsdk.core.zz.ycc()     // Catch: java.lang.Throwable -> L39
            com.bytedance.sdk.openadsdk.utils.sra.ypw = r5     // Catch: java.lang.Throwable -> L39
        L47:
            int r5 = com.bytedance.sdk.openadsdk.utils.sra.ypw     // Catch: java.lang.Throwable -> L39
            int r5 = r5 + 1
            com.bytedance.sdk.openadsdk.utils.sra.ypw = r5     // Catch: java.lang.Throwable -> L39
            r2 = 3
            if (r5 < r2) goto L70
            com.bytedance.sdk.openadsdk.core.settings.gbl r5 = com.bytedance.sdk.openadsdk.core.settings.gbl.xq()     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = r5.ra()     // Catch: java.lang.Throwable -> L39
            int r2 = com.bytedance.sdk.openadsdk.utils.sra.ypw     // Catch: java.lang.Throwable -> L39
            com.bytedance.sdk.openadsdk.core.settings.gbl r3 = com.bytedance.sdk.openadsdk.core.settings.gbl.xq()     // Catch: java.lang.Throwable -> L39
            r3.hh()     // Catch: java.lang.Throwable -> L39
            com.bytedance.sdk.openadsdk.utils.sra.ypw = r1     // Catch: java.lang.Throwable -> L39
            com.bytedance.sdk.openadsdk.vk.xq.emc()     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "clear_domain"
            com.bytedance.sdk.openadsdk.utils.sra$1 r4 = new com.bytedance.sdk.openadsdk.utils.sra$1     // Catch: java.lang.Throwable -> L39
            r4.<init>()     // Catch: java.lang.Throwable -> L39
            com.bytedance.sdk.openadsdk.vk.xq.emc(r3, r1, r4)     // Catch: java.lang.Throwable -> L39
        L70:
            int r5 = com.bytedance.sdk.openadsdk.utils.sra.ypw     // Catch: java.lang.Throwable -> L39
            com.bytedance.sdk.openadsdk.core.zz.ypw(r5)     // Catch: java.lang.Throwable -> L39
        L75:
            monitor-exit(r0)
            return
        L77:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.sra.emc(java.lang.String):void");
    }

    public static void emc(com.bytedance.sdk.component.zz.ycc yccVar, String str) {
        HashMap map = new HashMap();
        map.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
        yccVar.emc(str, map);
    }
}
