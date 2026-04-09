package r4;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import m.C5306c;

/* compiled from: MaterialThemeOverlay.java */
/* renamed from: r4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5522a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f45685a = {R.attr.theme, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f45686b = {com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f45686b, i, i10);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z10 = (context instanceof C5306c) && ((C5306c) context).f43931a == resourceId;
        if (resourceId == 0 || z10) {
            return context;
        }
        C5306c c5306c = new C5306c(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f45685a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c5306c.getTheme().applyStyle(resourceId2, true);
        }
        return c5306c;
    }
}
