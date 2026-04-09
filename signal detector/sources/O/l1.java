package o;

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
import com.apm.insight.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class l1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public static l1 f22570k;

    /* renamed from: l, reason: collision with root package name */
    public static l1 f22571l;

    /* renamed from: a, reason: collision with root package name */
    public final View f22572a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f22573b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22574c;

    /* renamed from: d, reason: collision with root package name */
    public final k1 f22575d;

    /* renamed from: e, reason: collision with root package name */
    public final k1 f22576e;

    /* renamed from: f, reason: collision with root package name */
    public int f22577f;

    /* renamed from: g, reason: collision with root package name */
    public int f22578g;

    /* renamed from: h, reason: collision with root package name */
    public m1 f22579h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22580j;

    /* JADX WARN: Type inference failed for: r0v0, types: [o.k1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.k1] */
    public l1(View view, CharSequence charSequence) {
        final int i = 0;
        this.f22575d = new Runnable(this) { // from class: o.k1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l1 f22542b;

            {
                this.f22542b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i) {
                    case 0:
                        this.f22542b.c(false);
                        break;
                    default:
                        this.f22542b.a();
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f22576e = new Runnable(this) { // from class: o.k1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l1 f22542b;

            {
                this.f22542b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i3) {
                    case 0:
                        this.f22542b.c(false);
                        break;
                    default:
                        this.f22542b.a();
                        break;
                }
            }
        };
        this.f22572a = view;
        this.f22573b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = R.P.f3276a;
        this.f22574c = Build.VERSION.SDK_INT >= 28 ? K.a.j(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f22580j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(l1 l1Var) {
        l1 l1Var2 = f22570k;
        if (l1Var2 != null) {
            l1Var2.f22572a.removeCallbacks(l1Var2.f22575d);
        }
        f22570k = l1Var;
        if (l1Var != null) {
            l1Var.f22572a.postDelayed(l1Var.f22575d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        l1 l1Var = f22571l;
        View view = this.f22572a;
        if (l1Var == this) {
            f22571l = null;
            m1 m1Var = this.f22579h;
            if (m1Var != null) {
                View view2 = (View) m1Var.f22584d;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) m1Var.f22583c).getSystemService("window")).removeView(view2);
                }
                this.f22579h = null;
                this.f22580j = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f22570k == this) {
            b(null);
        }
        view.removeCallbacks(this.f22576e);
    }

    public final void c(boolean z6) throws Resources.NotFoundException {
        int height;
        int i;
        int i3;
        boolean z7;
        int i6;
        int i7;
        long longPressTimeout;
        long j6;
        long j7;
        View view = this.f22572a;
        if (view.isAttachedToWindow()) {
            b(null);
            l1 l1Var = f22571l;
            if (l1Var != null) {
                l1Var.a();
            }
            f22571l = this;
            this.i = z6;
            m1 m1Var = new m1(view.getContext());
            View view2 = (View) m1Var.f22584d;
            Context context = (Context) m1Var.f22583c;
            this.f22579h = m1Var;
            int width = this.f22577f;
            int i8 = this.f22578g;
            boolean z8 = this.i;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) m1Var.f22585e;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) m1Var.f22582b).setText(this.f22573b);
            int[] iArr = (int[]) m1Var.f22588h;
            int[] iArr2 = (int[]) m1Var.f22587g;
            Rect rect = (Rect) m1Var.f22586f;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i8 + dimensionPixelOffset2;
                i = i8 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z8 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i9 = width;
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
                i7 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i3 = i;
                    z7 = z8;
                    i6 = 0;
                    i7 = 1;
                } else {
                    Resources resources = context.getResources();
                    i7 = 1;
                    i3 = i;
                    z7 = z8;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i6 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i10 = iArr2[i6] - iArr[i6];
                iArr2[i6] = i10;
                iArr2[i7] = iArr2[i7] - iArr[i7];
                layoutParams.x = (i10 + i9) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, i6);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i11 = iArr2[i7];
                int i12 = ((i11 + i3) - dimensionPixelOffset3) - measuredHeight;
                int i13 = i11 + height + dimensionPixelOffset3;
                if (z7) {
                    if (i12 >= 0) {
                        layoutParams.y = i12;
                    } else {
                        layoutParams.y = i13;
                    }
                } else if (measuredHeight + i13 <= rect.height()) {
                    layoutParams.y = i13;
                } else {
                    layoutParams.y = i12;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.i) {
                j7 = 2500;
            } else {
                WeakHashMap weakHashMap = R.O.f3270a;
                if ((view.getWindowSystemUiVisibility() & 1) == i7) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j6 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j6 = 15000;
                }
                j7 = j6 - longPressTimeout;
            }
            k1 k1Var = this.f22576e;
            view.removeCallbacks(k1Var);
            view.postDelayed(k1Var, j7);
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
            o.m1 r4 = r3.f22579h
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.i
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.f22572a
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
            r3.f22580j = r4
            r3.a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            o.m1 r4 = r3.f22579h
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f22580j
            if (r1 != 0) goto L66
            int r1 = r3.f22577f
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f22574c
            if (r1 > r2) goto L66
            int r1 = r3.f22578g
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f22577f = r4
            r3.f22578g = r5
            r3.f22580j = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.l1.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f22577f = view.getWidth() / 2;
        this.f22578g = view.getHeight() / 2;
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
