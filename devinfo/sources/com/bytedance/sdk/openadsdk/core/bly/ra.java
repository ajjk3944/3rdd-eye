package com.bytedance.sdk.openadsdk.core.bly;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.f1;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.fak;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import w8.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra {

    /* renamed from: lh, reason: collision with root package name */
    final Context f8086lh;
    public AdSlot ouw;
    com.bytedance.sdk.openadsdk.core.model.vpp pno;
    public PAGBannerAdLoadListener yu;
    public final AtomicBoolean fkw = new AtomicBoolean(false);

    /* renamed from: le, reason: collision with root package name */
    public int f8085le = 5;
    public final fak ra = fak.vt();
    public final com.bytedance.sdk.openadsdk.core.vpp vt = com.bytedance.sdk.openadsdk.core.zih.lh();

    public ra(Context context) {
        if (context != null) {
            this.f8086lh = context.getApplicationContext();
        } else {
            this.f8086lh = com.bytedance.sdk.openadsdk.core.zih.ouw();
        }
    }

    public final void ouw(int i4, String str) {
        PAGBannerAdLoadListener pAGBannerAdLoadListener;
        if (!this.fkw.getAndSet(false) || (pAGBannerAdLoadListener = this.yu) == null) {
            return;
        }
        pAGBannerAdLoadListener.onError(i4, str);
    }

    public static /* synthetic */ void ouw(ra raVar, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar, AdSlot adSlot) {
        c cVar;
        List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar.yu;
        if (list != null && !list.isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar = ouwVar.ryl;
            raVar.pno = vppVar;
            for (com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 : vppVar.vm.yu) {
                if (com.bytedance.sdk.openadsdk.core.model.vpp.fkw(vppVar2) && (cVar = vppVar2.f8309sd) != null && cVar.g != null) {
                    int iFqk = vppVar2.fqk();
                    com.bytedance.sdk.openadsdk.core.zih.yu();
                    if (com.bytedance.sdk.openadsdk.core.settings.cf.yu(String.valueOf(iFqk)) && com.bytedance.sdk.openadsdk.core.zih.yu().od()) {
                        com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = com.bytedance.sdk.openadsdk.core.model.vpp.ouw(((f1) CacheDirFactory.getICacheDir(vppVar2.sm)).E(), vppVar2);
                        vtVarOuw.ouw("material_meta", vppVar2);
                        vtVarOuw.ouw("ad_slot", adSlot);
                        com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw, (a) null);
                    }
                }
            }
            if (com.bytedance.sdk.component.utils.ko.yu()) {
                Log.e("ExpressAdLoadManager", "onAdLoad: net work response duration = " + raVar.ra.lh() + "run in  " + Thread.currentThread().getName());
            }
            if (raVar.fkw.getAndSet(false)) {
                bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.ra.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        int width;
                        int height;
                        List<com.bytedance.sdk.openadsdk.core.model.vpp> list2;
                        final JSONObject jSONObject;
                        final long jElapsedRealtime = SystemClock.elapsedRealtime();
                        final ra raVar2 = ra.this;
                        com.bytedance.sdk.openadsdk.core.model.vpp vppVar3 = raVar2.pno;
                        if (vppVar3 == null || raVar2.yu == null) {
                            return;
                        }
                        PAGBannerSize pAGBannerSize = vppVar3.bfk;
                        float fMin = Math.min(raVar2.ouw.getExpressViewAcceptedHeight(), 250.0f);
                        if (pAGBannerSize != null) {
                            width = pAGBannerSize.getWidth();
                            height = pAGBannerSize.getHeight();
                        } else {
                            width = 0;
                            height = 0;
                        }
                        float expressViewAcceptedWidth = width > 0 ? width : raVar2.ouw.getExpressViewAcceptedWidth();
                        if (height > 0) {
                            fMin = height;
                        }
                        raVar2.ouw.setExpressViewAccepted(expressViewAcceptedWidth, fMin);
                        com.bytedance.sdk.openadsdk.core.yu.ra raVar3 = new com.bytedance.sdk.openadsdk.core.yu.ra(raVar2.f8086lh, vppVar3, raVar2.ouw);
                        final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        final long jLh = raVar2.ra.lh();
                        if (!TextUtils.isEmpty(raVar2.ouw.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.rn.lh.ouw(vppVar3, jLh);
                        }
                        raVar2.yu.onAdLoaded(raVar3);
                        try {
                            if (com.bytedance.sdk.openadsdk.core.zih.yu().jae() && com.bytedance.sdk.openadsdk.vpp.ouw.lh() && raVar2.f8085le == 1 && (list2 = vppVar3.vm.yu) != null && !list2.isEmpty() && (jSONObject = vppVar3.vm.ra) != null) {
                                com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar3, jSONObject.optString("tag", ""), "load_ad_time", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.core.bly.ra.4
                                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                                    public final JSONObject lh() {
                                        try {
                                            long jOptLong = jSONObject.optLong("callback_start", 0L);
                                            long j = jElapsedRealtime;
                                            long j8 = j - jOptLong;
                                            long j9 = jElapsedRealtime2 - j;
                                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extra_data");
                                            if (jSONObjectOptJSONObject == null) {
                                                jSONObjectOptJSONObject = new JSONObject();
                                            }
                                            jSONObjectOptJSONObject.put("thread_dispatch_duration", j8);
                                            jSONObjectOptJSONObject.put("build_banner_ad_duration", j9);
                                            jSONObjectOptJSONObject.put("ad_load_duration_full", jLh);
                                            return jSONObjectOptJSONObject;
                                        } catch (Throwable unused) {
                                            return null;
                                        }
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                                    public final JSONObject vt() {
                                        JSONObject jSONObject2 = new JSONObject();
                                        try {
                                            jSONObject2.put("duration", jSONObject.optLong("duration", 0L));
                                        } catch (Throwable unused) {
                                        }
                                        return jSONObject2;
                                    }
                                });
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
                return;
            }
            return;
        }
        raVar.ouw(-3, com.bytedance.sdk.openadsdk.core.pno.ouw(-3));
        lhVar.vt = -3;
        lhVar.ra = 8;
        com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
    }
}
