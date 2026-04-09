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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.common.emc;
import com.bytedance.sdk.openadsdk.common.qh;
import com.bytedance.sdk.openadsdk.component.reward.aa;
import com.bytedance.sdk.openadsdk.component.reward.emc.gbl;
import com.bytedance.sdk.openadsdk.component.reward.vk;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.xmt;
import com.bytedance.sdk.openadsdk.core.mxo;
import com.bytedance.sdk.openadsdk.dg.ru;
import com.bytedance.sdk.openadsdk.dg.ypw;
import com.bytedance.sdk.openadsdk.utils.cf;
import com.bytedance.sdk.openadsdk.utils.lt;
import com.bytedance.sdk.openadsdk.utils.sb;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import s2.b;

/* loaded from: classes.dex */
public abstract class TTBaseVideoActivity extends TTBaseActivity implements sf.emc, com.bytedance.sdk.openadsdk.core.sz.dg.ypw {

    /* renamed from: aa, reason: collision with root package name */
    private final AtomicBoolean f9245aa;
    protected IListenerManager bw;
    protected long cf;
    final sf dg;
    public final String emc;
    int gbl;
    protected lt msw;
    protected boolean qh;
    private boolean sba;
    protected boolean sup;
    protected boolean sz;
    private final gbl.ypw ul;
    boolean uym;
    protected boolean vk;

    @Nullable
    protected com.bytedance.sdk.openadsdk.component.reward.ypw.ypw xq;
    int ycc;
    private int ylm;
    com.bytedance.sdk.openadsdk.component.reward.emc.emc ypw;
    private int yzg;

    public static class emc implements Runnable {
        boolean emc;
        AdSlot ypw;

        public emc(boolean z10, AdSlot adSlot) {
            this.emc = z10;
            this.ypw = adSlot;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.emc) {
                if (com.bytedance.sdk.openadsdk.utils.ypw.ypw()) {
                    aa.emc(com.bytedance.sdk.openadsdk.core.aa.emc()).emc(this.ypw);
                    return;
                } else {
                    vk.emc(com.bytedance.sdk.openadsdk.core.aa.emc()).emc(this.ypw);
                    return;
                }
            }
            if (com.bytedance.sdk.openadsdk.utils.ypw.ypw()) {
                com.bytedance.sdk.openadsdk.component.reward.uym.emc(com.bytedance.sdk.openadsdk.core.aa.emc()).emc(this.ypw);
            } else {
                com.bytedance.sdk.openadsdk.component.reward.ycc.emc(com.bytedance.sdk.openadsdk.core.aa.emc()).emc(this.ypw);
            }
        }
    }

    public TTBaseVideoActivity() {
        this.emc = hxp() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.f9245aa = new AtomicBoolean(false);
        this.dg = new sf(Looper.getMainLooper(), this);
        this.sba = false;
        this.yzg = 0;
        this.gbl = 1;
        this.ul = new gbl.ypw();
        this.sup = false;
        this.ylm = -1;
    }

    private void mxo() {
        com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
        this.xq.hxp();
        this.ycc = (int) this.ypw.ylm.iyl();
        if (this.vk) {
            com.bytedance.sdk.openadsdk.common.emc.ypw(new qh.emc(this.ypw, "TTAD.BVA", new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity.this.finish();
                }
            }, new emc.ypw() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.2
                @Override // com.bytedance.sdk.openadsdk.common.emc.ypw
                public void emc(boolean z10, int i10) {
                    TTBaseVideoActivity.this.emc(z10, i10);
                }

                @Override // com.bytedance.sdk.openadsdk.common.emc.ypw
                public void emc() {
                    TTBaseVideoActivity.this.finish();
                }
            }).emc(msw()).emc(zz()).emc());
        } else {
            rie();
        }
        qh();
        com.bytedance.sdk.openadsdk.core.model.dg dgVarEh = this.ypw.ypw.eh();
        if (dgVarEh == null || (dgVarEmc = dgVarEh.emc()) == null) {
            return;
        }
        dgVarEmc.emc(0L);
    }

    private void tp() {
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar;
        if (this.ypw == null || (ypwVar = this.xq) == null) {
            super.onBackPressed();
        } else {
            ypwVar.ul();
        }
    }

    private boolean vw() {
        if ((this instanceof TTFullScreenExpressVideoActivity) || (this instanceof TTRewardExpressVideoActivity)) {
            return this.ypw.zz.get();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void aa() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void bw() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void cf() {
        this.ypw.ylm.mxo();
    }

    public void cuf() {
        if (!this.ypw.ypw.but()) {
            if (!rie.bw(this.ypw.ypw)) {
                this.ypw.ylm.emc("skip", true);
            }
            finish();
        } else if (!this.ypw.ypw.ycc()) {
            this.ypw.cuf.xq();
        } else if (this.ypw.hxp.gbl() == 1) {
            this.ypw.cuf.xq();
        }
    }

    public boolean db() {
        return false;
    }

    public abstract void dg();

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void dg(boolean z10) {
    }

    public void dr() {
    }

    public abstract boolean ee();

    public abstract void emc(long j10, long j11);

    public void emc(@NonNull Intent intent) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public List<rie> ffd() {
        return this.ypw.ypw.ji();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.ypw == null) {
            return;
        }
        if (sb.bw()) {
            vw.ypw((Activity) this);
        }
        if (!dr.bw(this.ypw.ypw) || this.ypw.rie.dg(com.bytedance.sdk.openadsdk.component.reward.emc.msw.ypw)) {
            return;
        }
        ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void fu() {
        this.ypw.db.emc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void gbl() {
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar = this.xq;
        if (ypwVar == null) {
            return;
        }
        ypwVar.gbl();
    }

    public abstract boolean hxp();

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void lt() {
        this.sup = true;
    }

    public boolean msw() {
        return !hxp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void ndl() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
        if (emcVar == null) {
            return;
        }
        emcVar.ee.emc();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        tp();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.sz = bundle != null ? bundle.getBoolean("enable_new_arch", false) : getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false);
        this.cf = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.core.aa.ypw(getApplicationContext());
        if (!com.bytedance.sdk.openadsdk.core.qh.bw()) {
            finish();
            return;
        }
        rie rieVarEmc = com.bytedance.sdk.openadsdk.component.reward.emc.ypw.emc(getIntent(), bundle, this);
        if (rieVarEmc == null) {
            finish();
            return;
        }
        this.vk = com.bytedance.sdk.openadsdk.sra.emc.ru();
        com.bytedance.sdk.openadsdk.utils.ypw.emc(rieVarEmc);
        this.qh = com.bytedance.sdk.openadsdk.sra.emc.emc("adapt_decor_size", 0) == 1;
        rieVarEmc.iyl(String.valueOf(hashCode()));
        this.gbl = rieVarEmc.ono();
        emc(rieVarEmc, bundle);
        if (bundle != null) {
            ru.emc(rieVarEmc, "activity_recreate", rieVarEmc.bw(), "activity_recreate", null);
        }
        try {
            xq();
            mxo();
        } catch (Throwable th) {
            ul.emc("TTAD.BVA", "onCreate: ", th);
            ru.emc(rieVarEmc, "show_ad_fail", this.emc, "init_view_crash");
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        rie rieVar;
        super.onDestroy();
        toString();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
        if (emcVar == null || this.xq == null) {
            return;
        }
        if (emcVar.hj > 0 && (rieVar = emcVar.ypw) != null && rieVar.yz()) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.ypw.hj);
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.ypw;
            com.bytedance.sdk.openadsdk.dg.xq.emc(strValueOf, emcVar2.ypw, this.emc, emcVar2.ylm.bw());
            this.ypw.hj = 0L;
        }
        this.ypw.sf.ypw();
        this.dg.removeCallbacksAndMessages(null);
        this.xq.yzg();
        com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(this.ypw.ypw);
        com.bytedance.sdk.openadsdk.ee.emc.xq.ypw(this.ypw.ypw);
        AdSlot adSlotVaf = this.ypw.ypw.vaf();
        if (!this.ypw.ylm.lt() && adSlotVaf != null && TextUtils.isEmpty(adSlotVaf.getBidAdm()) && !this.ypw.ypw.wh()) {
            com.bytedance.sdk.openadsdk.core.qh.ypw().post(new emc(hxp(), adSlotVaf));
        }
        cf.emc();
        lt ltVar = this.msw;
        if (ltVar != null) {
            ltVar.bw();
            this.msw = null;
        }
        this.ul.emc(this);
        mxo.emc().emc(String.valueOf(hashCode()));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        toString();
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar = this.xq;
        if (ypwVar == null) {
            return;
        }
        ypwVar.aa();
    }

    @Override // android.app.Activity
    public void onRestart() {
        rie rieVar;
        super.onRestart();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
        if (emcVar == null || (rieVar = emcVar.ypw) == null) {
            return;
        }
        if (this.zz && !rieVar.wdg() && !TextUtils.isEmpty(rie.emc(this, rieVar))) {
            finish();
        }
        if (rieVar.wdg()) {
            rieVar.sz(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar;
        super.onResume();
        toString();
        if (this.ypw == null || (ypwVar = this.xq) == null) {
            return;
        }
        ypwVar.cf();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
        emcVar.wpn = true;
        this.ul.emc(this, emcVar.rqm, emcVar.wad, this.qh);
        if (vw()) {
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.ypw;
            emcVar2.cuf.emc(emcVar2.ypw.lr());
        }
        this.ypw.mkp.cf();
        this.ypw.xmt.aa();
        this.ypw.rie.bw();
        if (this.xq.ypw()) {
            this.ypw.ylm.emc(this.xq);
            this.ypw.ylm.emc(false, this, this.yzg != 0);
        }
        this.yzg++;
        yzg();
        com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar = this.ypw.hxp;
        if (zzVar != null) {
            zzVar.uym();
        }
        this.ypw.ee.emc(this.dg);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (this.ypw == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        if (!TextUtils.isEmpty(this.ru)) {
            bundle.putString("single_process_listener_key", this.ru);
        }
        bundle.putBoolean("enable_new_arch", this.sz);
        rie rieVar = this.ypw.ypw;
        int iEmc = rieVar != null ? com.bytedance.sdk.openadsdk.core.sf.emc().emc(rieVar) : -1;
        this.ylm = iEmc;
        com.bytedance.sdk.openadsdk.component.reward.emc.ypw.emc(this.ypw, bundle, iEmc);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        toString();
        if (this.ylm >= 0) {
            com.bytedance.sdk.openadsdk.core.sf.emc().xq(this.ylm);
            this.ylm = -1;
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
        if (emcVar == null) {
            return;
        }
        emcVar.xmt.db();
        com.bytedance.sdk.openadsdk.utils.dg.emc(this, this.ypw.ypw);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        toString();
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar = this.xq;
        if (ypwVar == null) {
            return;
        }
        ypwVar.sba();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.emc.ru ruVar;
        super.onWindowFocusChanged(z10);
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
        if (emcVar == null || (ruVar = emcVar.db) == null) {
            return;
        }
        ruVar.ypw(z10);
        this.ypw.db.xq(z10);
    }

    public void qh() {
        if (dr.xq(this.ypw.ypw)) {
            emc(false, ypw.C0174ypw.xq);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar = this.xq;
        if (ypwVar != null) {
            ypwVar.emc(this.ypw.mkp.ycc());
            this.xq.rie();
        }
    }

    public abstract void rie();

    public Map<String, Object> rtt() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public final void ru() {
        rie rieVar;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
        if (emcVar == null || (rieVar = emcVar.ypw) == null || rieVar.vw()) {
            return;
        }
        toString();
        this.ypw.ypw.uym(true);
        sba();
    }

    public void sb() {
        rie rieVar;
        xmt xmtVarPdk;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
        if (emcVar == null || (rieVar = emcVar.ypw) == null || (xmtVarPdk = rieVar.pdk()) == null) {
            return;
        }
        if (xmtVarPdk.ypw() == 1 || xmtVarPdk.ypw() == 2) {
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.ypw;
            lt ltVar = new lt(emcVar2, emcVar2.ypw);
            this.msw = ltVar;
            com.bytedance.sdk.openadsdk.component.reward.emc.cf cfVar = this.ypw.ylm;
            if (cfVar != null) {
                cfVar.emc(ltVar);
            }
        }
    }

    public abstract void sba();

    public void sf() {
    }

    public void sra() {
        this.dg.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void sup() {
        gbl();
    }

    public abstract void sz();

    public void ul() {
    }

    public void uym() {
        if (com.bytedance.sdk.openadsdk.sra.emc.msw() && isChangingConfigurations()) {
            ul.emc("BVA", "callback close is invoke by config change.");
            return;
        }
        if (this.uym) {
            ul.emc("BVA", "invoke callback onAdClose has already been called ");
            return;
        }
        this.uym = true;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
        rie rieVar = emcVar != null ? emcVar.ypw : null;
        if (rieVar != null && !rieVar.yz()) {
            long jZz = rieVar.zz();
            if (jZz > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - jZz;
                if (jElapsedRealtime > 0) {
                    rieVar.ypw(jElapsedRealtime);
                }
            }
            this.ypw.emc(BackupConstant.CLOSE_NOT_SHOW_CODE, BackupConstant.CLOSE_NOT_SHOW_CODE_MSG, BackupConstant.SCENE_CLOSED_WITHOUT_SHOW);
            this.ypw.db.emc();
        }
        ycc();
        dg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public View vk() {
        return this.ypw.ylm.tp();
    }

    public abstract FrameLayout xmt();

    public void xq() {
        setContentView(this.ypw.iyl);
        this.ypw.iyl.emc(this.xq);
        this.xq.emc(this, this.dg);
        this.xq.ru();
    }

    public abstract void ycc();

    public void ylm() {
        Message message = new Message();
        message.what = 400;
        if (hxp()) {
            ypw(10000);
        }
        this.dg.sendMessageDelayed(message, 2000L);
    }

    public void ypw(boolean z10, boolean z11) {
    }

    public void yzg() {
        if (db() && !this.sba) {
            this.sba = true;
            getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = tTBaseVideoActivity.ypw;
                    emcVar.sb.emc(emcVar.ee.emc(tTBaseVideoActivity.gbl));
                    TTBaseVideoActivity.this.ul();
                }
            });
        }
    }

    public abstract com.bytedance.sdk.openadsdk.common.vk zz();

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void emc(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public void ypw() {
        tp();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public boolean emc() {
        return true;
    }

    private void emc(rie rieVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = new com.bytedance.sdk.openadsdk.component.reward.emc.emc(this, this.dg, rieVar, this, 0, this.qh);
        this.ypw = emcVar;
        com.bytedance.sdk.openadsdk.component.reward.emc.ypw.emc(emcVar, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent != null) {
            emc(intent);
            rieVar.emc(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.ypw.ndl) {
            sz();
        }
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVarEmc = com.bytedance.sdk.openadsdk.component.reward.ypw.ycc.emc(this.ypw);
        this.xq = ypwVarEmc;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.ypw;
        emcVar2.cn = ypwVarEmc;
        cf.emc(emcVar2);
        Objects.toString(this.xq);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void emc(Bundle bundle) {
        if (!this.sz || com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            return;
        }
        if (bundle != null) {
            this.ru = bundle.getString("single_process_listener_key");
        } else if (getIntent() != null) {
            this.ru = getIntent().getStringExtra("single_process_listener_key");
        } else {
            this.ru = "";
        }
    }

    public void emc(boolean z10, int i10) {
        emc(z10, false, i10);
    }

    public void emc(boolean z10, boolean z11, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar = this.xq;
        if (ypwVar == null) {
            return;
        }
        ypwVar.emc(z10, z11, false, i10);
    }

    public void emc(boolean z10, boolean z11) {
        if (!this.sz || TextUtils.isEmpty(this.ru)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.sf.emc().emc(this.ru, z10, z11);
    }

    @Override // com.bytedance.sdk.component.utils.sf.emc
    public void emc(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar = this.xq;
        if (ypwVar == null) {
            return;
        }
        ypwVar.emc(message);
    }

    public IListenerManager emc(int i10) {
        if (this.bw == null) {
            this.bw = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.emc.emc().emc(i10));
        }
        return this.bw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public boolean emc(long j10, boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.view.gbl gblVar;
        com.bytedance.sdk.openadsdk.core.model.ul ulVar;
        if (this.ypw == null) {
            return false;
        }
        this.f9245aa.set(false);
        com.bytedance.sdk.openadsdk.dg.uym uymVarMsw = this.ypw.msw();
        FrameLayout frameLayoutXmt = xmt();
        if (frameLayoutXmt == null) {
            return false;
        }
        this.ypw.ylm.emc(frameLayoutXmt, uymVarMsw);
        Map<String, Object> mapRtt = rtt();
        b.InterfaceC0477b interfaceC0477b = new b.InterfaceC0477b() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.4
            @Override // s2.b.InterfaceC0477b
            public void emc(long j11, int i10) {
                com.bytedance.sdk.openadsdk.utils.qh qhVar;
                com.bytedance.sdk.openadsdk.utils.qh qhVar2;
                TTBaseVideoActivity.this.f9245aa.get();
                if (TTBaseVideoActivity.this.f9245aa.getAndSet(true)) {
                    return;
                }
                TTBaseVideoActivity.this.f9245aa.set(true);
                TTBaseVideoActivity.this.dg.removeMessages(300);
                TTBaseVideoActivity.this.sra();
                TTBaseVideoActivity.this.sf();
                TTBaseVideoActivity.this.ypw.ylm.emc(j11, j11);
                if (TTBaseVideoActivity.this.db()) {
                    TTBaseVideoActivity.this.ypw.hxp.ypw(true);
                } else {
                    TTBaseVideoActivity.this.ypw.vk.set(true);
                }
                TTBaseVideoActivity.this.dr();
                if (TTBaseVideoActivity.this.ypw.ypw.fu() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = TTBaseVideoActivity.this.ypw;
                    if (emcVar.xq) {
                        emcVar.sra.xq().emc(TTBaseVideoActivity.this.ypw.ypw);
                        cf.ypw();
                    }
                }
                if (!TTBaseVideoActivity.this.db() && TTBaseVideoActivity.this.ypw.ypw.ri()) {
                    TTBaseVideoActivity.this.ypw.ypw.wa(1);
                    TTBaseVideoActivity.this.ypw.mkp.aa();
                }
                if (TTBaseVideoActivity.this.ypw.ypw.fu() == 21 && !TTBaseVideoActivity.this.ypw.ypw.yzg()) {
                    TTBaseVideoActivity.this.ypw.ypw.dg(true);
                    TTBaseVideoActivity.this.ypw.mkp.aa();
                }
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.sup && tTBaseVideoActivity.ypw.hxp.sup()) {
                    return;
                }
                if (!TTBaseVideoActivity.this.db()) {
                    if (com.bytedance.sdk.openadsdk.core.model.ul.dg(TTBaseVideoActivity.this.ypw.ypw) || com.bytedance.sdk.openadsdk.core.model.ul.ypw(TTBaseVideoActivity.this.ypw.ypw) || com.bytedance.sdk.openadsdk.core.model.ul.uym(TTBaseVideoActivity.this.ypw.ypw)) {
                        TTBaseVideoActivity.this.emc(false, 5);
                        if (!com.bytedance.sdk.openadsdk.core.model.ul.ypw(TTBaseVideoActivity.this.ypw.ypw) || (qhVar2 = TTBaseVideoActivity.this.ypw.nw) == null) {
                            return;
                        }
                        qhVar2.emc(0L);
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.ul.emc(TTBaseVideoActivity.this.ypw.ypw) && !TTBaseVideoActivity.this.ypw.sz.get()) {
                        TTBaseVideoActivity.this.ypw.emc(true);
                        TTBaseVideoActivity.this.ypw.cuf.bw(true);
                        return;
                    }
                }
                TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = tTBaseVideoActivity2.ypw;
                if (!emcVar2.xq) {
                    tTBaseVideoActivity2.cuf();
                    return;
                }
                if (emcVar2.ypw.but()) {
                    if (!TTBaseVideoActivity.this.db()) {
                        TTBaseVideoActivity.this.ypw.cuf.xq();
                        return;
                    } else {
                        if (TTBaseVideoActivity.this.ypw.hxp.gbl() == 1) {
                            TTBaseVideoActivity.this.ypw.cuf.xq();
                            return;
                        }
                        return;
                    }
                }
                TTBaseVideoActivity.this.emc(false, 5);
                if (!TTBaseVideoActivity.this.db() && com.bytedance.sdk.openadsdk.core.model.ul.ypw(TTBaseVideoActivity.this.ypw.ypw) && (qhVar = TTBaseVideoActivity.this.ypw.nw) != null) {
                    qhVar.emc(0L);
                }
                if (rie.bw(TTBaseVideoActivity.this.ypw.ypw)) {
                    return;
                }
                TTBaseVideoActivity.this.ypw.ylm.emc("skip", true);
            }

            @Override // s2.b.InterfaceC0477b
            public void ypw(long j11, int i10) {
                com.bytedance.sdk.openadsdk.core.model.ul ulVar2;
                TTBaseVideoActivity.this.dg.removeMessages(300);
                com.bytedance.sdk.openadsdk.component.reward.view.gbl gblVar2 = TTBaseVideoActivity.this.ypw.mkp;
                if (gblVar2 != null && (ulVar2 = gblVar2.cf) != null) {
                    ulVar2.ru();
                }
                if (TTBaseVideoActivity.this.ypw.ylm.ycc()) {
                    TTBaseVideoActivity.this.ylm();
                    return;
                }
                TTBaseVideoActivity.this.ypw.ylm.yzg();
                TTBaseVideoActivity.this.sf();
                if (TTBaseVideoActivity.this.ypw.ypw.ycc()) {
                    TTBaseVideoActivity.this.ypw.hxp.emc(true);
                }
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (!tTBaseVideoActivity.ypw.xq) {
                    tTBaseVideoActivity.finish();
                    return;
                }
                tTBaseVideoActivity.emc(false, true, 3);
                com.bytedance.sdk.openadsdk.component.reward.emc.cf cfVar = TTBaseVideoActivity.this.ypw.ylm;
                cfVar.emc(1 ^ (cfVar.mkp() ? 1 : 0), 2);
            }

            @Override // s2.b.InterfaceC0477b
            public void emc() {
                TTBaseVideoActivity.this.dg.removeMessages(300);
                TTBaseVideoActivity.this.sra();
                TTBaseVideoActivity.this.sf();
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.ypw.xq) {
                    tTBaseVideoActivity.emc(false, true, 6);
                } else {
                    tTBaseVideoActivity.finish();
                }
                com.bytedance.sdk.openadsdk.component.reward.emc.cf cfVar = TTBaseVideoActivity.this.ypw.ylm;
                cfVar.emc(!cfVar.mkp() ? 1 : 0, 1 ^ (TTBaseVideoActivity.this.ypw.ylm.mkp() ? 1 : 0));
                TTBaseVideoActivity.this.ypw.ylm.yzg();
            }

            @Override // s2.b.InterfaceC0477b
            public void emc(long j11, long j12) {
                com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = TTBaseVideoActivity.this.ypw;
                if (!emcVar.wpn && emcVar.ylm.ycc()) {
                    TTBaseVideoActivity.this.ypw.ylm.ylm();
                }
                if (TTBaseVideoActivity.this.ypw.zz.get()) {
                    return;
                }
                TTBaseVideoActivity.this.dg.removeMessages(300);
                if (j11 != TTBaseVideoActivity.this.ypw.ylm.sz()) {
                    TTBaseVideoActivity.this.sra();
                }
                if (!TTBaseVideoActivity.this.db() || TTBaseVideoActivity.this.ypw.ylm.ycc()) {
                    TTBaseVideoActivity.this.ypw.ylm.emc(j11, j12);
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    long j13 = j11 / 1000;
                    tTBaseVideoActivity.ycc = (int) (tTBaseVideoActivity.ypw.ylm.iyl() - j13);
                    int i10 = (int) j13;
                    if ((TTBaseVideoActivity.this.ypw.f9273aa.get() || TTBaseVideoActivity.this.ypw.ru.get()) && TTBaseVideoActivity.this.ypw.ylm.ycc()) {
                        TTBaseVideoActivity.this.ypw.ylm.ylm();
                    }
                    if (TTBaseVideoActivity.this.hxp()) {
                        TTBaseVideoActivity.this.ypw.mkp.bw(i10);
                    }
                    if (TTBaseVideoActivity.this.ee()) {
                        if (TTBaseVideoActivity.this.ypw.ylm.dg()) {
                            lt ltVar = TTBaseVideoActivity.this.msw;
                            if (ltVar != null) {
                                ltVar.emc(j11);
                                return;
                            }
                            return;
                        }
                        lt ltVar2 = TTBaseVideoActivity.this.msw;
                        if (ltVar2 == null || !ltVar2.emc()) {
                            TTBaseVideoActivity.this.emc(j11, j12);
                            return;
                        }
                        return;
                    }
                    TTBaseVideoActivity.this.emc(j11, j12);
                }
            }
        };
        this.ypw.ylm.emc(interfaceC0477b);
        if (!this.ypw.ypw.ycc() && (gblVar = this.ypw.mkp) != null && (ulVar = gblVar.cf) != null) {
            ulVar.emc(interfaceC0477b);
        }
        boolean zEmc = this.ypw.ylm.emc(j10, z10, mapRtt, this.xq);
        ypw(zEmc, z10);
        return zEmc;
    }
}
