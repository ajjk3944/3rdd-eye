package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b7.h f20445a;

    /* renamed from: b, reason: collision with root package name */
    public final b7.h f20446b;

    public c(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ii.a.B(context, R.attr.materialCalendarStyle, l.class.getCanonicalName()).data, ic.a.f25958s);
        b7.h.d(typedArrayObtainStyledAttributes.getResourceId(4, 0), context);
        b7.h.d(typedArrayObtainStyledAttributes.getResourceId(2, 0), context);
        b7.h.d(typedArrayObtainStyledAttributes.getResourceId(3, 0), context);
        b7.h.d(typedArrayObtainStyledAttributes.getResourceId(5, 0), context);
        ColorStateList colorStateListJ = jm.a.j(context, typedArrayObtainStyledAttributes, 7);
        this.f20445a = b7.h.d(typedArrayObtainStyledAttributes.getResourceId(9, 0), context);
        b7.h.d(typedArrayObtainStyledAttributes.getResourceId(8, 0), context);
        this.f20446b = b7.h.d(typedArrayObtainStyledAttributes.getResourceId(10, 0), context);
        new Paint().setColor(colorStateListJ.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
