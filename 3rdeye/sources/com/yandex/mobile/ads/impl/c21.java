package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import c9.C2077A;
import com.google.android.gms.common.internal.ImagesContract;
import com.yandex.mobile.ads.impl.aq1;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.i21;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c21 implements ue1 {

    /* renamed from: a, reason: collision with root package name */
    private final sf1 f25501a;

    /* renamed from: b, reason: collision with root package name */
    private final w11 f25502b;

    /* renamed from: c, reason: collision with root package name */
    private final j21 f25503c;

    /* renamed from: d, reason: collision with root package name */
    private final lh2 f25504d;

    /* renamed from: e, reason: collision with root package name */
    private final j82 f25505e;

    /* renamed from: f, reason: collision with root package name */
    private final l70 f25506f;

    /* renamed from: g, reason: collision with root package name */
    private final du1 f25507g;

    /* renamed from: h, reason: collision with root package name */
    private final p21 f25508h;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private final n70<?> f25509j;

    /* renamed from: k, reason: collision with root package name */
    private final String f25510k;

    /* renamed from: l, reason: collision with root package name */
    private k21 f25511l;

    /* renamed from: m, reason: collision with root package name */
    private i11 f25512m;

    /* renamed from: n, reason: collision with root package name */
    private h11 f25513n;

    /* renamed from: o, reason: collision with root package name */
    private te1 f25514o;

    /* renamed from: p, reason: collision with root package name */
    private ie2 f25515p;

    /* renamed from: q, reason: collision with root package name */
    private gh2 f25516q;

    /* renamed from: r, reason: collision with root package name */
    private k70 f25517r;

    public /* synthetic */ c21(sf1 sf1Var) {
        this(sf1Var, new w11(sf1Var), new j21(), new lh2(), new j82(), new l70(), ew1.a.a().a(sf1Var.i()));
    }

    public final void c() {
        this.i = true;
        k21 k21Var = this.f25511l;
        if (k21Var != null) {
            k21Var.a();
        }
    }

    public final class a implements mg0 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.mg0
        public final void a(Context context, String url) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(url, "url");
            c21.this.f25501a.a(context, url);
        }

        @Override // com.yandex.mobile.ads.impl.mg0
        public final void a() {
            c21.this.f25501a.a();
        }

        @Override // com.yandex.mobile.ads.impl.mg0
        public final void a(int i) {
            c21.this.f25501a.a(i);
        }
    }

    private final void a(i21 i21Var, LinkedHashMap linkedHashMap) throws a21 {
        if (this.f25511l == null) {
            throw new a21("Invalid state to execute this command");
        }
        switch (i21Var.ordinal()) {
            case 0:
                ie2 ie2Var = this.f25515p;
                if (ie2Var != null) {
                    ie2Var.onVideoComplete();
                    return;
                }
                return;
            case 1:
                h11 h11Var = this.f25513n;
                if (h11Var != null) {
                    h11Var.e();
                    return;
                }
                return;
            case 2:
                h11 h11Var2 = this.f25513n;
                if (h11Var2 != null) {
                    h11Var2.b();
                    return;
                }
                return;
            case 3:
                if (gh2.f27745c == this.f25516q) {
                    gh2 gh2Var = gh2.f27747e;
                    this.f25516q = gh2Var;
                    this.f25502b.a(gh2Var);
                    te1 te1Var = this.f25514o;
                    if (te1Var != null) {
                        te1Var.c();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                a(linkedHashMap);
                return;
            case 5:
                i11 i11Var = this.f25512m;
                if (i11Var != null) {
                    i11Var.a();
                    return;
                }
                return;
            case 6:
                boolean z10 = Boolean.parseBoolean((String) linkedHashMap.get("shouldUseCustomClose"));
                te1 te1Var2 = this.f25514o;
                if (te1Var2 != null) {
                    te1Var2.a(z10);
                    return;
                }
                return;
            case 7:
            default:
                throw new a21("Unspecified MRAID Javascript command");
            case 8:
                du1 du1Var = this.f25507g;
                if (du1Var == null || !du1Var.S()) {
                    return;
                }
                this.f25501a.a();
                return;
        }
    }

    public final void b(String url) throws a21 {
        kotlin.jvm.internal.l.f(url, "url");
        this.f25505e.getClass();
        if (!j82.a(url)) {
            fp0.f(new Object[0]);
            this.f25502b.a(i21.f28448d, "Mraid command sent an invalid URL");
            return;
        }
        Uri uri = Uri.parse(url);
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if (!"mraid".equals(scheme) && !"mobileads".equals(scheme)) {
            a(C2077A.m(new b9.l(ImagesContract.URL, url)));
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str);
            kotlin.jvm.internal.l.c(str);
            linkedHashMap.put(str, queryParameter);
        }
        i21.f28447c.getClass();
        i21 i21VarA = i21.a.a(host);
        try {
            a(i21VarA, linkedHashMap);
        } catch (Exception e4) {
            String message = e4.getMessage();
            if (message == null) {
                message = "Unknown exception";
            }
            this.f25502b.a(i21VarA, message);
        }
        this.f25502b.a(i21VarA);
    }

    public c21(sf1 mraidWebView, w11 mraidBridge, j21 mraidJsControllerLoader, lh2 viewableChecker, j82 urlUtils, l70 exposureProvider, du1 du1Var) {
        kotlin.jvm.internal.l.f(mraidWebView, "mraidWebView");
        kotlin.jvm.internal.l.f(mraidBridge, "mraidBridge");
        kotlin.jvm.internal.l.f(mraidJsControllerLoader, "mraidJsControllerLoader");
        kotlin.jvm.internal.l.f(viewableChecker, "viewableChecker");
        kotlin.jvm.internal.l.f(urlUtils, "urlUtils");
        kotlin.jvm.internal.l.f(exposureProvider, "exposureProvider");
        this.f25501a = mraidWebView;
        this.f25502b = mraidBridge;
        this.f25503c = mraidJsControllerLoader;
        this.f25504d = viewableChecker;
        this.f25505e = urlUtils;
        this.f25506f = exposureProvider;
        this.f25507g = du1Var;
        p21 p21Var = new p21(new a());
        this.f25508h = p21Var;
        this.f25516q = gh2.f27746d;
        mraidWebView.setWebViewClient(p21Var);
        this.f25509j = new n70<>(mraidWebView, exposureProvider, this);
        this.f25510k = aa.a(this);
    }

    private final void a(Map<String, String> map) throws a21 {
        if (this.f25511l != null) {
            du1 du1Var = this.f25507g;
            if (du1Var == null || !du1Var.Y() || this.i) {
                String str = map.get(ImagesContract.URL);
                if (str != null && str.length() > 0) {
                    k21 k21Var = this.f25511l;
                    if (k21Var != null) {
                        k21Var.a(str);
                    }
                    int i = fp0.f27419b;
                    return;
                }
                throw new a21(C4215v0.a(new Object[]{str}, 1, "Mraid open command sent an invalid URL: %s", "format(...)"));
            }
        }
    }

    public final void b() {
        if (gh2.f27745c == this.f25516q) {
            gh2 gh2Var = gh2.f27747e;
            this.f25516q = gh2Var;
            this.f25502b.a(gh2Var);
        }
    }

    public final void a() {
        this.f25509j.b();
        j21 j21Var = this.f25503c;
        Context context = this.f25501a.getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        String requestTag = this.f25510k;
        j21Var.getClass();
        kotlin.jvm.internal.l.f(requestTag, "requestTag");
        aq1.a.a();
        aq1.a(context, requestTag);
        this.f25511l = null;
        this.f25512m = null;
        this.f25513n = null;
        this.f25514o = null;
        this.f25515p = null;
    }

    public final void a(String htmlResponse) {
        kotlin.jvm.internal.l.f(htmlResponse, "htmlResponse");
        Context context = this.f25501a.getContext();
        j21 j21Var = this.f25503c;
        kotlin.jvm.internal.l.c(context);
        String str = this.f25510k;
        C.e0 e0Var = new C.e0(9, this, htmlResponse);
        j21Var.getClass();
        j21.a(context, str, e0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(c21 this$0, String htmlResponse, String mraidJavascript) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(htmlResponse, "$htmlResponse");
        kotlin.jvm.internal.l.f(mraidJavascript, "mraidJavascript");
        this$0.f25508h.a(mraidJavascript);
        this$0.f25502b.b(htmlResponse);
    }

    public final void a(sf1 webView, Map trackingParameters) {
        kotlin.jvm.internal.l.f(webView, "webView");
        kotlin.jvm.internal.l.f(trackingParameters, "trackingParameters");
        i32 i32Var = new i32(this.f25501a);
        lh2 lh2Var = this.f25504d;
        sf1 sf1Var = this.f25501a;
        lh2Var.getClass();
        ph2 ph2Var = new ph2(lh2.a(sf1Var));
        k70 k70VarA = this.f25506f.a(this.f25501a);
        m70 m70Var = new m70(k70VarA.a(), k70VarA.b());
        gh2 gh2Var = gh2.f27745c;
        this.f25516q = gh2Var;
        this.f25502b.a(gh2Var, ph2Var, m70Var, i32Var);
        this.f25502b.a();
        k21 k21Var = this.f25511l;
        if (k21Var != null) {
            k21Var.a(webView, trackingParameters);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ue1
    public final void a(k70 exposure) {
        kotlin.jvm.internal.l.f(exposure, "exposure");
        if (exposure.equals(this.f25517r)) {
            return;
        }
        this.f25517r = exposure;
        this.f25502b.a(new m70(exposure.a(), exposure.b()));
    }

    public final void a(boolean z10) {
        this.f25502b.a(new ph2(z10));
        if (z10) {
            this.f25509j.a();
            return;
        }
        this.f25509j.b();
        k70 k70VarA = this.f25506f.a(this.f25501a);
        if (kotlin.jvm.internal.l.b(k70VarA, this.f25517r)) {
            return;
        }
        this.f25517r = k70VarA;
        this.f25502b.a(new m70(k70VarA.a(), k70VarA.b()));
    }

    public final void a(h11 h11Var) {
        this.f25513n = h11Var;
    }

    public final void a(i11 i11Var) {
        this.f25512m = i11Var;
    }

    public final void a(k21 k21Var) {
        this.f25511l = k21Var;
    }

    public final void a(te1 te1Var) {
        this.f25514o = te1Var;
    }

    public final void a(ie2 ie2Var) {
        this.f25515p = ie2Var;
    }
}
