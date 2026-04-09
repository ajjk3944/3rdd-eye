package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.vm;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.od;
import com.bytedance.sdk.openadsdk.core.widget.ouw.le;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.utils.zin;
import com.bytedance.sdk.openadsdk.yu.mwh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class TTCeilingLandingPageActivity extends TTBaseLandingPageActivity {
    private com.bytedance.sdk.openadsdk.common.fkw bly;
    private String fkw;

    /* renamed from: le, reason: collision with root package name */
    private int f7704le;

    /* renamed from: lh, reason: collision with root package name */
    private bs f7705lh;
    ouw ouw;
    private mwh pno;
    private String ra;
    private com.bytedance.sdk.component.bly.le tlj;
    private vpp vt;
    private String yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        com.bytedance.sdk.openadsdk.core.le.yu yuVar;
        super.onCreate(bundle);
        if (!jg.fkw()) {
            finish();
            return;
        }
        Intent intent = getIntent();
        this.f7704le = intent.getIntExtra("source", -1);
        vpp vppVarOuw = od.ouw().ouw(od.ouw(intent));
        this.vt = vppVarOuw;
        if (vppVarOuw == null) {
            finish();
            return;
        }
        this.ra = vppVarOuw.f8310th;
        this.yu = vppVarOuw.pv;
        this.fkw = vppVarOuw.yhj;
        this.f7704le = vppVarOuw.yiz.getDurationSlotType() != 7 ? 5 : 7;
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(this);
        this.tlj = new com.bytedance.sdk.component.bly.le(this, le.lh.LANDING_PAGE);
        lhVar.addView(this.tlj, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.le.yu yuVarVt = com.bytedance.sdk.openadsdk.core.widget.le.vt(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = osn.ouw(this, 18.0f);
        layoutParams.rightMargin = osn.ouw(this, 18.0f);
        lhVar.addView(yuVarVt, layoutParams);
        final int i4 = this.vt.f8301mb.f8286le;
        if (i4 != 3) {
            yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(this);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(osn.ouw(this, 28.0f), osn.ouw(this, 28.0f));
            layoutParams2.gravity = 8388659;
            layoutParams2.topMargin = osn.ouw(this, 18.0f);
            layoutParams2.leftMargin = osn.ouw(this, 18.0f);
            int iOuw = osn.ouw(this, 5.0f);
            yuVar.setPadding(iOuw, iOuw, iOuw, iOuw);
            yuVar.setScaleType(ImageView.ScaleType.FIT_XY);
            yuVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.yu.ouw());
            yuVar.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(this, "tt_white_lefterbackicon_titlebar"));
            lhVar.addView(yuVar, layoutParams2);
        } else {
            yuVar = null;
        }
        zin.ouw(this.tlj, this.ra);
        final WebView webView = this.tlj.getWebView();
        yuVarVt.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TTCeilingLandingPageActivity.this.finish();
            }
        });
        mwh mwhVar = new mwh(this.vt, webView, true);
        this.pno = mwhVar;
        mwhVar.ouw("landingpage_split_ceiling");
        final le.ouw ouwVar = this.pno.ryl;
        if (yuVar != null) {
            yuVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = i4;
                    if (i10 == 1) {
                        TTCeilingLandingPageActivity.this.finish();
                    } else if (i10 != 2) {
                        return;
                    }
                    WebView webView2 = webView;
                    if (webView2 == null || !webView2.canGoBack()) {
                        TTCeilingLandingPageActivity.this.finish();
                        return;
                    }
                    webView.goBack();
                    le.ouw ouwVar2 = ouwVar;
                    if (ouwVar2 != null) {
                        ouwVar2.ouw();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.common.fkw fkwVarOuw = uoy.ouw(this.vt, this.tlj, this);
        this.bly = fkwVarOuw;
        if (fkwVarOuw != null) {
            fkwVarOuw.ouw("landingpage_split_ceiling");
            this.bly.ouw();
        }
        uoy.ouw(this.vt, this.tlj, true);
        this.ouw = new ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.ouw
            public final void ouw() {
                if (TTCeilingLandingPageActivity.this.vt.f8301mb.ra == vm.vt) {
                    TTCeilingLandingPageActivity.this.finish();
                }
            }
        };
        com.bytedance.sdk.openadsdk.core.widget.ouw.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.widget.ouw.fkw(this, this.f7705lh, this.yu, this.bly, this.pno, this.ouw) { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.4
            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
            }
        };
        fkwVar.ko = this.vt;
        com.bytedance.sdk.openadsdk.core.widget.ouw.yu yuVar2 = new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(this.f7705lh, this.pno, this.bly) { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.yu, android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView2, int i10) {
                super.onProgressChanged(webView2, i10);
            }
        };
        com.bytedance.sdk.component.bly.le leVar = this.tlj;
        if (leVar != null) {
            leVar.setWebViewClient(fkwVar);
            this.tlj.setWebChromeClient(yuVar2);
        }
        if (webView != null) {
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.6
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (TTCeilingLandingPageActivity.this.pno == null) {
                        return false;
                    }
                    TTCeilingLandingPageActivity.this.pno.ouw(motionEvent);
                    return false;
                }
            });
            webView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.7
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    if (TTCeilingLandingPageActivity.this.pno != null) {
                        TTCeilingLandingPageActivity.this.pno.ouw(i11);
                    }
                }
            });
        }
        setContentView(lhVar);
        bs bsVar = new bs(this);
        this.f7705lh = bsVar;
        bs bsVarVt = bsVar.vt(this.tlj);
        bsVarVt.f8108lh = this.yu;
        bsVarVt.fkw = this.fkw;
        bs bsVarOuw = bsVarVt.ouw(this.vt);
        bsVarOuw.f8107le = this.f7704le;
        vpp vppVar = this.vt;
        bsVarOuw.pno = vppVar.f8316vi;
        bsVarOuw.ra = vppVar.hun();
        bsVarOuw.ouw(this.tlj).ouw = "landingpage_split_ceiling";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.component.bly.le leVar = this.tlj;
        if (leVar != null) {
            com.bytedance.sdk.component.utils.od.ouw(leVar);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        mwh mwhVar = this.pno;
        if (mwhVar != null) {
            mwhVar.le();
        }
    }
}
