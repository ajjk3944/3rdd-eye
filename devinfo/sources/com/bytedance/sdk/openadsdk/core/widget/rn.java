package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class rn extends View {
    private Drawable fkw;

    /* renamed from: le, reason: collision with root package name */
    private float f8507le;

    /* renamed from: lh, reason: collision with root package name */
    private int f8508lh;
    private final Path ouw;
    private final boolean vt;
    private Drawable yu;

    public rn(Context context) {
        this(context, false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f8508lh <= 0) {
            return;
        }
        int iSave = canvas.save();
        for (int i4 = 0; i4 < 5; i4++) {
            this.yu.draw(canvas);
            canvas.translate(this.f8508lh, 0.0f);
        }
        canvas.restoreToCount(iSave);
        canvas.clipPath(this.ouw);
        for (int i10 = 0; i10 < 5; i10++) {
            this.fkw.draw(canvas);
            canvas.translate(this.f8508lh, 0.0f);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f8508lh * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f8508lh, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        ouw();
    }

    public final void ouw(double d10, int i4) {
        int iOuw = (int) osn.ouw(getContext(), i4, false);
        this.f8508lh = iOuw;
        this.yu.setBounds(0, 0, iOuw, iOuw);
        Drawable drawable = this.fkw;
        int i10 = this.f8508lh;
        drawable.setBounds(0, 0, i10, i10);
        this.f8507le = ((float) d10) / 5.0f;
        ouw();
        requestLayout();
    }

    public rn(Context context, boolean z3) {
        super(context);
        this.ouw = new Path();
        this.vt = z3;
        Context context2 = getContext();
        this.yu = vpp.lh(context2, z3 ? "tt_star_thick_dark" : "tt_star_thick");
        this.fkw = vpp.lh(context2, "tt_star");
    }

    private void ouw() {
        int width = getWidth();
        int height = getHeight();
        if (this.f8507le <= 0.0f || width <= 0 || height <= 0) {
            return;
        }
        this.ouw.reset();
        this.ouw.addRect(new RectF(0.0f, 0.0f, width * this.f8507le, height), Path.Direction.CCW);
    }
}
