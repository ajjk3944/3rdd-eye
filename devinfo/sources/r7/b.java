package r7;

import android.graphics.Color;
import android.graphics.Matrix;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public float f32846a;

    /* renamed from: b, reason: collision with root package name */
    public float f32847b;

    /* renamed from: c, reason: collision with root package name */
    public float f32848c;

    /* renamed from: d, reason: collision with root package name */
    public int f32849d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f32850e = null;

    public b(b bVar) {
        this.f32846a = 0.0f;
        this.f32847b = 0.0f;
        this.f32848c = 0.0f;
        this.f32849d = 0;
        this.f32846a = bVar.f32846a;
        this.f32847b = bVar.f32847b;
        this.f32848c = bVar.f32848c;
        this.f32849d = bVar.f32849d;
    }

    public final void a(int i4, g7.a aVar) {
        int iAlpha = Color.alpha(this.f32849d);
        int iC = h.c(i4);
        Matrix matrix = j.f32892a;
        int i10 = (int) ((((iAlpha / 255.0f) * iC) / 255.0f) * 255.0f);
        if (i10 <= 0) {
            aVar.clearShadowLayer();
        } else {
            aVar.setShadowLayer(Math.max(this.f32846a, Float.MIN_VALUE), this.f32847b, this.f32848c, Color.argb(i10, Color.red(this.f32849d), Color.green(this.f32849d), Color.blue(this.f32849d)));
        }
    }

    public final void b(int i4) {
        this.f32849d = Color.argb(Math.round((h.c(i4) * Color.alpha(this.f32849d)) / 255.0f), Color.red(this.f32849d), Color.green(this.f32849d), Color.blue(this.f32849d));
    }

    public final void c(Matrix matrix) {
        if (this.f32850e == null) {
            this.f32850e = new float[2];
        }
        float[] fArr = this.f32850e;
        fArr[0] = this.f32847b;
        fArr[1] = this.f32848c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f32850e;
        this.f32847b = fArr2[0];
        this.f32848c = fArr2[1];
        this.f32846a = matrix.mapRadius(this.f32846a);
    }
}
