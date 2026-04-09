package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    private final d2.f f31621a = new d2.f();

    public final void T(String key, AutoCloseable closeable) throws Exception {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(closeable, "closeable");
        d2.f fVar = this.f31621a;
        if (fVar != null) {
            fVar.d(key, closeable);
        }
    }

    public final void U() {
        d2.f fVar = this.f31621a;
        if (fVar != null) {
            fVar.e();
        }
        W();
    }

    public final AutoCloseable V(String key) {
        AbstractC6492s.i(key, "key");
        d2.f fVar = this.f31621a;
        if (fVar != null) {
            return fVar.g(key);
        }
        return null;
    }

    protected void W() {
    }
}
