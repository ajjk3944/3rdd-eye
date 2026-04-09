package com.bytedance.adsdk.emc.emc;

/* loaded from: classes.dex */
public class emc extends RuntimeException {
    public emc(String str, String str2) {
        super(str + ",problem area:" + str2);
    }
}
