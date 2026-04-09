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
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.applovin.shadow.okio.Segment;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.cd;
import com.bytedance.sdk.openadsdk.core.ey;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.od;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.widget.tlj;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.yu.lh;
import com.bytedance.sdk.openadsdk.yu.mwh;
import com.bytedance.sdk.openadsdk.zin.ra;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class TTPlayableLandingPageActivity extends TTBaseLandingPageActivity implements jae.ouw, com.bytedance.sdk.openadsdk.core.lh.yu, com.bytedance.sdk.openadsdk.core.mwh.yu.vt {
    private static final ra.ouw fqk = new ra.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.1
        @Override // com.bytedance.sdk.openadsdk.zin.ra.ouw
        public final void ouw(String str, String str2) {
            ko.vt(str, str2);
        }

        @Override // com.bytedance.sdk.openadsdk.zin.ra.ouw
        public final void ouw(String str, String str2, Throwable th2) {
            ko.lh(str, str2, th2);
        }
    };

    /* renamed from: cd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh f7717cd;

    /* renamed from: cf, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.le.yu f7718cf;
    private String ex;
    private boolean jae;
    private String jqy;
    private mwh jvy;
    private com.bytedance.sdk.openadsdk.core.le.yu ko;
    private com.bytedance.sdk.openadsdk.zin.ouw.ouw lso;

    /* renamed from: od, reason: collision with root package name */
    private boolean f7721od;
    private ILoader osn;
    cd ouw;

    /* renamed from: pd, reason: collision with root package name */
    private String f7722pd;
    private bs qbp;
    private com.bytedance.sdk.component.bly.le ra;
    private Context rn;
    private com.bytedance.sdk.openadsdk.yu.yu.fkw rrs;
    private com.bytedance.sdk.openadsdk.core.le.yu ryl;

    /* renamed from: th, reason: collision with root package name */
    private String f7723th;
    private com.bytedance.sdk.openadsdk.zin.pno uoy;
    private boolean ux;
    private String vm;
    private int vpp;
    TTAdDislikeToast vt;
    vpp yu;
    private tlj zih;
    private bs zin;
    private boolean pno = true;
    private boolean bly = false;
    private boolean tlj = true;

    /* renamed from: lh, reason: collision with root package name */
    final AtomicBoolean f7720lh = new AtomicBoolean(false);
    private final String tc = "embeded_ad";
    private final jae ksc = new jae(Looper.getMainLooper(), this);
    private final AtomicBoolean uq = new AtomicBoolean(false);
    private final AtomicInteger fvf = new AtomicInteger(0);
    private final AtomicInteger bs = new AtomicInteger(0);
    private final AtomicInteger fak = new AtomicInteger(0);
    private boolean ey = false;
    int fkw = -1;

    /* renamed from: le, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.mwh.fkw f7719le = new com.bytedance.sdk.openadsdk.mwh.fkw() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.8
        @Override // com.bytedance.sdk.openadsdk.mwh.fkw
        public final void ouw() {
            if (TTPlayableLandingPageActivity.this.isFinishing()) {
                return;
            }
            vpp unused = TTPlayableLandingPageActivity.this.yu;
            c cVar = TTPlayableLandingPageActivity.this.yu.f8309sd;
            if (cVar == null || cVar.f6584n != 1) {
                return;
            }
            TTPlayableLandingPageActivity.this.ksc.removeMessages(2);
            TTPlayableLandingPageActivity.this.ksc.sendMessage(TTPlayableLandingPageActivity.ouw(1));
        }
    };
    private int hun = 1;

    public static /* synthetic */ void bly(TTPlayableLandingPageActivity tTPlayableLandingPageActivity) {
        TTAdDislikeToast tTAdDislikeToast = tTPlayableLandingPageActivity.vt;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    public static /* synthetic */ boolean pno(TTPlayableLandingPageActivity tTPlayableLandingPageActivity) {
        tTPlayableLandingPageActivity.f7721od = true;
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void kn() {
        yu();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void le() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void lh(boolean z3) {
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        lh();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onCreate(Bundle bundle) throws JSONException {
        super.onCreate(bundle);
        if (!jg.fkw()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(Segment.SHARE_MINIMUM);
            getWindow().addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            zih.vt(this);
            osn.ouw((Activity) this);
            getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.7
                @Override // android.view.View.OnSystemUiVisibilityChangeListener
                public final void onSystemUiVisibilityChange(int i4) {
                    if (i4 == 0) {
                        try {
                            if (TTPlayableLandingPageActivity.this.isFinishing()) {
                                return;
                            }
                            TTPlayableLandingPageActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.7.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    osn.ouw((Activity) TTPlayableLandingPageActivity.this);
                                }
                            }, 2500L);
                        } catch (Exception e2) {
                            qbp.lh("TTPWPActivity", e2.getMessage());
                        }
                    }
                }
            });
        } catch (Throwable unused) {
        }
        Intent intent = getIntent();
        if (intent != null) {
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                this.jqy = intent.getStringExtra("url");
                this.vpp = intent.getIntExtra("source", -1);
                this.jae = intent.getBooleanExtra("ad_pending_download", false);
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.yu = com.bytedance.sdk.openadsdk.core.vt.ouw(new JSONObject(stringExtra));
                    } catch (Exception e2) {
                        qbp.ouw("TTPWPActivity", "TTPlayableLandingPageActivity - onCreate MultiGlobalInfo : ", e2);
                    }
                }
                this.vm = intent.getStringExtra("adid");
                this.f7723th = intent.getStringExtra("log_extra");
                this.f7722pd = intent.getStringExtra("gecko_id");
                this.ex = intent.getStringExtra("web_title");
            } else {
                vpp vppVarOuw = od.ouw().ouw(od.ouw(intent));
                this.yu = vppVarOuw;
                if (vppVarOuw != null) {
                    this.jqy = vppVarOuw.f8310th;
                    this.vpp = vppVarOuw.zin;
                    this.jae = vppVarOuw.vpp;
                    this.vm = vppVarOuw.pv;
                    this.f7723th = vppVarOuw.yhj;
                    this.f7722pd = vppVarOuw.f8298ki;
                    this.ex = vppVarOuw.fqk;
                }
            }
        }
        if (bundle != null) {
            try {
                vpp vppVarOuw2 = od.ouw().ouw(bundle.getInt("meta_index", -1));
                this.yu = vppVarOuw2;
                if (vppVarOuw2 != null) {
                    this.vm = vppVarOuw2.pv;
                    this.f7723th = vppVarOuw2.yhj;
                    this.f7722pd = vppVarOuw2.f8298ki;
                    this.ex = vppVarOuw2.fqk;
                    this.jqy = vppVarOuw2.f8310th;
                    this.vpp = vppVarOuw2.zin;
                    this.jae = vppVarOuw2.vpp;
                }
            } catch (Throwable unused2) {
            }
        }
        if (this.yu == null) {
            ko.fkw("TTPWPActivity", "material is null, no data to display");
            finish();
        } else {
            try {
                zih.yu();
                this.ey = cf.ryl(this.yu.yiz.getCodeId());
            } catch (Throwable th2) {
                qbp.lh("TTPWPActivity", th2.getMessage());
            }
        }
        vpp vppVar = this.yu;
        if (vppVar == null) {
            return;
        }
        this.ux = true;
        com.bytedance.sdk.openadsdk.core.model.od odVarOuw = com.bytedance.sdk.openadsdk.core.model.od.ouw(vppVar);
        int i4 = odVarOuw == null ? 0 : odVarOuw.ra;
        if (i4 == 0) {
            setRequestedOrientation(14);
        } else if (i4 == 1) {
            setRequestedOrientation(1);
        } else if (i4 == 2) {
            setRequestedOrientation(0);
            this.hun = 2;
        }
        this.rn = this;
        try {
            com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(this);
            lhVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.lso = new com.bytedance.sdk.openadsdk.zin.ouw.ouw(this.rn, this.yu, this.hun, this.ey, lhVar, true);
            int iOuw = osn.ouw(this, 5.0f);
            this.ko = new com.bytedance.sdk.openadsdk.core.le.yu(this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(osn.ouw(this, 28.0f), osn.ouw(this, 28.0f));
            layoutParams.rightMargin = osn.ouw(this, 56.0f);
            layoutParams.topMargin = osn.ouw(this, 20.0f);
            layoutParams.gravity = 8388661;
            this.ko.setLayoutParams(layoutParams);
            this.ko.setPadding(iOuw, iOuw, iOuw, iOuw);
            this.ko.setBackground(com.bytedance.sdk.openadsdk.core.widget.yu.ouw());
            com.bytedance.sdk.openadsdk.core.le.yu yuVar = this.ko;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            yuVar.setScaleType(scaleType);
            this.ko.setImageDrawable(com.bytedance.sdk.openadsdk.utils.cf.ouw(this, "tt_unmute_wrapper"));
            com.bytedance.sdk.openadsdk.core.le.yu yuVar2 = new com.bytedance.sdk.openadsdk.core.le.yu(this);
            this.ryl = yuVar2;
            yuVar2.setPadding(iOuw, iOuw, iOuw, iOuw);
            this.ryl.setScaleType(scaleType);
            this.ryl.setBackground(com.bytedance.sdk.openadsdk.core.widget.yu.ouw());
            this.ryl.setImageResource(com.bytedance.sdk.component.utils.vpp.yu(zih.ouw(), "tt_reward_full_feedback"));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(osn.ouw(this, 28.0f), osn.ouw(this, 28.0f));
            layoutParams2.gravity = 8388661;
            layoutParams2.rightMargin = osn.ouw(this, 16.0f);
            layoutParams2.topMargin = osn.ouw(this, 20.0f);
            this.ryl.setLayoutParams(layoutParams2);
            this.f7718cf = new com.bytedance.sdk.openadsdk.core.le.yu(this);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(osn.ouw(this, 28.0f), osn.ouw(this, 28.0f));
            layoutParams3.gravity = 8388659;
            layoutParams3.topMargin = osn.ouw(this, 20.0f);
            layoutParams3.leftMargin = osn.ouw(this, 16.0f);
            this.f7718cf.setLayoutParams(layoutParams3);
            this.f7718cf.setPadding(iOuw, iOuw, iOuw, iOuw);
            this.f7718cf.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f7718cf.setBackground(com.bytedance.sdk.openadsdk.core.widget.yu.ouw());
            this.f7718cf.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(this, "tt_white_lefterbackicon_titlebar"));
            this.f7718cf.setVisibility(0);
            lhVar.addView(this.ko);
            lhVar.addView(this.ryl);
            lhVar.addView(this.f7718cf);
            setContentView(lhVar);
            com.bytedance.sdk.openadsdk.core.le.yu yuVar3 = this.f7718cf;
            if (yuVar3 != null) {
                yuVar3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (TTPlayableLandingPageActivity.this.rrs != null) {
                            TTPlayableLandingPageActivity.this.rrs.pno();
                        }
                        TTPlayableLandingPageActivity.this.ksc.sendMessage(TTPlayableLandingPageActivity.ouw(4));
                        TTPlayableLandingPageActivity.ouw(TTPlayableLandingPageActivity.this, "playable_close");
                        TTPlayableLandingPageActivity.this.finish();
                    }
                });
            }
            com.bytedance.sdk.openadsdk.core.le.yu yuVar4 = this.ryl;
            if (yuVar4 != null) {
                yuVar4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        final TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                        if (tTPlayableLandingPageActivity.yu == null || tTPlayableLandingPageActivity.isFinishing()) {
                            return;
                        }
                        if (tTPlayableLandingPageActivity.f7720lh.get()) {
                            TTAdDislikeToast tTAdDislikeToast = tTPlayableLandingPageActivity.vt;
                            if (tTAdDislikeToast != null) {
                                tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
                                return;
                            }
                            return;
                        }
                        if (tTPlayableLandingPageActivity.ouw == null) {
                            vpp vppVar2 = tTPlayableLandingPageActivity.yu;
                            if (vppVar2 != null) {
                                tTPlayableLandingPageActivity.ouw = new com.bytedance.sdk.openadsdk.lh.lh(tTPlayableLandingPageActivity, vppVar2.yhj, vppVar2.jae, "", vppVar2);
                            }
                            if (tTPlayableLandingPageActivity.vt == null) {
                                tTPlayableLandingPageActivity.vt = new TTAdDislikeToast(tTPlayableLandingPageActivity);
                                ((FrameLayout) tTPlayableLandingPageActivity.findViewById(R.id.content)).addView(tTPlayableLandingPageActivity.vt);
                            }
                        }
                        tTPlayableLandingPageActivity.ouw.ouw(new cd.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.5
                            @Override // com.bytedance.sdk.openadsdk.core.cd.ouw
                            public final void ouw() {
                            }

                            @Override // com.bytedance.sdk.openadsdk.core.cd.ouw
                            public final void ouw(String str) {
                                if (TTPlayableLandingPageActivity.this.f7720lh.get() || TextUtils.isEmpty(str)) {
                                    return;
                                }
                                TTPlayableLandingPageActivity.this.f7720lh.set(true);
                                TTPlayableLandingPageActivity.bly(TTPlayableLandingPageActivity.this);
                            }
                        });
                        cd cdVar = tTPlayableLandingPageActivity.ouw;
                        if (cdVar != null) {
                            cdVar.ouw();
                        }
                    }
                });
            }
            com.bytedance.sdk.openadsdk.core.le.yu yuVar5 = this.ko;
            if (yuVar5 != null) {
                yuVar5.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TTPlayableLandingPageActivity.this.ey = !r2.ey;
                        TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                        tTPlayableLandingPageActivity.yu(tTPlayableLandingPageActivity.ey);
                        if (TTPlayableLandingPageActivity.this.uoy != null) {
                            TTPlayableLandingPageActivity.this.uoy.ouw(TTPlayableLandingPageActivity.this.ey);
                        }
                    }
                });
            }
            if (this.yu.f8305pd == 4) {
                this.f7717cd = com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(this.rn, "interaction");
            }
            com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.lh.ouw(this, this.yu, "embeded_ad", this.vpp) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.6
                @Override // com.bytedance.sdk.openadsdk.core.lh.ouw, com.bytedance.sdk.openadsdk.core.lh.vt, com.bytedance.sdk.openadsdk.core.lh.lh
                public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z3) throws JSONException {
                    vpp vppVar2 = this.tlj;
                    if (vppVar2 == null || vppVar2.lai != 1 || z3) {
                        super.ouw(view, f10, f11, f12, f13, sparseArray, z3);
                        TTPlayableLandingPageActivity.this.yu();
                        TTPlayableLandingPageActivity.ra(TTPlayableLandingPageActivity.this);
                        TTPlayableLandingPageActivity.pno(TTPlayableLandingPageActivity.this);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("playable_url", TTPlayableLandingPageActivity.this.jqy);
                        } catch (JSONException e10) {
                            qbp.ouw("TTPWPActivity", "onClick JSON ERROR", e10);
                        }
                        com.bytedance.sdk.openadsdk.yu.lh.vt(TTPlayableLandingPageActivity.this.yu, this.f8207cf, "click_playable_download_button_loading", jSONObject);
                    }
                }
            };
            ouwVar.ouw(this.f7717cd);
            com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar2 = this.lso;
            if (ouwVar2 != null) {
                ouwVar2.ouw(ouwVar);
            }
            this.lso.ouw(this);
            this.lso.ouw(false, (com.bytedance.sdk.openadsdk.mwh.le) null);
            String strValueOf = String.valueOf(this.yu.fqk());
            zih.yu();
            int i10 = cf.qbp(strValueOf).zih;
            if (i10 >= 0) {
                this.ksc.sendEmptyMessageDelayed(1, i10 * 1000);
            } else {
                osn.ouw((View) this.f7718cf, 0);
            }
            lh.ouw.ouw(SystemClock.elapsedRealtime() - jElapsedRealtime, this.yu, "embeded_ad", this.osn, this.f7722pd);
            com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar3 = this.lso;
            if (ouwVar3 != null) {
                ouwVar3.ouw();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        od odVarOuw = od.ouw();
        String strVt = od.vt(this.yu);
        if (!TextUtils.isEmpty(strVt)) {
            odVarOuw.fkw.remove(strVt);
        }
        com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.lso;
        if (ouwVar != null) {
            ouwVar.yu();
        }
        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = this.rrs;
        if (fkwVar != null) {
            fkwVar.ryl();
            this.rrs.mwh();
        }
        this.ksc.removeCallbacksAndMessages(null);
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(this.f7722pd)) {
            lh.ouw.ouw(this.bs.get(), this.fvf.get(), this.yu);
        }
        com.bytedance.sdk.openadsdk.ra.vt.ouw();
        com.bytedance.sdk.openadsdk.ra.vt.ouw(this.osn);
        com.bytedance.sdk.component.bly.le leVar = this.ra;
        if (leVar != null) {
            ey.ouw(leVar.getWebView());
            this.ra.bly();
        }
        this.ra = null;
        bs bsVar = this.qbp;
        if (bsVar != null) {
            bsVar.lh();
        }
        bs bsVar2 = this.zin;
        if (bsVar2 != null) {
            bsVar2.lh();
        }
        com.bytedance.sdk.openadsdk.zin.pno pnoVar = this.uoy;
        if (pnoVar != null) {
            pnoVar.jg();
        }
        mwh mwhVar = this.jvy;
        if (mwhVar != null) {
            mwhVar.ouw(true);
        }
        cd cdVar = this.ouw;
        if (cdVar != null) {
            cdVar.vt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, JSONException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        bs bsVar = this.qbp;
        if (bsVar != null) {
            bsVar.vm = false;
        }
        com.bytedance.sdk.openadsdk.zin.pno pnoVar = this.uoy;
        if (pnoVar != null) {
            pnoVar.ouw(true);
            this.uoy.vt(false);
        }
        com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.lso;
        if (ouwVar != null) {
            ouwVar.lh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, JSONException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        bs bsVar = this.qbp;
        if (bsVar != null) {
            bsVar.vt();
            com.bytedance.sdk.component.bly.le leVar = this.ra;
            if (leVar != null) {
                this.qbp.vm = leVar.getVisibility() == 0;
            }
        }
        bs bsVar2 = this.zin;
        if (bsVar2 != null) {
            bsVar2.vt();
        }
        com.bytedance.sdk.openadsdk.zin.pno pnoVar = this.uoy;
        if (pnoVar != null) {
            pnoVar.vt(true);
        }
        mwh mwhVar = this.jvy;
        if (mwhVar != null) {
            mwhVar.fkw();
        }
        if (DeviceUtils.ra() == 0) {
            this.ey = true;
        }
        yu(this.ey);
        com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.lso;
        if (ouwVar != null) {
            ouwVar.vt();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int iOuw = this.yu != null ? od.ouw().ouw(this.yu) : -1;
            this.fkw = iOuw;
            bundle.putInt("meta_index", iOuw);
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.fkw >= 0) {
            od.ouw().vt(this.fkw);
            this.fkw = -1;
        }
        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = this.rrs;
        if (fkwVar != null) {
            fkwVar.tlj();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = this.rrs;
        if (fkwVar != null) {
            fkwVar.bly();
        }
        mwh mwhVar = this.jvy;
        if (mwhVar != null) {
            mwhVar.le();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final List<vpp> pv() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ra() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final View rn() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void tlj() {
    }

    public static /* synthetic */ boolean ra(TTPlayableLandingPageActivity tTPlayableLandingPageActivity) {
        tTPlayableLandingPageActivity.jae = true;
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final void vt() {
        lh();
    }

    public final void yu(boolean z3) {
        try {
            this.ey = z3;
            this.ko.setImageDrawable(z3 ? com.bytedance.sdk.openadsdk.utils.cf.ouw(this.rn, "tt_mute_wrapper") : com.bytedance.sdk.openadsdk.utils.cf.ouw(this.rn, "tt_unmute_wrapper"));
            com.bytedance.sdk.openadsdk.zin.pno pnoVar = this.uoy;
            if (pnoVar != null) {
                pnoVar.ouw(z3);
            }
            com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.lso;
            if (ouwVar != null) {
                ouwVar.ouw(z3);
            }
        } catch (Exception e2) {
            qbp.lh("TTPWPActivity", e2.getMessage());
        }
    }

    private void lh() {
        super.onBackPressed();
        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = this.rrs;
        if (fkwVar != null) {
            fkwVar.pno();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(boolean z3) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.lh.yu
    public final void vt(boolean z3) {
        com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh lhVar;
        this.jae = true;
        this.f7721od = z3;
        if (!z3) {
            try {
                Toast.makeText(this.rn, "Download later", 0).show();
            } catch (Throwable unused) {
            }
        }
        if (!this.f7721od || (lhVar = this.f7717cd) == null) {
            return;
        }
        lhVar.ouw(this.yu);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final boolean ouw() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final boolean ouw(long j, boolean z3) {
        return false;
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) throws JSONException {
        int i4 = message.what;
        if (i4 == 1) {
            osn.ouw((View) this.f7718cf, 0);
            return;
        }
        if (i4 != 2) {
            return;
        }
        tlj tljVar = this.zih;
        if (tljVar == null || tljVar.ouw <= 0 || tljVar.vt <= 0) {
            ko.vt("playable hidden loading , type:" + message.arg1);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                int i10 = message.arg2;
                if (i10 != 0) {
                    jSONObject.put("remove_loading_page_reason", i10);
                }
                jSONObject.put("playable_url", this.jqy);
                tlj tljVar2 = this.zih;
                jSONObject.put("duration", tljVar2 != null ? tljVar2.getDisplayDuration() : 0L);
            } catch (JSONException e2) {
                qbp.ouw("TTPWPActivity", "handleMsg json error", e2);
            }
            com.bytedance.sdk.openadsdk.yu.lh.vt(this.yu, "embeded_ad", "remove_loading_page", jSONObject);
            this.ksc.removeMessages(2);
            tlj tljVar3 = this.zih;
            if (tljVar3 != null) {
                tljVar3.lh();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yu() {
        od.vt vtVar;
        od odVarOuw = od.ouw();
        vpp vppVar = this.yu;
        if (vppVar != null) {
            String strVt = od.vt(vppVar);
            if (TextUtils.isEmpty(strVt) || (vtVar = odVarOuw.fkw.get(strVt)) == null) {
                return;
            }
            vtVar.ouw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void bs() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void cf() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ey() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void jvy() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ko() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void osn() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ryl() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void vm() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void wp() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void zih() {
    }

    public static /* synthetic */ Message ouw(int i4) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.arg1 = i4;
        if (i4 == 3) {
            messageObtain.arg2 = 0;
        }
        return messageObtain;
    }

    public static /* synthetic */ void ouw(TTPlayableLandingPageActivity tTPlayableLandingPageActivity, String str) {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), tTPlayableLandingPageActivity.yu, "embeded_ad", str);
    }
}
