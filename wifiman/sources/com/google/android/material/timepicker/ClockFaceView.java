package com.google.android.material.timepicker;

import F1.C2736a;
import F1.W;
import G1.t;
import O3.g;
import O3.i;
import O3.j;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import i.AbstractC6050a;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* loaded from: classes3.dex */
class ClockFaceView extends d implements ClockHandView.b {

    /* renamed from: A, reason: collision with root package name */
    private final ClockHandView f37908A;

    /* renamed from: B, reason: collision with root package name */
    private final Rect f37909B;

    /* renamed from: C, reason: collision with root package name */
    private final RectF f37910C;

    /* renamed from: D, reason: collision with root package name */
    private final Rect f37911D;

    /* renamed from: E, reason: collision with root package name */
    private final SparseArray f37912E;

    /* renamed from: F, reason: collision with root package name */
    private final C2736a f37913F;

    /* renamed from: G, reason: collision with root package name */
    private final int[] f37914G;

    /* renamed from: H, reason: collision with root package name */
    private final float[] f37915H;

    /* renamed from: I, reason: collision with root package name */
    private final int f37916I;

    /* renamed from: J, reason: collision with root package name */
    private final int f37917J;

    /* renamed from: N, reason: collision with root package name */
    private final int f37918N;

    /* renamed from: f1, reason: collision with root package name */
    private final int f37919f1;

    /* renamed from: g1, reason: collision with root package name */
    private String[] f37920g1;

    /* renamed from: h1, reason: collision with root package name */
    private float f37921h1;

    /* renamed from: i1, reason: collision with root package name */
    private final ColorStateList f37922i1;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.x(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f37908A.i()) - ClockFaceView.this.f37916I);
            return true;
        }
    }

    class b extends C2736a {
        b() {
        }

        @Override // F1.C2736a
        public void g(View view, t tVar) {
            super.g(view, tVar);
            int iIntValue = ((Integer) view.getTag(O3.e.f17086p)).intValue();
            if (iIntValue > 0) {
                tVar.O0((View) ClockFaceView.this.f37912E.get(iIntValue - 1));
            }
            tVar.j0(t.f.a(0, 1, iIntValue, 1, false, view.isSelected()));
            tVar.h0(true);
            tVar.b(t.a.f6796i);
        }

        @Override // F1.C2736a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.j(view, i10, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f37909B);
            float fCenterX = ClockFaceView.this.f37909B.centerX();
            float fCenterY = ClockFaceView.this.f37909B.centerY();
            ClockFaceView.this.f37908A.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.f37908A.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, O3.a.f16982u);
    }

    private void F() {
        RectF rectFE = this.f37908A.e();
        TextView textViewH = H(rectFE);
        for (int i10 = 0; i10 < this.f37912E.size(); i10++) {
            TextView textView = (TextView) this.f37912E.get(i10);
            if (textView != null) {
                textView.setSelected(textView == textViewH);
                textView.getPaint().setShader(G(rectFE, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient G(RectF rectF, TextView textView) {
        textView.getHitRect(this.f37909B);
        this.f37910C.set(this.f37909B);
        textView.getLineBounds(0, this.f37911D);
        RectF rectF2 = this.f37910C;
        Rect rect = this.f37911D;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f37910C)) {
            return new RadialGradient(rectF.centerX() - this.f37910C.left, rectF.centerY() - this.f37910C.top, rectF.width() * 0.5f, this.f37914G, this.f37915H, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private TextView H(RectF rectF) {
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.f37912E.size(); i10++) {
            TextView textView2 = (TextView) this.f37912E.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.f37909B);
                this.f37910C.set(this.f37909B);
                this.f37910C.union(rectF);
                float fWidth = this.f37910C.width() * this.f37910C.height();
                if (fWidth < f10) {
                    textView = textView2;
                    f10 = fWidth;
                }
            }
        }
        return textView;
    }

    private static float I(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    private void K(int i10) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.f37912E.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.f37920g1.length, size); i11++) {
            TextView textView = (TextView) this.f37912E.get(i11);
            if (i11 >= this.f37920g1.length) {
                removeView(textView);
                this.f37912E.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(g.f17101d, (ViewGroup) this, false);
                    this.f37912E.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.f37920g1[i11]);
                textView.setTag(O3.e.f17086p, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(O3.e.f17081k, Integer.valueOf(i12));
                if (i12 > 1) {
                    z10 = true;
                }
                W.m0(textView, this.f37913F);
                textView.setTextColor(this.f37922i1);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.f37920g1[i11]));
                }
            }
        }
        this.f37908A.q(z10);
    }

    public void J(String[] strArr, int i10) {
        this.f37920g1 = strArr;
        K(i10);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f10, boolean z10) {
        if (Math.abs(this.f37921h1 - f10) > 0.001f) {
            this.f37921h1 = f10;
            F();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        t.V0(accessibilityNodeInfo).i0(t.e.a(1, this.f37920g1.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        F();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int I10 = (int) (this.f37919f1 / I(this.f37917J / displayMetrics.heightPixels, this.f37918N / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(I10, 1073741824);
        setMeasuredDimension(I10, I10);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.d
    public void x(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (i10 != w()) {
            super.x(i10);
            this.f37908A.m(w());
        }
    }

    @Override // com.google.android.material.timepicker.d
    protected void z() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.z();
        for (int i10 = 0; i10 < this.f37912E.size(); i10++) {
            ((TextView) this.f37912E.get(i10)).setVisibility(0);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37909B = new Rect();
        this.f37910C = new RectF();
        this.f37911D = new Rect();
        this.f37912E = new SparseArray();
        this.f37915H = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f17299S0, i10, i.f17152n);
        Resources resources = getResources();
        ColorStateList colorStateListA = c4.c.a(context, typedArrayObtainStyledAttributes, j.f17315U0);
        this.f37922i1 = colorStateListA;
        LayoutInflater.from(context).inflate(g.f17102e, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(O3.e.f17080j);
        this.f37908A = clockHandView;
        this.f37916I = resources.getDimensionPixelSize(O3.c.f17035q);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.f37914G = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = AbstractC6050a.a(context, O3.b.f16989b).getDefaultColor();
        ColorStateList colorStateListA2 = c4.c.a(context, typedArrayObtainStyledAttributes, j.f17307T0);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f37913F = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        J(strArr, 0);
        this.f37917J = resources.getDimensionPixelSize(O3.c.f16997D);
        this.f37918N = resources.getDimensionPixelSize(O3.c.f16998E);
        this.f37919f1 = resources.getDimensionPixelSize(O3.c.f17037s);
    }
}
