package com.google.android.material.theme;

import R0.b;
import T3.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.button.MaterialButton;
import d4.j;
import g4.C4390a;
import h.n;
import h4.C4414b;
import h4.C4415c;
import o.C5385c;
import p4.C5463m;
import q4.C5491a;
import r4.C5522a;

/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends n {
    @Override // h.n
    public final C5385c a(Context context, AttributeSet attributeSet) {
        return new C5463m(context, attributeSet);
    }

    @Override // h.n
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // h.n
    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // h.n
    public final AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        C4390a c4390a = new C4390a(C5522a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, 0);
        Context context2 = c4390a.getContext();
        TypedArray typedArrayD = j.d(context2, attributeSet, K3.a.f3129q, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayD.hasValue(0)) {
            b.c(c4390a, C4415c.a(context2, typedArrayD, 0));
        }
        c4390a.f37954g = typedArrayD.getBoolean(1, false);
        typedArrayD.recycle();
        return c4390a;
    }

    @Override // h.n
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        C5491a c5491a = new C5491a(C5522a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = c5491a.getContext();
        if (C4414b.b(R.attr.textAppearanceLineHeightEnabled, context2, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = K3.a.f3132t;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int iO = C5491a.o(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iO == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, K3.a.f3131s);
                    int iO2 = C5491a.o(c5491a.getContext(), typedArrayObtainStyledAttributes3, 1, 2);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iO2 >= 0) {
                        c5491a.setLineHeight(iO2);
                    }
                }
            }
        }
        return c5491a;
    }
}
