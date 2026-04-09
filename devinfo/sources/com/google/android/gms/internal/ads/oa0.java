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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class oa0 extends an implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, bb0 {

    /* renamed from: p, reason: collision with root package name */
    public static final u51 f14620p;

    /* renamed from: b, reason: collision with root package name */
    public final String f14621b;

    /* renamed from: d, reason: collision with root package name */
    public FrameLayout f14623d;

    /* renamed from: e, reason: collision with root package name */
    public FrameLayout f14624e;

    /* renamed from: f, reason: collision with root package name */
    public final ex f14625f;
    public View g;

    /* renamed from: i, reason: collision with root package name */
    public ca0 f14627i;
    public yg j;

    /* renamed from: l, reason: collision with root package name */
    public vm f14629l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14630m;

    /* renamed from: o, reason: collision with root package name */
    public GestureDetector f14632o;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f14622c = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public vb.a f14628k = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f14631n = false;

    /* renamed from: h, reason: collision with root package name */
    public final int f14626h = ModuleDescriptor.MODULE_VERSION;

    static {
        v41 v41Var = x41.f18307b;
        Object[] objArr = {"2011", "1009", "3010"};
        yo0.m(objArr, 3);
        f14620p = x41.s(objArr, 3);
    }

    public oa0(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2 = null;
        this.f14623d = frameLayout;
        this.f14624e = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f14621b = str;
        hl hlVar = ua.j.C.B;
        jx jxVar = new jx(frameLayout, this);
        View view = (View) ((WeakReference) jxVar.f11937a).get();
        ViewTreeObserver viewTreeObserver3 = (view == null || (viewTreeObserver3 = view.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            jxVar.v1(viewTreeObserver3);
        }
        kx kxVar = new kx(frameLayout, this);
        View view2 = (View) ((WeakReference) kxVar.f11937a).get();
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            kxVar.v1(viewTreeObserver2);
        }
        this.f14625f = fx.f11279f;
        this.j = new yg(this.f14623d.getContext(), this.f14623d);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final synchronized Map A1() {
        return this.f14622c;
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final synchronized Map B1() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final synchronized Map D1() {
        return this.f14622c;
    }

    @Override // com.google.android.gms.internal.ads.bn
    public final synchronized void D3(vb.a aVar) {
        if (this.f14631n) {
            return;
        }
        this.f14628k = aVar;
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final synchronized JSONObject E1() {
        ca0 ca0Var = this.f14627i;
        if (ca0Var == null) {
            return null;
        }
        return ca0Var.B(this.f14623d, A1(), D1());
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final synchronized String G1() {
        return this.f14621b;
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final vb.a H1() {
        return this.f14628k;
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final synchronized JSONObject I1() {
        ca0 ca0Var = this.f14627i;
        if (ca0Var == null) {
            return null;
        }
        return ca0Var.A(this.f14623d, A1(), D1());
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final synchronized View O(String str) {
        WeakReference weakReference;
        if (!this.f14631n && (weakReference = (WeakReference) this.f14622c.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final FrameLayout O3() {
        return this.f14624e;
    }

    @Override // com.google.android.gms.internal.ads.bn
    public final synchronized void U3(vm vmVar) {
        if (!this.f14631n) {
            this.f14630m = true;
            this.f14629l = vmVar;
            ca0 ca0Var = this.f14627i;
            if (ca0Var != null) {
                ca0Var.F.b(vmVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bn
    public final synchronized void Z2(String str, vb.a aVar) {
        u3((View) vb.b.U0(aVar), str);
    }

    @Override // com.google.android.gms.internal.ads.bn
    public final synchronized void b0(vb.a aVar, int i4) {
    }

    @Override // com.google.android.gms.internal.ads.bn
    public final void b4(vb.a aVar) {
        onTouch(this.f14623d, (MotionEvent) vb.b.U0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.bn
    public final synchronized void c() {
        try {
            if (this.f14631n) {
                return;
            }
            ca0 ca0Var = this.f14627i;
            if (ca0Var != null) {
                ca0Var.w(this);
                this.f14627i = null;
            }
            this.f14622c.clear();
            this.f14623d.removeAllViews();
            this.f14624e.removeAllViews();
            this.f14622c = null;
            this.f14623d = null;
            this.f14624e = null;
            this.g = null;
            this.j = null;
            this.f14631n = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final /* synthetic */ View f2() {
        return this.f14623d;
    }

    public final synchronized void h4() {
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.Nc)).booleanValue() || this.f14627i.d() == 0) {
            return;
        }
        this.f14632o = new GestureDetector(this.f14623d.getContext(), new sa0(this.f14627i, this));
    }

    public final synchronized void i4() {
        this.f14625f.execute(new s30(7, this));
    }

    public final synchronized void j4(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f14624e.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f14624e.getContext();
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
                    } catch (IllegalArgumentException e2) {
                        za.i.i("Encountered invalid base64 watermark.", e2);
                    }
                }
            }
            this.f14624e.addView(frameLayout);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.bn
    public final synchronized void o(vb.a aVar) {
        this.f14627i.C((View) vb.b.U0(aVar));
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        ca0 ca0Var = this.f14627i;
        if (ca0Var == null || !ca0Var.e()) {
            return;
        }
        this.f14627i.D();
        this.f14627i.x(view, this.f14623d, A1(), D1(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        ca0 ca0Var = this.f14627i;
        if (ca0Var != null) {
            FrameLayout frameLayout = this.f14623d;
            ca0Var.z(frameLayout, A1(), D1(), ca0.f(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        ca0 ca0Var = this.f14627i;
        if (ca0Var != null) {
            FrameLayout frameLayout = this.f14623d;
            ca0Var.z(frameLayout, A1(), D1(), ca0.f(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        ca0 ca0Var = this.f14627i;
        if (ca0Var != null) {
            ca0Var.y(view, motionEvent, this.f14623d);
            if (((Boolean) va.s.f36163e.f36166c.a(sk.Nc)).booleanValue() && this.f14632o != null && this.f14627i.d() != 0) {
                this.f14632o.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final synchronized void u3(View view, String str) {
        if (!this.f14631n) {
            if (view == null) {
                this.f14622c.remove(str);
                return;
            }
            this.f14622c.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (pk.a.C(this.f14626h)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bn
    public final synchronized vb.a x(String str) {
        return new vb.b(O(str));
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final yg z1() {
        return this.j;
    }

    @Override // com.google.android.gms.internal.ads.bn
    public final synchronized void z3(vb.a aVar) {
        if (this.f14631n) {
            return;
        }
        Object objU0 = vb.b.U0(aVar);
        if (!(objU0 instanceof ca0)) {
            za.i.h("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        ca0 ca0Var = this.f14627i;
        if (ca0Var != null) {
            ca0Var.w(this);
        }
        i4();
        ca0 ca0Var2 = (ca0) objU0;
        this.f14627i = ca0Var2;
        ca0Var2.v(this);
        this.f14627i.h(this.f14623d);
        ca0 ca0Var3 = this.f14627i;
        FrameLayout frameLayout = this.f14624e;
        xh0 xh0VarW = ca0Var3.f10023m.w();
        if (ca0Var3.f10026p.c() && xh0VarW != null && frameLayout != null) {
            h80 h80Var = ua.j.C.f35280x;
            vt0 vt0Var = xh0VarW.f18390a;
            h80Var.getClass();
            h80.s(new th0(vt0Var, frameLayout, 0));
        }
        if (this.f14630m) {
            this.f14627i.F.b(this.f14629l);
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.D4)).booleanValue() && !TextUtils.isEmpty(this.f14627i.f10026p.e())) {
            j4(this.f14627i.f10026p.e());
        }
        h4();
    }
}
