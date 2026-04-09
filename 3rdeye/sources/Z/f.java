package Z;

import C.S;
import C.T;
import W.F;
import Y.c;
import androidx.camera.core.impl.InterfaceC1715t0;
import d0.k;
import java.util.Objects;

/* compiled from: AudioSource.java */
/* loaded from: classes.dex */
public final class f implements InterfaceC1715t0.a<c.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k.a f13906a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f13907b;

    public f(h hVar, k.a aVar) {
        this.f13907b = hVar;
        this.f13906a = aVar;
    }

    @Override // androidx.camera.core.impl.InterfaceC1715t0.a
    public final void a(c.a aVar) {
        c.a aVar2 = aVar;
        Objects.requireNonNull(aVar2);
        h hVar = this.f13907b;
        if (hVar.f13920l == this.f13906a) {
            S.a("AudioSource", "Receive BufferProvider state change: " + hVar.f13917h + " to " + aVar2);
            if (hVar.f13917h != aVar2) {
                hVar.f13917h = aVar2;
                hVar.e();
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1715t0.a
    public final void onError(Throwable th) {
        h hVar = this.f13907b;
        if (hVar.f13920l == this.f13906a) {
            H.g gVar = hVar.f13918j;
            F.c cVar = hVar.f13919k;
            if (gVar == null || cVar == null) {
                return;
            }
            gVar.execute(new T(11, cVar, th));
        }
    }
}
