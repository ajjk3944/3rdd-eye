package com.bytedance.sdk.component.ycc.emc.ycc;

import com.bytedance.sdk.component.ycc.emc.msw;

/* loaded from: classes.dex */
public class emc {
    private static volatile ypw emc;

    public static ypw emc() {
        if (emc == null) {
            synchronized (ypw.class) {
                try {
                    if (emc == null) {
                        emc = new xq(msw.uym().ycc(), new ycc(msw.uym().ycc()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }
}
