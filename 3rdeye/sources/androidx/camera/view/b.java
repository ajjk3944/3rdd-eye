package androidx.camera.view;

import A2.l;
import C.S;
import G.o;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.view.PreviewView;
import t4.C5606d;

/* compiled from: PreviewTransformation.java */
/* loaded from: classes.dex */
public final class b {
    public static final PreviewView.d i = PreviewView.d.FILL_CENTER;

    /* renamed from: a, reason: collision with root package name */
    public Size f15177a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f15178b;

    /* renamed from: c, reason: collision with root package name */
    public int f15179c;

    /* renamed from: d, reason: collision with root package name */
    public Matrix f15180d;

    /* renamed from: e, reason: collision with root package name */
    public int f15181e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15182f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15183g;

    /* renamed from: h, reason: collision with root package name */
    public PreviewView.d f15184h;

    /* compiled from: PreviewTransformation.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15185a;

        static {
            int[] iArr = new int[PreviewView.d.values().length];
            f15185a = iArr;
            try {
                iArr[PreviewView.d.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15185a[PreviewView.d.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15185a[PreviewView.d.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15185a[PreviewView.d.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15185a[PreviewView.d.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15185a[PreviewView.d.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public final void a(Size size, int i10, Rect rect) {
        Matrix matrix;
        if (f()) {
            Matrix matrix2 = new Matrix();
            if (f()) {
                Matrix matrix3 = new Matrix(this.f15180d);
                matrix3.postConcat(c(size, i10));
                matrix = matrix3;
            } else {
                matrix = null;
            }
            matrix.invert(matrix2);
            Matrix matrix4 = new Matrix();
            matrix4.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
            matrix2.postConcat(matrix4);
        }
    }

    public final Size b() {
        return o.c(this.f15179c) ? new Size(this.f15178b.height(), this.f15178b.width()) : new Size(this.f15178b.width(), this.f15178b.height());
    }

    public final Matrix c(Size size, int i10) {
        Matrix.ScaleToFit scaleToFit;
        RectF rectF;
        l.q(null, f());
        if (o.d(size, true, b())) {
            rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
            Size sizeB = b();
            RectF rectF3 = new RectF(0.0f, 0.0f, sizeB.getWidth(), sizeB.getHeight());
            Matrix matrix = new Matrix();
            PreviewView.d dVar = this.f15184h;
            switch (a.f15185a[dVar.ordinal()]) {
                case 1:
                case 2:
                    scaleToFit = Matrix.ScaleToFit.CENTER;
                    break;
                case 3:
                case 4:
                    scaleToFit = Matrix.ScaleToFit.END;
                    break;
                case 5:
                case 6:
                    scaleToFit = Matrix.ScaleToFit.START;
                    break;
                default:
                    S.b("PreviewTransform", "Unexpected crop rect: " + dVar);
                    scaleToFit = Matrix.ScaleToFit.FILL;
                    break;
            }
            if (dVar == PreviewView.d.FIT_CENTER || dVar == PreviewView.d.FIT_START || dVar == PreviewView.d.FIT_END) {
                matrix.setRectToRect(rectF3, rectF2, scaleToFit);
            } else {
                matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                matrix.invert(matrix);
            }
            matrix.mapRect(rectF3);
            if (i10 == 1) {
                float width = size.getWidth() / 2.0f;
                float f10 = width + width;
                rectF = new RectF(f10 - rectF3.right, rectF3.top, f10 - rectF3.left, rectF3.bottom);
            } else {
                rectF = rectF3;
            }
        }
        Matrix matrixA = o.a(new RectF(this.f15178b), rectF, this.f15179c, false);
        if (this.f15182f && this.f15183g) {
            if (o.c(this.f15179c)) {
                matrixA.preScale(1.0f, -1.0f, this.f15178b.centerX(), this.f15178b.centerY());
                return matrixA;
            }
            matrixA.preScale(-1.0f, 1.0f, this.f15178b.centerX(), this.f15178b.centerY());
        }
        return matrixA;
    }

    public final Matrix d() {
        l.q(null, f());
        RectF rectF = new RectF(0.0f, 0.0f, this.f15177a.getWidth(), this.f15177a.getHeight());
        return o.a(rectF, rectF, !this.f15183g ? this.f15179c : -C5606d.E(this.f15181e), false);
    }

    public final RectF e(Size size, int i10) {
        l.q(null, f());
        Matrix matrixC = c(size, i10);
        RectF rectF = new RectF(0.0f, 0.0f, this.f15177a.getWidth(), this.f15177a.getHeight());
        matrixC.mapRect(rectF);
        return rectF;
    }

    public final boolean f() {
        return (this.f15178b == null || this.f15177a == null || !(!this.f15183g || this.f15181e != -1)) ? false : true;
    }
}
