package E;

import C.K;
import M.b;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.impl.C0;
import e1.C4303a;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* compiled from: Image2JpegBytes.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final L.a f1335a;

    /* compiled from: Image2JpegBytes.java */
    public static abstract class a {
        public abstract int a();

        public abstract N.m<androidx.camera.core.c> b();
    }

    public q(C0 c02) {
        this.f1335a = new L.a(c02);
    }

    public static N.b c(a aVar) throws K, NumberFormatException {
        N.m<androidx.camera.core.c> mVarB = aVar.b();
        androidx.camera.core.c cVarC = mVarB.c();
        Rect rectB = mVarB.b();
        try {
            byte[] bArrC = M.b.c(cVarC, rectB, aVar.a(), mVarB.f());
            try {
                G.f fVar = new G.f(new C4303a(new ByteArrayInputStream(bArrC)));
                Size size = new Size(rectB.width(), rectB.height());
                Rect rect = new Rect(0, 0, rectB.width(), rectB.height());
                int iF = mVarB.f();
                Matrix matrixG = mVarB.g();
                RectF rectF = G.o.f1843a;
                Matrix matrix = new Matrix(matrixG);
                matrix.postTranslate(-rectB.left, -rectB.top);
                return new N.b(bArrC, fVar, 256, size, rect, iF, matrix, mVarB.a());
            } catch (IOException e4) {
                throw new K("Failed to extract Exif from YUV-generated JPEG", e4);
            }
        } catch (b.a e10) {
            throw new K("Failed to encode the image to JPEG.", e10);
        }
    }

    public final Object a(Object obj) throws Exception {
        N.b bVarC;
        a aVar = (a) obj;
        try {
            int iE = aVar.b().e();
            if (iE != 35) {
                if (iE != 256 && iE != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + iE);
                }
                bVarC = b(aVar, iE);
            } else {
                bVarC = c(aVar);
            }
            aVar.b().c().close();
            return bVarC;
        } catch (Throwable th) {
            aVar.b().c().close();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r2 != (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r1 = java.util.Arrays.copyOfRange(r3, r2, r0.limit());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final N.b b(E.q.a r12, int r13) {
        /*
            r11 = this;
            N.m r12 = r12.b()
            java.lang.Object r0 = r12.c()
            androidx.camera.core.c r0 = (androidx.camera.core.c) r0
            L.a r1 = r11.f1335a
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk r1 = r1.f3779a
            r2 = 0
            if (r1 != 0) goto L29
            androidx.camera.core.c$a[] r0 = r0.y()
            r0 = r0[r2]
            java.nio.ByteBuffer r0 = r0.q()
            int r1 = r0.capacity()
            byte[] r1 = new byte[r1]
            r0.rewind()
            r0.get(r1)
        L27:
            r3 = r1
            goto L84
        L29:
            androidx.camera.core.c$a[] r0 = r0.y()
            r0 = r0[r2]
            java.nio.ByteBuffer r0 = r0.q()
            int r1 = r0.capacity()
            byte[] r3 = new byte[r1]
            r0.rewind()
            r0.get(r3)
            r4 = 2
            r5 = r4
        L41:
            int r6 = r5 + 4
            r7 = -1
            if (r6 > r1) goto L68
            r6 = r3[r5]
            if (r6 == r7) goto L4b
            goto L68
        L4b:
            if (r6 != r7) goto L56
            int r6 = r5 + 1
            r6 = r3[r6]
            r7 = -38
            if (r6 != r7) goto L56
            goto L7b
        L56:
            int r6 = r5 + 2
            r6 = r3[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            int r7 = r5 + 3
            r7 = r3[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6 = r6 | r7
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L41
        L68:
            int r2 = r4 + 1
            if (r2 <= r1) goto L6e
            r2 = r7
            goto L79
        L6e:
            r5 = r3[r4]
            if (r5 != r7) goto La6
            r5 = r3[r2]
            r6 = -40
            if (r5 != r6) goto La6
            r2 = r4
        L79:
            if (r2 == r7) goto L84
        L7b:
            int r0 = r0.limit()
            byte[] r1 = java.util.Arrays.copyOfRange(r3, r2, r0)
            goto L27
        L84:
            G.f r4 = r12.d()
            java.util.Objects.requireNonNull(r4)
            android.util.Size r6 = r12.h()
            android.graphics.Rect r7 = r12.b()
            int r8 = r12.f()
            android.graphics.Matrix r9 = r12.g()
            androidx.camera.core.impl.A r10 = r12.a()
            N.b r2 = new N.b
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
        La6:
            r5 = r13
            r4 = r2
            r13 = r5
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: E.q.b(E.q$a, int):N.b");
    }
}
