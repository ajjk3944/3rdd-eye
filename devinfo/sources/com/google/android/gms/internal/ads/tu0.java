package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tu0 extends pu0 {

    /* renamed from: e, reason: collision with root package name */
    public WebView f16964e;

    /* renamed from: f, reason: collision with root package name */
    public Long f16965f;
    public final Map g;

    public tu0(String str, Map map) {
        super(str);
        this.f16965f = null;
        this.g = map;
    }

    @Override // com.google.android.gms.internal.ads.pu0
    public final void a() {
        WebView webView = new WebView(mu0.f14020c.f14022b);
        this.f16964e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f16964e.getSettings().setAllowContentAccess(false);
        this.f16964e.getSettings().setAllowFileAccess(false);
        this.f16964e.setWebViewClient(new ru0(0, this));
        this.f15109b = new c1.r(this.f16964e);
        w5.D(this.f16964e, null);
        Map map = this.g;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            map.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        this.f16965f = Long.valueOf(System.nanoTime());
    }

    @Override // com.google.android.gms.internal.ads.pu0
    public final void b() {
        super.b();
        new Handler().postDelayed(new du0(this), Math.max(4000 - (this.f16965f == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f16965f.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f16964e = null;
    }

    @Override // com.google.android.gms.internal.ads.pu0
    public final void d(vt0 vt0Var, b7 b7Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap((HashMap) b7Var.f9608d);
        Iterator it = mapUnmodifiableMap.keySet().iterator();
        if (it.hasNext()) {
            mapUnmodifiableMap.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        e(vt0Var, b7Var, jSONObject);
    }
}
