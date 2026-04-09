package e9;

import a9.l;
import android.graphics.Color;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public float f7976a;

    /* renamed from: b, reason: collision with root package name */
    public float f7977b;

    /* renamed from: c, reason: collision with root package name */
    public float f7978c;

    /* renamed from: d, reason: collision with root package name */
    public int f7979d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f7980e = null;

    public a(a aVar) {
        this.f7976a = 0.0f;
        this.f7977b = 0.0f;
        this.f7978c = 0.0f;
        this.f7979d = 0;
        this.f7976a = aVar.f7976a;
        this.f7977b = aVar.f7977b;
        this.f7978c = aVar.f7978c;
        this.f7979d = aVar.f7979d;
    }

    public final void a(int i10, l lVar) {
        int iAlpha = Color.alpha(this.f7979d);
        int iC = g.c(i10);
        Matrix matrix = j.f8019a;
        int i11 = (int) ((((iAlpha / 255.0f) * iC) / 255.0f) * 255.0f);
        if (i11 <= 0) {
            lVar.clearShadowLayer();
        } else {
            lVar.setShadowLayer(Math.max(this.f7976a, Float.MIN_VALUE), this.f7977b, this.f7978c, Color.argb(i11, Color.red(this.f7979d), Color.green(this.f7979d), Color.blue(this.f7979d)));
        }
    }

    public final void b(int i10) {
        this.f7979d = Color.argb(Math.round((g.c(i10) * Color.alpha(this.f7979d)) / 255.0f), Color.red(this.f7979d), Color.green(this.f7979d), Color.blue(this.f7979d));
    }

    public final void c(Matrix matrix) {
        if (this.f7980e == null) {
            this.f7980e = new float[2];
        }
        float[] fArr = this.f7980e;
        fArr[0] = this.f7977b;
        fArr[1] = this.f7978c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f7980e;
        this.f7977b = fArr2[0];
        this.f7978c = fArr2[1];
        this.f7976a = matrix.mapRadius(this.f7976a);
    }
}
