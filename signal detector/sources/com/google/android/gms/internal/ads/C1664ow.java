package com.google.android.gms.internal.ads;

import Y2.C0212n;
import android.os.Handler;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ow, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1664ow extends AbstractC1502lw {

    /* renamed from: e, reason: collision with root package name */
    public WebView f16079e;

    /* renamed from: f, reason: collision with root package name */
    public Long f16080f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f16081g;

    public C1664ow(String str, Map map) {
        super(str);
        this.f16080f = null;
        this.f16081g = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1502lw
    public final void a() {
        WebView webView = new WebView(C1288hw.f14618c.f14620b);
        this.f16079e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f16079e.getSettings().setAllowContentAccess(false);
        this.f16079e.getSettings().setAllowFileAccess(false);
        this.f16079e.setWebViewClient(new C0212n(1, this));
        this.f15489b = new C2203yw(this.f16079e);
        C1994v2.E(this.f16079e, null);
        Map map = this.f16081g;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            map.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        this.f16080f = Long.valueOf(System.nanoTime());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1502lw
    public final void b() {
        super.b();
        new Handler().postDelayed(new Fu(this), Math.max(4000 - (this.f16080f == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f16080f.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f16079e = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1502lw
    public final void d(Rv rv, C0969c3 c0969c3) {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap((HashMap) c0969c3.f13523d);
        Iterator it = mapUnmodifiableMap.keySet().iterator();
        if (it.hasNext()) {
            mapUnmodifiableMap.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        e(rv, c0969c3, jSONObject);
    }
}
