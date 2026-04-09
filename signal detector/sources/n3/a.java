package N3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.widget.AppCompatTextView;
import com.apm.insight.R;
import com.bumptech.glide.c;
import d3.AbstractC2266a;
import d5.y;

/* loaded from: classes.dex */
public final class a extends AppCompatTextView {
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        if (y.o(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, AbstractC2266a.f19727E);
            Context context2 = getContext();
            int[] iArr = {2, 4};
            int iQ = -1;
            for (int i3 = 0; i3 < 2 && iQ < 0; i3++) {
                iQ = c.q(context2, typedArrayObtainStyledAttributes, iArr[i3], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iQ >= 0) {
                setLineHeight(iQ);
            }
        }
    }
}
