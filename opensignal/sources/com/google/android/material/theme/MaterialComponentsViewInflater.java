package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.b;
import ed.l;
import h.a;
import i.d0;
import je.t;
import p.m;
import p.n;
import p.q0;
import xd.k;
import xu.d;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends d0 {
    @Override // i.d0
    public final m a(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    @Override // i.d0
    public final n b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // i.d0
    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // i.d0
    public final AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        int i10 = a.radioButtonStyle;
        int i11 = ae.a.B;
        ae.a aVar = new ae.a(le.a.a(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = aVar.getContext();
        TypedArray typedArrayD = k.d(context2, attributeSet, l.MaterialRadioButton, i10, i11, new int[0]);
        if (typedArrayD.hasValue(l.MaterialRadioButton_buttonTint)) {
            aVar.setButtonTintList(xu.l.q(context2, typedArrayD, l.MaterialRadioButton_buttonTint));
        }
        aVar.f341y = typedArrayD.getBoolean(l.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayD.recycle();
        return aVar;
    }

    @Override // i.d0
    public final q0 e(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        ke.a aVar = new ke.a(le.a.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (d.d0(context2, ed.b.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.MaterialTextView, R.attr.textViewStyle, 0);
            int iG = ke.a.g(context2, typedArrayObtainStyledAttributes, l.MaterialTextView_android_lineHeight, l.MaterialTextView_lineHeight);
            typedArrayObtainStyledAttributes.recycle();
            if (iG == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, l.MaterialTextView, R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(l.MaterialTextView_android_textAppearance, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, l.MaterialTextAppearance);
                    int iG2 = ke.a.g(aVar.getContext(), typedArrayObtainStyledAttributes3, l.MaterialTextAppearance_android_lineHeight, l.MaterialTextAppearance_lineHeight);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iG2 >= 0) {
                        aVar.setLineHeight(iG2);
                    }
                }
            }
        }
        return aVar;
    }
}
