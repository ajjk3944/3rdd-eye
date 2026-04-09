package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le {
    public static String ouw(String str) {
        if (!com.bytedance.sdk.component.utils.ko.yu() || TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.bly blyVar = new com.bytedance.sdk.openadsdk.core.model.bly(com.bytedance.sdk.openadsdk.core.bly.ouw().ryl());
        StringBuilder sb2 = new StringBuilder(str);
        Iterator<String> it = blyVar.vt.iterator();
        while (it.hasNext()) {
            if (sb2.toString().contains(it.next())) {
                if (sb2.toString().contains("?")) {
                    sb2.append("&");
                    sb2.append(blyVar.ouw);
                } else {
                    sb2.append("?");
                    sb2.append(blyVar.ouw);
                }
            }
        }
        return sb2.toString();
    }
}
