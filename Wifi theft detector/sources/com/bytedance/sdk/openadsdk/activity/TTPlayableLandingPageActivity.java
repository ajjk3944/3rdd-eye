package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.rtt;
import com.bytedance.sdk.openadsdk.core.tp;
import com.bytedance.sdk.openadsdk.core.widget.ru;
import com.bytedance.sdk.openadsdk.core.xq.xq;
import com.bytedance.sdk.openadsdk.dg.sz;
import com.bytedance.sdk.openadsdk.dg.xq;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.gbl;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.bytedance.sdk.openadsdk.ylm.uym;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTPlayableLandingPageActivity extends TTBaseLandingPageActivity implements sf.emc, com.bytedance.sdk.openadsdk.core.sz.dg.ypw, com.bytedance.sdk.openadsdk.core.xq.dg {
    private static final uym.emc wo = new uym.emc() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.1
    };

    /* renamed from: aa, reason: collision with root package name */
    private String f9248aa;
    private Context cf;
    private com.bytedance.sdk.openadsdk.ul.emc.emc.xq dr;
    private rie ee;
    dr emc;
    private com.bytedance.sdk.openadsdk.ylm.msw iyl;
    private String lt;
    private ILoader mxo;
    private com.bytedance.sdk.openadsdk.core.ycc.dg qh;
    private sz ra;
    private String rie;
    private boolean sb;
    private String sba;
    private boolean sf;
    private String sra;
    private com.bytedance.sdk.openadsdk.core.ycc.dg sup;
    private com.bytedance.sdk.openadsdk.core.ycc.dg sz;
    private rtt ul;
    private ru vk;
    private com.bytedance.sdk.openadsdk.dg.dg.bw vw;
    private com.bytedance.sdk.openadsdk.ylm.emc.emc wpn;
    private com.bytedance.sdk.component.zz.ycc ycc;
    private int ylm;
    TTAdDislikeToast ypw;
    private boolean yz;
    private rtt yzg;
    private boolean uym = true;
    private boolean msw = false;
    private boolean gbl = true;
    final AtomicBoolean xq = new AtomicBoolean(false);
    private final String hxp = "embeded_ad";
    private final sf db = new sf(Looper.getMainLooper(), this);
    private final AtomicBoolean xmt = new AtomicBoolean(false);
    private final AtomicInteger cuf = new AtomicInteger(0);
    private final AtomicInteger rtt = new AtomicInteger(0);
    private final AtomicInteger mkp = new AtomicInteger(0);
    private boolean tp = false;
    int dg = -1;
    protected com.bytedance.sdk.openadsdk.sz.bw bw = new com.bytedance.sdk.openadsdk.sz.bw() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.8
        @Override // com.bytedance.sdk.openadsdk.sz.bw
        public void emc() {
            if (!TTPlayableLandingPageActivity.this.isFinishing() && com.bytedance.sdk.openadsdk.core.model.dr.sz(TTPlayableLandingPageActivity.this.ee) && com.bytedance.sdk.openadsdk.core.model.dr.qh(TTPlayableLandingPageActivity.this.ee)) {
                TTPlayableLandingPageActivity.this.db.removeMessages(2);
                TTPlayableLandingPageActivity.this.db.sendMessage(TTPlayableLandingPageActivity.this.emc(1, 0));
            }
        }
    };
    private int xxg = 1;

    private void qh() {
        super.onBackPressed();
        com.bytedance.sdk.openadsdk.dg.dg.bw bwVar = this.vw;
        if (bwVar != null) {
            bwVar.msw();
        }
    }

    private void sba() {
        TTAdDislikeToast tTAdDislikeToast = this.ypw;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
        }
    }

    private void sz() {
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar = this.sup;
        if (dgVar != null) {
            dgVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTPlayableLandingPageActivity.this.vw != null) {
                        TTPlayableLandingPageActivity.this.vw.msw();
                    }
                    TTPlayableLandingPageActivity.this.db.sendMessage(TTPlayableLandingPageActivity.this.emc(4, 0));
                    TTPlayableLandingPageActivity.this.emc("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar2 = this.sz;
        if (dgVar2 != null) {
            dgVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.xq();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar3 = this.qh;
        if (dgVar3 != null) {
            dgVar3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.tp = !r2.tp;
                    TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity.ycc(tTPlayableLandingPageActivity.tp);
                    if (TTPlayableLandingPageActivity.this.iyl != null) {
                        TTPlayableLandingPageActivity.this.iyl.emc(TTPlayableLandingPageActivity.this.tp);
                    }
                }
            });
        }
    }

    private void ul() {
        com.bytedance.sdk.openadsdk.core.xq.emc emcVar = new com.bytedance.sdk.openadsdk.core.xq.emc(this, this.ee, "embeded_ad", this.ylm) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.xq.emc, com.bytedance.sdk.openadsdk.core.xq.ypw, com.bytedance.sdk.openadsdk.core.xq.xq
            public void emc(View view, float f10, float f11, float f12, float f13, SparseArray<xq.emc> sparseArray, boolean z10) throws JSONException {
                rie rieVar = ((com.bytedance.sdk.openadsdk.core.xq.ypw) this).ycc;
                if (rieVar == null || rieVar.ltx() != 1 || z10) {
                    super.emc(view, f10, f11, f12, f13, sparseArray, z10);
                    TTPlayableLandingPageActivity.this.ylm();
                    TTPlayableLandingPageActivity.this.sb = true;
                    TTPlayableLandingPageActivity.this.sf = true;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_url", TTPlayableLandingPageActivity.this.sra);
                    } catch (JSONException e10) {
                        ul.emc("TTPWPActivity", "onClick JSON ERROR", e10);
                    }
                    com.bytedance.sdk.openadsdk.dg.xq.ypw(TTPlayableLandingPageActivity.this.ee, ((com.bytedance.sdk.openadsdk.core.xq.ypw) this).uym, "click_playable_download_button_loading", jSONObject);
                }
            }
        };
        emcVar.emc(this.dr);
        com.bytedance.sdk.openadsdk.ylm.emc.emc emcVar2 = this.wpn;
        if (emcVar2 != null) {
            emcVar2.emc(emcVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ylm() {
        com.bytedance.sdk.openadsdk.core.sf.emc().ypw(this.ee);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yzg() {
        TTAdDislikeToast tTAdDislikeToast = this.ypw;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    private void zz() {
        int i10 = aa.dg().db(String.valueOf(this.ee.tx())).f9298aa;
        if (i10 >= 0) {
            this.db.sendEmptyMessageDelayed(1, i10 * 1000);
        } else {
            vw.emc((View) this.sup, 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void aa() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void bw() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void cf() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void dg(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void emc(Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public List<rie> ffd() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void fu() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void gbl() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void hj() {
        ylm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void iyl() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void lt() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void mkp() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void ndl() {
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        qh();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onCreate(@Nullable Bundle bundle) throws JSONException {
        super.onCreate(bundle);
        if (!qh.bw()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(1024);
            getWindow().addFlags(16777216);
            aa.ypw(this);
            ycc();
        } catch (Throwable unused) {
        }
        ypw(bundle);
        rie rieVar = this.ee;
        if (rieVar == null) {
            return;
        }
        this.yz = rieVar.yo();
        int iCf = com.bytedance.sdk.openadsdk.core.model.dr.cf(this.ee);
        if (iCf == 0) {
            setRequestedOrientation(14);
        } else if (iCf == 1) {
            setRequestedOrientation(1);
        } else if (iCf == 2) {
            setRequestedOrientation(0);
            this.xxg = 2;
        }
        this.cf = this;
        try {
            setContentView(uym());
            sz();
            msw();
            ul();
            this.wpn.emc(this);
            this.wpn.emc(false, (com.bytedance.sdk.openadsdk.sz.ycc) null);
            zz();
            xq.emc.emc(SystemClock.elapsedRealtime() - jElapsedRealtime, this.ee, "embeded_ad", this.mxo, this.lt);
            com.bytedance.sdk.openadsdk.ylm.emc.emc emcVar = this.wpn;
            if (emcVar != null) {
                emcVar.emc();
            }
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.openadsdk.core.sf.emc().xq(this.ee);
        com.bytedance.sdk.openadsdk.ylm.emc.emc emcVar = this.wpn;
        if (emcVar != null) {
            emcVar.dg();
        }
        com.bytedance.sdk.openadsdk.dg.dg.bw bwVar = this.vw;
        if (bwVar != null) {
            bwVar.emc(true);
            this.vw.sup();
        }
        this.db.removeCallbacksAndMessages(null);
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(this.lt)) {
            xq.emc.emc(this.rtt.get(), this.cuf.get(), this.ee);
        }
        com.bytedance.sdk.openadsdk.uym.ypw.emc().emc(this.mxo);
        com.bytedance.sdk.component.zz.ycc yccVar = this.ycc;
        if (yccVar != null) {
            tp.emc(yccVar.getWebView());
            this.ycc.vk();
        }
        this.ycc = null;
        rtt rttVar = this.yzg;
        if (rttVar != null) {
            rttVar.sup();
        }
        rtt rttVar2 = this.ul;
        if (rttVar2 != null) {
            rttVar2.sup();
        }
        com.bytedance.sdk.openadsdk.ylm.msw mswVar = this.iyl;
        if (mswVar != null) {
            mswVar.iyl();
        }
        sz szVar = this.ra;
        if (szVar != null) {
            szVar.dg(true);
        }
        dr drVar = this.emc;
        if (drVar != null) {
            drVar.ypw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, JSONException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        rtt rttVar = this.yzg;
        if (rttVar != null) {
            rttVar.emc(false);
        }
        com.bytedance.sdk.openadsdk.ylm.msw mswVar = this.iyl;
        if (mswVar != null) {
            mswVar.emc(true);
            this.iyl.xq(false);
        }
        com.bytedance.sdk.openadsdk.ylm.emc.emc emcVar = this.wpn;
        if (emcVar != null) {
            emcVar.xq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, JSONException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        rtt rttVar = this.yzg;
        if (rttVar != null) {
            rttVar.gbl();
            com.bytedance.sdk.component.zz.ycc yccVar = this.ycc;
            if (yccVar != null) {
                this.yzg.emc(yccVar.getVisibility() == 0);
            }
        }
        rtt rttVar2 = this.ul;
        if (rttVar2 != null) {
            rttVar2.gbl();
        }
        com.bytedance.sdk.openadsdk.ylm.msw mswVar = this.iyl;
        if (mswVar != null) {
            mswVar.xq(true);
        }
        sz szVar = this.ra;
        if (szVar != null) {
            szVar.uym();
        }
        if (DeviceUtils.uym() == 0) {
            this.tp = true;
        }
        ycc(this.tp);
        com.bytedance.sdk.openadsdk.ylm.emc.emc emcVar = this.wpn;
        if (emcVar != null) {
            emcVar.ypw();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int iEmc = this.ee != null ? com.bytedance.sdk.openadsdk.core.sf.emc().emc(this.ee) : -1;
            this.dg = iEmc;
            bundle.putInt("meta_index", iEmc);
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.dg >= 0) {
            com.bytedance.sdk.openadsdk.core.sf.emc().xq(this.dg);
            this.dg = -1;
        }
        com.bytedance.sdk.openadsdk.dg.dg.bw bwVar = this.vw;
        if (bwVar != null) {
            bwVar.ru();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.dg.dg.bw bwVar = this.vw;
        if (bwVar != null) {
            bwVar.zz();
        }
        sz szVar = this.ra;
        if (szVar != null) {
            szVar.msw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void ru() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void sup() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public View vk() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void ypw(int i10) {
    }

    private void msw() {
        if (this.ee.sx() == 4) {
            this.dr = com.bytedance.sdk.openadsdk.ul.emc.emc.dg.emc(this.cf, "interaction");
        }
    }

    private View uym() {
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar = new com.bytedance.sdk.openadsdk.core.ycc.xq(this);
        xqVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.wpn = new com.bytedance.sdk.openadsdk.ylm.emc.emc(this.cf, this.ee, this.xxg, this.tp, xqVar, true);
        int iYpw = vw.ypw(this, 5.0f);
        this.qh = new com.bytedance.sdk.openadsdk.core.ycc.dg(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(vw.ypw(this, 28.0f), vw.ypw(this, 28.0f));
        layoutParams.rightMargin = vw.ypw(this, 56.0f);
        layoutParams.topMargin = vw.ypw(this, 20.0f);
        layoutParams.gravity = 8388661;
        this.qh.setLayoutParams(layoutParams);
        this.qh.setPadding(iYpw, iYpw, iYpw, iYpw);
        this.qh.setBackground(com.bytedance.sdk.openadsdk.core.widget.dg.emc());
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar = this.qh;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        dgVar.setScaleType(scaleType);
        this.qh.setImageDrawable(gbl.emc(this, "tt_unmute_wrapper"));
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar2 = new com.bytedance.sdk.openadsdk.core.ycc.dg(this);
        this.sz = dgVar2;
        dgVar2.setPadding(iYpw, iYpw, iYpw, iYpw);
        this.sz.setScaleType(scaleType);
        this.sz.setBackground(com.bytedance.sdk.openadsdk.core.widget.dg.emc());
        this.sz.setImageResource(com.bytedance.sdk.component.utils.rie.dg(aa.emc(), "tt_reward_full_feedback"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(vw.ypw(this, 28.0f), vw.ypw(this, 28.0f));
        layoutParams2.gravity = 8388661;
        layoutParams2.rightMargin = vw.ypw(this, 16.0f);
        layoutParams2.topMargin = vw.ypw(this, 20.0f);
        this.sz.setLayoutParams(layoutParams2);
        this.sup = new com.bytedance.sdk.openadsdk.core.ycc.dg(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(vw.ypw(this, 28.0f), vw.ypw(this, 28.0f));
        layoutParams3.gravity = 8388659;
        layoutParams3.topMargin = vw.ypw(this, 20.0f);
        layoutParams3.leftMargin = vw.ypw(this, 16.0f);
        this.sup.setLayoutParams(layoutParams3);
        this.sup.setPadding(iYpw, iYpw, iYpw, iYpw);
        this.sup.setScaleType(ImageView.ScaleType.FIT_XY);
        this.sup.setBackground(com.bytedance.sdk.openadsdk.core.widget.dg.emc());
        this.sup.setImageDrawable(com.bytedance.sdk.component.utils.rie.xq(this, "tt_white_lefterbackicon_titlebar"));
        this.sup.setVisibility(0);
        xqVar.addView(this.qh);
        xqVar.addView(this.sz);
        xqVar.addView(this.sup);
        return xqVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void emc(String str, JSONObject jSONObject) {
    }

    public void ycc(boolean z10) {
        try {
            this.tp = z10;
            this.qh.setImageDrawable(z10 ? gbl.emc(this.cf, "tt_mute_wrapper") : gbl.emc(this.cf, "tt_unmute_wrapper"));
            com.bytedance.sdk.openadsdk.ylm.msw mswVar = this.iyl;
            if (mswVar != null) {
                mswVar.emc(z10);
            }
            com.bytedance.sdk.openadsdk.ylm.emc.emc emcVar = this.wpn;
            if (emcVar != null) {
                emcVar.emc(z10);
            }
        } catch (Exception e10) {
            ul.xq("TTPWPActivity", e10.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void ypw(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.xq.dg
    public void bw(boolean z10) {
        com.bytedance.sdk.openadsdk.ul.emc.emc.xq xqVar;
        this.sb = true;
        this.sf = z10;
        if (!z10) {
            try {
                Toast.makeText(this.cf, "Download later", 0).show();
            } catch (Throwable unused) {
            }
        }
        if (!this.sf || (xqVar = this.dr) == null) {
            return;
        }
        xqVar.emc(this.ee);
    }

    public void dg() {
        TTPlayableLandingPageActivity tTPlayableLandingPageActivity;
        rie rieVar = this.ee;
        if (rieVar != null) {
            tTPlayableLandingPageActivity = this;
            tTPlayableLandingPageActivity.emc = new com.bytedance.sdk.openadsdk.xq.xq(tTPlayableLandingPageActivity, rieVar.wdp(), this.ee.pz(), "", this.ee);
        } else {
            tTPlayableLandingPageActivity = this;
        }
        if (tTPlayableLandingPageActivity.ypw == null) {
            tTPlayableLandingPageActivity.ypw = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(R.id.content)).addView(tTPlayableLandingPageActivity.ypw);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void emc(boolean z10) {
    }

    public void xq() {
        if (this.ee == null || isFinishing()) {
            return;
        }
        if (this.xq.get()) {
            sba();
            return;
        }
        if (this.emc == null) {
            dg();
        }
        this.emc.emc(new dr.emc() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.dr.emc
            public void emc() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.dr.emc
            public void emc(int i10, String str) {
                if (TTPlayableLandingPageActivity.this.xq.get() || TextUtils.isEmpty(str)) {
                    return;
                }
                TTPlayableLandingPageActivity.this.xq.set(true);
                TTPlayableLandingPageActivity.this.yzg();
            }
        });
        dr drVar = this.emc;
        if (drVar != null) {
            drVar.emc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public boolean emc() {
        return true;
    }

    private void ypw(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                this.sra = intent.getStringExtra("url");
                this.ylm = intent.getIntExtra("source", -1);
                this.sb = intent.getBooleanExtra("ad_pending_download", false);
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.ee = com.bytedance.sdk.openadsdk.core.ypw.emc(new JSONObject(stringExtra));
                    } catch (Exception e10) {
                        ul.emc("TTPWPActivity", "TTPlayableLandingPageActivity - onCreate MultiGlobalInfo : ", e10);
                    }
                }
                this.f9248aa = intent.getStringExtra("adid");
                this.sba = intent.getStringExtra("log_extra");
                this.lt = intent.getStringExtra("gecko_id");
                this.rie = intent.getStringExtra("web_title");
            } else {
                rie rieVarEmc = com.bytedance.sdk.openadsdk.core.sf.emc().emc(com.bytedance.sdk.openadsdk.core.sf.emc(intent));
                this.ee = rieVarEmc;
                if (rieVarEmc != null) {
                    this.sra = rieVarEmc.gbl();
                    this.ylm = this.ee.sz();
                    this.sb = this.ee.cf();
                    this.f9248aa = this.ee.ye();
                    this.sba = this.ee.wdp();
                    this.lt = this.ee.qlw();
                    this.rie = this.ee.xou();
                }
            }
        }
        if (bundle != null) {
            try {
                rie rieVarEmc2 = com.bytedance.sdk.openadsdk.core.sf.emc().emc(bundle.getInt("meta_index", -1));
                this.ee = rieVarEmc2;
                if (rieVarEmc2 != null) {
                    this.f9248aa = rieVarEmc2.ye();
                    this.sba = this.ee.wdp();
                    this.lt = this.ee.qlw();
                    this.rie = this.ee.xou();
                    this.sra = this.ee.gbl();
                    this.ylm = this.ee.sz();
                    this.sb = this.ee.cf();
                }
            } catch (Throwable unused) {
            }
        }
        if (this.ee == null) {
            finish();
            return;
        }
        try {
            this.tp = aa.dg().aa(this.ee.vaf().getCodeId());
        } catch (Throwable th) {
            ul.xq("TTPWPActivity", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public boolean emc(long j10, boolean z10) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message emc(int i10, int i11) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.arg1 = i10;
        if (i10 == 3) {
            messageObtain.arg2 = i11;
        }
        return messageObtain;
    }

    public void ycc() {
        vw.emc((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.7
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i10) {
                if (i10 == 0) {
                    try {
                        if (TTPlayableLandingPageActivity.this.isFinishing()) {
                            return;
                        }
                        TTPlayableLandingPageActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.7.1
                            @Override // java.lang.Runnable
                            public void run() {
                                vw.emc((Activity) TTPlayableLandingPageActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e10) {
                        ul.xq("TTPWPActivity", e10.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(String str) {
        com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), this.ee, "embeded_ad", str);
    }

    @Override // com.bytedance.sdk.component.utils.sf.emc
    public void emc(Message message) throws JSONException {
        int i10 = message.what;
        if (i10 == 1) {
            vw.emc((View) this.sup, 0);
            return;
        }
        if (i10 != 2) {
            return;
        }
        ru ruVar = this.vk;
        if (ruVar == null || !ruVar.dg()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                int i11 = message.arg2;
                if (i11 != 0) {
                    jSONObject.put("remove_loading_page_reason", i11);
                }
                jSONObject.put("playable_url", this.sra);
                ru ruVar2 = this.vk;
                jSONObject.put("duration", ruVar2 != null ? ruVar2.getDisplayDuration() : 0L);
            } catch (JSONException e10) {
                ul.emc("TTPWPActivity", "handleMsg json error", e10);
            }
            com.bytedance.sdk.openadsdk.dg.xq.ypw(this.ee, "embeded_ad", "remove_loading_page", jSONObject);
            this.db.removeMessages(2);
            ru ruVar3 = this.vk;
            if (ruVar3 != null) {
                ruVar3.xq();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public void ypw() {
        qh();
    }
}
