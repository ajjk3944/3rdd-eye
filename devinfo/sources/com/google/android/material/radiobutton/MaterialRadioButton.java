package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import md.a;
import p.a0;
import t6.i0;
import zc.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class MaterialRadioButton extends a0 {
    public static final int[][] g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f20543e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20544f;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.liuzh.deviceinfo.R.attr.radioButtonStyle, com.liuzh.deviceinfo.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayG = m.g(context2, attributeSet, ic.a.f25962w, com.liuzh.deviceinfo.R.attr.radioButtonStyle, com.liuzh.deviceinfo.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayG.hasValue(0)) {
            setButtonTintList(jm.a.j(context2, typedArrayG, 0));
        }
        this.f20544f = typedArrayG.getBoolean(1, false);
        typedArrayG.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f20543e == null) {
            int i4 = i0.i(com.liuzh.deviceinfo.R.attr.colorControlActivated, this);
            int i10 = i0.i(com.liuzh.deviceinfo.R.attr.colorOnSurface, this);
            int i11 = i0.i(com.liuzh.deviceinfo.R.attr.colorSurface, this);
            this.f20543e = new ColorStateList(g, new int[]{i0.o(1.0f, i11, i4), i0.o(0.54f, i11, i10), i0.o(0.38f, i11, i10), i0.o(0.38f, i11, i10)});
        }
        return this.f20543e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f20544f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z3) {
        this.f20544f = z3;
        if (z3) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
