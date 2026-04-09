package com.bytedance.sdk.component.ycc.emc.emc.emc;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.sdk.component.ycc.emc.emc.emc.ypw;

/* loaded from: classes.dex */
public class emc extends ypw {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile emc emc;

    private emc(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.emc.ypw
    public /* bridge */ /* synthetic */ ypw.C0126ypw emc() {
        return super.emc();
    }

    public static emc emc(Context context) {
        if (emc == null) {
            synchronized (emc.class) {
                try {
                    if (emc == null) {
                        emc = new emc(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }
}
