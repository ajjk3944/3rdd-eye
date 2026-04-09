package com.bytedance.adsdk.ugeno.emc;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ycc {
    private com.bytedance.adsdk.ugeno.ypw.xq dg;
    private List<xq> emc;
    private Context xq;
    private List<emc> ypw;

    public ycc(Context context, com.bytedance.adsdk.ugeno.ypw.xq xqVar, List<xq> list) {
        this.dg = xqVar;
        this.xq = context;
        this.emc = list;
        dg();
    }

    private void dg() {
        this.ypw = new ArrayList();
        List<xq> list = this.emc;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.emc.size(); i++) {
            xq xqVar = this.emc.get(i);
            if (xqVar != null) {
                this.ypw.add(new emc(this.xq, this.dg, xqVar));
            }
        }
    }

    public void emc() {
        List<emc> list = this.ypw;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (emc emcVar : this.ypw) {
            if (emcVar != null) {
                emcVar.dg();
            }
        }
    }

    public void xq() {
        List<emc> list = this.ypw;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (emc emcVar : this.ypw) {
            if (emcVar != null) {
                emcVar.xq();
            }
        }
    }

    public void ypw() {
        List<emc> list = this.ypw;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (emc emcVar : this.ypw) {
            if (emcVar != null) {
                emcVar.emc();
            }
        }
    }

    public void emc(Canvas canvas) {
        List<emc> list = this.ypw;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (emc emcVar : this.ypw) {
            if (emcVar != null) {
                emcVar.emc(canvas);
            }
        }
    }

    public void ypw(Canvas canvas) {
        List<emc> list = this.ypw;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (emc emcVar : this.ypw) {
            if (emcVar != null) {
                emcVar.ypw(canvas);
            }
        }
    }

    public void emc(int i, int i3) {
        List<emc> list = this.ypw;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (emc emcVar : this.ypw) {
            if (emcVar != null) {
                emcVar.emc(i, i3);
            }
        }
    }

    public emc emc(String str) {
        List<emc> list = this.ypw;
        if (list != null && !list.isEmpty()) {
            for (emc emcVar : this.ypw) {
                if (emcVar != null && TextUtils.equals(emcVar.bw(), str)) {
                    return emcVar;
                }
            }
        }
        return null;
    }
}
