package O1;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class e implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f3063a;

    public e(d dVar) {
        this.f3063a = new WeakReference(dVar);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i3, int i6) {
        SurfaceHolder.Callback callback = (SurfaceHolder.Callback) this.f3063a.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i, i3, i6);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = (SurfaceHolder.Callback) this.f3063a.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = (SurfaceHolder.Callback) this.f3063a.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }
}
