package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class sb {
    public static ConcurrentHashMap<Integer, sb> emc = new ConcurrentHashMap<>();
    private int bw;
    private int dg;
    private String ycc;
    private String ypw = "";
    private String xq = "";

    private void ycc() {
        this.ypw = "";
        this.xq = "";
        this.dg = 0;
        this.bw = 0;
    }

    public int bw() {
        return this.bw;
    }

    public int dg() {
        return this.dg;
    }

    public String emc() {
        return this.ycc;
    }

    public String xq() {
        return this.xq;
    }

    public String ypw() {
        return this.ypw;
    }

    public static void xq(int i) {
        sb sbVar;
        if (i == 0) {
            return;
        }
        if (emc == null) {
            emc = new ConcurrentHashMap<>();
        }
        if (!emc.containsKey(Integer.valueOf(i)) || (sbVar = emc.get(Integer.valueOf(i))) == null) {
            return;
        }
        sbVar.ypw(1);
    }

    public void emc(int i) {
        this.dg = i;
    }

    public void ypw(int i) {
        this.bw = i;
    }

    public static void ypw(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        if (rieVar == null || TextUtils.isEmpty(rieVar.wdp())) {
            return;
        }
        int iTx = rieVar.tx();
        Integer numValueOf = Integer.valueOf(iTx);
        if (iTx == 0) {
            return;
        }
        if (emc == null) {
            emc = new ConcurrentHashMap<>();
        }
        sb sbVar = emc.containsKey(numValueOf) ? emc.get(numValueOf) : null;
        if (sbVar == null) {
            sbVar = new sb();
        }
        String strLvs = rieVar.lvs();
        if (TextUtils.isEmpty(strLvs) || !strLvs.equals(sbVar.emc())) {
            sbVar.ycc();
            sbVar.emc(rieVar);
            emc.put(numValueOf, sbVar);
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        if (rieVar != null) {
            String strLvs = rieVar.lvs();
            if (!TextUtils.isEmpty(strLvs)) {
                this.ycc = strLvs;
            }
            String strXst = rieVar.xst();
            if (TextUtils.isEmpty(strXst) && rieVar.ak()) {
                strXst = rieVar.qio().zz();
            }
            if (!TextUtils.isEmpty(strXst)) {
                String[] strArrSplit = strXst.split("/");
                if (strArrSplit.length >= 3) {
                    this.ypw = strArrSplit[2];
                }
            }
            if (rieVar.mjd() == null || TextUtils.isEmpty(rieVar.mjd().xq())) {
                return;
            }
            this.xq = rieVar.mjd().xq();
        }
    }

    public static void xq(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        sb sbVar;
        if (rieVar == null) {
            return;
        }
        int iTx = rieVar.tx();
        Integer numValueOf = Integer.valueOf(iTx);
        if (iTx == 0) {
            return;
        }
        if (emc == null) {
            emc = new ConcurrentHashMap<>();
        }
        if (!emc.containsKey(numValueOf) || (sbVar = emc.get(numValueOf)) == null) {
            return;
        }
        sbVar.emc(1);
    }
}
