package com.google.android.material.timepicker;

import C.o;
import R.O;
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
import com.apm.insight.R;
import d3.AbstractC2266a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class ClockFaceView extends h implements f {

    /* renamed from: J, reason: collision with root package name */
    public final ClockHandView f18568J;

    /* renamed from: K, reason: collision with root package name */
    public final Rect f18569K;

    /* renamed from: L, reason: collision with root package name */
    public final RectF f18570L;
    public final Rect M;

    /* renamed from: N, reason: collision with root package name */
    public final SparseArray f18571N;

    /* renamed from: O, reason: collision with root package name */
    public final c f18572O;

    /* renamed from: P, reason: collision with root package name */
    public final int[] f18573P;

    /* renamed from: Q, reason: collision with root package name */
    public final float[] f18574Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f18575R;

    /* renamed from: S, reason: collision with root package name */
    public final int f18576S;

    /* renamed from: T, reason: collision with root package name */
    public final int f18577T;

    /* renamed from: U, reason: collision with root package name */
    public final int f18578U;

    /* renamed from: V, reason: collision with root package name */
    public final String[] f18579V;

    /* renamed from: W, reason: collision with root package name */
    public float f18580W;

    /* renamed from: a0, reason: collision with root package name */
    public final ColorStateList f18581a0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18569K = new Rect();
        this.f18570L = new RectF();
        this.M = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f18571N = sparseArray;
        this.f18574Q = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2266a.f19755j, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListN = com.bumptech.glide.c.n(context, typedArrayObtainStyledAttributes, 1);
        this.f18581a0 = colorStateListN;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f18568J = clockHandView;
        this.f18575R = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListN.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListN.getDefaultColor());
        this.f18573P = new int[]{colorForState, colorForState, colorStateListN.getDefaultColor()};
        clockHandView.f18585c.add(this);
        int defaultColor = G.c.b(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListN2 = com.bumptech.glide.c.n(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListN2 != null ? colorStateListN2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.f18572O = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f18579V = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z6 = false;
        for (int i = 0; i < Math.max(this.f18579V.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f18579V.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f18579V[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i3 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i3));
                z6 = i3 > 1 ? true : z6;
                O.m(textView, this.f18572O);
                textView.setTextColor(this.f18581a0);
            }
        }
        ClockHandView clockHandView2 = this.f18568J;
        if (clockHandView2.f18584b && !z6) {
            clockHandView2.f18594m = 1;
        }
        clockHandView2.f18584b = z6;
        clockHandView2.invalidate();
        this.f18576S = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f18577T = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f18578U = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.h
    public final void m() {
        o oVar = new o();
        oVar.b(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i3 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i3 == null) {
                    i3 = 1;
                }
                if (!map.containsKey(i3)) {
                    map.put(i3, new ArrayList());
                }
                ((List) map.get(i3)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f18603H * 0.66f) : this.f18603H;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer numValueOf = Integer.valueOf(id);
                HashMap map2 = oVar.f1011c;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id), new C.j());
                }
                C.k kVar = ((C.j) map2.get(Integer.valueOf(id))).f912d;
                kVar.f979z = R.id.circle_center;
                kVar.f916A = iRound;
                kVar.f917B = size;
                size += 360.0f / list.size();
            }
        }
        oVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i6 = 0;
        while (true) {
            SparseArray sparseArray = this.f18571N;
            if (i6 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i6)).setVisibility(0);
            i6++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.f18568J.f18589g;
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f18571N;
            int size = sparseArray.size();
            rect = this.f18569K;
            rectF = this.f18570L;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f2) {
                    textView = textView2;
                    f2 = fHeight;
                }
            }
            i++;
        }
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            TextView textView3 = (TextView) sparseArray.get(i3);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.M);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f18573P, this.f18574Q, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) U0.j.q(1, this.f18579V.length, 1, false).f3677b);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        super.onLayout(z6, i, i3, i6, i7);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i3) throws Resources.NotFoundException, NumberFormatException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f18578U / Math.max(Math.max(this.f18576S / displayMetrics.heightPixels, this.f18577T / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
