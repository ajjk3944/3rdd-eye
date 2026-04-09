package h4;

import A9.I;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import o.X;
import z0.C5848a;

/* compiled from: MaterialResources.java */
/* renamed from: h4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4415c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = C5848a.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    public static ColorStateList b(Context context, X x10, int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = x10.f44608b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = C5848a.getColorStateList(context, resourceId)) == null) ? x10.a(i) : colorStateList;
    }

    public static Drawable c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableW;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableW = I.w(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableW;
    }

    public static boolean d(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
