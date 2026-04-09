package N;

import C.C0621h;
import C.S;
import C.d0;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.J;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import o0.b;

/* compiled from: SurfaceOutputImpl.java */
/* loaded from: classes.dex */
public final class t implements d0 {

    /* renamed from: c, reason: collision with root package name */
    public final Surface f4451c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4452d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f4453e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f4454f;

    /* renamed from: g, reason: collision with root package name */
    public K0.b<d0.b> f4455g;

    /* renamed from: h, reason: collision with root package name */
    public H.c f4456h;

    /* renamed from: k, reason: collision with root package name */
    public final b.d f4458k;

    /* renamed from: l, reason: collision with root package name */
    public b.a<Void> f4459l;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4450b = new Object();
    public boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4457j = false;

    public t(Surface surface, int i, Size size, C0621h c0621h, C0621h c0621h2) {
        float[] fArr = new float[16];
        this.f4454f = fArr;
        this.f4451c = surface;
        this.f4452d = i;
        this.f4453e = size;
        a(fArr, new float[16], c0621h);
        a(new float[16], new float[16], c0621h2);
        this.f4458k = o0.b.a(new D7.c(this, 6));
    }

    public static void a(float[] fArr, float[] fArr2, C0621h c0621h) {
        Matrix.setIdentityM(fArr, 0);
        if (c0621h == null) {
            return;
        }
        B7.d.w(fArr);
        int i = c0621h.f712d;
        B7.d.v(fArr, i);
        boolean z10 = c0621h.f713e;
        if (z10) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeG = G.o.g(c0621h.f709a, i);
        float f10 = 0;
        android.graphics.Matrix matrixA = G.o.a(new RectF(f10, f10, r6.getWidth(), r6.getHeight()), new RectF(f10, f10, sizeG.getWidth(), sizeG.getHeight()), i, z10);
        RectF rectF = new RectF(c0621h.f710b);
        matrixA.mapRect(rectF);
        float width = rectF.left / sizeG.getWidth();
        float height = ((sizeG.getHeight() - rectF.height()) - rectF.top) / sizeG.getHeight();
        float fWidth = rectF.width() / sizeG.getWidth();
        float fHeight = rectF.height() / sizeG.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        Matrix.setIdentityM(fArr2, 0);
        B7.d.w(fArr2);
        J j4 = c0621h.f711c;
        if (j4 != null) {
            A2.l.q("Camera has no transform.", j4.l());
            B7.d.v(fArr2, j4.a().b());
            if (j4.b()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // C.d0
    public final void M(float[] fArr, float[] fArr2) {
        Matrix.multiplyMM(fArr, 0, fArr2, 0, this.f4454f, 0);
    }

    public final void c() {
        H.c cVar;
        K0.b<d0.b> bVar;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f4450b) {
            try {
                if (this.f4456h == null || (bVar = this.f4455g) == null) {
                    this.i = true;
                } else if (!this.f4457j) {
                    atomicReference.set(bVar);
                    cVar = this.f4456h;
                    this.i = false;
                }
                cVar = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar != null) {
            try {
                cVar.execute(new B.a(6, this, atomicReference));
            } catch (RejectedExecutionException e4) {
                String strF = S.f("SurfaceOutputImpl");
                if (S.e(3, strF)) {
                    Log.d(strF, "Processor executor closed. Close request not posted.", e4);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f4450b) {
            try {
                if (!this.f4457j) {
                    this.f4457j = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4459l.b(null);
    }

    @Override // C.d0
    public final int getFormat() {
        return this.f4452d;
    }

    @Override // C.d0
    public final Size getSize() {
        return this.f4453e;
    }

    @Override // C.d0
    public final void i(float[] fArr, float[] fArr2) {
        M(fArr, fArr2);
    }

    @Override // C.d0
    public final Surface n0(H.c cVar, K0.b bVar) {
        boolean z10;
        synchronized (this.f4450b) {
            this.f4456h = cVar;
            this.f4455g = bVar;
            z10 = this.i;
        }
        if (z10) {
            c();
        }
        return this.f4451c;
    }
}
