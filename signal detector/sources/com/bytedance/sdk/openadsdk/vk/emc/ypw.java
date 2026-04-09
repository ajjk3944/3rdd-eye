package com.bytedance.sdk.openadsdk.vk.emc;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.tp;

/* loaded from: classes.dex */
public class ypw {
    private boolean bw;
    private int dg;
    private String emc;
    private int uym;
    private String xq;
    private String ycc;
    private rie ypw;
    private int msw = 0;
    private int zz = 0;

    public boolean bw() {
        return this.bw;
    }

    public int dg() {
        return this.dg;
    }

    public String emc() {
        return this.emc;
    }

    public int msw() {
        return this.msw;
    }

    public int uym() {
        return this.uym;
    }

    public String xq() {
        rie rieVar;
        if (TextUtils.isEmpty(this.xq) && (rieVar = this.ypw) != null) {
            this.xq = tp.emc(rieVar);
        }
        return this.xq;
    }

    public String ycc() {
        return this.ycc;
    }

    public rie ypw() {
        return this.ypw;
    }

    public int zz() {
        return this.zz;
    }

    public void emc(String str) {
        this.emc = str;
    }

    public void ypw(String str) {
        this.xq = str;
    }

    public void emc(rie rieVar) {
        this.ypw = rieVar;
    }

    public void ypw(int i) {
        this.uym = i;
    }

    public void emc(int i) {
        this.dg = i;
    }

    public void emc(boolean z6) {
        this.bw = z6;
    }

    public void xq(String str) {
        this.ycc = str;
    }
}
