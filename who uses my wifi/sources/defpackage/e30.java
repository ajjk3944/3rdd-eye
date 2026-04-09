package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e30 implements f30 {
    public final Object f;

    public e30(dy dyVar) {
        this.f = dyVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dy, java.lang.Object] */
    @Override // defpackage.f30
    public final void d(Throwable th) {
        this.f.g(th);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f.getClass().getSimpleName() + '@' + um.k(this) + ']';
    }
}
