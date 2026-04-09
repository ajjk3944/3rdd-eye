package u1;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C0752Tp;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import l1.InterfaceC2638d;

/* loaded from: classes.dex */
public final class t implements InterfaceC2638d {
    @Override // l1.InterfaceC2638d
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // l1.InterfaceC2638d
    public final boolean b(ByteBuffer byteBuffer, C0752Tp c0752Tp) {
        return false;
    }

    @Override // l1.InterfaceC2638d
    public final int c(ByteBuffer byteBuffer, C0752Tp c0752Tp) {
        AtomicReference atomicReference = H1.b.f1755a;
        return f(new H1.a(byteBuffer), c0752Tp);
    }

    @Override // l1.InterfaceC2638d
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // l1.InterfaceC2638d
    public final boolean e(InputStream inputStream, C0752Tp c0752Tp) {
        return false;
    }

    @Override // l1.InterfaceC2638d
    public final int f(InputStream inputStream, C0752Tp c0752Tp) throws Throwable {
        int iE;
        i0.g gVar = new i0.g(inputStream);
        i0.c cVarC = gVar.c("Orientation");
        if (cVarC == null) {
            iE = 1;
        } else {
            try {
                iE = cVarC.e(gVar.f20538f);
            } catch (NumberFormatException unused) {
            }
        }
        if (iE == 0) {
            return -1;
        }
        return iE;
    }
}
