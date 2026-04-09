package com.bytedance.sdk.openadsdk.activity;

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
import b9.b;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.mwh;
import com.bytedance.sdk.openadsdk.common.rn;
import com.bytedance.sdk.openadsdk.common.th;
import com.bytedance.sdk.openadsdk.common.vm;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.qbp;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.ko;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.cf;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity implements com.bytedance.sdk.openadsdk.cf.yu {

    /* renamed from: cj, reason: collision with root package name */
    vm f7742cj;
    private LinearLayout coz;
    private com.bytedance.sdk.openadsdk.core.widget.ouw.fkw euf;
    private th fwd;
    private com.bytedance.sdk.openadsdk.common.fkw lvd;
    private TextView mt;

    /* renamed from: ng, reason: collision with root package name */
    private boolean f7743ng;
    TTAdDislikeToast pv;

    /* renamed from: sd, reason: collision with root package name */
    private PAGLogoView f7744sd;
    private mwh ucs;

    /* renamed from: vh, reason: collision with root package name */
    private View f7745vh;
    private TextView xdk;
    private boolean yhj;
    private View yib;
    private long zvq;
    private boolean myk = false;
    final AtomicBoolean wp = new AtomicBoolean(false);
    final AtomicBoolean kn = new AtomicBoolean(false);

    public static /* synthetic */ void ko(TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity) {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(tTVideoLandingPageLink2Activity.rn, "landingpage_split_screen", "click_video", (JSONObject) null);
    }

    public static /* synthetic */ boolean tlj(TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity) {
        tTVideoLandingPageLink2Activity.yhj = true;
        return true;
    }

    public static /* synthetic */ boolean yu(TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity) {
        tTVideoLandingPageLink2Activity.myk = true;
        return true;
    }

    public static /* synthetic */ void zih(TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity) {
        TTAdDislikeToast tTAdDislikeToast;
        if (tTVideoLandingPageLink2Activity.isFinishing() || (tTAdDislikeToast = tTVideoLandingPageLink2Activity.pv) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mwh mwhVar = this.ucs;
        if (mwhVar != null) {
            mwhVar.ouw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        vpp vppVar;
        com.bytedance.sdk.component.bly.le leVar;
        qbp qbpVar;
        qbp qbpVar2;
        super.onCreate(bundle);
        if (!jg.fkw() || (vppVar = this.rn) == null || (leVar = ((TTVideoLandingPageActivity) this).ouw) == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.common.fkw fkwVarOuw = uoy.ouw(vppVar, leVar, this.fkw);
        this.lvd = fkwVarOuw;
        if (fkwVarOuw != null) {
            fkwVarOuw.ouw("landingpage_split_screen");
        }
        this.f7743ng = zih.yu().jg();
        if (((TTVideoLandingPageActivity) this).ouw.getWebView() != null) {
            ((TTVideoLandingPageActivity) this).ouw.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.1
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i4, int i10, int i11, int i12) {
                    com.bytedance.sdk.openadsdk.yu.mwh mwhVar = TTVideoLandingPageLink2Activity.this.rrs;
                    if (mwhVar != null) {
                        mwhVar.ouw(i10);
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.widget.ouw.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.widget.ouw.fkw(this.fkw, this.pno, this.f7735le, this.lvd, this.rrs) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.7
            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTVideoLandingPageLink2Activity.this.f7745vh != null && !TTVideoLandingPageLink2Activity.this.yhj) {
                        TTVideoLandingPageLink2Activity.this.f7745vh.setVisibility(8);
                    }
                    if (TTVideoLandingPageLink2Activity.this.coz != null) {
                        TTVideoLandingPageLink2Activity.this.coz.setVisibility(0);
                    }
                    TTVideoLandingPageLink2Activity.yu(TTVideoLandingPageLink2Activity.this);
                    TTVideoLandingPageLink2Activity.this.mwh();
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(tTVideoLandingPageLink2Activity.rn, tTVideoLandingPageLink2Activity.f7738pd, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.zvq, true);
                } catch (Throwable unused) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                TTVideoLandingPageLink2Activity.this.zvq = System.currentTimeMillis();
            }
        };
        this.euf = fkwVar;
        fkwVar.ko = this.rn;
        ((TTVideoLandingPageActivity) this).ouw.setWebViewClient(fkwVar);
        ((TTVideoLandingPageActivity) this).ouw.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(this.pno, this.rrs, this.lvd) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.8
            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.yu, android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i4) {
                super.onProgressChanged(webView, i4);
                if (TTVideoLandingPageLink2Activity.this.f7743ng && TTVideoLandingPageLink2Activity.this.fwd != null && i4 == 100) {
                    TTVideoLandingPageLink2Activity.this.fwd.ouw(webView, TTVideoLandingPageLink2Activity.this.ux);
                }
                if (TTVideoLandingPageLink2Activity.this.ucs != null) {
                    TTVideoLandingPageLink2Activity.this.ucs.ouw(i4);
                }
            }
        });
        TextView textView = (TextView) findViewById(rn.nit);
        if (textView != null && (qbpVar2 = this.rn.kq) != null) {
            textView.setText(qbpVar2.fkw);
        }
        vpp vppVar2 = this.rn;
        jg.lh().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.9
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    TTVideoLandingPageLink2Activity.tlj(TTVideoLandingPageLink2Activity.this);
                    if (TTVideoLandingPageLink2Activity.this.ucs != null) {
                        TTVideoLandingPageLink2Activity.this.ucs.vt();
                    }
                    TTVideoLandingPageLink2Activity.this.yib.setVisibility(0);
                    if (TTVideoLandingPageLink2Activity.this.f7744sd != null) {
                        TTVideoLandingPageLink2Activity.this.f7744sd.setVisibility(0);
                    }
                    if (TTVideoLandingPageLink2Activity.this.myk) {
                        return;
                    }
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(tTVideoLandingPageLink2Activity.rn, tTVideoLandingPageLink2Activity.f7738pd, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.zvq, false);
                } catch (Exception unused) {
                }
            }
        }, (vppVar2 == null || (qbpVar = vppVar2.kq) == null) ? 10000L : qbpVar.ouw * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        mwh();
        if (!this.yhj && this.rrs != null && ((TTVideoLandingPageActivity) this).ouw != null && this.ucs.getVisibility() == 8) {
            this.rrs.ouw(((TTVideoLandingPageActivity) this).ouw);
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mwh() {
        mwh mwhVar = this.ucs;
        if (mwhVar != null) {
            mwhVar.vt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public final void cf() {
        super.cf();
        vpp vppVar = this.rn;
        if (vppVar != null) {
            vppVar.f8290cd = true;
        }
        TextView textView = this.xdk;
        if (textView != null) {
            textView.setText(yu());
            this.xdk.setClickable(true);
            this.xdk.setOnClickListener(this.f7740ub);
            this.xdk.setOnTouchListener(this.f7740ub);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public final void le() {
        TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity;
        super.le();
        TextView textView = (TextView) findViewById(520093713);
        if (textView != null) {
            textView.setText(com.bytedance.sdk.component.utils.vpp.ouw(zih.ouw(), "tt_reward_feedback"));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.12
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TTVideoLandingPageLink2Activity.this.ryl();
                }
            });
        }
        this.mt = (TextView) findViewById(520093714);
        this.ucs = (mwh) findViewById(rn.f8730ub);
        this.f7745vh = findViewById(rn.lso);
        this.yib = findViewById(rn.fak);
        TextView textView2 = (TextView) findViewById(rn.pv);
        TextView textView3 = (TextView) findViewById(rn.wp);
        com.bytedance.sdk.openadsdk.core.widget.zih zihVar = (com.bytedance.sdk.openadsdk.core.widget.zih) findViewById(rn.f8715cj);
        this.xdk = (TextView) findViewById(rn.kn);
        com.bytedance.sdk.openadsdk.core.model.zih zihVar2 = this.rn.fak;
        if (zihVar2 != null && !TextUtils.isEmpty(zihVar2.ouw)) {
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar = this.rn;
            com.bytedance.sdk.openadsdk.th.vt.ouw(vppVar.fak, zihVar, vppVar);
        }
        textView2.setText(this.rn.f8315vh);
        textView3.setText(this.rn.hun);
        View viewFindViewById = findViewById(rn.ucs);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity2 = TTVideoLandingPageLink2Activity.this;
                TTWebsiteActivity.ouw(tTVideoLandingPageLink2Activity2.fkw, tTVideoLandingPageLink2Activity2.rn, tTVideoLandingPageLink2Activity2.f7738pd);
            }
        });
        if (viewFindViewById instanceof PAGLogoView) {
            ((PAGLogoView) viewFindViewById).initData(this.rn);
        }
        com.bytedance.sdk.component.bly.le leVar = ((TTVideoLandingPageActivity) this).ouw;
        if (leVar != null && leVar.getWebView() != null) {
            uoy.ouw(this.rn, ((TTVideoLandingPageActivity) this).ouw);
        }
        boolean zJg = zih.yu().jg();
        this.f7743ng = zJg;
        if (zJg) {
            ((com.bytedance.sdk.openadsdk.common.rn) findViewById(rn.yib)).setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) findViewById(rn.f8728sd);
            this.coz = linearLayout;
            linearLayout.setVisibility(8);
            tTVideoLandingPageLink2Activity = this;
            tTVideoLandingPageLink2Activity.fwd = new th(tTVideoLandingPageLink2Activity, this.coz, ((TTVideoLandingPageActivity) this).ouw, this.rn, "landingpage_split_screen");
            if (((TTVideoLandingPageActivity) tTVideoLandingPageLink2Activity).ouw.getWebView() != null) {
                ((TTVideoLandingPageActivity) tTVideoLandingPageLink2Activity).ouw.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.14
                    float ouw = 0.0f;

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            this.ouw = motionEvent.getY();
                        }
                        com.bytedance.sdk.openadsdk.yu.mwh mwhVar = TTVideoLandingPageLink2Activity.this.rrs;
                        if (mwhVar != null) {
                            mwhVar.ouw(motionEvent);
                        }
                        if (TTVideoLandingPageLink2Activity.this.lvd != null) {
                            TTVideoLandingPageLink2Activity.this.lvd.ouw(motionEvent);
                        }
                        if (motionEvent.getAction() == 2) {
                            float y10 = motionEvent.getY();
                            float f10 = this.ouw;
                            if (y10 - f10 > 8.0f) {
                                if (TTVideoLandingPageLink2Activity.this.fwd != null) {
                                    TTVideoLandingPageLink2Activity.this.fwd.ouw();
                                }
                                return false;
                            }
                            if (y10 - f10 < -8.0f && TTVideoLandingPageLink2Activity.this.fwd != null) {
                                TTVideoLandingPageLink2Activity.this.fwd.vt();
                            }
                        }
                        return false;
                    }
                });
            }
        } else {
            tTVideoLandingPageLink2Activity = this;
            if (((TTVideoLandingPageActivity) tTVideoLandingPageLink2Activity).ouw.getWebView() != null) {
                ((TTVideoLandingPageActivity) tTVideoLandingPageLink2Activity).ouw.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.2
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        com.bytedance.sdk.openadsdk.yu.mwh mwhVar = TTVideoLandingPageLink2Activity.this.rrs;
                        if (mwhVar != null) {
                            mwhVar.ouw(motionEvent);
                        }
                        if (TTVideoLandingPageLink2Activity.this.lvd == null) {
                            return false;
                        }
                        TTVideoLandingPageLink2Activity.this.lvd.ouw(motionEvent);
                        return false;
                    }
                });
            }
        }
        mwh mwhVar = tTVideoLandingPageLink2Activity.ucs;
        if (mwhVar != null) {
            mwhVar.ouw(tTVideoLandingPageLink2Activity.rn);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public final View lh() {
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(this);
        if (Build.VERSION.SDK_INT >= 35) {
            fkwVar.setFitsSystemWindows(true);
        }
        fkwVar.setOrientation(1);
        fkwVar.setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(this);
        fkwVar.addView(lhVar, new LinearLayout.LayoutParams(-1, osn.ouw(this, 220.0f)));
        View lhVar2 = new com.bytedance.sdk.openadsdk.core.le.lh(this);
        lhVar2.setId(rn.uoy);
        lhVar.addView(lhVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.le.fkw(this);
        fkwVar2.setOrientation(0);
        fkwVar2.setPadding(0, osn.ouw(this, 20.0f), 0, 0);
        lhVar.addView(fkwVar2, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        fkwVar2.addView(view, layoutParams);
        ko koVar = new ko(this);
        koVar.setId(520093713);
        koVar.setGravity(17);
        koVar.setText(com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_reward_feedback"));
        koVar.setTextColor(-1);
        koVar.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, osn.ouw(this, 28.0f));
        int iOuw = osn.ouw(this, 16.0f);
        layoutParams2.rightMargin = iOuw;
        layoutParams2.leftMargin = iOuw;
        fkwVar2.addView(koVar, layoutParams2);
        com.bytedance.sdk.openadsdk.core.widget.jg jgVar = new com.bytedance.sdk.openadsdk.core.widget.jg(this);
        jgVar.setId(rn.osn);
        jgVar.setPadding(osn.ouw(this, 7.0f), osn.ouw(this, 7.0f), osn.ouw(this, 7.0f), osn.ouw(this, 7.0f));
        jgVar.setImageResource(com.bytedance.sdk.component.utils.vpp.yu(this, "tt_video_close_drawable"));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(osn.ouw(this, 28.0f), osn.ouw(this, 28.0f));
        layoutParams3.rightMargin = osn.ouw(this, 12.0f);
        fkwVar2.addView(jgVar, layoutParams3);
        com.bytedance.sdk.openadsdk.core.le.ra raVar = new com.bytedance.sdk.openadsdk.core.le.ra(this);
        raVar.setVisibility(8);
        raVar.setId(rn.ey);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = osn.ouw(this, 10.0f);
        fkwVar.addView(raVar, layoutParams4);
        com.bytedance.sdk.openadsdk.core.widget.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.widget.ouw(this);
        ouwVar.setId(rn.rrs);
        ouwVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ouwVar.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(osn.ouw(this, 44.0f), osn.ouw(this, 44.0f));
        layoutParams5.addRule(9);
        layoutParams5.leftMargin = osn.ouw(this, 5.0f);
        raVar.addView(ouwVar, layoutParams5);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(this);
        int i4 = rn.jvy;
        pnoVar.setId(i4);
        pnoVar.setBackground(cf.ouw(this, "tt_circle_solid_mian"));
        pnoVar.setGravity(17);
        pnoVar.setTextColor(-1);
        pnoVar.setTextSize(2, 19.0f);
        pnoVar.setTypeface(Typeface.DEFAULT_BOLD);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(osn.ouw(this, 44.0f), osn.ouw(this, 44.0f));
        layoutParams6.addRule(9);
        layoutParams6.leftMargin = osn.ouw(this, 5.0f);
        raVar.addView(pnoVar, layoutParams6);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar2 = new com.bytedance.sdk.openadsdk.core.le.pno(this);
        pnoVar2.setId(rn.fqk);
        pnoVar2.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        pnoVar2.setEllipsize(truncateAt);
        pnoVar2.setTextColor(Color.parseColor("#e5000000"));
        pnoVar2.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15);
        layoutParams7.leftMargin = osn.ouw(this, 5.0f);
        layoutParams7.rightMargin = osn.ouw(this, 80.0f);
        layoutParams7.addRule(1, i4);
        raVar.addView(pnoVar2, layoutParams7);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar3 = new com.bytedance.sdk.openadsdk.core.le.pno(this);
        pnoVar3.setId(rn.hun);
        pnoVar3.setClickable(true);
        pnoVar3.setMaxLines(1);
        pnoVar3.setEllipsize(truncateAt);
        pnoVar3.setFocusable(true);
        pnoVar3.setGravity(17);
        pnoVar3.setText(com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_video_mobile_go_detail"));
        pnoVar3.setTextColor(-1);
        pnoVar3.setTextSize(2, 14.0f);
        pnoVar3.setPadding(osn.ouw(this, 2.0f), osn.ouw(this, 2.0f), osn.ouw(this, 2.0f), osn.ouw(this, 2.0f));
        pnoVar3.setBackground(cf.ouw(this, "tt_ad_cover_btn_begin_bg"));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(osn.ouw(this, 90.0f), osn.ouw(this, 36.0f));
        layoutParams8.addRule(11);
        layoutParams8.addRule(15);
        layoutParams8.rightMargin = osn.ouw(this, 5.0f);
        raVar.addView(pnoVar3, layoutParams8);
        com.bytedance.sdk.openadsdk.core.le.lh lhVar3 = new com.bytedance.sdk.openadsdk.core.le.lh(this);
        fkwVar.addView(lhVar3, new LinearLayout.LayoutParams(-1, -1));
        View leVar = new com.bytedance.sdk.component.bly.le(this, le.lh.LANDING_PAGE);
        leVar.setId(rn.ux);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams9.topMargin = osn.ouw(this, 2.0f);
        lhVar3.addView(leVar, layoutParams9);
        com.bytedance.sdk.openadsdk.core.le.ra raVar2 = new com.bytedance.sdk.openadsdk.core.le.ra(this);
        raVar2.setId(rn.lso);
        raVar2.setBackgroundColor(Color.parseColor("#F8F8F8"));
        lhVar3.addView(raVar2, new FrameLayout.LayoutParams(-1, -1));
        View mwhVar = new mwh(this);
        mwhVar.setId(rn.f8730ub);
        raVar2.addView(mwhVar, new RelativeLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar3 = new com.bytedance.sdk.openadsdk.core.le.fkw(this);
        fkwVar3.setId(rn.fak);
        fkwVar3.setOrientation(1);
        fkwVar3.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams10.addRule(13);
        raVar2.addView(fkwVar3, layoutParams10);
        com.bytedance.sdk.openadsdk.core.widget.zih zihVar = new com.bytedance.sdk.openadsdk.core.widget.zih(this);
        zihVar.setId(rn.f8715cj);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(osn.ouw(this, 80.0f), osn.ouw(this, 80.0f));
        layoutParams11.gravity = 17;
        fkwVar3.addView(zihVar, layoutParams11);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar4 = new com.bytedance.sdk.openadsdk.core.le.pno(this);
        pnoVar4.setId(rn.pv);
        pnoVar4.setTextColor(Color.parseColor("#161823"));
        pnoVar4.setTextSize(0, osn.ouw(this, 24.0f));
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams12.gravity = 17;
        layoutParams12.topMargin = osn.ouw(this, 12.0f);
        fkwVar3.addView(pnoVar4, layoutParams12);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar5 = new com.bytedance.sdk.openadsdk.core.le.pno(this);
        pnoVar5.setId(rn.wp);
        pnoVar5.setTextColor(Color.parseColor("#80161823"));
        pnoVar5.setTextSize(0, osn.ouw(this, 16.0f));
        pnoVar5.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams13.gravity = 17;
        int iOuw2 = osn.ouw(this, 60.0f);
        layoutParams13.rightMargin = iOuw2;
        layoutParams13.leftMargin = iOuw2;
        layoutParams13.topMargin = osn.ouw(this, 8.0f);
        fkwVar3.addView(pnoVar5, layoutParams13);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar6 = new com.bytedance.sdk.openadsdk.core.le.pno(this);
        pnoVar6.setId(rn.kn);
        pnoVar6.setGravity(17);
        pnoVar6.setTextColor(-1);
        pnoVar6.setText(com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_video_mobile_go_detail"));
        pnoVar6.setBackground(cf.ouw(this, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(osn.ouw(this, 255.0f), osn.ouw(this, 44.0f));
        layoutParams14.gravity = 17;
        layoutParams14.topMargin = osn.ouw(this, 32.0f);
        fkwVar3.addView(pnoVar6, layoutParams14);
        PAGLogoView pAGLogoView = new PAGLogoView(this);
        this.f7744sd = pAGLogoView;
        pAGLogoView.setId(rn.ucs);
        this.f7744sd.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, osn.ouw(this, 14.0f));
        layoutParams15.addRule(12);
        layoutParams15.leftMargin = osn.ouw(this, 18.0f);
        layoutParams15.bottomMargin = osn.ouw(this, 61.0f);
        raVar2.addView(this.f7744sd, layoutParams15);
        View rnVar = new com.bytedance.sdk.openadsdk.common.rn(this, new rn.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.10
            @Override // com.bytedance.sdk.openadsdk.common.rn.ouw
            public final View ouw(Context context) {
                return new com.bytedance.sdk.openadsdk.common.pno(context);
            }
        });
        rnVar.setId(com.bytedance.sdk.openadsdk.utils.rn.f8733vh);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, osn.ouw(this, 48.0f));
        layoutParams16.gravity = 81;
        lhVar3.addView(rnVar, layoutParams16);
        View rnVar2 = new com.bytedance.sdk.openadsdk.common.rn(this, new rn.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.11
            @Override // com.bytedance.sdk.openadsdk.common.rn.ouw
            public final View ouw(Context context) {
                return new com.bytedance.sdk.openadsdk.common.bly(context);
            }
        });
        rnVar2.setId(com.bytedance.sdk.openadsdk.utils.rn.yib);
        FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-1, osn.ouw(this, 44.0f));
        layoutParams17.gravity = 80;
        lhVar3.addView(rnVar2, layoutParams17);
        return fkwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public final boolean pno() {
        int i4 = this.f7733cf;
        return i4 == 5 || i4 == 15 || i4 == 50;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public final void ra() {
        if (!pno()) {
            try {
                ImageView imageView = new ImageView(this);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                com.bytedance.sdk.openadsdk.th.vt.ouw();
                com.bytedance.sdk.openadsdk.th.vt.ouw(this.rn.tc.get(0), imageView, this.rn);
                this.tlj.setVisibility(0);
                this.tlj.removeAllViews();
                this.tlj.addView(imageView);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.bytedance.sdk.openadsdk.yu.lh.vt(TTVideoLandingPageLink2Activity.this.rn, "landingpage_split_screen");
                    }
                });
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.ra();
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = this.ryl;
        if (leVar != null) {
            if (leVar.getNativeVideoController() != null) {
                this.ryl.getNativeVideoController().vt(false);
                this.ryl.getNativeVideoController().rrs = false;
                this.tlj.setClickable(true);
                this.tlj.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.3
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() != 0) {
                            return false;
                        }
                        TTVideoLandingPageLink2Activity.ko(TTVideoLandingPageLink2Activity.this);
                        return false;
                    }
                });
            }
            this.ryl.getNativeVideoController().f8338od = new b() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.4
                @Override // b9.b
                public final void ouw() {
                }

                @Override // b9.b
                public final void ouw(long j, int i4) {
                }

                @Override // b9.b
                public final void ouw(long j, long j8) {
                    if (TTVideoLandingPageLink2Activity.this.mt != null) {
                        int iMax = (int) Math.max(0L, (j8 - j) / 1000);
                        TTVideoLandingPageLink2Activity.this.mt.setText(String.valueOf(iMax));
                        if (iMax <= 0) {
                            TTVideoLandingPageLink2Activity.this.mt.setVisibility(8);
                        }
                    }
                }

                @Override // b9.b
                public final void vt(long j, int i4) {
                }
            };
        }
    }

    public final void ryl() {
        if (isFinishing()) {
            return;
        }
        if (this.kn.get()) {
            TTAdDislikeToast tTAdDislikeToast = this.pv;
            if (tTAdDislikeToast != null) {
                tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
                return;
            }
            return;
        }
        vm vmVar = this.f7742cj;
        if (vmVar == null) {
            if (vmVar == null) {
                try {
                    vm vmVar2 = new vm(this.fkw, this.rn);
                    this.f7742cj = vmVar2;
                    vmVar2.setDislikeSource("landing_page");
                    this.f7742cj.setCallback(new vm.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.6
                        @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                        public final void ouw() {
                            TTVideoLandingPageLink2Activity.this.wp.set(true);
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                        public final void vt() {
                            TTVideoLandingPageLink2Activity.this.wp.set(false);
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                        public final void ouw(FilterWord filterWord) {
                            if (TTVideoLandingPageLink2Activity.this.kn.get() || filterWord == null || filterWord.hasSecondOptions()) {
                                return;
                            }
                            TTVideoLandingPageLink2Activity.this.kn.set(true);
                            TTVideoLandingPageLink2Activity.zih(TTVideoLandingPageLink2Activity.this);
                        }
                    });
                } catch (Throwable th2) {
                    ApmHelper.reportCustomError("initDislike error", "TTVideoLandingPageLink2Activity", th2);
                }
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.f7742cj);
            if (this.pv == null) {
                TTAdDislikeToast tTAdDislikeToast2 = new TTAdDislikeToast(this.fkw);
                this.pv = tTAdDislikeToast2;
                frameLayout.addView(tTAdDislikeToast2);
            }
        }
        vm vmVar3 = this.f7742cj;
        if (vmVar3 != null) {
            vmVar3.ouw();
        }
    }
}
