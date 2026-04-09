package com.google.android.material.timepicker;

import G3.n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apm.insight.R;
import d3.AbstractC2266a;

/* loaded from: classes.dex */
public abstract class h extends ConstraintLayout {

    /* renamed from: G, reason: collision with root package name */
    public final g f18602G;

    /* renamed from: H, reason: collision with root package name */
    public int f18603H;

    /* renamed from: I, reason: collision with root package name */
    public final G3.j f18604I;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.g] */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        G3.j jVar = new G3.j();
        this.f18604I = jVar;
        G3.l lVar = new G3.l(0.5f);
        n nVarG = jVar.f1597b.f1560a.g();
        nVarG.f1616e = lVar;
        nVarG.f1617f = lVar;
        nVarG.f1618g = lVar;
        nVarG.f1619h = lVar;
        jVar.setShapeAppearanceModel(nVarG.a());
        this.f18604I.q(ColorStateList.valueOf(-1));
        setBackground(this.f18604I);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2266a.f19733K, R.attr.materialClockStyle, 0);
        this.f18603H = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f18602G = new Runnable() { // from class: com.google.android.material.timepicker.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f18601a.m();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.f18602G;
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
            g gVar = this.f18602G;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f18604I.q(ColorStateList.valueOf(i));
    }
}
