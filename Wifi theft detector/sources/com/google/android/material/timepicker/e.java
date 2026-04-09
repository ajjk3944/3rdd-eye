package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import g5.i;
import j4.h;
import j4.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class e extends ConstraintLayout {
    public MaterialShapeDrawable A;

    /* renamed from: y, reason: collision with root package name */
    public final Runnable f11490y;

    /* renamed from: z, reason: collision with root package name */
    public int f11491z;

    public e(@NonNull Context context) {
        this(context, null);
    }

    public static boolean G(View view) {
        return "skip".equals(view.getTag());
    }

    public final void B(List list, androidx.constraintlayout.widget.c cVar, int i10) {
        Iterator it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            cVar.r(((View) it.next()).getId(), j4.f.circle_center, i10, size);
            size += 360.0f / list.size();
        }
    }

    public final Drawable C() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.A = materialShapeDrawable;
        materialShapeDrawable.f0(new i(0.5f));
        this.A.i0(ColorStateList.valueOf(-1));
        return this.A;
    }

    public int D(int i10) {
        return i10 == 2 ? Math.round(this.f11491z * 0.66f) : this.f11491z;
    }

    public int E() {
        return this.f11491z;
    }

    public void F(int i10) {
        this.f11491z = i10;
        H();
    }

    public void H() {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.o(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != j4.f.circle_center && !G(childAt)) {
                int i11 = (Integer) childAt.getTag(j4.f.material_clock_level);
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
            B((List) entry.getValue(), cVar, D(((Integer) entry.getKey()).intValue()));
        }
        cVar.i(this);
    }

    public final void I() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f11490y);
            handler.post(this.f11490y);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        I();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        H();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        I();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.A.i0(ColorStateList.valueOf(i10));
    }

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(h.material_radial_view_group, this);
        setBackground(C());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.RadialViewGroup, i10, 0);
        this.f11491z = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.RadialViewGroup_materialCircleRadius, 0);
        this.f11490y = new Runnable() { // from class: com.google.android.material.timepicker.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f11489a.H();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }
}
