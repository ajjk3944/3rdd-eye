package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.sdk.openadsdk.core.le;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class fkw extends le {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile fkw ouw;

    private fkw(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.le
    public final /* bridge */ /* synthetic */ le.lh ouw() {
        return super.ouw();
    }

    public static fkw ouw(Context context) {
        if (ouw == null) {
            synchronized (fkw.class) {
                try {
                    if (ouw == null) {
                        ouw = new fkw(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ouw;
    }
}
