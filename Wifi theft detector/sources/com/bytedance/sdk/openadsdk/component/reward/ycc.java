package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.sb;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.ee;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sra;
import com.bytedance.sdk.openadsdk.core.sz.xq.emc;
import com.bytedance.sdk.openadsdk.core.ylm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import r2.b;

/* loaded from: classes.dex */
public class ycc {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile ycc emc;
    private com.bytedance.sdk.component.msw.msw bw;
    private final Context ypw;
    private final AtomicBoolean xq = new AtomicBoolean(false);
    private final List<xq> dg = Collections.synchronizedList(new ArrayList());
    private final sb.emc ycc = new sb.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.ycc.2
        @Override // com.bytedance.sdk.component.utils.sb.emc
        public void emc(Context context, Intent intent, boolean z10, int i10) {
            if (z10) {
                if (ycc.this.bw == null) {
                    ycc yccVar = ycc.this;
                    yccVar.bw = new com.bytedance.sdk.openadsdk.component.reward.xq("fsv net connect task", yccVar.dg);
                }
                com.bytedance.sdk.component.utils.zz.emc().post(ycc.this.bw);
            }
        }
    };

    public static class emc implements PAGInterstitialAdLoadListener {
        private final boolean bw;
        private final PAGInterstitialAdLoadListener dg;
        private final Context emc;
        private final com.bytedance.sdk.openadsdk.core.model.emc xq;
        private final AdSlot ypw;

        public emc(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.emc emcVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, boolean z10) {
            this.emc = context;
            this.ypw = adSlot;
            this.xq = emcVar;
            this.dg = pAGInterstitialAdLoadListener;
            this.bw = z10;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            ycc.emc(this.emc).emc(this.ypw, this.xq, this.dg, pAGInterstitialAd, this.bw);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.uym
        public void onError(int i10, String str) {
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = this.dg;
            if (pAGInterstitialAdLoadListener != null) {
                pAGInterstitialAdLoadListener.onError(i10, str);
            }
        }
    }

    public static class xq extends com.bytedance.sdk.component.msw.msw {
        final rie emc;
        final com.bytedance.sdk.openadsdk.core.model.emc xq;
        final AdSlot ypw;

        public xq(rie rieVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
            super("Fullscreen Task");
            this.emc = rieVar;
            this.ypw = adSlot;
            this.xq = emcVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            rie rieVar = this.emc;
            if (rieVar == null || rieVar.iat() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVarEmc = rie.emc(CacheDirFactory.getICacheDir(this.emc.zxw()).emc(), this.emc);
            ypwVarEmc.emc("material_meta", this.emc);
            ypwVarEmc.emc("ad_slot", this.ypw);
            com.bytedance.sdk.openadsdk.core.sz.bw.emc.emc(ypwVarEmc, new b() { // from class: com.bytedance.sdk.openadsdk.component.reward.ycc.xq.1
                @Override // r2.a.InterfaceC0474a
                public void emc(com.bykv.vk.openvk.emc.emc.emc.xq.xq xqVar, int i10, String str) {
                }

                @Override // r2.a.InterfaceC0474a
                public void emc(com.bykv.vk.openvk.emc.emc.emc.xq.xq xqVar, int i10) {
                    bw bwVarEmc = bw.emc(com.bytedance.sdk.openadsdk.core.aa.emc());
                    xq xqVar2 = xq.this;
                    bwVarEmc.emc(xqVar2.ypw, xqVar2.xq);
                }
            });
        }
    }

    public static class ypw implements PAGInterstitialAdLoadListener {
        private final com.bytedance.sdk.openadsdk.core.model.emc dg;
        private final PAGInterstitialAdLoadListener emc;
        private final AtomicInteger xq;
        private final AtomicBoolean ypw;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.uym
        public void onError(int i10, String str) {
            if (this.xq.decrementAndGet() > 0 || !this.ypw.compareAndSet(false, true)) {
                return;
            }
            this.emc.onError(i10, str);
            com.bytedance.sdk.openadsdk.vk.xq.emc("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ycc.ypw.1
                @Override // com.bytedance.sdk.openadsdk.vk.ypw
                @Nullable
                public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", ypw.this.dg.ypw());
                    return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc("choose_ad_load_error").ypw(jSONObject.toString());
                }
            });
        }

        private ypw(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
            this.ypw = new AtomicBoolean(false);
            this.emc = pAGInterstitialAdLoadListener;
            this.dg = emcVar;
            this.xq = new AtomicInteger(emc());
        }

        private int emc() {
            if (!this.dg.bw()) {
                return 0;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.dg.dg().size(); i11++) {
                rie rieVar = this.dg.dg().get(i11);
                if (rieVar != null && !dr.xq(rieVar) && rieVar.iat() != null) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            this.xq.decrementAndGet();
            if (this.emc == null || !this.ypw.compareAndSet(false, true)) {
                return;
            }
            this.emc.onAdLoaded(pAGInterstitialAd);
        }
    }

    private ycc(Context context) {
        this.ypw = context == null ? com.bytedance.sdk.openadsdk.core.aa.emc() : context.getApplicationContext();
        ypw();
    }

    private void dg(final AdSlot adSlot, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.model.sb sbVar = new com.bytedance.sdk.openadsdk.core.model.sb();
        sbVar.xq = 1;
        if (com.bytedance.sdk.openadsdk.core.aa.dg().sup(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            sbVar.zz = 2;
        }
        com.bytedance.sdk.openadsdk.core.aa.xq().emc(adSlot, sbVar, 8, new sra.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.ycc.8
            @Override // com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(int i10, String str) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(i10, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
                com.bytedance.sdk.openadsdk.core.model.emc emcVar2;
                if (emcVar.dg() != null && !emcVar.dg().isEmpty()) {
                    sba sbaVar = new sba(ycc.this.ypw, emcVar);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.ylm.emc.dg.emc().emc(emcVar.dg().isEmpty() ? null : emcVar.dg().get(0));
                        com.bytedance.sdk.openadsdk.vk.xq.emc(emcVar.ycc(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (pAGInterstitialAdLoadListener == null || com.bytedance.sdk.openadsdk.core.aa.dg().sf() != 0) {
                        emcVar2 = emcVar;
                    } else {
                        ycc.this.emc(adSlot, emcVar, pAGInterstitialAdLoadListener, (PAGInterstitialAd) sbaVar.emc(), false);
                        emcVar2 = emcVar;
                    }
                    ycc.this.emc(emcVar2, sbaVar, adSlot, false, pAGInterstitialAdLoadListener);
                    return;
                }
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.msw.emc(-3));
                    xqVar.emc(-3);
                    xqVar.xq(5);
                    com.bytedance.sdk.openadsdk.core.model.xq.emc(xqVar);
                }
            }
        });
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.bw != null) {
            try {
                com.bytedance.sdk.component.utils.zz.emc().removeCallbacks(this.bw);
            } catch (Exception unused) {
            }
            this.bw = null;
        }
        xq();
    }

    private void xq(final AdSlot adSlot) {
        if (bw.emc(this.ypw).ypw(adSlot.getCodeId(), false) != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.sb sbVar = new com.bytedance.sdk.openadsdk.core.model.sb();
        sbVar.xq = 2;
        if (com.bytedance.sdk.openadsdk.core.aa.dg().sup(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            sbVar.zz = 2;
        }
        com.bytedance.sdk.openadsdk.core.aa.xq().emc(adSlot, sbVar, 8, new sra.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.ycc.3
            @Override // com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(int i10, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
                if (emcVar.dg() == null || emcVar.dg().isEmpty()) {
                    return;
                }
                ycc.this.emc(emcVar, new sba(ycc.this.ypw, emcVar), adSlot, true, (PAGInterstitialAdLoadListener) null);
            }
        });
    }

    private void ypw(final AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.model.sb sbVar = new com.bytedance.sdk.openadsdk.core.model.sb();
        sbVar.xq = 2;
        if (com.bytedance.sdk.openadsdk.core.aa.dg().sup(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            sbVar.zz = 2;
        }
        com.bytedance.sdk.openadsdk.core.aa.xq().emc(adSlot, sbVar, 8, (com.bytedance.sdk.openadsdk.core.ul) new ylm() { // from class: com.bytedance.sdk.openadsdk.component.reward.ycc.1
            boolean emc = false;

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(int i10, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.ul
            public String emc() {
                return bw.emc(ycc.this.ypw).emc(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.ul
            public boolean emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
                boolean zEmc = bw.emc(ycc.this.ypw).emc(emcVar);
                this.emc = zEmc;
                return zEmc;
            }

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
                if (this.emc || emcVar.dg() == null || emcVar.dg().isEmpty()) {
                    return;
                }
                ycc.this.emc(emcVar, new sba(ycc.this.ypw, emcVar), adSlot, true, (PAGInterstitialAdLoadListener) null);
            }
        });
    }

    public static ycc emc(Context context) {
        if (emc == null) {
            synchronized (ycc.class) {
                try {
                    if (emc == null) {
                        emc = new ycc(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dg(AdSlot adSlot) {
        bw.emc(this.ypw).emc(adSlot.getCodeId());
    }

    private void ypw(final AdSlot adSlot, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.model.sb sbVar = new com.bytedance.sdk.openadsdk.core.model.sb();
        sbVar.xq = 1;
        if (com.bytedance.sdk.openadsdk.core.aa.dg().sup(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            sbVar.zz = 2;
        }
        com.bytedance.sdk.openadsdk.core.aa.xq().emc(adSlot, sbVar, 8, (com.bytedance.sdk.openadsdk.core.ul) new ylm() { // from class: com.bytedance.sdk.openadsdk.component.reward.ycc.4
            boolean emc = false;

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(int i10, String str) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(i10, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
                com.bytedance.sdk.openadsdk.core.model.emc emcVar2;
                if (emcVar.dg() != null && !emcVar.dg().isEmpty()) {
                    sba sbaVar = new sba(ycc.this.ypw, emcVar);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.ylm.emc.dg.emc().emc(emcVar.dg().isEmpty() ? null : emcVar.dg().get(0));
                        com.bytedance.sdk.openadsdk.vk.xq.emc(emcVar.ycc(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (pAGInterstitialAdLoadListener == null || com.bytedance.sdk.openadsdk.core.aa.dg().sf() != 0) {
                        emcVar2 = emcVar;
                    } else {
                        ycc.this.emc(adSlot, emcVar, pAGInterstitialAdLoadListener, sbaVar.emc(), this.emc);
                        emcVar2 = emcVar;
                    }
                    ycc.this.emc(emcVar2, sbaVar, adSlot, false, pAGInterstitialAdLoadListener);
                    return;
                }
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.msw.emc(-3));
                    xqVar.emc(-3);
                    xqVar.xq(5);
                    com.bytedance.sdk.openadsdk.core.model.xq.emc(xqVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.ul
            public String emc() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strEmc = bw.emc(ycc.this.ypw).emc(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(strEmc)) {
                    return null;
                }
                return strEmc;
            }

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.ul
            public boolean emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
                boolean zEmc = bw.emc(ycc.this.ypw).emc(emcVar);
                this.emc = zEmc;
                return zEmc;
            }
        });
    }

    private void xq(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        com.bytedance.sdk.openadsdk.core.model.emc emcVarYpw;
        if (TextUtils.isEmpty(adSlot.getBidAdm()) && (emcVarYpw = bw.emc(this.ypw).ypw(adSlot.getCodeId(), true)) != null && emcVarYpw.bw()) {
            emc(adSlot, emcVarYpw, pAGInterstitialAdLoadListener);
        } else {
            dg(adSlot, pAGInterstitialAdLoadListener);
        }
    }

    public void emc() {
        try {
            bw.emc(this.ypw).emc();
        } catch (Throwable unused) {
        }
    }

    public void emc(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
            ypw(adSlot);
        } else {
            xq(adSlot);
        }
    }

    private void xq() {
        if (this.xq.get()) {
            this.xq.set(false);
            try {
                sb.emc(this.ycc);
            } catch (Exception unused) {
            }
        }
    }

    private void ypw() {
        if (this.xq.get()) {
            return;
        }
        this.xq.set(true);
        sb.emc(this.ycc, this.ypw);
    }

    public void emc(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
            ypw(adSlot, pAGInterstitialAdLoadListener);
        } else {
            xq(adSlot, pAGInterstitialAdLoadListener);
        }
    }

    private void emc(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.emc emcVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        com.bytedance.sdk.openadsdk.core.model.emc emcVar2;
        ycc yccVar;
        AdSlot adSlot2;
        com.bytedance.sdk.openadsdk.core.model.emc emcVar3;
        PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2;
        rie rieVarYcc = emcVar.ycc();
        for (rie rieVar : emcVar.dg()) {
            if (rieVar.vaf() == null) {
                rieVar.emc(adSlot);
            }
        }
        sba sbaVar = new sba(this.ypw, emcVar);
        if (!dr.xq(rieVarYcc)) {
            sbaVar.ypw();
        }
        if (pAGInterstitialAdLoadListener != null) {
            com.bytedance.sdk.openadsdk.core.sup.xq.dg.emc(emcVar);
            if (com.bytedance.sdk.openadsdk.core.aa.dg().sf() == 0) {
                yccVar = this;
                adSlot2 = adSlot;
                emcVar3 = emcVar;
                pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                yccVar.emc(adSlot2, emcVar3, pAGInterstitialAdLoadListener2, (PAGInterstitialAd) sbaVar.emc(), true);
            } else {
                yccVar = this;
                adSlot2 = adSlot;
                emcVar3 = emcVar;
                pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
            }
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener3 = pAGInterstitialAdLoadListener2;
            AdSlot adSlot3 = adSlot2;
            com.bytedance.sdk.openadsdk.core.model.emc emcVar4 = emcVar3;
            emcVar2 = emcVar4;
            ypw ypwVar = new ypw(new emc(yccVar.ypw, adSlot3, emcVar4, pAGInterstitialAdLoadListener3, true), emcVar2);
            for (int i10 = 0; i10 < emcVar2.dg().size(); i10++) {
                emc(emcVar2.dg().get(i10), adSlot3, ypwVar, sbaVar);
                if (emcVar2.ru()) {
                    break;
                }
            }
        } else {
            emcVar2 = emcVar;
        }
        for (int i11 = 0; i11 < emcVar2.dg().size(); i11++) {
            com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc().emc(emcVar2.dg().get(i11), new emc.InterfaceC0163emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.ycc.5
                @Override // com.bytedance.sdk.openadsdk.core.sz.xq.emc.InterfaceC0163emc
                public void emc(boolean z10) {
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.emc emcVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, PAGInterstitialAd pAGInterstitialAd, final boolean z10) {
        com.bytedance.sdk.openadsdk.core.qh.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ycc.6
            @Override // java.lang.Runnable
            public void run() {
                if (z10) {
                    ycc.this.dg(adSlot);
                } else {
                    bw.emc(ycc.this.ypw).emc(adSlot, emcVar);
                    ycc.this.dg(adSlot);
                }
            }
        });
        if (pAGInterstitialAdLoadListener != null) {
            pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void emc(com.bytedance.sdk.openadsdk.core.model.rie r4, com.bytedance.sdk.openadsdk.AdSlot r5, final com.bytedance.sdk.openadsdk.component.reward.ycc.ypw r6, final com.bytedance.sdk.openadsdk.component.reward.sba r7) {
        /*
            r3 = this;
            r0 = 0
            if (r6 == 0) goto Lf
            com.bytedance.sdk.openadsdk.core.settings.gbl r1 = com.bytedance.sdk.openadsdk.core.aa.dg()
            int r1 = r1.sf()
            r2 = 1
            if (r1 != r2) goto Lf
            goto L10
        Lf:
            r2 = r0
        L10:
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.dr.xq(r4)
            if (r1 != 0) goto L3f
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.rie.bw(r4)
            if (r1 == 0) goto L3f
            int r1 = r4.zxw()
            t2.b r1 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r1)
            java.lang.String r1 = r1.emc()
            com.bytedance.sdk.openadsdk.core.sz.emc.ypw r1 = com.bytedance.sdk.openadsdk.core.model.rie.emc(r1, r4)
            java.lang.String r2 = "material_meta"
            r1.emc(r2, r4)
            java.lang.String r4 = "ad_slot"
            r1.emc(r4, r5)
            com.bytedance.sdk.openadsdk.component.reward.ycc$7 r4 = new com.bytedance.sdk.openadsdk.component.reward.ycc$7
            r4.<init>()
            com.bytedance.sdk.openadsdk.core.sz.bw.emc.emc(r1, r4)
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 == 0) goto L49
            com.bytedance.sdk.openadsdk.component.reward.msw r4 = r7.emc()
            r6.onAdLoaded(r4)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ycc.emc(com.bytedance.sdk.openadsdk.core.model.rie, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.component.reward.ycc$ypw, com.bytedance.sdk.openadsdk.component.reward.sba):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, sba sbaVar, AdSlot adSlot, boolean z10, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        if (!z10) {
            com.bytedance.sdk.openadsdk.qh.emc.emc().emc(emcVar.ycc());
        }
        AdSlot adSlot2 = adSlot;
        ypw ypwVar = new ypw(new emc(this.ypw, adSlot2, emcVar, pAGInterstitialAdLoadListener, false), emcVar);
        emc(emcVar);
        int i10 = 0;
        while (i10 < emcVar.dg().size()) {
            rie rieVar = emcVar.dg().get(i10);
            int iFu = rieVar.fu();
            if (i10 == 0 && iFu == 43) {
                rieVar.iat().F(0);
            }
            sba sbaVar2 = sbaVar;
            boolean z11 = z10;
            AdSlot adSlot3 = adSlot2;
            emc(emcVar, rieVar, sbaVar2, adSlot3, z11, ypwVar);
            adSlot2 = adSlot3;
            if (emcVar.ru() && rieVar.fu() != 43) {
                return;
            }
            i10++;
            sbaVar = sbaVar2;
            z10 = z11;
        }
    }

    private void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        ee eeVarSup = emcVar.sup();
        int iVk = emcVar.ru() ? 10 : 1;
        if (eeVarSup != null) {
            iVk = eeVarSup.vk();
        }
        for (final int i10 = 0; i10 < emcVar.dg().size() && i10 < iVk; i10++) {
            com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc().emc(emcVar.dg().get(i10), new emc.InterfaceC0163emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.ycc.9
                @Override // com.bytedance.sdk.openadsdk.core.sz.xq.emc.InterfaceC0163emc
                public void emc(boolean z10) {
                    com.bytedance.sdk.component.utils.ul.emc("ScreenVideoLoadM", "onCachedResponse: i=" + i10 + ", isSuccess=" + z10);
                }
            });
        }
    }

    private void emc(final com.bytedance.sdk.openadsdk.core.model.emc emcVar, rie rieVar, sba sbaVar, final AdSlot adSlot, final boolean z10, ypw ypwVar) {
        final sba sbaVar2;
        final ypw ypwVar2;
        if (z10 && !dr.xq(rieVar) && rie.bw(rieVar) && com.bytedance.sdk.openadsdk.core.aa.dg().db(adSlot.getCodeId()).dg == 1 && !com.bytedance.sdk.component.utils.sba.dg(this.ypw)) {
            emc(new xq(rieVar, adSlot, emcVar));
            return;
        }
        boolean z11 = false;
        boolean z12 = ypwVar != null && com.bytedance.sdk.openadsdk.core.aa.dg().sf() == 1;
        if (dr.xq(rieVar)) {
            sbaVar2 = sbaVar;
            ypwVar2 = ypwVar;
            if (z10) {
                bw.emc(this.ypw).emc(adSlot, emcVar);
            }
        } else if (rie.bw(rieVar)) {
            if (rieVar.iat() != null) {
                com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVarEmc = rie.emc(CacheDirFactory.getICacheDir(rieVar.zxw()).emc(), rieVar);
                ypwVarEmc.emc("material_meta", rieVar);
                ypwVarEmc.emc("ad_slot", adSlot);
                sbaVar2 = sbaVar;
                ypwVar2 = ypwVar;
                com.bytedance.sdk.openadsdk.core.sz.bw.emc.emc(ypwVarEmc, new b() { // from class: com.bytedance.sdk.openadsdk.component.reward.ycc.10
                    @Override // r2.a.InterfaceC0474a
                    public void emc(com.bykv.vk.openvk.emc.emc.emc.xq.xq xqVar, int i10) {
                        sbaVar2.ypw();
                        if (z10) {
                            bw.emc(ycc.this.ypw).emc(adSlot, emcVar);
                        } else {
                            if (ypwVar2 == null || com.bytedance.sdk.openadsdk.core.aa.dg().sf() != 1) {
                                return;
                            }
                            ypwVar2.onAdLoaded(sbaVar2.emc());
                        }
                    }

                    @Override // r2.a.InterfaceC0474a
                    public void emc(com.bykv.vk.openvk.emc.emc.emc.xq.xq xqVar, int i10, String str) {
                        if (ypwVar2 == null || com.bytedance.sdk.openadsdk.core.aa.dg().sf() != 1) {
                            return;
                        }
                        ypwVar2.onError(i10, str);
                    }
                });
            } else {
                sbaVar2 = sbaVar;
                ypwVar2 = ypwVar;
                z11 = z12;
            }
            z12 = z11;
        } else {
            sbaVar2 = sbaVar;
            ypwVar2 = ypwVar;
            if (z10) {
                bw.emc(this.ypw).emc(adSlot, emcVar);
            }
        }
        if (z12) {
            ypwVar2.onAdLoaded(sbaVar2.emc());
        }
    }

    private void emc(xq xqVar) {
        if (xqVar == null) {
            return;
        }
        if (this.dg.size() > 0) {
            this.dg.remove(0);
        }
        this.dg.add(xqVar);
    }

    public void emc(String str, rie rieVar) {
        bw.emc(this.ypw).emc(str, rieVar);
    }
}
