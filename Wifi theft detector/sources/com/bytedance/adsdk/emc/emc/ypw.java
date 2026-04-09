package com.bytedance.adsdk.emc.emc;

/* loaded from: classes.dex */
public class ypw extends RuntimeException {
    public ypw(String str, Throwable th) {
        super("Unable to parse expression:".concat(String.valueOf(str)), th);
    }
}
