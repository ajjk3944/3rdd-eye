package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.jqy;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public interface vpp<T> {

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw(int i4, String str);

        void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface vt {
        void ouw(int i4, String str);

        void ouw(jqy.vt vtVar);
    }

    com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouw();

    com.bytedance.sdk.openadsdk.yu.fkw ouw(JSONObject jSONObject, String str);

    JSONObject ouw(JSONObject jSONObject);

    void ouw(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ksc kscVar, int i4, qbp qbpVar);

    void ouw(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ksc kscVar, int i4, ouw ouwVar);

    void ouw(String str);

    void ouw(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3);

    void ouw(JSONObject jSONObject, vt vtVar);

    com.bytedance.sdk.openadsdk.yu.fkw vt(JSONObject jSONObject);

    void vt(JSONObject jSONObject, String str);
}
