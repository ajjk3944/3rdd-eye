package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.activity.TTBaseActivity;
import com.bytedance.sdk.openadsdk.core.ko;
import u.l;
import u.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vpp {
    private static com.bytedance.sdk.openadsdk.rn.ouw.vt ouw(String str, int i4, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        com.bytedance.sdk.openadsdk.rn.ouw.vt vtVar = new com.bytedance.sdk.openadsdk.rn.ouw.vt();
        vtVar.ouw = str;
        vtVar.vt = vppVar;
        vtVar.f8639lh = uoy.ouw(vppVar);
        vtVar.yu = i4;
        vtVar.fkw = false;
        vtVar.ra = vppVar.f8305pd;
        return vtVar;
    }

    private static boolean vt(Context context, String str, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setData(Uri.parse(str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.rn.ouw.vt vtVarOuw = ouw(str2, 100, vppVar);
                vtVarOuw.fkw = true;
                vtVarOuw.ra = 2;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(vtVarOuw);
                return true;
            } catch (Throwable th2) {
                String message = th2.getMessage();
                com.bytedance.sdk.openadsdk.rn.ouw.vt vtVarOuw2 = ouw(str2, 7, vppVar);
                vtVarOuw2.f8638le = message;
                vtVarOuw2.ra = 2;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(vtVarOuw2);
                return false;
            }
        } catch (Throwable th3) {
            String message2 = th3.getMessage();
            com.bytedance.sdk.openadsdk.rn.ouw.vt vtVarOuw3 = ouw(str2, 6, vppVar);
            vtVarOuw3.f8638le = message2;
            vtVarOuw3.ra = 2;
            com.bytedance.sdk.openadsdk.yu.lh.ouw(vtVarOuw3);
            return false;
        }
    }

    public static boolean ouw(Context context, String str, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str2) {
        if (context instanceof Activity) {
            if (!ouw((Activity) context)) {
                context = null;
            }
        } else {
            Activity activityOuw = ko.ouw.ouw.ouw.ouw();
            if (activityOuw != null && ouw(activityOuw)) {
                context = activityOuw;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.zih.ouw();
        }
        if (context == null) {
            return false;
        }
        uoy.ouw(vppVar);
        if (!com.bytedance.sdk.component.utils.vm.ouw(str)) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(ouw(str2, 5, vppVar));
            return false;
        }
        String strVt = com.bytedance.sdk.openadsdk.core.model.vpp.vt(context, vppVar);
        if (!TextUtils.isEmpty(strVt)) {
            try {
                l lVar = new l();
                ((Intent) lVar.f34714c).putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", false);
                lVar.c(2);
                try {
                    m mVarA = lVar.a();
                    if (!(context instanceof Activity)) {
                        mVarA.f34718a.addFlags(268435456);
                    }
                    com.bytedance.sdk.openadsdk.core.ouw.ouw.ouw(context, strVt, mVarA, Uri.parse(str));
                    if (context instanceof TTBaseActivity) {
                        ((TTBaseActivity) context).fkw();
                    }
                    com.bytedance.sdk.openadsdk.rn.ouw.vt vtVarOuw = ouw(str2, 100, vppVar);
                    vtVarOuw.fkw = true;
                    vtVarOuw.ra = 8;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(vtVarOuw);
                    return true;
                } catch (Throwable th2) {
                    String message = th2.getMessage();
                    com.bytedance.sdk.component.utils.qbp.lh("OpenUtils", message);
                    com.bytedance.sdk.openadsdk.rn.ouw.vt vtVarOuw2 = ouw(str2, 13, vppVar);
                    vtVarOuw2.f8638le = message;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(vtVarOuw2);
                    vt(context, str, vppVar, str2);
                    return true;
                }
            } catch (Throwable th3) {
                String message2 = th3.getMessage();
                com.bytedance.sdk.component.utils.qbp.lh("OpenUtils", message2);
                com.bytedance.sdk.openadsdk.rn.ouw.vt vtVarOuw3 = ouw(str2, 12, vppVar);
                vtVarOuw3.f8638le = message2;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(vtVarOuw3);
                return vt(context, str, vppVar, str2);
            }
        }
        return vt(context, str, vppVar, str2);
    }

    public static boolean ouw(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}
