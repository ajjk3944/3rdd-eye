package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ryl extends View {
    private int[] bly;

    /* renamed from: cf, reason: collision with root package name */
    private Paint f7347cf;
    private int fkw;

    /* renamed from: jg, reason: collision with root package name */
    private LinearGradient f7348jg;
    private final List<ouw> ko;

    /* renamed from: le, reason: collision with root package name */
    private int f7349le;

    /* renamed from: lh, reason: collision with root package name */
    private int f7350lh;
    private PorterDuff.Mode mwh;
    Rect ouw;
    private int pno;
    private int ra;
    private Xfermode ryl;
    private Bitmap tlj;
    Rect vt;
    private int yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        final int ouw = 4;
        int vt = 0;
    }

    public ryl(Context context) {
        super(context);
        this.mwh = PorterDuff.Mode.DST_IN;
        this.ko = new ArrayList();
        this.f7350lh = com.bytedance.sdk.component.utils.vpp.yu(getContext(), "tt_splash_unlock_image_arrow");
        this.yu = Color.parseColor("#00ffffff");
        this.fkw = Color.parseColor("#ffffffff");
        int color = Color.parseColor("#00ffffff");
        this.f7349le = color;
        this.ra = 10;
        this.pno = 40;
        this.bly = new int[]{this.yu, this.fkw, color};
        setLayerType(1, null);
        this.f7347cf = new Paint(1);
        this.tlj = BitmapFactory.decodeResource(getResources(), this.f7350lh);
        this.ryl = new PorterDuffXfermode(this.mwh);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.tlj, this.ouw, this.vt, this.f7347cf);
        canvas.save();
        Iterator<ouw> it = this.ko.iterator();
        while (it.hasNext()) {
            ouw next = it.next();
            this.f7348jg = new LinearGradient(next.vt, 0.0f, r4 + this.pno, this.ra, this.bly, (float[]) null, Shader.TileMode.CLAMP);
            this.f7347cf.setColor(-1);
            this.f7347cf.setShader(this.f7348jg);
            Canvas canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f7347cf);
            this.f7347cf.setShader(null);
            int i4 = next.vt + next.ouw;
            next.vt = i4;
            if (i4 > getWidth()) {
                it.remove();
            }
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        this.f7347cf.setXfermode(this.ryl);
        canvas3.drawBitmap(this.tlj, this.ouw, this.vt, this.f7347cf);
        this.f7347cf.setXfermode(null);
        canvas3.restore();
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        if (this.tlj == null) {
            return;
        }
        this.ouw = new Rect(0, 0, this.tlj.getWidth(), this.tlj.getHeight());
        this.vt = new Rect(0, 0, getWidth(), getHeight());
    }

    public final void ouw() {
        this.ko.add(new ouw());
        postInvalidate();
    }
}
