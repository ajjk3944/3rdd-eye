package R;

import J.l;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.InterfaceC1708p0;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.U0;
import java.util.UUID;

/* compiled from: StreamSharingBuilder.java */
/* loaded from: classes.dex */
public final class d implements T0.a<c, e, d> {

    /* renamed from: a, reason: collision with root package name */
    public final C1710q0 f11576a;

    public d(C1710q0 c1710q0) {
        Object objB;
        this.f11576a = c1710q0;
        Object objB2 = null;
        try {
            objB = c1710q0.b(l.f2691c);
        } catch (IllegalArgumentException unused) {
            objB = null;
        }
        Class cls = (Class) objB;
        if (cls != null && !cls.equals(c.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        this.f11576a.N(T0.f14968D, U0.b.STREAM_SHARING);
        C1683d c1683d = l.f2691c;
        C1710q0 c1710q02 = this.f11576a;
        c1710q02.N(c1683d, c.class);
        try {
            objB2 = c1710q02.b(l.f2690b);
        } catch (IllegalArgumentException unused2) {
        }
        if (objB2 == null) {
            c1710q02.N(l.f2690b, c.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override // C.D
    public final InterfaceC1708p0 a() {
        return this.f11576a;
    }

    @Override // androidx.camera.core.impl.T0.a
    public final T0 b() {
        return new e(C1717u0.J(this.f11576a));
    }
}
