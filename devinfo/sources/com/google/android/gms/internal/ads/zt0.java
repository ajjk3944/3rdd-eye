package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zt0 {

    /* renamed from: a, reason: collision with root package name */
    public final u70 f19175a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f19176b;

    /* renamed from: c, reason: collision with root package name */
    public final c1.r f19177c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f19178d;

    /* renamed from: e, reason: collision with root package name */
    public final lu0 f19179e;

    /* JADX WARN: Multi-variable type inference failed */
    public zt0(u70 u70Var, WebView webView) {
        HashMap map = new HashMap();
        this.f19178d = map;
        this.f19179e = new lu0();
        if (!jz.f12903z.f15871b) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
        this.f19175a = u70Var;
        this.f19176b = webView;
        c1.r rVar = this.f19177c;
        if ((rVar == null ? null : (View) rVar.get()) != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((vt0) it.next()).b(webView);
            }
            this.f19177c = new c1.r(webView);
        }
        if (!ii.a.s("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        o6.f.f(this.f19176b, "omidJsSessionService");
        o6.f.a(this.f19176b, "omidJsSessionService", new HashSet(Arrays.asList("*")), new ne0(16, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str) {
        wt0 wt0Var = wt0.DEFINED_BY_JAVASCRIPT;
        yt0 yt0Var = yt0.DEFINED_BY_JAVASCRIPT;
        au0 au0Var = au0.JAVASCRIPT;
        int i4 = 0;
        vt0 vt0Var = new vt0(aw0.a(wt0Var, yt0Var, au0Var, au0Var, false), new b7(this.f19175a, this.f19176b, null, null, ut0.HTML), str);
        this.f19178d.put(str, vt0Var);
        c1.r rVar = this.f19177c;
        vt0Var.b(rVar == null ? null : (View) rVar.get());
        ArrayList arrayList = this.f19179e.f13632a;
        int size = arrayList.size();
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ku0 ku0Var = (ku0) obj;
            View view = (View) ku0Var.f13253a.get();
            xt0 xt0Var = ku0Var.f13255c;
            if (!vt0Var.f17704f) {
                vt0Var.f17700b.a(view, xt0Var);
            }
        }
        vt0Var.a();
    }
}
