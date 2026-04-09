package com.mbridge.msdk.splash.middle;

import android.R;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.ZoomOutTypeEnum;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.splash.manager.e;
import com.mbridge.msdk.splash.manager.f;
import com.mbridge.msdk.splash.view.BaseSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashView;

/* loaded from: classes3.dex */
public class c {
    private static String D = "SplashProvider";
    private CampaignEx A;
    private MBSplashPopView B;

    /* renamed from: a, reason: collision with root package name */
    private String f17240a;

    /* renamed from: b, reason: collision with root package name */
    private String f17241b;

    /* renamed from: c, reason: collision with root package name */
    private MBridgeIds f17242c;

    /* renamed from: e, reason: collision with root package name */
    private long f17244e;

    /* renamed from: f, reason: collision with root package name */
    private e f17245f;

    /* renamed from: g, reason: collision with root package name */
    private f f17246g;

    /* renamed from: h, reason: collision with root package name */
    private b f17247h;

    /* renamed from: i, reason: collision with root package name */
    private MBSplashShowListener f17248i;

    /* renamed from: j, reason: collision with root package name */
    private d f17249j;

    /* renamed from: k, reason: collision with root package name */
    private MBSplashView f17250k;

    /* renamed from: l, reason: collision with root package name */
    private ViewGroup f17251l;

    /* renamed from: m, reason: collision with root package name */
    private View f17252m;

    /* renamed from: n, reason: collision with root package name */
    private l f17253n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f17254o;

    /* renamed from: p, reason: collision with root package name */
    private ViewGroup f17255p;

    /* renamed from: q, reason: collision with root package name */
    private j f17256q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f17257r;

    /* renamed from: y, reason: collision with root package name */
    private Activity f17264y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f17265z;

    /* renamed from: d, reason: collision with root package name */
    private int f17243d = 5;

    /* renamed from: s, reason: collision with root package name */
    private int f17258s = 1;

    /* renamed from: t, reason: collision with root package name */
    private int f17259t = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());

    /* renamed from: u, reason: collision with root package name */
    private int f17260u = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());

    /* renamed from: v, reason: collision with root package name */
    private Object f17261v = new Object();

    /* renamed from: w, reason: collision with root package name */
    private Object f17262w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public boolean f17263x = false;
    private boolean C = false;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f17266a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17267b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f17268c;

        public a(CampaignEx campaignEx, int i10, boolean z10) {
            this.f17266a = campaignEx;
            this.f17267b = i10;
            this.f17268c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(this.f17266a, this.f17267b - 1, this.f17268c);
        }
    }

    public c(Activity activity, String str, String str2) {
        this.f17241b = TextUtils.isEmpty(str) ? "" : str;
        this.f17240a = str2;
        this.f17242c = new MBridgeIds(str, str2);
        this.f17264y = activity;
        b(activity);
    }

    public void b(boolean z10) {
        this.f17254o = z10;
    }

    public void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        } else if (this.f17247h != null) {
            this.f17247h.a(new com.mbridge.msdk.foundation.error.b(880035), 1);
        }
    }

    public int d() {
        return this.f17243d;
    }

    public long e() {
        return this.f17244e;
    }

    public boolean f() {
        return this.f17257r;
    }

    public boolean g() {
        return this.f17254o;
    }

    public void h() {
        f fVar = this.f17246g;
        if (fVar != null) {
            fVar.f();
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView == null || !this.C) {
            return;
        }
        mBSplashPopView.pauseCountDown();
    }

    public void i() {
        f fVar = this.f17246g;
        if (fVar != null) {
            fVar.g();
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView == null || !this.C) {
            return;
        }
        mBSplashPopView.reStartCountDown();
    }

    public void j() {
        this.C = true;
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView != null) {
            mBSplashPopView.startCountDown();
        }
    }

    public void k() {
        this.C = false;
        MBSplashShowListener mBSplashShowListener = this.f17248i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onZoomOutPlayFinish(new MBridgeIds(this.f17241b, this.f17240a));
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView != null) {
            mBSplashPopView.release();
        }
    }

    public void a(ViewGroup viewGroup) {
        this.f17255p = viewGroup;
    }

    public void b(String str) {
        a(str, 1);
    }

    public void d(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA != null) {
            d(str, viewGroupA);
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.f17248i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.f17242c, "activity is except,please check it");
        }
    }

    public void a(int i10) {
        this.f17258s = i10;
    }

    public void b(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            if (this.f17247h != null) {
                this.f17247h.a(new com.mbridge.msdk.foundation.error.b(880036), 1);
                return;
            }
            return;
        }
        b(str, viewGroupA);
    }

    public void a(long j10) {
        this.f17244e = j10;
    }

    public void a(MBSplashLoadListener mBSplashLoadListener) {
        if (this.f17247h == null) {
            this.f17247h = new b(this, this.f17242c);
        }
        this.f17247h.a(mBSplashLoadListener);
    }

    public void c(boolean z10) {
        this.f17257r = z10;
    }

    public void d(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            MBSplashShowListener mBSplashShowListener = this.f17248i;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.f17242c, "token is null or empty");
                return;
            }
            return;
        }
        c(str, viewGroup);
    }

    public String c() {
        if (!this.f17263x) {
            e eVar = this.f17245f;
            if (eVar != null) {
                return eVar.d();
            }
            return "";
        }
        f fVar = this.f17246g;
        if (fVar != null) {
            return fVar.d();
        }
        return "";
    }

    public void a(MBSplashShowListener mBSplashShowListener) {
        this.f17248i = mBSplashShowListener;
    }

    public void b(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            if (this.f17247h != null) {
                this.f17247h.a(new com.mbridge.msdk.foundation.error.b(880035), 1);
                return;
            }
            return;
        }
        a(str, viewGroup);
    }

    public void a(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            if (this.f17247h != null) {
                this.f17247h.a(new com.mbridge.msdk.foundation.error.b(880036), 1);
                return;
            }
            return;
        }
        a(str, viewGroupA);
    }

    public void d(boolean z10) {
        this.f17265z = z10;
    }

    public void b(int i10) {
        this.f17243d = i10;
    }

    public void c(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            MBSplashShowListener mBSplashShowListener = this.f17248i;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.f17242c, "activity is except,please check it");
                return;
            }
            return;
        }
        c(str, viewGroupA);
    }

    public void a(String str, ViewGroup viewGroup) {
        this.f17251l = viewGroup;
        MBSplashView mBSplashView = this.f17250k;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        a(str, 2);
    }

    public void b(int i10, int i11) {
        a(i11, i10);
    }

    public String b() {
        if (!this.f17263x) {
            e eVar = this.f17245f;
            if (eVar != null) {
                return eVar.c();
            }
            return "";
        }
        f fVar = this.f17246g;
        if (fVar != null) {
            return fVar.c();
        }
        return "";
    }

    public void c(String str, ViewGroup viewGroup) {
        this.f17251l = viewGroup;
        MBSplashView mBSplashView = this.f17250k;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f17250k, this.f17241b, this.f17240a, str, this.f17257r, this.f17243d, true, false);
        if (campaignExA != null) {
            if (this.f17253n == null) {
                this.f17253n = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f17240a);
            }
            d dVar = new d(this, this.f17248i, campaignExA);
            this.f17249j = dVar;
            if (this.f17259t != 0 && this.f17260u != 0) {
                int i10 = this.f17243d;
                if (i10 >= 2 && i10 <= 10) {
                    b(campaignExA, this.f17253n.E(), false);
                    return;
                }
                dVar.a(this.f17242c, "countDownTime must in 2 - 10 ,but now is " + this.f17243d);
                return;
            }
            dVar.a(this.f17242c, "width or height is 0  or width or height is too small");
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.f17248i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.f17242c, "campaignEx is vali");
        }
    }

    public boolean a(String str) {
        return com.mbridge.msdk.splash.manager.d.a(this.f17250k, this.f17241b, this.f17240a, str, this.f17257r, this.f17243d, false, true) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, int i10, boolean z10) {
        if (!com.mbridge.msdk.splash.manager.d.a(this.f17250k, campaignEx)) {
            if (i10 > 0) {
                this.f17246g.f17141y.postDelayed(new a(campaignEx, i10, z10), 1L);
                return;
            }
            d dVar = this.f17249j;
            if (dVar != null) {
                dVar.a(this.f17242c, "campaignEx is not ready");
                return;
            }
            return;
        }
        a(true);
        ViewGroup.LayoutParams layoutParams = this.f17251l.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
        this.f17251l.setLayoutParams(layoutParams);
        this.f17251l.removeAllViews();
        this.f17246g.c(this.f17243d);
        this.f17246g.a(this.f17255p);
        this.f17246g.a(this.f17249j);
        q0.b(D, "start show process");
        ViewGroup viewGroup = this.f17251l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            f1.a(this.f17250k);
            this.f17251l.addView(this.f17250k);
        }
        this.f17246g.a(this.f17257r);
        this.f17246g.a(campaignEx, this.f17250k);
    }

    public void b(CampaignEx campaignEx, int i10, boolean z10) {
        if (campaignEx != null && z10) {
            if (this.f17253n == null) {
                this.f17253n = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f17240a);
            }
            this.f17249j = new d(this, this.f17248i, campaignEx);
        }
        ViewGroup viewGroup = this.f17251l;
        if (viewGroup == null) {
            d dVar = this.f17249j;
            if (dVar != null) {
                dVar.a(this.f17242c, "container is null");
                return;
            }
            return;
        }
        if (this.f17246g == null) {
            this.f17246g = new f(viewGroup.getContext(), this.f17241b, this.f17240a);
        }
        this.A = campaignEx;
        a(campaignEx, i10, z10);
    }

    private void b(Activity activity) {
        if (this.f17246g == null) {
            if (activity != null) {
                this.f17246g = new f(activity, this.f17241b, this.f17240a);
            } else {
                this.f17246g = new f(com.mbridge.msdk.foundation.controller.c.n().d(), this.f17241b, this.f17240a);
            }
        }
        if (this.f17250k == null) {
            if (activity != null) {
                this.f17250k = new MBSplashView(activity);
            } else {
                this.f17250k = new MBSplashView(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        }
        if (this.f17256q == null) {
            this.f17256q = new j();
        }
        this.f17256q.a(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c(), this.f17240a);
    }

    private void a(String str, int i10) {
        boolean zB;
        synchronized (this.f17261v) {
            try {
                if (this.f17254o) {
                    if (this.f17247h != null) {
                        this.f17247h.a(new com.mbridge.msdk.foundation.error.b(880016, "current unit is loading"), i10);
                        this.f17254o = true;
                    }
                    return;
                }
                this.f17254o = true;
                int i11 = this.f17243d;
                if (i11 >= 2 && i11 <= 10) {
                    if (this.f17259t != 0 && this.f17260u != 0) {
                        try {
                            zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
                        } catch (Exception unused) {
                            zB = false;
                        }
                        if (!zB) {
                            if (this.f17247h != null) {
                                this.f17247h.a(new com.mbridge.msdk.foundation.error.b(880029), i10);
                                return;
                            }
                            return;
                        }
                        this.f17250k.clearResState();
                        this.f17253n = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f17240a);
                        if (this.f17245f == null) {
                            this.f17245f = new e(this.f17241b, this.f17240a, this.f17244e * 1000);
                        }
                        b bVar = this.f17247h;
                        if (bVar != null) {
                            bVar.a(str);
                            this.f17245f.a(this.f17247h);
                        }
                        this.f17250k.resetLoadState();
                        this.f17245f.a(this.f17243d);
                        this.f17245f.a(this.f17250k);
                        this.f17245f.a(this.f17253n);
                        this.f17245f.a(this.f17259t, this.f17260u);
                        this.f17245f.a(this.f17257r);
                        this.f17245f.b(this.f17258s);
                        this.f17245f.a(str, i10);
                        return;
                    }
                    if (this.f17247h != null) {
                        this.f17247h.a(new com.mbridge.msdk.foundation.error.b(880028), i10);
                        return;
                    }
                    return;
                }
                if (this.f17247h != null) {
                    com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880037);
                    bVar2.c("countDownTime must in 2 - 10");
                    this.f17247h.a(bVar2, i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f17252m = view;
        if (view != null) {
            a(layoutParams.width, layoutParams.height);
            MBSplashView mBSplashView = this.f17250k;
            if (mBSplashView != null) {
                mBSplashView.setIconVg(view, layoutParams);
            }
        }
    }

    public ViewGroup a(ZoomOutTypeEnum zoomOutTypeEnum) {
        MBSplashPopView mBSplashPopView = new MBSplashPopView(com.mbridge.msdk.foundation.controller.c.n().d(), new BaseSplashPopView.i(this.f17241b, this.f17240a, zoomOutTypeEnum.getIndex(), this.A), this.f17249j);
        this.B = mBSplashPopView;
        return mBSplashPopView;
    }

    private void a(int i10, int i11) {
        int iN = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());
        int iM = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());
        int i12 = this.f17258s;
        if (i12 == 1) {
            if (iM >= i11 * 4) {
                this.f17260u = iM - i11;
                this.f17259t = iN;
                return;
            } else {
                this.f17260u = 0;
                this.f17259t = 0;
                return;
            }
        }
        if (i12 == 2) {
            if (iN >= i10 * 4) {
                this.f17259t = iN - i10;
                this.f17260u = iM;
            } else {
                this.f17260u = 0;
                this.f17259t = 0;
            }
        }
    }

    public void a(boolean z10) {
        MBSplashView mBSplashView = this.f17250k;
        if (mBSplashView != null) {
            mBSplashView.setAllowClickSplash(z10);
        }
    }

    private ViewGroup a(Activity activity) {
        Throwable th;
        ViewGroup viewGroup;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (activity == null) {
            q0.d(D, "splash can't show because, activity is null or activity is finishing");
            return null;
        }
        try {
            viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
        } catch (Throwable th2) {
            th = th2;
            viewGroup = null;
        }
        try {
            try {
                return (ViewGroup) viewGroup.getChildAt(0);
            } catch (Throwable th3) {
                th = th3;
                th.printStackTrace();
                return viewGroup;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return viewGroup;
        }
    }

    public void a(int i10, int i11, int i12, int i13) {
        try {
            MBSplashView mBSplashView = this.f17250k;
            if (mBSplashView != null) {
                mBSplashView.setNotchPadding(i10, i11, i12, i13);
            }
        } catch (Throwable th) {
            q0.b(D, th.getMessage());
        }
    }

    public void a() {
        this.A = null;
        if (this.f17248i != null) {
            this.f17248i = null;
        }
        if (this.f17247h != null) {
            this.f17247h = null;
        }
        if (this.f17249j != null) {
            this.f17249j = null;
        }
        e eVar = this.f17245f;
        if (eVar != null) {
            eVar.e();
        }
        f fVar = this.f17246g;
        if (fVar != null) {
            fVar.h();
        }
        if (this.f17264y != null) {
            this.f17264y = null;
        }
    }
}
