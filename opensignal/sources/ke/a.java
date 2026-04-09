package ke;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import ed.b;
import ed.l;
import p.q0;
import xu.d;

/* loaded from: classes.dex */
public final class a extends q0 {
    public static int g(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i10 = 0; i10 < iArr.length && dimensionPixelSize < 0; i10++) {
            int i11 = iArr[i10];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i11, typedValue) && typedValue.type == 2) {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                dimensionPixelSize = dimensionPixelSize2;
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i11, -1);
            }
        }
        return dimensionPixelSize;
    }

    @Override // p.q0, android.widget.TextView
    public final void setTextAppearance(Context context, int i10) throws Resources.NotFoundException {
        super.setTextAppearance(context, i10);
        if (d.d0(context, b.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i10, l.MaterialTextAppearance);
            int iG = g(getContext(), typedArrayObtainStyledAttributes, l.MaterialTextAppearance_android_lineHeight, l.MaterialTextAppearance_lineHeight);
            typedArrayObtainStyledAttributes.recycle();
            if (iG >= 0) {
                setLineHeight(iG);
            }
        }
    }
}
