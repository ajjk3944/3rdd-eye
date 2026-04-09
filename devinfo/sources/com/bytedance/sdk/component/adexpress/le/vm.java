package com.bytedance.sdk.component.adexpress.le;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vm extends View {
    private float bly;
    public Animator.AnimatorListener fkw;

    /* renamed from: le, reason: collision with root package name */
    private float f7358le;

    /* renamed from: lh, reason: collision with root package name */
    public long f7359lh;
    public ValueAnimator ouw;
    private Paint pno;
    private float ra;
    private int tlj;
    public ValueAnimator vt;
    public float yu;

    public vm(Context context, int i4) {
        super(context);
        this.f7359lh = 300L;
        this.bly = 0.0f;
        this.tlj = i4;
        Paint paint = new Paint(1);
        this.pno = paint;
        paint.setStyle(Paint.Style.FILL);
        this.pno.setColor(this.tlj);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f7358le, this.ra, this.bly, this.pno);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        this.f7358le = i4 / 2.0f;
        this.ra = i10 / 2.0f;
        this.yu = (float) (Math.hypot(i4, i10) / 2.0d);
    }

    public final void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.fkw = animatorListener;
    }
}
