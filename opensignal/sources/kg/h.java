package kg;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import h7.h0;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class h extends Service {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f14363a;

    /* renamed from: d, reason: collision with root package name */
    public b0 f14364d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f14365g;

    /* renamed from: r, reason: collision with root package name */
    public int f14366r;

    /* renamed from: x, reason: collision with root package name */
    public int f14367x;

    public h() {
        hc.a aVar = new hc.a("Firebase-Messaging-Intent-Handle");
        mg.a aVar2 = mg.a.LOW_POWER;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), aVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f14363a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f14365g = new Object();
        this.f14367x = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            a0.b(intent);
        }
        synchronized (this.f14365g) {
            try {
                int i10 = this.f14367x - 1;
                this.f14367x = i10;
                if (i10 == 0) {
                    stopSelfResult(this.f14366r);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            Log.isLoggable("EnhancedIntentService", 3);
            if (this.f14364d == null) {
                this.f14364d = new b0(new h0(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f14364d;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f14363a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.f14365g) {
            this.f14366r = i11;
            this.f14367x++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) r.h().f14398r).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        dd.h hVar = new dd.h();
        this.f14363a.execute(new ch.a(this, intent2, hVar, 11));
        dd.r rVar = hVar.f7294a;
        if (rVar.i()) {
            a(intent);
            return 2;
        }
        rVar.b(new e7.d(0), new androidx.media3.exoplayer.trackselection.h(this, 29, intent));
        return 3;
    }
}
