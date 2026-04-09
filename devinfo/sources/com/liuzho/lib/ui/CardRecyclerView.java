package com.liuzho.lib.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.liuzh.deviceinfo.R;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class CardRecyclerView extends RecyclerView {
    public final Path L0;
    public final Path M0;
    public final float[] N0;
    public final float[] O0;
    public final float[] P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.recyclerViewStyle);
        k.e(context, "context");
        this.L0 = new Path();
        this.M0 = new Path();
        this.N0 = new float[8];
        this.O0 = new float[8];
        this.P0 = new float[8];
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        k.e(canvas, "canvas");
        super.dispatchDraw(canvas);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        k.e(canvas, "canvas");
        k.e(view, "child");
        return super.drawChild(canvas, view, j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        Path path = this.L0;
        path.reset();
        path.addRoundRect(0.0f, 0.0f, getWidth() - 0.0f, getHeight(), this.N0, Path.Direction.CW);
    }
}
