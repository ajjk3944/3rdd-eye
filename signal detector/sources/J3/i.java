package J3;

import A2.C0117e;
import R.F;
import R.O;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.apm.insight.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import e3.AbstractC2303a;
import java.util.List;
import java.util.WeakHashMap;
import m0.C2650a;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f2110a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2111b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2112c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f2113d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f2114e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f2115f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f2116g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f2117h;
    public final h i;

    /* renamed from: j, reason: collision with root package name */
    public final j f2118j;

    /* renamed from: k, reason: collision with root package name */
    public int f2119k;

    /* renamed from: l, reason: collision with root package name */
    public final d f2120l;

    /* renamed from: m, reason: collision with root package name */
    public int f2121m;

    /* renamed from: n, reason: collision with root package name */
    public int f2122n;

    /* renamed from: o, reason: collision with root package name */
    public int f2123o;

    /* renamed from: p, reason: collision with root package name */
    public int f2124p;

    /* renamed from: q, reason: collision with root package name */
    public int f2125q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2126r;

    /* renamed from: s, reason: collision with root package name */
    public final AccessibilityManager f2127s;

    /* renamed from: t, reason: collision with root package name */
    public final f f2128t = new f(this);

    /* renamed from: u, reason: collision with root package name */
    public static final C2650a f2104u = AbstractC2303a.f19928b;

    /* renamed from: v, reason: collision with root package name */
    public static final LinearInterpolator f2105v = AbstractC2303a.f19927a;

    /* renamed from: w, reason: collision with root package name */
    public static final C2650a f2106w = AbstractC2303a.f19930d;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2108y = {R.attr.snackbarStyle};

    /* renamed from: z, reason: collision with root package name */
    public static final String f2109z = i.class.getSimpleName();

    /* renamed from: x, reason: collision with root package name */
    public static final Handler f2107x = new Handler(Looper.getMainLooper(), new c(0));

    public i(Context context, ViewGroup viewGroup, View view, j jVar) {
        int i = 0;
        this.f2120l = new d(this, i);
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f2116g = viewGroup;
        this.f2118j = jVar;
        this.f2117h = context;
        AbstractC2993B.c(context, AbstractC2993B.f24035a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f2108y);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        h hVar = (h) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.i = hVar;
        hVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            float actionTextColorAlpha = hVar.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.f18442b.setTextColor(com.bumptech.glide.e.t(actionTextColorAlpha, com.bumptech.glide.e.m(R.attr.colorSurface, snackbarContentLayout), snackbarContentLayout.f18442b.getCurrentTextColor()));
            }
            snackbarContentLayout.setMaxInlineActionWidth(hVar.getMaxInlineActionWidth());
        }
        hVar.addView(view);
        hVar.setAccessibilityLiveRegion(1);
        hVar.setImportantForAccessibility(1);
        hVar.setFitsSystemWindows(true);
        C0117e c0117e = new C0117e(7, this);
        WeakHashMap weakHashMap = O.f3270a;
        F.k(hVar, c0117e);
        O.m(hVar, new e(i, this));
        this.f2127s = (AccessibilityManager) context.getSystemService("accessibility");
        this.f2112c = com.bumptech.glide.d.O(context, R.attr.motionDurationLong2, 250);
        this.f2110a = com.bumptech.glide.d.O(context, R.attr.motionDurationLong2, 150);
        this.f2111b = com.bumptech.glide.d.O(context, R.attr.motionDurationMedium1, 75);
        this.f2113d = com.bumptech.glide.d.P(context, R.attr.motionEasingEmphasizedInterpolator, f2105v);
        this.f2115f = com.bumptech.glide.d.P(context, R.attr.motionEasingEmphasizedInterpolator, f2106w);
        this.f2114e = com.bumptech.glide.d.P(context, R.attr.motionEasingEmphasizedInterpolator, f2104u);
    }

    public final void a(int i) {
        c1.g gVarT = c1.g.t();
        f fVar = this.f2128t;
        synchronized (gVarT.f5896b) {
            try {
                if (gVarT.v(fVar)) {
                    gVarT.g((m) gVarT.f5898d, i);
                } else {
                    m mVar = (m) gVarT.f5899e;
                    if (mVar != null && mVar.f2134a.get() == fVar) {
                        gVarT.g((m) gVarT.f5899e, i);
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        c1.g gVarT = c1.g.t();
        f fVar = this.f2128t;
        synchronized (gVarT.f5896b) {
            try {
                if (gVarT.v(fVar)) {
                    gVarT.f5898d = null;
                    if (((m) gVarT.f5899e) != null) {
                        gVarT.G();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void c() {
        c1.g gVarT = c1.g.t();
        f fVar = this.f2128t;
        synchronized (gVarT.f5896b) {
            try {
                if (gVarT.v(fVar)) {
                    gVarT.E((m) gVarT.f5898d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        h hVar = this.i;
        AccessibilityManager accessibilityManager = this.f2127s;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            hVar.post(new d(this, 2));
            return;
        }
        if (hVar.getParent() != null) {
            hVar.setVisibility(0);
        }
        c();
    }

    public final void e() {
        h hVar = this.i;
        ViewGroup.LayoutParams layoutParams = hVar.getLayoutParams();
        boolean z6 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = f2109z;
        if (!z6) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (hVar.f2102j == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (hVar.getParent() == null) {
            return;
        }
        int i = this.f2121m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = hVar.f2102j;
        int i3 = rect.bottom + i;
        int i6 = rect.left + this.f2122n;
        int i7 = rect.right + this.f2123o;
        int i8 = rect.top;
        boolean z7 = (marginLayoutParams.bottomMargin == i3 && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == i7 && marginLayoutParams.topMargin == i8) ? false : true;
        if (z7) {
            marginLayoutParams.bottomMargin = i3;
            marginLayoutParams.leftMargin = i6;
            marginLayoutParams.rightMargin = i7;
            marginLayoutParams.topMargin = i8;
            hVar.requestLayout();
        }
        if ((z7 || this.f2125q != this.f2124p) && Build.VERSION.SDK_INT >= 29 && this.f2124p > 0) {
            ViewGroup.LayoutParams layoutParams2 = hVar.getLayoutParams();
            if ((layoutParams2 instanceof E.e) && (((E.e) layoutParams2).f1311a instanceof SwipeDismissBehavior)) {
                d dVar = this.f2120l;
                hVar.removeCallbacks(dVar);
                hVar.post(dVar);
            }
        }
    }
}
