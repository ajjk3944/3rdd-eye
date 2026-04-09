package C;

import C.k0;
import android.view.Surface;
import java.util.concurrent.CancellationException;
import o0.b;

/* compiled from: SurfaceRequest.java */
/* loaded from: classes.dex */
public final class j0 implements I.c<Surface> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A4.a f721b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.a f722c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f723d;

    public j0(A4.a aVar, b.a aVar2, String str) {
        this.f721b = aVar;
        this.f722c = aVar2;
        this.f723d = str;
    }

    @Override // I.c
    public final void onFailure(Throwable th) {
        boolean z10 = th instanceof CancellationException;
        b.a aVar = this.f722c;
        if (z10) {
            A2.l.q(null, aVar.d(new k0.b(B4.f.c(new StringBuilder(), this.f723d, " cancelled."), th)));
        } else {
            aVar.b(null);
        }
    }

    @Override // I.c
    public final void onSuccess(Surface surface) {
        I.j.g(this.f721b, this.f722c);
    }
}
