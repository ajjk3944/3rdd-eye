package com.applovin.impl.adview;

import N7.C1154e9;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.applovin.impl.AbstractC2118f0;
import com.applovin.impl.AbstractC2128k0;
import com.applovin.impl.C2143s;
import com.applovin.impl.a2;
import com.applovin.impl.a7;
import com.applovin.impl.b7;
import com.applovin.impl.b8;
import com.applovin.impl.e7;
import com.applovin.impl.h4;
import com.applovin.impl.j7;
import com.applovin.impl.l4;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b extends AbstractC2118f0 {

    /* renamed from: j, reason: collision with root package name */
    private static final Set f19023j = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: k, reason: collision with root package name */
    private static final Object f19024k = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f19025c;

    /* renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f19026d;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f19027e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f19028f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19029g;

    /* renamed from: h, reason: collision with root package name */
    private final List f19030h;
    private final Object i;

    public class a extends h4 {
        public a() {
        }

        @Override // com.applovin.impl.h4
        public Map a() {
            return CollectionUtils.hashMap(AppMeasurementSdk.ConditionalUserProperty.NAME, "AdWebView");
        }
    }

    public b(c cVar, com.applovin.impl.sdk.k kVar, Context context) {
        super(context);
        this.f19030h = new ArrayList();
        this.i = new Object();
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f19026d = kVar;
        this.f19025c = kVar.O();
        Integer num = (Integer) kVar.a(l4.f19901c6);
        if (num.intValue() > 0) {
            synchronized (f19024k) {
                Set set = f19023j;
                set.add(this);
                a7.a("AdWebView", set.size(), num.intValue(), kVar.E());
            }
        }
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(cVar != null ? cVar : new a());
        setWebChromeClient(new C2143s(cVar != null ? cVar.d() : null, kVar));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (AbstractC2128k0.i() && ((Boolean) kVar.a(l4.f20064x5)).booleanValue()) {
            setWebViewRenderProcessClient(new d(kVar).a());
        }
        setOnTouchListener(new s());
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.t
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f19074b.a(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f19028f = true;
        this.f19029g = false;
        super.destroy();
    }

    public com.applovin.impl.sdk.ad.b getCurrentAd() {
        return this.f19027e;
    }

    public void setAdHtmlLoaded(boolean z10) {
        this.f19029g = z10;
        if (z10 && ((Boolean) this.f19026d.a(l4.f19845U5)).booleanValue()) {
            b();
        }
    }

    private void b() {
        synchronized (this.i) {
            try {
                Iterator it = this.f19030h.iterator();
                while (it.hasNext()) {
                    b8.a(this, (String) it.next(), "AdWebView", this.f19026d);
                }
                this.f19030h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        if (!com.applovin.impl.sdk.o.a()) {
            return true;
        }
        this.f19025c.a("AdWebView", "Received a LongClick event.");
        return true;
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String string;
        if (!this.f19028f) {
            this.f19027e = bVar;
            try {
                applySettings(bVar);
                if (a7.a(bVar.getSize())) {
                    setVisibility(0);
                }
                if (bVar instanceof com.applovin.impl.sdk.ad.a) {
                    loadDataWithBaseURL(bVar.k(), ((com.applovin.impl.sdk.ad.a) bVar).o1(), "text/html", null, "");
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f19025c.a("AdWebView", "AppLovinAd rendered");
                        return;
                    }
                    return;
                }
                if (bVar instanceof b7) {
                    b7 b7Var = (b7) bVar;
                    e7 e7VarO1 = b7Var.o1();
                    if (e7VarO1 != null) {
                        j7 j7VarE = e7VarO1.e();
                        Uri uriC = j7VarE.c();
                        if (uriC != null) {
                            string = uriC.toString();
                        } else {
                            string = "";
                        }
                        String strB = j7VarE.b();
                        String strQ1 = b7Var.q1();
                        if (!StringUtils.isValidString(string) && !StringUtils.isValidString(strB)) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f19025c.b("AdWebView", "Unable to load companion ad. No resources provided.");
                                return;
                            }
                            return;
                        }
                        if (j7VarE.d() == j7.a.STATIC) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f19025c.a("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String strA = a((String) this.f19026d.a(l4.f19991o4), string);
                            if (b7Var.F1() && b7Var.isOpenMeasurementEnabled() && b7Var.G1()) {
                                strA = this.f19026d.d0().a(strA, a2.a((AppLovinAdImpl) bVar));
                            }
                            loadDataWithBaseURL(bVar.k(), strA, "text/html", null, "");
                            return;
                        }
                        if (j7VarE.d() == j7.a.HTML) {
                            if (StringUtils.isValidString(strB)) {
                                String strA2 = a(strQ1, strB);
                                String str = StringUtils.isValidString(strA2) ? strA2 : strB;
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f19025c.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str);
                                }
                                loadDataWithBaseURL(bVar.k(), str, "text/html", null, "");
                                return;
                            }
                            if (StringUtils.isValidString(string)) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f19025c.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                a(string, bVar.k(), strQ1, this.f19026d, b7Var);
                                return;
                            }
                            return;
                        }
                        String str2 = string;
                        if (j7VarE.d() == j7.a.IFRAME) {
                            if (StringUtils.isValidString(str2)) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f19025c.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                a(str2, bVar.k(), strQ1, this.f19026d, b7Var);
                                return;
                            } else {
                                if (StringUtils.isValidString(strB)) {
                                    String strA3 = a(strQ1, strB);
                                    String str3 = StringUtils.isValidString(strA3) ? strA3 : strB;
                                    if (com.applovin.impl.sdk.o.a()) {
                                        this.f19025c.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str3);
                                    }
                                    loadDataWithBaseURL(bVar.k(), str3, "text/html", null, "");
                                    return;
                                }
                                return;
                            }
                        }
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f19025c.b("AdWebView", "Failed to render VAST companion ad of invalid type");
                            return;
                        }
                        return;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f19025c.a("AdWebView", "No companion ad provided.");
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                throw new RuntimeException("Unable to render AppLovin ad (" + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null") + ") - " + th);
            }
        }
        com.applovin.impl.sdk.o.h("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.view.View
    public void scrollTo(int i, int i10) {
    }

    public void a(String str) {
        if (((Boolean) this.f19026d.a(l4.f19845U5)).booleanValue()) {
            if (this.f19029g) {
                b8.a(this, str, "AdWebView", this.f19026d);
                return;
            }
            synchronized (this.f19030h) {
                this.f19030h.add(str);
            }
            return;
        }
        b8.a(this, str, "AdWebView", this.f19026d);
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.k kVar, b7 b7Var) {
        String strA = a(str3, str);
        if (StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                C1154e9.m("Rendering webview for VAST ad with resourceContents : ", strA, this.f19025c, "AdWebView");
            }
            loadDataWithBaseURL(str2, strA, "text/html", null, "");
            return;
        }
        String strA2 = a((String) kVar.a(l4.f19999p4), str);
        if (StringUtils.isValidString(strA2)) {
            if (b7Var.F1() && b7Var.isOpenMeasurementEnabled()) {
                strA2 = kVar.d0().a(strA2, a2.a((AppLovinAdImpl) b7Var));
            }
            if (com.applovin.impl.sdk.o.a()) {
                C1154e9.m("Rendering webview for VAST ad with resourceContents : ", strA2, this.f19025c, "AdWebView");
            }
            loadDataWithBaseURL(str2, strA2, "text/html", null, "");
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            C1154e9.m("Rendering webview for VAST ad with resourceURL : ", str, this.f19025c, "AdWebView");
        }
        loadUrl(str);
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i10, int i11, int i12) {
    }
}
