package x8;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f37007a;

    public b(c cVar) {
        this.f37007a = new WeakReference(cVar);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i10, int i11) {
        SurfaceHolder.Callback callback = (SurfaceHolder.Callback) this.f37007a.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i4, i10, i11);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = (SurfaceHolder.Callback) this.f37007a.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = (SurfaceHolder.Callback) this.f37007a.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }
}
