package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import c4.AbstractC4224b;

/* loaded from: classes3.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    final b f37357a;

    /* renamed from: b, reason: collision with root package name */
    final b f37358b;

    /* renamed from: c, reason: collision with root package name */
    final b f37359c;

    /* renamed from: d, reason: collision with root package name */
    final b f37360d;

    /* renamed from: e, reason: collision with root package name */
    final b f37361e;

    /* renamed from: f, reason: collision with root package name */
    final b f37362f;

    /* renamed from: g, reason: collision with root package name */
    final b f37363g;

    /* renamed from: h, reason: collision with root package name */
    final Paint f37364h;

    c(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC4224b.d(context, O3.a.f16981t, i.class.getCanonicalName()), O3.j.f17157A2);
        this.f37357a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(O3.j.f17189E2, 0));
        this.f37363g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(O3.j.f17173C2, 0));
        this.f37358b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(O3.j.f17181D2, 0));
        this.f37359c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(O3.j.f17197F2, 0));
        ColorStateList colorStateListA = c4.c.a(context, typedArrayObtainStyledAttributes, O3.j.f17205G2);
        this.f37360d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(O3.j.f17221I2, 0));
        this.f37361e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(O3.j.f17213H2, 0));
        this.f37362f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(O3.j.f17229J2, 0));
        Paint paint = new Paint();
        this.f37364h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
