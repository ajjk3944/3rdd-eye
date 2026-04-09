package com.applovin.impl.adview;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.applovin.impl.f2;
import com.applovin.impl.j0;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.o7;
import com.applovin.impl.o8;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t4;
import com.applovin.impl.t8;
import com.applovin.impl.w7;
import com.applovin.impl.x4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class b extends j0 {
    private static final Set j = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: k, reason: collision with root package name */
    private static final Object f3663k = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f3664c;

    /* renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f3665d;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f3666e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3667f;
    private boolean g;

    /* renamed from: h, reason: collision with root package name */
    private final List f3668h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f3669i;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends t4 {
        public a() {
        }

        @Override // com.applovin.impl.t4
        public Map a() {
            return CollectionUtils.hashMap("name", "AdWebView");
        }
    }

    public b(c cVar, com.applovin.impl.sdk.k kVar, Context context) {
        super(context);
        this.f3668h = new ArrayList();
        this.f3669i = new Object();
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f3665d = kVar;
        this.f3664c = kVar.O();
        Integer num = (Integer) kVar.a(x4.G6);
        if (num.intValue() > 0) {
            synchronized (f3663k) {
                Set set = j;
                set.add(this);
                n7.a("AdWebView", set.size(), num.intValue(), kVar.D());
            }
        }
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(cVar != null ? cVar : new a());
        setWebChromeClient(new com.applovin.impl.t(cVar != null ? cVar.d() : null, kVar));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (o0.i() && ((Boolean) kVar.a(x4.Z5)).booleanValue()) {
            setWebViewRenderProcessClient(new d(kVar).a());
        }
        setOnTouchListener(new t8(1));
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.r
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f3713a.a(view);
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
        this.f3667f = true;
        this.g = false;
        super.destroy();
    }

    public com.applovin.impl.sdk.ad.b getCurrentAd() {
        return this.f3666e;
    }

    public void setAdHtmlLoaded(boolean z3) {
        this.g = z3;
        if (z3 && ((Boolean) this.f3665d.a(x4.f6184y6)).booleanValue()) {
            b();
        }
    }

    private void b() {
        synchronized (this.f3669i) {
            try {
                Iterator it = this.f3668h.iterator();
                while (it.hasNext()) {
                    o8.a(this, (String) it.next(), "AdWebView", this.f3665d);
                }
                this.f3668h.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        if (!com.applovin.impl.sdk.o.a()) {
            return true;
        }
        this.f3664c.a("AdWebView", "Received a LongClick event.");
        return true;
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String string;
        if (!this.f3667f) {
            this.f3666e = bVar;
            try {
                applySettings(bVar);
                if (n7.a(bVar.getSize())) {
                    setVisibility(0);
                }
                bVar.a(SystemClock.elapsedRealtime());
                if (bVar instanceof com.applovin.impl.sdk.ad.a) {
                    loadDataWithBaseURL(bVar.k(), ((com.applovin.impl.sdk.ad.a) bVar).g1(), "text/html", null, "");
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f3664c.a("AdWebView", "AppLovinAd rendered");
                        return;
                    }
                    return;
                }
                if (bVar instanceof o7) {
                    o7 o7Var = (o7) bVar;
                    r7 r7VarG1 = o7Var.g1();
                    if (r7VarG1 != null) {
                        w7 w7VarE = r7VarG1.e();
                        Uri uriC = w7VarE.c();
                        if (uriC != null) {
                            string = uriC.toString();
                        } else {
                            string = "";
                        }
                        String strB = w7VarE.b();
                        String strI1 = o7Var.i1();
                        if (!StringUtils.isValidString(string) && !StringUtils.isValidString(strB)) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f3664c.b("AdWebView", "Unable to load companion ad. No resources provided.");
                                return;
                            }
                            return;
                        }
                        if (w7VarE.d() == w7.a.STATIC) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f3664c.a("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String strA = a((String) this.f3665d.a(x4.N4), string);
                            if (o7Var.x1() && o7Var.isOpenMeasurementEnabled() && o7Var.y1()) {
                                strA = this.f3665d.e0().a(strA, f2.a((AppLovinAdImpl) bVar));
                            }
                            loadDataWithBaseURL(bVar.k(), strA, "text/html", null, "");
                            return;
                        }
                        if (w7VarE.d() == w7.a.HTML) {
                            if (StringUtils.isValidString(strB)) {
                                String strA2 = a(strI1, strB);
                                String str = StringUtils.isValidString(strA2) ? strA2 : strB;
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f3664c.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str);
                                }
                                loadDataWithBaseURL(bVar.k(), str, "text/html", null, "");
                                return;
                            }
                            if (StringUtils.isValidString(string)) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f3664c.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                a(string, bVar.k(), strI1, this.f3665d, o7Var);
                                return;
                            }
                            return;
                        }
                        String str2 = string;
                        if (w7VarE.d() == w7.a.IFRAME) {
                            if (StringUtils.isValidString(str2)) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f3664c.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                a(str2, bVar.k(), strI1, this.f3665d, o7Var);
                                return;
                            } else {
                                if (StringUtils.isValidString(strB)) {
                                    String strA3 = a(strI1, strB);
                                    String str3 = StringUtils.isValidString(strA3) ? strA3 : strB;
                                    if (com.applovin.impl.sdk.o.a()) {
                                        this.f3664c.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str3);
                                    }
                                    loadDataWithBaseURL(bVar.k(), str3, "text/html", null, "");
                                    return;
                                }
                                return;
                            }
                        }
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f3664c.b("AdWebView", "Failed to render VAST companion ad of invalid type");
                            return;
                        }
                        return;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f3664c.a("AdWebView", "No companion ad provided.");
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th2) {
                throw new RuntimeException("Unable to render AppLovin ad (" + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null") + ") - " + th2);
            }
        }
        com.applovin.impl.sdk.o.h("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    public void a(String str) {
        if (((Boolean) this.f3665d.a(x4.f6184y6)).booleanValue()) {
            if (this.g) {
                o8.a(this, str, "AdWebView", this.f3665d);
                return;
            }
            synchronized (this.f3668h) {
                this.f3668h.add(str);
            }
            return;
        }
        o8.a(this, str, "AdWebView", this.f3665d);
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i10) {
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.k kVar, o7 o7Var) {
        String strA = a(str3, str);
        if (StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                a0.g.x("Rendering webview for VAST ad with resourceContents : ", strA, this.f3664c, "AdWebView");
            }
            loadDataWithBaseURL(str2, strA, "text/html", null, "");
            return;
        }
        String strA2 = a((String) kVar.a(x4.O4), str);
        if (StringUtils.isValidString(strA2)) {
            if (o7Var.x1() && o7Var.isOpenMeasurementEnabled()) {
                strA2 = kVar.e0().a(strA2, f2.a((AppLovinAdImpl) o7Var));
            }
            if (com.applovin.impl.sdk.o.a()) {
                a0.g.x("Rendering webview for VAST ad with resourceContents : ", strA2, this.f3664c, "AdWebView");
            }
            loadDataWithBaseURL(str2, strA2, "text/html", null, "");
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            a0.g.x("Rendering webview for VAST ad with resourceURL : ", str, this.f3664c, "AdWebView");
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
    public void onScrollChanged(int i4, int i10, int i11, int i12) {
    }
}
