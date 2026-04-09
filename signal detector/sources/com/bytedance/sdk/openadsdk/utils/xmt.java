package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Map;

/* loaded from: classes.dex */
public class xmt {
    public static void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, Double d6) {
        if (rieVar == null || rieVar.zek() == null) {
            return;
        }
        Map<String, Object> mapZek = rieVar.zek();
        try {
            Object obj = rieVar.zek().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) mapZek.get("nurl");
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d6 != null) {
                    strReplace = strReplace.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d6));
                }
                com.bytedance.sdk.openadsdk.core.aa.xq().emc(strReplace);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.ul.xq("report Win error", new Object[0]);
        }
    }

    public static void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, Double d6, String str, String str2) {
        if (rieVar == null || rieVar.zek() == null) {
            return;
        }
        Map<String, Object> mapZek = rieVar.zek();
        try {
            Object obj = rieVar.zek().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) mapZek.get("lurl");
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d6 != null) {
                    strReplace = strReplace.replace("${AUCTION_PRICE}", String.valueOf(d6));
                }
                if (str != null) {
                    strReplace = strReplace.replace("${AUCTION_LOSS}", str);
                }
                if (str2 != null) {
                    strReplace = strReplace.replace("${AUCTION_WINNER}", str2);
                }
                com.bytedance.sdk.openadsdk.core.aa.xq().emc(strReplace);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.ul.xq("report Loss error", new Object[0]);
        }
    }
}
