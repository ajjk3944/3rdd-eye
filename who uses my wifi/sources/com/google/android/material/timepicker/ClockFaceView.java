package com.google.android.material.timepicker;

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
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.e61;
import defpackage.gn0;
import defpackage.ii;
import defpackage.ji;
import defpackage.mn0;
import defpackage.ni;
import defpackage.ob1;
import defpackage.tf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
class ClockFaceView extends mn0 implements tf {
    public final RectF A;
    public final Rect B;
    public final SparseArray C;
    public final c D;
    public final int[] E;
    public final float[] F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final String[] K;
    public float L;
    public final ColorStateList M;
    public final ClockHandView y;
    public final Rect z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.z = new Rect();
        this.A = new RectF();
        this.B = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.C = sparseArray;
        this.F = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gn0.h, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListE = ob1.e(context, typedArrayObtainStyledAttributes, 1);
        this.M = colorStateListE;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.y = clockHandView;
        this.G = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListE.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListE.getDefaultColor());
        this.E = new int[]{colorForState, colorForState, colorStateListE.getDefaultColor()};
        clockHandView.h.add(this);
        int defaultColor = ob1.d(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListE2 = ob1.e(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListE2 != null ? colorStateListE2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.D = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.K = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.K.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.K.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.K[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                e61.l(textView, this.D);
                textView.setTextColor(this.M);
            }
        }
        ClockHandView clockHandView2 = this.y;
        if (clockHandView2.g && !z) {
            clockHandView2.r = 1;
        }
        clockHandView2.g = z;
        clockHandView2.invalidate();
        this.H = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.I = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.J = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // defpackage.mn0
    public final void m() {
        ni niVar = new ni();
        niVar.b(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.w * 0.66f) : this.w;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer numValueOf = Integer.valueOf(id);
                HashMap map2 = niVar.c;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id), new ii());
                }
                ji jiVar = ((ii) map2.get(Integer.valueOf(id))).d;
                jiVar.z = R.id.circle_center;
                jiVar.A = iRound;
                jiVar.B = size;
                size += 360.0f / list.size();
            }
        }
        niVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.C;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.y.l;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.C;
            int size = sparseArray.size();
            rect = this.z;
            rectF = this.A;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.B);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.E, this.F, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.K.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException, NumberFormatException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.J / Math.max(Math.max(this.H / displayMetrics.heightPixels, this.I / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
