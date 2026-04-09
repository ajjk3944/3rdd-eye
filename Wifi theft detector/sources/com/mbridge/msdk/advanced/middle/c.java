package com.mbridge.msdk.advanced.middle;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.advanced.view.MBOutNativeAdvancedViewGroup;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c {
    private static String G = "NativeAdvancedProvider";
    private boolean A;
    private boolean B;
    private boolean C;

    /* renamed from: a, reason: collision with root package name */
    private String f12804a;

    /* renamed from: b, reason: collision with root package name */
    private String f12805b;

    /* renamed from: c, reason: collision with root package name */
    private MBridgeIds f12806c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.advanced.manager.b f12807d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.advanced.manager.c f12808e;

    /* renamed from: f, reason: collision with root package name */
    private b f12809f;

    /* renamed from: g, reason: collision with root package name */
    private NativeAdvancedAdListener f12810g;

    /* renamed from: h, reason: collision with root package name */
    private d f12811h;

    /* renamed from: i, reason: collision with root package name */
    private MBNativeAdvancedView f12812i;

    /* renamed from: j, reason: collision with root package name */
    private MBNativeAdvancedWebview f12813j;

    /* renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.advanced.view.a f12814k;

    /* renamed from: l, reason: collision with root package name */
    private l f12815l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12816m;

    /* renamed from: n, reason: collision with root package name */
    private j f12817n;

    /* renamed from: x, reason: collision with root package name */
    private JSONObject f12827x;

    /* renamed from: z, reason: collision with root package name */
    private MBOutNativeAdvancedViewGroup f12829z;

    /* renamed from: o, reason: collision with root package name */
    private int f12818o = -1;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12819p = false;

    /* renamed from: q, reason: collision with root package name */
    private int f12820q = 0;

    /* renamed from: r, reason: collision with root package name */
    private boolean f12821r = false;

    /* renamed from: s, reason: collision with root package name */
    private int f12822s = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f12823t = false;

    /* renamed from: u, reason: collision with root package name */
    private int f12824u = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f12825v = 0;

    /* renamed from: w, reason: collision with root package name */
    private Object f12826w = new Object();

    /* renamed from: y, reason: collision with root package name */
    private boolean f12828y = false;
    private boolean D = true;
    public boolean E = false;
    private ViewTreeObserver.OnScrollChangedListener F = new a();

    public class a implements ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: com.mbridge.msdk.advanced.middle.c$a$a, reason: collision with other inner class name */
        public class RunnableC0236a implements Runnable {
            public RunnableC0236a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.D = true;
            }
        }

        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (c.this.D) {
                c.this.D = false;
                if (c.this.f12829z != null) {
                    c.this.f12829z.postDelayed(new RunnableC0236a(), 1000L);
                }
                try {
                    c.this.i();
                } catch (Exception e10) {
                    q0.b(c.G, e10.getMessage());
                }
            }
        }
    }

    public c(String str, String str2, Activity activity) {
        this.f12805b = TextUtils.isEmpty(str) ? "" : str;
        this.f12804a = str2;
        this.f12806c = new MBridgeIds(str, str2);
        a(activity);
    }

    private void e(int i10) {
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f12813j;
        if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
            return;
        }
        try {
            if (this.f12813j != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", i10);
                f.a().a((WebView) this.f12813j, "onNetstatChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th) {
            q0.a(G, th.getMessage());
        }
    }

    private void j() throws JSONException {
        a(this.f12818o);
        c(this.f12820q);
        g(this.f12822s);
        a(this.f12827x);
        e(m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
    }

    public MBOutNativeAdvancedViewGroup d() {
        return this.f12829z;
    }

    public int f() {
        return this.f12818o;
    }

    public boolean g() {
        return this.f12816m;
    }

    public void h(int i10) throws JSONException {
        this.f12823t = true;
        g(i10);
    }

    public void i(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    if (this.C) {
                        return;
                    } else {
                        this.C = true;
                    }
                }
            } else if (this.B) {
                return;
            } else {
                this.B = true;
            }
        } else if (this.A) {
            return;
        } else {
            this.A = true;
        }
        try {
            i();
        } catch (Exception e10) {
            q0.b(G, e10.getMessage());
        }
    }

    private void g(int i10) throws JSONException {
        if (this.f12823t) {
            this.f12822s = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f12813j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f12813j, "setVideoPlayMode", "autoPlay", Integer.valueOf(i10));
        }
    }

    public void b(JSONObject jSONObject) throws JSONException {
        this.f12828y = true;
        a(jSONObject);
    }

    public void c(String str) throws Throwable {
        b bVar = new b(this, this.f12806c);
        this.f12809f = bVar;
        bVar.a(this.f12810g);
        this.f12809f.a(str);
        a(str, 2);
    }

    public void d(String str) throws Throwable {
        if (!TextUtils.isEmpty(str)) {
            c(str);
            return;
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f12810g;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLoadFailed(this.f12806c, "bid  token is null or empty");
        }
    }

    public void f(int i10) {
        if (i10 == 1) {
            this.A = false;
        } else if (i10 == 2) {
            this.B = false;
        } else if (i10 == 3) {
            this.C = false;
        }
        h();
    }

    private void h() {
        com.mbridge.msdk.advanced.manager.c cVar = this.f12808e;
        if (cVar != null) {
            cVar.e();
        }
    }

    public void a(boolean z10) {
        this.f12816m = z10;
    }

    public boolean b(String str) {
        return (this.f12829z == null || com.mbridge.msdk.advanced.manager.d.a(this.f12812i, this.f12805b, this.f12804a, str, this.f12818o, false, true) == null) ? false : true;
    }

    private void a(JSONObject jSONObject) throws JSONException {
        if (this.f12828y) {
            this.f12827x = jSONObject;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f12813j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f12813j, "setStyleList", "", jSONObject);
        }
    }

    public void b(int i10) throws JSONException {
        this.f12819p = true;
        a(i10);
    }

    private void c(int i10) throws JSONException {
        if (this.f12821r) {
            this.f12820q = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f12813j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f12813j, "setVolume", CampaignEx.JSON_NATIVE_VIDEO_MUTE, Integer.valueOf(i10));
        }
    }

    public void d(int i10) throws JSONException {
        this.f12821r = true;
        c(i10);
    }

    public void b(int i10, int i11) {
        a(i10, i11);
    }

    public String e() {
        if (this.E) {
            com.mbridge.msdk.advanced.manager.c cVar = this.f12808e;
            if (cVar != null) {
                return cVar.c();
            }
            return "";
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f12807d;
        if (bVar != null) {
            return bVar.d();
        }
        return "";
    }

    public void b(CampaignEx campaignEx) throws JSONException {
        if (campaignEx != null) {
            if (this.f12815l == null) {
                this.f12815l = h.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f12804a);
            }
            this.f12811h = new d(this, this.f12810g, campaignEx);
            q0.a(G, "show start");
            if (this.f12824u != 0 && this.f12825v != 0) {
                a(campaignEx, false);
                return;
            }
            d dVar = this.f12811h;
            if (dVar != null) {
                dVar.a(this.f12806c, "width or height is 0  or width or height is too small");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() throws JSONException {
        if (this.A && this.B && this.C) {
            CampaignEx campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f12812i, this.f12805b, this.f12804a, "", this.f12818o, true, true);
            com.mbridge.msdk.advanced.manager.c cVar = this.f12808e;
            if (cVar != null) {
                cVar.f();
            }
            b(campaignExA);
        }
    }

    public void a(NativeAdvancedAdListener nativeAdvancedAdListener) {
        this.f12810g = nativeAdvancedAdListener;
    }

    private void a(int i10) throws JSONException {
        if (this.f12819p) {
            this.f12818o = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f12813j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            int i11 = this.f12818o;
            if (i11 == 1) {
                this.f12808e.a(true);
                com.mbridge.msdk.advanced.signal.a.a(this.f12813j, "showCloseButton", "", null);
            } else if (i11 == 0) {
                this.f12808e.a(false);
                com.mbridge.msdk.advanced.signal.a.a(this.f12813j, "hideCloseButton", "", null);
            }
        }
    }

    public String c() {
        if (this.E) {
            com.mbridge.msdk.advanced.manager.c cVar = this.f12808e;
            if (cVar != null) {
                return cVar.a();
            }
            return "";
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f12807d;
        if (bVar != null) {
            return bVar.c();
        }
        return "";
    }

    public void b() {
        if (this.f12810g != null) {
            this.f12810g = null;
        }
        if (this.f12809f != null) {
            this.f12809f = null;
        }
        if (this.f12811h != null) {
            this.f12811h = null;
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f12807d;
        if (bVar != null) {
            bVar.a((MBNativeAdvancedView) null);
            this.f12807d.e();
        }
        com.mbridge.msdk.advanced.manager.c cVar = this.f12808e;
        if (cVar != null) {
            cVar.g();
        }
        MBNativeAdvancedView mBNativeAdvancedView = this.f12812i;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.destroy();
        }
        com.mbridge.msdk.advanced.common.c.b(this.f12805b + this.f12804a + e());
        com.mbridge.msdk.advanced.view.a aVar = this.f12814k;
        if (aVar != null) {
            aVar.b();
        }
        MBOutNativeAdvancedViewGroup mBOutNativeAdvancedViewGroup = this.f12829z;
        if (mBOutNativeAdvancedViewGroup != null) {
            mBOutNativeAdvancedViewGroup.getViewTreeObserver().removeOnScrollChangedListener(this.F);
            this.f12829z.removeAllViews();
            this.f12829z = null;
        }
    }

    public void a(CampaignEx campaignEx, boolean z10) throws JSONException {
        j();
        MBOutNativeAdvancedViewGroup mBOutNativeAdvancedViewGroup = this.f12829z;
        if (mBOutNativeAdvancedViewGroup == null || mBOutNativeAdvancedViewGroup.getParent() == null) {
            return;
        }
        if (campaignEx != null && z10) {
            if (this.f12815l == null) {
                this.f12815l = h.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f12804a);
            }
            this.f12811h = new d(this, this.f12810g, campaignEx);
        }
        if (this.f12808e == null) {
            com.mbridge.msdk.advanced.manager.c cVar = new com.mbridge.msdk.advanced.manager.c(com.mbridge.msdk.foundation.controller.c.n().d(), this.f12805b, this.f12804a);
            this.f12808e = cVar;
            cVar.a(this);
        }
        a(campaignEx);
    }

    private void a(CampaignEx campaignEx) {
        if (com.mbridge.msdk.advanced.manager.d.a(this.f12812i, campaignEx, this.f12805b, this.f12804a)) {
            this.f12808e.a(this.f12811h);
            q0.b(G, "start show process");
            this.f12808e.a(campaignEx, this.f12812i, true);
        }
    }

    private void a(String str, int i10) throws Throwable {
        boolean zB;
        this.D = true;
        synchronized (this.f12826w) {
            try {
                if (this.f12816m) {
                    if (this.f12809f != null) {
                        this.f12809f.a(new com.mbridge.msdk.foundation.error.b(880016, "current unit is loading"), i10);
                        this.f12816m = true;
                    }
                    return;
                }
                this.f12816m = true;
                if (this.f12824u != 0 && this.f12825v != 0) {
                    if (this.f12812i == null) {
                        if (this.f12809f != null) {
                            this.f12809f.a(new com.mbridge.msdk.foundation.error.b(880030), i10);
                            return;
                        }
                        return;
                    }
                    try {
                        zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
                    } catch (Exception e10) {
                        q0.b(G, e10.getMessage());
                        zB = false;
                    }
                    if (!zB) {
                        if (this.f12809f != null) {
                            this.f12809f.a(new com.mbridge.msdk.foundation.error.b(880029), i10);
                            return;
                        }
                        return;
                    }
                    this.f12812i.clearResStateAndRemoveClose();
                    l lVarA = h.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f12804a);
                    this.f12815l = lVarA;
                    if (lVarA == null) {
                        this.f12815l = l.k(this.f12804a);
                    }
                    if (this.f12807d == null) {
                        this.f12807d = new com.mbridge.msdk.advanced.manager.b(this.f12805b, this.f12804a, 0L);
                    }
                    b bVar = this.f12809f;
                    if (bVar != null) {
                        bVar.a(str);
                        this.f12807d.a(this.f12809f);
                    }
                    this.f12812i.resetLoadState();
                    this.f12807d.a(this.f12812i);
                    this.f12807d.a(this.f12815l);
                    this.f12807d.a(this.f12824u, this.f12825v);
                    this.f12807d.a(this.f12818o);
                    this.f12807d.b(str, i10);
                    return;
                }
                if (this.f12809f != null) {
                    this.f12809f.a(new com.mbridge.msdk.foundation.error.b(880028), i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [android.content.Context] */
    private void a(Activity activity) {
        com.mbridge.msdk.advanced.view.a aVar;
        ViewGroup.LayoutParams layoutParams;
        if (this.f12808e == null) {
            com.mbridge.msdk.advanced.manager.c cVar = new com.mbridge.msdk.advanced.manager.c(com.mbridge.msdk.foundation.controller.c.n().d(), this.f12805b, this.f12804a);
            this.f12808e = cVar;
            cVar.a(this);
        }
        if (this.f12813j == null) {
            try {
                this.f12813j = new MBNativeAdvancedWebview(com.mbridge.msdk.foundation.controller.c.n().d());
            } catch (Exception e10) {
                q0.b(G, e10.getMessage());
            }
            if (this.f12814k == null) {
                try {
                    this.f12814k = new com.mbridge.msdk.advanced.view.a(this.f12804a, this.f12808e.b(), this);
                } catch (Exception e11) {
                    q0.b(G, e11.getMessage());
                }
            }
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f12813j;
            if (mBNativeAdvancedWebview != null && (aVar = this.f12814k) != null) {
                mBNativeAdvancedWebview.setWebViewClient(aVar);
            }
        }
        if (this.f12812i == null) {
            ?? D = com.mbridge.msdk.foundation.controller.c.n().d();
            if (activity == null) {
                activity = D;
            }
            MBNativeAdvancedView mBNativeAdvancedView = new MBNativeAdvancedView(activity);
            this.f12812i = mBNativeAdvancedView;
            mBNativeAdvancedView.setAdvancedNativeWebview(this.f12813j);
            MBNativeAdvancedWebview mBNativeAdvancedWebview2 = this.f12813j;
            if (mBNativeAdvancedWebview2 != null && mBNativeAdvancedWebview2.getParent() == null) {
                this.f12812i.addView(this.f12813j, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.f12829z == null) {
            this.f12829z = new MBOutNativeAdvancedViewGroup(com.mbridge.msdk.foundation.controller.c.n().d());
            if (this.f12824u != 0 && this.f12825v != 0) {
                layoutParams = new ViewGroup.LayoutParams(this.f12824u, this.f12825v);
            } else {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            this.f12829z.setLayoutParams(layoutParams);
            this.f12829z.setProvider(this);
            this.f12829z.addView(this.f12812i);
            this.f12829z.getViewTreeObserver().addOnScrollChangedListener(this.F);
        }
        if (this.f12817n == null) {
            this.f12817n = new j();
        }
        this.f12817n.a(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c(), this.f12804a);
    }

    public String a(String str) {
        com.mbridge.msdk.advanced.manager.b bVar = this.f12807d;
        if (bVar != null) {
            return bVar.a(str);
        }
        return "";
    }

    private void a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f12825v = i10;
        this.f12824u = i11;
        this.f12829z.setLayoutParams(new ViewGroup.LayoutParams(i11, i10));
    }
}
