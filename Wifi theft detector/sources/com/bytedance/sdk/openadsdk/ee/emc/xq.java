package com.bytedance.sdk.openadsdk.ee.emc;

import com.bytedance.sdk.openadsdk.core.model.rie;

/* loaded from: classes.dex */
public class xq {
    public static boolean emc = false;
    public static String xq = "engaged_view";
    public static int ypw = 6;

    public static void emc(rie rieVar) {
        ypw ypwVarXq = xq(rieVar);
        if (ypwVarXq == null) {
            return;
        }
        ypwVarXq.emc();
    }

    private static ypw xq(rie rieVar) {
        if (rieVar == null || !rieVar.pob()) {
            return null;
        }
        return rieVar.ptf();
    }

    public static void ypw(rie rieVar) {
        ypw ypwVarXq = xq(rieVar);
        if (ypwVarXq == null) {
            return;
        }
        ypwVarXq.ypw();
    }

    public static void emc(rie rieVar, int i10) {
        ypw ypwVarXq = xq(rieVar);
        if (ypwVarXq == null || ypwVarXq.xq()) {
            return;
        }
        ypwVarXq.emc(i10);
    }

    public static void emc(rie rieVar, boolean z10) {
        ypw ypwVarXq = xq(rieVar);
        if (ypwVarXq == null || ypwVarXq.xq()) {
            return;
        }
        ypwVarXq.emc(z10);
        ypwVarXq.emc(z10 ? 4 : 8);
    }
}
