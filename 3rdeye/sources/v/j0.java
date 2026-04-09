package v;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1692h0;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.S;
import u.C5616a;
import y.C5787a;

/* compiled from: ImageCaptureOptionUnpacker.java */
/* loaded from: classes.dex */
public final class j0 extends C5669y {

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f46721b = new j0();

    @Override // v.C5669y, androidx.camera.core.impl.S.b
    public final void a(C1692h0 c1692h0, S.a aVar) {
        super.a(c1692h0, aVar);
        if (!androidx.work.s.n(c1692h0)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        C1710q0 c1710q0K = C1710q0.K();
        C1683d c1683d = C1692h0.f15042H;
        if (c1692h0.f(c1683d)) {
            int iIntValue = ((Integer) ((C1717u0) c1692h0.getConfig()).b(c1683d)).intValue();
            if (((ImageCapturePixelHDRPlusQuirk) C5787a.f47852a.e(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                if (iIntValue == 0) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                    c1710q0K.N(C5616a.J(key), Boolean.TRUE);
                } else if (iIntValue == 1) {
                    CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                    c1710q0K.N(C5616a.J(key2), Boolean.FALSE);
                }
            }
        }
        aVar.c(new C5616a(C1717u0.J(c1710q0K)));
    }
}
