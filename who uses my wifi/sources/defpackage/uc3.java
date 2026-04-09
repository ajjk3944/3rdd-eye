package defpackage;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uc3 extends sc3 {
    public WebView e;
    public Long f;
    public final Map g;

    public uc3(String str, Map map) {
        super(str);
        this.f = null;
        this.g = map;
    }

    @Override // defpackage.sc3
    public final void a() {
        WebView webView = new WebView(nc3.g.f);
        this.e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.e.getSettings().setAllowContentAccess(false);
        this.e.getSettings().setAllowFileAccess(false);
        this.e.setWebViewClient(new er0(2, this));
        this.b = new dd3(this.e);
        fr.t(this.e, null);
        Map map = this.g;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            map.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        this.f = Long.valueOf(System.nanoTime());
    }

    @Override // defpackage.sc3
    public final void b() {
        super.b();
        new Handler().postDelayed(new bs2(this), Math.max(4000 - (this.f == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.e = null;
    }

    @Override // defpackage.sc3
    public final void d(xb3 xb3Var, uk1 uk1Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap((HashMap) uk1Var.i);
        Iterator it = mapUnmodifiableMap.keySet().iterator();
        if (it.hasNext()) {
            mapUnmodifiableMap.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        e(xb3Var, uk1Var, jSONObject);
    }
}
