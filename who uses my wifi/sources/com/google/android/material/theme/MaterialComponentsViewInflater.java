package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.button.MaterialButton;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.a8;
import defpackage.gh;
import defpackage.gn0;
import defpackage.hc0;
import defpackage.j5;
import defpackage.k5;
import defpackage.kc0;
import defpackage.lb0;
import defpackage.ob1;
import defpackage.qb1;
import defpackage.rc0;
import defpackage.s6;
import defpackage.s7;
import defpackage.uk2;
import defpackage.um;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends a8 {
    @Override // defpackage.a8
    public final j5 a(Context context, AttributeSet attributeSet) {
        return new lb0(context, attributeSet);
    }

    @Override // defpackage.a8
    public final k5 b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.a8
    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new hc0(context, attributeSet);
    }

    @Override // defpackage.a8
    public final s6 d(Context context, AttributeSet attributeSet) {
        kc0 kc0Var = new kc0(um.z(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = kc0Var.getContext();
        TypedArray typedArrayS = uk2.s(context2, attributeSet, gn0.z, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayS.hasValue(0)) {
            gh.c(kc0Var, ob1.e(context2, typedArrayS, 0));
        }
        kc0Var.k = typedArrayS.getBoolean(1, false);
        typedArrayS.recycle();
        return kc0Var;
    }

    @Override // defpackage.a8
    public final s7 e(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        rc0 rc0Var = new rc0(um.z(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = rc0Var.getContext();
        if (qb1.o(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = gn0.D;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int iG = -1;
            for (int i = 0; i < 2 && iG < 0; i++) {
                iG = ob1.g(context2, typedArrayObtainStyledAttributes, iArr2[i], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iG == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, gn0.C);
                    Context context3 = rc0Var.getContext();
                    int[] iArr3 = {2, 4};
                    int iG2 = -1;
                    for (int i2 = 0; i2 < 2 && iG2 < 0; i2++) {
                        iG2 = ob1.g(context3, typedArrayObtainStyledAttributes3, iArr3[i2], -1);
                    }
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iG2 >= 0) {
                        rc0Var.setLineHeight(iG2);
                    }
                }
            }
        }
        return rc0Var;
    }
}
