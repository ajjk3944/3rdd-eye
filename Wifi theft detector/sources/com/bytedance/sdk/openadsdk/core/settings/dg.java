package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes.dex */
public class dg {
    private static volatile int dg = 0;
    private static volatile String emc = "";
    private static String xq = null;
    private static volatile String ypw = "";

    public static String dg() {
        if (TextUtils.isEmpty(xq)) {
            xq = aa.emc().getPackageManager().getInstallerPackageName(tp.ycc());
        }
        if (xq == null) {
            xq = "";
        }
        return xq;
    }

    public static String xq() {
        if (dg != 0) {
            return ypw;
        }
        emc();
        return ypw;
    }

    public static String ypw() {
        if (dg != 0) {
            return emc;
        }
        emc();
        return emc;
    }

    public static void emc() {
        try {
            AppSet.getClient(aa.emc()).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                @Keep
                public void onSuccess(AppSetIdInfo appSetIdInfo) {
                    String unused = dg.emc = Integer.toString(appSetIdInfo.getScope());
                    String unused2 = dg.ypw = appSetIdInfo.getId();
                    int unused3 = dg.dg = 1;
                }
            });
        } catch (Throwable unused) {
            dg = 2;
        }
    }
}
