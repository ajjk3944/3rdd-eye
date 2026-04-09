package com.bytedance.sdk.openadsdk.lh;

import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class vt {
    private static volatile vt ouw;
    private final vpp<com.bytedance.sdk.openadsdk.yu.ouw> vt = zih.lh();

    private vt() {
    }

    public static vt ouw() {
        if (ouw == null) {
            synchronized (vt.class) {
                try {
                    if (ouw == null) {
                        ouw = new vt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ouw;
    }

    public final void ouw(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        this.vt.ouw(str, list, jSONObject, str2, str3);
    }
}
