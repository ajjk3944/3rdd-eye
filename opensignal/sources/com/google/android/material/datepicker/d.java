package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final c f5589a;

    /* renamed from: b, reason: collision with root package name */
    public final c f5590b;

    public d(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(xu.d.e0(ed.b.materialCalendarStyle, context, m.class.getCanonicalName()).data, ed.l.MaterialCalendar);
        c.a(context, typedArrayObtainStyledAttributes.getResourceId(ed.l.MaterialCalendar_dayStyle, 0));
        c.a(context, typedArrayObtainStyledAttributes.getResourceId(ed.l.MaterialCalendar_dayInvalidStyle, 0));
        c.a(context, typedArrayObtainStyledAttributes.getResourceId(ed.l.MaterialCalendar_daySelectedStyle, 0));
        c.a(context, typedArrayObtainStyledAttributes.getResourceId(ed.l.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateListQ = xu.l.q(context, typedArrayObtainStyledAttributes, ed.l.MaterialCalendar_rangeFillColor);
        this.f5589a = c.a(context, typedArrayObtainStyledAttributes.getResourceId(ed.l.MaterialCalendar_yearStyle, 0));
        c.a(context, typedArrayObtainStyledAttributes.getResourceId(ed.l.MaterialCalendar_yearSelectedStyle, 0));
        this.f5590b = c.a(context, typedArrayObtainStyledAttributes.getResourceId(ed.l.MaterialCalendar_yearTodayStyle, 0));
        new Paint().setColor(colorStateListQ.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
