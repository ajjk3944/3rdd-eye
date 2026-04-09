package V;

import C.C0638z;
import o0.b;

/* compiled from: ProcessCameraProvider.kt */
/* loaded from: classes.dex */
public final class e implements I.c<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.a<C0638z> f12821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0638z f12822c;

    public e(b.a<C0638z> aVar, C0638z c0638z) {
        this.f12821b = aVar;
        this.f12822c = c0638z;
    }

    @Override // I.c
    public final void onFailure(Throwable th) {
        this.f12821b.d(th);
    }

    @Override // I.c
    public final void onSuccess(Void r22) {
        this.f12821b.b(this.f12822c);
    }
}
