package com.liuzh.deviceinfo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import nk.k;
import p.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class CircleImageView extends w {

    /* renamed from: d, reason: collision with root package name */
    public Path f21312d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        k.e(context, "context");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        k.e(canvas, "canvas");
        canvas.save();
        Path path = this.f21312d;
        k.b(path);
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        int i13 = i4 / 2;
        int i14 = i10 / 2;
        int iMin = Math.min(i4, i10) / 2;
        Path path = new Path();
        this.f21312d = path;
        path.addCircle(i13, i14, iMin, Path.Direction.CCW);
    }
}
