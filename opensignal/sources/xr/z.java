package xr;

import java.lang.reflect.Type;
import java.util.Collection;

/* loaded from: classes.dex */
public final class z extends b0 implements hs.d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f25519a;

    public z(Class cls) {
        this.f25519a = cls;
    }

    @Override // xr.b0
    public final Type b() {
        return this.f25519a;
    }

    @Override // hs.b
    public final Collection getAnnotations() {
        return mq.w.f16945a;
    }
}
