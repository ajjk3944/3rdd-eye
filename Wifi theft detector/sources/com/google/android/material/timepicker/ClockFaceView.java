package com.google.android.material.timepicker;

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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.material.timepicker.ClockHandView;
import j4.h;
import j4.k;
import j4.l;
import java.util.Arrays;
import s0.x;

/* loaded from: classes2.dex */
class ClockFaceView extends e implements ClockHandView.b {
    public final ClockHandView B;
    public final Rect C;
    public final RectF D;
    public final Rect E;
    public final SparseArray F;
    public final androidx.core.view.a G;
    public final int[] H;
    public final float[] I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public String[] N;
    public float O;
    public final ColorStateList P;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.F(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.B.i()) - ClockFaceView.this.J);
            return true;
        }
    }

    public class b extends androidx.core.view.a {
        public b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            int iIntValue = ((Integer) view.getTag(j4.f.material_value_index)).intValue();
            if (iIntValue > 0) {
                xVar.O0((View) ClockFaceView.this.F.get(iIntValue - 1));
            }
            xVar.p0(x.f.a(0, 1, iIntValue, 1, false, view.isSelected()));
            xVar.n0(true);
            xVar.b(x.a.f24200i);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.j(view, i10, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.C);
            float fCenterX = ClockFaceView.this.C.centerX();
            float fCenterY = ClockFaceView.this.C.centerY();
            ClockFaceView.this.B.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.B.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(@NonNull Context context) {
        this(context, null);
    }

    public static float Q(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    @Override // com.google.android.material.timepicker.e
    public void F(int i10) {
        if (i10 != E()) {
            super.F(i10);
            this.B.m(E());
        }
    }

    @Override // com.google.android.material.timepicker.e
    public void H() {
        super.H();
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            ((TextView) this.F.get(i10)).setVisibility(0);
        }
    }

    public final void N() {
        RectF rectFE = this.B.e();
        TextView textViewP = P(rectFE);
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            TextView textView = (TextView) this.F.get(i10);
            if (textView != null) {
                textView.setSelected(textView == textViewP);
                textView.getPaint().setShader(O(rectFE, textView));
                textView.invalidate();
            }
        }
    }

    public final RadialGradient O(RectF rectF, TextView textView) {
        textView.getHitRect(this.C);
        this.D.set(this.C);
        textView.getLineBounds(0, this.E);
        RectF rectF2 = this.D;
        Rect rect = this.E;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.D)) {
            return new RadialGradient(rectF.centerX() - this.D.left, rectF.centerY() - this.D.top, rectF.width() * 0.5f, this.H, this.I, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public final TextView P(RectF rectF) {
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            TextView textView2 = (TextView) this.F.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.C);
                this.D.set(this.C);
                this.D.union(rectF);
                float fWidth = this.D.width() * this.D.height();
                if (fWidth < f10) {
                    textView = textView2;
                    f10 = fWidth;
                }
            }
        }
        return textView;
    }

    public void R(String[] strArr, int i10) {
        this.N = strArr;
        S(i10);
    }

    public final void S(int i10) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.F.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.N.length, size); i11++) {
            TextView textView = (TextView) this.F.get(i11);
            if (i11 >= this.N.length) {
                removeView(textView);
                this.F.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(h.material_clockface_textview, (ViewGroup) this, false);
                    this.F.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.N[i11]);
                textView.setTag(j4.f.material_value_index, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(j4.f.material_clock_level, Integer.valueOf(i12));
                if (i12 > 1) {
                    z10 = true;
                }
                ViewCompat.j0(textView, this.G);
                textView.setTextColor(this.P);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.N[i11]));
                }
            }
        }
        this.B.q(z10);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f10, boolean z10) {
        if (Math.abs(this.O - f10) > 0.001f) {
            this.O = f10;
            N();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        x.R0(accessibilityNodeInfo).o0(x.e.b(1, this.N.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        N();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iQ = (int) (this.M / Q(this.K / displayMetrics.heightPixels, this.L / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iQ, 1073741824);
        setMeasuredDimension(iQ, iQ);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, j4.b.materialClockStyle);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.C = new Rect();
        this.D = new RectF();
        this.E = new Rect();
        this.F = new SparseArray();
        this.I = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.ClockFaceView, i10, k.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListA = d5.c.a(context, typedArrayObtainStyledAttributes, l.ClockFaceView_clockNumberTextColor);
        this.P = colorStateListA;
        LayoutInflater.from(context).inflate(h.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(j4.f.material_clock_hand);
        this.B = clockHandView;
        this.J = resources.getDimensionPixelSize(j4.d.material_clock_hand_padding);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.H = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = d.a.a(context, j4.c.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListA2 = d5.c.a(context, typedArrayObtainStyledAttributes, l.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.G = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        R(strArr, 0);
        this.K = resources.getDimensionPixelSize(j4.d.material_time_picker_minimum_screen_height);
        this.L = resources.getDimensionPixelSize(j4.d.material_time_picker_minimum_screen_width);
        this.M = resources.getDimensionPixelSize(j4.d.material_clock_size);
    }
}
