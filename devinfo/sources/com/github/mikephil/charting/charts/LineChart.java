package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.datastore.preferences.protobuf.k;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import m9.a;
import r9.c;
import v9.b;
import v9.e;
import w9.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class LineChart extends a implements c {
    public LineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = 100;
        this.E = false;
        this.F = false;
        this.G = true;
        this.H = true;
        this.I = true;
        this.J = true;
        this.K = true;
        this.L = true;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.R = 15.0f;
        this.S = false;
        this.f28989d0 = 0L;
        this.f28990e0 = 0L;
        this.f28991f0 = new RectF();
        this.f28992g0 = new Matrix();
        new Matrix();
        f fVar = w9.c.f36542d;
        w9.c cVar = (w9.c) fVar.b();
        cVar.f36543b = 0.0d;
        cVar.f36544c = 0.0d;
        this.f28993h0 = cVar;
        w9.c cVar2 = (w9.c) fVar.b();
        cVar2.f36543b = 0.0d;
        cVar2.f36544c = 0.0d;
        this.f28994i0 = cVar2;
        this.f28995j0 = new float[2];
    }

    @Override // m9.a, m9.b
    public final void e() {
        super.e();
        e eVar = new e(this.f29013t, this.f29012s);
        eVar.g = new k(eVar);
        eVar.f35995h = new Path();
        eVar.f35999m = Bitmap.Config.ARGB_8888;
        eVar.f36000n = new Path();
        eVar.f36001o = new Path();
        eVar.f36002p = new float[4];
        eVar.f36003q = new Path();
        eVar.f36004r = new HashMap();
        eVar.f36005s = new float[2];
        eVar.f35996i = this;
        Paint paint = new Paint(1);
        eVar.j = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.f29010q = eVar;
    }

    @Override // r9.c
    public o9.e getLineData() {
        return (o9.e) this.f28997b;
    }

    @Override // m9.b, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b bVar = this.f29010q;
        if (bVar != null && (bVar instanceof e)) {
            e eVar = (e) bVar;
            Canvas canvas = eVar.f35998l;
            if (canvas != null) {
                canvas.setBitmap(null);
                eVar.f35998l = null;
            }
            WeakReference weakReference = eVar.f35997k;
            if (weakReference != null) {
                Bitmap bitmap = (Bitmap) weakReference.get();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                eVar.f35997k.clear();
                eVar.f35997k = null;
            }
        }
        super.onDetachedFromWindow();
    }
}
