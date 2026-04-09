package com.bytedance.sdk.openadsdk.core.widget.ouw;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.utils.th;
import com.bytedance.sdk.openadsdk.yu.mwh;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class yu extends WebChromeClient {
    private static final String ouw = "WebChromeClient";

    /* renamed from: lh, reason: collision with root package name */
    private mwh f8498lh;
    private final bs vt;
    private com.bytedance.sdk.openadsdk.common.fkw yu;

    public yu(bs bsVar) {
        this.vt = bsVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i4, String str2) {
        if (!TextUtils.isEmpty(str)) {
            ouw(str);
        }
        super.onConsoleMessage(str, i4, str2);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i4) {
        super.onProgressChanged(webView, i4);
        mwh mwhVar = this.f8498lh;
        if (mwhVar != null && webView != null) {
            ko.vt("LandingPageLog", "onWebProgress: ".concat(String.valueOf(i4)));
            if (mwhVar.f8816pd == 0) {
                mwhVar.f8816pd = SystemClock.elapsedRealtime();
            }
            if (mwhVar.jqy == 0 && i4 > 0) {
                mwhVar.jqy = System.currentTimeMillis();
            } else if (mwhVar.ex == 0 && i4 == 100) {
                mwhVar.ex = System.currentTimeMillis();
            }
            if (mwhVar.vt != mwh.ouw.length && ("landingpage".equals(mwhVar.qbp) || "landingpage_endcard".equals(mwhVar.qbp) || "landingpage_split_screen".equals(mwhVar.qbp) || "landingpage_direct".equals(mwhVar.qbp) || "aggregate_page".equals(mwhVar.qbp))) {
                int i10 = mwhVar.vt;
                while (true) {
                    int[] iArr = mwh.ouw;
                    if (i10 >= iArr.length || i4 < iArr[mwhVar.vt]) {
                        break;
                    }
                    int i11 = i10 + 1;
                    mwhVar.vt = i11;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("url", webView.getUrl());
                        long j = mwhVar.f8814lh;
                        if (j != -1) {
                            jSONObject.put("page_id", j);
                        }
                        jSONObject.putOpt("render_type", "h5");
                        jSONObject.putOpt("render_type_2", 0);
                        jSONObject.put("pct", iArr[i10]);
                    } catch (Exception unused) {
                    }
                    mwhVar.ouw("progress_load_finish", jSONObject);
                    i10 = i11;
                }
            }
            if (i4 == 100) {
                mwhVar.ouw(false, SystemClock.elapsedRealtime());
                mwhVar.ouw(webView.getUrl(), "progress", Math.min(mwhVar.ex - mwhVar.jqy, TTAdConstant.AD_MAX_EVENT_TIME));
            }
        }
        com.bytedance.sdk.openadsdk.common.fkw fkwVar = this.yu;
        if (fkwVar != null) {
            com.bytedance.sdk.openadsdk.common.yu yuVar = fkwVar.vt;
            if (yuVar != null) {
                yuVar.ouw(i4);
            }
            if (fkwVar.bly) {
                if (fkwVar.ouw(i4, 30)) {
                    fkwVar.ouw(30, webView);
                }
                if (fkwVar.ouw(i4, 50)) {
                    fkwVar.ouw(50, webView);
                }
                if (fkwVar.ouw(i4, 70)) {
                    fkwVar.ouw(70, webView);
                }
            }
            if (fkwVar.vt == null || i4 != 100) {
                return;
            }
            ko.vt("arbitrage_style", "trigger onProgressChanged");
            fkwVar.ouw(1);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }

    private boolean ouw(final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.regionMatches(true, 0, "bytedance:", 0, 10)) {
                jg.lh().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.widget.ouw.yu.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        th.ouw(Uri.parse(str), yu.this.vt);
                    }
                });
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public yu(bs bsVar, mwh mwhVar, com.bytedance.sdk.openadsdk.common.fkw fkwVar) {
        this(bsVar, mwhVar);
        this.yu = fkwVar;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message()) || !ouw(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    public yu(bs bsVar, mwh mwhVar) {
        this.vt = bsVar;
        this.f8498lh = mwhVar;
    }
}
