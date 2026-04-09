package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.video.signal.a;

/* loaded from: classes3.dex */
public abstract class a implements com.mbridge.msdk.video.signal.d {

    /* renamed from: j, reason: collision with root package name */
    protected String f19548j;

    /* renamed from: k, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.setting.c f19549k;

    /* renamed from: l, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f19550l;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f19539a = false;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f19540b = false;

    /* renamed from: c, reason: collision with root package name */
    protected int f19541c = 0;

    /* renamed from: d, reason: collision with root package name */
    protected int f19542d = 0;

    /* renamed from: e, reason: collision with root package name */
    protected int f19543e = 0;

    /* renamed from: f, reason: collision with root package name */
    protected int f19544f = 0;

    /* renamed from: g, reason: collision with root package name */
    protected int f19545g = 0;

    /* renamed from: h, reason: collision with root package name */
    protected int f19546h = 1;

    /* renamed from: i, reason: collision with root package name */
    protected int f19547i = -1;

    /* renamed from: m, reason: collision with root package name */
    public a.InterfaceC0345a f19551m = new C0346a();

    /* renamed from: n, reason: collision with root package name */
    protected int f19552n = 2;

    /* renamed from: o, reason: collision with root package name */
    protected int f19553o = 2;

    /* renamed from: p, reason: collision with root package name */
    private o5.b f19554p = null;

    /* renamed from: q, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.adsession.media.a f19555q = null;

    /* renamed from: r, reason: collision with root package name */
    private o5.a f19556r = null;

    /* renamed from: com.mbridge.msdk.video.signal.impl.a$a, reason: collision with other inner class name */
    public static class C0346a implements a.InterfaceC0345a {
        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0345a
        public void a(boolean z10) {
            q0.a("DefaultJSCommon", "onStartInstall");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
            q0.a("DefaultJSCommon", "onDownloadProgress,progress:" + i10);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0345a
        public void onInitSuccess() {
            q0.a("DefaultJSCommon", "onInitSuccess");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            q0.a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            q0.a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0345a
        public void a(int i10, String str) {
            q0.a("DefaultJSCommon", "onH5Error,code:" + i10 + "，msg:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0345a
        public void a() {
            q0.a("DefaultJSCommon", "videoLocationReady");
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(boolean z10) {
        q0.a("DefaultJSCommon", "setIsShowingTransparent:" + z10);
        this.f19540b = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(int i10) {
        this.f19541c = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void c(int i10) {
        this.f19543e = i10;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i10, String str) {
        q0.a("DefaultJSCommon", "click:type" + i10 + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void d(int i10) {
        q0.a("DefaultJSCommon", "setAlertDialogRole " + i10);
        this.f19546h = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void e(int i10) {
        this.f19542d = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String f(int i10) {
        q0.a("DefaultJSCommon", "getSDKInfo");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void g(int i10) {
        this.f19552n = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void h() {
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i10, String str) {
        q0.a("DefaultJSCommon", "handlerH5Exception,code=" + i10 + ",msg:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int i() {
        return this.f19547i;
    }

    public o5.a j() {
        return this.f19556r;
    }

    public o5.b k() {
        return this.f19554p;
    }

    public int l() {
        if (this.f19541c == 0 && this.f19540b) {
            this.f19541c = 1;
        }
        return this.f19541c;
    }

    public int m() {
        if (this.f19542d == 0 && this.f19540b) {
            this.f19542d = 1;
        }
        return this.f19542d;
    }

    public int n() {
        if (this.f19543e == 0 && this.f19540b) {
            this.f19543e = 1;
        }
        return this.f19543e;
    }

    public com.iab.omid.library.mmadbridge.adsession.media.a o() {
        return this.f19555q;
    }

    public boolean p() {
        return this.f19540b;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void release() {
        q0.a("DefaultJSCommon", "release");
        com.mbridge.msdk.click.a aVar = this.f19550l;
        if (aVar != null) {
            aVar.a(false);
            this.f19550l.a((NativeListener.NativeTrackingListener) null);
            this.f19550l.c();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setActivity(Activity activity) {
        q0.a("DefaultJSCommon", "setActivity ");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdEvents(o5.a aVar) {
        this.f19556r = aVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdSession(o5.b bVar) {
        this.f19554p = bVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setRewardUnitSetting(com.mbridge.msdk.videocommon.setting.c cVar) {
        q0.a("DefaultJSCommon", "setSetting:" + cVar);
        this.f19549k = cVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setUnitId(String str) {
        q0.a("DefaultJSCommon", "setUnitId:" + str);
        this.f19548j = str;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setVideoEvents(com.iab.omid.library.mmadbridge.adsession.media.a aVar) {
        this.f19555q = aVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setWebViewFront(int i10) {
        this.f19545g = i10;
    }

    public static class b implements a.InterfaceC0345a {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.signal.d f19557a;

        /* renamed from: b, reason: collision with root package name */
        private a.InterfaceC0345a f19558b;

        public b(com.mbridge.msdk.video.signal.d dVar, a.InterfaceC0345a interfaceC0345a) {
            this.f19557a = dVar;
            this.f19558b = interfaceC0345a;
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0345a
        public void a(boolean z10) {
            a.InterfaceC0345a interfaceC0345a = this.f19558b;
            if (interfaceC0345a != null) {
                interfaceC0345a.a(z10);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            a.InterfaceC0345a interfaceC0345a = this.f19558b;
            if (interfaceC0345a != null) {
                interfaceC0345a.onDismissLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            a.InterfaceC0345a interfaceC0345a = this.f19558b;
            if (interfaceC0345a != null) {
                interfaceC0345a.onDownloadFinish(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
            a.InterfaceC0345a interfaceC0345a = this.f19558b;
            if (interfaceC0345a != null) {
                interfaceC0345a.onDownloadProgress(i10);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            a.InterfaceC0345a interfaceC0345a = this.f19558b;
            if (interfaceC0345a != null) {
                interfaceC0345a.onDownloadStart(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            a.InterfaceC0345a interfaceC0345a = this.f19558b;
            if (interfaceC0345a != null) {
                interfaceC0345a.onFinishRedirection(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f19557a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0345a
        public void onInitSuccess() {
            a.InterfaceC0345a interfaceC0345a = this.f19558b;
            if (interfaceC0345a != null) {
                interfaceC0345a.onInitSuccess();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            a.InterfaceC0345a interfaceC0345a = this.f19558b;
            return interfaceC0345a != null && interfaceC0345a.onInterceptDefaultLoadingDialog();
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            a.InterfaceC0345a interfaceC0345a = this.f19558b;
            if (interfaceC0345a != null) {
                interfaceC0345a.onRedirectionFailed(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f19557a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            a.InterfaceC0345a interfaceC0345a = this.f19558b;
            if (interfaceC0345a != null) {
                interfaceC0345a.onShowLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            a.InterfaceC0345a interfaceC0345a = this.f19558b;
            if (interfaceC0345a != null) {
                interfaceC0345a.onStartRedirection(campaign, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0345a
        public void a(int i10, String str) {
            a.InterfaceC0345a interfaceC0345a = this.f19558b;
            if (interfaceC0345a != null) {
                interfaceC0345a.a(i10, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0345a
        public void a() {
            a.InterfaceC0345a interfaceC0345a = this.f19558b;
            if (interfaceC0345a != null) {
                interfaceC0345a.a();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int b() {
        return this.f19545g;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String c() {
        q0.a("DefaultJSCommon", "init");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String e() {
        q0.a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String g() {
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public boolean a() {
        return this.f19539a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(boolean z10) {
        this.f19539a = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int d() {
        q0.a("DefaultJSCommon", "getAlertDialogRole " + this.f19546h);
        return this.f19546h;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void f() {
        q0.a("DefaultJSCommon", "finish");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(a.InterfaceC0345a interfaceC0345a) {
        q0.a("DefaultJSCommon", "setTrackingListener:" + interfaceC0345a);
        this.f19551m = interfaceC0345a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i10, String str) {
        q0.a("DefaultJSCommon", "statistics,type:" + i10 + ",json:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i10) {
        this.f19547i = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(String str) {
        q0.a("DefaultJSCommon", "setNotchArea");
    }
}
