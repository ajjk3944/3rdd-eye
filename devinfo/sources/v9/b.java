package v9;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b extends a8.a {

    /* renamed from: c, reason: collision with root package name */
    public final l9.a f35983c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f35984d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f35985e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f35986f;

    public b(l9.a aVar, w9.h hVar) {
        super(9, hVar);
        this.f35983c = aVar;
        Paint paint = new Paint(1);
        this.f35984d = paint;
        paint.setStyle(Paint.Style.FILL);
        new Paint(4);
        Paint paint2 = new Paint(1);
        this.f35986f = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(w9.g.c(9.0f));
        Paint paint3 = new Paint(1);
        this.f35985e = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(2.0f);
        paint3.setColor(Color.rgb(255, 187, 115));
    }

    public final void C(o9.c cVar) {
        Paint paint = this.f35986f;
        paint.setTypeface(null);
        paint.setTextSize(cVar.f30447h);
    }

    public abstract void D(Canvas canvas);

    public abstract void E(Canvas canvas);

    public abstract void F(Canvas canvas, q9.b[] bVarArr);

    public abstract void G(Canvas canvas);
}
