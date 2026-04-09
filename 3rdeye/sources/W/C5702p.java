package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.params.SessionConfiguration;

/* compiled from: CameraDeviceCompatApi28Impl.java */
/* renamed from: w.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5702p extends C5701o {
    @Override // w.C5701o, w.C5700n, w.C5699m.a
    public final void a(x.l lVar) throws CameraAccessException, C5687a {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) lVar.f47623a.c();
        sessionConfiguration.getClass();
        try {
            this.f47148a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e4) {
            throw new C5687a(e4);
        }
    }
}
