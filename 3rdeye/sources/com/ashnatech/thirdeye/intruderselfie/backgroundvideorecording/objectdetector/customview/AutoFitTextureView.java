package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;

/* loaded from: classes.dex */
public class AutoFitTextureView extends TextureView {

    /* renamed from: b, reason: collision with root package name */
    public int f22181b;

    /* renamed from: c, reason: collision with root package name */
    public int f22182c;

    public AutoFitTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f22181b = 0;
        this.f22182c = 0;
    }

    public final void a(int i, int i10) {
        if (i < 0 || i10 < 0) {
            throw new IllegalArgumentException("Size cannot be negative.");
        }
        this.f22181b = i;
        this.f22182c = i10;
        requestLayout();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        int i11;
        super.onMeasure(i, i10);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i10);
        int i12 = this.f22181b;
        if (i12 == 0 || (i11 = this.f22182c) == 0) {
            setMeasuredDimension(size, size2);
        } else if (size < (size2 * i12) / i11) {
            setMeasuredDimension(size, (i11 * size) / i12);
        } else {
            setMeasuredDimension((i12 * size2) / i11, size2);
        }
    }
}
