package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.media.ImageReader;
import android.view.Surface;
import io.sentry.b5;
import io.sentry.x5;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11953a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f11954d;

    public /* synthetic */ a(b bVar, int i10) {
        this.f11953a = i10;
        this.f11954d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11953a) {
            case 0:
                b bVar = this.f11954d;
                AtomicBoolean atomicBoolean = bVar.j;
                x5 x5Var = bVar.f11957c;
                if (atomicBoolean.get()) {
                    x5Var.getLogger().m(b5.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
                    return;
                }
                c cVar = (c) bVar.f11964l.getAndSet(null);
                if (cVar == null) {
                    return;
                }
                try {
                    ImageReader imageReader = cVar.f11970x;
                    if (!cVar.f11971y.getAndSet(true)) {
                        imageReader.setOnImageAvailableListener(cVar, bVar.f11955a.h());
                    }
                    Surface surface = imageReader.getSurface();
                    Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                    try {
                        canvasLockHardwareCanvas.drawColor(-16777216, PorterDuff.Mode.CLEAR);
                        cVar.f11969r.draw(canvasLockHardwareCanvas);
                        surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                        return;
                    } catch (Throwable th2) {
                        surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    if (atomicBoolean.get()) {
                        cVar.close();
                    } else {
                        bVar.k.set(cVar);
                    }
                    x5Var.getLogger().g(b5.ERROR, "Canvas Strategy: picture render failed", th3);
                    return;
                }
            default:
                Bitmap bitmap = this.f11954d.f11959e;
                if (bitmap != null) {
                    synchronized (bitmap) {
                        if (!bitmap.isRecycled()) {
                            bitmap.recycle();
                        }
                    }
                    return;
                }
                return;
        }
    }
}
