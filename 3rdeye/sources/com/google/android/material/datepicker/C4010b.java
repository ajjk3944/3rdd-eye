package com.google.android.material.datepicker;

import L0.I;
import L0.S;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import h4.C4415c;
import java.util.WeakHashMap;
import l4.C5282a;
import l4.C5287f;
import l4.C5290i;

/* compiled from: CalendarItemStyle.java */
/* renamed from: com.google.android.material.datepicker.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4010b {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f22787a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f22788b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f22789c;

    /* renamed from: d, reason: collision with root package name */
    public final ColorStateList f22790d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22791e;

    /* renamed from: f, reason: collision with root package name */
    public final C5290i f22792f;

    public C4010b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C5290i c5290i, Rect rect) {
        A2.l.o(rect.left);
        A2.l.o(rect.top);
        A2.l.o(rect.right);
        A2.l.o(rect.bottom);
        this.f22787a = rect;
        this.f22788b = colorStateList2;
        this.f22789c = colorStateList;
        this.f22790d = colorStateList3;
        this.f22791e = i;
        this.f22792f = c5290i;
    }

    public static C4010b a(Context context, int i) throws Resources.NotFoundException {
        A2.l.k("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, K3.a.f3127o);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListA = C4415c.a(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListA2 = C4415c.a(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListA3 = C4415c.a(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        C5290i c5290iA = C5290i.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C5282a(0)).a();
        typedArrayObtainStyledAttributes.recycle();
        return new C4010b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, c5290iA, rect);
    }

    public final void b(TextView textView) {
        C5287f c5287f = new C5287f();
        C5287f c5287f2 = new C5287f();
        C5290i c5290i = this.f22792f;
        c5287f.setShapeAppearanceModel(c5290i);
        c5287f2.setShapeAppearanceModel(c5290i);
        c5287f.k(this.f22789c);
        c5287f.f43759b.f43790j = this.f22791e;
        c5287f.invalidateSelf();
        C5287f.b bVar = c5287f.f43759b;
        ColorStateList colorStateList = bVar.f43785d;
        ColorStateList colorStateList2 = this.f22790d;
        if (colorStateList != colorStateList2) {
            bVar.f43785d = colorStateList2;
            c5287f.onStateChange(c5287f.getState());
        }
        ColorStateList colorStateList3 = this.f22788b;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), c5287f, c5287f2);
        Rect rect = this.f22787a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        textView.setBackground(insetDrawable);
    }
}
