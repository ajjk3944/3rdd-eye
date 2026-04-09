package E;

import A9.I;
import C.C0620g;
import C.K;
import C.b0;
import E.h;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.impl.C0;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import t4.C5606d;

/* compiled from: ProcessingNode.java */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f1349a;

    /* renamed from: b, reason: collision with root package name */
    public C0657e f1350b;

    /* renamed from: c, reason: collision with root package name */
    public w f1351c;

    /* renamed from: d, reason: collision with root package name */
    public q f1352d;

    /* renamed from: e, reason: collision with root package name */
    public h f1353e;

    /* renamed from: f, reason: collision with root package name */
    public t f1354f;

    /* renamed from: g, reason: collision with root package name */
    public s f1355g;

    /* renamed from: h, reason: collision with root package name */
    public u f1356h;
    public I i;

    /* renamed from: j, reason: collision with root package name */
    public p f1357j;

    /* renamed from: k, reason: collision with root package name */
    public final C0 f1358k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1359l;

    /* compiled from: ProcessingNode.java */
    public static abstract class a {
        public abstract N.k<b> a();

        public abstract int b();

        public abstract int c();

        public abstract N.k<b> d();
    }

    /* compiled from: ProcessingNode.java */
    public static abstract class b {
        public abstract androidx.camera.core.c a();

        public abstract A b();
    }

    public z(Executor executor) {
        C0 c02 = K.b.f2936a;
        if (K.b.f2936a.e(LowMemoryQuirk.class) != null) {
            this.f1349a = new H.g(executor);
        } else {
            this.f1349a = executor;
        }
        this.f1358k = c02;
        this.f1359l = c02.d(IncorrectJpegMetadataQuirk.class);
    }

    public final androidx.camera.core.c a(b bVar) throws K {
        A aB = bVar.b();
        N.m bVar2 = (N.m) this.f1351c.a(bVar);
        if ((bVar2.e() == 35 || this.f1359l) && this.f1350b.f1311d == 256) {
            N.m mVar = (N.m) this.f1352d.a(new C0655c(bVar2, aB.f1272d));
            this.i.getClass();
            androidx.camera.core.e eVar = new androidx.camera.core.e(C5606d.q(mVar.h().getWidth(), mVar.h().getHeight(), 256, 2));
            androidx.camera.core.c cVarA = ImageProcessingUtil.a(eVar, (byte[]) mVar.c());
            eVar.c();
            Objects.requireNonNull(cVarA);
            G.f fVarD = mVar.d();
            Objects.requireNonNull(fVarD);
            Rect rectB = mVar.b();
            int iF = mVar.f();
            Matrix matrixG = mVar.g();
            androidx.camera.core.impl.A a10 = mVar.a();
            androidx.camera.core.b bVar3 = (androidx.camera.core.b) cVarA;
            Size size = new Size(bVar3.getWidth(), bVar3.getHeight());
            bVar3.getFormat();
            bVar2 = new N.b(cVarA, fVarD, bVar3.getFormat(), size, rectB, iF, matrixG, a10);
        }
        this.f1356h.getClass();
        androidx.camera.core.c cVar = (androidx.camera.core.c) bVar2.c();
        b0 b0Var = new b0(cVar, bVar2.h(), new C0620g(cVar.i0().a(), cVar.i0().getTimestamp(), bVar2.f(), bVar2.g()));
        Rect rectB2 = bVar2.b();
        if (rectB2 != null) {
            Rect rect = new Rect(rectB2);
            if (!rect.intersect(0, 0, b0Var.f687g, b0Var.f688h)) {
                rect.setEmpty();
            }
        }
        synchronized (b0Var.f685e) {
        }
        return b0Var;
    }

    public final void b(b bVar) throws K {
        int i = this.f1350b.f1311d;
        A2.l.k("On-disk capture only support JPEG and JPEG/R output formats. Output format: " + i, M.b.b(i));
        A aB = bVar.b();
        N.m mVar = (N.m) this.f1352d.a(new C0655c((N.m) this.f1351c.a(bVar), aB.f1272d));
        if (G.o.b(mVar.b(), mVar.h())) {
            int i10 = aB.f1272d;
            A2.l.q(null, M.b.b(mVar.e()));
            this.f1355g.getClass();
            Rect rectB = mVar.b();
            byte[] bArr = (byte[]) mVar.c();
            try {
                Bitmap bitmapDecodeRegion = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rectB, new BitmapFactory.Options());
                G.f fVarD = mVar.d();
                Objects.requireNonNull(fVarD);
                Rect rect = new Rect(0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
                int iF = mVar.f();
                Matrix matrixG = mVar.g();
                RectF rectF = G.o.f1843a;
                Matrix matrix = new Matrix(matrixG);
                matrix.postTranslate(-rectB.left, -rectB.top);
                N.b bVar2 = new N.b(bitmapDecodeRegion, fVarD, 42, new Size(bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight()), rect, iF, matrix, mVar.a());
                h hVar = this.f1353e;
                C0653a c0653a = new C0653a(bVar2, i10);
                hVar.getClass();
                N.m<Bitmap> mVarB = c0653a.b();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                mVarB.c().compress(Bitmap.CompressFormat.JPEG, c0653a.a(), byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                G.f fVarD2 = mVarB.d();
                Objects.requireNonNull(fVarD2);
                new N.b(byteArray, fVarD2, (Build.VERSION.SDK_INT < 34 || !h.a.a(mVarB.c())) ? 256 : 4101, mVarB.h(), mVarB.b(), mVarB.f(), mVarB.g(), mVarB.a());
            } catch (IOException e4) {
                throw new K("Failed to decode JPEG.", e4);
            }
        }
        Objects.requireNonNull(null);
        throw null;
    }
}
