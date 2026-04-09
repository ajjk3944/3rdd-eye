package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.f1;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.a;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.mwh.lh.ouw;
import com.bytedance.sdk.openadsdk.core.qbp;
import com.bytedance.sdk.openadsdk.core.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.core.zin;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import w8.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ryl {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile ryl vt;
    private com.bytedance.sdk.component.pno.pno fkw;

    /* renamed from: le, reason: collision with root package name */
    private final ksc.ouw f8002le;

    /* renamed from: lh, reason: collision with root package name */
    private final AtomicBoolean f8003lh;
    public final Context ouw;
    private final List<vt> yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class lh implements PAGRewardedAdLoadListener {

        /* renamed from: lh, reason: collision with root package name */
        private final AtomicInteger f8011lh;
        private final PAGRewardedAdLoadListener ouw;
        private final AtomicBoolean vt;
        private final com.bytedance.sdk.openadsdk.core.model.ouw yu;

        public /* synthetic */ lh(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, byte b10) {
            this(pAGRewardedAdLoadListener, ouwVar);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
        public final void onError(int i4, String str) {
            if (this.f8011lh.decrementAndGet() > 0 || this.ouw == null || !this.vt.compareAndSet(false, true)) {
                return;
            }
            this.ouw.onError(i4, str);
            com.bytedance.sdk.openadsdk.rn.lh.ouw("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.lh.1
                @Override // com.bytedance.sdk.openadsdk.rn.vt
                public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", lh.this.yu.ouw());
                    com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                    yuVar.ouw = "choose_ad_load_error";
                    yuVar.bly = jSONObject.toString();
                    return yuVar;
                }
            });
        }

        private lh(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
            this.vt = new AtomicBoolean(false);
            this.ouw = pAGRewardedAdLoadListener;
            this.yu = ouwVar;
            this.f8011lh = new AtomicInteger(ouw());
        }

        private int ouw() {
            if (!this.yu.vt()) {
                return 0;
            }
            int i4 = 0;
            for (int i10 = 0; i10 < this.yu.yu.size(); i10++) {
                vpp vppVar = this.yu.yu.get(i10);
                if (vppVar != null && !od.lh(vppVar) && vppVar.f8309sd != null) {
                    i4++;
                }
            }
            return i4;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            this.f8011lh.decrementAndGet();
            if (this.ouw == null || !this.vt.compareAndSet(false, true)) {
                return;
            }
            this.ouw.onAdLoaded(pAGRewardedAd);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw implements PAGRewardedAdLoadListener {
        private final boolean fkw;

        /* renamed from: lh, reason: collision with root package name */
        private final com.bytedance.sdk.openadsdk.core.model.ouw f8012lh;
        private final Context ouw;
        private final AdSlot vt;
        private final PAGRewardedAdLoadListener yu;

        public ouw(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, boolean z3) {
            this.ouw = context;
            this.vt = adSlot;
            this.f8012lh = ouwVar;
            this.yu = pAGRewardedAdLoadListener;
            this.fkw = z3;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public final /* synthetic */ void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            ryl.ouw(this.ouw).ouw(this.vt, this.f8012lh, this.yu, pAGRewardedAd, this.fkw);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
        public final void onError(int i4, String str) {
            PAGRewardedAdLoadListener pAGRewardedAdLoadListener = this.yu;
            if (pAGRewardedAdLoadListener != null) {
                pAGRewardedAdLoadListener.onError(i4, str);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt extends com.bytedance.sdk.component.pno.pno {

        /* renamed from: lh, reason: collision with root package name */
        final com.bytedance.sdk.openadsdk.core.model.ouw f8013lh;
        final vpp ouw;
        final AdSlot vt;

        public vt(vpp vppVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
            super("Reward Task");
            this.ouw = vppVar;
            this.vt = adSlot;
            this.f8013lh = ouwVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            vpp vppVar = this.ouw;
            if (vppVar == null || vppVar.f8309sd == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(((f1) CacheDirFactory.getICacheDir(vppVar.sm)).H(), this.ouw);
            vtVarOuw.ouw("material_meta", this.ouw);
            vtVarOuw.ouw("ad_slot", this.vt);
            com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw, new c() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.vt.1
                @Override // w8.a
                public final void ouw(a aVar, int i4) {
                    ko.lh("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadSuccess with net change !!");
                    cf cfVarOuw = cf.ouw(zih.ouw());
                    vt vtVar = vt.this;
                    cfVarOuw.ouw(vtVar.vt, vtVar.f8013lh);
                }

                @Override // w8.a
                public final void ouw(a aVar, int i4, String str) {
                    ko.lh("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadFail with net change !!");
                }
            });
        }
    }

    private ryl(Context context) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f8003lh = atomicBoolean;
        this.yu = DesugarCollections.synchronizedList(new ArrayList());
        ksc.ouw ouwVar = new ksc.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.2
            @Override // com.bytedance.sdk.component.utils.ksc.ouw
            public final void ouw(boolean z3, int i4) {
                if (z3) {
                    if (ryl.this.fkw == null) {
                        ryl rylVar = ryl.this;
                        rylVar.fkw = new com.bytedance.sdk.openadsdk.component.reward.vt("net connect task", rylVar.yu);
                    }
                    com.bytedance.sdk.component.utils.bly.ouw().post(ryl.this.fkw);
                }
            }
        };
        this.f8002le = ouwVar;
        Context contextOuw = context == null ? zih.ouw() : context.getApplicationContext();
        this.ouw = contextOuw;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        ksc.ouw(ouwVar, contextOuw);
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.fkw != null) {
            try {
                com.bytedance.sdk.component.utils.bly.ouw().removeCallbacks(this.fkw);
            } catch (Exception unused) {
            }
            this.fkw = null;
        }
        if (this.f8003lh.get()) {
            this.f8003lh.set(false);
            try {
                ksc.ouw(this.f8002le);
            } catch (Exception unused2) {
            }
        }
    }

    private void lh(final AdSlot adSlot) {
        if (cf.ouw(this.ouw).vt(adSlot.getCodeId(), false) != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.ksc kscVar = new com.bytedance.sdk.openadsdk.core.model.ksc();
        kscVar.vt = 2;
        zih.yu();
        if (com.bytedance.sdk.openadsdk.core.settings.cf.pno(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            kscVar.bly = 2;
        }
        zih.lh().ouw(adSlot, kscVar, 7, new vpp.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.3
            @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(int i4, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar.yu;
                if (list == null || list.isEmpty()) {
                    return;
                }
                ryl.ouw(ryl.this, ouwVar, new jg(ryl.this.ouw, ouwVar, adSlot), adSlot, true, (PAGRewardedAdLoadListener) null);
            }
        });
    }

    private void vt(final AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.model.ksc kscVar = new com.bytedance.sdk.openadsdk.core.model.ksc();
        kscVar.vt = 2;
        zih.yu();
        if (com.bytedance.sdk.openadsdk.core.settings.cf.pno(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            kscVar.bly = 2;
        }
        zih.lh().ouw(adSlot, kscVar, 7, (qbp) new zin() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.1
            boolean ouw = false;

            @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(int i4, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.qbp
            public final String ouw() {
                cf.ouw(ryl.this.ouw);
                return cf.ouw(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.qbp
            public final boolean ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
                cf.ouw(ryl.this.ouw);
                boolean zOuw = cf.ouw(ouwVar);
                this.ouw = zOuw;
                return zOuw;
            }

            @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                List<com.bytedance.sdk.openadsdk.core.model.vpp> list;
                if (this.ouw || (list = ouwVar.yu) == null || list.isEmpty()) {
                    return;
                }
                ryl.ouw(ryl.this, ouwVar, new jg(ryl.this.ouw, ouwVar, adSlot), adSlot, true, (PAGRewardedAdLoadListener) null);
            }
        });
    }

    public static ryl ouw(Context context) {
        if (vt == null) {
            synchronized (ryl.class) {
                try {
                    if (vt == null) {
                        vt = new ryl(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return vt;
    }

    public final void ouw(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
            vt(adSlot);
        } else {
            lh(adSlot);
        }
    }

    public final void ouw() {
        File[] fileArrListFiles;
        String str;
        File file;
        File[] fileArrListFiles2;
        try {
            final cf cfVarOuw = cf.ouw(this.ouw);
            if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
                com.bytedance.sdk.openadsdk.common.vt.ouw("sp_reward_video_new").ouw();
                return;
            }
            try {
                int i4 = Build.VERSION.SDK_INT;
                boolean zFkw = com.bytedance.sdk.openadsdk.core.bly.fkw("sp_reward_video");
                if (zFkw) {
                    str = "files";
                } else {
                    str = "shared_prefs";
                }
                if (i4 >= 24) {
                    file = new File(cfVarOuw.ouw.getDataDir(), str);
                } else {
                    file = new File(cfVarOuw.ouw.getDatabasePath("1").getParentFile().getParentFile(), str);
                }
                if (file.exists() && file.isDirectory() && (fileArrListFiles2 = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.cf.1
                    public AnonymousClass1() {
                    }

                    @Override // java.io.FileFilter
                    public final boolean accept(File file2) {
                        if (file2 != null) {
                            return file2.getName().contains("sp_reward_video");
                        }
                        return false;
                    }
                })) != null) {
                    for (File file2 : fileArrListFiles2) {
                        if (zFkw) {
                            try {
                                com.bytedance.sdk.component.utils.ra.lh(file2);
                            } catch (Throwable unused) {
                            }
                        } else {
                            String strReplace = file2.getName().replace(".xml", "");
                            if (Build.VERSION.SDK_INT >= 24) {
                                cfVarOuw.ouw.deleteSharedPreferences(strReplace);
                            } else {
                                cfVarOuw.ouw.getSharedPreferences(strReplace, 0).edit().clear().apply();
                                com.bytedance.sdk.component.utils.ra.lh(file2);
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            File cacheDir = cfVarOuw.ouw.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (fileArrListFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.cf.2
                public AnonymousClass2() {
                }

                @Override // java.io.FileFilter
                public final boolean accept(File file3) {
                    if (file3 != null) {
                        return file3.getName().contains("reward_video_cache");
                    }
                    return false;
                }
            })) == null) {
                return;
            }
            for (File file3 : fileArrListFiles) {
                try {
                    com.bytedance.sdk.component.utils.ra.lh(file3);
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        ryl rylVar;
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar2;
        AdSlot adSlot2;
        PAGRewardedAdLoadListener pAGRewardedAdLoadListener2;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVarLh = ouwVar.lh();
        for (com.bytedance.sdk.openadsdk.core.model.vpp vppVar : ouwVar.yu) {
            if (vppVar.yiz == null) {
                vppVar.yiz = adSlot;
            }
        }
        final jg jgVar = new jg(this.ouw, ouwVar, adSlot);
        if (!od.lh(vppVarLh)) {
            jgVar.ouw.ouw();
        }
        com.bytedance.sdk.openadsdk.core.ryl.lh.yu.ouw(ouwVar);
        if (zih.yu().ryl() == 0) {
            rylVar = this;
            ouwVar2 = ouwVar;
            adSlot2 = adSlot;
            pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
            rylVar.ouw(adSlot2, ouwVar2, pAGRewardedAdLoadListener2, jgVar.ouw, true);
        } else {
            rylVar = this;
            ouwVar2 = ouwVar;
            adSlot2 = adSlot;
            pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
        }
        PAGRewardedAdLoadListener pAGRewardedAdLoadListener3 = pAGRewardedAdLoadListener2;
        AdSlot adSlot3 = adSlot2;
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar3 = ouwVar2;
        final lh lhVar = new lh(new ouw(rylVar.ouw, adSlot3, ouwVar3, pAGRewardedAdLoadListener3, true), ouwVar3, 0 == true ? 1 : 0);
        for (int i4 = 0; i4 < ouwVar3.yu.size(); i4++) {
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = ouwVar3.yu.get(i4);
            boolean z3 = zih.yu().ryl() == 1;
            if (!od.lh(vppVar2)) {
                com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = com.bytedance.sdk.openadsdk.core.model.vpp.ouw(((f1) CacheDirFactory.getICacheDir(vppVar2.sm)).H(), vppVar2);
                vtVarOuw.ouw("material_meta", vppVar2);
                vtVarOuw.ouw("ad_slot", adSlot3);
                com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw, new c() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.6
                    @Override // w8.a
                    public final void ouw(a aVar, int i10) {
                        Log.d("RewardVideoLoadManager", "onVideoPreloadSuccess: ");
                        if (lhVar == null || zih.yu().ryl() != 1) {
                            return;
                        }
                        lhVar.onAdLoaded(jgVar.ouw);
                    }

                    @Override // w8.a
                    public final void ouw(a aVar, int i10, String str) {
                        ko.lh("RewardVideoLoadManager", "RewardVideoLog: Cached ad  onVideoPreloadFail");
                        if (lhVar == null || zih.yu().ryl() != 1) {
                            return;
                        }
                        lhVar.onError(i10, str);
                    }
                });
                z3 = false;
            }
            if (z3) {
                lhVar.onAdLoaded(jgVar.ouw);
            }
            if (ouwVar3.yu()) {
                break;
            }
        }
        for (final int i10 = 0; i10 < ouwVar3.yu.size(); i10++) {
            com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(ouwVar3.yu.get(i10), new ouw.InterfaceC0089ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.5
                @Override // com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.InterfaceC0089ouw
                public final void ouw(boolean z10) {
                    com.bytedance.sdk.component.utils.qbp.ouw("RewardVideoLoadManager", "onCachedResponse: i=" + i10 + ", isSuccess=" + z10);
                }
            });
        }
        ko.vt("RewardVideoLoadManager", "get cache data success");
        ko.vt("bidding", "reward video get cache data success");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, PAGRewardedAd pAGRewardedAd, final boolean z3) {
        com.bytedance.sdk.openadsdk.core.jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.10
            @Override // java.lang.Runnable
            public final void run() {
                if (z3) {
                    ryl.ouw(ryl.this, adSlot);
                } else {
                    cf.ouw(ryl.this.ouw).ouw(adSlot, ouwVar);
                    ryl.ouw(ryl.this, adSlot);
                }
            }
        });
        if (pAGRewardedAdLoadListener != null) {
            pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void ouw(com.bytedance.sdk.openadsdk.component.reward.ryl r13, final com.bytedance.sdk.openadsdk.core.model.ouw r14, final com.bytedance.sdk.openadsdk.component.reward.jg r15, com.bytedance.sdk.openadsdk.AdSlot r16, final boolean r17, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener r18) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ryl.ouw(com.bytedance.sdk.openadsdk.component.reward.ryl, com.bytedance.sdk.openadsdk.core.model.ouw, com.bytedance.sdk.openadsdk.component.reward.jg, com.bytedance.sdk.openadsdk.AdSlot, boolean, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener):void");
    }

    public static /* synthetic */ void ouw(ryl rylVar, AdSlot adSlot) {
        String codeId = adSlot.getCodeId();
        cf cfVarOuw = cf.ouw(rylVar.ouw);
        if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
            com.bytedance.sdk.openadsdk.common.vt.ouw("sp_reward_video_new").yu(codeId);
        } else {
            cfVarOuw.vt.le(codeId);
        }
    }
}
