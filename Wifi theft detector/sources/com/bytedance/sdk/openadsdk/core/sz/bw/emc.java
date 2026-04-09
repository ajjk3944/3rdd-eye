package com.bytedance.sdk.openadsdk.core.sz.bw;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.emc.emc.emc.xq.xq;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.component.ypw.emc.uym;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.gbl;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.ru;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.sup;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.zz;
import com.bytedance.sdk.openadsdk.utils.iyl;
import r2.a;

/* loaded from: classes.dex */
public class emc {
    public static final a emc = new b3.a();

    private static boolean emc(xq xqVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void xq(xq xqVar, rie rieVar, AdSlot adSlot) {
        if (emc(xqVar)) {
            com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVarEmc = com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(rieVar, (String) null, -1, xqVar);
            emcVarEmc.emc(new zz(xqVar.vk(), xqVar.ycc()));
            com.bytedance.sdk.openadsdk.dg.bw.emc.emc.ypw(emcVarEmc);
        }
    }

    private static void ypw(xq xqVar, rie rieVar, AdSlot adSlot) {
        if (emc(xqVar)) {
            long jSup = xqVar.sz() ? xqVar.sup() : xqVar.ycc();
            com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVarEmc = com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(rieVar, (String) null, -1, xqVar);
            emcVarEmc.emc(new gbl(xqVar.vk(), jSup));
            com.bytedance.sdk.openadsdk.vk.xq.emc("load_video_start", emcVarEmc);
        }
    }

    public static void emc(final xq xqVar, final a.InterfaceC0474a interfaceC0474a) {
        rie rieVar;
        AdSlot adSlot;
        if ((xqVar.ycc() > 0 || xqVar.sz()) && xqVar.sba() != -2) {
            if (xqVar.sba() != 1) {
                xqVar.bw(6000);
                xqVar.ycc(6000);
                xqVar.uym(6000);
                boolean z10 = xqVar.bw("material_meta") != null && (xqVar.bw("material_meta") instanceof rie);
                boolean z11 = xqVar.bw("ad_slot") != null && (xqVar.bw("ad_slot") instanceof AdSlot);
                if (z10 && z11) {
                    rie rieVar2 = (rie) xqVar.bw("material_meta");
                    AdSlot adSlot2 = (AdSlot) xqVar.bw("ad_slot");
                    ypw(xqVar, rieVar2, adSlot2);
                    rieVar = rieVar2;
                    adSlot = adSlot2;
                } else {
                    rieVar = null;
                    adSlot = null;
                }
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                final AdSlot adSlot3 = adSlot;
                final rie rieVar3 = rieVar;
                final a.InterfaceC0474a interfaceC0474a2 = new a.InterfaceC0474a() { // from class: com.bytedance.sdk.openadsdk.core.sz.bw.emc.1
                    @Override // r2.a.InterfaceC0474a
                    public void emc(xq xqVar2, int i10) {
                        a.InterfaceC0474a interfaceC0474a3 = interfaceC0474a;
                        if (interfaceC0474a3 != null) {
                            interfaceC0474a3.emc(xqVar2, i10);
                        }
                        if (rieVar3 == null || adSlot3 == null) {
                            return;
                        }
                        emc.ypw(xqVar, rieVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime);
                    }

                    @Override // r2.a.InterfaceC0474a
                    public void ypw(xq xqVar2, int i10) {
                        AdSlot adSlot4;
                        a.InterfaceC0474a interfaceC0474a3 = interfaceC0474a;
                        if (interfaceC0474a3 != null) {
                            interfaceC0474a3.emc(xqVar2, i10);
                        }
                        rie rieVar4 = rieVar3;
                        if (rieVar4 != null && (adSlot4 = adSlot3) != null) {
                            emc.xq(xqVar, rieVar4, adSlot4);
                        }
                        xqVar.aa();
                    }

                    @Override // r2.a.InterfaceC0474a
                    public void emc(xq xqVar2, int i10, String str) {
                        a.InterfaceC0474a interfaceC0474a3 = interfaceC0474a;
                        if (interfaceC0474a3 != null) {
                            interfaceC0474a3.emc(xqVar2, i10, str);
                        }
                        if (rieVar3 == null || adSlot3 == null) {
                            return;
                        }
                        emc.ypw(xqVar, rieVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime, i10, str);
                    }
                };
                if (!emc(xqVar.vk())) {
                    if (interfaceC0474a != null) {
                        interfaceC0474a.emc(xqVar, TTAdConstant.DEEPLINK_FALLBACK_CODE, "unexpected url: " + xqVar.vk());
                    }
                    ypw(xqVar, rieVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime, -1, "video url is invalid");
                    return;
                }
                msw mswVar = new msw("VideoPreload") { // from class: com.bytedance.sdk.openadsdk.core.sz.bw.emc.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            emc.emc.a(aa.emc(), xqVar, interfaceC0474a2);
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                };
                if (iyl.ycc()) {
                    iyl.ypw(mswVar);
                    return;
                } else {
                    mswVar.run();
                    return;
                }
            }
        }
        if (interfaceC0474a != null) {
            interfaceC0474a.emc(xqVar, 100);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ypw(xq xqVar, rie rieVar, AdSlot adSlot, long j10, int i10, String str) {
        if (emc(xqVar)) {
            com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVarEmc = com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(rieVar, (String) null, -1, xqVar);
            ru ruVar = new ru();
            ruVar.emc(xqVar.vk());
            ruVar.emc(xqVar.ycc());
            ruVar.ypw(j10);
            ruVar.emc(i10);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            ruVar.ypw(str);
            ruVar.xq("");
            emcVarEmc.emc(ruVar);
            com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(emcVarEmc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ypw(xq xqVar, rie rieVar, AdSlot adSlot, long j10) {
        if (emc(xqVar)) {
            com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVarEmc = com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(rieVar, (String) null, -1, xqVar);
            sup supVar = new sup();
            supVar.emc(xqVar.vk());
            supVar.emc(xqVar.ycc());
            supVar.ypw(j10);
            if (xqVar.sra() == 1) {
                supVar.xq(1L);
            } else {
                supVar.xq(0L);
            }
            emcVarEmc.emc(supVar);
            com.bytedance.sdk.openadsdk.vk.xq.emc("load_video_success", emcVarEmc);
        }
    }

    public static boolean emc(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str2 = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str2 = "https:" + str.substring(4);
        } else {
            str2 = str;
        }
        return uym.xq(str2) != null;
    }
}
