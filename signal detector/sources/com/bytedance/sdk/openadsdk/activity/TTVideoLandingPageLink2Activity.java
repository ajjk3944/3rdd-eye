package com.bytedance.sdk.openadsdk.activity;

import L1.c;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.zz.ycc;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.aa;
import com.bytedance.sdk.openadsdk.common.cf;
import com.bytedance.sdk.openadsdk.common.sup;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.cf;
import com.bytedance.sdk.openadsdk.dg.sz;
import com.bytedance.sdk.openadsdk.utils.gbl;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.vk;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity implements com.bytedance.sdk.openadsdk.gbl.dg {
    private TextView cn;
    private View ffd;
    private long fu;
    private boolean hj;
    private PAGLogoView jp;
    private com.bytedance.sdk.openadsdk.core.widget.emc.bw ltx;
    private View ndl;
    TTAdDislikeToast rqm;
    aa wa;
    private com.bytedance.sdk.openadsdk.common.bw wbn;
    private sup wd;
    private TextView xhi;
    private boolean nw = false;
    final AtomicBoolean wad = new AtomicBoolean(false);
    final AtomicBoolean but = new AtomicBoolean(false);

    private void aa() {
        TTAdDislikeToast tTAdDislikeToast = this.rqm;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cf() {
        com.bytedance.sdk.openadsdk.dg.xq.emc(this.vk, "landingpage_split_screen", "click_video", (JSONObject) null);
    }

    private void sba() {
        try {
            if (this.wa == null) {
                aa aaVar = new aa(this.bw, this.vk);
                this.wa = aaVar;
                aaVar.setDislikeSource("landing_page");
                this.wa.setCallback(new aa.emc() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.4
                    @Override // com.bytedance.sdk.openadsdk.common.aa.emc
                    public void emc(View view) {
                        TTVideoLandingPageLink2Activity.this.wad.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.aa.emc
                    public void ypw(View view) {
                        TTVideoLandingPageLink2Activity.this.wad.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.aa.emc
                    public void emc(FilterWord filterWord) {
                        if (TTVideoLandingPageLink2Activity.this.but.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTVideoLandingPageLink2Activity.this.but.set(true);
                        TTVideoLandingPageLink2Activity.this.yzg();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.wa);
            if (this.rqm == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.bw);
                this.rqm = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTVideoLandingPageLink2Activity", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vk() {
        sup supVar = this.wd;
        if (supVar != null) {
            supVar.ypw();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yzg() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.rqm) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sup supVar = this.wd;
        if (supVar != null) {
            supVar.emc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        rie rieVar;
        com.bytedance.sdk.component.zz.ycc yccVar;
        super.onCreate(bundle);
        if (!qh.bw() || (rieVar = this.vk) == null || (yccVar = ((TTVideoLandingPageActivity) this).emc) == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.common.bw bwVarEmc = tp.emc(rieVar, yccVar, this.bw, this.lt);
        this.wbn = bwVarEmc;
        if (bwVarEmc != null) {
            bwVarEmc.emc("landingpage_split_screen");
        }
        if (((TTVideoLandingPageActivity) this).emc.getWebView() != null) {
            ((TTVideoLandingPageActivity) this).emc.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.1
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i3, int i6, int i7) {
                    sz szVar = TTVideoLandingPageLink2Activity.this.vw;
                    if (szVar != null) {
                        szVar.ypw(i3);
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.widget.emc.bw bwVar = new com.bytedance.sdk.openadsdk.core.widget.emc.bw(this.bw, this.msw, this.ycc, this.wbn, this.vw, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTVideoLandingPageLink2Activity.this.ffd != null && !TTVideoLandingPageLink2Activity.this.hj) {
                        TTVideoLandingPageLink2Activity.this.ffd.setVisibility(8);
                    }
                    TTVideoLandingPageLink2Activity.this.nw = true;
                    TTVideoLandingPageLink2Activity.this.vk();
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.dg.xq.emc(tTVideoLandingPageLink2Activity.vk, tTVideoLandingPageLink2Activity.lt, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.fu, true);
                } catch (Throwable unused) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                TTVideoLandingPageLink2Activity.this.fu = System.currentTimeMillis();
            }
        };
        this.ltx = bwVar;
        bwVar.emc(this.vk);
        ((TTVideoLandingPageActivity) this).emc.setWebViewClient(this.ltx);
        ((TTVideoLandingPageActivity) this).emc.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.emc.dg(this.msw, this.vw, this.wbn) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.emc.dg, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTVideoLandingPageLink2Activity.this.wd != null) {
                    TTVideoLandingPageLink2Activity.this.wd.emc(i);
                }
            }
        });
        TextView textView = (TextView) findViewById(vk.ono);
        if (textView != null && this.vk.hxp() != null) {
            textView.setText(this.vk.hxp().bw());
        }
        rie rieVar2 = this.vk;
        qh.xq().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTVideoLandingPageLink2Activity.this.hj = true;
                    if (TTVideoLandingPageLink2Activity.this.wd != null) {
                        TTVideoLandingPageLink2Activity.this.wd.ypw();
                    }
                    TTVideoLandingPageLink2Activity.this.ndl.setVisibility(0);
                    if (TTVideoLandingPageLink2Activity.this.jp != null) {
                        TTVideoLandingPageLink2Activity.this.jp.setVisibility(0);
                    }
                    if (TTVideoLandingPageLink2Activity.this.nw) {
                        return;
                    }
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.dg.xq.emc(tTVideoLandingPageLink2Activity.vk, tTVideoLandingPageLink2Activity.lt, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.fu, false);
                } catch (Exception unused) {
                }
            }
        }, (rieVar2 == null || rieVar2.hxp() == null) ? 10000L : this.vk.hxp().emc() * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        vk();
        if (!this.hj && this.vw != null && ((TTVideoLandingPageActivity) this).emc != null && this.wd.getVisibility() == 8) {
            this.vw.emc(((TTVideoLandingPageActivity) this).emc);
        }
        super.onDestroy();
    }

    public void qh() {
        if (isFinishing()) {
            return;
        }
        if (this.but.get()) {
            aa();
            return;
        }
        if (this.wa == null) {
            sba();
        }
        aa aaVar = this.wa;
        if (aaVar != null) {
            aaVar.emc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void bw() {
        super.bw();
        TextView textView = (TextView) findViewById(520093713);
        if (textView != null) {
            textView.setText(com.bytedance.sdk.component.utils.rie.emc(com.bytedance.sdk.openadsdk.core.aa.emc(), "tt_reward_feedback"));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTVideoLandingPageLink2Activity.this.qh();
                }
            });
        }
        this.xhi = (TextView) findViewById(520093714);
        this.wd = (sup) findViewById(vk.rqm);
        this.ffd = findViewById(vk.wa);
        this.ndl = findViewById(vk.mxo);
        TextView textView2 = (TextView) findViewById(vk.but);
        TextView textView3 = (TextView) findViewById(vk.wd);
        com.bytedance.sdk.openadsdk.core.widget.aa aaVar = (com.bytedance.sdk.openadsdk.core.widget.aa) findViewById(vk.wad);
        this.cn = (TextView) findViewById(vk.ffd);
        if (this.vk.ya() != null && !TextUtils.isEmpty(this.vk.ya().emc())) {
            com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.vk.ya(), aaVar, this.vk);
        }
        textView2.setText(this.vk.hs());
        textView3.setText(this.vk.vyk());
        View viewFindViewById = findViewById(vk.ndl);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                TTWebsiteActivity.emc(tTVideoLandingPageLink2Activity.bw, tTVideoLandingPageLink2Activity.vk, tTVideoLandingPageLink2Activity.lt);
            }
        });
        if (viewFindViewById instanceof PAGLogoView) {
            ((PAGLogoView) viewFindViewById).initData(this.vk);
        }
        com.bytedance.sdk.component.zz.ycc yccVar = ((TTVideoLandingPageActivity) this).emc;
        if (yccVar != null && yccVar.getWebView() != null) {
            tp.emc(this.vk, ((TTVideoLandingPageActivity) this).emc);
        }
        if (((TTVideoLandingPageActivity) this).emc.getWebView() != null) {
            ((TTVideoLandingPageActivity) this).emc.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.11
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    sz szVar = TTVideoLandingPageLink2Activity.this.vw;
                    if (szVar != null) {
                        szVar.emc(motionEvent);
                    }
                    if (TTVideoLandingPageLink2Activity.this.wbn == null) {
                        return false;
                    }
                    TTVideoLandingPageLink2Activity.this.wbn.emc(motionEvent);
                    return false;
                }
            });
        }
        sup supVar = this.wd;
        if (supVar != null) {
            supVar.emc(this.vk);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void gbl() {
        super.gbl();
        rie rieVar = this.vk;
        if (rieVar != null) {
            rieVar.sup(true);
        }
        TextView textView = this.cn;
        if (textView != null) {
            textView.setText(dg());
            this.cn.setClickable(true);
            this.cn.setOnClickListener(this.pxa);
            this.cn.setOnTouchListener(this.pxa);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public boolean uym() {
        int i = this.sz;
        return i == 5 || i == 15 || i == 50;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public View xq() {
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(this);
        if (Build.VERSION.SDK_INT >= 35) {
            bwVar.setFitsSystemWindows(true);
        }
        bwVar.setOrientation(1);
        bwVar.setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar = new com.bytedance.sdk.openadsdk.core.ycc.xq(this);
        bwVar.addView(xqVar, new LinearLayout.LayoutParams(-1, vw.ypw(this, 220.0f)));
        View xqVar2 = new com.bytedance.sdk.openadsdk.core.ycc.xq(this);
        xqVar2.setId(vk.tp);
        xqVar.addView(xqVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar2 = new com.bytedance.sdk.openadsdk.core.ycc.bw(this);
        bwVar2.setOrientation(0);
        bwVar2.setPadding(0, vw.ypw(this, 20.0f), 0, 0);
        xqVar.addView(bwVar2, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        bwVar2.addView(view, layoutParams);
        cf cfVar = new cf(this);
        cfVar.setId(520093713);
        cfVar.setGravity(17);
        cfVar.setText(com.bytedance.sdk.component.utils.rie.emc(this, "tt_reward_feedback"));
        cfVar.setTextColor(-1);
        cfVar.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, vw.ypw(this, 28.0f));
        int iYpw = vw.ypw(this, 16.0f);
        layoutParams2.rightMargin = iYpw;
        layoutParams2.leftMargin = iYpw;
        bwVar2.addView(cfVar, layoutParams2);
        com.bytedance.sdk.openadsdk.core.widget.qh qhVar = new com.bytedance.sdk.openadsdk.core.widget.qh(this);
        qhVar.setId(vk.vw);
        qhVar.setPadding(vw.ypw(this, 7.0f), vw.ypw(this, 7.0f), vw.ypw(this, 7.0f), vw.ypw(this, 7.0f));
        qhVar.setImageResource(com.bytedance.sdk.component.utils.rie.dg(this, "tt_video_close_drawable"));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(vw.ypw(this, 28.0f), vw.ypw(this, 28.0f));
        layoutParams3.rightMargin = vw.ypw(this, 12.0f);
        bwVar2.addView(qhVar, layoutParams3);
        com.bytedance.sdk.openadsdk.core.ycc.uym uymVar = new com.bytedance.sdk.openadsdk.core.ycc.uym(this);
        uymVar.setVisibility(8);
        uymVar.setId(vk.ra);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = vw.ypw(this, 10.0f);
        bwVar.addView(uymVar, layoutParams4);
        com.bytedance.sdk.openadsdk.core.widget.emc emcVar = new com.bytedance.sdk.openadsdk.core.widget.emc(this);
        emcVar.setId(vk.wo);
        emcVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        emcVar.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(vw.ypw(this, 44.0f), vw.ypw(this, 44.0f));
        layoutParams5.addRule(9);
        layoutParams5.leftMargin = vw.ypw(this, 5.0f);
        uymVar.addView(emcVar, layoutParams5);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(this);
        int i = vk.xxg;
        mswVar.setId(i);
        mswVar.setBackground(gbl.emc(this, "tt_circle_solid_mian"));
        mswVar.setGravity(17);
        mswVar.setTextColor(-1);
        mswVar.setTextSize(2, 19.0f);
        mswVar.setTypeface(Typeface.DEFAULT_BOLD);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(vw.ypw(this, 44.0f), vw.ypw(this, 44.0f));
        layoutParams6.addRule(9);
        layoutParams6.leftMargin = vw.ypw(this, 5.0f);
        uymVar.addView(mswVar, layoutParams6);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar2 = new com.bytedance.sdk.openadsdk.core.ycc.msw(this);
        mswVar2.setId(vk.yz);
        mswVar2.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mswVar2.setEllipsize(truncateAt);
        mswVar2.setTextColor(Color.parseColor("#e5000000"));
        mswVar2.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15);
        layoutParams7.leftMargin = vw.ypw(this, 5.0f);
        layoutParams7.rightMargin = vw.ypw(this, 80.0f);
        layoutParams7.addRule(1, i);
        uymVar.addView(mswVar2, layoutParams7);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar3 = new com.bytedance.sdk.openadsdk.core.ycc.msw(this);
        mswVar3.setId(vk.wpn);
        mswVar3.setClickable(true);
        mswVar3.setMaxLines(1);
        mswVar3.setEllipsize(truncateAt);
        mswVar3.setFocusable(true);
        mswVar3.setGravity(17);
        mswVar3.setText(com.bytedance.sdk.component.utils.rie.emc(this, "tt_video_mobile_go_detail"));
        mswVar3.setTextColor(-1);
        mswVar3.setTextSize(2, 14.0f);
        mswVar3.setPadding(vw.ypw(this, 2.0f), vw.ypw(this, 2.0f), vw.ypw(this, 2.0f), vw.ypw(this, 2.0f));
        mswVar3.setBackground(gbl.emc(this, "tt_ad_cover_btn_begin_bg"));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(vw.ypw(this, 90.0f), vw.ypw(this, 36.0f));
        layoutParams8.addRule(11);
        layoutParams8.addRule(15);
        layoutParams8.rightMargin = vw.ypw(this, 5.0f);
        uymVar.addView(mswVar3, layoutParams8);
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar3 = new com.bytedance.sdk.openadsdk.core.ycc.xq(this);
        bwVar.addView(xqVar3, new LinearLayout.LayoutParams(-1, -1));
        View yccVar = new com.bytedance.sdk.component.zz.ycc(this, ycc.xq.LANDING_PAGE);
        yccVar.setId(vk.pxa);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams9.topMargin = vw.ypw(this, 2.0f);
        xqVar3.addView(yccVar, layoutParams9);
        com.bytedance.sdk.openadsdk.core.ycc.uym uymVar2 = new com.bytedance.sdk.openadsdk.core.ycc.uym(this);
        uymVar2.setId(vk.wa);
        uymVar2.setBackgroundColor(Color.parseColor("#F8F8F8"));
        xqVar3.addView(uymVar2, new FrameLayout.LayoutParams(-1, -1));
        View supVar = new sup(this);
        supVar.setId(vk.rqm);
        uymVar2.addView(supVar, new RelativeLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar3 = new com.bytedance.sdk.openadsdk.core.ycc.bw(this);
        bwVar3.setId(vk.mxo);
        bwVar3.setOrientation(1);
        bwVar3.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams10.addRule(13);
        uymVar2.addView(bwVar3, layoutParams10);
        com.bytedance.sdk.openadsdk.core.widget.aa aaVar = new com.bytedance.sdk.openadsdk.core.widget.aa(this);
        aaVar.setId(vk.wad);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(vw.ypw(this, 80.0f), vw.ypw(this, 80.0f));
        layoutParams11.gravity = 17;
        bwVar3.addView(aaVar, layoutParams11);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar4 = new com.bytedance.sdk.openadsdk.core.ycc.msw(this);
        mswVar4.setId(vk.but);
        mswVar4.setTextColor(Color.parseColor("#161823"));
        mswVar4.setTextSize(0, vw.ypw(this, 24.0f));
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams12.gravity = 17;
        layoutParams12.topMargin = vw.ypw(this, 12.0f);
        bwVar3.addView(mswVar4, layoutParams12);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar5 = new com.bytedance.sdk.openadsdk.core.ycc.msw(this);
        mswVar5.setId(vk.wd);
        mswVar5.setTextColor(Color.parseColor("#80161823"));
        mswVar5.setTextSize(0, vw.ypw(this, 16.0f));
        mswVar5.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams13.gravity = 17;
        int iYpw2 = vw.ypw(this, 60.0f);
        layoutParams13.rightMargin = iYpw2;
        layoutParams13.leftMargin = iYpw2;
        layoutParams13.topMargin = vw.ypw(this, 8.0f);
        bwVar3.addView(mswVar5, layoutParams13);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar6 = new com.bytedance.sdk.openadsdk.core.ycc.msw(this);
        mswVar6.setId(vk.ffd);
        mswVar6.setGravity(17);
        mswVar6.setTextColor(-1);
        mswVar6.setText(com.bytedance.sdk.component.utils.rie.emc(this, "tt_video_mobile_go_detail"));
        mswVar6.setBackground(gbl.emc(this, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(vw.ypw(this, 255.0f), vw.ypw(this, 44.0f));
        layoutParams14.gravity = 17;
        layoutParams14.topMargin = vw.ypw(this, 32.0f);
        bwVar3.addView(mswVar6, layoutParams14);
        PAGLogoView pAGLogoView = new PAGLogoView(this);
        this.jp = pAGLogoView;
        pAGLogoView.setId(vk.ndl);
        this.jp.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, vw.ypw(this, 14.0f));
        layoutParams15.addRule(12);
        layoutParams15.leftMargin = vw.ypw(this, 18.0f);
        layoutParams15.bottomMargin = vw.ypw(this, 61.0f);
        uymVar2.addView(this.jp, layoutParams15);
        View cfVar2 = new com.bytedance.sdk.openadsdk.common.cf(this, new cf.emc() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.8
            @Override // com.bytedance.sdk.openadsdk.common.cf.emc
            public View emc(Context context) {
                return new com.bytedance.sdk.openadsdk.common.msw(context);
            }
        });
        cfVar2.setId(vk.hj);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, vw.ypw(this, 48.0f));
        layoutParams16.gravity = 81;
        xqVar3.addView(cfVar2, layoutParams16);
        return bwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void ycc() {
        if (!uym()) {
            try {
                ImageView imageView = new ImageView(this);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.vk.rr().get(0), imageView, this.vk);
                this.sup.setVisibility(0);
                this.sup.removeAllViews();
                this.sup.addView(imageView);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        com.bytedance.sdk.openadsdk.dg.xq.ypw(TTVideoLandingPageLink2Activity.this.vk, "landingpage_split_screen");
                    }
                });
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.ycc();
        com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar = this.qh;
        if (yccVar != null) {
            if (yccVar.getNativeVideoController() != null) {
                this.qh.getNativeVideoController().emc(false);
                this.qh.getNativeVideoController().ycc(false);
                this.sup.setClickable(true);
                this.sup.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.12
                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() != 0) {
                            return false;
                        }
                        TTVideoLandingPageLink2Activity.this.cf();
                        return false;
                    }
                });
            }
            this.qh.getNativeVideoController().emc(new c() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.2
                @Override // L1.c
                public void emc() {
                }

                @Override // L1.c
                public void ypw(long j6, int i) {
                }

                @Override // L1.c
                public void emc(long j6, int i) {
                }

                @Override // L1.c
                public void emc(long j6, long j7) {
                    if (TTVideoLandingPageLink2Activity.this.xhi != null) {
                        int iMax = (int) Math.max(0L, (j7 - j6) / 1000);
                        TTVideoLandingPageLink2Activity.this.xhi.setText(String.valueOf(iMax));
                        if (iMax <= 0) {
                            TTVideoLandingPageLink2Activity.this.xhi.setVisibility(8);
                        }
                    }
                }
            });
        }
    }
}
