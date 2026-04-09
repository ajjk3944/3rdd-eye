package com.bytedance.sdk.openadsdk.xq;

import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.sra;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw {
    private static volatile ypw emc;
    private final sra<com.bytedance.sdk.openadsdk.dg.emc> ypw = aa.xq();

    private ypw() {
    }

    public static ypw emc() {
        if (emc == null) {
            synchronized (ypw.class) {
                try {
                    if (emc == null) {
                        emc = new ypw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    public void emc(String str, List<FilterWord> list, String str2) {
        emc(str, list, null, null, str2);
    }

    public void emc(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        this.ypw.emc(str, list, jSONObject, str2, str3);
    }
}
