package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.vm;
import com.bytedance.sdk.openadsdk.core.model.cd;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.mwh.yu.ouw;
import com.bytedance.sdk.openadsdk.core.od;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.tc.vt.fkw;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.fak;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class TTAppOpenAdActivity extends TTBaseActivity implements jae.ouw, ouw.InterfaceC0093ouw {
    private static com.bytedance.sdk.openadsdk.ouw.yu.vt ko;
    IListenerManager bly;
    private AdSlot bs;

    /* renamed from: cd, reason: collision with root package name */
    private int f7692cd;
    private int ex;
    private com.bytedance.sdk.openadsdk.component.lh fvf;
    private boolean jqy;
    private com.bytedance.sdk.openadsdk.ouw.yu.vt ksc;

    /* renamed from: le, reason: collision with root package name */
    vm f7694le;

    /* renamed from: od, reason: collision with root package name */
    private int f7696od;

    /* renamed from: pd, reason: collision with root package name */
    private boolean f7697pd;
    vpp pno;
    private com.bytedance.sdk.openadsdk.yu.ra qbp;
    TTAdDislikeToast ra;
    protected boolean ryl;
    private String tc;
    private boolean uoy;
    private FrameLayout uq;
    private float vpp;
    private com.bytedance.sdk.openadsdk.component.le.vt zih;
    private float zin;
    protected final AtomicBoolean ouw = new AtomicBoolean(false);
    protected final jae vt = new jae(Looper.getMainLooper(), this);

    /* renamed from: lh, reason: collision with root package name */
    final AtomicBoolean f7695lh = new AtomicBoolean(false);
    final AtomicBoolean yu = new AtomicBoolean(false);
    private final com.bytedance.sdk.openadsdk.component.pno.ouw rn = new com.bytedance.sdk.openadsdk.component.pno.ouw();
    protected boolean fkw = false;
    private final AtomicBoolean vm = new AtomicBoolean(false);

    /* renamed from: th, reason: collision with root package name */
    private fak f7698th = fak.vt();
    private final AtomicBoolean jae = new AtomicBoolean(false);
    long tlj = 0;
    private volatile boolean fak = false;

    /* renamed from: cf, reason: collision with root package name */
    int f7693cf = -1;
    private final com.bytedance.sdk.openadsdk.component.ouw osn = new com.bytedance.sdk.openadsdk.component.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.1
        @Override // com.bytedance.sdk.openadsdk.component.ouw
        public final void fkw() {
            TTAppOpenAdActivity.bly(TTAppOpenAdActivity.this);
            TTAppOpenAdActivity.this.f7698th.yu();
            TTAppOpenAdActivity.cf(TTAppOpenAdActivity.this);
            if (TTAppOpenAdActivity.this.jqy) {
                TTAppOpenAdActivity.this.pno();
            }
            if (TTAppOpenAdActivity.this.fvf.rn == null || TTAppOpenAdActivity.this.fvf.rn.vt == null) {
                return;
            }
            TTAppOpenAdActivity.this.fvf.rn.vt.ucs = TTAppOpenAdActivity.this;
        }

        @Override // com.bytedance.sdk.openadsdk.component.ouw
        public final void le() {
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.ouw, com.bytedance.sdk.openadsdk.component.le.ouw
        public final void lh() {
            final TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
            if (tTAppOpenAdActivity.isFinishing()) {
                return;
            }
            if (tTAppOpenAdActivity.yu.get()) {
                tTAppOpenAdActivity.ra.show(TTAdDislikeToast.getDislikeTip());
                return;
            }
            vm vmVar = tTAppOpenAdActivity.f7694le;
            if (vmVar == null) {
                if (vmVar == null) {
                    try {
                        vm vmVar2 = new vm(tTAppOpenAdActivity, tTAppOpenAdActivity.pno);
                        tTAppOpenAdActivity.f7694le = vmVar2;
                        vmVar2.setDislikeSource("video_player");
                        tTAppOpenAdActivity.f7694le.setCallback(new vm.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.4
                            @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                            public final void ouw() {
                                TTAppOpenAdActivity.this.f7695lh.set(true);
                                TTAppOpenAdActivity.this.yu();
                                com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(TTAppOpenAdActivity.this.pno, 8);
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                            public final void vt() {
                                TTAppOpenAdActivity.this.f7695lh.set(false);
                                TTAppOpenAdActivity.this.lh();
                                com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(TTAppOpenAdActivity.this.pno, 4);
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                            public final void ouw(FilterWord filterWord) {
                                if (TTAppOpenAdActivity.this.yu.get() || filterWord == null || filterWord.hasSecondOptions()) {
                                    return;
                                }
                                TTAppOpenAdActivity.this.yu.set(true);
                                TTAppOpenAdActivity.jqy(TTAppOpenAdActivity.this);
                            }
                        });
                    } catch (Throwable th2) {
                        ApmHelper.reportCustomError("initDislike error", "TTAppOpenAdActivity", th2);
                    }
                }
                FrameLayout frameLayout = (FrameLayout) tTAppOpenAdActivity.findViewById(R.id.content);
                frameLayout.addView(tTAppOpenAdActivity.f7694le);
                if (tTAppOpenAdActivity.ra == null) {
                    TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(tTAppOpenAdActivity);
                    tTAppOpenAdActivity.ra = tTAdDislikeToast;
                    frameLayout.addView(tTAdDislikeToast);
                }
            }
            vm vmVar3 = tTAppOpenAdActivity.f7694le;
            if (vmVar3 != null) {
                vmVar3.ouw();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.ouw, b9.b
        public final void ouw() {
            ko.ouw("TTAppOpenAdActivity", "open_ad", "onTimeOut");
            TTAppOpenAdActivity.this.jg();
            TTAppOpenAdActivity.this.ryl();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.ouw
        public final void ra() {
            TTAppOpenAdActivity.jg(TTAppOpenAdActivity.this);
        }

        @Override // com.bytedance.sdk.openadsdk.component.ouw, b9.b
        public final void vt(long j, int i4) {
            com.bytedance.sdk.openadsdk.component.pno.lh lhVar;
            ko.ouw("TTAppOpenAdActivity", "open_ad", "onError() called with: totalPlayTime = [" + j + "], percent = [" + i4 + "]");
            if (TTAppOpenAdActivity.this.fvf != null && (lhVar = TTAppOpenAdActivity.this.fvf.rn) != null) {
                TTAppOpenAdActivity.this.jg();
                lhVar.f7900lh = true;
            }
            TTAppOpenAdActivity.this.ryl();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.ouw, com.bytedance.sdk.openadsdk.component.le.ouw
        public final void yu() {
            TTAppOpenAdActivity.ra(TTAppOpenAdActivity.this);
            ko.ouw("TTAppOpenAdActivity", "open_ad", "onCountDownFinish() called");
            if (com.bytedance.sdk.openadsdk.vpp.ouw.ouw("splash_auto_close_switch", 0) == 0) {
                TTAppOpenAdActivity.this.le();
                TTAppOpenAdActivity.this.finish();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.ouw, b9.b
        public final void ouw(long j, long j8) {
            com.bytedance.sdk.openadsdk.component.bly.vt vtVar;
            TTAppOpenAdActivity.this.rn.vt = j;
            TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
            if (!tTAppOpenAdActivity.fkw && tTAppOpenAdActivity.fvf != null && TTAppOpenAdActivity.this.fvf.rn != null && TTAppOpenAdActivity.this.fvf.rn.ouw()) {
                TTAppOpenAdActivity.this.fvf.rn.lh();
            }
            TTAppOpenAdActivity.this.bly();
            if (!(TTAppOpenAdActivity.this.fvf instanceof com.bytedance.sdk.openadsdk.component.vt) || (vtVar = ((com.bytedance.sdk.openadsdk.component.vt) TTAppOpenAdActivity.this.fvf).ouw) == null) {
                return;
            }
            com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = vtVar.fvf;
            if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) {
                ((com.bytedance.sdk.openadsdk.core.cf.le.yu) yuVar).ouw(j, j8);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.ouw, com.bytedance.sdk.openadsdk.component.le.ouw
        public final void vt() throws JSONException {
            TTAppOpenAdActivity.this.mwh();
        }

        @Override // com.bytedance.sdk.openadsdk.component.ouw, com.bytedance.sdk.openadsdk.component.le.ouw
        public final void ouw(int i4, boolean z3) {
            if (TTAppOpenAdActivity.this.fvf != null) {
                TTAppOpenAdActivity.this.fvf.ouw(i4, z3);
            }
        }
    };
    private final Runnable ey = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.5
        @Override // java.lang.Runnable
        public final void run() throws JSONException {
            com.bytedance.sdk.openadsdk.component.le.vt vtVar;
            Handler handler;
            com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
            com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
            if (TTAppOpenAdActivity.this.vm.get()) {
                return;
            }
            if (TTAppOpenAdActivity.this.pno != null && (yuVarSd = TTAppOpenAdActivity.this.pno.sd()) != null && (yuVar = yuVarSd.ouw) != null) {
                yuVar.ouw();
            }
            TTAppOpenAdActivity.this.qbp = new com.bytedance.sdk.openadsdk.yu.ra();
            TTAppOpenAdActivity.this.qbp.ouw(System.currentTimeMillis(), 1.0f);
            TTAppOpenAdActivity.this.f7698th.yu();
            if (TTAppOpenAdActivity.this.zih != null && (handler = (vtVar = TTAppOpenAdActivity.this.zih).ouw) != null) {
                handler.sendMessage(handler.obtainMessage(100, vtVar.f7891lh, 0));
            }
            if (TTAppOpenAdActivity.this.fvf != null) {
                TTAppOpenAdActivity.this.fvf.fkw();
            }
            TTAppOpenAdActivity.ksc(TTAppOpenAdActivity.this);
            View viewFindViewById = TTAppOpenAdActivity.this.findViewById(R.id.content);
            JSONObject jSONObject = new JSONObject();
            if (viewFindViewById != null) {
                try {
                    jSONObject.put("width", viewFindViewById.getWidth());
                    jSONObject.put("height", viewFindViewById.getHeight());
                    jSONObject.put("alpha", viewFindViewById.getAlpha());
                } catch (JSONException e2) {
                    Log.e("TTAppOpenAdActivity", "run: ", e2);
                    TTAppOpenAdActivity.this.finish();
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("root_view", jSONObject.toString());
            jSONObject2.put("ad_root", TTAppOpenAdActivity.this.f7696od);
            jSONObject2.put("openad_creative_type", TTAppOpenAdActivity.this.jqy ? "video_normal_ad" : "image_normal_ad");
            if (com.bytedance.sdk.openadsdk.component.bly.pno.vt == null) {
                jSONObject2.put("appicon_acquirefail", "1");
            }
            if (TTAppOpenAdActivity.this.f7697pd || TTAppOpenAdActivity.this.pno.pd()) {
                jSONObject2.put("dynamic_show_type", TTAppOpenAdActivity.this.cf());
                TTAppOpenAdActivity.ouw(TTAppOpenAdActivity.this, jSONObject2);
            }
            jSONObject2.put("is_icon_only", TTAppOpenAdActivity.this.pno.ra() ? 1 : 0);
            com.bytedance.sdk.openadsdk.yu.lh.ouw(TTAppOpenAdActivity.this.pno, "open_ad", jSONObject2, (JSONObject) null);
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(TTAppOpenAdActivity.this.findViewById(R.id.content), TTAppOpenAdActivity.this.pno, new fkw.ouw(TTAppOpenAdActivity.this.cf()));
            com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(TTAppOpenAdActivity.this.pno);
            TTAppOpenAdActivity.this.vm.set(true);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void bly() {
        if (!this.jqy || this.pno.ra()) {
            return;
        }
        this.vt.removeMessages(100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int cf() {
        if (this.pno.pd()) {
            return 5;
        }
        if (this.f7697pd) {
            return this.fvf.yu();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jg() {
        vpp vppVar;
        cd cdVar;
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar;
        try {
            com.bytedance.sdk.openadsdk.component.le.vt vtVar = this.zih;
            if (vtVar == null || (vppVar = this.pno) == null || (cdVar = vppVar.f8311tj) == null) {
                return;
            }
            int i4 = cdVar.vt;
            if (i4 == 1 || i4 == 2) {
                vtVar.ouw(i4, cdVar.ouw, false);
                com.bytedance.sdk.openadsdk.component.lh lhVar2 = this.fvf;
                if (lhVar2 == null || (lhVar = lhVar2.rn) == null) {
                    return;
                }
                lhVar.vt.ouw(this.rn.yu);
                this.fvf.rn.vt.ouw(1.0f);
            }
        } catch (Throwable th2) {
            qbp.lh("TTAppOpenAdActivity", th2.getMessage());
        }
    }

    public static /* synthetic */ void jqy(TTAppOpenAdActivity tTAppOpenAdActivity) {
        tTAppOpenAdActivity.ra.show(TTAdDislikeToast.getDislikeSendTip());
    }

    public static /* synthetic */ void ksc(TTAppOpenAdActivity tTAppOpenAdActivity) {
        ko.ouw("TTAppOpenAdActivity", "open_ad", "callbackAdShow() called");
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            tTAppOpenAdActivity.ouw("onAdShow");
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.yu.vt vtVar = tTAppOpenAdActivity.ksc;
        if (vtVar != null) {
            vtVar.ouw();
        }
    }

    public static /* synthetic */ boolean ra(TTAppOpenAdActivity tTAppOpenAdActivity) {
        tTAppOpenAdActivity.fak = true;
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        osn.ouw((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.7
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i4) {
                if (i4 == 0) {
                    try {
                        if (TTAppOpenAdActivity.this.isFinishing()) {
                            return;
                        }
                        TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.7.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                osn.ouw((Activity) TTAppOpenAdActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e2) {
                        qbp.lh("TTAppOpenAdActivity", e2.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() throws JSONException {
        tlj();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0184  */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() throws JSONException {
        super.onDestroy();
        if (this.pno != null) {
            com.bytedance.sdk.openadsdk.le.vt.ouw().ouw("videoForceBreak", this.pno);
        }
        this.vt.removeCallbacksAndMessages(null);
        com.bytedance.sdk.openadsdk.component.le.vt vtVar = this.zih;
        if (vtVar != null) {
            vtVar.ouw.removeCallbacksAndMessages(null);
            vtVar.ouw = null;
        }
        com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.pno);
        com.bytedance.sdk.openadsdk.tc.ouw.lh.vt(this.pno);
        if (this.jqy) {
            vpp vppVar = this.pno;
            com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar = this.rn;
            com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(vppVar, ouwVar.vt, ouwVar.ouw, true);
        } else {
            com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(this.pno, -1L, this.rn.ouw, false);
        }
        if (this.f7698th.fkw() && this.vm.get()) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(String.valueOf(this.f7698th.lh()), this.pno, "open_ad", this.qbp);
            this.f7698th = fak.vt();
        }
        com.bytedance.sdk.openadsdk.component.lh lhVar = this.fvf;
        if (lhVar != null) {
            lhVar.lh();
        }
        le();
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("recycleRes");
        }
        ko = null;
        if (this.uoy && !TextUtils.isEmpty(this.f7699jg)) {
            od.ouw().ouw(this.f7699jg, isFinishing(), isChangingConfigurations());
        }
        this.ksc = null;
        vm vmVar = this.f7694le;
        if (vmVar != null) {
            vmVar.setCallback(null);
        }
        vpp vppVar2 = this.pno;
        if (vppVar2 == null || vpp.ra(vppVar2) || this.pno.zn) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.le.ouw(zih.ouw()).ouw(this.bs);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        this.fkw = false;
        yu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        com.bytedance.sdk.openadsdk.component.lh lhVar;
        super.onResume();
        this.fkw = true;
        if (this.ouw.getAndSet(true)) {
            if (!this.jae.get()) {
                lh();
                return;
            }
            ryl();
            if (this.jqy && (lhVar = this.fvf) != null && lhVar.rn != null) {
                jg();
                this.fvf.rn.ouw(3);
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            this.f7693cf = this.pno != null ? od.ouw().ouw(this.pno) : -1;
            if (!TextUtils.isEmpty(this.f7699jg)) {
                bundle.putString("single_process_listener_key", this.f7699jg);
            }
            bundle.putBoolean("enable_new_arch", this.uoy);
            bundle.putInt("meta_index", this.f7693cf);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.tc);
            bundle.putInt("ad_source", this.f7696od);
            bundle.putLong("start_show_time", this.tlj);
        } catch (Throwable th2) {
            qbp.lh("TTAppOpenAdActivity", th2.getMessage());
        }
        if (!this.uoy) {
            ko = this.ksc;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.f7693cf >= 0) {
            od.ouw().vt(this.f7693cf);
            this.f7693cf = -1;
        }
        com.bytedance.sdk.openadsdk.utils.yu.ouw(this, this.pno);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (z3) {
            if (!this.f7697pd) {
                this.f7698th.yu();
            }
            vpp vppVar = this.pno;
            if (vppVar != null && vppVar.cj()) {
                vpp vppVar2 = this.pno;
                if (!vppVar2.vr) {
                    vppVar2.vr = true;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar2, "open_ad", vppVar2.f8304od);
                }
            }
        } else if (this.vm.get()) {
            if (this.f7698th.fkw()) {
                com.bytedance.sdk.openadsdk.yu.lh.ouw(String.valueOf(this.f7698th.lh()), this.pno, "open_ad", this.qbp);
            }
            this.f7698th = fak.vt();
        }
        com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.pno, z3 ? 4 : 8);
        com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(this.pno, z3);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final boolean ouw() {
        return true;
    }

    private boolean ko() {
        try {
            return getIntent().getIntExtra("orientation_angle", 0) == 3;
        } catch (Exception e2) {
            qbp.lh("TTAppOpenAdActivity", e2.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void le() {
        qbp.ouw("TTAppOpenAdActivity", "invoke callback onAdDismiss, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onAdTimeOver");
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.yu.vt vtVar = this.ksc;
        if (vtVar != null) {
            vtVar.lh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mwh() throws JSONException {
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar;
        com.bytedance.sdk.openadsdk.component.lh lhVar2;
        ko.ouw("TTAppOpenAdActivity", "open_ad", "onUserWantSkip() called");
        com.bytedance.sdk.openadsdk.core.jae.ouw(this.ex);
        ryl();
        if (this.jqy && (lhVar2 = this.fvf) != null && lhVar2.rn != null) {
            jg();
            this.fvf.rn.ouw(4);
        }
        vpp vppVar = this.pno;
        com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar = this.rn;
        com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(vppVar, (int) ouwVar.vt, this.zih.yu, ouwVar.ouw);
        vpp vppVar2 = this.pno;
        if (vppVar2 != null && (yuVarSd = vppVar2.sd()) != null && (yuVar = yuVarSd.ouw) != null) {
            com.bytedance.sdk.openadsdk.component.lh lhVar3 = this.fvf;
            long jFkw = (lhVar3 == null || (lhVar = lhVar3.rn) == null) ? 0L : lhVar.fkw();
            yuVar.fkw(jFkw);
            yuVar.yu(jFkw);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pno() {
        if (!this.jqy || this.pno.ra() || this.fak) {
            return;
        }
        this.vt.sendEmptyMessageDelayed(100, 5000L);
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void ra() {
        if (this.f7692cd != 2) {
            setRequestedOrientation(1);
        } else if (ko()) {
            setRequestedOrientation(8);
        } else {
            setRequestedOrientation(0);
        }
        if (this.f7692cd == 2 || !osn.lh((Activity) this)) {
            getWindow().addFlags(Segment.SHARE_MINIMUM);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ryl() {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onAdSkip");
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.yu.vt vtVar = this.ksc;
        if (vtVar != null) {
            vtVar.vt();
        }
    }

    private void tlj() throws JSONException {
        zih.yu();
        if (cf.rn(String.valueOf(this.ex)) == 1) {
            zih.yu();
            if (this.rn.vt >= cf.zih(String.valueOf(this.ex)) * 1000) {
                mwh();
            }
        }
    }

    public final void lh() {
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar;
        if (this.f7695lh.get()) {
            return;
        }
        if (this.jqy) {
            com.bytedance.sdk.openadsdk.component.lh lhVar2 = this.fvf;
            if (lhVar2 != null && (lhVar = lhVar2.rn) != null && lhVar.vt()) {
                this.fvf.rn.yu();
            }
            pno();
        }
        com.bytedance.sdk.openadsdk.component.le.vt vtVar = this.zih;
        if (vtVar != null) {
            vtVar.ouw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final void vt() throws JSONException {
        tlj();
    }

    public final void yu() {
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar;
        if (this.jqy) {
            com.bytedance.sdk.openadsdk.component.lh lhVar2 = this.fvf;
            if (lhVar2 != null && (lhVar = lhVar2.rn) != null && lhVar.ouw()) {
                this.fvf.rn.lh();
            }
            bly();
        }
        com.bytedance.sdk.openadsdk.component.le.vt vtVar = this.zih;
        if (vtVar != null) {
            vtVar.vt();
        }
    }

    public static /* synthetic */ void bly(TTAppOpenAdActivity tTAppOpenAdActivity) {
        int iZih;
        Log.d("TTAppOpenAdActivity", "startCountDownTimer() called");
        vpp vppVar = tTAppOpenAdActivity.pno;
        if (vppVar != null && vppVar.ouw() >= 0) {
            iZih = tTAppOpenAdActivity.pno.ouw();
        } else {
            zih.yu();
            iZih = cf.zih(String.valueOf(tTAppOpenAdActivity.ex));
        }
        com.bytedance.sdk.openadsdk.component.le.vt vtVar = tTAppOpenAdActivity.zih;
        int i4 = (int) tTAppOpenAdActivity.rn.ouw;
        vtVar.f7891lh = i4;
        if (i4 <= 0) {
            vtVar.f7891lh = 5;
        }
        vtVar.yu = Math.min(iZih, vtVar.f7891lh);
    }

    public static /* synthetic */ void cf(TTAppOpenAdActivity tTAppOpenAdActivity) {
        if (tTAppOpenAdActivity.vm.get()) {
            return;
        }
        try {
            tTAppOpenAdActivity.getWindow().getDecorView().post(tTAppOpenAdActivity.ey);
        } catch (Throwable unused) {
            tTAppOpenAdActivity.finish();
        }
    }

    private void ouw(final String str) {
        bs.fkw(new com.bytedance.sdk.component.pno.pno("AppOpenAd_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.6
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
                    if (tTAppOpenAdActivity.bly == null) {
                        tTAppOpenAdActivity.bly = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw().ouw(7));
                    }
                    tTAppOpenAdActivity.bly.executeAppOpenAdCallback(TTAppOpenAdActivity.this.tc, str);
                } catch (Throwable th2) {
                    qbp.yu("TTAppOpenAdActivity", "open_ad", "executeAppOpenAdCallback execute throw Exception : ", th2);
                }
            }
        });
    }

    private boolean ouw(Bundle bundle) {
        String stringExtra;
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            Intent intent = getIntent();
            if (intent != null) {
                String stringExtra2 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra2 != null) {
                    try {
                        this.pno = com.bytedance.sdk.openadsdk.core.vt.ouw(new JSONObject(stringExtra2));
                    } catch (Exception e2) {
                        qbp.yu("TTAppOpenAdActivity", "open_ad", "initData MultiGlobalInfo throws ", e2);
                    }
                }
                this.tc = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            }
        } else {
            this.pno = od.ouw().ouw(od.ouw(getIntent()));
            if (this.uoy) {
                if (bundle != null) {
                    stringExtra = bundle.getString("single_process_listener_key");
                } else {
                    stringExtra = getIntent() != null ? getIntent().getStringExtra("single_process_listener_key") : null;
                }
                this.f7699jg = stringExtra;
                this.ksc = (com.bytedance.sdk.openadsdk.ouw.yu.vt) od.ouw().ouw(this.f7699jg, com.bytedance.sdk.openadsdk.ouw.yu.vt.class);
            } else {
                this.ksc = od.ouw().yu;
            }
            od.ouw().vt();
        }
        Intent intent2 = getIntent();
        if (intent2 != null) {
            this.f7696od = intent2.getIntExtra("ad_source", 0);
            this.tlj = intent2.getLongExtra("start_show_time", 0L);
        }
        if (bundle != null) {
            if (!this.uoy && this.ksc == null) {
                this.ksc = ko;
                ko = null;
            }
            try {
                int i4 = bundle.getInt("meta_index", -1);
                this.tc = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
                this.f7696od = bundle.getInt("ad_source", 0);
                this.tlj = bundle.getLong("start_show_time", 0L);
                this.pno = od.ouw().ouw(i4);
            } catch (Throwable th2) {
                qbp.lh("TTAppOpenAdActivity", th2.getMessage());
            }
        }
        vpp vppVar = this.pno;
        if (vppVar == null) {
            ko.ouw("TTAppOpenAdActivity", "open_ad", "mMaterialMeta is null , no data to display ,the TTOpenAdActivity finished !!");
            finish();
            return false;
        }
        this.bs = vppVar.yiz;
        vppVar.ouw = this.tlj;
        this.ex = vppVar.fqk();
        com.bytedance.sdk.openadsdk.utils.vt.ouw(this.pno);
        return true;
    }

    public static /* synthetic */ void jg(TTAppOpenAdActivity tTAppOpenAdActivity) {
        ko.ouw("TTAppOpenAdActivity", "open_ad", "callbackAdClick() called");
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            tTAppOpenAdActivity.ouw("onAdClicked");
        } else {
            com.bytedance.sdk.openadsdk.ouw.yu.vt vtVar = tTAppOpenAdActivity.ksc;
            if (vtVar != null) {
                vtVar.onAdClicked();
            }
        }
        cf.vt();
        if (cf.qbp(String.valueOf(tTAppOpenAdActivity.ex)).uq) {
            tTAppOpenAdActivity.jae.set(true);
        }
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        com.bytedance.sdk.openadsdk.component.lh lhVar;
        if (message.what == 100) {
            if (this.jqy && (lhVar = this.fvf) != null && lhVar.rn != null) {
                jg();
                this.fvf.rn.ouw(1);
            }
            vpp vppVar = this.pno;
            if (vppVar != null && (yuVarSd = vppVar.sd()) != null && (yuVar = yuVarSd.ouw) != null) {
                yuVar.ouw(com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.GENERAL_LINEAR_AD_ERROR);
            }
            ryl();
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.InterfaceC0093ouw
    public final void ouw(int i4) {
        if (i4 == 2 || i4 == 3 || i4 == 4) {
            jg();
        }
    }

    public static /* synthetic */ JSONObject ouw(TTAppOpenAdActivity tTAppOpenAdActivity, JSONObject jSONObject) {
        if (tTAppOpenAdActivity.cf() == 0) {
            return tTAppOpenAdActivity.fvf.ouw(jSONObject);
        }
        return null;
    }
}
