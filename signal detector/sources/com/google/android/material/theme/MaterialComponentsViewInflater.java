package com.google.android.material.theme;

import C3.a;
import M3.w;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.apm.insight.R;
import com.bumptech.glide.c;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import d3.AbstractC2266a;
import d5.y;
import h.C2341A;
import o.C2731p;
import o.C2750z;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C2341A {
    @Override // h.C2341A
    public final AppCompatAutoCompleteTextView a(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    @Override // h.C2341A
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // h.C2341A
    public final C2731p c(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // h.C2341A
    public final C2750z d(Context context, AttributeSet attributeSet) {
        a aVar = new a(O3.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray typedArrayI = AbstractC2993B.i(context2, attributeSet, AbstractC2266a.f19724B, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayI.hasValue(0)) {
            aVar.setButtonTintList(c.n(context2, typedArrayI, 0));
        }
        aVar.f1149f = typedArrayI.getBoolean(1, false);
        typedArrayI.recycle();
        return aVar;
    }

    @Override // h.C2341A
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        N3.a aVar = new N3.a(O3.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (y.o(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC2266a.f19728F;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int iQ = -1;
            for (int i = 0; i < 2 && iQ < 0; i++) {
                iQ = c.q(context2, typedArrayObtainStyledAttributes, iArr2[i], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iQ == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC2266a.f19727E);
                    Context context3 = aVar.getContext();
                    int[] iArr3 = {2, 4};
                    int iQ2 = -1;
                    for (int i3 = 0; i3 < 2 && iQ2 < 0; i3++) {
                        iQ2 = c.q(context3, typedArrayObtainStyledAttributes3, iArr3[i3], -1);
                    }
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iQ2 >= 0) {
                        aVar.setLineHeight(iQ2);
                    }
                }
            }
        }
        return aVar;
    }
}
