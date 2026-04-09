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

    public void bw(int i10) {
        this.dg = i10;
    }

    public void dg(int i10) {
        this.xq = i10;
    }

    public void emc(int i10) {
        this.ru = i10;
    }

    public void msw(int i10) {
        this.uym = i10;
    }

    public void uym(int i10) {
        this.ycc = i10;
    }

    public void xq(int i10) {
        this.msw = i10;
    }

    public void ycc(int i10) {
        this.bw = i10;
    }

    public void ypw(int i10) {
        this.zz = i10;
    }

    public boolean emc(boolean z10) {
        if (z10) {
            int i10 = this.msw;
            return i10 == 1 || i10 == 3;
        }
        int i11 = this.msw;
        return i11 == 3 || i11 == 2;
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
