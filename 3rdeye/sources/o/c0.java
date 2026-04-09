package o;

import L0.K;
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
import android.view.ViewParent;
import android.view.WindowManager;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: TooltipCompatHandler.java */
/* loaded from: classes.dex */
public final class c0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: l, reason: collision with root package name */
    public static c0 f44630l;

    /* renamed from: m, reason: collision with root package name */
    public static c0 f44631m;

    /* renamed from: b, reason: collision with root package name */
    public final View f44632b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f44633c;

    /* renamed from: d, reason: collision with root package name */
    public final int f44634d;

    /* renamed from: e, reason: collision with root package name */
    public final com.vungle.ads.internal.util.a f44635e = new com.vungle.ads.internal.util.a(this, 8);

    /* renamed from: f, reason: collision with root package name */
    public final b0 f44636f = new b0(this, 0);

    /* renamed from: g, reason: collision with root package name */
    public int f44637g;

    /* renamed from: h, reason: collision with root package name */
    public int f44638h;
    public d0 i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f44639j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f44640k;

    public c0(View view, CharSequence charSequence) {
        this.f44632b = view;
        this.f44633c = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = L0.K.f3812a;
        this.f44634d = Build.VERSION.SDK_INT >= 28 ? K.b.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f44640k = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(c0 c0Var) {
        c0 c0Var2 = f44630l;
        if (c0Var2 != null) {
            c0Var2.f44632b.removeCallbacks(c0Var2.f44635e);
        }
        f44630l = c0Var;
        if (c0Var != null) {
            c0Var.f44632b.postDelayed(c0Var.f44635e, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        c0 c0Var = f44631m;
        View view = this.f44632b;
        if (c0Var == this) {
            f44631m = null;
            d0 d0Var = this.i;
            if (d0Var != null) {
                View view2 = d0Var.f44648b;
                if (view2.getParent() != null) {
                    ((WindowManager) d0Var.f44647a.getSystemService("window")).removeView(view2);
                }
                this.i = null;
                this.f44640k = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f44630l == this) {
            b(null);
        }
        view.removeCallbacks(this.f44636f);
    }

    public final void c(boolean z10) {
        int height;
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        long longPressTimeout;
        long j4;
        long j10;
        View view = this.f44632b;
        if (view.isAttachedToWindow()) {
            b(null);
            c0 c0Var = f44631m;
            if (c0Var != null) {
                c0Var.a();
            }
            f44631m = this;
            this.f44639j = z10;
            d0 d0Var = new d0(view.getContext());
            this.i = d0Var;
            int width = this.f44637g;
            int i14 = this.f44638h;
            boolean z11 = this.f44639j;
            View view2 = d0Var.f44648b;
            ViewParent parent = view2.getParent();
            Context context = d0Var.f44647a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            d0Var.f44649c.setText(this.f44633c);
            WindowManager.LayoutParams layoutParams = d0Var.f44650d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i14 + dimensionPixelOffset2;
                i = i14 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z11 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
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
                i13 = 1;
            } else {
                Rect rect = d0Var.f44651e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i10 = width;
                    i11 = i;
                    i12 = 0;
                    i13 = 1;
                } else {
                    Resources resources = context.getResources();
                    i13 = 1;
                    i10 = width;
                    i11 = i;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i12 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = d0Var.f44653g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = d0Var.f44652f;
                view.getLocationOnScreen(iArr2);
                int i15 = iArr2[i12] - iArr[i12];
                iArr2[i12] = i15;
                iArr2[i13] = iArr2[i13] - iArr[i13];
                layoutParams.x = (i15 + i10) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, i12);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i16 = iArr2[i13];
                int i17 = ((i16 + i11) - dimensionPixelOffset3) - measuredHeight;
                int i18 = i16 + height + dimensionPixelOffset3;
                if (z11) {
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
            if (this.f44639j) {
                j10 = 2500;
            } else {
                WeakHashMap<View, L0.S> weakHashMap = L0.I.f3792a;
                if ((view.getWindowSystemUiVisibility() & 1) == i13) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j4 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j4 = 15000;
                }
                j10 = j4 - longPressTimeout;
            }
            b0 b0Var = this.f44636f;
            view.removeCallbacks(b0Var);
            view.postDelayed(b0Var, j10);
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
            o.d0 r4 = r3.i
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f44639j
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.f44632b
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
            r3.f44640k = r4
            r3.a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            o.d0 r4 = r3.i
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f44640k
            if (r1 != 0) goto L66
            int r1 = r3.f44637g
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f44634d
            if (r1 > r2) goto L66
            int r1 = r3.f44638h
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f44637g = r4
            r3.f44638h = r5
            r3.f44640k = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.c0.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f44637g = view.getWidth() / 2;
        this.f44638h = view.getHeight() / 2;
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
