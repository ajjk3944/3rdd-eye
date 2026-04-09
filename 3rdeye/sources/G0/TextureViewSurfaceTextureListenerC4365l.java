package g0;

import C.S;
import C.k0;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import o0.b;
import z0.C5848a;

/* compiled from: TextureViewImplementation.java */
/* renamed from: g0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC4365l implements TextureView.SurfaceTextureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4366m f37927b;

    /* compiled from: TextureViewImplementation.java */
    /* renamed from: g0.l$a */
    public class a implements I.c<k0.c> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f37928b;

        public a(SurfaceTexture surfaceTexture) {
            this.f37928b = surfaceTexture;
        }

        @Override // I.c
        public final void onFailure(Throwable th) {
            throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }

        @Override // I.c
        public final void onSuccess(k0.c cVar) {
            A2.l.q("Unexpected result from SurfaceRequest. Surface was provided twice.", cVar.a() != 3);
            S.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
            this.f37928b.release();
            C4366m c4366m = TextureViewSurfaceTextureListenerC4365l.this.f37927b;
            if (c4366m.f37934j != null) {
                c4366m.f37934j = null;
            }
        }
    }

    public TextureViewSurfaceTextureListenerC4365l(C4366m c4366m) {
        this.f37927b = c4366m;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i10) {
        S.a("TextureViewImpl", "SurfaceTexture available. Size: " + i + "x" + i10);
        C4366m c4366m = this.f37927b;
        c4366m.f37931f = surfaceTexture;
        if (c4366m.f37932g == null) {
            c4366m.h();
            return;
        }
        c4366m.f37933h.getClass();
        S.a("TextureViewImpl", "Surface invalidated " + c4366m.f37933h);
        c4366m.f37933h.f741l.a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C4366m c4366m = this.f37927b;
        c4366m.f37931f = null;
        b.d dVar = c4366m.f37932g;
        if (dVar == null) {
            S.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }
        I.j.a(dVar, new a(surfaceTexture), C5848a.getMainExecutor(c4366m.f37930e.getContext()));
        c4366m.f37934j = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i10) {
        S.a("TextureViewImpl", "SurfaceTexture size changed: " + i + "x" + i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        b.a<Void> andSet = this.f37927b.f37935k.getAndSet(null);
        if (andSet != null) {
            andSet.b(null);
        }
    }
}
