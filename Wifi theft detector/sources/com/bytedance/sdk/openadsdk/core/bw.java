package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.sdk.openadsdk.core.ycc;

/* loaded from: classes.dex */
public class bw extends ycc {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile bw emc;

    private bw(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ycc
    public /* bridge */ /* synthetic */ ycc.xq emc() {
        return super.emc();
    }

    public static bw emc(Context context) {
        if (emc == null) {
            synchronized (bw.class) {
                try {
                    if (emc == null) {
                        emc = new bw(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }
}
