package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ex extends FrameLayout {
    private static final int bly = (com.bytedance.sdk.component.adexpress.dynamic.fkw.cf.ouw("", 0.0f, true)[1] / 2) + 1;
    private static final int tlj = (com.bytedance.sdk.component.adexpress.dynamic.fkw.cf.ouw("", 0.0f, true)[1] / 2) + 3;
    public LinearLayout fkw;

    /* renamed from: le, reason: collision with root package name */
    public LinearLayout f7324le;

    /* renamed from: lh, reason: collision with root package name */
    public double f7325lh;
    public float ouw;
    private Drawable pno;
    private Drawable ra;
    public float vt;
    public float yu;

    public ex(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.fkw = new LinearLayout(getContext());
        this.f7324le = new LinearLayout(getContext());
        this.fkw.setOrientation(0);
        this.fkw.setGravity(8388611);
        this.f7324le.setOrientation(0);
        this.f7324le.setGravity(8388611);
        this.ra = com.bytedance.sdk.component.utils.vpp.lh(context, "tt_star_thick");
        this.pno = com.bytedance.sdk.component.utils.vpp.lh(context, "tt_star");
    }

    public final Drawable getStarEmptyDrawable() {
        return this.ra;
    }

    public final Drawable getStarFillDrawable() {
        return this.pno;
    }

    public final ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.ouw, (int) this.vt));
        imageView.setPadding(1, bly, 1, tlj);
        return imageView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
        this.fkw.measure(i4, i10);
        double d10 = this.f7325lh;
        float f10 = this.ouw;
        this.f7324le.measure(View.MeasureSpec.makeMeasureSpec((int) (((d10 - ((int) d10)) * (f10 - 2.0f)) + (((int) d10) * f10) + 1.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(this.fkw.getMeasuredHeight(), 1073741824));
        if (this.yu > 0.0f) {
            this.fkw.setPadding(0, ((int) (r7.getMeasuredHeight() - this.yu)) / 2, 0, 0);
            this.f7324le.setPadding(0, ((int) (this.fkw.getMeasuredHeight() - this.yu)) / 2, 0, 0);
        }
    }
}
