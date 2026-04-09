package com.bytedance.sdk.openadsdk.core.mwh.fkw;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.a;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.vt.ouw.ra;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.rn.lh;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.bly;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.cf;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ryl;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.tlj;
import ec.y;
import w8.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public static final b ouw = new y(27);

    private static boolean ouw(a aVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vt(a aVar, vpp vppVar, long j, int i4, String str) {
        if (ouw(aVar)) {
            com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(vppVar, (String) null, aVar);
            tlj tljVar = new tlj();
            tljVar.ouw = aVar.pno();
            tljVar.vt = aVar.lh();
            tljVar.f8772lh = j;
            tljVar.yu = i4;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            tljVar.fkw = str;
            tljVar.f8771le = "";
            ouwVarOuw.f8768lh = tljVar;
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(ouwVarOuw);
        }
    }

    public static void ouw(final a aVar, final w8.a aVar2) {
        int i4;
        vpp vppVar;
        final AdSlot adSlot;
        if ((aVar.lh() > 0 || aVar.fkw()) && (i4 = aVar.rn) != -2) {
            if (i4 != 1) {
                aVar.vm = 6000;
                aVar.f6569th = 6000;
                aVar.qbp = 6000;
                boolean z3 = aVar.ouw("material_meta") != null && (aVar.ouw("material_meta") instanceof vpp);
                boolean z10 = aVar.ouw("ad_slot") != null && (aVar.ouw("ad_slot") instanceof AdSlot);
                if (z3 && z10) {
                    vppVar = (vpp) aVar.ouw("material_meta");
                    AdSlot adSlot2 = (AdSlot) aVar.ouw("ad_slot");
                    if (ouw(aVar)) {
                        long jYu = aVar.fkw() ? aVar.yu() : aVar.lh();
                        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(vppVar, (String) null, aVar);
                        ouwVarOuw.f8768lh = new cf(aVar.pno(), jYu);
                        lh.ouw("load_video_start", ouwVarOuw);
                    }
                    adSlot = adSlot2;
                } else {
                    vppVar = null;
                    adSlot = null;
                }
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                final vpp vppVar2 = vppVar;
                final w8.a aVar3 = new w8.a() { // from class: com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.1
                    @Override // w8.a
                    public final void ouw(a aVar4, int i10) {
                        w8.a aVar5 = aVar2;
                        if (aVar5 != null) {
                            aVar5.ouw(aVar4, i10);
                        }
                        if (vppVar2 == null || adSlot == null) {
                            return;
                        }
                        ouw.ouw(aVar, vppVar2, SystemClock.elapsedRealtime() - jElapsedRealtime);
                    }

                    @Override // w8.a
                    public final void vt(a aVar4, int i10) {
                        w8.a aVar5 = aVar2;
                        if (aVar5 != null) {
                            aVar5.ouw(aVar4, i10);
                        }
                        vpp vppVar3 = vppVar2;
                        if (vppVar3 != null && adSlot != null) {
                            ouw.ouw(aVar, vppVar3);
                        }
                        ko.vt("VideoPreloadUtils", "cancel: ", aVar.bly());
                    }

                    @Override // w8.a
                    public final void ouw(a aVar4, int i10, String str) {
                        w8.a aVar5 = aVar2;
                        if (aVar5 != null) {
                            aVar5.ouw(aVar4, i10, str);
                        }
                        if (vppVar2 == null || adSlot == null) {
                            return;
                        }
                        ouw.vt(aVar, vppVar2, SystemClock.elapsedRealtime() - jElapsedRealtime, i10, str);
                    }
                };
                String strPno = aVar.pno();
                if (!TextUtils.isEmpty(strPno)) {
                    if (strPno.regionMatches(true, 0, "ws:", 0, 3)) {
                        strPno = "http:" + strPno.substring(3);
                    } else if (strPno.regionMatches(true, 0, "wss:", 0, 4)) {
                        strPno = "https:" + strPno.substring(4);
                    }
                    if (ra.vt(strPno) != null) {
                        pno pnoVar = new pno("VideoPreload") { // from class: com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    ((y) ouw.ouw).g(zih.ouw(), aVar, aVar3);
                                } catch (Throwable th2) {
                                    ko.yu("VideoPreloadUtils", th2.getMessage());
                                }
                            }
                        };
                        if (bs.le()) {
                            bs.vt(pnoVar);
                            return;
                        } else {
                            pnoVar.run();
                            return;
                        }
                    }
                }
                if (aVar2 != null) {
                    aVar2.ouw(aVar, TTAdConstant.DEEPLINK_FALLBACK_CODE, "unexpected url: " + aVar.pno());
                }
                vt(aVar, vppVar2, SystemClock.elapsedRealtime() - jElapsedRealtime, -1, "video url is invalid");
                return;
            }
        }
        if (aVar2 != null) {
            aVar2.ouw(aVar, 100);
        }
    }

    public static /* synthetic */ void ouw(a aVar, vpp vppVar, long j) {
        if (ouw(aVar)) {
            com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(vppVar, (String) null, aVar);
            ryl rylVar = new ryl();
            rylVar.ouw = aVar.pno();
            rylVar.vt = aVar.lh();
            rylVar.f8770lh = j;
            if (aVar.zin == 1) {
                rylVar.yu = 1L;
            } else {
                rylVar.yu = 0L;
            }
            ouwVarOuw.f8768lh = rylVar;
            lh.ouw("load_video_success", ouwVarOuw);
        }
    }

    public static /* synthetic */ void ouw(a aVar, vpp vppVar) {
        if (ouw(aVar)) {
            com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(vppVar, (String) null, aVar);
            ouwVarOuw.f8768lh = new bly(aVar.pno(), aVar.lh());
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.vt(ouwVarOuw);
        }
    }
}
