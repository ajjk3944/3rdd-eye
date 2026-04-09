package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xq {
    public AdSlot bw;
    public ArrayList<Integer> dg;
    public String emc;
    public int uym;
    public int xq = 1;
    public String ycc;
    public int ypw;

    public ArrayList<Integer> bw() {
        return this.dg;
    }

    public AdSlot dg() {
        return this.bw;
    }

    public String emc() {
        return this.emc;
    }

    public int xq() {
        return this.xq;
    }

    public int ypw() {
        return this.ypw;
    }

    public void emc(String str) {
        this.emc = str;
    }

    public void xq(int i10) {
        this.uym = i10;
    }

    public void ypw(int i10) {
        this.xq = i10;
    }

    public void emc(int i10) {
        this.ypw = i10;
    }

    public void ypw(String str) {
        this.ycc = str;
    }

    public void emc(AdSlot adSlot) {
        this.bw = adSlot;
    }

    public void emc(ArrayList<Integer> arrayList) {
        this.dg = arrayList;
    }

    public static void emc(xq xqVar) {
        int iYpw;
        if (xqVar == null || xqVar.dg() == null || (iYpw = xqVar.ypw()) >= 0 || iYpw == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.vk.xq.emc();
        com.bytedance.sdk.openadsdk.vk.xq.emc("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.core.model.xq.1
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", xq.this.xq());
                jSONObject.put("err_code", xq.this.ypw());
                jSONObject.put("err_msg", xq.this.ycc);
                jSONObject.put("ext_from", xq.this.uym);
                jSONObject.put("server_res_str", xq.this.emc());
                if (xq.this.bw() != null && xq.this.bw().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) xq.this.bw()).toString());
                }
                return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc("rd_client_custom_error").emc(xq.this.dg().getDurationSlotType()).ypw(jSONObject.toString());
            }
        });
    }
}
