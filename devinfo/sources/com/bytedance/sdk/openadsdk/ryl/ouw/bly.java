package com.bytedance.sdk.openadsdk.ryl.ouw;

import com.bytedance.sdk.openadsdk.core.bs;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly extends com.bytedance.sdk.component.ouw.yu<JSONObject, JSONObject> {

    /* renamed from: lh, reason: collision with root package name */
    private final bs f8643lh;
    private String yu;

    public bly(bs bsVar, String str) {
        this.f8643lh = bsVar;
        this.yu = str;
    }

    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* synthetic */ JSONObject ouw(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = jSONObject;
        if ("endcardDynamicCreatives".equals(this.yu)) {
            return this.f8643lh.fkw();
        }
        if ("multiOpenCovert".equals(this.yu)) {
            this.f8643lh.yu(jSONObject2);
            return null;
        }
        if ("skipToNextAd".equals(this.yu)) {
            this.f8643lh.ouw(jSONObject2, this.yu);
            return null;
        }
        if ("speedVideoOrTimer".equals(this.yu)) {
            return this.f8643lh.lh(jSONObject2);
        }
        if ("openPlayable".equals(this.yu)) {
            return this.f8643lh.yu();
        }
        return null;
    }
}
