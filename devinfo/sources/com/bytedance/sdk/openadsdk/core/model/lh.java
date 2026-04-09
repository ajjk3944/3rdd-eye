package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {
    public AdSlot fkw;

    /* renamed from: le, reason: collision with root package name */
    public String f8245le;

    /* renamed from: lh, reason: collision with root package name */
    public int f8246lh = 1;
    public String ouw;
    public int ra;
    public int vt;
    public ArrayList<Integer> yu;

    public static void ouw(lh lhVar) {
        int i4;
        if (lhVar == null || lhVar.fkw == null || (i4 = lhVar.vt) >= 0 || i4 == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.rn.lh.ouw();
        com.bytedance.sdk.openadsdk.rn.lh.ouw("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.core.model.lh.1
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", lh.this.f8246lh);
                jSONObject.put("err_code", lh.this.vt);
                jSONObject.put("err_msg", lh.this.f8245le);
                jSONObject.put("ext_from", lh.this.ra);
                jSONObject.put("server_res_str", lh.this.ouw);
                ArrayList<Integer> arrayList = lh.this.yu;
                if (arrayList != null && arrayList.size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) lh.this.yu).toString());
                }
                com.bytedance.sdk.component.utils.ko.vt("AdLogInfoModel", "rd_client_custom_error = ", jSONObject);
                com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                yuVar.ouw = "rd_client_custom_error";
                yuVar.yu = lh.this.fkw.getDurationSlotType();
                yuVar.bly = jSONObject.toString();
                return yuVar;
            }
        });
    }
}
