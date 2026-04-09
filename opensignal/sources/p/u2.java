package p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class u2 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static u2 G;
    public static u2 H;
    public int B;
    public v2 D;
    public boolean E;
    public boolean F;

    /* renamed from: a, reason: collision with root package name */
    public final View f20183a;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f20184d;

    /* renamed from: g, reason: collision with root package name */
    public final int f20185g;

    /* renamed from: r, reason: collision with root package name */
    public final t2 f20186r;

    /* renamed from: x, reason: collision with root package name */
    public final t2 f20187x;

    /* renamed from: y, reason: collision with root package name */
    public int f20188y;

    /* JADX WARN: Type inference failed for: r0v0, types: [p.t2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [p.t2] */
    public u2(View view, CharSequence charSequence) {
        final int i10 = 0;
        this.f20186r = new Runnable(this) { // from class: p.t2

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ u2 f20178d;

            {
                this.f20178d = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i10) {
                    case 0:
                        this.f20178d.c(false);
                        break;
                    default:
                        this.f20178d.a();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f20187x = new Runnable(this) { // from class: p.t2

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ u2 f20178d;

            {
                this.f20178d = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i11) {
                    case 0:
                        this.f20178d.c(false);
                        break;
                    default:
                        this.f20178d.a();
                        break;
                }
            }
        };
        this.f20183a = view;
        this.f20184d = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = u3.j0.f23184a;
        this.f20185g = Build.VERSION.SDK_INT >= 28 ? i3.a.k(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.F = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(u2 u2Var) {
        u2 u2Var2 = G;
        if (u2Var2 != null) {
            u2Var2.f20183a.removeCallbacks(u2Var2.f20186r);
        }
        G = u2Var;
        if (u2Var != null) {
            u2Var.f20183a.postDelayed(u2Var.f20186r, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        u2 u2Var = H;
        View view = this.f20183a;
        if (u2Var == this) {
            H = null;
            v2 v2Var = this.D;
            if (v2Var != null) {
                View view2 = (View) v2Var.f20202g;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) v2Var.f20201d).getSystemService("window")).removeView(view2);
                }
                this.D = null;
                this.F = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                io.sentry.android.core.e0.d("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (G == this) {
            b(null);
        }
        view.removeCallbacks(this.f20187x);
    }

    public final void c(boolean z10) throws Resources.NotFoundException {
        int height;
        int i10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        long longPressTimeout;
        long j;
        long j7;
        View view = this.f20183a;
        if (view.isAttachedToWindow()) {
            b(null);
            u2 u2Var = H;
            if (u2Var != null) {
                u2Var.a();
            }
            H = this;
            this.E = z10;
            v2 v2Var = new v2(view.getContext());
            View view2 = (View) v2Var.f20202g;
            Context context = (Context) v2Var.f20201d;
            this.D = v2Var;
            int width = this.f20188y;
            int i14 = this.B;
            boolean z12 = this.E;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) v2Var.f20204x;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) v2Var.f20203r).setText(this.f20184d);
            int[] iArr = (int[]) v2Var.D;
            int[] iArr2 = (int[]) v2Var.B;
            Rect rect = (Rect) v2Var.f20205y;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(h.d.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(h.d.tooltip_precise_anchor_extra_offset);
                height = i14 + dimensionPixelOffset2;
                i10 = i14 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i10 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z12 ? h.d.tooltip_y_offset_touch : h.d.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i15 = width;
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                io.sentry.android.core.e0.d("TooltipPopup", "Cannot find app view");
                i13 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i11 = i10;
                    z11 = z12;
                    i12 = 0;
                    i13 = 1;
                } else {
                    Resources resources = context.getResources();
                    i13 = 1;
                    i11 = i10;
                    z11 = z12;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i12 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i16 = iArr2[i12] - iArr[i12];
                iArr2[i12] = i16;
                iArr2[i13] = iArr2[i13] - iArr[i13];
                layoutParams.x = (i16 + i15) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, i12);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i17 = iArr2[i13];
                int i18 = ((i17 + i11) - dimensionPixelOffset3) - measuredHeight;
                int i19 = i17 + height + dimensionPixelOffset3;
                if (z11) {
                    if (i18 >= 0) {
                        layoutParams.y = i18;
                    } else {
                        layoutParams.y = i19;
                    }
                } else if (measuredHeight + i19 <= rect.height()) {
                    layoutParams.y = i19;
                } else {
                    layoutParams.y = i18;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.E) {
                j7 = 2500;
            } else {
                WeakHashMap weakHashMap = u3.i0.f23177a;
                if ((view.getWindowSystemUiVisibility() & 1) == i13) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j7 = j - longPressTimeout;
            }
            t2 t2Var = this.f20187x;
            view.removeCallbacks(t2Var);
            view.postDelayed(t2Var, j7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            p.v2 r4 = r3.D
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.E
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.f20183a
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.F = r4
            r3.a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            p.v2 r4 = r3.D
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.F
            if (r1 != 0) goto L66
            int r1 = r3.f20188y
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f20185g
            if (r1 > r2) goto L66
            int r1 = r3.B
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f20188y = r4
            r3.B = r5
            r3.F = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.u2.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f20188y = view.getWidth() / 2;
        this.B = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
