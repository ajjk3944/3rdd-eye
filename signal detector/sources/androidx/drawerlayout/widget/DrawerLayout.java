package androidx.drawerlayout.widget;

import A3.z;
import M3.A;
import R.F;
import R.O;
import R.r0;
import U0.j;
import X.d;
import X.f;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.recyclerview.widget.h0;
import c0.AbstractC0396a;
import com.google.android.material.navigation.NavigationView;
import d0.ViewOnApplyWindowInsetsListenerC2262a;
import d0.b;
import d0.c;
import d0.e;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.a1;
import z3.C3018c;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements d {

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f5134R = {R.attr.colorPrimaryDark};

    /* renamed from: S, reason: collision with root package name */
    public static final int[] f5135S = {R.attr.layout_gravity};

    /* renamed from: T, reason: collision with root package name */
    public static final boolean f5136T;

    /* renamed from: U, reason: collision with root package name */
    public static final boolean f5137U;

    /* renamed from: V, reason: collision with root package name */
    public static final boolean f5138V;

    /* renamed from: C, reason: collision with root package name */
    public int f5139C;

    /* renamed from: D, reason: collision with root package name */
    public int f5140D;

    /* renamed from: E, reason: collision with root package name */
    public int f5141E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f5142F;

    /* renamed from: G, reason: collision with root package name */
    public b f5143G;

    /* renamed from: H, reason: collision with root package name */
    public ArrayList f5144H;

    /* renamed from: I, reason: collision with root package name */
    public float f5145I;

    /* renamed from: J, reason: collision with root package name */
    public float f5146J;

    /* renamed from: K, reason: collision with root package name */
    public Drawable f5147K;

    /* renamed from: L, reason: collision with root package name */
    public WindowInsets f5148L;
    public boolean M;

    /* renamed from: N, reason: collision with root package name */
    public final ArrayList f5149N;

    /* renamed from: O, reason: collision with root package name */
    public Rect f5150O;

    /* renamed from: P, reason: collision with root package name */
    public Matrix f5151P;

    /* renamed from: Q, reason: collision with root package name */
    public final j f5152Q;

    /* renamed from: a, reason: collision with root package name */
    public final A f5153a;

    /* renamed from: b, reason: collision with root package name */
    public float f5154b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5155c;

    /* renamed from: d, reason: collision with root package name */
    public int f5156d;

    /* renamed from: e, reason: collision with root package name */
    public float f5157e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f5158f;

    /* renamed from: g, reason: collision with root package name */
    public final f f5159g;

    /* renamed from: h, reason: collision with root package name */
    public final f f5160h;
    public final e i;

    /* renamed from: j, reason: collision with root package name */
    public final e f5161j;

    /* renamed from: k, reason: collision with root package name */
    public int f5162k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5163l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5164m;

    /* renamed from: n, reason: collision with root package name */
    public int f5165n;

    static {
        int i = Build.VERSION.SDK_INT;
        f5136T = true;
        f5137U = true;
        f5138V = i >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.apm.insight.R.attr.drawerLayoutStyle);
        this.f5153a = new A(5);
        this.f5156d = -1728053248;
        this.f5158f = new Paint();
        this.f5164m = true;
        this.f5165n = 3;
        this.f5139C = 3;
        this.f5140D = 3;
        this.f5141E = 3;
        this.f5152Q = new j(25, this);
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.f5155c = (int) ((64.0f * f2) + 0.5f);
        float f5 = f2 * 400.0f;
        e eVar = new e(this, 3);
        this.i = eVar;
        e eVar2 = new e(this, 5);
        this.f5161j = eVar2;
        f fVar = new f(getContext(), this, eVar);
        fVar.f4125b = (int) (fVar.f4125b * 1.0f);
        this.f5159g = fVar;
        fVar.f4139q = 1;
        fVar.f4136n = f5;
        eVar.f19710e = fVar;
        f fVar2 = new f(getContext(), this, eVar2);
        fVar2.f4125b = (int) (1.0f * fVar2.f4125b);
        this.f5160h = fVar2;
        fVar2.f4139q = 2;
        fVar2.f4136n = f5;
        eVar2.f19710e = fVar2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = O.f3270a;
        setImportantForAccessibility(1);
        O.m(this, new h0(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC2262a());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f5134R);
            try {
                this.f5147K = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0396a.f5881a, com.apm.insight.R.attr.drawerLayoutStyle, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.f5154b = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f5154b = getResources().getDimension(com.apm.insight.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f5149N = new ArrayList();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static String h(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static boolean i(View view) {
        WeakHashMap weakHashMap = O.f3270a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    public static boolean j(View view) {
        return ((c) view.getLayoutParams()).f19700a == 0;
    }

    public static boolean k(View view) {
        if (l(view)) {
            return (((c) view.getLayoutParams()).f19703d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean l(View view) {
        int i = ((c) view.getLayoutParams()).f19700a;
        WeakHashMap weakHashMap = O.f3270a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final boolean a(int i, View view) {
        return (g(view) & i) == i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i3) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i6 = 0;
        boolean z6 = false;
        while (true) {
            arrayList2 = this.f5149N;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (!l(childAt)) {
                arrayList2.add(childAt);
            } else if (k(childAt)) {
                childAt.addFocusables(arrayList, i, i3);
                z6 = true;
            }
            i6++;
        }
        if (!z6) {
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = (View) arrayList2.get(i7);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i3);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view, i, layoutParams);
        int childCount = getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i3);
            if ((((c) childAt.getLayoutParams()).f19703d & 1) == 1) {
                break;
            } else {
                i3++;
            }
        }
        if (childAt != null || l(view)) {
            WeakHashMap weakHashMap = O.f3270a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = O.f3270a;
            view.setImportantForAccessibility(1);
        }
        if (f5136T) {
            return;
        }
        O.m(view, this.f5153a);
    }

    public final void b(View view, boolean z6) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        c cVar = (c) view.getLayoutParams();
        if (this.f5164m) {
            cVar.f19701b = 0.0f;
            cVar.f19703d = 0;
        } else if (z6) {
            cVar.f19703d |= 4;
            if (a(3, view)) {
                this.f5159g.s(view, -view.getWidth(), view.getTop());
            } else {
                this.f5160h.s(view, getWidth(), view.getTop());
            }
        } else {
            float f2 = ((c) view.getLayoutParams()).f19701b;
            float width = view.getWidth();
            int i = ((int) (width * 0.0f)) - ((int) (f2 * width));
            if (!a(3, view)) {
                i = -i;
            }
            view.offsetLeftAndRight(i);
            o(view, 0.0f);
            r(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public final void c(boolean z6) {
        int childCount = getChildCount();
        boolean zS = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            c cVar = (c) childAt.getLayoutParams();
            if (l(childAt) && (!z6 || cVar.f19702c)) {
                zS |= a(3, childAt) ? this.f5159g.s(childAt, -childAt.getWidth(), childAt.getTop()) : this.f5160h.s(childAt, getWidth(), childAt.getTop());
                cVar.f19702c = false;
            }
        }
        e eVar = this.i;
        eVar.f19712g.removeCallbacks(eVar.f19711f);
        e eVar2 = this.f5161j;
        eVar2.f19712g.removeCallbacks(eVar2.f19711f);
        if (zS) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof c) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((c) getChildAt(i).getLayoutParams()).f19701b);
        }
        this.f5157e = fMax;
        boolean zG = this.f5159g.g();
        boolean zG2 = this.f5160h.g();
        if (zG || zG2) {
            WeakHashMap weakHashMap = O.f3270a;
            postInvalidateOnAnimation();
        }
    }

    public final View d(int i) {
        WeakHashMap weakHashMap = O.f3270a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((g(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f5157e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x6 = motionEvent.getX();
        float y3 = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.f5150O == null) {
                this.f5150O = new Rect();
            }
            childAt.getHitRect(this.f5150O);
            if (this.f5150O.contains((int) x6, (int) y3) && !j(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f5151P == null) {
                            this.f5151P = new Matrix();
                        }
                        matrix.invert(this.f5151P);
                        motionEventObtain.transform(this.f5151P);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        Drawable background;
        int height = getHeight();
        boolean zJ = j(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zJ) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && l(childAt) && childAt.getHeight() >= height) {
                    if (a(3, childAt)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i = i3;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j6);
        canvas.restoreToCount(iSave);
        float f2 = this.f5157e;
        if (f2 > 0.0f && zJ) {
            int i7 = this.f5156d;
            Paint paint = this.f5158f;
            paint.setColor((((int) ((((-16777216) & i7) >>> 24) * f2)) << 24) | (i7 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final View e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (l(childAt)) {
                if (!l(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((c) childAt.getLayoutParams()).f19701b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public final int f(View view) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i = ((c) view.getLayoutParams()).f19700a;
        WeakHashMap weakHashMap = O.f3270a;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i3 = this.f5165n;
            if (i3 != 3) {
                return i3;
            }
            int i6 = layoutDirection == 0 ? this.f5140D : this.f5141E;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        }
        if (i == 5) {
            int i7 = this.f5139C;
            if (i7 != 3) {
                return i7;
            }
            int i8 = layoutDirection == 0 ? this.f5141E : this.f5140D;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        }
        if (i == 8388611) {
            int i9 = this.f5140D;
            if (i9 != 3) {
                return i9;
            }
            int i10 = layoutDirection == 0 ? this.f5165n : this.f5139C;
            if (i10 != 3) {
                return i10;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i11 = this.f5141E;
        if (i11 != 3) {
            return i11;
        }
        int i12 = layoutDirection == 0 ? this.f5139C : this.f5165n;
        if (i12 != 3) {
            return i12;
        }
        return 0;
    }

    public final int g(View view) {
        int i = ((c) view.getLayoutParams()).f19700a;
        WeakHashMap weakHashMap = O.f3270a;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c(-1, -1);
        cVar.f19700a = 0;
        return cVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof c) {
            c cVar = (c) layoutParams;
            c cVar2 = new c(cVar);
            cVar2.f19700a = 0;
            cVar2.f19700a = cVar.f19700a;
            return cVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c cVar3 = new c((ViewGroup.MarginLayoutParams) layoutParams);
            cVar3.f19700a = 0;
            return cVar3;
        }
        c cVar4 = new c(layoutParams);
        cVar4.f19700a = 0;
        return cVar4;
    }

    public float getDrawerElevation() {
        if (f5137U) {
            return this.f5154b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f5147K;
    }

    public final void m(View view) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        c cVar = (c) view.getLayoutParams();
        if (this.f5164m) {
            cVar.f19701b = 1.0f;
            cVar.f19703d = 1;
            q(view, true);
            p(view);
        } else {
            cVar.f19703d |= 2;
            if (a(3, view)) {
                this.f5159g.s(view, 0, view.getTop());
            } else {
                this.f5160h.s(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void n(int i, int i3) {
        View viewD;
        WeakHashMap weakHashMap = O.f3270a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, getLayoutDirection());
        if (i3 == 3) {
            this.f5165n = i;
        } else if (i3 == 5) {
            this.f5139C = i;
        } else if (i3 == 8388611) {
            this.f5140D = i;
        } else if (i3 == 8388613) {
            this.f5141E = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.f5159g : this.f5160h).a();
        }
        if (i != 1) {
            if (i == 2 && (viewD = d(absoluteGravity)) != null) {
                m(viewD);
                return;
            }
            return;
        }
        View viewD2 = d(absoluteGravity);
        if (viewD2 != null) {
            b(viewD2, true);
        }
    }

    public final void o(View view, float f2) {
        c cVar = (c) view.getLayoutParams();
        if (f2 == cVar.f19701b) {
            return;
        }
        cVar.f19701b = f2;
        ArrayList arrayList = this.f5144H;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) this.f5144H.get(size)).getClass();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5164m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5164m = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.M || this.f5147K == null) {
            return;
        }
        WindowInsets windowInsets = this.f5148L;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f5147K.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f5147K.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            X.f r1 = r8.f5159g
            boolean r2 = r1.r(r9)
            X.f r3 = r8.f5160h
            boolean r3 = r3.r(r9)
            r2 = r2 | r3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L65
            if (r0 == r3) goto L5e
            r9 = 2
            if (r0 == r9) goto L1e
            r9 = 3
            if (r0 == r9) goto L5e
            goto L63
        L1e:
            float[] r9 = r1.f4127d
            int r9 = r9.length
            r0 = r4
        L22:
            if (r0 >= r9) goto L63
            int r5 = r1.f4133k
            int r6 = r3 << r0
            r5 = r5 & r6
            if (r5 == 0) goto L5b
            float[] r5 = r1.f4129f
            r5 = r5[r0]
            float[] r6 = r1.f4127d
            r6 = r6[r0]
            float r5 = r5 - r6
            float[] r6 = r1.f4130g
            r6 = r6[r0]
            float[] r7 = r1.f4128e
            r7 = r7[r0]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r1.f4125b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L5b
            d0.e r9 = r8.i
            androidx.drawerlayout.widget.DrawerLayout r0 = r9.f19712g
            C0.k r9 = r9.f19711f
            r0.removeCallbacks(r9)
            d0.e r9 = r8.f5161j
            androidx.drawerlayout.widget.DrawerLayout r0 = r9.f19712g
            C0.k r9 = r9.f19711f
            r0.removeCallbacks(r9)
            goto L63
        L5b:
            int r0 = r0 + 1
            goto L22
        L5e:
            r8.c(r3)
            r8.f5142F = r4
        L63:
            r9 = r4
            goto L8b
        L65:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.f5145I = r0
            r8.f5146J = r9
            float r5 = r8.f5157e
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L88
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r1.h(r0, r9)
            if (r9 == 0) goto L88
            boolean r9 = j(r9)
            if (r9 == 0) goto L88
            r9 = r3
            goto L89
        L88:
            r9 = r4
        L89:
            r8.f5142F = r4
        L8b:
            if (r2 != 0) goto Lae
            if (r9 != 0) goto Lae
            int r9 = r8.getChildCount()
            r0 = r4
        L94:
            if (r0 >= r9) goto La8
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            d0.c r1 = (d0.c) r1
            boolean r1 = r1.f19702c
            if (r1 == 0) goto La5
            goto Lae
        La5:
            int r0 = r0 + 1
            goto L94
        La8:
            boolean r9 = r8.f5142F
            if (r9 == 0) goto Lad
            goto Lae
        Lad:
            return r4
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || e() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewE = e();
        if (viewE != null && f(viewE) == 0) {
            c(false);
        }
        return viewE != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        WindowInsets rootWindowInsets;
        float f2;
        int i8;
        boolean z7 = true;
        this.f5163l = true;
        int i9 = i6 - i;
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (j(childAt)) {
                    int i11 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                    childAt.layout(i11, ((ViewGroup.MarginLayoutParams) cVar).topMargin, childAt.getMeasuredWidth() + i11, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) cVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(3, childAt)) {
                        float f5 = measuredWidth;
                        i8 = (-measuredWidth) + ((int) (cVar.f19701b * f5));
                        f2 = (measuredWidth + i8) / f5;
                    } else {
                        float f6 = measuredWidth;
                        f2 = (i9 - r11) / f6;
                        i8 = i9 - ((int) (cVar.f19701b * f6));
                    }
                    boolean z8 = f2 != cVar.f19701b ? z7 : false;
                    int i12 = cVar.f19700a & 112;
                    if (i12 == 16) {
                        int i13 = i7 - i3;
                        int i14 = (i13 - measuredHeight) / 2;
                        int i15 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
                        if (i14 < i15) {
                            i14 = i15;
                        } else {
                            int i16 = i14 + measuredHeight;
                            int i17 = i13 - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
                            if (i16 > i17) {
                                i14 = i17 - measuredHeight;
                            }
                        }
                        childAt.layout(i8, i14, measuredWidth + i8, measuredHeight + i14);
                    } else if (i12 != 80) {
                        int i18 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
                        childAt.layout(i8, i18, measuredWidth + i8, measuredHeight + i18);
                    } else {
                        int i19 = i7 - i3;
                        childAt.layout(i8, (i19 - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i8, i19 - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
                    }
                    if (z8) {
                        o(childAt, f2);
                    }
                    int i20 = cVar.f19701b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i20) {
                        childAt.setVisibility(i20);
                    }
                }
            }
            i10++;
            z7 = true;
        }
        if (f5138V && (rootWindowInsets = getRootWindowInsets()) != null) {
            J.c cVarI = r0.g(null, rootWindowInsets).f3359a.i();
            f fVar = this.f5159g;
            fVar.f4137o = Math.max(fVar.f4138p, cVarI.f2007a);
            f fVar2 = this.f5160h;
            fVar2.f4137o = Math.max(fVar2.f4138p, cVarI.f2009c);
        }
        this.f5163l = false;
        this.f5164m = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewD;
        if (!(parcelable instanceof d0.d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d0.d dVar = (d0.d) parcelable;
        super.onRestoreInstanceState(dVar.f3954a);
        int i = dVar.f19704c;
        if (i != 0 && (viewD = d(i)) != null) {
            m(viewD);
        }
        int i3 = dVar.f19705d;
        if (i3 != 3) {
            n(i3, 3);
        }
        int i6 = dVar.f19706e;
        if (i6 != 3) {
            n(i6, 5);
        }
        int i7 = dVar.f19707f;
        if (i7 != 3) {
            n(i7, 8388611);
        }
        int i8 = dVar.f19708g;
        if (i8 != 3) {
            n(i8, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (f5137U) {
            return;
        }
        WeakHashMap weakHashMap = O.f3270a;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        d0.d dVar = new d0.d(super.onSaveInstanceState());
        dVar.f19704c = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            c cVar = (c) getChildAt(i).getLayoutParams();
            int i3 = cVar.f19703d;
            boolean z6 = i3 == 1;
            boolean z7 = i3 == 2;
            if (z6 || z7) {
                dVar.f19704c = cVar.f19700a;
                break;
            }
        }
        dVar.f19705d = this.f5165n;
        dVar.f19706e = this.f5139C;
        dVar.f19707f = this.f5140D;
        dVar.f19708g = this.f5141E;
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            X.f r0 = r6.f5159g
            r0.k(r7)
            X.f r1 = r6.f5160h
            r1.k(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L70
            if (r1 == r3) goto L20
            r7 = 3
            if (r1 == r7) goto L1a
            return r3
        L1a:
            r6.c(r3)
            r6.f5142F = r2
            return r3
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.h(r4, r5)
            if (r4 == 0) goto L6b
            boolean r4 = j(r4)
            if (r4 == 0) goto L6b
            float r4 = r6.f5145I
            float r1 = r1 - r4
            float r4 = r6.f5146J
            float r7 = r7 - r4
            int r0 = r0.f4125b
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L6b
            int r7 = r6.getChildCount()
            r0 = r2
        L4c:
            if (r0 >= r7) goto L61
            android.view.View r1 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            d0.c r4 = (d0.c) r4
            int r4 = r4.f19703d
            r4 = r4 & r3
            if (r4 != r3) goto L5e
            goto L62
        L5e:
            int r0 = r0 + 1
            goto L4c
        L61:
            r1 = 0
        L62:
            if (r1 == 0) goto L6b
            int r7 = r6.f(r1)
            r0 = 2
            if (r7 != r0) goto L6c
        L6b:
            r2 = r3
        L6c:
            r6.c(r2)
            return r3
        L70:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f5145I = r0
            r6.f5146J = r7
            r6.f5142F = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(View view) {
        S.c cVar = S.c.f3437l;
        O.j(cVar.a(), view);
        O.h(0, view);
        if (!k(view) || f(view) == 2) {
            return;
        }
        O.k(view, cVar, this.f5152Q);
    }

    public final void q(View view, boolean z6) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z6 || l(childAt)) && !(z6 && childAt == view)) {
                WeakHashMap weakHashMap = O.f3270a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = O.f3270a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public final void r(int i, View view) {
        int i3;
        View rootView;
        int i6 = this.f5159g.f4124a;
        int i7 = this.f5160h.f4124a;
        if (i6 == 1 || i7 == 1) {
            i3 = 1;
        } else {
            i3 = 2;
            if (i6 != 2 && i7 != 2) {
                i3 = 0;
            }
        }
        if (view != null && i == 0) {
            float f2 = ((c) view.getLayoutParams()).f19701b;
            if (f2 == 0.0f) {
                c cVar = (c) view.getLayoutParams();
                if ((cVar.f19703d & 1) == 1) {
                    cVar.f19703d = 0;
                    ArrayList arrayList = this.f5144H;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            NavigationView navigationView = ((A3.A) ((b) this.f5144H.get(size))).f357a;
                            if (view == navigationView) {
                                a1 a1Var = navigationView.f18411L;
                                C3018c c3018c = (C3018c) a1Var.f22479b;
                                if (c3018c != null) {
                                    c3018c.c((View) a1Var.f22481d);
                                }
                                if (navigationView.f18407H && navigationView.f18406G != 0) {
                                    navigationView.f18406G = 0;
                                    navigationView.g(navigationView.getWidth(), navigationView.getHeight());
                                }
                            }
                        }
                    }
                    q(view, false);
                    p(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f2 == 1.0f) {
                c cVar2 = (c) view.getLayoutParams();
                if ((cVar2.f19703d & 1) == 0) {
                    cVar2.f19703d = 1;
                    ArrayList arrayList2 = this.f5144H;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            NavigationView navigationView2 = ((A3.A) ((b) this.f5144H.get(size2))).f357a;
                            if (view == navigationView2) {
                                a1 a1Var2 = navigationView2.f18411L;
                                Objects.requireNonNull(a1Var2);
                                view.post(new z(0, a1Var2));
                            }
                        }
                    }
                    q(view, true);
                    p(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i3 != this.f5162k) {
            this.f5162k = i3;
            ArrayList arrayList3 = this.f5144H;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((b) this.f5144H.get(size3)).getClass();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        super.requestDisallowInterceptTouchEvent(z6);
        if (z6) {
            c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f5163l) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f2) {
        this.f5154b = f2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (l(childAt)) {
                float f5 = this.f5154b;
                WeakHashMap weakHashMap = O.f3270a;
                F.j(childAt, f5);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(b bVar) {
        ArrayList arrayList;
        b bVar2 = this.f5143G;
        if (bVar2 != null && (arrayList = this.f5144H) != null) {
            arrayList.remove(bVar2);
        }
        if (bVar != null) {
            if (this.f5144H == null) {
                this.f5144H = new ArrayList();
            }
            this.f5144H.add(bVar);
        }
        this.f5143G = bVar;
    }

    public void setDrawerLockMode(int i) {
        n(i, 3);
        n(i, 5);
    }

    public void setScrimColor(int i) {
        this.f5156d = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f5147K = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f5147K = new ColorDrawable(i);
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f5147K = i != 0 ? getContext().getDrawable(i) : null;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        c cVar = new c(context, attributeSet);
        cVar.f19700a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5135S);
        cVar.f19700a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }
}
