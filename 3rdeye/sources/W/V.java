package W;

import W.Z;
import java.util.concurrent.CancellationException;
import o0.b;

/* compiled from: VideoCapture.java */
/* loaded from: classes.dex */
public final class V implements I.c<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.d f13212b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13213c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ T f13214d;

    public V(T t10, b.d dVar, boolean z10) {
        this.f13214d = t10;
        this.f13212b = dVar;
        this.f13213c = z10;
    }

    @Override // I.c
    public final void onFailure(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        C.S.c("VideoCapture", "Surface update completed with unexpected exception", th);
    }

    @Override // I.c
    public final void onSuccess(Void r32) {
        Z.a aVar;
        T t10 = this.f13214d;
        if (this.f13212b != t10.f13194t || (aVar = t10.f13196v) == Z.a.INACTIVE) {
            return;
        }
        Z.a aVar2 = this.f13213c ? Z.a.ACTIVE_STREAMING : Z.a.ACTIVE_NON_STREAMING;
        if (aVar2 != aVar) {
            t10.f13196v = aVar2;
            t10.I().a(aVar2);
        }
    }
}
