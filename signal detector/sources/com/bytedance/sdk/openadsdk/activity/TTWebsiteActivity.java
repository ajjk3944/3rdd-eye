package com.bytedance.sdk.openadsdk.activity;

import B4.g;
import android.R;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.utils.dr;
import com.bytedance.sdk.component.utils.sba;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.component.zz.ycc;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.sz;
import com.bytedance.sdk.openadsdk.common.ul;
import com.bytedance.sdk.openadsdk.common.yzg;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.sf;
import com.bytedance.sdk.openadsdk.core.widget.emc.ycc;
import com.bytedance.sdk.openadsdk.utils.gbl;
import com.bytedance.sdk.openadsdk.utils.vk;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import j$.util.Objects;
import java.net.URLEncoder;
import java.util.HashMap;

/* loaded from: classes.dex */
public class TTWebsiteActivity extends TTBaseActivity {
    private ImageView aa;
    private ImageView cf;
    private com.bytedance.sdk.component.zz.ycc dg;
    public sz emc;
    private int gbl;
    private String msw;
    private float qh;
    private int sup;
    private ILoader sz;
    private ycc.emc uym;
    private ImageView vk;
    private yzg xq;
    private HashMap<String, String> ycc;
    private String ypw = null;
    private boolean bw = false;

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String strSf;
        String strXq;
        String strDg;
        rie rieVar;
        String str;
        super.onCreate(bundle);
        aa.ypw(getApplicationContext());
        if (!qh.bw()) {
            finish();
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            String stringExtra = getIntent().getStringExtra("_extra_meta");
            strSf = getIntent().getStringExtra("_extra_glo_d");
            strXq = getIntent().getStringExtra("_privacy_url");
            strDg = getIntent().getStringExtra("_privacy_title");
            str = stringExtra;
            rieVar = null;
        } else {
            rie rieVarEmc = sf.emc().emc(sf.emc(getIntent()));
            if (rieVarEmc == null) {
                finish();
                return;
            }
            strSf = rieVarEmc.sf();
            strXq = rieVarEmc.pvi().xq();
            strDg = rieVarEmc.pvi().dg();
            rieVar = rieVarEmc;
            str = null;
        }
        String str2 = strSf;
        String str3 = strXq;
        String str4 = strDg;
        if (TextUtils.isEmpty(str3)) {
            finish();
            return;
        }
        boolean zXmt = aa.dg().xmt();
        this.bw = zXmt;
        if (rieVar == null || !zXmt) {
            emc(rieVar, str, str2, str3, str4);
        } else {
            ypw(rieVar, str, str2, str3, str4);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        com.bytedance.sdk.component.zz.ycc yccVar = this.dg;
        if (yccVar != null) {
            dr.emc(yccVar);
        }
        super.onDestroy();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void ypw(rie rieVar, String str, String str2, String str3, String str4) {
        com.bytedance.sdk.component.zz.ycc yccVar;
        if (rieVar != null) {
            this.msw = rieVar.qlw();
        }
        if (!TextUtils.isEmpty(this.msw)) {
            this.sz = com.bytedance.sdk.openadsdk.uym.ypw.emc().ypw();
            int iEmc = com.bytedance.sdk.openadsdk.uym.ypw.emc().emc(this.sz, this.msw);
            this.gbl = iEmc;
            this.sup = iEmc > 0 ? 2 : 0;
        }
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(this);
        if (Build.VERSION.SDK_INT >= 35) {
            bwVar.setFitsSystemWindows(true);
        }
        bwVar.setBackgroundColor(-1);
        bwVar.setId(520093726);
        bwVar.setOrientation(1);
        bwVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(bwVar);
            sz szVar = new sz(this, rieVar, "tag", true);
            this.emc = szVar;
            View viewDg = szVar.dg();
            this.emc.emc();
            viewDg.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            viewDg.setVisibility(0);
            bwVar.addView(viewDg);
            final TextView textView = (TextView) viewDg.findViewById(vk.emc);
            viewDg.findViewById(vk.ypw);
            final com.bytedance.sdk.openadsdk.core.ycc.ycc yccVar2 = (com.bytedance.sdk.openadsdk.core.ycc.ycc) findViewById(520093743);
            if (yccVar2 != null) {
                yccVar2.setProgress(0);
                yccVar2.setMax(100);
            }
            ImageView imageView = (ImageView) findViewById(vk.pm);
            this.cf = imageView;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.9
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (TTWebsiteActivity.this.dg != null) {
                            if (TTWebsiteActivity.this.uym != null) {
                                TTWebsiteActivity.this.uym.emc();
                            }
                            if (TTWebsiteActivity.this.dg.zz()) {
                                TTWebsiteActivity.this.dg.ru();
                            } else {
                                TTWebsiteActivity.this.finish();
                            }
                        }
                    }
                });
            }
            ImageView imageView2 = (ImageView) findViewById(vk.ipv);
            this.vk = imageView2;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new g(26, this));
            }
            ImageView imageView3 = (ImageView) viewDg.findViewById(520093740);
            this.aa = imageView3;
            if (imageView3 != null) {
                imageView3.setOnClickListener(new a(this, yccVar2, str, rieVar, 0));
            }
            try {
                com.bytedance.sdk.component.zz.ycc yccVarXq = this.emc.xq();
                this.dg = yccVarXq;
                this.uym = new com.bytedance.sdk.openadsdk.core.widget.emc.ycc(yccVarXq.getWebView(), rieVar, this, false).xq();
                this.emc.emc(true);
                if (this.dg.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.dg.getParent()).removeView(this.dg);
                }
                bwVar.addView(this.dg, new ViewGroup.LayoutParams(-1, -1));
                this.ypw = str3;
                if (!TextUtils.isEmpty(str2)) {
                    String strEncode = URLEncoder.encode(str2);
                    if (this.ypw.contains("?")) {
                        this.ypw = AbstractC1135f5.n(new StringBuilder(), this.ypw, "&gdid_encrypted=", strEncode);
                    } else {
                        this.ypw = AbstractC1135f5.n(new StringBuilder(), this.ypw, "?gdid_encrypted=", strEncode);
                    }
                }
                if (this.ypw == null || (yccVar = this.dg) == null) {
                    finish();
                    return;
                }
                WebView webView = yccVar.getWebView();
                if (webView != null) {
                    WebSettings settings = webView.getSettings();
                    settings.setMixedContentMode(0);
                    try {
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(true);
                        settings.setSavePassword(false);
                        settings.setAllowFileAccess(false);
                    } catch (Throwable unused) {
                    }
                }
                HashMap<String, String> map = new HashMap<>();
                map.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
                this.ycc = map;
                try {
                    this.dg.emc(this.ypw, map);
                } catch (Throwable unused2) {
                    this.dg.a_(this.ypw);
                }
                this.dg.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.11
                    @Override // android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView2, int i) {
                        super.onProgressChanged(webView2, i);
                        if (yccVar2 == null || TTWebsiteActivity.this.isFinishing()) {
                            return;
                        }
                        if (i == 100) {
                            yccVar2.setVisibility(8);
                            webView2.canGoBack();
                        } else {
                            yccVar2.setVisibility(0);
                            yccVar2.setProgress(i);
                        }
                    }

                    @Override // android.webkit.WebChromeClient
                    public void onReceivedTitle(WebView webView2, String str5) {
                        TextView textView2;
                        if (TextUtils.isEmpty(str5) || (textView2 = textView) == null) {
                            return;
                        }
                        textView2.setText(str5);
                        TTWebsiteActivity.this.emc.ypw(webView2.getUrl());
                    }
                });
                this.dg.setWebViewClient(new ycc.emc() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.2
                    @Override // android.webkit.WebViewClient
                    public void onPageFinished(WebView webView2, String str5) {
                        TTWebsiteActivity tTWebsiteActivity;
                        sz szVar2;
                        super.onPageFinished(webView2, str5);
                        if (!TTWebsiteActivity.this.bw || (szVar2 = (tTWebsiteActivity = TTWebsiteActivity.this).emc) == null) {
                            return;
                        }
                        szVar2.emc(webView2, tTWebsiteActivity.uym);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView2, webResourceRequest, webResourceError);
                        webResourceError.getErrorCode();
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                        Objects.toString(webResourceResponse);
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView2, String str5) {
                        try {
                            Uri uri = Uri.parse(str5);
                            if (!sba.emc(str5)) {
                                try {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    intent.setData(uri);
                                    intent.addFlags(268435456);
                                    com.bytedance.sdk.component.utils.ypw.emc(TTWebsiteActivity.this, intent, null);
                                    return true;
                                } catch (Throwable unused3) {
                                    return true;
                                }
                            }
                        } catch (Throwable unused4) {
                        }
                        return super.shouldOverrideUrlLoading(webView2, str5);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView2, int i, String str5, String str6) {
                        super.onReceivedError(webView2, i, str5, str6);
                    }
                });
                this.dg.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.3
                    private final int ypw = aa.ypw();

                    @Override // android.view.View.OnTouchListener
                    @SuppressLint({"ClickableViewAccessibility"})
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        try {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                TTWebsiteActivity.this.qh = motionEvent.getRawY();
                                return false;
                            }
                            if (actionMasked != 2) {
                                return false;
                            }
                            float rawY = motionEvent.getRawY();
                            if (!TTWebsiteActivity.this.bw) {
                                return false;
                            }
                            if (rawY - TTWebsiteActivity.this.qh > this.ypw) {
                                TTWebsiteActivity.this.emc.emc();
                            }
                            if (rawY - TTWebsiteActivity.this.qh >= (-this.ypw)) {
                                return false;
                            }
                            TTWebsiteActivity.this.emc.ypw();
                            return false;
                        } catch (Throwable th) {
                            Log.e("TTAD.TTWebsiteActivity", "TouchRecordTool onTouch error", th);
                            return false;
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.core.widget.emc.xq.ypw(this.dg.getWebView());
            } catch (Exception e6) {
                ul.emc("TTAD.TTWebsiteActivity", "onCreate: ", e6);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    public static void emc(Context context, rie rieVar, String str) {
        if (context == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), rieVar, str, "open_policy");
        if (TextUtils.isEmpty(rieVar.pvi().xq())) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TTWebsiteActivity.class);
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            intent.putExtra("_extra_meta", rieVar.gef().toString());
            intent.putExtra("_extra_glo_d", rieVar.sf());
            intent.putExtra("_privacy_url", rieVar.pvi().xq());
            intent.putExtra("_privacy_title", rieVar.pvi().dg());
        } else {
            intent.putExtra("meta_index", sf.emc().emc(rieVar));
        }
        com.bytedance.sdk.component.utils.ypw.emc(context, intent, null);
    }

    private void emc(final rie rieVar, final String str, String str2, String str3, String str4) {
        com.bytedance.sdk.component.zz.ycc yccVar;
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(this);
        if (Build.VERSION.SDK_INT >= 35) {
            bwVar.setFitsSystemWindows(true);
        }
        bwVar.setBackgroundColor(-1);
        bwVar.setId(520093726);
        bwVar.setOrientation(1);
        bwVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(bwVar);
            int iYpw = vw.ypw(this, 5.0f);
            int iYpw2 = vw.ypw(this, 8.0f);
            int iYpw3 = vw.ypw(this, 10.0f);
            int iYpw4 = vw.ypw(this, 12.0f);
            int iYpw5 = vw.ypw(this, 14.0f);
            int iYpw6 = vw.ypw(this, 20.0f);
            int iYpw7 = vw.ypw(this, 24.0f);
            int iYpw8 = vw.ypw(this, 40.0f);
            int iYpw9 = vw.ypw(this, 44.0f);
            int iYpw10 = vw.ypw(this, 191.0f);
            com.bytedance.sdk.openadsdk.core.ycc.uym uymVar = new com.bytedance.sdk.openadsdk.core.ycc.uym(this);
            uymVar.setGravity(15);
            uymVar.setLayoutParams(new LinearLayout.LayoutParams(-1, iYpw9));
            com.bytedance.sdk.openadsdk.core.ycc.dg dgVar = new com.bytedance.sdk.openadsdk.core.ycc.dg(this);
            dgVar.setId(520093720);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iYpw8, iYpw9);
            layoutParams.setMarginStart(iYpw2);
            dgVar.setLayoutParams(layoutParams);
            dgVar.setClickable(true);
            dgVar.setFocusable(true);
            dgVar.setPadding(iYpw5, iYpw4, iYpw5, iYpw4);
            dgVar.setImageDrawable(com.bytedance.sdk.component.utils.rie.xq(this, "tt_ad_arrow_backward"));
            final com.bytedance.sdk.openadsdk.core.ycc.dg dgVar2 = new com.bytedance.sdk.openadsdk.core.ycc.dg(this);
            dgVar2.setId(520093716);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iYpw8, iYpw9);
            layoutParams2.addRule(17, 520093720);
            dgVar2.setLayoutParams(layoutParams2);
            dgVar2.setClickable(true);
            dgVar2.setFocusable(true);
            dgVar2.setPadding(iYpw4, iYpw5, iYpw4, iYpw5);
            dgVar2.setImageDrawable(com.bytedance.sdk.component.utils.rie.xq(this, "tt_ad_xmark"));
            com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(this);
            mswVar.setId(vk.vum);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iYpw10, iYpw7);
            layoutParams3.setMarginStart(iYpw);
            layoutParams3.addRule(15);
            layoutParams3.addRule(16, 520093741);
            layoutParams3.addRule(17, 520093716);
            mswVar.setLayoutParams(layoutParams3);
            mswVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            mswVar.setGravity(17);
            mswVar.setSingleLine(true);
            mswVar.setTextColor(Color.parseColor("#222222"));
            mswVar.setTextSize(17.0f);
            com.bytedance.sdk.openadsdk.core.ycc.dg dgVar3 = new com.bytedance.sdk.openadsdk.core.ycc.dg(this);
            dgVar3.setId(520093741);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iYpw8, iYpw9);
            layoutParams4.addRule(16, 520093742);
            dgVar3.setLayoutParams(layoutParams4);
            dgVar3.setPadding(iYpw3, iYpw4, iYpw3, iYpw4);
            dgVar3.setImageDrawable(com.bytedance.sdk.component.utils.rie.xq(this, "tt_ad_link"));
            com.bytedance.sdk.openadsdk.core.ycc.dg dgVar4 = new com.bytedance.sdk.openadsdk.core.ycc.dg(this);
            dgVar4.setId(520093742);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(iYpw8, iYpw9);
            layoutParams5.addRule(21);
            layoutParams5.setMarginEnd(iYpw2);
            dgVar4.setLayoutParams(layoutParams5);
            dgVar4.setPadding(iYpw4, iYpw6, iYpw4, iYpw6);
            dgVar4.setImageDrawable(com.bytedance.sdk.component.utils.rie.xq(this, "tt_ad_threedots"));
            final com.bytedance.sdk.openadsdk.core.ycc.ycc yccVar2 = new com.bytedance.sdk.openadsdk.core.ycc.ycc(this, null, R.style.Widget.ProgressBar.Horizontal);
            yccVar2.setId(520093743);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, vw.ypw(this, 2.0f));
            layoutParams6.addRule(12);
            yccVar2.setLayoutParams(layoutParams6);
            yccVar2.setProgress(1);
            yccVar2.setProgressDrawable(gbl.emc(this, "tt_privacy_progress_style"));
            View view = new View(this);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, vw.ypw(this, 1.0f));
            layoutParams7.addRule(12);
            view.setLayoutParams(layoutParams7);
            uymVar.addView(dgVar);
            uymVar.addView(dgVar2);
            uymVar.addView(mswVar);
            uymVar.addView(dgVar3);
            uymVar.addView(dgVar4);
            uymVar.addView(yccVar2);
            uymVar.addView(view);
            bwVar.addView(uymVar);
            try {
                com.bytedance.sdk.component.zz.ycc yccVar3 = new com.bytedance.sdk.component.zz.ycc(this, ycc.xq.PRIVACY);
                this.dg = yccVar3;
                yccVar3.setBackgroundColor(-1);
                bwVar.addView(this.dg, new ViewGroup.LayoutParams(-1, -1));
                dgVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.dg.zz()) {
                            TTWebsiteActivity.this.dg.ru();
                        } else {
                            TTWebsiteActivity.this.finish();
                        }
                    }
                });
                dgVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.this.finish();
                    }
                });
                dgVar2.setVisibility(4);
                dgVar2.setClickable(false);
                if (!TextUtils.isEmpty(str4)) {
                    mswVar.setText(str4);
                }
                dgVar3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        String url = TTWebsiteActivity.this.dg.getUrl();
                        if (TextUtils.isEmpty(url)) {
                            return;
                        }
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.ypw.emc(TTWebsiteActivity.this, intent, null);
                    }
                });
                dgVar4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.6
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.xq == null) {
                            TTWebsiteActivity.this.xq = new yzg(TTWebsiteActivity.this);
                            TTWebsiteActivity.this.xq.emc(str, rieVar);
                            TTWebsiteActivity.this.xq.setCanceledOnTouchOutside(false);
                        }
                        TTWebsiteActivity.this.xq.show();
                    }
                });
                this.ypw = str3;
                if (!TextUtils.isEmpty(str2)) {
                    String strEncode = URLEncoder.encode(str2);
                    if (this.ypw.contains("?")) {
                        this.ypw = AbstractC1135f5.n(new StringBuilder(), this.ypw, "&gdid_encrypted=", strEncode);
                    } else {
                        this.ypw = AbstractC1135f5.n(new StringBuilder(), this.ypw, "?gdid_encrypted=", strEncode);
                    }
                }
                if (this.ypw != null && (yccVar = this.dg) != null) {
                    WebView webView = yccVar.getWebView();
                    if (webView != null) {
                        WebSettings settings = webView.getSettings();
                        settings.setMixedContentMode(0);
                        try {
                            settings.setJavaScriptEnabled(true);
                            settings.setDomStorageEnabled(true);
                            settings.setSavePassword(false);
                            settings.setAllowFileAccess(false);
                        } catch (Throwable unused) {
                        }
                    }
                    HashMap map = new HashMap();
                    map.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
                    try {
                        this.dg.emc(this.ypw, map);
                    } catch (Throwable unused2) {
                        this.dg.a_(this.ypw);
                    }
                    this.dg.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.7
                        @Override // android.webkit.WebChromeClient
                        public void onProgressChanged(WebView webView2, int i) {
                            super.onProgressChanged(webView2, i);
                            if (yccVar2 == null || TTWebsiteActivity.this.isFinishing()) {
                                return;
                            }
                            if (i != 100) {
                                yccVar2.setVisibility(0);
                                yccVar2.setProgress(i);
                                return;
                            }
                            yccVar2.setVisibility(8);
                            if (webView2.canGoBack()) {
                                dgVar2.setVisibility(0);
                                dgVar2.setClickable(true);
                            } else {
                                dgVar2.setVisibility(4);
                                dgVar2.setClickable(false);
                            }
                        }
                    });
                    this.dg.setWebViewClient(new ycc.emc() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.8
                        @Override // android.webkit.WebViewClient
                        public void onPageFinished(WebView webView2, String str5) {
                            super.onPageFinished(webView2, str5);
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                            super.onReceivedError(webView2, webResourceRequest, webResourceError);
                            webResourceError.getErrorCode();
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                            super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                            Objects.toString(webResourceResponse);
                        }

                        @Override // android.webkit.WebViewClient
                        public boolean shouldOverrideUrlLoading(WebView webView2, String str5) {
                            try {
                                Uri uri = Uri.parse(str5);
                                if (!sba.emc(str5)) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.VIEW");
                                        intent.setData(uri);
                                        intent.addFlags(268435456);
                                        com.bytedance.sdk.component.utils.ypw.emc(TTWebsiteActivity.this, intent, null);
                                        return true;
                                    } catch (Throwable unused3) {
                                        return true;
                                    }
                                }
                            } catch (Throwable unused4) {
                            }
                            return super.shouldOverrideUrlLoading(webView2, str5);
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedError(WebView webView2, int i, String str5, String str6) {
                            super.onReceivedError(webView2, i, str5, str6);
                        }
                    });
                    com.bytedance.sdk.openadsdk.core.widget.emc.xq.ypw(this.dg.getWebView());
                    return;
                }
                finish();
            } catch (Exception e6) {
                ul.emc("TTAD.TTWebsiteActivity", "onCreate: ", e6);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void emc(View view) {
        com.bytedance.sdk.component.zz.ycc yccVar = this.dg;
        if (yccVar == null || !yccVar.gbl()) {
            return;
        }
        this.dg.sup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void emc(final com.bytedance.sdk.openadsdk.core.ycc.ycc yccVar, final String str, final rie rieVar, View view) {
        final com.bytedance.sdk.openadsdk.common.ul ulVar = new com.bytedance.sdk.openadsdk.common.ul(this, true);
        ulVar.setOnMenuItemClickListener(new ul.emc() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.10
            @Override // com.bytedance.sdk.openadsdk.common.ul.emc
            public void dg() {
                if (TTWebsiteActivity.this.xq == null) {
                    TTWebsiteActivity.this.xq = new yzg(TTWebsiteActivity.this);
                    TTWebsiteActivity.this.xq.emc(str, rieVar);
                    TTWebsiteActivity.this.xq.setCanceledOnTouchOutside(false);
                }
                TTWebsiteActivity.this.xq.show();
                ulVar.emc();
            }

            @Override // com.bytedance.sdk.openadsdk.common.ul.emc
            public void emc() {
                if (TTWebsiteActivity.this.dg == null || TTWebsiteActivity.this.ypw == null || TTWebsiteActivity.this.ycc == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.ycc.ycc yccVar2 = yccVar;
                if (yccVar2 != null) {
                    yccVar2.setVisibility(0);
                    yccVar.setProgress(0);
                }
                TTWebsiteActivity.this.dg.uym();
                TTWebsiteActivity.this.dg.a_(TTWebsiteActivity.this.dg.getWebView().getUrl());
                ulVar.emc();
            }

            @Override // com.bytedance.sdk.openadsdk.common.ul.emc
            public void xq() {
                if (TTWebsiteActivity.this.dg != null) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = TTWebsiteActivity.this.dg.getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.ypw.emc(TTWebsiteActivity.this, intent, null);
                    }
                    ulVar.emc();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.ul.emc
            public void ypw() {
                ClipboardManager clipboardManager;
                if (TTWebsiteActivity.this.dg != null) {
                    String url = TTWebsiteActivity.this.dg.getUrl();
                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) TTWebsiteActivity.this.getSystemService("clipboard")) != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                    }
                }
                ulVar.emc();
            }
        });
        ulVar.emc(view);
    }
}
