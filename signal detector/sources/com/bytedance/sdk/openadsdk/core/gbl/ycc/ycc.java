package com.bytedance.sdk.openadsdk.core.gbl.ycc;

import android.content.Context;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sba;
import com.bytedance.sdk.openadsdk.utils.tp;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ycc {
    private final String emc = "UGenV3OpenLinks";
    private final String ypw = "landingStyle";
    private final String xq = "url";
    private final String dg = "fallbackUrl";

    public void emc(Context context, boolean z6, rie rieVar, String str, Map<String, String> map, com.bytedance.sdk.openadsdk.core.widget.bw bwVar) {
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            if (emc(Integer.parseInt(map.get("landingStyle")), map.get("url"), map.get("fallbackUrl"))) {
                sba.emc(context, z6, emc(map), rieVar, str, tp.emc(str), null, bwVar);
            }
        } catch (Throwable th) {
            ul.xq("UGenV3OpenLinks", th.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean emc(int r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == r1) goto L1f
            r2 = 2
            if (r4 == r2) goto Lb
            r6 = 3
            if (r4 == r6) goto L1f
            goto L26
        Lb:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 == 0) goto L18
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 == 0) goto L18
            return r0
        L18:
            boolean r4 = com.bytedance.sdk.component.utils.sba.emc(r6)
            if (r4 != 0) goto L26
            return r0
        L1f:
            boolean r4 = com.bytedance.sdk.component.utils.sba.emc(r5)
            if (r4 != 0) goto L26
            return r0
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.gbl.ycc.ycc.emc(int, java.lang.String, java.lang.String):boolean");
    }

    private JSONObject emc(Map<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }
}
