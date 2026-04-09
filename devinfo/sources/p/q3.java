package p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.liuzh.deviceinfo.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public static q3 f30825k;

    /* renamed from: l, reason: collision with root package name */
    public static q3 f30826l;

    /* renamed from: a, reason: collision with root package name */
    public final View f30827a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f30828b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30829c;

    /* renamed from: d, reason: collision with root package name */
    public final p3 f30830d;

    /* renamed from: e, reason: collision with root package name */
    public final p3 f30831e;

    /* renamed from: f, reason: collision with root package name */
    public int f30832f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public r3 f30833h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f30834i;
    public boolean j;

    /* JADX WARN: Type inference failed for: r0v0, types: [p.p3] */
    /* JADX WARN: Type inference failed for: r0v1, types: [p.p3] */
    public q3(View view, CharSequence charSequence) {
        final int i4 = 0;
        this.f30830d = new Runnable(this) { // from class: p.p3

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q3 f30819b;

            {
                this.f30819b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i4) {
                    case 0:
                        this.f30819b.c(false);
                        break;
                    default:
                        this.f30819b.a();
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f30831e = new Runnable(this) { // from class: p.p3

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q3 f30819b;

            {
                this.f30819b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i10) {
                    case 0:
                        this.f30819b.c(false);
                        break;
                    default:
                        this.f30819b.a();
                        break;
                }
            }
        };
        this.f30827a = view;
        this.f30828b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = e4.w0.f22414a;
        this.f30829c = Build.VERSION.SDK_INT >= 28 ? a4.f.p(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(q3 q3Var) {
        q3 q3Var2 = f30825k;
        if (q3Var2 != null) {
            q3Var2.f30827a.removeCallbacks(q3Var2.f30830d);
        }
        f30825k = q3Var;
        if (q3Var != null) {
            q3Var.f30827a.postDelayed(q3Var.f30830d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        q3 q3Var = f30826l;
        View view = this.f30827a;
        if (q3Var == this) {
            f30826l = null;
            r3 r3Var = this.f30833h;
            if (r3Var != null) {
                View view2 = (View) r3Var.f30845b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) r3Var.f30844a).getSystemService("window")).removeView(view2);
                }
                this.f30833h = null;
                this.j = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f30825k == this) {
            b(null);
        }
        view.removeCallbacks(this.f30831e);
    }

    public final void c(boolean z3) throws Resources.NotFoundException {
        int height;
        int i4;
        int i10;
        boolean z10;
        int i11;
        int i12;
        long longPressTimeout;
        long j;
        long j8;
        View view = this.f30827a;
        if (view.isAttachedToWindow()) {
            b(null);
            q3 q3Var = f30826l;
            if (q3Var != null) {
                q3Var.a();
            }
            f30826l = this;
            this.f30834i = z3;
            r3 r3Var = new r3(view.getContext());
            View view2 = (View) r3Var.f30845b;
            Context context = (Context) r3Var.f30844a;
            this.f30833h = r3Var;
            int width = this.f30832f;
            int i13 = this.g;
            boolean z11 = this.f30834i;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) r3Var.f30847d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) r3Var.f30846c).setText(this.f30828b);
            int[] iArr = (int[]) r3Var.g;
            int[] iArr2 = (int[]) r3Var.f30849f;
            Rect rect = (Rect) r3Var.f30848e;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i13 + dimensionPixelOffset2;
                i4 = i13 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i4 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z11 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i14 = width;
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
                Log.e("TooltipPopup", "Cannot find app view");
                i12 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i10 = i4;
                    z10 = z11;
                    i11 = 0;
                    i12 = 1;
                } else {
                    Resources resources = context.getResources();
                    i12 = 1;
                    i10 = i4;
                    z10 = z11;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i11 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i15 = iArr2[i11] - iArr[i11];
                iArr2[i11] = i15;
                iArr2[i12] = iArr2[i12] - iArr[i12];
                layoutParams.x = (i15 + i14) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, i11);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i16 = iArr2[i12];
                int i17 = ((i16 + i10) - dimensionPixelOffset3) - measuredHeight;
                int i18 = i16 + height + dimensionPixelOffset3;
                if (z10) {
                    if (i17 >= 0) {
                        layoutParams.y = i17;
                    } else {
                        layoutParams.y = i18;
                    }
                } else if (measuredHeight + i18 <= rect.height()) {
                    layoutParams.y = i18;
                } else {
                    layoutParams.y = i17;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f30834i) {
                j8 = 2500;
            } else {
                WeakHashMap weakHashMap = e4.v0.f22405a;
                if ((view.getWindowSystemUiVisibility() & 1) == i12) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j8 = j - longPressTimeout;
            }
            p3 p3Var = this.f30831e;
            view.removeCallbacks(p3Var);
            view.postDelayed(p3Var, j8);
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
            p.r3 r4 = r3.f30833h
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f30834i
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.f30827a
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
            r3.j = r4
            r3.a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            p.r3 r4 = r3.f30833h
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.j
            if (r1 != 0) goto L66
            int r1 = r3.f30832f
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f30829c
            if (r1 > r2) goto L66
            int r1 = r3.g
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f30832f = r4
            r3.g = r5
            r3.j = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.q3.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f30832f = view.getWidth() / 2;
        this.g = view.getHeight() / 2;
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
