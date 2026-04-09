package w;

import android.hardware.camera2.CameraAccessException;
import java.util.Set;

/* compiled from: CameraManagerCompatApi30Impl.java */
/* renamed from: w.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5707u extends C5706t {
    @Override // w.C5708v, w.C5704r.b
    public final Set<Set<String>> e() throws C5687a {
        try {
            return this.f47157a.getConcurrentCameraIds();
        } catch (CameraAccessException e4) {
            throw new C5687a(e4);
        }
    }
}
