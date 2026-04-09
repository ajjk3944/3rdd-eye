package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {

    /* renamed from: lh, reason: collision with root package name */
    private static String f8460lh = null;
    private static volatile String ouw = "";
    private static volatile String vt = "";
    private static volatile int yu;

    public static /* synthetic */ int fkw() {
        yu = 1;
        return 1;
    }

    public static String lh() {
        if (yu != 0) {
            return vt;
        }
        ouw();
        return vt;
    }

    public static String yu() {
        if (TextUtils.isEmpty(f8460lh)) {
            f8460lh = zih.ouw().getPackageManager().getInstallerPackageName(uoy.ra());
        }
        if (f8460lh == null) {
            f8460lh = "";
        }
        return f8460lh;
    }

    public static void ouw() {
        try {
            AppSet.getClient(zih.ouw()).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                @Keep
                public final void onSuccess(AppSetIdInfo appSetIdInfo) {
                    String unused = yu.ouw = Integer.toString(appSetIdInfo.getScope());
                    String unused2 = yu.vt = appSetIdInfo.getId();
                    yu.fkw();
                }
            });
        } catch (Throwable unused) {
            ko.vt("AppSetIdAndScope", "if you want to use appSetId, you must add 'com.google.android.gms:play-services-appset:x.x.x' into your build.gradle ");
            yu = 2;
        }
    }

    public static String vt() {
        if (yu != 0) {
            return ouw;
        }
        ouw();
        return ouw;
    }
}
