package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rc0 extends s7 {
    @Override // defpackage.s7, android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        if (qb1.o(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, gn0.C);
            Context context2 = getContext();
            int[] iArr = {2, 4};
            int iG = -1;
            for (int i2 = 0; i2 < 2 && iG < 0; i2++) {
                iG = ob1.g(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iG >= 0) {
                setLineHeight(iG);
            }
        }
    }
}
