package ge;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import io.sentry.android.core.e0;
import ir.f0;
import java.util.List;
import java.util.WeakHashMap;
import kg.r;
import u3.i0;
import u3.z;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f9538a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9539b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9540c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f9541d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f9542e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f9543f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f9544g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f9545h;

    /* renamed from: i, reason: collision with root package name */
    public final g f9546i;
    public final i j;

    /* renamed from: l, reason: collision with root package name */
    public int f9547l;

    /* renamed from: m, reason: collision with root package name */
    public int f9548m;

    /* renamed from: n, reason: collision with root package name */
    public int f9549n;

    /* renamed from: o, reason: collision with root package name */
    public int f9550o;

    /* renamed from: p, reason: collision with root package name */
    public int f9551p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9552q;

    /* renamed from: r, reason: collision with root package name */
    public final AccessibilityManager f9553r;

    /* renamed from: t, reason: collision with root package name */
    public static final q4.a f9532t = fd.a.f8823b;

    /* renamed from: u, reason: collision with root package name */
    public static final LinearInterpolator f9533u = fd.a.f8822a;

    /* renamed from: v, reason: collision with root package name */
    public static final q4.a f9534v = fd.a.f8825d;

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f9536x = {ed.b.snackbarStyle};

    /* renamed from: y, reason: collision with root package name */
    public static final String f9537y = h.class.getSimpleName();

    /* renamed from: w, reason: collision with root package name */
    public static final Handler f9535w = new Handler(Looper.getMainLooper(), new c());
    public final d k = new d(this, 0);

    /* renamed from: s, reason: collision with root package name */
    public final e f9554s = new e(this);

    public h(Context context, ViewGroup viewGroup, View view, i iVar) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (iVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f9544g = viewGroup;
        this.j = iVar;
        this.f9545h = context;
        xd.k.c(context, xd.k.f25295a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f9536x);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        g gVar = (g) layoutInflaterFrom.inflate(resourceId != -1 ? ed.h.mtrl_layout_snackbar : ed.h.design_layout_snackbar, viewGroup, false);
        this.f9546i = gVar;
        gVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            float actionTextColorAlpha = gVar.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.f5706d.setTextColor(io.sentry.config.a.b0(io.sentry.config.a.V(snackbarContentLayout, ed.b.colorSurface), actionTextColorAlpha, snackbarContentLayout.f5706d.getCurrentTextColor()));
            }
            snackbarContentLayout.setMaxInlineActionWidth(gVar.getMaxInlineActionWidth());
        }
        gVar.addView(view);
        gVar.setAccessibilityLiveRegion(1);
        gVar.setImportantForAccessibility(1);
        gVar.setFitsSystemWindows(true);
        b9.e eVar = new b9.e(27, this);
        WeakHashMap weakHashMap = i0.f23177a;
        z.j(gVar, eVar);
        i0.n(gVar, new com.google.android.material.datepicker.k(1, this));
        this.f9553r = (AccessibilityManager) context.getSystemService("accessibility");
        this.f9540c = f0.U(context, ed.b.motionDurationLong2, 250);
        this.f9538a = f0.U(context, ed.b.motionDurationLong2, 150);
        this.f9539b = f0.U(context, ed.b.motionDurationMedium1, 75);
        this.f9541d = f0.V(context, ed.b.motionEasingEmphasizedInterpolator, f9533u);
        this.f9543f = f0.V(context, ed.b.motionEasingEmphasizedInterpolator, f9534v);
        this.f9542e = f0.V(context, ed.b.motionEasingEmphasizedInterpolator, f9532t);
    }

    public final void a(int i10) {
        r rVarJ = r.j();
        e eVar = this.f9554s;
        synchronized (rVarJ.f14395a) {
            try {
                if (rVarJ.o(eVar)) {
                    rVarJ.b((l) rVarJ.f14397g, i10);
                } else {
                    l lVar = (l) rVarJ.f14398r;
                    if (lVar != null && lVar.f9558a.get() == eVar) {
                        rVarJ.b((l) rVarJ.f14398r, i10);
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        r rVarJ = r.j();
        e eVar = this.f9554s;
        synchronized (rVarJ.f14395a) {
            try {
                if (rVarJ.o(eVar)) {
                    rVarJ.f14397g = null;
                    if (((l) rVarJ.f14398r) != null) {
                        rVarJ.w();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ViewParent parent = this.f9546i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f9546i);
        }
    }

    public final void c() {
        r rVarJ = r.j();
        e eVar = this.f9554s;
        synchronized (rVarJ.f14395a) {
            try {
                if (rVarJ.o(eVar)) {
                    rVarJ.v((l) rVarJ.f14397g);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        g gVar = this.f9546i;
        AccessibilityManager accessibilityManager = this.f9553r;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            gVar.post(new d(this, 2));
            return;
        }
        if (gVar.getParent() != null) {
            gVar.setVisibility(0);
        }
        c();
    }

    public final void e() {
        g gVar = this.f9546i;
        ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
        boolean z10 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = f9537y;
        if (!z10) {
            e0.p(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (gVar.F == null) {
            e0.p(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (gVar.getParent() == null) {
            return;
        }
        int i10 = this.f9547l;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = gVar.F;
        int i11 = rect.bottom + i10;
        int i12 = rect.left + this.f9548m;
        int i13 = rect.right + this.f9549n;
        int i14 = rect.top;
        boolean z11 = (marginLayoutParams.bottomMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13 && marginLayoutParams.topMargin == i14) ? false : true;
        if (z11) {
            marginLayoutParams.bottomMargin = i11;
            marginLayoutParams.leftMargin = i12;
            marginLayoutParams.rightMargin = i13;
            marginLayoutParams.topMargin = i14;
            gVar.requestLayout();
        }
        if ((z11 || this.f9551p != this.f9550o) && Build.VERSION.SDK_INT >= 29 && this.f9550o > 0) {
            ViewGroup.LayoutParams layoutParams2 = gVar.getLayoutParams();
            if ((layoutParams2 instanceof e3.e) && (((e3.e) layoutParams2).f7771a instanceof SwipeDismissBehavior)) {
                d dVar = this.k;
                gVar.removeCallbacks(dVar);
                gVar.post(dVar);
            }
        }
    }
}
