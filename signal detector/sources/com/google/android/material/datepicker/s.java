package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C0327y;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class s extends C0327y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18339a = 0;

    public /* synthetic */ s(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.C0327y
    public int calculateDxToMakeVisible(View view, int i) {
        switch (this.f18339a) {
            case 1:
                return 0;
            default:
                return super.calculateDxToMakeVisible(view, i);
        }
    }

    @Override // androidx.recyclerview.widget.C0327y
    public int calculateDyToMakeVisible(View view, int i) {
        switch (this.f18339a) {
            case 1:
                return 0;
            default:
                return super.calculateDyToMakeVisible(view, i);
        }
    }

    @Override // androidx.recyclerview.widget.C0327y
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        switch (this.f18339a) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.calculateSpeedPerPixel(displayMetrics);
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public PointF computeScrollVectorForPosition(int i) {
        switch (this.f18339a) {
            case 1:
                return null;
            default:
                return super.computeScrollVectorForPosition(i);
        }
    }

    public s(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
