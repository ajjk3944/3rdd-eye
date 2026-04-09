package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class h extends ConstraintLayout {
    public final g M;
    public int N;
    public final ee.i O;

    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.material.timepicker.g] */
    public h(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(ed.h.material_radial_view_group, this);
        ee.i iVar = new ee.i();
        this.O = iVar;
        ee.j jVar = new ee.j(0.5f);
        bk.f fVarG = iVar.f8117d.f8097a.g();
        fVarG.f2807e = jVar;
        fVarG.f2808f = jVar;
        fVarG.f2809g = jVar;
        fVarG.f2810h = jVar;
        iVar.setShapeAppearanceModel(fVarG.b());
        this.O.q(ColorStateList.valueOf(-1));
        setBackground(this.O);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ed.l.RadialViewGroup, i10, 0);
        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(ed.l.RadialViewGroup_materialCircleRadius, 0);
        this.M = new Runnable() { // from class: com.google.android.material.timepicker.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f5793a.m();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.M;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.M;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.O.q(ColorStateList.valueOf(i10));
    }
}
