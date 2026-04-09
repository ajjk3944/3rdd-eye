package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import com.google.android.material.shape.MaterialShapeDrawable;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f10424a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f10425b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f10426c;

    /* renamed from: d, reason: collision with root package name */
    public final ColorStateList f10427d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10428e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.material.shape.a f10429f;

    public a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, com.google.android.material.shape.a aVar, Rect rect) {
        r0.i.d(rect.left);
        r0.i.d(rect.top);
        r0.i.d(rect.right);
        r0.i.d(rect.bottom);
        this.f10424a = rect;
        this.f10425b = colorStateList2;
        this.f10426c = colorStateList;
        this.f10427d = colorStateList3;
        this.f10428e = i10;
        this.f10429f = aVar;
    }

    public static a a(Context context, int i10) throws Resources.NotFoundException {
        r0.i.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, j4.l.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(j4.l.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(j4.l.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(j4.l.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(j4.l.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateListA = d5.c.a(context, typedArrayObtainStyledAttributes, j4.l.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateListA2 = d5.c.a(context, typedArrayObtainStyledAttributes, j4.l.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateListA3 = d5.c.a(context, typedArrayObtainStyledAttributes, j4.l.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(j4.l.MaterialCalendarItem_itemStrokeWidth, 0);
        com.google.android.material.shape.a aVarM = com.google.android.material.shape.a.b(context, typedArrayObtainStyledAttributes.getResourceId(j4.l.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(j4.l.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new a(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, aVarM, rect);
    }

    public int b() {
        return this.f10424a.bottom;
    }

    public int c() {
        return this.f10424a.top;
    }

    public void d(TextView textView) {
        e(textView, null, null);
    }

    public void e(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        materialShapeDrawable.setShapeAppearanceModel(this.f10429f);
        materialShapeDrawable2.setShapeAppearanceModel(this.f10429f);
        if (colorStateList == null) {
            colorStateList = this.f10426c;
        }
        materialShapeDrawable.i0(colorStateList);
        materialShapeDrawable.t0(this.f10428e, this.f10427d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f10425b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f10425b.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        Rect rect = this.f10424a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
