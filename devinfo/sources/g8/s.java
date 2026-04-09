package g8;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s implements x7.d {
    @Override // x7.d
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // x7.d
    public final boolean b(ByteBuffer byteBuffer, a8.g gVar) {
        return false;
    }

    @Override // x7.d
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // x7.d
    public final int d(InputStream inputStream, a8.g gVar) throws Throwable {
        int iE;
        z4.g gVar2 = new z4.g(inputStream);
        z4.c cVarC = gVar2.c("Orientation");
        if (cVarC == null) {
            iE = 1;
        } else {
            try {
                iE = cVarC.e(gVar2.f37904f);
            } catch (NumberFormatException unused) {
            }
        }
        if (iE == 0) {
            return -1;
        }
        return iE;
    }

    @Override // x7.d
    public final boolean e(InputStream inputStream, a8.g gVar) {
        return false;
    }

    @Override // x7.d
    public final int f(ByteBuffer byteBuffer, a8.g gVar) {
        AtomicReference atomicReference = t8.b.f34503a;
        return d(new t8.a(byteBuffer), gVar);
    }
}
