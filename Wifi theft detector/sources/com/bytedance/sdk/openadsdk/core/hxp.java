package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class hxp implements IDefaultEncrypt {
    private final PangleEncryptConstant.CryptDataScene emc;

    public hxp(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.emc = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public JSONObject encrypt(JSONObject jSONObject, int i10) {
        ee.emc(1, this.emc, i10);
        return com.bytedance.sdk.component.utils.emc.emc(jSONObject);
    }
}
