package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class c {
    public static c a(Context context, int i10) throws Resources.NotFoundException {
        se.b.k("Cannot create a CalendarItemStyle with a styleResId of 0", i10 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, ed.l.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(ed.l.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(ed.l.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(ed.l.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(ed.l.MaterialCalendarItem_android_insetBottom, 0));
        xu.l.q(context, typedArrayObtainStyledAttributes, ed.l.MaterialCalendarItem_itemFillColor);
        xu.l.q(context, typedArrayObtainStyledAttributes, ed.l.MaterialCalendarItem_itemTextColor);
        xu.l.q(context, typedArrayObtainStyledAttributes, ed.l.MaterialCalendarItem_itemStrokeColor);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(ed.l.MaterialCalendarItem_itemStrokeWidth, 0);
        ee.l.a(context, typedArrayObtainStyledAttributes.getResourceId(ed.l.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(ed.l.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).b();
        typedArrayObtainStyledAttributes.recycle();
        c cVar = new c();
        se.b.l(rect.left);
        se.b.l(rect.top);
        se.b.l(rect.right);
        se.b.l(rect.bottom);
        return cVar;
    }
}
