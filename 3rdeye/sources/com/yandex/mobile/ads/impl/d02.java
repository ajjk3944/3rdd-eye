package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.preference.PreferenceManager;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class d02 {

    /* renamed from: a, reason: collision with root package name */
    private final zz1 f25911a = new zz1();

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f25912b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    private final Paint f25913c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f25914d;

    public d02() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#2E7D32"));
        paint.setStrokeWidth(10.0f);
        this.f25913c = paint;
        this.f25914d = new Rect();
    }

    public final void a(ImageView view, Bitmap bitmap, xz1 smartCenter) {
        float f10;
        float fC;
        float fFloatValue;
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(bitmap, "bitmap");
        kotlin.jvm.internal.l.f(smartCenter, "smartCenter");
        float width = view.getWidth();
        float height = view.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        Float fValueOf = Float.valueOf(0.0f);
        if (height == 0.0f || height2 == 0.0f) {
            return;
        }
        boolean z10 = width / height > width2 / height2;
        float f11 = z10 ? width / width2 : height / height2;
        float f12 = width2 * f11;
        float f13 = height2 * f11;
        if (z10) {
            fC = 0.0f;
            f10 = 0.0f;
        } else {
            f10 = 0.0f;
            fC = (width / 2) - (((smartCenter.c() / 2) + smartCenter.d()) * f11);
            Float fValueOf2 = fC > 0.0f ? fValueOf : fC + f12 < width ? Float.valueOf(width - f12) : null;
            if (fValueOf2 != null) {
                fC = fValueOf2.floatValue();
            }
        }
        if (z10) {
            float fB = (height / 2) - (((smartCenter.b() / 2) + smartCenter.e()) * f11);
            if (fB <= f10) {
                fValueOf = fB + f13 < height ? Float.valueOf(height - f13) : null;
            }
            fFloatValue = fValueOf != null ? fValueOf.floatValue() : fB;
        } else {
            fFloatValue = f10;
        }
        this.f25912b.setScale(f11, f11);
        this.f25912b.postTranslate(fC, fFloatValue);
        view.setScaleType(ImageView.ScaleType.MATRIX);
        view.setImageMatrix(this.f25912b);
        zz1 zz1Var = this.f25911a;
        Context context = view.getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        zz1Var.getClass();
        if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_smart_centers_debug_enabled", false)) {
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(bitmapCopy);
            Rect rect = this.f25914d;
            rect.set(smartCenter.d(), smartCenter.e(), smartCenter.c() + smartCenter.d(), smartCenter.b() + smartCenter.e());
            canvas.drawRect(rect, this.f25913c);
            view.setImageBitmap(bitmapCopy);
        }
    }

    public final void a(ImageView view, Bitmap bitmap, xz1 smartCenter, String backGroundColor) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(bitmap, "bitmap");
        kotlin.jvm.internal.l.f(smartCenter, "smartCenter");
        kotlin.jvm.internal.l.f(backGroundColor, "backGroundColor");
        float width = view.getWidth();
        float height = view.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        float fC = smartCenter.c();
        float fB = smartCenter.b();
        if (height == 0.0f || fB == 0.0f || height2 == 0.0f) {
            return;
        }
        float f10 = width / height;
        float f11 = f10 < fC / fB ? width / fC : height / fB;
        if (f11 > 1.0f) {
            f11 = f10 < width2 / height2 ? width / width2 : height / height2;
        }
        float f12 = 2;
        this.f25912b.setScale(f11, f11);
        this.f25912b.postTranslate((width / f12) - (((smartCenter.c() / 2) + smartCenter.d()) * f11), (height / f12) - (((smartCenter.b() / 2) + smartCenter.e()) * f11));
        view.setScaleType(ImageView.ScaleType.MATRIX);
        view.setImageMatrix(this.f25912b);
        view.setBackgroundColor(Color.parseColor(backGroundColor));
        zz1 zz1Var = this.f25911a;
        Context context = view.getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        zz1Var.getClass();
        if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_smart_centers_debug_enabled", false)) {
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(bitmapCopy);
            Rect rect = this.f25914d;
            rect.set(smartCenter.d(), smartCenter.e(), smartCenter.c() + smartCenter.d(), smartCenter.b() + smartCenter.e());
            canvas.drawRect(rect, this.f25913c);
            view.setImageBitmap(bitmapCopy);
        }
    }
}
