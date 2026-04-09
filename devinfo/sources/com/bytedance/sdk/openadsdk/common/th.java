package com.bytedance.sdk.openadsdk.common;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.ouw.le;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class th {
    private final vpp fkw;

    /* renamed from: le, reason: collision with root package name */
    private final String f7847le;

    /* renamed from: lh, reason: collision with root package name */
    le.ouw f7848lh;
    final com.bytedance.sdk.component.bly.le ouw;
    private ImageView pno;
    private ImageView ra;
    final Context vt;
    private final LinearLayout yu;

    public th(Context context, LinearLayout linearLayout, com.bytedance.sdk.component.bly.le leVar, vpp vppVar, String str) {
        this.vt = context;
        this.yu = linearLayout;
        this.ouw = leVar;
        this.fkw = vppVar;
        this.f7847le = str;
        this.ra = (ImageView) linearLayout.findViewById(com.bytedance.sdk.openadsdk.utils.rn.euf);
        this.pno = (ImageView) linearLayout.findViewById(com.bytedance.sdk.openadsdk.utils.rn.njr);
        ImageView imageView = (ImageView) linearLayout.findViewById(com.bytedance.sdk.openadsdk.utils.rn.mq);
        ImageView imageView2 = (ImageView) linearLayout.findViewById(com.bytedance.sdk.openadsdk.utils.rn.an);
        this.ra.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.th.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                com.bytedance.sdk.component.bly.le leVar2 = th.this.ouw;
                if (leVar2 == null || !leVar2.lh()) {
                    return;
                }
                le.ouw ouwVar = th.this.f7848lh;
                if (ouwVar != null) {
                    ouwVar.ouw();
                }
                th.ouw(th.this, "backward");
                th.this.ouw.yu();
            }
        });
        this.pno.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.th.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                com.bytedance.sdk.component.bly.le leVar2 = th.this.ouw;
                if (leVar2 == null || !leVar2.fkw()) {
                    return;
                }
                th.ouw(th.this, "forward");
                try {
                    th.this.ouw.ouw.goForward();
                } catch (Throwable unused) {
                }
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.th.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                th thVar = th.this;
                if (thVar.ouw != null) {
                    th.vt(thVar, "refresh");
                    try {
                        th.this.ouw.ouw.reload();
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.th.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                th thVar = th.this;
                if (thVar.ouw != null) {
                    th.vt(thVar, "external_btn_click");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = th.this.ouw.getUrl();
                    if (TextUtils.isEmpty(url)) {
                        return;
                    }
                    intent.setData(Uri.parse(url));
                    com.bytedance.sdk.component.utils.vt.ouw(th.this.vt, intent, null);
                }
            }
        });
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.th.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        this.ra.setClickable(false);
        this.pno.setClickable(false);
        ImageView imageView3 = this.ra;
        int color = Color.parseColor("#A8FFFFFF");
        PorterDuff.Mode mode = PorterDuff.Mode.ADD;
        imageView3.setColorFilter(color, mode);
        this.pno.setColorFilter(Color.parseColor("#A8FFFFFF"), mode);
    }

    public final void ouw(WebView webView, le.ouw ouwVar) {
        this.f7848lh = ouwVar;
        try {
            if (this.ra != null) {
                if (webView.canGoBack()) {
                    this.ra.setClickable(true);
                    this.ra.clearColorFilter();
                } else {
                    this.ra.setClickable(false);
                    this.ra.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.pno != null) {
                if (webView.canGoForward()) {
                    this.pno.setClickable(true);
                    this.pno.clearColorFilter();
                } else {
                    this.pno.setClickable(false);
                    this.pno.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void vt() {
        if (this.yu.getAlpha() == 1.0f) {
            ObjectAnimator.ofFloat(this.yu, "alpha", 1.0f, 0.0f).setDuration(300L).start();
        }
    }

    public static /* synthetic */ void vt(th thVar, String str) throws JSONException {
        WebBackForwardList webBackForwardListCopyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (thVar.ouw.getWebView() != null && (webBackForwardListCopyBackForwardList = thVar.ouw.getWebView().copyBackForwardList()) != null) {
                String url = webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex()).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = thVar.ouw.getUrl();
                }
                jSONObject.putOpt("url", url);
                jSONObject.putOpt("first_page", Integer.valueOf(webBackForwardListCopyBackForwardList.getCurrentIndex() == 0 ? 1 : 0));
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), thVar.fkw, thVar.f7847le, str, jSONObject);
    }

    public final void ouw() {
        if (this.yu.getAlpha() == 0.0f) {
            ObjectAnimator.ofFloat(this.yu, "alpha", 0.0f, 1.0f).setDuration(300L).start();
        }
    }

    public static /* synthetic */ void ouw(th thVar, String str) throws JSONException {
        WebBackForwardList webBackForwardListCopyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (thVar.ouw.getWebView() != null && (webBackForwardListCopyBackForwardList = thVar.ouw.getWebView().copyBackForwardList()) != null) {
                int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                String url = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = thVar.ouw.getUrl();
                }
                String url2 = "";
                if (str.equals("backward")) {
                    url2 = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex - 1).getUrl();
                }
                int i4 = 1;
                if (str.equals("forward")) {
                    url2 = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex + 1).getUrl();
                }
                jSONObject.putOpt("url", url);
                jSONObject.putOpt("next_url", url2);
                if (webBackForwardListCopyBackForwardList.getCurrentIndex() != 0) {
                    i4 = 0;
                }
                jSONObject.putOpt("first_page", Integer.valueOf(i4));
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), thVar.fkw, thVar.f7847le, str, jSONObject);
    }
}
