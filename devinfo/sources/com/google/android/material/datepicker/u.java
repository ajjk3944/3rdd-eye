package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.k0;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u extends k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20507a = 0;

    public /* synthetic */ u(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.k0
    public int calculateDxToMakeVisible(View view, int i4) {
        switch (this.f20507a) {
            case 1:
                return 0;
            default:
                return super.calculateDxToMakeVisible(view, i4);
        }
    }

    @Override // androidx.recyclerview.widget.k0
    public int calculateDyToMakeVisible(View view, int i4) {
        switch (this.f20507a) {
            case 1:
                return 0;
            default:
                return super.calculateDyToMakeVisible(view, i4);
        }
    }

    @Override // androidx.recyclerview.widget.k0
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        switch (this.f20507a) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.calculateSpeedPerPixel(displayMetrics);
        }
    }

    @Override // androidx.recyclerview.widget.s1
    public PointF computeScrollVectorForPosition(int i4) {
        switch (this.f20507a) {
            case 1:
                return null;
            default:
                return super.computeScrollVectorForPosition(i4);
        }
    }

    public u(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
