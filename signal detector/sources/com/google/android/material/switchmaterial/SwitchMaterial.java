package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;
import com.bumptech.glide.e;
import d3.AbstractC2266a;
import t3.a;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: o0, reason: collision with root package name */
    public static final int[][] f18445o0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: k0, reason: collision with root package name */
    public final a f18446k0;

    /* renamed from: l0, reason: collision with root package name */
    public ColorStateList f18447l0;

    /* renamed from: m0, reason: collision with root package name */
    public ColorStateList f18448m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f18449n0;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        super(O3.a.a(context, attributeSet, com.apm.insight.R.attr.switchStyle, com.apm.insight.R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet, 0);
        Context context2 = getContext();
        this.f18446k0 = new a(context2);
        AbstractC2993B.a(context2, attributeSet, com.apm.insight.R.attr.switchStyle, com.apm.insight.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        int[] iArr = AbstractC2266a.f19741T;
        AbstractC2993B.b(context2, attributeSet, iArr, com.apm.insight.R.attr.switchStyle, com.apm.insight.R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.apm.insight.R.attr.switchStyle, com.apm.insight.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        this.f18449n0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() throws Resources.NotFoundException {
        if (this.f18447l0 == null) {
            int iM = e.m(com.apm.insight.R.attr.colorSurface, this);
            int iM2 = e.m(com.apm.insight.R.attr.colorControlActivated, this);
            float dimension = getResources().getDimension(com.apm.insight.R.dimen.mtrl_switch_thumb_elevation);
            a aVar = this.f18446k0;
            if (aVar.f23666a) {
                float elevation = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    elevation += ((View) parent).getElevation();
                }
                dimension += elevation;
            }
            int iA = aVar.a(iM, dimension);
            this.f18447l0 = new ColorStateList(f18445o0, new int[]{e.t(1.0f, iM, iM2), iA, e.t(0.38f, iM, iM2), iA});
        }
        return this.f18447l0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f18448m0 == null) {
            int iM = e.m(com.apm.insight.R.attr.colorSurface, this);
            int iM2 = e.m(com.apm.insight.R.attr.colorControlActivated, this);
            int iM3 = e.m(com.apm.insight.R.attr.colorOnSurface, this);
            this.f18448m0 = new ColorStateList(f18445o0, new int[]{e.t(0.54f, iM, iM2), e.t(0.32f, iM, iM3), e.t(0.12f, iM, iM2), e.t(0.12f, iM, iM3)});
        }
        return this.f18448m0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f18449n0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f18449n0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z6) {
        this.f18449n0 = z6;
        if (z6) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }
}
