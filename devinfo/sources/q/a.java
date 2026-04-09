package q;

import android.os.Looper;
import com.applovin.impl.da;
import com.bumptech.glide.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f32027b;

    /* renamed from: c, reason: collision with root package name */
    public static final da f32028c = new da(2);

    /* renamed from: a, reason: collision with root package name */
    public final b f32029a = new b();

    public static a G() {
        if (f32027b != null) {
            return f32027b;
        }
        synchronized (a.class) {
            try {
                if (f32027b == null) {
                    f32027b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f32027b;
    }

    public final boolean H() {
        this.f32029a.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final void I(Runnable runnable) {
        b bVar = this.f32029a;
        if (bVar.f32032c == null) {
            synchronized (bVar.f32030a) {
                try {
                    if (bVar.f32032c == null) {
                        bVar.f32032c = b.G(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        bVar.f32032c.post(runnable);
    }
}
