package com.bytedance.sdk.component.zz.emc;

/* loaded from: classes.dex */
public class emc {
    private static volatile emc ypw;
    private volatile ypw emc;

    private emc() {
    }

    public static emc emc() {
        if (ypw == null) {
            synchronized (emc.class) {
                try {
                    if (ypw == null) {
                        ypw = new emc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ypw;
    }

    public ypw ypw() {
        return this.emc;
    }

    public void emc(ypw ypwVar) {
        this.emc = ypwVar;
    }
}
