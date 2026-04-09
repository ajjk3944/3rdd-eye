package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.iyl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bw implements sf.emc {
    private dg bw;
    private long cf;
    private final com.bytedance.sdk.component.zz.ycc dg;
    private final rie emc;
    private float msw;
    private boolean qh;
    private long ru;
    private int sz;
    private String ul;
    private boolean vk;
    private WebView xq;
    private final boolean ypw;
    private int yzg;
    private int zz;
    private String ycc = "landingpage";
    private final Handler uym = new sf(com.bytedance.sdk.openadsdk.core.qh.ypw().getLooper(), this);
    private final AtomicBoolean gbl = new AtomicBoolean(false);
    private Pattern sup = null;
    private long sba = -1;

    /* renamed from: aa, reason: collision with root package name */
    private final List<Integer> f9265aa = new ArrayList();

    public bw(rie rieVar, com.bytedance.sdk.component.zz.ycc yccVar, String str, boolean z10) {
        this.emc = rieVar;
        this.dg = yccVar;
        this.ypw = z10;
        ypw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void bw() {
        this.qh = false;
        if (this.gbl.getAndSet(true)) {
            return;
        }
        this.ru = SystemClock.elapsedRealtime();
        this.cf = System.currentTimeMillis();
        msw();
        if (this.bw == null) {
            return;
        }
        WebView webView = this.xq;
        if (webView != null) {
            this.ul = webView.getUrl();
        }
        this.bw.setVisibility(0);
        this.bw.emc(this.emc);
        this.bw.emc();
        this.bw.setAlpha(this.msw);
        this.bw.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.bw.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        dg();
        xq();
    }

    private void dg() {
        Handler handler = this.uym;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void msw() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("loading_show_interval", SystemClock.elapsedRealtime() - this.sba);
            jSONObject.put("loading_show_timestamp", this.cf);
            WebView webView = this.xq;
            jSONObject.put("arbi_current_url", webView != null ? webView.getUrl() : "");
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.dg.xq.emc(this.emc, this.ycc, jSONObject);
    }

    private int uym() {
        try {
            return this.xq.copyBackForwardList().getCurrentIndex() + 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ycc() {
        return uym() > 0 && !this.gbl.get();
    }

    private void ypw() {
        com.bytedance.sdk.component.zz.ycc yccVar = this.dg;
        if (yccVar != null) {
            this.xq = yccVar.getWebView();
            View arbitrageLoadingView = this.dg.getArbitrageLoadingView();
            if (arbitrageLoadingView instanceof dg) {
                this.bw = (dg) arbitrageLoadingView;
            }
        }
        this.zz = com.bytedance.sdk.openadsdk.core.settings.gbl.xq().db();
        this.msw = com.bytedance.sdk.openadsdk.core.settings.gbl.xq().sb();
    }

    public void xq(WebView webView, String str, boolean z10) {
        this.f9265aa.clear();
        this.vk = z10;
        if (z10) {
            this.qh = true;
        }
        this.yzg = uym();
    }

    public void emc(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.ycc = str;
    }

    public void emc(WebView webView, String str, boolean z10) {
        if (z10 && ycc()) {
            emc();
        }
    }

    private void xq() {
        Handler handler = this.uym;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, this.zz);
        }
    }

    public void emc(WebView webView, String str) {
        rie rieVar = this.emc;
        if (rieVar == null || !com.bytedance.sdk.component.zz.ypw.emc(rieVar.ee().xq(), str)) {
            return;
        }
        this.sz++;
        com.bytedance.sdk.component.utils.zz.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.bw.1
            @Override // java.lang.Runnable
            public void run() {
                if (bw.this.ycc()) {
                    bw.this.emc();
                }
            }
        });
    }

    public void ypw(WebView webView, String str, boolean z10) {
        if (!z10 || this.bw == null) {
            return;
        }
        emc(1);
    }

    public void emc(WebView webView, int i10) {
        dg dgVar = this.bw;
        if (dgVar != null) {
            dgVar.emc(i10);
        }
        if (this.vk) {
            if (emc(i10, 30)) {
                emc(30, webView);
            }
            if (emc(i10, 50)) {
                emc(50, webView);
            }
            if (emc(i10, 70)) {
                emc(70, webView);
            }
        }
        if (this.bw == null || i10 != 100) {
            return;
        }
        emc(1);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void emc() {
        if (iyl.ycc()) {
            bw();
        } else {
            com.bytedance.sdk.component.utils.zz.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.bw.2
                @Override // java.lang.Runnable
                public void run() {
                    bw.this.bw();
                }
            });
        }
    }

    private void emc(final int i10) {
        WebView webView = this.xq;
        if (webView != null && i10 == 1) {
            String url = webView.getUrl();
            if (TextUtils.isEmpty(url) || url.equals(this.ul)) {
                return;
            }
        }
        com.bytedance.sdk.component.utils.zz.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.bw.4
            @Override // java.lang.Runnable
            public void run() {
                if (bw.this.bw != null) {
                    bw.this.gbl.set(false);
                    bw.this.bw.emc(bw.this.emc, bw.this.ycc, i10, bw.this.ul, bw.this.ru, bw.this.qh, bw.this.sz, bw.this.cf);
                    bw.this.sz = 0;
                }
            }
        });
        dg();
    }

    @Override // com.bytedance.sdk.component.utils.sf.emc
    public void emc(Message message) {
        if (message.what == 1) {
            emc(0);
        }
    }

    public void emc(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.sba = SystemClock.elapsedRealtime();
        }
    }

    private boolean emc(int i10, int i11) {
        if (i10 < i11 || this.f9265aa.contains(Integer.valueOf(i11)) || this.yzg < 2) {
            return false;
        }
        this.f9265aa.add(Integer.valueOf(i11));
        return true;
    }

    private void emc(int i10, WebView webView) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_progress", i10);
            jSONObject.put("progress_timestamp", System.currentTimeMillis());
            jSONObject.put("arbi_current_url", webView.getUrl());
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.emc, this.ycc, jSONObject);
    }
}
