package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* compiled from: OutputConfigurationCompatApi33Impl.java */
/* loaded from: classes.dex */
public final class j extends i {
    public j(int i, Surface surface) {
        super(new OutputConfiguration(i, surface));
    }

    @Override // x.k, x.f.a
    public final void b(long j4) {
        if (j4 == -1) {
            return;
        }
        ((OutputConfiguration) i()).setStreamUseCase(j4);
    }

    @Override // x.i, x.h, x.g, x.k, x.f.a
    public final void d(long j4) {
        ((OutputConfiguration) i()).setDynamicRangeProfile(j4);
    }

    @Override // x.k, x.f.a
    public final void h(int i) {
        ((OutputConfiguration) i()).setMirrorMode(i);
    }

    @Override // x.i, x.h, x.g, x.k, x.f.a
    public final Object i() {
        Object obj = this.f47615a;
        A2.l.l(obj instanceof OutputConfiguration);
        return obj;
    }
}
