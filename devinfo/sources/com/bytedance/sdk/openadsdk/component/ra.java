package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.component.le;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.ksc;
import com.bytedance.sdk.openadsdk.core.model.uq;
import com.bytedance.sdk.openadsdk.core.pno;
import com.bytedance.sdk.openadsdk.core.qbp;
import com.bytedance.sdk.openadsdk.core.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.core.zin;
import com.bytedance.sdk.openadsdk.rn.ouw.lh;
import com.bytedance.sdk.openadsdk.rn.ouw.yu;
import com.bytedance.sdk.openadsdk.utils.fak;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra implements jae.ouw {
    private final Context bly;

    /* renamed from: cf, reason: collision with root package name */
    private boolean f7902cf;
    public PAGAppOpenAdLoadListener fkw;

    /* renamed from: le, reason: collision with root package name */
    public int f7903le;
    final vpp<com.bytedance.sdk.openadsdk.yu.ouw> ouw;
    final le vt;
    public AdSlot yu;
    private final AtomicBoolean tlj = new AtomicBoolean(false);

    /* renamed from: lh, reason: collision with root package name */
    public int f7904lh = 0;
    volatile int ra = 0;
    public final uq pno = new uq();

    public ra(Context context) {
        if (context != null) {
            this.bly = context.getApplicationContext();
        } else {
            this.bly = zih.ouw();
        }
        this.ouw = zih.lh();
        this.vt = le.ouw(this.bly);
    }

    public static int vt(AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final void ouw(final AdSlot adSlot) {
        this.ra = 1;
        if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
            final fak fakVarOuw = fak.ouw();
            ksc kscVar = new ksc();
            kscVar.f8240cf = this.pno;
            kscVar.yu = 1;
            kscVar.bly = 2;
            this.ouw.ouw(adSlot, kscVar, 3, (qbp) new zin() { // from class: com.bytedance.sdk.openadsdk.component.ra.1
                @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                public final void ouw(int i4, String str) throws JSONException {
                    ra.this.ra = 3;
                    ko.vt("TTAppOpenAdLoadManager", "try load app open ad from network fail, " + i4 + ", " + str);
                    ra.this.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(2, 100, i4, str));
                }

                @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) throws JSONException {
                    ra.ouw(ra.this, ouwVar, lhVar, adSlot, fakVarOuw);
                }
            });
            return;
        }
        final fak fakVarOuw2 = fak.ouw();
        ksc kscVar2 = new ksc();
        kscVar2.f8240cf = this.pno;
        kscVar2.yu = 1;
        kscVar2.bly = 2;
        this.ouw.ouw(adSlot, kscVar2, 3, new vpp.ouw() { // from class: com.bytedance.sdk.openadsdk.component.ra.2
            @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(int i4, String str) throws JSONException {
                ra.this.ra = 3;
                ko.vt("TTAppOpenAdLoadManager", "try load app open ad from network fail, " + i4 + ", " + str);
                ra.this.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(2, 100, i4, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) throws JSONException {
                ra.ouw(ra.this, ouwVar, lhVar, adSlot, fakVarOuw2);
            }
        });
    }

    public final void ouw() {
        ouw(this.yu);
    }

    private void ouw(final com.bytedance.sdk.openadsdk.core.model.vpp vppVar, AdSlot adSlot, final boolean z3, final com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        this.vt.ouw(vppVar, adSlot, this.pno, new le.vt() { // from class: com.bytedance.sdk.openadsdk.component.ra.6
            @Override // com.bytedance.sdk.openadsdk.component.le.vt
            public final void ouw() throws JSONException {
                Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: video load success");
                if (z3) {
                    ra.this.ra = 4;
                    com.bytedance.sdk.openadsdk.component.fkw.vt vtVar = new com.bytedance.sdk.openadsdk.component.fkw.vt(100, vppVar, ouwVar);
                    vtVar.ra = true;
                    ra.this.ouw(vtVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.le.vt
            public final void ouw(int i4, String str) throws JSONException {
                ko.vt("TTAppOpenAdLoadManager", "preLoadFail() called with: code = [" + i4 + "], message = [" + str + "]");
                if (z3) {
                    ra.this.ra = 5;
                    ra.this.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(2, 100, 10003, pno.ouw(10003)));
                }
            }
        });
    }

    private void ouw(final com.bytedance.sdk.openadsdk.core.model.vpp vppVar, final com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        this.vt.ouw(vppVar, this.pno, new le.ouw() { // from class: com.bytedance.sdk.openadsdk.component.ra.7
            final /* synthetic */ boolean ouw = false;

            @Override // com.bytedance.sdk.openadsdk.component.le.ouw
            public final void ouw() throws JSONException {
                Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: image load success");
                if (this.ouw) {
                    ra.this.ra = 4;
                    com.bytedance.sdk.openadsdk.component.fkw.vt vtVar = new com.bytedance.sdk.openadsdk.component.fkw.vt(100, vppVar, ouwVar);
                    vtVar.ra = true;
                    ra.this.ouw(vtVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.le.ouw
            public final void vt() throws JSONException {
                Log.d("TTAppOpenAdLoadManager", "preLoadFail: image load fail");
                if (this.ouw) {
                    ra.this.ra = 5;
                    ra.this.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(2, 100, 10003, pno.ouw(10003)));
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) throws JSONException {
        if (message.what != 1 || this.tlj.get()) {
            return;
        }
        ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(3, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, 10002, pno.ouw(10002)));
    }

    public final void ouw(com.bytedance.sdk.openadsdk.component.fkw.vt vtVar) throws JSONException {
        int i4 = vtVar.ouw;
        int i10 = vtVar.vt;
        if (!this.tlj.compareAndSet(false, true)) {
            if (i4 == 1 && i10 == 100 && !this.pno.bly) {
                ko.vt("TTAppOpenAdLoadManager", "openAdCallBack: timeout after cache material");
                le.ouw(zih.ouw()).ouw(new com.bytedance.sdk.openadsdk.component.fkw.ouw(this.f7904lh, vtVar.f7876lh, vtVar.yu));
                if (this.f7902cf) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(vtVar.f7876lh, 1, this.pno);
                return;
            }
            return;
        }
        if (i4 != 1) {
            if (i4 == 2 || i4 == 3) {
                PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener = this.fkw;
                if (pAGAppOpenAdLoadListener != null) {
                    pAGAppOpenAdLoadListener.onError(vtVar.fkw, vtVar.f7875le);
                }
                if (i4 == 3) {
                    com.bytedance.sdk.openadsdk.rn.lh.ouw("openad_load_ad_timeout", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.component.yu.ouw.1
                        final /* synthetic */ int ouw;
                        final /* synthetic */ int vt;

                        public AnonymousClass1(int i11, int i12) {
                            i = i11;
                            i = i12;
                        }

                        @Override // com.bytedance.sdk.openadsdk.rn.vt
                        public final lh ouw() throws Exception {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("timeout_type", i);
                            jSONObject.put("user_timeout_time", i);
                            yu yuVar = new yu();
                            yuVar.ouw = "openad_load_ad_timeout";
                            yuVar.bly = jSONObject.toString();
                            return yuVar;
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 100 && !this.pno.bly) {
            this.vt.ouw(new com.bytedance.sdk.openadsdk.component.fkw.ouw(this.f7904lh, vtVar.f7876lh, vtVar.yu));
        }
        if (this.fkw != null) {
            this.fkw.onAdLoaded(new yu(this.bly, vtVar.f7876lh, i10 == 101, this.yu));
        }
        if (i10 != 101) {
            if (i10 == 100) {
                com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(vtVar.f7876lh, 0, this.pno);
                this.f7902cf = true;
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = vtVar.f7876lh;
        long jLh = this.pno.ouw.lh();
        JSONObject jSONObject = new JSONObject();
        try {
            com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(jSONObject, vppVar);
            jSONObject.put("openad_creative_type", com.bytedance.sdk.openadsdk.core.model.vpp.fkw(vppVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException unused) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAppOpenAdReport", "reportLoadCacheDuration json error");
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, "load_cache_duration", jLh, jSONObject);
    }

    public static /* synthetic */ void ouw(ra raVar, final com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar, AdSlot adSlot, fak fakVar) throws JSONException {
        List<com.bytedance.sdk.openadsdk.core.model.vpp> list;
        raVar.ra = 2;
        ko.vt("TTAppOpenAdLoadManager", "try load app open ad from network success");
        if (ouwVar != null && (list = ouwVar.yu) != null && list.size() != 0) {
            final com.bytedance.sdk.openadsdk.core.model.vpp vppVar = ouwVar.yu.get(0);
            long jKo = vppVar.ko();
            raVar.pno.tlj = jKo;
            boolean zRa = com.bytedance.sdk.openadsdk.core.model.vpp.ra(vppVar);
            if (vppVar.ra()) {
                raVar.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(100, vppVar, ouwVar));
                return;
            }
            if (!zRa && !vppVar.zn) {
                if (com.bytedance.sdk.openadsdk.core.model.vpp.fkw(vppVar)) {
                    int iOuw = zih.yu().pno.ouw("splash_video_load_strategy", 0);
                    if (iOuw != 1 && iOuw != 3) {
                        raVar.ouw(vppVar, adSlot, !raVar.pno.bly, ouwVar);
                        if (raVar.pno.bly) {
                            com.bytedance.sdk.openadsdk.rn.lh.ouw(vppVar, fakVar.lh());
                            ko.ouw("TTAppOpenAdLoadManager", "onAdLoad: invoke callback after ", Long.valueOf(jKo), "ms for bidding");
                            if (jKo == 0) {
                                raVar.pno.pno = 2;
                                raVar.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(100, vppVar, ouwVar));
                                return;
                            } else {
                                jg.vt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.ra.3
                                    @Override // java.lang.Runnable
                                    public final void run() throws JSONException {
                                        ra raVar2 = ra.this;
                                        raVar2.pno.pno = 2;
                                        raVar2.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(100, vppVar, ouwVar));
                                    }
                                }, jKo);
                                return;
                            }
                        }
                        return;
                    }
                    uq uqVar = raVar.pno;
                    uqVar.tlj = -1L;
                    uqVar.pno = 3;
                    raVar.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(100, vppVar, ouwVar));
                    raVar.ouw(vppVar, adSlot, false, ouwVar);
                    return;
                }
                uq uqVar2 = raVar.pno;
                uqVar2.tlj = -1L;
                uqVar2.pno = 3;
                raVar.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(100, vppVar, ouwVar));
                raVar.ouw(vppVar, ouwVar);
                return;
            }
            raVar.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(100, vppVar, ouwVar));
            if (com.bytedance.sdk.openadsdk.core.model.vpp.fkw(vppVar)) {
                raVar.ouw(vppVar, adSlot, false, ouwVar);
                return;
            } else {
                raVar.ouw(vppVar, ouwVar);
                return;
            }
        }
        raVar.ra = 3;
        raVar.ouw(new com.bytedance.sdk.openadsdk.component.fkw.vt(2, 100, 20001, pno.ouw(20001)));
        lhVar.vt = -3;
        lhVar.ra = 3;
        com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
    }
}
