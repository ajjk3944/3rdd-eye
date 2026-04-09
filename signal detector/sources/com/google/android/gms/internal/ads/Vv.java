package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public final class Vv {

    /* renamed from: a, reason: collision with root package name */
    public final K9 f12107a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f12108b;

    /* renamed from: c, reason: collision with root package name */
    public final C2203yw f12109c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f12110d;

    /* renamed from: e, reason: collision with root package name */
    public final C1234gw f12111e;

    /* JADX WARN: Multi-variable type inference failed */
    public Vv(K9 k9, WebView webView) {
        HashMap map = new HashMap();
        this.f12110d = map;
        this.f12111e = new C1234gw();
        if (!AbstractC0709Rg.f10942z.f16455b) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
        this.f12107a = k9;
        this.f12108b = webView;
        C2203yw c2203yw = this.f12109c;
        if ((c2203yw == null ? null : (View) c2203yw.get()) != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((Rv) it.next()).b(webView);
            }
            this.f12109c = new C2203yw(webView);
        }
        if (!AbstractC0241a.k("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        WebView webView2 = this.f12108b;
        int i = T0.f.f3557a;
        if (!U0.m.f3682d.b()) {
            throw U0.m.a();
        }
        ((WebViewProviderBoundaryInterface) T0.f.c(webView2).f73b).removeWebMessageListener("omidJsSessionService");
        T0.f.a(this.f12108b, "omidJsSessionService", new HashSet(Arrays.asList("*")), new Wu(1, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str) {
        Sv sv = Sv.DEFINED_BY_JAVASCRIPT;
        Uv uv = Uv.DEFINED_BY_JAVASCRIPT;
        Wv wv = Wv.JAVASCRIPT;
        int i = 0;
        Rv rv = new Rv(Ww.a(sv, uv, wv, wv, false), new C0969c3(this.f12107a, this.f12108b, null, null, Qv.HTML), str);
        this.f12110d.put(str, rv);
        C2203yw c2203yw = this.f12109c;
        rv.b(c2203yw == null ? null : (View) c2203yw.get());
        ArrayList arrayList = this.f12111e.f14399a;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C1180fw c1180fw = (C1180fw) obj;
            View view = (View) c1180fw.f14175a.get();
            Tv tv = c1180fw.f14177c;
            if (!rv.f11083f) {
                rv.f11079b.a(view, tv);
            }
        }
        rv.a();
    }
}
