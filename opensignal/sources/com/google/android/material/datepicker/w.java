package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;
import h7.e0;

/* loaded from: classes.dex */
public final class w extends e0 {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5639q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Context context, int i10) {
        super(context);
        this.f5639q = i10;
    }

    @Override // h7.e0
    public int b(View view, int i10) {
        switch (this.f5639q) {
            case 2:
                return 0;
            default:
                return super.b(view, i10);
        }
    }

    @Override // h7.e0
    public int c(View view, int i10) {
        switch (this.f5639q) {
            case 2:
                return 0;
            default:
                return super.c(view, i10);
        }
    }

    @Override // h7.e0
    public float d(DisplayMetrics displayMetrics) {
        float f10;
        float f11;
        switch (this.f5639q) {
            case 0:
                f10 = displayMetrics.densityDpi;
                f11 = 100.0f;
                break;
            case 1:
                br.l.e(displayMetrics, "displayMetrics");
                f10 = displayMetrics.densityDpi;
                f11 = 75.0f;
                break;
            default:
                return super.d(displayMetrics);
        }
        return f11 / f10;
    }

    @Override // h7.e0
    public PointF f(int i10) {
        switch (this.f5639q) {
            case 2:
                return null;
            default:
                return super.f(i10);
        }
    }

    @Override // h7.e0
    public int g() {
        switch (this.f5639q) {
            case 1:
                return -1;
            default:
                return super.g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.f5639q = 2;
    }
}
