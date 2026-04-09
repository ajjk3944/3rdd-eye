package com.bytedance.sdk.openadsdk.ryl.ouw;

import com.bytedance.sdk.openadsdk.core.bs;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tlj extends com.bytedance.sdk.component.ouw.vm<JSONObject, JSONObject> {
    public static final HashSet<String> yu = new HashSet<>(Arrays.asList("endcardDynamicCreatives", "multiOpenCovert", "speedVideoOrTimer", "openPlayable", "skipToNextAd"));
    private final bs fkw;

    private tlj(bs bsVar) {
        this.fkw = bsVar;
    }

    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* synthetic */ Object ouw(String str, Object obj) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        if ("endcardDynamicCreatives".equals(str)) {
            return this.fkw.fkw();
        }
        if ("multiOpenCovert".equals(str)) {
            this.fkw.yu(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(str)) {
            this.fkw.ouw(jSONObject, str);
            return null;
        }
        if ("speedVideoOrTimer".equals(str)) {
            return this.fkw.lh(jSONObject);
        }
        if ("openPlayable".equals(str)) {
            return this.fkw.yu();
        }
        return null;
    }

    public static void ouw(com.bytedance.sdk.component.ouw.ko koVar, bs bsVar) {
        koVar.ouw(yu, new tlj(bsVar));
    }
}
