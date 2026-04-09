package com.bytedance.sdk.openadsdk.core.model;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class msw {
    private List<String> bw;
    private int dg;
    private int emc;
    private int uym;
    private List<Integer> xq;
    private int ycc;
    private int ypw;

    public int bw() {
        return this.ypw;
    }

    public int dg() {
        return this.emc;
    }

    public boolean emc() {
        return this.ycc == 1;
    }

    public JSONObject msw() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interceptor_x", this.emc);
            jSONObject.put("interceptor_y", this.ypw);
            if (this.xq != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<Integer> it = this.xq.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().intValue());
                }
                jSONObject.put("interceptor_page", jSONArray);
            }
            jSONObject.put("interceptor_interval_time", this.dg);
            if (this.bw != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it2 = this.bw.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next());
                }
                jSONObject.put("url_regular", jSONArray2);
            }
            jSONObject.put("is_act", this.ycc);
            jSONObject.put("boc_index", this.uym);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq(th.getMessage(), new Object[0]);
            return jSONObject;
        }
    }

    public int uym() {
        return this.dg;
    }

    public List<String> xq() {
        return this.bw;
    }

    public List<Integer> ycc() {
        return this.xq;
    }

    public int ypw() {
        int i = this.uym;
        if (i >= 2) {
            return i;
        }
        return 0;
    }

    public void bw(int i) {
        this.dg = i;
    }

    public void dg(int i) {
        this.ypw = i;
    }

    public void emc(int i) {
        this.ycc = i;
    }

    public void xq(int i) {
        this.emc = i;
    }

    public void ypw(int i) {
        this.uym = i;
    }

    public void emc(List<String> list) {
        this.bw = list;
    }

    public void ypw(List<Integer> list) {
        this.xq = list;
    }
}
