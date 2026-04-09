package com.liuzho.lib.ui;

import android.content.Context;
import android.util.AttributeSet;
import nk.k;
import p.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class SquareImageView extends w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        k.e(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(measuredWidth, measuredWidth);
    }
}
