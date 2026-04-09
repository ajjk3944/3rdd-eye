package com.bytedance.sdk.openadsdk.zz;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.mkp;
import java.util.Map;

/* loaded from: classes.dex */
public final class dg extends emc {
    public static xq emc;

    public static String emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, String str) {
        xq xqVarEmc;
        Map map;
        if (!mkp.xq() || (xqVarEmc = ypw.emc("net")) == null || (map = (Map) xqVarEmc.emc(1, str)) == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                xqVar.ypw(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
