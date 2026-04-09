package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import h4.C4414b;
import h4.C4415c;

/* compiled from: CalendarStyle.java */
/* renamed from: com.google.android.material.datepicker.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4011c {

    /* renamed from: a, reason: collision with root package name */
    public final C4010b f22793a;

    /* renamed from: b, reason: collision with root package name */
    public final C4010b f22794b;

    /* renamed from: c, reason: collision with root package name */
    public final C4010b f22795c;

    /* renamed from: d, reason: collision with root package name */
    public final C4010b f22796d;

    /* renamed from: e, reason: collision with root package name */
    public final C4010b f22797e;

    /* renamed from: f, reason: collision with root package name */
    public final C4010b f22798f;

    /* renamed from: g, reason: collision with root package name */
    public final C4010b f22799g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f22800h;

    public C4011c(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C4414b.c(context, R.attr.materialCalendarStyle, j.class.getCanonicalName()).data, K3.a.f3126n);
        this.f22793a = C4010b.a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.f22799g = C4010b.a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.f22794b = C4010b.a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.f22795c = C4010b.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListA = C4415c.a(context, typedArrayObtainStyledAttributes, 7);
        this.f22796d = C4010b.a(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f22797e = C4010b.a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f22798f = C4010b.a(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.f22800h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
