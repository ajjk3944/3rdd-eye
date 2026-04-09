package W;

import C.k0;
import androidx.camera.core.impl.InterfaceC1715t0;
import androidx.camera.core.impl.Q0;

/* compiled from: VideoOutput.java */
/* loaded from: classes.dex */
public interface Z {

    /* compiled from: VideoOutput.java */
    public enum a {
        ACTIVE_STREAMING,
        ACTIVE_NON_STREAMING,
        INACTIVE
    }

    void a(a aVar);

    void b(k0 k0Var, Q0 q02);

    InterfaceC1715t0<AbstractC1630s> c();

    InterfaceC1715t0<O> d();

    InterfaceC1715t0<Boolean> e();

    P f(C.r rVar);
}
