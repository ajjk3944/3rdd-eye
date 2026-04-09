package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f10431a;

    /* renamed from: b, reason: collision with root package name */
    public final a f10432b;

    /* renamed from: c, reason: collision with root package name */
    public final a f10433c;

    /* renamed from: d, reason: collision with root package name */
    public final a f10434d;

    /* renamed from: e, reason: collision with root package name */
    public final a f10435e;

    /* renamed from: f, reason: collision with root package name */
    public final a f10436f;

    /* renamed from: g, reason: collision with root package name */
    public final a f10437g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f10438h;

    public b(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(d5.b.f(context, j4.b.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), j4.l.MaterialCalendar);
        this.f10431a = a.a(context, typedArrayObtainStyledAttributes.getResourceId(j4.l.MaterialCalendar_dayStyle, 0));
        this.f10437g = a.a(context, typedArrayObtainStyledAttributes.getResourceId(j4.l.MaterialCalendar_dayInvalidStyle, 0));
        this.f10432b = a.a(context, typedArrayObtainStyledAttributes.getResourceId(j4.l.MaterialCalendar_daySelectedStyle, 0));
        this.f10433c = a.a(context, typedArrayObtainStyledAttributes.getResourceId(j4.l.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateListA = d5.c.a(context, typedArrayObtainStyledAttributes, j4.l.MaterialCalendar_rangeFillColor);
        this.f10434d = a.a(context, typedArrayObtainStyledAttributes.getResourceId(j4.l.MaterialCalendar_yearStyle, 0));
        this.f10435e = a.a(context, typedArrayObtainStyledAttributes.getResourceId(j4.l.MaterialCalendar_yearSelectedStyle, 0));
        this.f10436f = a.a(context, typedArrayObtainStyledAttributes.getResourceId(j4.l.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f10438h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
