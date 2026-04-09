package Q8;

import X8.b;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* compiled from: HandlerScheduler.java */
/* loaded from: classes3.dex */
public final class b extends P8.a {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f11382a;

    /* compiled from: HandlerScheduler.java */
    public static final class a implements Runnable, R8.a {

        /* renamed from: b, reason: collision with root package name */
        public final Handler f11383b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f11384c;

        public a(Handler handler, Runnable runnable) {
            this.f11383b = handler;
            this.f11384c = runnable;
        }

        @Override // R8.a
        public final void dispose() {
            this.f11383b.removeCallbacks(this);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f11384c.run();
            } catch (Throwable th) {
                Z8.a.a(th);
            }
        }
    }

    public b(Handler handler) {
        this.f11382a = handler;
    }

    @SuppressLint({"NewApi"})
    public final R8.a a(b.a aVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.f11382a;
        a aVar2 = new a(handler, aVar);
        handler.sendMessageDelayed(Message.obtain(handler, aVar2), timeUnit.toMillis(0L));
        return aVar2;
    }
}
