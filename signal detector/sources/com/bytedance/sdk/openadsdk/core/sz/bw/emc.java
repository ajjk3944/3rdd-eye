package com.bytedance.sdk.openadsdk.core.sz.bw;

import K1.a;
import K1.b;
import S4.r;
import android.os.SystemClock;
import android.text.TextUtils;
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
import com.bytedance.sdk.openadsdk.vk.xq;

/* loaded from: classes.dex */
public class emc {
    public static final b emc = new r(3);

    private static boolean emc(com.bykv.vk.openvk.emc.emc.emc.xq.b bVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void xq(com.bykv.vk.openvk.emc.emc.emc.xq.b bVar, rie rieVar, AdSlot adSlot) {
        if (emc(bVar)) {
            com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVarEmc = com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(rieVar, (String) null, -1, bVar);
            emcVarEmc.emc(new zz(bVar.vk(), bVar.ycc()));
            com.bytedance.sdk.openadsdk.dg.bw.emc.emc.ypw(emcVarEmc);
        }
    }

    private static void ypw(com.bykv.vk.openvk.emc.emc.emc.xq.b bVar, rie rieVar, AdSlot adSlot) {
        if (emc(bVar)) {
            long jSup = bVar.sz() ? bVar.sup() : bVar.ycc();
            com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVarEmc = com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(rieVar, (String) null, -1, bVar);
            emcVarEmc.emc(new gbl(bVar.vk(), jSup));
            xq.emc("load_video_start", emcVarEmc);
        }
    }

    public static void emc(final com.bykv.vk.openvk.emc.emc.emc.xq.b bVar, final a aVar) {
        rie rieVar;
        AdSlot adSlot;
        if ((bVar.ycc() > 0 || bVar.sz()) && bVar.sba() != -2) {
            if (bVar.sba() != 1) {
                bVar.bw(6000);
                bVar.ycc(6000);
                bVar.uym(6000);
                boolean z6 = bVar.bw("material_meta") != null && (bVar.bw("material_meta") instanceof rie);
                boolean z7 = bVar.bw("ad_slot") != null && (bVar.bw("ad_slot") instanceof AdSlot);
                if (z6 && z7) {
                    rie rieVar2 = (rie) bVar.bw("material_meta");
                    AdSlot adSlot2 = (AdSlot) bVar.bw("ad_slot");
                    ypw(bVar, rieVar2, adSlot2);
                    rieVar = rieVar2;
                    adSlot = adSlot2;
                } else {
                    rieVar = null;
                    adSlot = null;
                }
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                final AdSlot adSlot3 = adSlot;
                final rie rieVar3 = rieVar;
                final a aVar2 = new a() { // from class: com.bytedance.sdk.openadsdk.core.sz.bw.emc.1
                    @Override // K1.a
                    public void emc(com.bykv.vk.openvk.emc.emc.emc.xq.b bVar2, int i) {
                        a aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.emc(bVar2, i);
                        }
                        if (rieVar3 == null || adSlot3 == null) {
                            return;
                        }
                        emc.ypw(bVar, rieVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime);
                    }

                    @Override // K1.a
                    public void ypw(com.bykv.vk.openvk.emc.emc.emc.xq.b bVar2, int i) {
                        AdSlot adSlot4;
                        a aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.emc(bVar2, i);
                        }
                        rie rieVar4 = rieVar3;
                        if (rieVar4 != null && (adSlot4 = adSlot3) != null) {
                            emc.xq(bVar, rieVar4, adSlot4);
                        }
                        bVar.aa();
                    }

                    @Override // K1.a
                    public void emc(com.bykv.vk.openvk.emc.emc.emc.xq.b bVar2, int i, String str) {
                        a aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.emc(bVar2, i, str);
                        }
                        if (rieVar3 == null || adSlot3 == null) {
                            return;
                        }
                        emc.ypw(bVar, rieVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime, i, str);
                    }
                };
                if (!emc(bVar.vk())) {
                    if (aVar != null) {
                        aVar.emc(bVar, TTAdConstant.DEEPLINK_FALLBACK_CODE, "unexpected url: " + bVar.vk());
                    }
                    ypw(bVar, rieVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime, -1, "video url is invalid");
                    return;
                }
                msw mswVar = new msw("VideoPreload") { // from class: com.bytedance.sdk.openadsdk.core.sz.bw.emc.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            ((r) emc.emc).g(aa.emc(), bVar, aVar2);
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
        if (aVar != null) {
            aVar.emc(bVar, 100);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ypw(com.bykv.vk.openvk.emc.emc.emc.xq.b bVar, rie rieVar, AdSlot adSlot, long j6, int i, String str) {
        if (emc(bVar)) {
            com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVarEmc = com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(rieVar, (String) null, -1, bVar);
            ru ruVar = new ru();
            ruVar.emc(bVar.vk());
            ruVar.emc(bVar.ycc());
            ruVar.ypw(j6);
            ruVar.emc(i);
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
    public static void ypw(com.bykv.vk.openvk.emc.emc.emc.xq.b bVar, rie rieVar, AdSlot adSlot, long j6) {
        if (emc(bVar)) {
            com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVarEmc = com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(rieVar, (String) null, -1, bVar);
            sup supVar = new sup();
            supVar.emc(bVar.vk());
            supVar.emc(bVar.ycc());
            supVar.ypw(j6);
            if (bVar.sra() == 1) {
                supVar.xq(1L);
            } else {
                supVar.xq(0L);
            }
            emcVarEmc.emc(supVar);
            xq.emc("load_video_success", emcVarEmc);
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
