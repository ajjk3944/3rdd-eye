package com.google.android.material.timepicker;

import L0.I;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.timepicker.ClockHandView;
import h4.C4415c;
import java.util.Arrays;
import z0.C5848a;

/* loaded from: classes2.dex */
class ClockFaceView extends c implements ClockHandView.a {

    /* renamed from: A, reason: collision with root package name */
    public final SparseArray<TextView> f23161A;

    /* renamed from: B, reason: collision with root package name */
    public final b f23162B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f23163C;

    /* renamed from: D, reason: collision with root package name */
    public final float[] f23164D;

    /* renamed from: E, reason: collision with root package name */
    public final int f23165E;

    /* renamed from: F, reason: collision with root package name */
    public final int f23166F;

    /* renamed from: G, reason: collision with root package name */
    public final int f23167G;

    /* renamed from: H, reason: collision with root package name */
    public final int f23168H;

    /* renamed from: I, reason: collision with root package name */
    public final String[] f23169I;

    /* renamed from: J, reason: collision with root package name */
    public float f23170J;

    /* renamed from: K, reason: collision with root package name */
    public final ColorStateList f23171K;

    /* renamed from: w, reason: collision with root package name */
    public final ClockHandView f23172w;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f23173x;

    /* renamed from: y, reason: collision with root package name */
    public final RectF f23174y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f23175z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f23173x = new Rect();
        this.f23174y = new RectF();
        this.f23175z = new Rect();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.f23161A = sparseArray;
        this.f23164D = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K3.a.f3118e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListA = C4415c.a(context, typedArrayObtainStyledAttributes, 1);
        this.f23171K = colorStateListA;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f23172w = clockHandView;
        this.f23165E = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListA.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.f23163C = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.f23178d.add(this);
        int defaultColor = C5848a.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListA2 = C4415c.a(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f23162B = new b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f23169I = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z10 = false;
        for (int i = 0; i < Math.max(this.f23169I.length, size); i++) {
            TextView textView = sparseArray.get(i);
            if (i >= this.f23169I.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f23169I[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i10 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i10));
                z10 = i10 > 1 ? true : z10;
                I.o(textView, this.f23162B);
                textView.setTextColor(this.f23171K);
            }
        }
        ClockHandView clockHandView2 = this.f23172w;
        if (clockHandView2.f23177c && !z10) {
            clockHandView2.f23187n = 1;
        }
        clockHandView2.f23177c = z10;
        clockHandView2.invalidate();
        this.f23166F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f23167G = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f23168H = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.a
    public final void a(float f10) {
        if (Math.abs(this.f23170J - f10) > 0.001f) {
            this.f23170J = f10;
            i();
        }
    }

    @Override // com.google.android.material.timepicker.c
    public final void h() {
        super.h();
        int i = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.f23161A;
            if (i >= sparseArray.size()) {
                return;
            }
            sparseArray.get(i).setVisibility(0);
            i++;
        }
    }

    public final void i() {
        SparseArray<TextView> sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f23172w.f23182h;
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f23161A;
            int size = sparseArray.size();
            rectF = this.f23174y;
            rect = this.f23173x;
            if (i >= size) {
                break;
            }
            TextView textView2 = sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f10) {
                    textView = textView2;
                    f10 = fHeight;
                }
            }
            i++;
        }
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            TextView textView3 = sparseArray.get(i10);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f23175z);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f23163C, this.f23164D, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f23169I.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        super.onLayout(z10, i, i10, i11, i12);
        i();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i10) throws Resources.NotFoundException, NumberFormatException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f23168H / Math.max(Math.max(this.f23166F / displayMetrics.heightPixels, this.f23167G / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
