package C;

/* compiled from: SurfaceRequest.java */
/* loaded from: classes.dex */
public final class l0 implements I.c<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N.o f747b;

    public l0(N.o oVar) {
        this.f747b = oVar;
    }

    @Override // I.c
    public final void onSuccess(Void r12) {
        this.f747b.run();
    }

    @Override // I.c
    public final void onFailure(Throwable th) {
    }
}
