package com.bytedance.sdk.component.le.ouw.ouw.ouw;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.sdk.component.le.ouw.ouw.ouw.vt;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw extends vt {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile ouw ouw;

    private ouw(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.ouw.vt
    public final /* bridge */ /* synthetic */ vt.C0055vt ouw() {
        return super.ouw();
    }

    public static ouw ouw(Context context) {
        if (ouw == null) {
            synchronized (ouw.class) {
                try {
                    if (ouw == null) {
                        ouw = new ouw(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ouw;
    }
}
