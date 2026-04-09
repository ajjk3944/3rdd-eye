package md;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import n.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f29031a = {R.attr.theme, com.liuzh.deviceinfo.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f29032b = {com.liuzh.deviceinfo.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i4, int i10) {
        return b(context, attributeSet, i4, i10, new int[0]);
    }

    public static Context b(Context context, AttributeSet attributeSet, int i4, int i10, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f29032b, i4, i10);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i11 = iArr2[0];
        boolean z3 = (context instanceof c) && ((c) context).f29442a == i11;
        if (i11 == 0 || z3) {
            return context;
        }
        c cVar = new c(context, i11);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i4, i10);
            for (int i12 = 0; i12 < iArr.length; i12++) {
                iArr3[i12] = typedArrayObtainStyledAttributes2.getResourceId(i12, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr3[i13];
            if (i14 != 0) {
                cVar.getTheme().applyStyle(i14, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f29031a);
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
