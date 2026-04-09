package E;

import C.K;
import C.c0;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;
import t4.C5606d;

/* compiled from: Image2Bitmap.java */
/* loaded from: classes.dex */
public final class p {
    public final Object a(Object obj) throws Throwable {
        Throwable th;
        Bitmap bitmapCreateBitmap;
        N.m mVar = (N.m) obj;
        androidx.camera.core.e eVar = null;
        try {
            try {
                if (mVar.e() == 35) {
                    androidx.camera.core.c cVar = (androidx.camera.core.c) mVar.c();
                    boolean z10 = mVar.f() % 180 != 0;
                    androidx.camera.core.e eVar2 = new androidx.camera.core.e(C5606d.q(z10 ? cVar.getHeight() : cVar.getWidth(), z10 ? cVar.getWidth() : cVar.getHeight(), 1, 2));
                    try {
                        c0 c0VarC = ImageProcessingUtil.c(cVar, eVar2, ByteBuffer.allocateDirect(cVar.getWidth() * cVar.getHeight() * 4), mVar.f());
                        cVar.close();
                        if (c0VarC == null) {
                            throw new K("Can't covert YUV to RGB", null);
                        }
                        bitmapCreateBitmap = M.b.a(c0VarC);
                        c0VarC.close();
                        eVar = eVar2;
                    } catch (UnsupportedOperationException e4) {
                        e = e4;
                        throw new K("Can't convert " + (mVar.e() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th2) {
                        th = th2;
                        eVar = eVar2;
                        if (eVar == null) {
                            throw th;
                        }
                        eVar.close();
                        throw th;
                    }
                } else {
                    if (mVar.e() != 256) {
                        throw new IllegalArgumentException("Invalid postview image format : " + mVar.e());
                    }
                    androidx.camera.core.c cVar2 = (androidx.camera.core.c) mVar.c();
                    Bitmap bitmapA = M.b.a(cVar2);
                    cVar2.close();
                    int iF = mVar.f();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(iF);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapA, 0, 0, bitmapA.getWidth(), bitmapA.getHeight(), matrix, true);
                }
                if (eVar != null) {
                    eVar.close();
                }
                return bitmapCreateBitmap;
            } catch (UnsupportedOperationException e10) {
                e = e10;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
