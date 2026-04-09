package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import b9.b;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.ko;
import com.bytedance.sdk.openadsdk.common.ouw;
import com.bytedance.sdk.openadsdk.component.reward.ouw.cf;
import com.bytedance.sdk.openadsdk.component.reward.ouw.ko;
import com.bytedance.sdk.openadsdk.component.reward.ryl;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.cd;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.tc;
import com.bytedance.sdk.openadsdk.yu.tlj;
import com.bytedance.sdk.openadsdk.yu.vt;
import d.h;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class TTBaseVideoActivity extends TTBaseActivity implements jae.ouw, com.bytedance.sdk.openadsdk.core.mwh.yu.vt {
    int bly;

    /* renamed from: cf, reason: collision with root package name */
    protected boolean f7700cf;
    protected IListenerManager fkw;
    protected long ko;

    /* renamed from: le, reason: collision with root package name */
    int f7701le;

    /* renamed from: lh, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.component.reward.vt.vt f7702lh;
    public final String ouw;
    protected cd pno;
    private final cf.vt qbp;
    boolean ra;
    protected boolean rn;
    protected boolean ryl;

    /* renamed from: th, reason: collision with root package name */
    private int f7703th;
    protected boolean tlj;
    private boolean vm;
    private final AtomicBoolean vpp;
    com.bytedance.sdk.openadsdk.component.reward.ouw.ouw vt;
    final jae yu;
    private final AtomicBoolean zih;
    private int zin;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw implements Runnable {
        boolean ouw;
        AdSlot vt;

        public ouw(boolean z3, AdSlot adSlot) {
            this.ouw = z3;
            this.vt = adSlot;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.ouw) {
                ryl.ouw(zih.ouw()).ouw(this.vt);
            } else {
                com.bytedance.sdk.openadsdk.component.reward.fkw.ouw(zih.ouw()).ouw(this.vt);
            }
        }
    }

    public TTBaseVideoActivity() {
        this.ouw = zin() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.zih = new AtomicBoolean(false);
        this.yu = new jae(Looper.getMainLooper(), this);
        this.vm = false;
        this.f7703th = 0;
        this.bly = 1;
        this.qbp = new cf.vt();
        this.tlj = false;
        this.zin = -1;
        this.vpp = new AtomicBoolean(false);
    }

    private void pd() {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar;
        if (this.vt == null || (vtVar = this.f7702lh) == null) {
            super.onBackPressed();
        } else {
            vtVar.qbp();
        }
    }

    public void bly() {
        if (od.lh(this.vt.vt)) {
            ouw(false, false, vt.C0123vt.f8853lh);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f7702lh;
        if (vtVar != null) {
            vtVar.ouw(this.vt.ey.le());
            this.f7702lh.vpp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void bs() {
        this.tlj = true;
    }

    public void cd() {
        if (!this.vt.vt.ryl()) {
            if (!vpp.fkw(this.vt.vt)) {
                this.vt.ex.ouw("skip", true);
            }
            finish();
        } else if (!this.vt.vt.lh()) {
            this.vt.uoy.vt();
        } else if (this.vt.jae.fkw() == 1) {
            this.vt.uoy.vt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void cf() {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f7702lh;
        if (vtVar == null) {
            return;
        }
        vtVar.ryl();
    }

    public final void ex() {
        vpp vppVar;
        com.bytedance.sdk.openadsdk.core.model.cd cdVar;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null || (vppVar = ouwVar.vt) == null || (cdVar = vppVar.f8311tj) == null) {
            return;
        }
        int i4 = cdVar.vt;
        if (i4 == 1 || i4 == 2) {
            cd cdVar2 = new cd(ouwVar, vppVar);
            this.pno = cdVar2;
            ko koVar = this.vt.ex;
            if (koVar != null) {
                koVar.qbp = cdVar2;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.vt == null) {
            return;
        }
        if (tc.lh()) {
            osn.vt((Activity) this);
        }
        if (!od.fkw(this.vt.vt) || this.vt.ksc.lh(com.bytedance.sdk.openadsdk.component.reward.ouw.pno.f7971lh)) {
            return;
        }
        ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
    }

    public boolean jqy() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ko() {
        this.vt.ex.vpp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void lh(boolean z3) {
    }

    public abstract void mwh();

    public abstract FrameLayout od();

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null) {
            return;
        }
        ouwVar.f7964od.ouw();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        pd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar;
        super.onCreate(bundle);
        this.f7700cf = bundle != null ? bundle.getBoolean("enable_new_arch", false) : getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false);
        this.ko = SystemClock.elapsedRealtime();
        qbp.ouw("BVA", "onCreate enableIvRvNewArch->" + this.f7700cf + ",activity ->");
        zih.vt(getApplicationContext());
        if (!jg.fkw()) {
            finish();
            return;
        }
        vpp vppVarOuw = com.bytedance.sdk.openadsdk.component.reward.ouw.vt.ouw(getIntent(), bundle, this);
        if (vppVarOuw == null) {
            finish();
            return;
        }
        this.rn = com.bytedance.sdk.openadsdk.vpp.ouw.bly();
        qbp.ouw("BVA", "onCreate enableIvRvTopBarNewArch->" + this.rn);
        com.bytedance.sdk.openadsdk.utils.vt.ouw(vppVarOuw);
        this.ryl = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("adapt_decor_size", 0) == 1;
        qbp.ouw("BVA", "activity onCreate isAdaptDecorSize =" + this.ryl);
        vppVarOuw.rn = String.valueOf(hashCode());
        this.bly = vppVarOuw.jqy();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.component.reward.ouw.ouw(this, this.yu, vppVarOuw, this, 0, this.ryl);
        this.vt = ouwVar2;
        com.bytedance.sdk.openadsdk.component.reward.ouw.vt.ouw(ouwVar2, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent != null) {
            ouw(intent);
            vppVarOuw.ouw = intent.getLongExtra("start_show_time", 0L);
        }
        if (bundle != null && this.vt.xdk) {
            pno();
        }
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVarOuw = com.bytedance.sdk.openadsdk.component.reward.vt.le.ouw(this.vt);
        this.f7702lh = vtVarOuw;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.vt;
        ouwVar3.coz = vtVarOuw;
        com.bytedance.sdk.openadsdk.utils.ko.ouw(ouwVar3);
        com.bytedance.sdk.component.utils.ko.vt("TTAD.BVA", "init: mAdType = " + this.f7702lh);
        if (bundle != null) {
            com.bytedance.sdk.component.utils.ko.vt("TTAD.BVA", "onCreate: rebuild back");
            if (vppVarOuw.elx) {
                this.vpp.set(true);
            }
            if (vppVarOuw.bu && (ouwVar = this.vt) != null) {
                ouwVar.mwh.set(true);
            }
            tlj.ouw(vppVarOuw, "activity_recreate", vppVarOuw.vt(), "activity_recreate", null);
        }
        try {
            lh();
            this.f7702lh.jqy();
            this.f7701le = (int) this.vt.ex.zin();
            if (this.rn) {
                ko.ouw ouwVar4 = new ko.ouw(this.vt, "TTAD.BVA", new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        TTBaseVideoActivity.this.finish();
                    }
                }, new ouw.vt() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.2
                    @Override // com.bytedance.sdk.openadsdk.common.ouw.vt
                    public final void ouw() {
                        TTBaseVideoActivity.this.ouw(true, 4);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.ouw.vt
                    public final void vt() {
                        TTBaseVideoActivity.this.finish();
                    }
                });
                ouwVar4.fkw = !zin();
                ouwVar4.f7836le = yu();
                com.bytedance.sdk.openadsdk.common.ouw.ouw(ouwVar4.ouw());
            } else {
                qbp();
            }
            bly();
            com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = this.vt.vt.sd();
            if (yuVarSd == null || (yuVar = yuVarSd.ouw) == null) {
                return;
            }
            yuVar.ouw();
        } catch (Throwable th2) {
            qbp.ouw("TTAD.BVA", "onCreate: ", th2);
            tlj.ouw(vppVarOuw, "show_ad_fail", this.ouw, "init_view_crash");
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        qbp.ouw("BVA", "onDestroy ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null || this.f7702lh == null) {
            return;
        }
        if (ouwVar.myk > 0 && ouwVar.mwh.get()) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.vt.myk);
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.vt;
            com.bytedance.sdk.openadsdk.yu.lh.ouw(strValueOf, ouwVar2.vt, this.ouw, ouwVar2.ex.zin);
            this.vt.myk = 0L;
        }
        TTAdDislikeToast tTAdDislikeToast = this.vt.f7965pd.f7951lh;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.onDestroy();
        }
        this.yu.removeCallbacksAndMessages(null);
        this.f7702lh.th();
        com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.vt.vt);
        com.bytedance.sdk.openadsdk.tc.ouw.lh.vt(this.vt.vt);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.vt;
        AdSlot adSlot = ouwVar3.vt.yiz;
        if (!ouwVar3.ex.yu && adSlot != null && TextUtils.isEmpty(adSlot.getBidAdm()) && !this.vt.vt.zn) {
            jg.vt().post(new ouw(zin(), adSlot));
        }
        com.bytedance.sdk.openadsdk.utils.ko.ouw();
        cd cdVar = this.pno;
        if (cdVar != null) {
            cdVar.vt();
            this.pno = null;
        }
        this.qbp.ouw(this);
        com.bytedance.sdk.openadsdk.core.osn.ouw().ouw(String.valueOf(hashCode()));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        qbp.ouw("BVA", "onPause ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f7702lh;
        if (vtVar == null) {
            return;
        }
        vtVar.zih();
    }

    @Override // android.app.Activity
    public void onRestart() {
        vpp vppVar;
        super.onRestart();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null || (vppVar = ouwVar.vt) == null) {
            return;
        }
        if (this.mwh && !vppVar.cp && !TextUtils.isEmpty(vpp.ouw(this, vppVar))) {
            finish();
        }
        if (vppVar.cp) {
            vppVar.cp = false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar;
        super.onResume();
        qbp.ouw("BVA", "onResume ".concat(String.valueOf(this)));
        if (this.vt == null || (vtVar = this.f7702lh) == null) {
            return;
        }
        vtVar.rn();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        ouwVar.pv = true;
        this.qbp.ouw(this, ouwVar.ucs, ouwVar.f7969vh, this.ryl);
        if ((this.vt.tlj.get() && this.vt.ra) ? false : ((this instanceof TTFullScreenExpressVideoActivity) || (this instanceof TTRewardExpressVideoActivity)) ? this.vt.tlj.get() : true) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.vt;
            ouwVar2.uoy.ouw(ouwVar2.vt.ksc());
        }
        this.vt.ey.ko();
        this.vt.bs.tlj();
        this.vt.ksc.lh();
        if (this.f7702lh.vt()) {
            this.vt.ex.ouw(this.f7702lh);
            this.vt.ex.ouw(this, this.f7703th != 0);
        }
        this.f7703th++;
        if (jqy() && !this.vm) {
            this.vm = true;
            getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.3
                @Override // java.lang.Runnable
                public final void run() {
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = tTBaseVideoActivity.vt;
                    ouwVar3.uq.ouw(ouwVar3.f7964od.ouw(tTBaseVideoActivity.bly));
                    TTBaseVideoActivity.this.jg();
                }
            });
        }
        com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar = this.vt.jae;
        if (tljVar != null) {
            tljVar.lh();
        }
        this.vt.f7964od.ouw(this.yu);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        if (ouwVar.mwh.get()) {
            this.vt.vt.bu = true;
        }
        if (this.vpp.get()) {
            this.vt.vt.elx = true;
        }
        if (!TextUtils.isEmpty(this.f7699jg)) {
            bundle.putString("single_process_listener_key", this.f7699jg);
        }
        bundle.putBoolean("enable_new_arch", this.f7700cf);
        vpp vppVar = this.vt.vt;
        int iOuw = vppVar != null ? com.bytedance.sdk.openadsdk.core.od.ouw().ouw(vppVar) : -1;
        this.zin = iOuw;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.vt;
        try {
            com.bytedance.sdk.component.utils.ko.vt("BVA", "onSaveInstanceState metaIndex =".concat(String.valueOf(iOuw)));
            bundle.putInt("meta_index", iOuw);
            bundle.putString("multi_process_listener_key", ouwVar2.f7968ub);
            bundle.putBoolean("video_is_cached", ouwVar2.ex.yu);
            bundle.putLong("video_current", ouwVar2.ex.fkw());
            bundle.putBoolean("is_mute", ouwVar2.f7958cj);
            bundle.putBoolean("has_show_skip_btn", ouwVar2.xdk);
        } catch (Throwable th2) {
            qbp.ouw("TTAD.RFDM", "onSaveInstanceState: ", th2);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        qbp.ouw("BVA", "onStart mMetaIndex =" + this.zin + " this =" + this);
        if (this.zin >= 0) {
            com.bytedance.sdk.openadsdk.core.od.ouw().vt(this.zin);
            this.zin = -1;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null) {
            return;
        }
        ouwVar.bs.rn();
        com.bytedance.sdk.openadsdk.utils.yu.ouw(this, this.vt.vt);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        qbp.ouw("BVA", "onStop ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f7702lh;
        if (vtVar == null) {
            return;
        }
        vtVar.vm();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z3) {
        com.bytedance.sdk.openadsdk.component.reward.ouw.tlj tljVar;
        super.onWindowFocusChanged(z3);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null || (tljVar = ouwVar.f7956cd) == null) {
            return;
        }
        tljVar.vt(z3);
        this.vt.f7956cd.lh(z3);
    }

    public abstract void ouw(long j, long j8);

    public void ouw(Intent intent) {
    }

    public abstract void pno();

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final List<vpp> pv() {
        return this.vt.vt.vm.yu;
    }

    public abstract void qbp();

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final View rn() {
        return this.vt.ex.jqy();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ryl() {
        cf();
    }

    public final void th() {
        this.yu.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void tlj() {
        if (this.vpp.compareAndSet(false, true)) {
            qbp.ouw("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
            mwh();
        }
    }

    public Map<String, Object> uq() {
        return null;
    }

    public abstract boolean vpp();

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final void vt() {
        pd();
    }

    public abstract com.bytedance.sdk.openadsdk.common.zih yu();

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void zih() {
        if (!this.vt.f7960jg.getAndSet(true) || od.lh(this.vt.vt)) {
            this.vt.f7956cd.ouw();
        }
    }

    public abstract boolean zin();

    public void lh() {
        setContentView(this.vt.rrs);
        this.vt.rrs.ouw(this.f7702lh);
        this.f7702lh.ouw(this, this.yu);
        this.f7702lh.cf();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final boolean ouw() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public void ouw(Bundle bundle) {
        if (!this.f7700cf || com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            return;
        }
        if (bundle != null) {
            this.f7699jg = bundle.getString("single_process_listener_key");
        } else if (getIntent() != null) {
            this.f7699jg = getIntent().getStringExtra("single_process_listener_key");
        } else {
            this.f7699jg = "";
        }
    }

    public final void ouw(boolean z3, int i4) {
        ouw(z3, false, i4);
    }

    public final void ouw(boolean z3, boolean z10, int i4) {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f7702lh;
        if (vtVar == null) {
            return;
        }
        vtVar.ouw(z3, z10, false, i4);
    }

    public final void ouw(boolean z3, boolean z10) {
        if (!this.f7700cf || TextUtils.isEmpty(this.f7699jg)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.od.ouw().ouw(this.f7699jg, z3, z10);
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f7702lh;
        if (vtVar == null) {
            return;
        }
        vtVar.ouw(message);
    }

    public final IListenerManager ouw(int i4) {
        if (this.fkw == null) {
            this.fkw = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw().ouw(i4));
        }
        return this.fkw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final boolean ouw(long j, boolean z3) {
        com.bytedance.sdk.openadsdk.yu.ra raVar;
        com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar;
        th thVar;
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        if (this.vt == null) {
            return false;
        }
        this.zih.set(false);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar.vt.lh()) {
            com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar = ouwVar.jae;
            if (tljVar != null && (yuVar = tljVar.ouw) != null) {
                raVar = yuVar.getAdShowTime();
            } else {
                raVar = new com.bytedance.sdk.openadsdk.yu.ra();
                raVar.ouw(System.currentTimeMillis(), 1.0f);
            }
        } else {
            raVar = new com.bytedance.sdk.openadsdk.yu.ra();
            raVar.ouw(System.currentTimeMillis(), 1.0f);
        }
        FrameLayout frameLayoutOd = od();
        if (frameLayoutOd == null) {
            return false;
        }
        this.vt.ex.ouw(frameLayoutOd, raVar);
        Map<String, Object> mapUq = uq();
        b bVar = new b() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.4
            @Override // b9.b
            public final void ouw(long j8, int i4) {
                com.bytedance.sdk.openadsdk.utils.jg jgVar;
                com.bytedance.sdk.openadsdk.utils.jg jgVar2;
                qbp.ouw("TTAD.BVA", "onComplete() called with: totalPlayTime = [" + j8 + "], percent = [" + i4 + "], mVideoHasCompleted=" + TTBaseVideoActivity.this.zih.get());
                if (TTBaseVideoActivity.this.zih.getAndSet(true)) {
                    return;
                }
                TTBaseVideoActivity.this.zih.set(true);
                TTBaseVideoActivity.this.yu.removeMessages(300);
                TTBaseVideoActivity.this.th();
                TTBaseVideoActivity.this.tc();
                TTBaseVideoActivity.this.vt.ex.ouw(j8, j8);
                if (TTBaseVideoActivity.this.jqy()) {
                    TTBaseVideoActivity.this.vt.jae.fkw = true;
                } else {
                    TTBaseVideoActivity.this.vt.f7967th.set(true);
                }
                TTBaseVideoActivity.this.jae();
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = TTBaseVideoActivity.this.vt;
                vpp vppVar = ouwVar2.vt;
                if (vppVar.fvf == 36 && ouwVar2.f7962lh) {
                    ouwVar2.tc.f7993lh.ouw(vppVar);
                    com.bytedance.sdk.openadsdk.utils.ko.vt();
                }
                if (!TTBaseVideoActivity.this.jqy() && TTBaseVideoActivity.this.vt.vt.ub()) {
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = TTBaseVideoActivity.this.vt;
                    ouwVar3.vt.ycd = 1;
                    ouwVar3.ey.zih();
                }
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = TTBaseVideoActivity.this.vt;
                vpp vppVar2 = ouwVar4.vt;
                if (vppVar2.fvf == 21 && !vppVar2.mq) {
                    vppVar2.an = true;
                    ouwVar4.ey.zih();
                }
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.tlj) {
                    com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar2 = tTBaseVideoActivity.vt.jae.ouw;
                    if (yuVar2 != null ? yuVar2.fvf instanceof com.bytedance.sdk.component.adexpress.fkw.ouw : false) {
                        return;
                    }
                }
                if (!tTBaseVideoActivity.jqy()) {
                    if (th.yu(TTBaseVideoActivity.this.vt.vt) || th.vt(TTBaseVideoActivity.this.vt.vt) || th.ra(TTBaseVideoActivity.this.vt.vt)) {
                        TTBaseVideoActivity.this.ouw(false, 5);
                        if (!th.vt(TTBaseVideoActivity.this.vt.vt) || (jgVar2 = TTBaseVideoActivity.this.vt.f7966sd) == null) {
                            return;
                        }
                        jgVar2.ouw(0L);
                        return;
                    }
                    if (th.ouw(TTBaseVideoActivity.this.vt.vt) && !TTBaseVideoActivity.this.vt.rn.get()) {
                        TTBaseVideoActivity.this.vt.ouw(true);
                        TTBaseVideoActivity.this.vt.uoy.fkw(true);
                        return;
                    }
                }
                TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar5 = tTBaseVideoActivity2.vt;
                if (!ouwVar5.f7962lh) {
                    tTBaseVideoActivity2.cd();
                    return;
                }
                if (ouwVar5.vt.ryl()) {
                    if (!TTBaseVideoActivity.this.jqy()) {
                        TTBaseVideoActivity.this.vt.uoy.vt();
                        return;
                    } else {
                        if (TTBaseVideoActivity.this.vt.jae.fkw() == 1) {
                            TTBaseVideoActivity.this.vt.uoy.vt();
                            return;
                        }
                        return;
                    }
                }
                TTBaseVideoActivity.this.ouw(false, 5);
                if (!TTBaseVideoActivity.this.jqy() && th.vt(TTBaseVideoActivity.this.vt.vt) && (jgVar = TTBaseVideoActivity.this.vt.f7966sd) != null) {
                    jgVar.ouw(0L);
                }
                if (vpp.fkw(TTBaseVideoActivity.this.vt.vt)) {
                    return;
                }
                TTBaseVideoActivity.this.vt.ex.ouw("skip", true);
            }

            @Override // b9.b
            public final void vt(long j8, int i4) {
                th thVar2;
                TTBaseVideoActivity.this.yu.removeMessages(300);
                com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar2 = TTBaseVideoActivity.this.vt.ey;
                if (rylVar2 != null && (thVar2 = rylVar2.rn) != null) {
                    thVar2.le();
                }
                if (TTBaseVideoActivity.this.vt.ex.ouw()) {
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    Message message = new Message();
                    message.what = 400;
                    if (tTBaseVideoActivity.zin()) {
                        tTBaseVideoActivity.jvy();
                    }
                    tTBaseVideoActivity.yu.sendMessageDelayed(message, 2000L);
                    return;
                }
                TTBaseVideoActivity.this.vt.ex.tlj();
                TTBaseVideoActivity.this.tc();
                if (TTBaseVideoActivity.this.vt.vt.lh()) {
                    TTBaseVideoActivity.this.vt.jae.yu = true;
                }
                TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                if (!tTBaseVideoActivity2.vt.f7962lh) {
                    tTBaseVideoActivity2.finish();
                    return;
                }
                tTBaseVideoActivity2.ouw(false, true, 3);
                com.bytedance.sdk.openadsdk.component.reward.ouw.ko koVar = TTBaseVideoActivity.this.vt.ex;
                koVar.ouw(1 ^ (koVar.qbp() ? 1 : 0), 2);
            }

            @Override // b9.b
            public final void ouw() {
                TTBaseVideoActivity.this.yu.removeMessages(300);
                TTBaseVideoActivity.this.th();
                TTBaseVideoActivity.this.tc();
                com.bytedance.sdk.component.utils.ko.ouw("TTAD.BVA", "fullscreen_interstitial_ad", "onTimeOut、、、、、、、、");
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.vt.f7962lh) {
                    tTBaseVideoActivity.ouw(false, true, 6);
                } else {
                    tTBaseVideoActivity.finish();
                }
                com.bytedance.sdk.openadsdk.component.reward.ouw.ko koVar = TTBaseVideoActivity.this.vt.ex;
                koVar.ouw(!koVar.qbp() ? 1 : 0, !TTBaseVideoActivity.this.vt.ex.qbp() ? 1 : 0);
                TTBaseVideoActivity.this.vt.ex.tlj();
            }

            @Override // b9.b
            public final void ouw(long j8, long j9) {
                int i4;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = TTBaseVideoActivity.this.vt;
                if (!ouwVar2.pv && ouwVar2.ex.ouw()) {
                    TTBaseVideoActivity.this.vt.ex.ryl();
                }
                if (TTBaseVideoActivity.this.vt.tlj.get()) {
                    return;
                }
                TTBaseVideoActivity.this.yu.removeMessages(300);
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (j8 != tTBaseVideoActivity.vt.ex.pno) {
                    tTBaseVideoActivity.th();
                }
                if (!TTBaseVideoActivity.this.jqy() || TTBaseVideoActivity.this.vt.ex.ouw()) {
                    TTBaseVideoActivity.this.vt.ex.ouw(j8, j9);
                    TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                    long j10 = j8 / 1000;
                    tTBaseVideoActivity2.f7701le = (int) (tTBaseVideoActivity2.vt.ex.zin() - j10);
                    int i10 = (int) j10;
                    if ((TTBaseVideoActivity.this.vt.qbp.get() || TTBaseVideoActivity.this.vt.f7957cf.get()) && TTBaseVideoActivity.this.vt.ex.ouw()) {
                        TTBaseVideoActivity.this.vt.ex.ryl();
                    }
                    if (TTBaseVideoActivity.this.zin()) {
                        TTBaseVideoActivity.this.vt.ey.fkw(i10);
                    }
                    if (TTBaseVideoActivity.this.vpp()) {
                        TTBaseVideoActivity tTBaseVideoActivity3 = TTBaseVideoActivity.this;
                        com.bytedance.sdk.openadsdk.component.reward.ouw.ko koVar = tTBaseVideoActivity3.vt.ex;
                        if (!koVar.f7950th ? !(!koVar.zih || ((i4 = koVar.vm) != 2 && i4 != 1)) : !(!koVar.zih || koVar.vm != 1)) {
                            StringBuilder sbY = h.y(j8, "onProgressUpdate() called with: current = [", "], duration = [");
                            sbY.append(j9);
                            sbY.append("]");
                            com.bytedance.sdk.component.utils.ko.vt("TTAD.BVA", sbY.toString());
                            cd cdVar = TTBaseVideoActivity.this.pno;
                            if (cdVar != null) {
                                int iCeil = (int) Math.ceil(j8 / 1000.0d);
                                if (cdVar.f8694lh && !cdVar.yu) {
                                    cdVar.fkw = iCeil;
                                    cdVar.ouw();
                                    return;
                                } else {
                                    if (cdVar.vt || cdVar.yu) {
                                        return;
                                    }
                                    cdVar.fkw = iCeil;
                                    cdVar.vt = true;
                                    cdVar.ouw.sendEmptyMessage(Segment.SHARE_MINIMUM);
                                    cdVar.f8694lh = false;
                                    return;
                                }
                            }
                            return;
                        }
                        cd cdVar2 = tTBaseVideoActivity3.pno;
                        if (cdVar2 == null || !cdVar2.vt) {
                            tTBaseVideoActivity3.ouw(j8, j9);
                            return;
                        }
                        return;
                    }
                    TTBaseVideoActivity.this.ouw(j8, j9);
                }
            }
        };
        this.vt.ex.ouw(bVar);
        if (!this.vt.vt.lh() && (rylVar = this.vt.ey) != null && (thVar = rylVar.rn) != null) {
            thVar.uoy = bVar;
        }
        boolean zOuw = this.vt.ex.ouw(j, z3, mapUq, this.f7702lh);
        ksc();
        return zOuw;
    }

    public void jae() {
    }

    public void jg() {
    }

    public void ksc() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void le() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ra() {
    }

    public void tc() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public void vm() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void wp() {
    }
}
