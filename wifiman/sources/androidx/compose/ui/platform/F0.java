package androidx.compose.ui.platform;

import android.graphics.Matrix;
import kotlin.jvm.internal.AbstractC6492s;
import m0.AbstractC6680P;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6839p f29147a;

    /* renamed from: b, reason: collision with root package name */
    private Matrix f29148b;

    /* renamed from: c, reason: collision with root package name */
    private Matrix f29149c;

    /* renamed from: d, reason: collision with root package name */
    private float[] f29150d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f29151e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29152f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29153g = true;

    /* renamed from: h, reason: collision with root package name */
    private boolean f29154h = true;

    public F0(InterfaceC6839p interfaceC6839p) {
        this.f29147a = interfaceC6839p;
    }

    public final float[] a(Object obj) {
        float[] fArrC = this.f29151e;
        if (fArrC == null) {
            fArrC = m0.O0.c(null, 1, null);
            this.f29151e = fArrC;
        }
        if (this.f29153g) {
            this.f29154h = D0.a(b(obj), fArrC);
            this.f29153g = false;
        }
        if (this.f29154h) {
            return fArrC;
        }
        return null;
    }

    public final float[] b(Object obj) {
        float[] fArrC = this.f29150d;
        if (fArrC == null) {
            fArrC = m0.O0.c(null, 1, null);
            this.f29150d = fArrC;
        }
        if (!this.f29152f) {
            return fArrC;
        }
        Matrix matrix = this.f29148b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f29148b = matrix;
        }
        this.f29147a.invoke(obj, matrix);
        Matrix matrix2 = this.f29149c;
        if (matrix2 == null || !AbstractC6492s.d(matrix, matrix2)) {
            AbstractC6680P.b(fArrC, matrix);
            this.f29148b = matrix2;
            this.f29149c = matrix;
        }
        this.f29152f = false;
        return fArrC;
    }

    public final void c() {
        this.f29152f = true;
        this.f29153g = true;
    }
}
