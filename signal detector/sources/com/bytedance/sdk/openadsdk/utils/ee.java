package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;

/* loaded from: classes.dex */
public class ee {
    public static String emc(Context context) {
        int iEmc = com.bytedance.sdk.component.utils.sb.emc(context, 0L);
        return iEmc != 2 ? iEmc != 3 ? iEmc != 4 ? iEmc != 5 ? iEmc != 6 ? "mobile" : "5g" : "4g" : "wifi" : "3g" : "2g";
    }
}
