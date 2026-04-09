package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p2.C2771a;
import q2.C2841s;
import q2.InterfaceC2806a;
import s2.InterfaceC2893c;
import t2.AbstractC2907C;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.oh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1649oh extends WebViewClient implements InterfaceC2806a, InterfaceC2084wl {

    /* renamed from: W, reason: collision with root package name */
    public static final /* synthetic */ int f15988W = 0;

    /* renamed from: C, reason: collision with root package name */
    public String f15989C;

    /* renamed from: D, reason: collision with root package name */
    public String f15990D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f15991E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f15992F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f15993G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f15994H;

    /* renamed from: I, reason: collision with root package name */
    public InterfaceC2893c f15995I;

    /* renamed from: J, reason: collision with root package name */
    public C0519Gd f15996J;

    /* renamed from: K, reason: collision with root package name */
    public C2771a f15997K;

    /* renamed from: L, reason: collision with root package name */
    public C0468Dd f15998L;
    public InterfaceC1054df M;

    /* renamed from: N, reason: collision with root package name */
    public C0784Vn f15999N;

    /* renamed from: O, reason: collision with root package name */
    public C0712Rj f16000O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f16001P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f16002Q;

    /* renamed from: R, reason: collision with root package name */
    public int f16003R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f16004S;

    /* renamed from: T, reason: collision with root package name */
    public final HashSet f16005T;

    /* renamed from: U, reason: collision with root package name */
    public final BinderC0718Rp f16006U;

    /* renamed from: V, reason: collision with root package name */
    public ViewOnAttachStateChangeListenerC0845Zg f16007V;

    /* renamed from: a, reason: collision with root package name */
    public final C1273hh f16008a;

    /* renamed from: b, reason: collision with root package name */
    public final A8 f16009b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f16010c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16011d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC2806a f16012e;

    /* renamed from: f, reason: collision with root package name */
    public s2.k f16013f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1864sh f16014g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1918th f16015h;
    public InterfaceC1912tb i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC1966ub f16016j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC2084wl f16017k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16018l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16019m;

    /* renamed from: n, reason: collision with root package name */
    public int f16020n;

    public C1649oh(C1273hh c1273hh, A8 a8, boolean z6, BinderC0718Rp binderC0718Rp) {
        C0519Gd c0519Gd = new C0519Gd(c1273hh, c1273hh.i0(), new C9(c1273hh.getContext()));
        this.f16010c = new HashMap();
        this.f16011d = new Object();
        this.f16020n = 0;
        this.f15989C = "";
        this.f15990D = "";
        this.f16009b = a8;
        this.f16008a = c1273hh;
        this.f15991E = z6;
        this.f15996J = c0519Gd;
        this.f15998L = null;
        this.f16005T = new HashSet(Arrays.asList(((String) C2841s.f23267e.f23270c.a(H9.x6)).split(",")));
        this.f16006U = binderC0718Rp;
    }

    public static final boolean A(boolean z6, C1273hh c1273hh) {
        return (!z6 || c1273hh.f14532a.d0().b() || c1273hh.f14532a.R().equals("interstitial_mb")) ? false : true;
    }

    public static WebResourceResponse w() {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8753h1)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public static final boolean z(C1273hh c1273hh) {
        Qt qt = c1273hh.f14532a.f15220j;
        return qt != null && qt.b();
    }

    public final void B(C2189yi c2189yi, C0633Mp c0633Mp, C2202yv c2202yv) {
        c("/click");
        if (c0633Mp != null && c2202yv != null) {
            b("/click", new C0799Wl(this.f16017k, c2189yi, c2202yv, c0633Mp));
            return;
        }
        InterfaceC2084wl interfaceC2084wl = this.f16017k;
        C2128xb c2128xb = AbstractC0449Cb.f7599a;
        b("/click", new C0415Ab(interfaceC2084wl, 0, c2189yi));
    }

    public final void D(C2189yi c2189yi, C0633Mp c0633Mp, C0784Vn c0784Vn) {
        c("/open");
        b("/open", new C0568Jb(this.f15997K, this.f15998L, c0633Mp, c0784Vn, c2189yi, null));
    }

    public final boolean E() {
        boolean z6;
        synchronized (this.f16011d) {
            z6 = this.f15991E;
        }
        return z6;
    }

    public final boolean F() {
        boolean z6;
        synchronized (this.f16011d) {
            z6 = this.f15992F;
        }
        return z6;
    }

    public final boolean H() {
        boolean z6;
        synchronized (this.f16011d) {
            z6 = this.f15993G;
        }
        return z6;
    }

    public final boolean I() {
        boolean z6;
        synchronized (this.f16011d) {
            z6 = this.f15994H;
        }
        return z6;
    }

    public final void K() {
        synchronized (this.f16011d) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2084wl
    public final void L() {
        InterfaceC2084wl interfaceC2084wl = this.f16017k;
        if (interfaceC2084wl != null) {
            interfaceC2084wl.L();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2084wl
    public final void M() {
        InterfaceC2084wl interfaceC2084wl = this.f16017k;
        if (interfaceC2084wl != null) {
            interfaceC2084wl.M();
        }
    }

    public final void N() {
        synchronized (this.f16011d) {
        }
    }

    public final void O() {
        InterfaceC1054df interfaceC1054df = this.M;
        if (interfaceC1054df != null) {
            C1273hh c1273hh = this.f16008a;
            ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh = c1273hh.f14532a;
            WeakHashMap weakHashMap = R.O.f3270a;
            if (viewTreeObserverOnGlobalLayoutListenerC1433kh.isAttachedToWindow()) {
                v(viewTreeObserverOnGlobalLayoutListenerC1433kh, interfaceC1054df, 10);
                return;
            }
            ViewOnAttachStateChangeListenerC0845Zg viewOnAttachStateChangeListenerC0845Zg = this.f16007V;
            if (viewOnAttachStateChangeListenerC0845Zg != null) {
                c1273hh.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0845Zg);
            }
            ViewOnAttachStateChangeListenerC0845Zg viewOnAttachStateChangeListenerC0845Zg2 = new ViewOnAttachStateChangeListenerC0845Zg(this, interfaceC1054df);
            this.f16007V = viewOnAttachStateChangeListenerC0845Zg2;
            c1273hh.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0845Zg2);
        }
    }

    public final void Q() {
        ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh;
        C0889ae c0889ae;
        InterfaceC1864sh interfaceC1864sh = this.f16014g;
        C1273hh c1273hh = this.f16008a;
        if (interfaceC1864sh != null && ((this.f16001P && this.f16003R <= 0) || this.f16002Q || this.f16019m)) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8792n2)).booleanValue() && (c0889ae = (viewTreeObserverOnGlobalLayoutListenerC1433kh = c1273hh.f14532a).f15208c0) != null) {
                AbstractC0933bL.g((L9) c0889ae.f13151c, viewTreeObserverOnGlobalLayoutListenerC1433kh.f15205a0, "awfllc");
            }
            InterfaceC1864sh interfaceC1864sh2 = this.f16014g;
            boolean z6 = false;
            if (!this.f16002Q && !this.f16019m) {
                z6 = true;
            }
            interfaceC1864sh2.l(this.f15989C, this.f16020n, this.f15990D, z6);
            this.f16014g = null;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh2 = c1273hh.f14532a;
        if (viewTreeObserverOnGlobalLayoutListenerC1433kh2.b0 == null) {
            C0889ae c0889ae2 = viewTreeObserverOnGlobalLayoutListenerC1433kh2.f15208c0;
            c0889ae2.getClass();
            J9 j9D = L9.d();
            viewTreeObserverOnGlobalLayoutListenerC1433kh2.b0 = j9D;
            ((HashMap) c0889ae2.f13150b).put("native:view_load", j9D);
        }
    }

    public final void S(s2.e eVar, boolean z6, boolean z7, String str) {
        boolean z8;
        C1273hh c1273hh = this.f16008a;
        boolean zF0 = c1273hh.f14532a.F0();
        boolean z9 = false;
        boolean z10 = A(zF0, c1273hh) || z7;
        if (z10 || !z6) {
            z8 = zF0;
            z9 = true;
        } else {
            z8 = zF0;
        }
        a(new AdOverlayInfoParcel(eVar, z10 ? null : this.f16012e, z8 ? null : this.f16013f, this.f15995I, c1273hh.f14532a.f15211e, c1273hh, z9 ? null : this.f16017k, str));
    }

    public final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        s2.e eVar;
        C0468Dd c0468Dd = this.f15998L;
        if (c0468Dd != null) {
            synchronized (c0468Dd.f7804l) {
                z = c0468Dd.f7794G != null;
            }
        }
        p1.e eVar2 = p2.j.f22785C.f22789b;
        p1.e.i(this.f16008a.getContext(), adOverlayInfoParcel, !z, this.f15999N);
        InterfaceC1054df interfaceC1054df = this.M;
        if (interfaceC1054df != null) {
            String str = adOverlayInfoParcel.f6873l;
            if (str == null && (eVar = adOverlayInfoParcel.f6863a) != null) {
                str = eVar.f23473b;
            }
            ((C0945bf) interfaceC1054df).a(str);
        }
    }

    public final void b(String str, InterfaceC0466Db interfaceC0466Db) {
        synchronized (this.f16011d) {
            try {
                HashMap map = this.f16010c;
                List copyOnWriteArrayList = (List) map.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    map.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(interfaceC0466Db);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str) {
        synchronized (this.f16011d) {
            try {
                List list = (List) this.f16010c.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        InterfaceC1054df interfaceC1054df = this.M;
        if (interfaceC1054df != null) {
            ((C0945bf) interfaceC1054df).c();
            this.M = null;
        }
        ViewOnAttachStateChangeListenerC0845Zg viewOnAttachStateChangeListenerC0845Zg = this.f16007V;
        if (viewOnAttachStateChangeListenerC0845Zg != null) {
            this.f16008a.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0845Zg);
        }
        synchronized (this.f16011d) {
            try {
                this.f16010c.clear();
                this.f16012e = null;
                this.f16013f = null;
                this.f16014g = null;
                this.f16015h = null;
                this.i = null;
                this.f16016j = null;
                this.f16018l = false;
                this.f15991E = false;
                this.f15992F = false;
                this.f15993G = false;
                this.f15995I = null;
                this.f15997K = null;
                this.f15996J = null;
                C0468Dd c0468Dd = this.f15998L;
                if (c0468Dd != null) {
                    c0468Dd.E(true);
                    this.f15998L = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02ea A[Catch: NoClassDefFoundError -> 0x001e, Exception -> 0x0021, TryCatch #14 {Exception -> 0x0021, NoClassDefFoundError -> 0x001e, blocks: (B:3:0x000c, B:5:0x001b, B:10:0x0024, B:12:0x0034, B:14:0x003b, B:16:0x0047, B:18:0x0065, B:20:0x007f, B:22:0x0096, B:23:0x0099, B:25:0x009c, B:28:0x00ba, B:31:0x00c2, B:33:0x00ce, B:35:0x00df, B:94:0x0226, B:83:0x01fa, B:106:0x02ea, B:109:0x02fc, B:111:0x0302, B:113:0x0310, B:95:0x025e, B:96:0x0297, B:82:0x01c4, B:52:0x0140, B:34:0x00d7, B:97:0x0298, B:99:0x02a2, B:101:0x02a8, B:103:0x02db), top: B:124:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0302 A[Catch: NoClassDefFoundError -> 0x001e, Exception -> 0x0021, TryCatch #14 {Exception -> 0x0021, NoClassDefFoundError -> 0x001e, blocks: (B:3:0x000c, B:5:0x001b, B:10:0x0024, B:12:0x0034, B:14:0x003b, B:16:0x0047, B:18:0x0065, B:20:0x007f, B:22:0x0096, B:23:0x0099, B:25:0x009c, B:28:0x00ba, B:31:0x00c2, B:33:0x00ce, B:35:0x00df, B:94:0x0226, B:83:0x01fa, B:106:0x02ea, B:109:0x02fc, B:111:0x0302, B:113:0x0310, B:95:0x025e, B:96:0x0297, B:82:0x01c4, B:52:0x0140, B:34:0x00d7, B:97:0x0298, B:99:0x02a2, B:101:0x02a8, B:103:0x02db), top: B:124:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0218 A[Catch: all -> 0x0221, TryCatch #0 {all -> 0x0221, blocks: (B:87:0x0206, B:89:0x0218, B:93:0x0223), top: B:118:0x0206 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse e(java.lang.String r23, java.util.Map r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1649oh.e(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void f(Uri uri) {
        AbstractC2907C.m("Received GMSG: ".concat(String.valueOf(uri)));
        String path = uri.getPath();
        List list = (List) this.f16010c.get(path);
        if (path == null || list == null) {
            AbstractC2907C.m("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) C2841s.f23267e.f23270c.a(H9.w7)).booleanValue() || p2.j.f22785C.f22795h.a() == null) {
                return;
            }
            AbstractC0640Nf.f10005a.execute(new RunnableC1883t(24, (path == null || path.length() < 2) ? "null" : path.substring(1)));
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        E9 e9 = H9.w6;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue() && this.f16005T.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) c2841s.f23270c.a(H9.y6)).intValue()) {
                AbstractC2907C.m("Parsing gmsg query params on BG thread: ".concat(path));
                C2911G c2911g = p2.j.f22785C.f22790c;
                c2911g.getClass();
                TD tdZ = AbstractC1984ut.z(new A2.A(2, uri), c2911g.f23586k);
                tdZ.a(new CD(tdZ, 0, new C1431kf(this, list, path, uri, 8)), AbstractC0640Nf.f10010f);
                return;
            }
        }
        C2911G c2911g2 = p2.j.f22785C.f22790c;
        y(C2911G.p(uri), list, path);
    }

    @Override // q2.InterfaceC2806a
    public final void onAdClicked() {
        InterfaceC2806a interfaceC2806a = this.f16012e;
        if (interfaceC2806a != null) {
            interfaceC2806a.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        AbstractC2907C.m("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            f(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Toolbar toolbar;
        synchronized (this.f16011d) {
            try {
                C1273hh c1273hh = this.f16008a;
                if (c1273hh.f14532a.t0()) {
                    AbstractC2907C.m("Blank page loaded, 1...");
                    c1273hh.s();
                    return;
                }
                this.f16001P = true;
                InterfaceC1918th interfaceC1918th = this.f16015h;
                if (interfaceC1918th != null) {
                    interfaceC1918th.mo6a();
                    this.f16015h = null;
                }
                Q();
                C1273hh c1273hh2 = this.f16008a;
                if (c1273hh2.f14532a.x0() != null) {
                    if (!((Boolean) C2841s.f23267e.f23270c.a(H9.fd)).booleanValue() || (toolbar = c1273hh2.f14532a.x0().f23457J) == null) {
                        return;
                    }
                    toolbar.setSubtitle(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f16019m = true;
        this.f16020n = i;
        this.f15989C = str;
        this.f15990D = str2;
    }

    public final void p(boolean z6) {
        synchronized (this.f16011d) {
            this.f15994H = z6;
        }
    }

    public final void s(int i, int i3) {
        C0519Gd c0519Gd = this.f15996J;
        if (c0519Gd != null) {
            c0519Gd.E(i, i3);
        }
        C0468Dd c0468Dd = this.f15998L;
        if (c0468Dd != null) {
            synchronized (c0468Dd.f7804l) {
                c0468Dd.f7799f = i;
                c0468Dd.f7800g = i3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            String string = webResourceRequest.getUrl().toString();
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (!(webView instanceof InterfaceC0828Yg)) {
                u2.k.h("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return null;
            }
            InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) webView;
            InterfaceC1054df interfaceC1054df = this.M;
            if (interfaceC1054df != null) {
                ((C0945bf) interfaceC1054df).b(string, requestHeaders, 1);
            }
            if (!"mraid.js".equalsIgnoreCase(new File(string).getName())) {
                if (requestHeaders == null) {
                    requestHeaders = Collections.EMPTY_MAP;
                }
                return e(string, requestHeaders);
            }
            if (interfaceC0828Yg.l0() != null) {
                C1649oh c1649ohL0 = interfaceC0828Yg.l0();
                synchronized (c1649ohL0.f16011d) {
                    c1649ohL0.f16018l = false;
                    c1649ohL0.f15991E = true;
                    AbstractC0640Nf.f10010f.execute(new RunnableC1883t(23, c1649ohL0));
                }
            }
            if (interfaceC0828Yg.d0().b()) {
                str = (String) C2841s.f23267e.f23270c.a(H9.f8797o0);
            } else if (interfaceC0828Yg.F0()) {
                str = (String) C2841s.f23267e.f23270c.a(H9.f8790n0);
            } else {
                str = (String) C2841s.f23267e.f23270c.a(H9.f8783m0);
            }
            p2.j jVar = p2.j.f22785C;
            C2911G c2911g = jVar.f22790c;
            Context context = interfaceC0828Yg.getContext();
            String str2 = interfaceC0828Yg.r().f23784a;
            try {
                HashMap map = new HashMap();
                map.put("User-Agent", jVar.f22790c.F(context, str2));
                map.put("Cache-Control", "max-stale=3600");
                t2.s sVarA = new t2.u(context).a(0, str, map, null);
                String str3 = (String) sVarA.f10212a.get(60L, TimeUnit.SECONDS);
                if (str3 != null) {
                    return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes(StandardCharsets.UTF_8)));
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e6) {
                u2.k.i("Could not fetch MRAID JS.", e6);
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        AbstractC2907C.m("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriB = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriB.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriB.getHost())) {
            f(uriB);
            return true;
        }
        boolean z6 = this.f16018l;
        C1273hh c1273hh = this.f16008a;
        if (z6 && webView == c1273hh.f14532a) {
            String scheme = uriB.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                InterfaceC2806a interfaceC2806a = this.f16012e;
                if (interfaceC2806a != null) {
                    interfaceC2806a.onAdClicked();
                    InterfaceC1054df interfaceC1054df = this.M;
                    if (interfaceC1054df != null) {
                        ((C0945bf) interfaceC1054df).a(str);
                    }
                    this.f16012e = null;
                }
                InterfaceC2084wl interfaceC2084wl = this.f16017k;
                if (interfaceC2084wl != null) {
                    interfaceC2084wl.L();
                    this.f16017k = null;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh = c1273hh.f14532a;
        ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh2 = c1273hh.f14532a;
        if (viewTreeObserverOnGlobalLayoutListenerC1433kh.willNotDraw()) {
            u2.k.h("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            return true;
        }
        try {
            H6 h6 = viewTreeObserverOnGlobalLayoutListenerC1433kh2.f15206b;
            C1068du c1068du = viewTreeObserverOnGlobalLayoutListenerC1433kh2.f15207c;
            if (!((Boolean) C2841s.f23267e.f23270c.a(H9.jd)).booleanValue() || c1068du == null) {
                if (h6 != null && h6.a(uriB)) {
                    uriB = h6.b(uriB, c1273hh.getContext(), c1273hh, c1273hh.h());
                }
            } else if (h6 != null && h6.a(uriB)) {
                uriB = c1068du.a(uriB, c1273hh.getContext(), c1273hh, c1273hh.h());
            }
        } catch (I6 unused) {
            u2.k.h("Unable to append parameter to URL: ".concat(String.valueOf(str)));
        }
        C2771a c2771a = this.f15997K;
        if (c2771a == null || c2771a.a()) {
            S(new s2.e("android.intent.action.VIEW", uriB.toString(), null, null, null, null, null, null), true, false, viewTreeObserverOnGlobalLayoutListenerC1433kh2.o());
        } else {
            c2771a.b(str);
        }
        return true;
    }

    public final void u(InterfaceC2806a interfaceC2806a, InterfaceC1912tb interfaceC1912tb, s2.k kVar, InterfaceC1966ub interfaceC1966ub, InterfaceC2893c interfaceC2893c, boolean z6, C0500Fb c0500Fb, C2771a c2771a, Rx rx, InterfaceC1054df interfaceC1054df, C0633Mp c0633Mp, C2202yv c2202yv, C0784Vn c0784Vn, C0483Eb c0483Eb, InterfaceC2084wl interfaceC2084wl, C1858sb c1858sb, C1858sb c1858sb2, C0483Eb c0483Eb2, C2189yi c2189yi, C1280ho c1280ho, C0780Vj c0780Vj, C0712Rj c0712Rj) {
        Qt qt;
        C1273hh c1273hh = this.f16008a;
        C2771a c2771a2 = c2771a == null ? new C2771a(c1273hh.getContext(), interfaceC1054df) : c2771a;
        this.f15998L = new C0468Dd(c1273hh, rx);
        this.M = interfaceC1054df;
        E9 e9 = H9.f8811q1;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        if (((Boolean) g9.a(e9)).booleanValue()) {
            b("/adMetadata", new C1858sb(0, interfaceC1912tb));
        }
        if (interfaceC1966ub != null) {
            b("/appEvent", new C1858sb(1, interfaceC1966ub));
        }
        b("/backButton", AbstractC0449Cb.f7603e);
        b("/refresh", AbstractC0449Cb.f7604f);
        b("/canOpenApp", C2128xb.f17594b);
        b("/canOpenURLs", C2128xb.f17598f);
        b("/canOpenIntents", C2128xb.f17595c);
        b("/close", AbstractC0449Cb.f7599a);
        b("/customClose", AbstractC0449Cb.f7600b);
        b("/instrument", AbstractC0449Cb.i);
        b("/delayPageLoaded", AbstractC0449Cb.f7608k);
        b("/delayPageClosed", AbstractC0449Cb.f7609l);
        b("/getLocationInfo", AbstractC0449Cb.f7610m);
        b("/log", AbstractC0449Cb.f7601c);
        b("/mraid", new C0517Gb(c2771a2, this.f15998L, rx));
        C0519Gd c0519Gd = this.f15996J;
        if (c0519Gd != null) {
            b("/mraidLoaded", c0519Gd);
        }
        C2771a c2771a3 = c2771a2;
        b("/open", new C0568Jb(c2771a3, this.f15998L, c0633Mp, c0784Vn, c2189yi, c0780Vj));
        b("/precache", new C2128xb(26));
        b("/touch", C2128xb.f17597e);
        b("/video", AbstractC0449Cb.f7605g);
        b("/videoMeta", AbstractC0449Cb.f7606h);
        if (c0633Mp == null || c2202yv == null) {
            b("/click", new C0415Ab(interfaceC2084wl, 0, c2189yi));
            b("/httpTrack", C2128xb.f17596d);
        } else {
            b("/click", new C0799Wl(interfaceC2084wl, c2189yi, c2202yv, c0633Mp));
            b("/httpTrack", new C0415Ab(c2202yv, 6, c0633Mp));
        }
        C1593nf c1593nf = p2.j.f22785C.f22811y;
        Context context = c1273hh.getContext();
        ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh = c1273hh.f14532a;
        if (c1593nf.a(context)) {
            HashMap map = new HashMap();
            Qt qt2 = viewTreeObserverOnGlobalLayoutListenerC1433kh.f15220j;
            if (qt2 != null) {
                map = qt2.f10799w0;
            }
            b("/logScionEvent", new C0415Ab(c1273hh.getContext(), 1, map));
        }
        if (c0500Fb != null) {
            b("/setInterstitialProperties", new C1858sb(2, c0500Fb));
        }
        if (c0483Eb != null && ((Boolean) g92.a(H9.fa)).booleanValue()) {
            b("/inspectorNetworkExtras", c0483Eb);
        }
        if (((Boolean) g92.a(H9.ya)).booleanValue() && c1858sb != null) {
            b("/shareSheet", c1858sb);
        }
        if (((Boolean) g92.a(H9.G8)).booleanValue() && c1280ho != null) {
            b("/onDeviceStorageEvent", new C1858sb(3, c1280ho));
        }
        if (((Boolean) g92.a(H9.Da)).booleanValue() && c1858sb2 != null) {
            b("/inspectorOutOfContextTest", c1858sb2);
        }
        if (((Boolean) g92.a(H9.Ia)).booleanValue() && c0483Eb2 != null) {
            b("/inspectorStorage", c0483Eb2);
        }
        if (((Boolean) g92.a(H9.Kc)).booleanValue()) {
            b("/bindPlayStoreOverlay", AbstractC0449Cb.f7613p);
            b("/presentPlayStoreOverlay", AbstractC0449Cb.f7614q);
            b("/expandPlayStoreOverlay", AbstractC0449Cb.f7615r);
            b("/collapsePlayStoreOverlay", AbstractC0449Cb.f7616s);
            b("/closePlayStoreOverlay", AbstractC0449Cb.f7617t);
        }
        if (((Boolean) g92.a(H9.f8686V3)).booleanValue()) {
            b("/setPAIDPersonalizationEnabled", AbstractC0449Cb.f7619v);
            b("/resetPAID", AbstractC0449Cb.f7618u);
        }
        if (((Boolean) g92.a(H9.ed)).booleanValue() && (qt = viewTreeObserverOnGlobalLayoutListenerC1433kh.f15220j) != null && qt.f10790r0) {
            b("/writeToLocalStorage", AbstractC0449Cb.f7620w);
            b("/clearLocalStorageKeys", AbstractC0449Cb.f7621x);
        }
        this.f16012e = interfaceC2806a;
        this.f16013f = kVar;
        this.i = interfaceC1912tb;
        this.f16016j = interfaceC1966ub;
        this.f15995I = interfaceC2893c;
        this.f15997K = c2771a3;
        this.f16017k = interfaceC2084wl;
        this.f15999N = c0784Vn;
        this.f16000O = c0712Rj;
        this.f16018l = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(android.view.View r8, com.google.android.gms.internal.ads.InterfaceC1054df r9, int r10) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.bf r9 = (com.google.android.gms.internal.ads.C0945bf) r9
            com.google.android.gms.internal.ads.cf r0 = r9.f13404g
            boolean r0 = r0.f13590c
            if (r0 == 0) goto Lb6
            boolean r1 = r9.f13406j
            if (r1 != 0) goto Lb6
            if (r10 <= 0) goto Lb6
            if (r0 != 0) goto L12
            goto La0
        L12:
            if (r1 != 0) goto La0
            p2.j r0 = p2.j.f22785C
            t2.G r0 = r0.f22790c
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L1d
            goto L78
        L1d:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2f
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2f
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2f
            if (r3 == 0) goto L31
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2f
            goto L32
        L2f:
            r2 = move-exception
            goto L38
        L31:
            r3 = r1
        L32:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L36
            goto L3e
        L36:
            r2 = move-exception
            goto L39
        L38:
            r3 = r1
        L39:
            java.lang.String r4 = "Fail to capture the web view"
            u2.k.f(r4, r2)
        L3e:
            if (r3 != 0) goto L77
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L69
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L69
            if (r2 == 0) goto L6b
            if (r3 != 0) goto L4d
            goto L6b
        L4d:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L69
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L69
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L69
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L69
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L69
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L69
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L69
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L69
            r1 = r4
            goto L78
        L69:
            r2 = move-exception
            goto L71
        L6b:
            java.lang.String r2 = "Width or height of view is zero"
            u2.k.h(r2)     // Catch: java.lang.RuntimeException -> L69
            goto L78
        L71:
            java.lang.String r3 = "Fail to capture the webview"
            u2.k.f(r3, r2)
            goto L78
        L77:
            r1 = r3
        L78:
            if (r1 != 0) goto L80
            java.lang.String r0 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.AbstractC1114el.h(r0)
            goto La0
        L80:
            r9.f13406j = r0
            com.google.android.gms.internal.ads.CD r0 = new com.google.android.gms.internal.ads.CD
            r2 = 10
            r0.<init>(r9, r2, r1)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            if (r1 == r2) goto L9b
            r0.run()
            goto La0
        L9b:
            com.google.android.gms.internal.ads.Mf r1 = com.google.android.gms.internal.ads.AbstractC0640Nf.f10005a
            r1.execute(r0)
        La0:
            com.google.android.gms.internal.ads.cf r0 = r9.f13404g
            boolean r0 = r0.f13590c
            if (r0 == 0) goto Lb6
            boolean r0 = r9.f13406j
            if (r0 != 0) goto Lb6
            t2.D r0 = t2.C2911G.f23576l
            com.google.android.gms.internal.ads.zg r1 = new com.google.android.gms.internal.ads.zg
            r1.<init>(r7, r8, r9, r10)
            r8 = 100
            r0.postDelayed(r1, r8)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1649oh.v(android.view.View, com.google.android.gms.internal.ads.df, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0101, code lost:
    
        r0 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0109, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010d, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010f, code lost:
    
        r11 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0111, code lost:
    
        r11 = r0.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011c, code lost:
    
        r0 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0124, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0126, code lost:
    
        r12 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0128, code lost:
    
        r0 = r0.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012d, code lost:
    
        if (r0.length != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0130, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0132, code lost:
    
        if (r1 >= r0.length) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0140, code lost:
    
        if (r0[r1].trim().startsWith("charset") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0142, code lost:
    
        r2 = r0[r1].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014f, code lost:
    
        if (r2.length <= 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0151, code lost:
    
        r4 = r2[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0158, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015b, code lost:
    
        r0 = r7.getHeaderFields();
        r15 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0174, code lost:
    
        if (r0.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0176, code lost:
    
        r1 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0180, code lost:
    
        if (r1.getKey() == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0186, code lost:
    
        if (r1.getValue() == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0192, code lost:
    
        if (r1.getValue().isEmpty() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0194, code lost:
    
        r15.put(r1.getKey(), r1.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01aa, code lost:
    
        r0 = p2.j.f22785C.f22793f;
        r13 = r7.getResponseCode();
        r14 = r7.getResponseMessage();
        r16 = r7.getInputStream();
        r0.getClass();
        r10 = new android.webkit.WebResourceResponse(r11, r12, r13, r14, r15, r16);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse x(java.lang.String r18, java.util.Map r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1649oh.x(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void y(Map map, List list, String str) {
        if (AbstractC2907C.o()) {
            AbstractC2907C.m("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                AbstractC2907C.m(sb.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC0466Db) it.next()).e(this.f16008a, map);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return e(str, Collections.EMPTY_MAP);
    }
}
