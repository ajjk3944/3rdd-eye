package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.f1;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.a;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
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
public class fkw {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile fkw vt;
    private com.bytedance.sdk.component.pno.pno fkw;

    /* renamed from: le, reason: collision with root package name */
    private final ksc.ouw f7914le;

    /* renamed from: lh, reason: collision with root package name */
    private final AtomicBoolean f7915lh;
    public final Context ouw;
    private final List<lh> yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class lh extends com.bytedance.sdk.component.pno.pno {

        /* renamed from: lh, reason: collision with root package name */
        final com.bytedance.sdk.openadsdk.core.model.ouw f7923lh;
        final vpp ouw;
        final AdSlot vt;

        public lh(vpp vppVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
            super("Fullscreen Task");
            this.ouw = vppVar;
            this.vt = adSlot;
            this.f7923lh = ouwVar;
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
            ko.lh("ScreenVideoLoadM", "FullScreenLog: preload video ");
            com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw, new c() { // from class: com.bytedance.sdk.openadsdk.component.reward.fkw.lh.1
                @Override // w8.a
                public final void ouw(a aVar, int i4) {
                    yu yuVarOuw = yu.ouw(zih.ouw());
                    lh lhVar = lh.this;
                    yuVarOuw.ouw(lhVar.vt, lhVar.f7923lh);
                    ko.lh("ScreenVideoLoadM", "FullScreenLog: preload video success with net change ");
                }

                @Override // w8.a
                public final void ouw(a aVar, int i4, String str) {
                    ko.lh("ScreenVideoLoadM", "FullScreenLog: preload video success with net fail with net change ");
                }
            });
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw implements PAGInterstitialAdLoadListener {
        private final boolean fkw;

        /* renamed from: lh, reason: collision with root package name */
        private final com.bytedance.sdk.openadsdk.core.model.ouw f7924lh;
        private final Context ouw;
        private final AdSlot vt;
        private final PAGInterstitialAdLoadListener yu;

        public ouw(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, boolean z3) {
            this.ouw = context;
            this.vt = adSlot;
            this.f7924lh = ouwVar;
            this.yu = pAGInterstitialAdLoadListener;
            this.fkw = z3;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public final /* synthetic */ void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            fkw.ouw(this.ouw).ouw(this.vt, this.f7924lh, this.yu, pAGInterstitialAd, this.fkw);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
        public final void onError(int i4, String str) {
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = this.yu;
            if (pAGInterstitialAdLoadListener != null) {
                pAGInterstitialAdLoadListener.onError(i4, str);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt implements PAGInterstitialAdLoadListener {

        /* renamed from: lh, reason: collision with root package name */
        private final AtomicInteger f7925lh;
        private final PAGInterstitialAdLoadListener ouw;
        private final AtomicBoolean vt;
        private final com.bytedance.sdk.openadsdk.core.model.ouw yu;

        public /* synthetic */ vt(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, byte b10) {
            this(pAGInterstitialAdLoadListener, ouwVar);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
        public final void onError(int i4, String str) {
            if (this.f7925lh.decrementAndGet() > 0 || !this.vt.compareAndSet(false, true)) {
                return;
            }
            this.ouw.onError(i4, str);
            com.bytedance.sdk.openadsdk.rn.lh.ouw("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.fkw.vt.1
                @Override // com.bytedance.sdk.openadsdk.rn.vt
                public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", vt.this.yu.ouw());
                    com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                    yuVar.ouw = "choose_ad_load_error";
                    yuVar.bly = jSONObject.toString();
                    return yuVar;
                }
            });
        }

        private vt(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
            this.vt = new AtomicBoolean(false);
            this.ouw = pAGInterstitialAdLoadListener;
            this.yu = ouwVar;
            this.f7925lh = new AtomicInteger(ouw());
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
        public final void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            this.f7925lh.decrementAndGet();
            if (this.ouw == null || !this.vt.compareAndSet(false, true)) {
                return;
            }
            this.ouw.onAdLoaded(pAGInterstitialAd);
        }
    }

    private fkw(Context context) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f7915lh = atomicBoolean;
        this.yu = DesugarCollections.synchronizedList(new ArrayList());
        ksc.ouw ouwVar = new ksc.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.fkw.2
            @Override // com.bytedance.sdk.component.utils.ksc.ouw
            public final void ouw(boolean z3, int i4) {
                if (z3) {
                    if (fkw.this.fkw == null) {
                        fkw fkwVar = fkw.this;
                        fkwVar.fkw = new com.bytedance.sdk.openadsdk.component.reward.vt("fsv net connect task", fkwVar.yu);
                    }
                    com.bytedance.sdk.component.utils.bly.ouw().post(fkw.this.fkw);
                }
            }
        };
        this.f7914le = ouwVar;
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
        if (this.f7915lh.get()) {
            this.f7915lh.set(false);
            try {
                ksc.ouw(this.f7914le);
            } catch (Exception unused2) {
            }
        }
    }

    private void lh(final AdSlot adSlot) {
        if (yu.ouw(this.ouw).vt(adSlot.getCodeId(), false) != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.ksc kscVar = new com.bytedance.sdk.openadsdk.core.model.ksc();
        kscVar.f8242lh = 2;
        zih.yu();
        if (com.bytedance.sdk.openadsdk.core.settings.cf.pno(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            kscVar.bly = 2;
        }
        zih.lh().ouw(adSlot, kscVar, 8, new vpp.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.fkw.3
            @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(int i4, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar.yu;
                if (list == null || list.isEmpty()) {
                    return;
                }
                fkw.ouw(fkw.this, ouwVar, new mwh(fkw.this.ouw, ouwVar), adSlot, true, (PAGInterstitialAdLoadListener) null);
            }
        });
    }

    private void vt(final AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.model.ksc kscVar = new com.bytedance.sdk.openadsdk.core.model.ksc();
        kscVar.f8242lh = 2;
        zih.yu();
        if (com.bytedance.sdk.openadsdk.core.settings.cf.pno(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            kscVar.bly = 2;
        }
        zih.lh().ouw(adSlot, kscVar, 8, (qbp) new zin() { // from class: com.bytedance.sdk.openadsdk.component.reward.fkw.1
            boolean ouw = false;

            @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(int i4, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.qbp
            public final String ouw() {
                yu.ouw(fkw.this.ouw);
                return yu.ouw(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.qbp
            public final boolean ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
                yu.ouw(fkw.this.ouw);
                boolean zOuw = yu.ouw(ouwVar);
                this.ouw = zOuw;
                return zOuw;
            }

            @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                List<com.bytedance.sdk.openadsdk.core.model.vpp> list;
                if (this.ouw || (list = ouwVar.yu) == null || list.isEmpty()) {
                    return;
                }
                fkw.ouw(fkw.this, ouwVar, new mwh(fkw.this.ouw, ouwVar), adSlot, true, (PAGInterstitialAdLoadListener) null);
            }
        });
    }

    public static fkw ouw(Context context) {
        if (vt == null) {
            synchronized (fkw.class) {
                try {
                    if (vt == null) {
                        vt = new fkw(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return vt;
    }

    public final void ouw() {
        File[] fileArrListFiles;
        String str;
        File file;
        File[] fileArrListFiles2;
        try {
            final yu yuVarOuw = yu.ouw(this.ouw);
            if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
                com.bytedance.sdk.openadsdk.common.vt.ouw("sp_full_screen_video_new").ouw();
                return;
            }
            try {
                int i4 = Build.VERSION.SDK_INT;
                boolean zFkw = com.bytedance.sdk.openadsdk.core.bly.fkw("sp_full_screen_video");
                if (zFkw) {
                    str = "files";
                } else {
                    str = "shared_prefs";
                }
                if (i4 >= 24) {
                    file = new File(yuVarOuw.ouw.getDataDir(), str);
                } else {
                    file = new File(yuVarOuw.ouw.getDatabasePath("1").getParentFile().getParentFile(), str);
                }
                if (file.exists() && file.isDirectory() && (fileArrListFiles2 = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.yu.1
                    public AnonymousClass1() {
                    }

                    @Override // java.io.FileFilter
                    public final boolean accept(File file2) {
                        if (file2 != null) {
                            return file2.getName().contains("sp_full_screen_video");
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
                                yuVarOuw.ouw.deleteSharedPreferences(strReplace);
                            } else {
                                yuVarOuw.ouw.getSharedPreferences(strReplace, 0).edit().clear().apply();
                                com.bytedance.sdk.component.utils.ra.lh(file2);
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            File cacheDir = yuVarOuw.ouw.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (fileArrListFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.yu.2
                public AnonymousClass2() {
                }

                @Override // java.io.FileFilter
                public final boolean accept(File file3) {
                    if (file3 != null) {
                        return file3.getName().contains("full_screen_video_cache");
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

    public final void ouw(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, PAGInterstitialAd pAGInterstitialAd, final boolean z3) {
        com.bytedance.sdk.openadsdk.core.jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.fkw.6
            @Override // java.lang.Runnable
            public final void run() {
                if (z3) {
                    fkw.ouw(fkw.this, adSlot);
                } else {
                    yu.ouw(fkw.this.ouw).ouw(adSlot, ouwVar);
                    fkw.ouw(fkw.this, adSlot);
                }
            }
        });
        if (pAGInterstitialAdLoadListener != null) {
            pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void ouw(com.bytedance.sdk.openadsdk.component.reward.fkw r10, com.bytedance.sdk.openadsdk.core.model.ouw r11, com.bytedance.sdk.openadsdk.component.reward.mwh r12, com.bytedance.sdk.openadsdk.AdSlot r13, boolean r14, com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener r15) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.fkw.ouw(com.bytedance.sdk.openadsdk.component.reward.fkw, com.bytedance.sdk.openadsdk.core.model.ouw, com.bytedance.sdk.openadsdk.component.reward.mwh, com.bytedance.sdk.openadsdk.AdSlot, boolean, com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener):void");
    }

    public static /* synthetic */ void ouw(fkw fkwVar, AdSlot adSlot) {
        String codeId = adSlot.getCodeId();
        yu yuVarOuw = yu.ouw(fkwVar.ouw);
        if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
            com.bytedance.sdk.openadsdk.common.vt.ouw("sp_full_screen_video_new").yu(codeId);
        } else {
            yuVarOuw.vt.le(codeId);
        }
    }
}
