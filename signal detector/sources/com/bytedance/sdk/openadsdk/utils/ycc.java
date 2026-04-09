package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ycc {
    public static String emc(String str) {
        if (!com.bytedance.sdk.component.utils.cf.dg() || TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.ru ruVar = new com.bytedance.sdk.openadsdk.core.model.ru(com.bytedance.sdk.openadsdk.core.zz.ypw().sz());
        StringBuilder sb = new StringBuilder(str);
        Iterator<String> it = ruVar.ypw().iterator();
        while (it.hasNext()) {
            if (sb.toString().contains(it.next())) {
                if (sb.toString().contains("?")) {
                    sb.append("&");
                    sb.append(ruVar.emc());
                } else {
                    sb.append("?");
                    sb.append(ruVar.emc());
                }
            }
        }
        return sb.toString();
    }
}
