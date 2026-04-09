package E;

import C.K;
import E.z;
import G.f;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.impl.A;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.S;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import e1.C4303a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ProcessingInput2Packet.java */
/* loaded from: classes.dex */
public final class w {
    public final Object a(Object obj) throws K {
        G.f fVar;
        z.b bVar = (z.b) obj;
        androidx.camera.core.c cVarA = bVar.a();
        A aB = bVar.b();
        if (M.b.b(cVarA.getFormat())) {
            try {
                f.a aVar = G.f.f1802b;
                ByteBuffer byteBufferQ = cVarA.y()[0].q();
                byteBufferQ.rewind();
                byte[] bArr = new byte[byteBufferQ.capacity()];
                byteBufferQ.get(bArr);
                fVar = new G.f(new C4303a(new ByteArrayInputStream(bArr)));
                cVarA.y()[0].q().rewind();
            } catch (IOException e4) {
                throw new K("Failed to extract EXIF data.", e4);
            }
        } else {
            fVar = null;
        }
        if (((ImageCaptureRotationOptionQuirk) K.b.f2936a.e(ImageCaptureRotationOptionQuirk.class)) != null) {
            C1683d c1683d = S.i;
        } else if (M.b.b(cVarA.getFormat())) {
            A2.l.p(fVar, "JPEG image must have exif.");
            Size size = new Size(cVarA.getWidth(), cVarA.getHeight());
            int iB = aB.f1271c - fVar.b();
            Size size2 = G.o.c(G.o.h(iB)) ? new Size(size.getHeight(), size.getWidth()) : size;
            Matrix matrixA = G.o.a(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), iB, false);
            RectF rectF = new RectF(aB.f1270b);
            matrixA.mapRect(rectF);
            rectF.sort();
            Size size3 = size2;
            Rect rect = new Rect();
            rectF.round(rect);
            int iB2 = fVar.b();
            Matrix matrix = new Matrix(aB.f1273e);
            matrix.postConcat(matrixA);
            androidx.camera.core.impl.A aVar2 = cVarA.i0() instanceof J.c ? ((J.c) cVarA.i0()).f2652a : new A.a();
            cVarA.getFormat();
            return new N.b(cVarA, fVar, cVarA.getFormat(), size3, rect, iB2, matrix, aVar2);
        }
        G.f fVar2 = fVar;
        Rect rect2 = aB.f1270b;
        androidx.camera.core.impl.A aVar3 = cVarA.i0() instanceof J.c ? ((J.c) cVarA.i0()).f2652a : new A.a();
        int i = aB.f1271c;
        Matrix matrix2 = aB.f1273e;
        Size size4 = new Size(cVarA.getWidth(), cVarA.getHeight());
        if (M.b.b(cVarA.getFormat())) {
            A2.l.p(fVar2, "JPEG image must have Exif.");
        }
        return new N.b(cVarA, fVar2, cVarA.getFormat(), size4, rect2, i, matrix2, aVar3);
    }
}
