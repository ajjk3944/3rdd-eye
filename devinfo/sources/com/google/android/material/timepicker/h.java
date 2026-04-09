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
import com.liuzh.deviceinfo.R;
import ed.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class h extends ConstraintLayout {

    /* renamed from: q, reason: collision with root package name */
    public final g f20673q;

    /* renamed from: r, reason: collision with root package name */
    public int f20674r;

    /* renamed from: s, reason: collision with root package name */
    public final ed.j f20675s;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.g] */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        ed.j jVar = new ed.j();
        this.f20675s = jVar;
        ed.l lVar = new ed.l(0.5f);
        n nVarG = jVar.f23316b.f23298a.g();
        nVarG.f23346e = lVar;
        nVarG.f23347f = lVar;
        nVarG.g = lVar;
        nVarG.f23348h = lVar;
        jVar.setShapeAppearanceModel(nVarG.a());
        this.f20675s.o(ColorStateList.valueOf(-1));
        setBackground(this.f20675s);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ic.a.C, R.attr.materialClockStyle, 0);
        this.f20674r = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f20673q = new Runnable() { // from class: com.google.android.material.timepicker.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f20672a.m();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.f20673q;
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
            g gVar = this.f20673q;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i4) {
        this.f20675s.o(ColorStateList.valueOf(i4));
    }
}
