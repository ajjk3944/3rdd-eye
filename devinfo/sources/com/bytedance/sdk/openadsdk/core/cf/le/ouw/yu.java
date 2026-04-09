package com.bytedance.sdk.openadsdk.core.cf.le.ouw;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.bly.ex;
import com.bytedance.sdk.openadsdk.core.cf.le.ra;
import com.bytedance.sdk.openadsdk.core.model.pd;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends ra {
    private static Boolean ksc;
    private final vt tc;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public yu(android.content.Context r1, com.bytedance.sdk.openadsdk.core.model.vpp r2, boolean r3, com.bytedance.sdk.openadsdk.core.cf.le.ouw r4, android.view.ViewGroup r5, float r6, float r7, boolean r8, java.lang.String r9) throws org.json.JSONException {
        /*
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r0
            r3 = 1
            if (r2 == 0) goto L20
            int r5 = r2.lna
            if (r5 == r3) goto L19
            r4 = 7
            if (r5 == r4) goto L13
            r4 = 8
            if (r5 == r4) goto L13
            goto L20
        L13:
            com.bytedance.sdk.openadsdk.core.cf.le.ouw.lh r4 = new com.bytedance.sdk.openadsdk.core.cf.le.ouw.lh
            r4.<init>(r2)
            goto L21
        L19:
            com.bytedance.sdk.openadsdk.core.cf.le.ouw.ouw r5 = new com.bytedance.sdk.openadsdk.core.cf.le.ouw.ouw
            r5.<init>(r2, r4)
            r4 = r5
            goto L21
        L20:
            r4 = 0
        L21:
            r1.tc = r4
            r1.vpp = r9
            org.json.JSONObject r2 = com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw(r6, r7, r8, r2, r9)
            r1.ex = r2
            if (r2 == 0) goto Lbc
            java.lang.String r5 = "xSize"
            org.json.JSONObject r2 = r2.optJSONObject(r5)     // Catch: java.lang.Exception -> Lbc
            if (r2 == 0) goto L7e
            java.lang.String r5 = "imageModeRatio"
            com.bytedance.sdk.openadsdk.core.model.vpp r6 = r1.fkw     // Catch: java.lang.Exception -> Lbc
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 != 0) goto L3e
            goto L7a
        L3e:
            int r6 = r6.ucs     // Catch: java.lang.Exception -> Lbc
            r8 = 3
            if (r6 != r8) goto L47
            r7 = 1072986849(0x3ff47ae1, float:1.91)
            goto L7a
        L47:
            r8 = 5
            if (r6 != r8) goto L4e
            r7 = 1071896330(0x3fe3d70a, float:1.78)
            goto L7a
        L4e:
            r8 = 15
            if (r6 == r8) goto L78
            r8 = 173(0xad, float:2.42E-43)
            if (r6 != r8) goto L57
            goto L78
        L57:
            r8 = 33
            if (r6 == r8) goto L7a
            r8 = 50
            if (r6 != r8) goto L60
            goto L7a
        L60:
            r8 = 1010(0x3f2, float:1.415E-42)
            if (r6 != r8) goto L68
            r7 = 1067030938(0x3f99999a, float:1.2)
            goto L7a
        L68:
            r8 = 1011(0x3f3, float:1.417E-42)
            if (r6 != r8) goto L70
            r7 = 1087163597(0x40cccccd, float:6.4)
            goto L7a
        L70:
            r8 = 1012(0x3f4, float:1.418E-42)
            if (r6 != r8) goto L7a
            r7 = 1078774989(0x404ccccd, float:3.2)
            goto L7a
        L78:
            r7 = 1058013184(0x3f100000, float:0.5625)
        L7a:
            double r6 = (double) r7     // Catch: java.lang.Exception -> Lbc
            r2.put(r5, r6)     // Catch: java.lang.Exception -> Lbc
        L7e:
            org.json.JSONObject r2 = r1.ex     // Catch: java.lang.Exception -> Lbc
            java.lang.String r5 = "xAdInfo"
            org.json.JSONObject r2 = r2.optJSONObject(r5)     // Catch: java.lang.Exception -> Lbc
            if (r2 == 0) goto Lb5
            java.lang.String r5 = "isVideoImageMode"
            com.bytedance.sdk.openadsdk.core.model.vpp r6 = r1.fkw     // Catch: java.lang.Exception -> Lbc
            boolean r6 = com.bytedance.sdk.openadsdk.core.model.vpp.fkw(r6)     // Catch: java.lang.Exception -> Lbc
            r2.put(r5, r6)     // Catch: java.lang.Exception -> Lbc
            java.lang.String r5 = "feed_draw_purePlayable"
            com.bytedance.sdk.openadsdk.core.model.vpp r6 = r1.fkw     // Catch: java.lang.Exception -> Lbc
            if (r6 == 0) goto La8
            boolean r6 = r0.ryl()     // Catch: java.lang.Exception -> Lbc
            if (r6 == 0) goto La8
            com.bytedance.sdk.openadsdk.core.model.vpp r6 = r1.fkw     // Catch: java.lang.Exception -> Lbc
            boolean r6 = com.bytedance.sdk.openadsdk.core.model.od.lh(r6)     // Catch: java.lang.Exception -> Lbc
            if (r6 == 0) goto La8
            goto La9
        La8:
            r3 = 0
        La9:
            r2.put(r5, r3)     // Catch: java.lang.Exception -> Lbc
            java.lang.String r3 = "isFeedDraw"
            boolean r5 = r0.ryl()     // Catch: java.lang.Exception -> Lbc
            r2.put(r3, r5)     // Catch: java.lang.Exception -> Lbc
        Lb5:
            if (r4 == 0) goto Lbc
            org.json.JSONObject r2 = r1.ex     // Catch: java.lang.Exception -> Lbc
            r4.ouw(r2)     // Catch: java.lang.Exception -> Lbc
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu.<init>(android.content.Context, com.bytedance.sdk.openadsdk.core.model.vpp, boolean, com.bytedance.sdk.openadsdk.core.cf.le.ouw, android.view.ViewGroup, float, float, boolean, java.lang.String):void");
    }

    private boolean ryl() {
        vpp vppVar = this.fkw;
        if (vppVar == null) {
            return false;
        }
        int i4 = vppVar.lna;
        boolean z3 = i4 == 7 || i4 == 8;
        int i10 = vppVar.fvf;
        return z3 && (i10 == 43 || i10 == 44);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.ra, com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final com.bytedance.adsdk.ugeno.vt.lh bly() {
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f8139lh;
        if (lhVar == null) {
            return null;
        }
        return lhVar.ra("VideoV3");
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.ra, com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final JSONObject ouw() {
        vt vtVar = this.tc;
        if (vtVar != null) {
            try {
                return new JSONObject(vtVar.ouw());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu, com.bytedance.sdk.component.adexpress.vt.yu
    public final int vt() {
        return 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.ra
    public final JSONObject ouw(pd pdVar) {
        vt vtVar = this.tc;
        if (vtVar != null) {
            return vtVar.vt();
        }
        return null;
    }

    public static boolean ouw(String str) {
        if (ksc == null) {
            ksc = Boolean.valueOf(com.bytedance.sdk.openadsdk.vpp.ouw.ouw("express_backup_type", 0) == 1);
        }
        return ksc.booleanValue() && (TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video") || ex.vt(str));
    }
}
