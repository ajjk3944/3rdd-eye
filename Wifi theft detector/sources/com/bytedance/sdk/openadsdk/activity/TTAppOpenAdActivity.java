package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.sb;
import com.bytedance.sdk.openadsdk.core.settings.gbl;
import com.bytedance.sdk.openadsdk.core.sz.dg.emc;
import com.bytedance.sdk.openadsdk.core.zz.sup;
import com.bytedance.sdk.openadsdk.ee.ypw.bw;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.mxo;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTAppOpenAdActivity extends TTBaseActivity implements sf.emc, emc.InterfaceC0162emc {
    private static com.bytedance.sdk.openadsdk.emc.dg.ypw gbl;
    private TTAdDislikeToast cf;
    private com.bytedance.sdk.openadsdk.component.xq cuf;
    private com.bytedance.sdk.openadsdk.emc.dg.ypw db;
    private int dr;
    private IListenerManager ee;
    private rie hxp;
    private long iyl;
    private boolean lt;
    protected boolean msw;
    private boolean mxo;
    private aa qh;
    private String rie;
    private AdSlot rtt;
    private com.bytedance.sdk.openadsdk.dg.uym sba;
    private int sf;
    private int sra;
    private com.bytedance.sdk.openadsdk.component.ycc.ypw sz;
    private float ul;
    private FrameLayout xmt;
    private boolean ylm;
    private float yzg;
    protected final AtomicBoolean emc = new AtomicBoolean(false);
    protected final sf ypw = new sf(Looper.getMainLooper(), this);
    final AtomicBoolean xq = new AtomicBoolean(false);
    final AtomicBoolean dg = new AtomicBoolean(false);
    private final com.bytedance.sdk.openadsdk.component.msw.emc sup = new com.bytedance.sdk.openadsdk.component.msw.emc();
    protected boolean bw = false;
    private final AtomicBoolean vk = new AtomicBoolean(false);

    /* renamed from: aa, reason: collision with root package name */
    private mxo f9244aa = mxo.xq();
    private final AtomicBoolean sb = new AtomicBoolean(false);
    long ycc = 0;
    private volatile boolean mkp = false;
    int uym = -1;
    private final com.bytedance.sdk.openadsdk.component.emc tp = new com.bytedance.sdk.openadsdk.component.emc() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.1
        @Override // com.bytedance.sdk.openadsdk.component.emc
        public void bw() {
            TTAppOpenAdActivity.this.rie();
        }

        @Override // com.bytedance.sdk.openadsdk.component.emc
        public void dg() {
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.emc, s2.b.InterfaceC0477b
        public void emc() {
            TTAppOpenAdActivity.this.db();
            TTAppOpenAdActivity.this.hxp();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.emc
        public void xq() {
            TTAppOpenAdActivity.this.msw();
            TTAppOpenAdActivity.this.f9244aa.bw();
            TTAppOpenAdActivity.this.ul();
            if (TTAppOpenAdActivity.this.ylm) {
                TTAppOpenAdActivity.this.qh();
            }
            if (TTAppOpenAdActivity.this.cuf.uym() == null || TTAppOpenAdActivity.this.cuf.uym().ypw() == null) {
                return;
            }
            TTAppOpenAdActivity.this.cuf.uym().ypw().emc(TTAppOpenAdActivity.this);
        }

        @Override // com.bytedance.sdk.openadsdk.component.emc, s2.b.InterfaceC0477b
        public void ypw(long j10, int i10) {
            com.bytedance.sdk.openadsdk.component.msw.xq xqVarUym;
            StringBuilder sb = new StringBuilder("onError() called with: totalPlayTime = [");
            sb.append(j10);
            sb.append("], percent = [");
            sb.append(i10);
            sb.append("]");
            if (TTAppOpenAdActivity.this.cuf != null && (xqVarUym = TTAppOpenAdActivity.this.cuf.uym()) != null) {
                TTAppOpenAdActivity.this.db();
                xqVarUym.emc(true);
            }
            TTAppOpenAdActivity.this.hxp();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.emc, s2.b.InterfaceC0477b
        public void emc(long j10, long j11) {
            TTAppOpenAdActivity.this.sup.xq(j10);
            TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
            if (!tTAppOpenAdActivity.bw && tTAppOpenAdActivity.cuf != null && TTAppOpenAdActivity.this.cuf.uym() != null && TTAppOpenAdActivity.this.cuf.uym().bw()) {
                TTAppOpenAdActivity.this.cuf.uym().msw();
            }
            TTAppOpenAdActivity.this.cf();
            if (TTAppOpenAdActivity.this.cuf instanceof com.bytedance.sdk.openadsdk.component.ypw) {
                ((com.bytedance.sdk.openadsdk.component.ypw) TTAppOpenAdActivity.this.cuf).emc(j10, j11);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.emc, com.bytedance.sdk.openadsdk.component.ycc.emc
        public void ypw(View view) {
            TTAppOpenAdActivity.this.xq();
        }

        @Override // com.bytedance.sdk.openadsdk.component.emc, com.bytedance.sdk.openadsdk.component.ycc.emc
        public void ypw() {
            TTAppOpenAdActivity.this.mkp = true;
            if (com.bytedance.sdk.openadsdk.sra.emc.emc("splash_auto_close_switch", 0) == 0) {
                TTAppOpenAdActivity.this.zz();
                TTAppOpenAdActivity.this.finish();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.emc, com.bytedance.sdk.openadsdk.component.ycc.emc
        public void emc(View view) throws JSONException {
            TTAppOpenAdActivity.this.ee();
        }

        @Override // com.bytedance.sdk.openadsdk.component.emc, com.bytedance.sdk.openadsdk.component.ycc.emc
        public void emc(int i10, boolean z10) {
            if (TTAppOpenAdActivity.this.cuf != null) {
                TTAppOpenAdActivity.this.cuf.emc(i10, z10);
            }
        }
    };
    private final Runnable vw = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.5
        @Override // java.lang.Runnable
        public void run() throws JSONException {
            com.bytedance.sdk.openadsdk.core.model.dg dgVarEh;
            com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
            if (TTAppOpenAdActivity.this.vk.get()) {
                return;
            }
            if (TTAppOpenAdActivity.this.hxp != null && (dgVarEh = TTAppOpenAdActivity.this.hxp.eh()) != null && (dgVarEmc = dgVarEh.emc()) != null) {
                dgVarEmc.emc(0L);
            }
            TTAppOpenAdActivity.this.sba = new com.bytedance.sdk.openadsdk.dg.uym();
            TTAppOpenAdActivity.this.sba.emc(System.currentTimeMillis(), 1.0f);
            TTAppOpenAdActivity.this.f9244aa.bw();
            if (TTAppOpenAdActivity.this.sz != null) {
                TTAppOpenAdActivity.this.sz.ypw();
            }
            if (TTAppOpenAdActivity.this.cuf != null) {
                TTAppOpenAdActivity.this.cuf.bw();
            }
            TTAppOpenAdActivity.this.sra();
            View viewFindViewById = TTAppOpenAdActivity.this.findViewById(R.id.content);
            JSONObject jSONObject = new JSONObject();
            if (viewFindViewById != null) {
                try {
                    jSONObject.put("width", viewFindViewById.getWidth());
                    jSONObject.put("height", viewFindViewById.getHeight());
                    jSONObject.put("alpha", viewFindViewById.getAlpha());
                } catch (JSONException e10) {
                    Log.e("TTAppOpenAdActivity", "run: ", e10);
                    TTAppOpenAdActivity.this.finish();
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("root_view", jSONObject.toString());
            jSONObject2.put("ad_root", TTAppOpenAdActivity.this.sf);
            jSONObject2.put("openad_creative_type", TTAppOpenAdActivity.this.ylm ? "video_normal_ad" : "image_normal_ad");
            if (com.bytedance.sdk.openadsdk.component.zz.msw.xq() == null) {
                jSONObject2.put("appicon_acquirefail", "1");
            }
            if (TTAppOpenAdActivity.this.lt || TTAppOpenAdActivity.this.hxp.yvi()) {
                if (TTAppOpenAdActivity.this.ylm()) {
                    jSONObject2.put("dynamic_show_type", TTAppOpenAdActivity.this.yzg());
                } else {
                    jSONObject2.put("dynamic_show_type", 1);
                }
                TTAppOpenAdActivity.this.emc(jSONObject2);
            }
            jSONObject2.put("is_icon_only", TTAppOpenAdActivity.this.hxp.xmt() ? 1 : 0);
            JSONObject jSONObject3 = new JSONObject();
            if (TTAppOpenAdActivity.this.sf == 1) {
                jSONObject3.putOpt("cache_duration", Long.valueOf(System.currentTimeMillis() - TTAppOpenAdActivity.this.iyl));
            }
            if (TTAppOpenAdActivity.this.hxp != null) {
                int iRu = TTAppOpenAdActivity.this.hxp.ru();
                jSONObject3.putOpt("start_type", Integer.valueOf(iRu == 1 ? 1 : 2));
                jSONObject3.putOpt("load_index", Integer.valueOf(iRu));
            }
            jSONObject3.putOpt("start_type_backup", Integer.valueOf(com.bytedance.sdk.openadsdk.component.uym.emc.dg()));
            jSONObject3.putOpt("app_running_time", Long.valueOf(com.bytedance.sdk.openadsdk.component.uym.emc.ypw()));
            com.bytedance.sdk.openadsdk.dg.xq.emc(TTAppOpenAdActivity.this.hxp, "open_ad", jSONObject2, jSONObject3);
            com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(TTAppOpenAdActivity.this.findViewById(R.id.content), TTAppOpenAdActivity.this.hxp, new bw.emc(TTAppOpenAdActivity.this.yzg()));
            com.bytedance.sdk.openadsdk.ee.emc.xq.emc(TTAppOpenAdActivity.this.hxp);
            TTAppOpenAdActivity.this.vk.set(true);
        }
    };

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public boolean emc() {
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
        vw.emc((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.7
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i10) {
                if (i10 == 0) {
                    try {
                        if (TTAppOpenAdActivity.this.isFinishing()) {
                            return;
                        }
                        TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.7.1
                            @Override // java.lang.Runnable
                            public void run() {
                                vw.emc((Activity) TTAppOpenAdActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e10) {
                        ul.xq("TTAppOpenAdActivity", e10.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() throws JSONException {
        sba();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.core.aa.ypw(getApplicationContext());
        boolean z10 = false;
        if (bundle != null) {
            z10 = bundle.getBoolean("enable_new_arch", false);
        } else if (getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false)) {
            z10 = true;
        }
        this.mxo = z10;
        ul.emc("BVA", "onCreate: isEnableNewArch = " + this.mxo);
        if (!ypw(bundle)) {
            finish();
            return;
        }
        if (!qh.bw()) {
            finish();
            return;
        }
        if (bundle != null) {
            com.bytedance.sdk.openadsdk.dg.xq.ypw(this.hxp, "open_ad", (JSONObject) null, (JSONObject) null);
        }
        this.ylm = rie.bw(this.hxp);
        new StringBuilder("onCreate: isVideo is ").append(this.ylm);
        if (this.ylm) {
            this.sup.emc((float) this.hxp.iat().E());
        } else {
            this.sup.emc(com.bytedance.sdk.openadsdk.core.aa.dg().rie(String.valueOf(this.sra)));
        }
        com.bytedance.sdk.openadsdk.component.ycc.ypw ypwVar = new com.bytedance.sdk.openadsdk.component.ycc.ypw(this.sup);
        this.sz = ypwVar;
        ypwVar.emc(this.tp);
        ru();
        FrameLayout frameLayout = new FrameLayout(this);
        this.xmt = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        try {
            setContentView(this.xmt);
            this.xmt.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.2
                /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        r10 = this;
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.core.model.rie r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.qh(r0)     // Catch: java.lang.Throwable -> L23
                        int r0 = r0.ej()     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r1 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.core.model.rie r2 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.qh(r1)     // Catch: java.lang.Throwable -> L23
                        if (r2 == 0) goto L26
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r2 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.core.model.rie r2 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.qh(r2)     // Catch: java.lang.Throwable -> L23
                        int r2 = r2.yid()     // Catch: java.lang.Throwable -> L23
                        r3 = 2
                        if (r2 != r3) goto L26
                        r2 = 1
                        if (r0 == r2) goto L26
                        goto L27
                    L23:
                        r0 = move-exception
                        goto Ld0
                    L26:
                        r2 = 0
                    L27:
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.ypw(r1, r2)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        boolean r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.cf(r0)     // Catch: java.lang.Throwable -> L23
                        if (r0 == 0) goto L6d
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        boolean r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.vk(r0)     // Catch: java.lang.Throwable -> L23
                        if (r0 == 0) goto L6d
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r2 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.ypw r1 = new com.bytedance.sdk.openadsdk.component.ypw     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.core.model.rie r3 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.qh(r2)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        android.widget.FrameLayout r4 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.aa(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.emc r5 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.sba(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        int r6 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.yzg(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        boolean r7 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.gbl(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.msw.emc r8 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.dg(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.ycc.ypw r9 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.ul(r0)     // Catch: java.lang.Throwable -> L23
                        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.emc(r2, r1)     // Catch: java.lang.Throwable -> L23
                        goto Lae
                    L6d:
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r2 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.xq r1 = new com.bytedance.sdk.openadsdk.component.xq     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.core.model.rie r3 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.qh(r2)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        android.widget.FrameLayout r4 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.aa(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.emc r5 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.sba(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        int r6 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.yzg(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        boolean r7 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.gbl(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.msw.emc r8 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.dg(r0)     // Catch: java.lang.Throwable -> L23
                        r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.emc(r2, r1)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.xq r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.emc(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r1 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        float r1 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.ylm(r1)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r2 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        float r2 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.sra(r2)     // Catch: java.lang.Throwable -> L23
                        r0.emc(r1, r2)     // Catch: java.lang.Throwable -> L23
                    Lae:
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.xq r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.emc(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r1 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        android.widget.FrameLayout r1 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.aa(r1)     // Catch: java.lang.Throwable -> L23
                        r0.emc(r1)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.xq r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.emc(r0)     // Catch: java.lang.Throwable -> L23
                        r0.emc()     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.xq r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.emc(r0)     // Catch: java.lang.Throwable -> L23
                        r0.ypw()     // Catch: java.lang.Throwable -> L23
                        return
                    Ld0:
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r1 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this
                        r1.finish()
                        java.lang.String r1 = "TTAppOpenAdActivity"
                        java.lang.String r0 = r0.getMessage()
                        com.bytedance.sdk.component.utils.ul.xq(r1, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.AnonymousClass2.run():void");
                }
            });
            try {
                final View decorView = getWindow().getDecorView();
                if (Build.VERSION.SDK_INT >= 35) {
                    this.msw = true;
                    decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.3
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                            List boundingRects;
                            try {
                                DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                                if (displayCutout != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
                                    decorView.setPadding(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                                }
                            } catch (Throwable unused) {
                            }
                            return windowInsets;
                        }
                    });
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            com.bytedance.sdk.openadsdk.vk.xq.ypw();
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() throws JSONException {
        AdSlot adSlot;
        super.onDestroy();
        if (this.hxp != null) {
            com.bytedance.sdk.openadsdk.ycc.ypw.emc().emc("videoForceBreak", this.hxp);
        }
        this.ypw.removeCallbacksAndMessages(null);
        com.bytedance.sdk.openadsdk.component.ycc.ypw ypwVar = this.sz;
        if (ypwVar != null) {
            ypwVar.bw();
        }
        com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(this.hxp);
        com.bytedance.sdk.openadsdk.ee.emc.xq.ypw(this.hxp);
        if (this.ylm) {
            com.bytedance.sdk.openadsdk.component.dg.emc.emc(this.hxp, this.sup.dg(), this.sup.ypw(), true);
        } else {
            com.bytedance.sdk.openadsdk.component.dg.emc.emc(this.hxp, -1L, this.sup.ypw(), false);
        }
        if (this.f9244aa.ycc() && this.vk.get()) {
            com.bytedance.sdk.openadsdk.dg.xq.emc(String.valueOf(this.f9244aa.dg()), this.hxp, "open_ad", this.sba);
            this.f9244aa = mxo.xq();
        }
        com.bytedance.sdk.openadsdk.component.xq xqVar = this.cuf;
        if (xqVar != null) {
            xqVar.xq();
        }
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            emc("recycleRes");
        }
        zz();
        gbl = null;
        if (this.mxo && !TextUtils.isEmpty(this.ru)) {
            com.bytedance.sdk.openadsdk.core.sf.emc().emc(this.ru, isFinishing(), isChangingConfigurations());
        }
        this.db = null;
        aa aaVar = this.qh;
        if (aaVar != null) {
            aaVar.setCallback(null);
        }
        rie rieVar = this.hxp;
        if (rieVar == null || rie.uym(rieVar) || this.hxp.wh() || (adSlot = this.rtt) == null) {
            return;
        }
        adSlot.setCacheScene(1);
        com.bytedance.sdk.openadsdk.component.ycc.emc(com.bytedance.sdk.openadsdk.core.aa.emc()).emc(this.rtt);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        this.bw = false;
        bw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        com.bytedance.sdk.openadsdk.component.xq xqVar;
        super.onResume();
        this.bw = true;
        if (this.emc.getAndSet(true)) {
            if (!this.sb.get()) {
                dg();
                return;
            }
            hxp();
            if (this.ylm && (xqVar = this.cuf) != null && xqVar.uym() != null) {
                db();
                this.cuf.uym().emc(3);
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
            this.uym = this.hxp != null ? com.bytedance.sdk.openadsdk.core.sf.emc().emc(this.hxp) : -1;
            if (!TextUtils.isEmpty(this.ru)) {
                bundle.putString("single_process_listener_key", this.ru);
            }
            bundle.putBoolean("enable_new_arch", this.mxo);
            bundle.putInt("meta_index", this.uym);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.rie);
            bundle.putInt("ad_source", this.sf);
            bundle.putLong("start_show_time", this.ycc);
            bundle.putLong("cache_time", this.iyl);
        } catch (Throwable th) {
            ul.xq("TTAppOpenAdActivity", th.getMessage());
        }
        if (!this.mxo) {
            gbl = this.db;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.uym >= 0) {
            com.bytedance.sdk.openadsdk.core.sf.emc().xq(this.uym);
            this.uym = -1;
        }
        com.bytedance.sdk.openadsdk.utils.dg.emc(this, this.hxp);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            if (!this.lt) {
                this.f9244aa.bw();
            }
            rie rieVar = this.hxp;
            if (rieVar != null && rieVar.pdv() && !this.hxp.sb()) {
                this.hxp.ycc(true);
                rie rieVar2 = this.hxp;
                com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar2, "open_ad", rieVar2.du());
            }
        } else if (this.vk.get()) {
            if (this.f9244aa.ycc()) {
                com.bytedance.sdk.openadsdk.dg.xq.emc(String.valueOf(this.f9244aa.dg()), this.hxp, "open_ad", this.sba);
            }
            this.f9244aa = mxo.xq();
        }
        com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(this.hxp, z10 ? 4 : 8);
        com.bytedance.sdk.openadsdk.ee.emc.xq.emc(this.hxp, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aa() {
        this.cf.show(TTAdDislikeToast.getDislikeSendTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cf() {
        if (!this.ylm || this.hxp.xmt()) {
            return;
        }
        this.ypw.removeMessages(100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void db() {
        rie rieVar;
        try {
            if (this.sz == null || (rieVar = this.hxp) == null || rieVar.pdk() == null) {
                return;
            }
            int iYpw = this.hxp.pdk().ypw();
            if (iYpw == 1 || iYpw == 2) {
                this.sz.emc(iYpw, this.hxp.pdk().emc(), false);
                com.bytedance.sdk.openadsdk.component.xq xqVar = this.cuf;
                if (xqVar == null || xqVar.uym() == null) {
                    return;
                }
                this.cuf.uym().ypw().emc(this.sup.emc());
                this.cuf.uym().ypw().emc(1.0f);
            }
        } catch (Throwable th) {
            ul.xq("TTAppOpenAdActivity", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ee() throws JSONException {
        com.bytedance.sdk.openadsdk.core.model.dg dgVarEh;
        com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
        com.bytedance.sdk.openadsdk.component.xq xqVar;
        sb.xq(this.sra);
        hxp();
        if (this.ylm && (xqVar = this.cuf) != null && xqVar.uym() != null) {
            db();
            this.cuf.uym().emc(4);
        }
        com.bytedance.sdk.openadsdk.component.dg.emc.emc(this.hxp, (int) this.sup.xq(), this.sz.emc(), this.sup.ypw());
        rie rieVar = this.hxp;
        if (rieVar != null && (dgVarEh = rieVar.eh()) != null && (dgVarEmc = dgVarEh.emc()) != null) {
            com.bytedance.sdk.openadsdk.component.xq xqVar2 = this.cuf;
            long jSz = (xqVar2 == null || xqVar2.uym() == null) ? 0L : this.cuf.uym().sz();
            dgVarEmc.ycc(jSz);
            dgVarEmc.bw(jSz);
        }
        finish();
    }

    private void gbl() {
        int iMin;
        int iMax;
        new StringBuilder("changeScreenOrientation: mOrientation=").append(this.dr);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 != 26) {
            if (i10 == 27) {
                try {
                    sup();
                } catch (Throwable th) {
                    ul.xq("TTAppOpenAdActivity", th.getMessage());
                    return;
                }
            } else {
                sup();
            }
        }
        Pair<Integer, Integer> pairGbl = vw.gbl(getApplicationContext());
        if (this.dr == 2) {
            iMin = Math.max(((Integer) pairGbl.first).intValue(), ((Integer) pairGbl.second).intValue());
            iMax = Math.min(((Integer) pairGbl.first).intValue(), ((Integer) pairGbl.second).intValue());
        } else {
            iMin = Math.min(((Integer) pairGbl.first).intValue(), ((Integer) pairGbl.second).intValue());
            iMax = Math.max(((Integer) pairGbl.first).intValue(), ((Integer) pairGbl.second).intValue());
        }
        this.yzg = iMax;
        this.ul = iMin;
        float fEmc = vw.emc();
        if (vw.xq((Activity) this)) {
            int i11 = this.dr;
            if (i11 == 1) {
                this.yzg -= fEmc;
            } else if (i11 == 2) {
                this.ul -= fEmc;
            }
        }
        com.bytedance.sdk.openadsdk.component.xq xqVar = this.cuf;
        if (xqVar != null) {
            xqVar.emc(this.ul, this.yzg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hxp() {
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            emc("onAdSkip");
            return;
        }
        com.bytedance.sdk.openadsdk.emc.dg.ypw ypwVar = this.db;
        if (ypwVar != null) {
            ypwVar.ypw();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void msw() {
        Log.d("TTAppOpenAdActivity", "startCountDownTimer() called");
        rie rieVar = this.hxp;
        int iSra = (rieVar == null || rieVar.ypw() < 0) ? com.bytedance.sdk.openadsdk.core.aa.dg().sra(String.valueOf(this.sra)) : this.hxp.ypw();
        this.sz.emc(this.sup.ypw());
        this.sz.ypw(iSra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qh() {
        if (!this.ylm || this.hxp.xmt() || this.mkp) {
            return;
        }
        this.ypw.sendEmptyMessageDelayed(100, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rie() {
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            emc("onAdClicked");
        } else {
            com.bytedance.sdk.openadsdk.emc.dg.ypw ypwVar = this.db;
            if (ypwVar != null) {
                ypwVar.onAdClicked();
            }
        }
        if (gbl.xq().hxp(String.valueOf(this.sra))) {
            this.sb.set(true);
        }
    }

    private void ru() {
        if (26 != Build.VERSION.SDK_INT) {
            this.dr = this.hxp.ono();
        } else if (getResources().getConfiguration().orientation == 1) {
            this.dr = 1;
        } else {
            this.dr = 2;
        }
        gbl();
    }

    private void sba() throws JSONException {
        if (com.bytedance.sdk.openadsdk.core.aa.dg().ylm(String.valueOf(this.sra)) == 1) {
            if (this.sup.xq() >= com.bytedance.sdk.openadsdk.core.aa.dg().sra(String.valueOf(this.sra)) * 1000) {
                ee();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sra() {
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            emc("onAdShow");
            return;
        }
        com.bytedance.sdk.openadsdk.emc.dg.ypw ypwVar = this.db;
        if (ypwVar != null) {
            ypwVar.emc();
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void sup() {
        if (this.dr != 2) {
            setRequestedOrientation(1);
        } else if (uym()) {
            setRequestedOrientation(8);
        } else {
            setRequestedOrientation(0);
        }
        if (this.dr == 2 || !vw.xq((Activity) this)) {
            getWindow().addFlags(1024);
        }
    }

    private void sz() {
        if (this.qh == null) {
            aa aaVar = new aa(this, this.hxp);
            this.qh = aaVar;
            aaVar.setDislikeSource("video_player");
            this.qh.setCallback(new aa.emc() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.4
                @Override // com.bytedance.sdk.openadsdk.common.aa.emc
                public void emc(View view) {
                    TTAppOpenAdActivity.this.xq.set(true);
                    TTAppOpenAdActivity.this.bw();
                    com.bytedance.sdk.openadsdk.ee.emc.xq.emc(TTAppOpenAdActivity.this.hxp, 8);
                }

                @Override // com.bytedance.sdk.openadsdk.common.aa.emc
                public void ypw(View view) {
                    TTAppOpenAdActivity.this.xq.set(false);
                    TTAppOpenAdActivity.this.dg();
                    com.bytedance.sdk.openadsdk.ee.emc.xq.emc(TTAppOpenAdActivity.this.hxp, 4);
                }

                @Override // com.bytedance.sdk.openadsdk.common.aa.emc
                public void emc(FilterWord filterWord) {
                    if (TTAppOpenAdActivity.this.dg.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    TTAppOpenAdActivity.this.dg.set(true);
                    TTAppOpenAdActivity.this.aa();
                }
            });
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
        frameLayout.addView(this.qh);
        if (this.cf == null) {
            TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this);
            this.cf = tTAdDislikeToast;
            frameLayout.addView(tTAdDislikeToast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ul() {
        if (this.vk.get()) {
            return;
        }
        try {
            getWindow().getDecorView().post(this.vw);
        } catch (Throwable unused) {
            finish();
        }
    }

    private void vk() {
        this.cf.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ylm() {
        if (!this.hxp.cuf()) {
            return false;
        }
        int iEj = this.hxp.ej();
        return ((iEj == 0 || iEj == 9) && (com.bytedance.sdk.component.adexpress.emc.ypw.xq.emc(sup.ypw(), "3.1.78") || com.bytedance.sdk.component.adexpress.emc.ypw.xq.emc(sup.xq(), "3.1.78"))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int yzg() {
        if (this.hxp.yvi()) {
            return 5;
        }
        if (this.lt) {
            return this.cuf.dg();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zz() {
        ul.emc("TTAppOpenAdActivity", "invoke callback onAdDismiss, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            emc("onAdTimeOver");
            return;
        }
        com.bytedance.sdk.openadsdk.emc.dg.ypw ypwVar = this.db;
        if (ypwVar != null) {
            ypwVar.xq();
        }
    }

    public void bw() {
        if (this.ylm) {
            com.bytedance.sdk.openadsdk.component.xq xqVar = this.cuf;
            if (xqVar != null && xqVar.uym() != null && this.cuf.uym().bw()) {
                this.cuf.uym().msw();
            }
            cf();
        }
        com.bytedance.sdk.openadsdk.component.ycc.ypw ypwVar = this.sz;
        if (ypwVar != null) {
            ypwVar.dg();
        }
    }

    public void dg() {
        if (this.xq.get()) {
            return;
        }
        if (this.ylm) {
            com.bytedance.sdk.openadsdk.component.xq xqVar = this.cuf;
            if (xqVar != null && xqVar.uym() != null && this.cuf.uym().ycc()) {
                this.cuf.uym().gbl();
            }
            qh();
        }
        com.bytedance.sdk.openadsdk.component.ycc.ypw ypwVar = this.sz;
        if (ypwVar != null) {
            ypwVar.xq();
        }
    }

    public boolean uym() {
        try {
            return getIntent().getIntExtra("orientation_angle", 0) == 3;
        } catch (Exception e10) {
            ul.xq("TTAppOpenAdActivity", e10.getMessage());
            return false;
        }
    }

    public void xq() {
        if (isFinishing()) {
            return;
        }
        if (this.dg.get()) {
            vk();
            return;
        }
        if (this.qh == null) {
            try {
                sz();
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "TTAppOpenAdActivity", th);
            }
        }
        aa aaVar = this.qh;
        if (aaVar != null) {
            aaVar.emc();
        }
    }

    public IListenerManager ycc() {
        if (this.ee == null) {
            this.ee = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.emc.emc().emc(7));
        }
        return this.ee;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public void ypw() throws JSONException {
        sba();
    }

    private boolean ypw(Bundle bundle) {
        String stringExtra;
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            Intent intent = getIntent();
            if (intent != null) {
                String stringExtra2 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra2 != null) {
                    try {
                        this.hxp = com.bytedance.sdk.openadsdk.core.ypw.emc(new JSONObject(stringExtra2));
                    } catch (Exception e10) {
                        ul.xq("TTAppOpenAdActivity", "open_ad", "initData MultiGlobalInfo throws ", e10);
                    }
                }
                this.rie = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            }
        } else {
            this.hxp = com.bytedance.sdk.openadsdk.core.sf.emc().emc(com.bytedance.sdk.openadsdk.core.sf.emc(getIntent()));
            if (this.mxo) {
                if (bundle != null) {
                    stringExtra = bundle.getString("single_process_listener_key");
                } else {
                    stringExtra = getIntent() != null ? getIntent().getStringExtra("single_process_listener_key") : null;
                }
                this.ru = stringExtra;
                this.db = (com.bytedance.sdk.openadsdk.emc.dg.ypw) com.bytedance.sdk.openadsdk.core.sf.emc().emc(this.ru, com.bytedance.sdk.openadsdk.emc.dg.ypw.class);
            } else {
                this.db = com.bytedance.sdk.openadsdk.core.sf.emc().dg();
            }
            com.bytedance.sdk.openadsdk.core.sf.emc().bw();
        }
        emc(getIntent());
        emc(bundle);
        rie rieVar = this.hxp;
        if (rieVar == null) {
            finish();
            return false;
        }
        this.rtt = rieVar.vaf();
        this.hxp.emc(this.ycc);
        this.sra = this.hxp.tx();
        com.bytedance.sdk.openadsdk.utils.ypw.emc(this.hxp);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject emc(JSONObject jSONObject) {
        if (yzg() == 0) {
            return this.cuf.emc(jSONObject);
        }
        return null;
    }

    private void emc(final String str) {
        iyl.xq(new com.bytedance.sdk.component.msw.msw("AppOpenAd_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTAppOpenAdActivity.this.ycc().executeAppOpenAdCallback(TTAppOpenAdActivity.this.rie, str);
                } catch (Throwable th) {
                    ul.xq("TTAppOpenAdActivity", "open_ad", "executeAppOpenAdCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    public void emc(Intent intent) {
        if (intent != null) {
            this.sf = intent.getIntExtra("ad_source", 0);
            this.iyl = intent.getLongExtra("cache_time", 0L);
            this.ycc = intent.getLongExtra("start_show_time", 0L);
        }
    }

    public void emc(Bundle bundle) {
        if (bundle != null) {
            if (!this.mxo && this.db == null) {
                this.db = gbl;
                gbl = null;
            }
            try {
                int i10 = bundle.getInt("meta_index", -1);
                this.rie = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
                this.sf = bundle.getInt("ad_source", 0);
                this.ycc = bundle.getLong("start_show_time", 0L);
                this.iyl = bundle.getLong("cache_time", 0L);
                this.hxp = com.bytedance.sdk.openadsdk.core.sf.emc().emc(i10);
            } catch (Throwable th) {
                ul.xq("TTAppOpenAdActivity", th.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.sf.emc
    public void emc(Message message) {
        com.bytedance.sdk.openadsdk.core.model.dg dgVarEh;
        com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
        com.bytedance.sdk.openadsdk.component.xq xqVar;
        if (message.what == 100) {
            if (this.ylm && (xqVar = this.cuf) != null && xqVar.uym() != null) {
                db();
                this.cuf.uym().emc(1);
            }
            rie rieVar = this.hxp;
            if (rieVar != null && (dgVarEh = rieVar.eh()) != null && (dgVarEmc = dgVarEh.emc()) != null) {
                dgVarEmc.emc(com.bytedance.sdk.openadsdk.core.sup.emc.emc.GENERAL_LINEAR_AD_ERROR);
            }
            hxp();
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.emc.InterfaceC0162emc
    public void emc(int i10) {
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            db();
        }
    }
}
