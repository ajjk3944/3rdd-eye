package C;

import C.k0;
import o0.b;

/* compiled from: SurfaceRequest.java */
/* loaded from: classes.dex */
public final class h0 implements I.c<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.a f714b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.d f715c;

    public h0(b.a aVar, b.d dVar) {
        this.f714b = aVar;
        this.f715c = dVar;
    }

    @Override // I.c
    public final void onFailure(Throwable th) {
        if (th instanceof k0.b) {
            A2.l.q(null, this.f715c.cancel(false));
        } else {
            A2.l.q(null, this.f714b.b(null));
        }
    }

    @Override // I.c
    public final void onSuccess(Void r22) {
        A2.l.q(null, this.f714b.b(null));
    }
}
