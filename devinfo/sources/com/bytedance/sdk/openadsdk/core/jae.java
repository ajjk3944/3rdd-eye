package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class jae {
    public static ConcurrentHashMap<Integer, jae> ouw = new ConcurrentHashMap<>();
    int fkw;

    /* renamed from: le, reason: collision with root package name */
    private String f8181le;
    int yu;
    String vt = "";

    /* renamed from: lh, reason: collision with root package name */
    String f8182lh = "";

    public static void ouw(int i4) {
        jae jaeVar;
        if (i4 == 0) {
            return;
        }
        if (ouw == null) {
            ouw = new ConcurrentHashMap<>();
        }
        if (!ouw.containsKey(Integer.valueOf(i4)) || (jaeVar = ouw.get(Integer.valueOf(i4))) == null) {
            return;
        }
        jaeVar.fkw = 1;
    }

    public static void vt(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        jae jaeVar;
        if (vppVar == null) {
            return;
        }
        int iFqk = vppVar.fqk();
        Integer numValueOf = Integer.valueOf(iFqk);
        if (iFqk == 0) {
            return;
        }
        if (ouw == null) {
            ouw = new ConcurrentHashMap<>();
        }
        if (!ouw.containsKey(numValueOf) || (jaeVar = ouw.get(numValueOf)) == null) {
            return;
        }
        jaeVar.yu = 1;
    }

    public static void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (vppVar == null || TextUtils.isEmpty(vppVar.yhj)) {
            return;
        }
        int iFqk = vppVar.fqk();
        Integer numValueOf = Integer.valueOf(iFqk);
        if (iFqk == 0) {
            return;
        }
        if (ouw == null) {
            ouw = new ConcurrentHashMap<>();
        }
        jae jaeVar = ouw.containsKey(numValueOf) ? ouw.get(numValueOf) : null;
        if (jaeVar == null) {
            jaeVar = new jae();
        }
        String strUx = vppVar.ux();
        if (TextUtils.isEmpty(strUx) || !strUx.equals(jaeVar.f8181le)) {
            jaeVar.vt = "";
            jaeVar.f8182lh = "";
            jaeVar.yu = 0;
            jaeVar.fkw = 0;
            String strUx2 = vppVar.ux();
            if (!TextUtils.isEmpty(strUx2)) {
                jaeVar.f8181le = strUx2;
            }
            String strOuw = vppVar.osn;
            if (TextUtils.isEmpty(strOuw) && vppVar.cd()) {
                strOuw = vppVar.cu.ouw();
            }
            if (!TextUtils.isEmpty(strOuw)) {
                String[] strArrSplit = strOuw.split("/");
                if (strArrSplit.length >= 3) {
                    jaeVar.vt = strArrSplit[2];
                }
            }
            com.bytedance.sdk.openadsdk.core.model.le leVar = vppVar.wp;
            if (leVar != null && !TextUtils.isEmpty(leVar.f8244lh)) {
                jaeVar.f8182lh = vppVar.wp.f8244lh;
            }
            ouw.put(numValueOf, jaeVar);
        }
    }
}
