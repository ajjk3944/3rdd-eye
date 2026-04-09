package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class yzg {
    public static int emc = 1;
    public static int ypw = 2;
    private int xq = 5;
    private int dg = 30;
    private int bw = 70;
    private int ycc = 1;
    private int uym = emc;
    private int msw = 0;
    private int zz = 0;
    private int ru = 3;

    public int bw() {
        return this.dg;
    }

    public int dg() {
        return this.xq;
    }

    public int emc() {
        return this.ru;
    }

    public int msw() {
        return this.uym;
    }

    public int uym() {
        return this.ycc;
    }

    public int xq() {
        return this.msw;
    }

    public int ycc() {
        return this.bw;
    }

    public int ypw() {
        return this.zz;
    }

    public void bw(int i) {
        this.dg = i;
    }

    public void dg(int i) {
        this.xq = i;
    }

    public void emc(int i) {
        this.ru = i;
    }

    public void msw(int i) {
        this.uym = i;
    }

    public void uym(int i) {
        this.ycc = i;
    }

    public void xq(int i) {
        this.msw = i;
    }

    public void ycc(int i) {
        this.bw = i;
    }

    public void ypw(int i) {
        this.zz = i;
    }

    public boolean emc(boolean z6) {
        if (z6) {
            int i = this.msw;
            return i == 1 || i == 3;
        }
        int i3 = this.msw;
        return i3 == 3 || i3 == 2;
    }

    public JSONObject emc(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("ceiling_time", this.xq);
            jSONObject.put("ceiling_ratio", this.dg);
            jSONObject.put("expand_ratio", this.bw);
            jSONObject.put("back_type", this.ycc);
            jSONObject.put("boc_return_type", this.uym);
            jSONObject.put("pre_render_status", this.msw);
            jSONObject.put("pre_render_use_gecko", this.zz);
            jSONObject.put("pre_render_add_type", this.ru);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("InteractionParams", th.getMessage());
            return jSONObject;
        }
    }
}
