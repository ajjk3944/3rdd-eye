package com.bytedance.sdk.openadsdk.component.reward;

import A2.C0115c;
import K1.c;
import N1.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bykv.vk.openvk.emc.emc.emc.xq.b;
import com.bytedance.sdk.component.utils.sb;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
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
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vk {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile vk emc;
    private com.bytedance.sdk.component.msw.msw bw;
    private final Context ypw;
    private final AtomicBoolean xq = new AtomicBoolean(false);
    private final List<ypw> dg = Collections.synchronizedList(new ArrayList());
    private final sb.emc ycc = new sb.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.vk.2
        @Override // com.bytedance.sdk.component.utils.sb.emc
        public void emc(Context context, Intent intent, boolean z6, int i) {
            if (z6) {
                if (vk.this.bw == null) {
                    vk vkVar = vk.this;
                    vkVar.bw = new com.bytedance.sdk.openadsdk.component.reward.xq("net connect task", vkVar.dg);
                }
                com.bytedance.sdk.component.utils.zz.emc().post(vk.this.bw);
            }
        }
    };

    public static class emc implements PAGRewardedAdLoadListener {
        private final boolean bw;
        private final PAGRewardedAdLoadListener dg;
        private final Context emc;
        private final com.bytedance.sdk.openadsdk.core.model.emc xq;
        private final AdSlot ypw;

        public emc(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.emc emcVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, boolean z6) {
            this.emc = context;
            this.ypw = adSlot;
            this.xq = emcVar;
            this.dg = pAGRewardedAdLoadListener;
            this.bw = z6;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            vk.emc(this.emc).emc(this.ypw, this.xq, this.dg, pAGRewardedAd, this.bw);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.uym
        public void onError(int i, String str) {
            PAGRewardedAdLoadListener pAGRewardedAdLoadListener = this.dg;
            if (pAGRewardedAdLoadListener != null) {
                pAGRewardedAdLoadListener.onError(i, str);
            }
        }
    }

    public static class xq implements PAGRewardedAdLoadListener {
        private final com.bytedance.sdk.openadsdk.core.model.emc dg;
        private final PAGRewardedAdLoadListener emc;
        private final AtomicInteger xq;
        private final AtomicBoolean ypw;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.uym
        public void onError(int i, String str) {
            if (this.xq.decrementAndGet() > 0 || this.emc == null || !this.ypw.compareAndSet(false, true)) {
                return;
            }
            this.emc.onError(i, str);
            com.bytedance.sdk.openadsdk.vk.xq.emc("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.component.reward.vk.xq.1
                @Override // com.bytedance.sdk.openadsdk.vk.ypw
                public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", xq.this.dg.ypw());
                    return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc("choose_ad_load_error").ypw(jSONObject.toString());
                }
            });
        }

        private xq(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
            this.ypw = new AtomicBoolean(false);
            this.emc = pAGRewardedAdLoadListener;
            this.dg = emcVar;
            this.xq = new AtomicInteger(emc());
        }

        private int emc() {
            if (!this.dg.bw()) {
                return 0;
            }
            int i = 0;
            for (int i3 = 0; i3 < this.dg.dg().size(); i3++) {
                rie rieVar = this.dg.dg().get(i3);
                if (rieVar != null && !dr.xq(rieVar) && rieVar.iat() != null) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            this.xq.decrementAndGet();
            if (this.emc == null || !this.ypw.compareAndSet(false, true)) {
                return;
            }
            this.emc.onAdLoaded(pAGRewardedAd);
        }
    }

    public static class ypw extends com.bytedance.sdk.component.msw.msw {
        final rie emc;
        final com.bytedance.sdk.openadsdk.core.model.emc xq;
        final AdSlot ypw;

        public ypw(rie rieVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
            super("Reward Task");
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
            com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVarEmc = rie.emc(((C0115c) CacheDirFactory.getICacheDir(this.emc.zxw())).b(), this.emc);
            ypwVarEmc.emc("material_meta", this.emc);
            ypwVarEmc.emc("ad_slot", this.ypw);
            com.bytedance.sdk.openadsdk.core.sz.bw.emc.emc(ypwVarEmc, new c() { // from class: com.bytedance.sdk.openadsdk.component.reward.vk.ypw.1
                @Override // K1.a
                public void emc(b bVar, int i, String str) {
                }

                @Override // K1.a
                public void emc(b bVar, int i) {
                    cf cfVarEmc = cf.emc(com.bytedance.sdk.openadsdk.core.aa.emc());
                    ypw ypwVar = ypw.this;
                    cfVarEmc.emc(ypwVar.ypw, ypwVar.xq);
                }
            });
        }
    }

    private vk(Context context) {
        this.ypw = context == null ? com.bytedance.sdk.openadsdk.core.aa.emc() : context.getApplicationContext();
        ypw();
    }

    private void dg(final AdSlot adSlot, final PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (com.bytedance.sdk.component.utils.cf.dg()) {
            a.a(adSlot.getBidAdm());
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.model.sb sbVar = new com.bytedance.sdk.openadsdk.core.model.sb();
        sbVar.ypw = 1;
        if (com.bytedance.sdk.openadsdk.core.aa.dg().sup(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            sbVar.zz = 2;
        }
        com.bytedance.sdk.openadsdk.core.aa.xq().emc(adSlot, sbVar, 7, new sra.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.vk.7
            @Override // com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(int i, String str) {
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
                com.bytedance.sdk.openadsdk.core.model.emc emcVar2;
                if (emcVar.dg() != null && !emcVar.dg().isEmpty()) {
                    yzg yzgVar = new yzg(vk.this.ypw, emcVar, adSlot);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.ylm.emc.dg.emc().emc(emcVar.dg().isEmpty() ? null : emcVar.dg().get(0));
                        com.bytedance.sdk.openadsdk.vk.xq.emc(emcVar.ycc(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (pAGRewardedAdLoadListener == null || com.bytedance.sdk.openadsdk.core.aa.dg().sf() != 0) {
                        emcVar2 = emcVar;
                    } else {
                        vk.this.emc(adSlot, emcVar, pAGRewardedAdLoadListener, (PAGRewardedAd) yzgVar.emc(), false);
                        emcVar2 = emcVar;
                    }
                    vk.this.emc(emcVar2, yzgVar, adSlot, false, pAGRewardedAdLoadListener);
                    return;
                }
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.msw.emc(-3));
                    xqVar.emc(-3);
                    xqVar.xq(6);
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
        if (cf.emc(this.ypw).ypw(adSlot.getCodeId(), false) != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.sb sbVar = new com.bytedance.sdk.openadsdk.core.model.sb();
        sbVar.ypw = 2;
        if (com.bytedance.sdk.openadsdk.core.aa.dg().sup(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            sbVar.zz = 2;
        }
        com.bytedance.sdk.openadsdk.core.aa.xq().emc(adSlot, sbVar, 7, new sra.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.vk.3
            @Override // com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(int i, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
                if (emcVar.dg() == null || emcVar.dg().isEmpty()) {
                    return;
                }
                vk.this.emc(emcVar, new yzg(vk.this.ypw, emcVar, adSlot), adSlot, true, (PAGRewardedAdLoadListener) null);
            }
        });
    }

    private void ypw(final AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.model.sb sbVar = new com.bytedance.sdk.openadsdk.core.model.sb();
        sbVar.ypw = 2;
        if (com.bytedance.sdk.openadsdk.core.aa.dg().sup(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            sbVar.zz = 2;
        }
        com.bytedance.sdk.openadsdk.core.aa.xq().emc(adSlot, sbVar, 7, (com.bytedance.sdk.openadsdk.core.ul) new ylm() { // from class: com.bytedance.sdk.openadsdk.component.reward.vk.1
            boolean emc = false;

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(int i, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.ul
            public String emc() {
                return cf.emc(vk.this.ypw).emc(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.ul
            public boolean emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
                boolean zEmc = cf.emc(vk.this.ypw).emc(emcVar);
                this.emc = zEmc;
                return zEmc;
            }

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
                if (this.emc || emcVar.dg() == null || emcVar.dg().isEmpty()) {
                    return;
                }
                vk.this.emc(emcVar, new yzg(vk.this.ypw, emcVar, adSlot), adSlot, true, (PAGRewardedAdLoadListener) null);
            }
        });
    }

    public static vk emc(Context context) {
        if (emc == null) {
            synchronized (vk.class) {
                try {
                    if (emc == null) {
                        emc = new vk(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    private void ypw(final AdSlot adSlot, final PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (com.bytedance.sdk.component.utils.cf.dg()) {
            a.a(adSlot.getBidAdm());
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.model.sb sbVar = new com.bytedance.sdk.openadsdk.core.model.sb();
        sbVar.ypw = 1;
        if (com.bytedance.sdk.openadsdk.core.aa.dg().sup(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            sbVar.zz = 2;
        }
        com.bytedance.sdk.openadsdk.core.aa.xq().emc(adSlot, sbVar, 7, (com.bytedance.sdk.openadsdk.core.ul) new ylm() { // from class: com.bytedance.sdk.openadsdk.component.reward.vk.4
            boolean emc = false;

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(int i, String str) {
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
                com.bytedance.sdk.openadsdk.core.model.emc emcVar2;
                if (emcVar.dg() != null && !emcVar.dg().isEmpty()) {
                    yzg yzgVar = new yzg(vk.this.ypw, emcVar, adSlot);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.ylm.emc.dg.emc().emc(emcVar.dg().isEmpty() ? null : emcVar.dg().get(0));
                        com.bytedance.sdk.openadsdk.vk.xq.emc(emcVar.ycc(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (pAGRewardedAdLoadListener == null || com.bytedance.sdk.openadsdk.core.aa.dg().sf() != 0) {
                        emcVar2 = emcVar;
                    } else {
                        vk.this.emc(adSlot, emcVar, pAGRewardedAdLoadListener, yzgVar.emc(), this.emc);
                        emcVar2 = emcVar;
                    }
                    vk.this.emc(emcVar2, yzgVar, adSlot, false, pAGRewardedAdLoadListener);
                    return;
                }
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.msw.emc(-3));
                    xqVar.emc(-3);
                    xqVar.xq(6);
                    com.bytedance.sdk.openadsdk.core.model.xq.emc(xqVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.ul
            public String emc() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strEmc = cf.emc(vk.this.ypw).emc(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(strEmc)) {
                    return null;
                }
                return strEmc;
            }

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.ul
            public boolean emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
                boolean zEmc = cf.emc(vk.this.ypw).emc(emcVar);
                this.emc = zEmc;
                return zEmc;
            }
        });
    }

    private void xq(AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) throws Throwable {
        com.bytedance.sdk.openadsdk.core.model.emc emcVarYpw;
        if (TextUtils.isEmpty(adSlot.getBidAdm()) && (emcVarYpw = cf.emc(this.ypw).ypw(adSlot.getCodeId(), true)) != null && emcVarYpw.bw()) {
            emc(emcVarYpw, adSlot, pAGRewardedAdLoadListener);
        } else {
            dg(adSlot, pAGRewardedAdLoadListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dg(AdSlot adSlot) {
        cf.emc(this.ypw).emc(adSlot.getCodeId());
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

    public void emc(String str, rie rieVar) {
        cf.emc(this.ypw).emc(str, rieVar);
    }

    private void ypw() {
        if (this.xq.get()) {
            return;
        }
        this.xq.set(true);
        sb.emc(this.ycc, this.ypw);
    }

    public void emc() {
        try {
            cf.emc(this.ypw).emc();
        } catch (Throwable unused) {
        }
    }

    public void emc(AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) throws Throwable {
        if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
            ypw(adSlot, pAGRewardedAdLoadListener);
        } else {
            xq(adSlot, pAGRewardedAdLoadListener);
        }
    }

    private void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) throws Throwable {
        com.bytedance.sdk.openadsdk.core.model.emc emcVar2;
        vk vkVar;
        com.bytedance.sdk.openadsdk.core.model.emc emcVar3;
        AdSlot adSlot2;
        PAGRewardedAdLoadListener pAGRewardedAdLoadListener2;
        rie rieVarYcc = emcVar.ycc();
        for (rie rieVar : emcVar.dg()) {
            if (rieVar.vaf() == null) {
                rieVar.emc(adSlot);
            }
        }
        yzg yzgVar = new yzg(this.ypw, emcVar, adSlot);
        if (!dr.xq(rieVarYcc)) {
            yzgVar.ypw();
        }
        if (pAGRewardedAdLoadListener != null) {
            com.bytedance.sdk.openadsdk.core.sup.xq.dg.emc(emcVar);
            if (com.bytedance.sdk.openadsdk.core.aa.dg().sf() == 0) {
                vkVar = this;
                emcVar3 = emcVar;
                adSlot2 = adSlot;
                pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                vkVar.emc(adSlot2, emcVar3, pAGRewardedAdLoadListener2, (PAGRewardedAd) yzgVar.emc(), true);
            } else {
                vkVar = this;
                emcVar3 = emcVar;
                adSlot2 = adSlot;
                pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
            }
            PAGRewardedAdLoadListener pAGRewardedAdLoadListener3 = pAGRewardedAdLoadListener2;
            AdSlot adSlot3 = adSlot2;
            com.bytedance.sdk.openadsdk.core.model.emc emcVar4 = emcVar3;
            emcVar2 = emcVar4;
            xq xqVar = new xq(new emc(vkVar.ypw, adSlot3, emcVar4, pAGRewardedAdLoadListener3, true), emcVar2);
            for (int i = 0; i < emcVar2.dg().size(); i++) {
                emc(emcVar2.dg().get(i), adSlot3, xqVar, yzgVar);
                if (emcVar2.ru()) {
                    break;
                }
            }
        } else {
            emcVar2 = emcVar;
        }
        for (final int i3 = 0; i3 < emcVar2.dg().size(); i3++) {
            com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc().emc(emcVar2.dg().get(i3), new emc.InterfaceC0078emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.vk.5
                @Override // com.bytedance.sdk.openadsdk.core.sz.xq.emc.InterfaceC0078emc
                public void emc(boolean z6) {
                    com.bytedance.sdk.component.utils.ul.emc("RewardVideoLoadManager", "onCachedResponse: i=" + i3 + ", isSuccess=" + z6);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void emc(com.bytedance.sdk.openadsdk.core.model.rie r4, com.bytedance.sdk.openadsdk.AdSlot r5, final com.bytedance.sdk.openadsdk.component.reward.vk.xq r6, final com.bytedance.sdk.openadsdk.component.reward.yzg r7) {
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
            if (r1 != 0) goto L3b
            int r1 = r4.zxw()
            M1.b r1 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r1)
            A2.c r1 = (A2.C0115c) r1
            java.lang.String r1 = r1.b()
            com.bytedance.sdk.openadsdk.core.sz.emc.ypw r1 = com.bytedance.sdk.openadsdk.core.model.rie.emc(r1, r4)
            java.lang.String r2 = "material_meta"
            r1.emc(r2, r4)
            java.lang.String r4 = "ad_slot"
            r1.emc(r4, r5)
            com.bytedance.sdk.openadsdk.component.reward.vk$6 r4 = new com.bytedance.sdk.openadsdk.component.reward.vk$6
            r4.<init>()
            com.bytedance.sdk.openadsdk.core.sz.bw.emc.emc(r1, r4)
            goto L3c
        L3b:
            r0 = r2
        L3c:
            if (r0 == 0) goto L45
            com.bytedance.sdk.openadsdk.component.reward.ru r4 = r7.emc()
            r6.onAdLoaded(r4)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.vk.emc(com.bytedance.sdk.openadsdk.core.model.rie, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.component.reward.vk$xq, com.bytedance.sdk.openadsdk.component.reward.yzg):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, yzg yzgVar, AdSlot adSlot, boolean z6, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (!z6) {
            com.bytedance.sdk.openadsdk.qh.emc.emc().emc(emcVar.ycc());
        }
        AdSlot adSlot2 = adSlot;
        xq xqVar = new xq(new emc(this.ypw, adSlot2, emcVar, pAGRewardedAdLoadListener, false), emcVar);
        emc(emcVar);
        int i = 0;
        while (i < emcVar.dg().size()) {
            rie rieVar = emcVar.dg().get(i);
            int iFu = rieVar.fu();
            if (i == 0 && iFu == 43) {
                rieVar.iat().f6593o = 0;
            }
            yzg yzgVar2 = yzgVar;
            boolean z7 = z6;
            AdSlot adSlot3 = adSlot2;
            emc(emcVar, rieVar, yzgVar2, adSlot3, z7, xqVar);
            adSlot2 = adSlot3;
            if (emcVar.ru() && iFu != 43) {
                return;
            }
            i++;
            yzgVar = yzgVar2;
            z6 = z7;
        }
    }

    private void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        ee eeVarSup = emcVar.sup();
        int iVk = emcVar.ru() ? 10 : 1;
        if (eeVarSup != null) {
            iVk = eeVarSup.vk();
        }
        for (final int i = 0; i < emcVar.dg().size(); i++) {
            rie rieVar = emcVar.dg().get(i);
            if (i >= iVk) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc().emc(rieVar, new emc.InterfaceC0078emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.vk.8
                @Override // com.bytedance.sdk.openadsdk.core.sz.xq.emc.InterfaceC0078emc
                public void emc(boolean z6) {
                    com.bytedance.sdk.component.utils.ul.emc("RewardVideoLoadManager", "onCachedResponse: i=" + i + ", isSuccess=" + z6);
                }
            });
        }
    }

    private void emc(final com.bytedance.sdk.openadsdk.core.model.emc emcVar, rie rieVar, yzg yzgVar, final AdSlot adSlot, final boolean z6, xq xqVar) {
        final yzg yzgVar2;
        final xq xqVar2;
        if (z6 && !dr.xq(rieVar) && com.bytedance.sdk.openadsdk.core.aa.dg().db(adSlot.getCodeId()).dg == 1 && !com.bytedance.sdk.component.utils.sba.dg(this.ypw)) {
            emc(new ypw(rieVar, adSlot, emcVar));
            return;
        }
        boolean z7 = false;
        boolean z8 = xqVar != null && com.bytedance.sdk.openadsdk.core.aa.dg().sf() == 1;
        if (dr.xq(rieVar)) {
            yzgVar2 = yzgVar;
            xqVar2 = xqVar;
            if (z6) {
                cf.emc(this.ypw).emc(adSlot, emcVar);
            }
        } else {
            if (rieVar.iat() != null) {
                com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVarEmc = rie.emc(((C0115c) CacheDirFactory.getICacheDir(rieVar.zxw())).b(), rieVar);
                ypwVarEmc.emc("material_meta", rieVar);
                ypwVarEmc.emc("ad_slot", adSlot);
                yzgVar2 = yzgVar;
                xqVar2 = xqVar;
                com.bytedance.sdk.openadsdk.core.sz.bw.emc.emc(ypwVarEmc, new c() { // from class: com.bytedance.sdk.openadsdk.component.reward.vk.9
                    @Override // K1.a
                    public void emc(b bVar, int i) {
                        yzgVar2.ypw();
                        if (z6) {
                            cf.emc(vk.this.ypw).emc(adSlot, emcVar);
                        } else {
                            if (xqVar2 == null || com.bytedance.sdk.openadsdk.core.aa.dg().sf() != 1) {
                                return;
                            }
                            xqVar2.onAdLoaded(yzgVar2.emc());
                        }
                    }

                    @Override // K1.a
                    public void emc(b bVar, int i, String str) {
                        if (xqVar2 == null || com.bytedance.sdk.openadsdk.core.aa.dg().sf() != 1) {
                            return;
                        }
                        xqVar2.onError(i, str);
                    }
                });
            } else {
                yzgVar2 = yzgVar;
                xqVar2 = xqVar;
                z7 = z8;
            }
            z8 = z7;
        }
        if (z8) {
            xqVar2.onAdLoaded(yzgVar2.emc());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.emc emcVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, PAGRewardedAd pAGRewardedAd, final boolean z6) {
        com.bytedance.sdk.openadsdk.core.qh.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.vk.10
            @Override // java.lang.Runnable
            public void run() {
                if (z6) {
                    vk.this.dg(adSlot);
                } else {
                    cf.emc(vk.this.ypw).emc(adSlot, emcVar);
                    vk.this.dg(adSlot);
                }
            }
        });
        if (pAGRewardedAdLoadListener != null) {
            pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
        }
    }

    private void emc(ypw ypwVar) {
        if (ypwVar == null) {
            return;
        }
        if (this.dg.size() > 0) {
            this.dg.remove(0);
        }
        this.dg.add(ypwVar);
    }
}
