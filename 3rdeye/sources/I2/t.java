package i2;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38391b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f38392c;

    public /* synthetic */ t(z zVar, int i) {
        this.f38391b = i;
        this.f38392c = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38391b) {
            case 0:
                Drawable drawable = this.f38392c;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            default:
                z zVar = this.f38392c;
                Semaphore semaphore = zVar.f38418M;
                q2.c cVar = zVar.f38437q;
                if (cVar == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    cVar.s(zVar.f38424c.d());
                    if (z.f38403R && zVar.f38416K) {
                        if (zVar.f38419N == null) {
                            zVar.f38419N = new Handler(Looper.getMainLooper());
                            zVar.f38420O = new t(zVar, 0);
                        }
                        zVar.f38419N.post(zVar.f38420O);
                    }
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    semaphore.release();
                    throw th;
                }
                semaphore.release();
                return;
        }
    }
}
