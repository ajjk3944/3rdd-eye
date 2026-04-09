package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.TypedValue;
import b9.C1992A;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class q30 {

    /* renamed from: a, reason: collision with root package name */
    private final j10 f32009a = new j10();

    public final LayerDrawable a(Context context, int i, int i10) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f32009a.getClass();
        int iA = j10.a(context, 6.0f);
        this.f32009a.getClass();
        int iY = com.google.gson.internal.c.y(TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()));
        this.f32009a.getClass();
        int iY2 = com.google.gson.internal.c.y(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        this.f32009a.getClass();
        int iY3 = com.google.gson.internal.c.y(TypedValue.applyDimension(1, 12.0f, context.getResources().getDisplayMetrics()));
        int i11 = (iA * i10) + ((i10 + 1) * iY);
        float f10 = iY3;
        RectF rectF = new RectF(0.0f, 0.0f, i11, f10);
        float[] fArr = new float[8];
        int i12 = 0;
        for (int i13 = 0; i13 < 8; i13++) {
            fArr[i13] = f10;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, rectF, null));
        shapeDrawable.setIntrinsicWidth(i11);
        shapeDrawable.setIntrinsicHeight(iY3);
        shapeDrawable.getPaint().setColor(-16777216);
        shapeDrawable.setAlpha(102);
        ShapeDrawable[] shapeDrawableArr = new ShapeDrawable[i10];
        for (int i14 = 0; i14 < i10; i14++) {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            shapeDrawable2.setIntrinsicHeight(iA);
            shapeDrawable2.setIntrinsicWidth(iA);
            shapeDrawable2.getPaint().setColor(-1);
            if (i14 != i) {
                shapeDrawable2.setAlpha(102);
            }
            C1992A c1992a = C1992A.f18074a;
            shapeDrawableArr[i14] = shapeDrawable2;
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(shapeDrawable);
        if (i10 > 0) {
            arrayList.ensureCapacity(arrayList.size() + i10);
            Collections.addAll(arrayList, shapeDrawableArr);
        }
        LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) arrayList.toArray(new ShapeDrawable[arrayList.size()]));
        while (i12 < i10) {
            int i15 = iY + iA;
            int i16 = i12 + 1;
            layerDrawable.setLayerInset(i16, (i15 * i12) + iY, iY2, i11 - (i15 * i16), iY2);
            i12 = i16;
        }
        return layerDrawable;
    }
}
