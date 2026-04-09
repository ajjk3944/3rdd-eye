package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.od;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    public static void ouw(ouw ouwVar, Intent intent, Bundle bundle) {
        ouw(intent, ouwVar);
        ouw(bundle, ouwVar);
    }

    public static vpp ouw(Intent intent, Bundle bundle, com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar) {
        if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            com.bytedance.sdk.openadsdk.core.model.ouw ouwVarRemove = od.ouw().ouw.remove(Integer.valueOf(od.ouw(intent)));
            vppVarOuw = ouwVarRemove != null ? ouwVarRemove.ryl : null;
            if (vtVar != null) {
                vtVar.ouw(bundle);
            }
            od.ouw().vt();
        } else if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_AD_INFO);
                if (stringExtra != null) {
                    vppVarOuw = com.bytedance.sdk.openadsdk.core.model.ouw.ouw(new JSONObject(stringExtra)).ryl;
                }
            } catch (Exception e2) {
                qbp.ouw("TTAD.RFDM", "", e2);
            }
        }
        if (bundle != null) {
            try {
                int i4 = bundle.getInt("meta_index", -1);
                vppVarOuw = od.ouw().ouw(i4);
                com.bytedance.sdk.component.utils.ko.vt("BVA", "getMaterialMetaData metaIndex =" + i4 + ",materialMeta =" + vppVarOuw);
            } catch (Throwable th2) {
                qbp.ouw("TTAD.RFDM", "", th2);
            }
        }
        if (vppVarOuw != null) {
            vppVarOuw.ouw(vppVarOuw.bs, 7);
        }
        return vppVarOuw;
    }

    public static void ouw(Intent intent, ouw ouwVar) {
        if (intent == null) {
            return;
        }
        ouwVar.ex.yu = intent.getBooleanExtra("video_is_cached", false);
        ouwVar.f7968ub = intent.getStringExtra("multi_process_listener_key");
        ouwVar.mt = intent.getIntExtra("orientation_angle", 0) == 3;
    }

    private static void ouw(Bundle bundle, ouw ouwVar) {
        if (bundle == null) {
            return;
        }
        ouwVar.f7968ub = bundle.getString("multi_process_listener_key");
        ouwVar.ex.yu = bundle.getBoolean("video_is_cached", false);
        ouwVar.f7958cj = bundle.getBoolean("is_mute");
        if (bundle.getLong("video_current") > 0) {
            ouwVar.ex.ouw = bundle.getLong("video_current", 0L);
        }
        ouwVar.ouw(bundle.getBoolean("has_show_skip_btn"));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ouw(android.content.Intent r2, android.app.Activity r3, boolean r4, com.bytedance.sdk.openadsdk.core.model.ouw r5, java.lang.String r6) {
        /*
            if (r3 != 0) goto L8
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r3)
            goto L1d
        L8:
            android.view.WindowManager r3 = r3.getWindowManager()     // Catch: java.lang.Exception -> L15
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch: java.lang.Exception -> L15
            int r3 = r3.getRotation()     // Catch: java.lang.Exception -> L15
            goto L1e
        L15:
            r3 = move-exception
            java.lang.String r0 = "TTAD.RFDM"
            java.lang.String r1 = ""
            com.bytedance.sdk.component.utils.qbp.ouw(r0, r1, r3)
        L1d:
            r3 = 0
        L1e:
            java.lang.String r0 = "orientation_angle"
            r2.putExtra(r0, r3)
            java.lang.String r3 = "video_is_cached"
            r2.putExtra(r3, r4)
            boolean r3 = com.bytedance.sdk.openadsdk.multipro.vt.lh()
            if (r3 == 0) goto L49
            org.json.JSONObject r3 = r5.fkw()
            if (r3 != 0) goto L3a
            java.lang.String r2 = "toJsonObj return null"
            com.bytedance.sdk.component.utils.ko.yu(r2)
            return
        L3a:
            java.lang.String r4 = "multi_process_ad_info"
            java.lang.String r3 = r3.toString()
            r2.putExtra(r4, r3)
            java.lang.String r3 = "multi_process_listener_key"
            r2.putExtra(r3, r6)
            return
        L49:
            com.bytedance.sdk.openadsdk.core.od r3 = com.bytedance.sdk.openadsdk.core.od.ouw()
            r3.vt()
            com.bytedance.sdk.openadsdk.core.od r3 = com.bytedance.sdk.openadsdk.core.od.ouw()
            int r3 = r3.ouw(r5)
            java.lang.String r4 = "meta_index"
            r2.putExtra(r4, r3)
            java.lang.String r3 = "single_process_listener_key"
            r2.putExtra(r3, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ouw.vt.ouw(android.content.Intent, android.app.Activity, boolean, com.bytedance.sdk.openadsdk.core.model.ouw, java.lang.String):void");
    }
}
