package r8;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21368a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f21369d;

    public /* synthetic */ r(v vVar, int i10) {
        this.f21368a = i10;
        this.f21369d = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21368a) {
            case 0:
                Drawable drawable = this.f21369d;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            default:
                v vVar = this.f21369d;
                Semaphore semaphore = vVar.f21387j0;
                a9.d dVar = vVar.L;
                if (dVar == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    dVar.r(vVar.f21379d.a());
                    if (v.f21372o0 && vVar.f21385h0) {
                        if (vVar.f21388k0 == null) {
                            vVar.f21388k0 = new Handler(Looper.getMainLooper());
                            vVar.f21389l0 = new r(vVar, 0);
                        }
                        vVar.f21388k0.post(vVar.f21389l0);
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
