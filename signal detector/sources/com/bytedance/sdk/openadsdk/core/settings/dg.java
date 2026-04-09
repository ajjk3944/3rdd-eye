package com.bytedance.sdk.openadsdk.core.settings;

import G2.b;
import V2.h;
import android.text.TextUtils;
import androidx.annotation.Keep;
import c3.d;
import c3.g;
import c3.j;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.utils.tp;

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
            j jVarB = new h(aa.emc()).b();
            jVarB.f5912b.i(new c3.h(g.f5903a, new d() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // c3.d
                @Keep
                public void onSuccess(b bVar) {
                    String unused = dg.emc = Integer.toString(bVar.f1514b);
                    String unused2 = dg.ypw = bVar.f1513a;
                    int unused3 = dg.dg = 1;
                }
            }));
            jVarB.j();
        } catch (Throwable unused) {
            dg = 2;
        }
    }
}
