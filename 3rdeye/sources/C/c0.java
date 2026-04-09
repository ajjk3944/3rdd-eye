package C;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SingleCloseImageProxy.java */
/* loaded from: classes.dex */
public final class c0 extends androidx.camera.core.b {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f692e;

    public c0(androidx.camera.core.c cVar) {
        super(cVar);
        this.f692e = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.b, java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f692e.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
