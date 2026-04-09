package com.google.android.material.datepicker;

import F1.W;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import f4.C5527g;
import f4.C5531k;

/* loaded from: classes3.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f37351a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f37352b;

    /* renamed from: c, reason: collision with root package name */
    private final ColorStateList f37353c;

    /* renamed from: d, reason: collision with root package name */
    private final ColorStateList f37354d;

    /* renamed from: e, reason: collision with root package name */
    private final int f37355e;

    /* renamed from: f, reason: collision with root package name */
    private final C5531k f37356f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, C5531k c5531k, Rect rect) {
        E1.h.d(rect.left);
        E1.h.d(rect.top);
        E1.h.d(rect.right);
        E1.h.d(rect.bottom);
        this.f37351a = rect;
        this.f37352b = colorStateList2;
        this.f37353c = colorStateList;
        this.f37354d = colorStateList3;
        this.f37355e = i10;
        this.f37356f = c5531k;
    }

    static b a(Context context, int i10) throws Resources.NotFoundException {
        E1.h.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, O3.j.f17237K2);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(O3.j.f17245L2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(O3.j.f17261N2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(O3.j.f17253M2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(O3.j.f17269O2, 0));
        ColorStateList colorStateListA = c4.c.a(context, typedArrayObtainStyledAttributes, O3.j.f17277P2);
        ColorStateList colorStateListA2 = c4.c.a(context, typedArrayObtainStyledAttributes, O3.j.f17317U2);
        ColorStateList colorStateListA3 = c4.c.a(context, typedArrayObtainStyledAttributes, O3.j.f17301S2);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(O3.j.f17309T2, 0);
        C5531k c5531kM = C5531k.b(context, typedArrayObtainStyledAttributes.getResourceId(O3.j.f17285Q2, 0), typedArrayObtainStyledAttributes.getResourceId(O3.j.f17293R2, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, c5531kM, rect);
    }

    void b(TextView textView) {
        c(textView, null, null);
    }

    void c(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        C5527g c5527g = new C5527g();
        C5527g c5527g2 = new C5527g();
        c5527g.setShapeAppearanceModel(this.f37356f);
        c5527g2.setShapeAppearanceModel(this.f37356f);
        if (colorStateList == null) {
            colorStateList = this.f37353c;
        }
        c5527g.T(colorStateList);
        c5527g.Y(this.f37355e, this.f37354d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f37352b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f37352b.withAlpha(30), c5527g, c5527g2);
        Rect rect = this.f37351a;
        W.q0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
