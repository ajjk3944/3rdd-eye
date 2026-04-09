package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.bs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw implements jae.ouw {
    public boolean bly;

    /* renamed from: cf, reason: collision with root package name */
    public int f7827cf;

    /* renamed from: jg, reason: collision with root package name */
    private WebView f7828jg;
    private final com.bytedance.sdk.component.bly.le ko;

    /* renamed from: le, reason: collision with root package name */
    public int f7829le;
    public final vpp ouw;
    long pno;
    public boolean ra;
    String ryl;
    private int vm;
    public yu vt;
    long yu;
    private float zih;

    /* renamed from: lh, reason: collision with root package name */
    String f7830lh = "landingpage";
    private final Handler rn = new jae(com.bytedance.sdk.openadsdk.core.jg.vt().getLooper(), this);
    final AtomicBoolean fkw = new AtomicBoolean(false);

    /* renamed from: th, reason: collision with root package name */
    private Pattern f7831th = null;
    private long qbp = -1;
    private final boolean mwh = false;
    public final List<Integer> tlj = new ArrayList();

    public fkw(vpp vppVar, com.bytedance.sdk.component.bly.le leVar) {
        this.ouw = vppVar;
        this.ko = leVar;
        if (leVar != null) {
            this.f7828jg = leVar.getWebView();
            View arbitrageLoadingView = leVar.getArbitrageLoadingView();
            if (arbitrageLoadingView instanceof yu) {
                this.vt = (yu) arbitrageLoadingView;
            }
        }
        this.vm = com.bytedance.sdk.openadsdk.core.settings.cf.vt().pno.ouw(com.bytedance.sdk.openadsdk.core.settings.cf.vt, 10000);
        this.zih = com.bytedance.sdk.openadsdk.core.settings.cf.vt().pno.ouw(com.bytedance.sdk.openadsdk.core.settings.cf.f8440lh);
    }

    private void fkw() {
        Handler handler = this.rn;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, this.vm);
        }
    }

    private void le() {
        Handler handler = this.rn;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void ra() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("loading_show_interval", SystemClock.elapsedRealtime() - this.qbp);
            jSONObject.put("loading_show_timestamp", this.pno);
            WebView webView = this.f7828jg;
            jSONObject.put("arbi_current_url", webView != null ? webView.getUrl() : "");
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(this.ouw, this.f7830lh, jSONObject);
    }

    public final boolean lh() {
        return yu() > 0 && !this.fkw.get();
    }

    public final void ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f7830lh = str;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void vt() {
        this.ra = false;
        if (this.fkw.getAndSet(true)) {
            return;
        }
        this.yu = SystemClock.elapsedRealtime();
        this.pno = System.currentTimeMillis();
        ra();
        if (this.vt == null) {
            return;
        }
        WebView webView = this.f7828jg;
        if (webView != null) {
            String url = webView.getUrl();
            this.ryl = url;
            com.bytedance.sdk.component.utils.ko.ouw("ArbitrageLoadingStyle", "showLoadingUrl is:", url);
        }
        this.vt.setVisibility(0);
        this.vt.ouw(this.ouw);
        this.vt.ouw();
        this.vt.setAlpha(this.zih);
        this.vt.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.fkw.3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        le();
        fkw();
    }

    public final int yu() {
        try {
            return this.f7828jg.copyBackForwardList().getCurrentIndex() + 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void ouw() {
        if (bs.le()) {
            vt();
        } else {
            com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.fkw.2
                @Override // java.lang.Runnable
                public final void run() {
                    fkw.this.vt();
                }
            });
        }
    }

    public final void ouw(final int i4) {
        WebView webView = this.f7828jg;
        if (webView != null && i4 == 1) {
            String url = webView.getUrl();
            com.bytedance.sdk.component.utils.ko.ouw("ArbitrageLoadingStyle", "destroyLoadingUrl is:", url);
            if (TextUtils.isEmpty(url) || url.equals(this.ryl)) {
                return;
            }
        }
        com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.fkw.4
            @Override // java.lang.Runnable
            public final void run() {
                fkw fkwVar = fkw.this;
                if (fkwVar.vt != null) {
                    fkwVar.fkw.set(false);
                    fkw fkwVar2 = fkw.this;
                    fkwVar2.vt.ouw(fkwVar2.ouw, fkwVar2.f7830lh, i4, fkwVar2.ryl, fkwVar2.yu, fkwVar2.ra, fkwVar2.f7829le, fkwVar2.pno);
                    fkw.this.f7829le = 0;
                }
            }
        });
        le();
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        if (message.what == 1) {
            ouw(0);
        }
    }

    public final void ouw(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.qbp = SystemClock.elapsedRealtime();
        }
    }

    public final boolean ouw(int i4, int i10) {
        if (i4 < i10 || this.tlj.contains(Integer.valueOf(i10)) || this.f7827cf < 2) {
            return false;
        }
        this.tlj.add(Integer.valueOf(i10));
        return true;
    }

    public final void ouw(int i4, WebView webView) {
        com.bytedance.sdk.component.utils.ko.ouw("arbitrage_loading_test", Integer.valueOf(i4));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_progress", i4);
            jSONObject.put("progress_timestamp", System.currentTimeMillis());
            jSONObject.put("arbi_current_url", webView.getUrl());
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.ouw, this.f7830lh, jSONObject);
    }
}
