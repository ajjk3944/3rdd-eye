package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.dg.msw;
import com.bytedance.adsdk.ugeno.dg.ru;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class bw {
    private static volatile bw emc;
    private com.bytedance.adsdk.ugeno.xq.emc bw;
    private emc dg;
    private com.bytedance.adsdk.ugeno.core.emc.emc uym;
    private com.bytedance.adsdk.ugeno.core.xq xq;
    private com.bytedance.adsdk.ugeno.core.ypw.dg ycc;
    private List<com.bytedance.adsdk.ugeno.core.ypw> ypw;

    private bw() {
    }

    public static bw emc() {
        if (emc == null) {
            synchronized (bw.class) {
                try {
                    if (emc == null) {
                        emc = new bw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    private void ycc() {
        ArrayList arrayList = new ArrayList();
        this.ypw = arrayList;
        com.bytedance.adsdk.ugeno.core.xq xqVar = this.xq;
        if (xqVar != null) {
            arrayList.addAll(xqVar.emc());
        }
        com.bytedance.adsdk.ugeno.core.dg.emc(this.ypw);
    }

    public com.bytedance.adsdk.ugeno.core.emc.emc bw() {
        return this.uym;
    }

    public com.bytedance.adsdk.ugeno.core.ypw.dg dg() {
        return this.ycc;
    }

    public com.bytedance.adsdk.ugeno.xq.emc xq() {
        return this.bw;
    }

    public emc ypw() {
        return this.dg;
    }

    public void emc(Context context, com.bytedance.adsdk.ugeno.core.xq xqVar, emc emcVar) {
        this.xq = xqVar;
        this.dg = emcVar;
        ycc();
    }

    public void emc(com.bytedance.adsdk.ugeno.xq.emc emcVar) {
        this.bw = emcVar;
    }

    public void emc(msw mswVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.dg.emc().emc());
        if (mswVar != null) {
            arrayList.addAll(mswVar.emc());
        }
        ru.emc(arrayList);
    }

    public void emc(com.bytedance.adsdk.ugeno.dg.xq xqVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.dg.bw().emc());
        if (xqVar != null) {
            arrayList.addAll(xqVar.emc());
        }
        com.bytedance.adsdk.ugeno.dg.dg.emc(arrayList);
    }
}
