package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import b4.C0344i;
import com.apm.insight.R;
import d3.AbstractC2266a;
import d5.y;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final C0344i f18266a;

    /* renamed from: b, reason: collision with root package name */
    public final C0344i f18267b;

    public c(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(y.q(context, R.attr.materialCalendarStyle, j.class.getCanonicalName()).data, AbstractC2266a.f19768w);
        C0344i.q(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        C0344i.q(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        C0344i.q(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        C0344i.q(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListN = com.bumptech.glide.c.n(context, typedArrayObtainStyledAttributes, 7);
        this.f18266a = C0344i.q(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        C0344i.q(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f18267b = C0344i.q(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListN.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
