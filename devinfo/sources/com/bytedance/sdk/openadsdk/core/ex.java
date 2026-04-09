package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ex implements IDefaultEncrypt {
    private final PangleEncryptConstant.CryptDataScene ouw;

    public ex(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.ouw = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public final JSONObject encrypt(JSONObject jSONObject, int i4) {
        tc.ouw(1, this.ouw, i4);
        return com.bytedance.sdk.component.utils.ouw.ouw(jSONObject);
    }
}
