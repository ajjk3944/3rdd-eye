package defpackage;

import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cc3 {
    public final of0 a;
    public final WebView b;
    public final dd3 c;
    public final HashMap d;
    public final mc3 e;

    /* JADX WARN: Multi-variable type inference failed */
    public cc3(of0 of0Var, WebView webView) {
        HashMap map = new HashMap();
        this.d = map;
        this.e = new mc3();
        if (!m54.f.g) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
        this.a = of0Var;
        this.b = webView;
        dd3 dd3Var = this.c;
        if ((dd3Var == null ? null : (View) dd3Var.get()) != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((xb3) it.next()).b(webView);
            }
            this.c = new dd3(webView);
        }
        if (!ob1.n("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        WebView webView2 = this.b;
        int i = c81.a;
        a5 a5Var = f81.c;
        if (!a5Var.b()) {
            throw f81.a();
        }
        ((WebViewProviderBoundaryInterface) c81.a(webView2).g).removeWebMessageListener("omidJsSessionService");
        ug0 ug0Var = new ug0(29, this);
        WebView webView3 = this.b;
        HashSet hashSet = new HashSet(Arrays.asList("*"));
        if (!a5Var.b()) {
            throw f81.a();
        }
        ((WebViewProviderBoundaryInterface) c81.a(webView3).g).addWebMessageListener("omidJsSessionService", (String[]) hashSet.toArray(new String[0]), new xb(new z71(0, ug0Var)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str) {
        yb3 yb3Var = yb3.g;
        bc3 bc3Var = bc3.g;
        dc3 dc3Var = dc3.h;
        int i = 0;
        xb3 xb3Var = new xb3(de3.b(yb3Var, bc3Var, dc3Var, dc3Var, false), new uk1(this.a, this.b, null, null, wb3.g), str);
        this.d.put(str, xb3Var);
        dd3 dd3Var = this.c;
        xb3Var.b(dd3Var == null ? null : (View) dd3Var.get());
        ArrayList arrayList = this.e.a;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            lc3 lc3Var = (lc3) obj;
            View view = (View) lc3Var.a.get();
            ac3 ac3Var = lc3Var.c;
            if (!xb3Var.f) {
                xb3Var.b.a(view, ac3Var);
            }
        }
        xb3Var.a();
    }
}
