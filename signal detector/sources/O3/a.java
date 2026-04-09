package O3;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import m.c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3066a = {R.attr.theme, com.apm.insight.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3067b = {com.apm.insight.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i3) {
        return b(context, attributeSet, i, i3, new int[0]);
    }

    public static Context b(Context context, AttributeSet attributeSet, int i, int i3, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3067b, i, i3);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i6 = iArr2[0];
        boolean z6 = (context instanceof c) && ((c) context).f21868a == i6;
        if (i6 == 0 || z6) {
            return context;
        }
        c cVar = new c(context, i6);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i3);
            for (int i7 = 0; i7 < iArr.length; i7++) {
                iArr3[i7] = typedArrayObtainStyledAttributes2.getResourceId(i7, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = iArr3[i8];
            if (i9 != 0) {
                cVar.getTheme().applyStyle(i9, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f3066a);
        int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            cVar.getTheme().applyStyle(resourceId, true);
        }
        return cVar;
    }
}
