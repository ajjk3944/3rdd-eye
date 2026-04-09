package com.bytedance.sdk.openadsdk.core.zz;

import A2.C0115c;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.core.model.sb;
import com.bytedance.sdk.openadsdk.core.sra;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.mxo;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uym {
    private PAGBannerAdLoadListener dg;
    private AdSlot emc;
    private com.bytedance.sdk.openadsdk.core.model.rie msw;
    private final Context xq;
    private final AtomicBoolean bw = new AtomicBoolean(false);
    private int ycc = 5;
    private final mxo uym = mxo.xq();
    private final com.bytedance.sdk.openadsdk.core.sra ypw = com.bytedance.sdk.openadsdk.core.aa.xq();

    private uym(Context context) {
        if (context != null) {
            this.xq = context.getApplicationContext();
        } else {
            this.xq = com.bytedance.sdk.openadsdk.core.aa.emc();
        }
    }

    public static uym emc(Context context) {
        return new uym(context);
    }

    public void emc(AdSlot adSlot, int i, com.bytedance.sdk.openadsdk.common.uym uymVar) {
        this.uym.bw();
        if (this.bw.get()) {
            return;
        }
        this.ycc = i;
        this.bw.set(true);
        this.emc = adSlot;
        if (uymVar instanceof PAGBannerAdLoadListener) {
            this.dg = (PAGBannerAdLoadListener) uymVar;
        }
        emc(adSlot);
    }

    private void emc(final AdSlot adSlot) {
        if (adSlot == null) {
            return;
        }
        sb sbVar = new sb();
        sbVar.zz = 2;
        if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
            this.ypw.emc(adSlot, sbVar, this.ycc, (com.bytedance.sdk.openadsdk.core.ul) new com.bytedance.sdk.openadsdk.core.ylm() { // from class: com.bytedance.sdk.openadsdk.core.zz.uym.1
                @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
                public void emc(int i, String str) {
                    uym.this.emc(i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
                public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
                    uym.this.emc(emcVar, xqVar, adSlot);
                }
            });
        } else {
            this.ypw.emc(adSlot, sbVar, this.ycc, new sra.emc() { // from class: com.bytedance.sdk.openadsdk.core.zz.uym.2
                @Override // com.bytedance.sdk.openadsdk.core.sra.emc
                public void emc(int i, String str) {
                    uym.this.emc(i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.sra.emc
                public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
                    uym.this.emc(emcVar, xqVar, adSlot);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar, AdSlot adSlot) {
        if (emcVar.dg() != null && !emcVar.dg().isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.rie rieVarGbl = emcVar.gbl();
            this.msw = rieVarGbl;
            emc(rieVarGbl, adSlot);
            if (com.bytedance.sdk.component.utils.cf.dg()) {
                Log.e("ExpressAdLoadManager", "onAdLoad: net work response duration = " + this.uym.dg() + "run in  " + Thread.currentThread().getName());
            }
            if (this.bw.getAndSet(false)) {
                iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.uym.3
                    @Override // java.lang.Runnable
                    public void run() {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (uym.this.msw != null) {
                            uym uymVar = uym.this;
                            uymVar.emc(uymVar.msw, jElapsedRealtime);
                        }
                    }
                });
                return;
            }
            return;
        }
        emc(-3, com.bytedance.sdk.openadsdk.core.msw.emc(-3));
        xqVar.emc(-3);
        xqVar.xq(8);
        com.bytedance.sdk.openadsdk.core.model.xq.emc(xqVar);
    }

    private void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, AdSlot adSlot) {
        for (com.bytedance.sdk.openadsdk.core.model.rie rieVar2 : rieVar.ji()) {
            if (com.bytedance.sdk.openadsdk.core.model.rie.bw(rieVar2) && rieVar2.iat() != null && rieVar2.iat().f6586g != null) {
                if (com.bytedance.sdk.openadsdk.core.aa.dg().bw(String.valueOf(rieVar2.tx())) && com.bytedance.sdk.openadsdk.core.aa.dg().fu()) {
                    com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVarEmc = com.bytedance.sdk.openadsdk.core.model.rie.emc(((C0115c) CacheDirFactory.getICacheDir(rieVar2.zxw())).e(), rieVar2);
                    ypwVarEmc.emc("material_meta", rieVar2);
                    ypwVarEmc.emc("ad_slot", adSlot);
                    com.bytedance.sdk.openadsdk.core.sz.bw.emc.emc(ypwVarEmc, null);
                }
            }
        }
    }

    private PAGBannerAd emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        int width;
        int height;
        PAGBannerSize pAGBannerSizeFcw = rieVar.fcw();
        float fMin = Math.min(this.emc.getExpressViewAcceptedHeight(), 250.0f);
        if (pAGBannerSizeFcw != null) {
            width = pAGBannerSizeFcw.getWidth();
            height = pAGBannerSizeFcw.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        float expressViewAcceptedWidth = width > 0 ? width : this.emc.getExpressViewAcceptedWidth();
        if (height > 0) {
            fMin = height;
        }
        this.emc.setExpressViewAccepted(expressViewAcceptedWidth, fMin);
        return new com.bytedance.sdk.openadsdk.core.dg.uym(this.xq, rieVar, this.emc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, long j6) {
        if (this.dg != null) {
            PAGBannerAd pAGBannerAdEmc = emc(rieVar);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jDg = this.uym.dg();
            if (!TextUtils.isEmpty(this.emc.getBidAdm())) {
                com.bytedance.sdk.openadsdk.vk.xq.emc(rieVar, jDg);
            }
            this.dg.onAdLoaded(pAGBannerAdEmc);
            emc(rieVar, jDg, j6, jElapsedRealtime);
        }
    }

    private void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, final long j6, final long j7, final long j8) {
        try {
            if (!com.bytedance.sdk.openadsdk.core.aa.dg().cn() || !com.bytedance.sdk.openadsdk.sra.emc.dg() || this.ycc != 1 || rieVar == null || rieVar.ji() == null || rieVar.ji().isEmpty() || rieVar.dg().emc() == null) {
                return;
            }
            final JSONObject jSONObjectEmc = rieVar.dg().emc();
            com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), rieVar, jSONObjectEmc.optString("tag", ""), "load_ad_time", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.core.zz.uym.4
                @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                public JSONObject xq() {
                    try {
                        long jOptLong = jSONObjectEmc.optLong("callback_start", 0L);
                        long j9 = j7;
                        long j10 = j9 - jOptLong;
                        long j11 = j8 - j9;
                        JSONObject jSONObjectOptJSONObject = jSONObjectEmc.optJSONObject("extra_data");
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = new JSONObject();
                        }
                        jSONObjectOptJSONObject.put("thread_dispatch_duration", j10);
                        jSONObjectOptJSONObject.put("build_banner_ad_duration", j11);
                        jSONObjectOptJSONObject.put("ad_load_duration_full", j6);
                        return jSONObjectOptJSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                public JSONObject ypw() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", jSONObjectEmc.optLong("duration", 0L));
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(int i, String str) {
        PAGBannerAdLoadListener pAGBannerAdLoadListener;
        if (!this.bw.getAndSet(false) || (pAGBannerAdLoadListener = this.dg) == null) {
            return;
        }
        pAGBannerAdLoadListener.onError(i, str);
    }
}
