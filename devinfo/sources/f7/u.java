package f7;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f23798b;

    public /* synthetic */ u(x xVar, int i4) {
        this.f23797a = i4;
        this.f23798b = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23797a) {
            case 0:
                Drawable drawable = this.f23798b;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            default:
                x xVar = this.f23798b;
                Semaphore semaphore = xVar.M;
                n7.b bVar = xVar.f23813o;
                if (bVar == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    bVar.r(xVar.f23802b.e());
                    if (x.S && xVar.K) {
                        if (xVar.N == null) {
                            xVar.N = new Handler(Looper.getMainLooper());
                            xVar.O = new u(xVar, 0);
                        }
                        xVar.N.post(xVar.O);
                    }
                } catch (InterruptedException unused) {
                } catch (Throwable th2) {
                    semaphore.release();
                    throw th2;
                }
                semaphore.release();
                return;
        }
    }
}
