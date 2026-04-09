package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.tm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1923tm extends AbstractBinderC0686Qa implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceViewOnClickListenerC0528Gm {

    /* renamed from: D, reason: collision with root package name */
    public static final C1197gC f16962D;

    /* renamed from: C, reason: collision with root package name */
    public GestureDetector f16963C;

    /* renamed from: b, reason: collision with root package name */
    public final String f16964b;

    /* renamed from: d, reason: collision with root package name */
    public FrameLayout f16966d;

    /* renamed from: e, reason: collision with root package name */
    public FrameLayout f16967e;

    /* renamed from: f, reason: collision with root package name */
    public final C0623Mf f16968f;

    /* renamed from: g, reason: collision with root package name */
    public View f16969g;
    public C1278hm i;

    /* renamed from: j, reason: collision with root package name */
    public N7 f16971j;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0601La f16973l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16974m;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f16965c = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public S2.a f16972k = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16975n = false;

    /* renamed from: h, reason: collision with root package name */
    public final int f16970h = ModuleDescriptor.MODULE_VERSION;

    static {
        JB jb = LB.f9635b;
        Object[] objArr = {"2011", "1009", "3010"};
        AbstractC1984ut.k(3, objArr);
        f16962D = LB.o(3, objArr);
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1923tm(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2 = null;
        this.f16966d = frameLayout;
        this.f16967e = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f16964b = str;
        W9 w9 = p2.j.f22785C.f22787B;
        ViewTreeObserverOnGlobalLayoutListenerC0708Rf viewTreeObserverOnGlobalLayoutListenerC0708Rf = new ViewTreeObserverOnGlobalLayoutListenerC0708Rf(frameLayout, this);
        View view = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC0708Rf.f11985a).get();
        ViewTreeObserver viewTreeObserver3 = (view == null || (viewTreeObserver3 = view.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC0708Rf.H1(viewTreeObserver3);
        }
        ViewTreeObserverOnScrollChangedListenerC0725Sf viewTreeObserverOnScrollChangedListenerC0725Sf = new ViewTreeObserverOnScrollChangedListenerC0725Sf(frameLayout, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC0725Sf.f11985a).get();
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnScrollChangedListenerC0725Sf.H1(viewTreeObserver2);
        }
        this.f16968f = AbstractC0640Nf.f10010f;
        this.f16971j = new N7(this.f16966d.getContext(), this.f16966d);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0703Ra
    public final synchronized void B0(S2.a aVar, String str) {
        Y2((View) S2.b.n1(aVar), str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0703Ra
    public final synchronized void D(S2.a aVar) {
        this.i.D((View) S2.b.n1(aVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0703Ra
    public final synchronized void I3(S2.a aVar) {
        if (this.f16975n) {
            return;
        }
        this.f16972k = aVar;
    }

    public final synchronized void K3() {
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.Lc)).booleanValue() || this.i.d() == 0) {
            return;
        }
        this.f16963C = new GestureDetector(this.f16966d.getContext(), new GestureDetectorOnGestureListenerC2139xm(this.i, this));
    }

    public final synchronized void L3() {
        this.f16968f.execute(new RunnableC0558Ii(8, this));
    }

    public final synchronized void M3(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f16967e.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f16967e.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e6) {
                        u2.k.i("Encountered invalid base64 watermark.", e6);
                    }
                }
            }
            this.f16967e.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final /* synthetic */ View N1() {
        return this.f16966d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0703Ra
    public final synchronized S2.a O(String str) {
        return new S2.b(a2(str));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final synchronized void Y2(View view, String str) {
        if (!this.f16975n) {
            if (view == null) {
                this.f16965c.remove(str);
                return;
            }
            this.f16965c.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (a4.t.x(this.f16970h)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final synchronized View a2(String str) {
        WeakReference weakReference;
        if (!this.f16975n && (weakReference = (WeakReference) this.f16965c.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0703Ra
    public final synchronized void b() {
        try {
            if (this.f16975n) {
                return;
            }
            C1278hm c1278hm = this.i;
            if (c1278hm != null) {
                c1278hm.x(this);
                this.i = null;
            }
            this.f16965c.clear();
            this.f16966d.removeAllViews();
            this.f16967e.removeAllViews();
            this.f16965c = null;
            this.f16966d = null;
            this.f16967e = null;
            this.f16969g = null;
            this.f16971j = null;
            this.f16975n = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final N7 g() {
        return this.f16971j;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0703Ra
    public final synchronized void g2(S2.a aVar) {
        if (this.f16975n) {
            return;
        }
        Object objN1 = S2.b.n1(aVar);
        if (!(objN1 instanceof C1278hm)) {
            u2.k.h("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        C1278hm c1278hm = this.i;
        if (c1278hm != null) {
            c1278hm.x(this);
        }
        L3();
        C1278hm c1278hm2 = (C1278hm) objN1;
        this.i = c1278hm2;
        c1278hm2.w(this);
        this.i.h(this.f16966d);
        C1278hm c1278hm3 = this.i;
        FrameLayout frameLayout = this.f16967e;
        C0837Yp c0837YpW = c1278hm3.f14567m.w();
        if (c1278hm3.f14570p.c() && c0837YpW != null && frameLayout != null) {
            C1437kl c1437kl = p2.j.f22785C.f22810x;
            Rv rv = c0837YpW.f12708a;
            c1437kl.getClass();
            C1437kl.q(new RunnableC0769Up(rv, frameLayout, 0));
        }
        if (this.f16974m) {
            this.i.f14562F.b(this.f16973l);
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8580D4)).booleanValue() && !TextUtils.isEmpty(this.i.f14570p.e())) {
            M3(this.i.f14570p.e());
        }
        K3();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final synchronized Map h() {
        return this.f16965c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final synchronized Map i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final synchronized Map k() {
        return this.f16965c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final synchronized JSONObject l() {
        C1278hm c1278hm = this.i;
        if (c1278hm == null) {
            return null;
        }
        return c1278hm.C(this.f16966d, h(), k());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0703Ra
    public final synchronized void n0(S2.a aVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final synchronized String o() {
        return this.f16964b;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        C1278hm c1278hm = this.i;
        if (c1278hm == null || !c1278hm.e()) {
            return;
        }
        this.i.E();
        this.i.y(view, this.f16966d, h(), k(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        C1278hm c1278hm = this.i;
        if (c1278hm != null) {
            FrameLayout frameLayout = this.f16966d;
            c1278hm.A(frameLayout, h(), k(), C1278hm.f(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        C1278hm c1278hm = this.i;
        if (c1278hm != null) {
            FrameLayout frameLayout = this.f16966d;
            c1278hm.A(frameLayout, h(), k(), C1278hm.f(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        C1278hm c1278hm = this.i;
        if (c1278hm != null) {
            c1278hm.z(view, motionEvent, this.f16966d);
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.Lc)).booleanValue() && this.f16963C != null && this.i.d() != 0) {
                this.f16963C.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final S2.a p() {
        return this.f16972k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final synchronized JSONObject q() {
        C1278hm c1278hm = this.i;
        if (c1278hm == null) {
            return null;
        }
        return c1278hm.B(this.f16966d, h(), k());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final FrameLayout q3() {
        return this.f16967e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0703Ra
    public final void r2(S2.a aVar) {
        onTouch(this.f16966d, (MotionEvent) S2.b.n1(aVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0703Ra
    public final synchronized void w3(InterfaceC0601La interfaceC0601La) {
        if (!this.f16975n) {
            this.f16974m = true;
            this.f16973l = interfaceC0601La;
            C1278hm c1278hm = this.i;
            if (c1278hm != null) {
                c1278hm.f14562F.b(interfaceC0601La);
            }
        }
    }
}
