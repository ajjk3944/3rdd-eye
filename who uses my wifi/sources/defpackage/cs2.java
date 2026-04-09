package defpackage;

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

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cs2 extends e22 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, rs2 {
    public static final sn3 u;
    public final String g;
    public FrameLayout i;
    public FrameLayout j;
    public final ld2 k;
    public View l;
    public pr2 n;
    public pv1 o;
    public z12 q;
    public boolean r;
    public GestureDetector t;
    public HashMap h = new HashMap();
    public u10 p = null;
    public boolean s = false;
    public final int m = ModuleDescriptor.MODULE_VERSION;

    static {
        vm3 vm3Var = xm3.g;
        Object[] objArr = {"2011", "1009", "3010"};
        wl2.G(objArr, 3);
        u = xm3.o(objArr, 3);
    }

    public cs2(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2 = null;
        this.i = frameLayout;
        this.j = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.g = str;
        qd2 qd2Var = hg4.C.B;
        ud2 ud2Var = new ud2(frameLayout, this);
        View view = (View) ((WeakReference) ud2Var.g).get();
        ViewTreeObserver viewTreeObserver3 = (view == null || (viewTreeObserver3 = view.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            ud2Var.U1(viewTreeObserver3);
        }
        vd2 vd2Var = new vd2(frameLayout, this);
        View view2 = (View) ((WeakReference) vd2Var.g).get();
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            vd2Var.U1(viewTreeObserver2);
        }
        this.k = md2.f;
        this.o = new pv1(this.i.getContext(), this.i);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    public final synchronized void B3() {
        int iV;
        if (((Boolean) tw1.e.c.a(mz1.oc)).booleanValue()) {
            pr2 pr2Var = this.n;
            synchronized (pr2Var) {
                iV = pr2Var.n.v();
            }
            if (iV != 0) {
                this.t = new GestureDetector(this.i.getContext(), new gs2(this.n, this));
            }
        }
    }

    public final synchronized void C3(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.j.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.j.getContext();
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
                    } catch (IllegalArgumentException unused) {
                        gi2.q0(5);
                    }
                }
            }
            this.j.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.f22
    public final void E0(u10 u10Var) {
        onTouch(this.i, (MotionEvent) oi0.l1(u10Var));
    }

    @Override // defpackage.f22
    public final synchronized void L0(u10 u10Var) {
        if (this.s) {
            return;
        }
        Object objL1 = oi0.l1(u10Var);
        if (!(objL1 instanceof pr2)) {
            gi2.i0("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        pr2 pr2Var = this.n;
        if (pr2Var != null) {
            pr2Var.r(this);
        }
        synchronized (this) {
            this.k.execute(new bs2(0, this));
            pr2 pr2Var2 = (pr2) objL1;
            this.n = pr2Var2;
            pr2Var2.q(this);
            this.n.f(this.i);
            pr2 pr2Var3 = this.n;
            FrameLayout frameLayout = this.j;
            xz2 xz2VarK = pr2Var3.m.k();
            if (pr2Var3.p.c() && xz2VarK != null && frameLayout != null) {
                su2 su2Var = hg4.C.x;
                xb3 xb3Var = xz2VarK.a;
                su2Var.getClass();
                su2.t(new rz2(xb3Var, frameLayout, 0));
            }
            if (this.r) {
                rr2 rr2Var = this.n.F;
                z12 z12Var = this.q;
                synchronized (rr2Var) {
                    rr2Var.a = z12Var;
                }
            }
            if (((Boolean) tw1.e.c.a(mz1.m4)).booleanValue() && !TextUtils.isEmpty(this.n.p.e())) {
                C3(this.n.p.e());
            }
            B3();
        }
    }

    @Override // defpackage.f22
    public final synchronized void M(u10 u10Var) {
        pr2 pr2Var = this.n;
        View view = (View) oi0.l1(u10Var);
        synchronized (pr2Var) {
            pr2Var.n.g(view);
        }
    }

    @Override // defpackage.rs2
    public final FrameLayout M0() {
        return this.j;
    }

    @Override // defpackage.f22
    public final synchronized u10 P(String str) {
        return new oi0(y3(str));
    }

    @Override // defpackage.f22
    public final synchronized void T2(z12 z12Var) {
        if (!this.s) {
            this.r = true;
            this.q = z12Var;
            pr2 pr2Var = this.n;
            if (pr2Var != null) {
                rr2 rr2Var = pr2Var.F;
                synchronized (rr2Var) {
                    rr2Var.a = z12Var;
                }
            }
        }
    }

    @Override // defpackage.f22
    public final synchronized void V0(u10 u10Var, String str) {
        X1((View) oi0.l1(u10Var), str);
    }

    @Override // defpackage.rs2
    public final /* synthetic */ View X0() {
        return this.i;
    }

    @Override // defpackage.rs2
    public final synchronized void X1(View view, String str) {
        if (!this.s) {
            if (view == null) {
                this.h.remove(str);
                return;
            }
            this.h.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (uk2.M(this.m)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // defpackage.f22
    public final synchronized void b() {
        try {
            if (this.s) {
                return;
            }
            pr2 pr2Var = this.n;
            if (pr2Var != null) {
                pr2Var.r(this);
                this.n = null;
            }
            this.h.clear();
            this.i.removeAllViews();
            this.j.removeAllViews();
            this.h = null;
            this.i = null;
            this.j = null;
            this.l = null;
            this.o = null;
            this.s = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.f22
    public final synchronized void d0(u10 u10Var, int i) {
    }

    @Override // defpackage.rs2
    public final pv1 f() {
        return this.o;
    }

    @Override // defpackage.rs2
    public final synchronized Map g() {
        return this.h;
    }

    @Override // defpackage.rs2
    public final synchronized Map i() {
        return null;
    }

    @Override // defpackage.rs2
    public final synchronized Map k() {
        return this.h;
    }

    @Override // defpackage.rs2
    public final synchronized JSONObject m() {
        JSONObject jSONObjectH;
        pr2 pr2Var = this.n;
        if (pr2Var == null) {
            return null;
        }
        FrameLayout frameLayout = this.i;
        Map mapG = g();
        Map mapK = k();
        synchronized (pr2Var) {
            jSONObjectH = pr2Var.n.h(frameLayout, mapG, mapK, pr2Var.k());
        }
        return jSONObjectH;
    }

    @Override // defpackage.rs2
    public final synchronized String o() {
        return this.g;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        boolean zS;
        pr2 pr2Var = this.n;
        if (pr2Var != null) {
            synchronized (pr2Var) {
                zS = pr2Var.n.s();
            }
            if (zS) {
                pr2 pr2Var2 = this.n;
                synchronized (pr2Var2) {
                    pr2Var2.n.x();
                }
                this.n.s(view, this.i, g(), k(), false);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        pr2 pr2Var = this.n;
        if (pr2Var != null) {
            FrameLayout frameLayout = this.i;
            pr2Var.t(frameLayout, g(), k(), pr2.d(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        pr2 pr2Var = this.n;
        if (pr2Var != null) {
            FrameLayout frameLayout = this.i;
            pr2Var.t(frameLayout, g(), k(), pr2.d(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        int iV;
        pr2 pr2Var = this.n;
        if (pr2Var != null) {
            FrameLayout frameLayout = this.i;
            synchronized (pr2Var) {
                pr2Var.n.u(frameLayout, motionEvent);
            }
            if (((Boolean) tw1.e.c.a(mz1.oc)).booleanValue() && this.t != null) {
                pr2 pr2Var2 = this.n;
                synchronized (pr2Var2) {
                    iV = pr2Var2.n.v();
                }
                if (iV != 0) {
                    this.t.onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // defpackage.rs2
    public final u10 p() {
        return this.p;
    }

    @Override // defpackage.rs2
    public final synchronized JSONObject q() {
        JSONObject jSONObjectM;
        pr2 pr2Var = this.n;
        if (pr2Var == null) {
            return null;
        }
        FrameLayout frameLayout = this.i;
        Map mapG = g();
        Map mapK = k();
        synchronized (pr2Var) {
            jSONObjectM = pr2Var.n.m(frameLayout, mapG, mapK, pr2Var.k());
        }
        return jSONObjectM;
    }

    @Override // defpackage.rs2
    public final synchronized View y3(String str) {
        WeakReference weakReference;
        if (!this.s && (weakReference = (WeakReference) this.h.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.f22
    public final synchronized void z1(u10 u10Var) {
        if (this.s) {
            return;
        }
        this.p = u10Var;
    }
}
