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
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import c3.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u3.i0;

/* loaded from: classes.dex */
class ClockFaceView extends h implements f {
    public final ClockHandView P;
    public final Rect Q;
    public final RectF R;
    public final Rect S;
    public final SparseArray T;
    public final c U;
    public final int[] V;
    public final float[] W;

    /* renamed from: a0, reason: collision with root package name */
    public final int f5776a0;

    /* renamed from: b0, reason: collision with root package name */
    public final int f5777b0;

    /* renamed from: c0, reason: collision with root package name */
    public final int f5778c0;

    /* renamed from: d0, reason: collision with root package name */
    public final int f5779d0;

    /* renamed from: e0, reason: collision with root package name */
    public final String[] f5780e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f5781f0;

    /* renamed from: g0, reason: collision with root package name */
    public final ColorStateList f5782g0;

    /* JADX WARN: Illegal instructions before constructor call */
    public ClockFaceView(Context context, AttributeSet attributeSet) {
        int i10 = ed.b.materialClockStyle;
        super(context, attributeSet, i10);
        this.Q = new Rect();
        this.R = new RectF();
        this.S = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.T = sparseArray;
        this.W = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ed.l.ClockFaceView, i10, ed.k.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListQ = xu.l.q(context, typedArrayObtainStyledAttributes, ed.l.ClockFaceView_clockNumberTextColor);
        this.f5782g0 = colorStateListQ;
        LayoutInflater.from(context).inflate(ed.h.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(ed.f.material_clock_hand);
        this.P = clockHandView;
        this.f5776a0 = resources.getDimensionPixelSize(ed.d.material_clock_hand_padding);
        int colorForState = colorStateListQ.getColorForState(new int[]{R.attr.state_selected}, colorStateListQ.getDefaultColor());
        this.V = new int[]{colorForState, colorForState, colorStateListQ.getDefaultColor()};
        clockHandView.f5785g.add(this);
        int defaultColor = h3.c.c(context, ed.c.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListQ2 = xu.l.q(context, typedArrayObtainStyledAttributes, ed.l.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateListQ2 != null ? colorStateListQ2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.U = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f5780e0 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.f5780e0.length, size); i11++) {
            TextView textView = (TextView) sparseArray.get(i11);
            if (i11 >= this.f5780e0.length) {
                removeView(textView);
                sparseArray.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(ed.h.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.f5780e0[i11]);
                textView.setTag(ed.f.material_value_index, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(ed.f.material_clock_level, Integer.valueOf(i12));
                z10 = i12 > 1 ? true : z10;
                i0.n(textView, this.U);
                textView.setTextColor(this.f5782g0);
            }
        }
        ClockHandView clockHandView2 = this.P;
        if (clockHandView2.f5784d && !z10) {
            clockHandView2.I = 1;
        }
        clockHandView2.f5784d = z10;
        clockHandView2.invalidate();
        this.f5777b0 = resources.getDimensionPixelSize(ed.d.material_time_picker_minimum_screen_height);
        this.f5778c0 = resources.getDimensionPixelSize(ed.d.material_time_picker_minimum_screen_width);
        this.f5779d0 = resources.getDimensionPixelSize(ed.d.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.h
    public final void m() {
        p pVar = new p();
        pVar.c(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != ed.f.circle_center && !"skip".equals(childAt.getTag())) {
                int i11 = (Integer) childAt.getTag(ed.f.material_clock_level);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.N * 0.66f) : this.N;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id2 = ((View) it.next()).getId();
                int i12 = ed.f.circle_center;
                Integer numValueOf = Integer.valueOf(id2);
                HashMap map2 = pVar.f3293c;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id2), new c3.k());
                }
                c3.l lVar = ((c3.k) map2.get(Integer.valueOf(id2))).f3220d;
                lVar.f3262z = i12;
                lVar.A = iRound;
                lVar.B = size;
                size += 360.0f / list.size();
            }
        }
        pVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i13 = 0;
        while (true) {
            SparseArray sparseArray = this.T;
            if (i13 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i13)).setVisibility(0);
            i13++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.P.B;
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        int i10 = 0;
        while (true) {
            sparseArray = this.T;
            int size = sparseArray.size();
            rect = this.Q;
            rectF = this.R;
            if (i10 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i10);
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
            i10++;
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            TextView textView3 = (TextView) sparseArray.get(i11);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.S);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.V, this.W, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) a2.a.a(1, this.f5780e0.length, 1).f28a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) throws Resources.NotFoundException, NumberFormatException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f5779d0 / Math.max(Math.max(this.f5777b0 / displayMetrics.heightPixels, this.f5778c0 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
