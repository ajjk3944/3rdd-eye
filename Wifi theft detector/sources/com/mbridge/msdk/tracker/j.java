package com.mbridge.msdk.tracker;

import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private volatile ThreadPoolExecutor f18252a;

    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeTrackThread");
        }
    }

    public static final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f18254a;

        public b(Runnable runnable) {
            this.f18254a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y.b(this.f18254a)) {
                return;
            }
            try {
                this.f18254a.run();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f18222a) {
                    Log.e("TrackManager", "execute error", e10);
                }
            }
        }
    }

    public void a(Runnable runnable) {
        if (this.f18252a == null) {
            this.f18252a = a();
        }
        if (this.f18252a.isShutdown()) {
            return;
        }
        this.f18252a.execute(new b(runnable));
    }

    private ThreadPoolExecutor a() {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }
}
