package com.bytedance.sdk.openadsdk.multipro;

import A.f;
import com.bytedance.sdk.openadsdk.core.aa;

/* loaded from: classes.dex */
public class dg {
    public static String emc = "com.bytedance.openadsdk";
    public static String ypw = f.p(new StringBuilder("content://"), emc, ".TTMultiProvider");

    static {
        emc();
    }

    public static void emc() {
        if (aa.emc() != null) {
            emc = aa.emc().getPackageName();
            ypw = f.p(new StringBuilder("content://"), emc, ".TTMultiProvider");
        }
    }
}
